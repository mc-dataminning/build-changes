import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.IntFunction;

public class abk implements uw<aav> {
   private static final int a = 128;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final cel f;
   private final ciw g;
   private final Int2ObjectMap<ciw> h;

   public abk(int $$0, int $$1, int $$2, int $$3, cel $$4, ciw $$5, Int2ObjectMap<ciw> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = Int2ObjectMaps.unmodifiable($$6);
   }

   public abk(sh $$0) {
      this.b = $$0.readByte();
      this.c = $$0.m();
      this.d = $$0.readShort();
      this.e = $$0.readByte();
      this.f = $$0.b(cel.class);
      IntFunction<Int2ObjectOpenHashMap<ciw>> $$1 = sh.a(Int2ObjectOpenHashMap::new, 128);
      this.h = Int2ObjectMaps.unmodifiable($$0.a($$1, $$0x -> Integer.valueOf($$0x.readShort()), sh::q));
      this.g = $$0.q();
   }

   @Override
   public void a(sh $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.l(this.d);
      $$0.k(this.e);
      $$0.a(this.f);
      $$0.a(this.h, sh::l, sh::a);
      $$0.a(this.g);
   }

   public void a(aav $$0) {
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

   public ciw f() {
      return this.g;
   }

   public Int2ObjectMap<ciw> g() {
      return this.h;
   }

   public cel h() {
      return this.f;
   }

   public int i() {
      return this.c;
   }
}
