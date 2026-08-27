import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.IntFunction;

public class ady implements xf<adj> {
   private static final int a = 128;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final cij f;
   private final cmx g;
   private final Int2ObjectMap<cmx> h;

   public ady(int $$0, int $$1, int $$2, int $$3, cij $$4, cmx $$5, Int2ObjectMap<cmx> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = Int2ObjectMaps.unmodifiable($$6);
   }

   public ady(ui $$0) {
      this.b = $$0.readByte();
      this.c = $$0.n();
      this.d = $$0.readShort();
      this.e = $$0.readByte();
      this.f = $$0.b(cij.class);
      IntFunction<Int2ObjectOpenHashMap<cmx>> $$1 = ui.a(Int2ObjectOpenHashMap::new, 128);
      this.h = Int2ObjectMaps.unmodifiable($$0.a($$1, $$0x -> Integer.valueOf($$0x.readShort()), ui::r));
      this.g = $$0.r();
   }

   @Override
   public void a(ui $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.l(this.d);
      $$0.k(this.e);
      $$0.a(this.f);
      $$0.a(this.h, ui::l, ui::a);
      $$0.a(this.g);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.b;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public cmx f() {
      return this.g;
   }

   public Int2ObjectMap<cmx> g() {
      return this.h;
   }

   public cij h() {
      return this.f;
   }

   public int i() {
      return this.c;
   }
}
