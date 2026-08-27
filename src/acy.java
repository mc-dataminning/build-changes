import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.IntFunction;

public class acy implements wk<acj> {
   private static final int a = 128;
   private final int b;
   private final int c;
   private final int d;
   private final int e;
   private final cgn f;
   private final clb g;
   private final Int2ObjectMap<clb> h;

   public acy(int $$0, int $$1, int $$2, int $$3, cgn $$4, clb $$5, Int2ObjectMap<clb> $$6) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = Int2ObjectMaps.unmodifiable($$6);
   }

   public acy(tu $$0) {
      this.b = $$0.readByte();
      this.c = $$0.n();
      this.d = $$0.readShort();
      this.e = $$0.readByte();
      this.f = $$0.b(cgn.class);
      IntFunction<Int2ObjectOpenHashMap<clb>> $$1 = tu.a(Int2ObjectOpenHashMap::new, 128);
      this.h = Int2ObjectMaps.unmodifiable($$0.a($$1, $$0x -> Integer.valueOf($$0x.readShort()), tu::r));
      this.g = $$0.r();
   }

   @Override
   public void a(tu $$0) {
      $$0.k(this.b);
      $$0.c(this.c);
      $$0.l(this.d);
      $$0.k(this.e);
      $$0.a(this.f);
      $$0.a(this.h, tu::l, tu::a);
      $$0.a(this.g);
   }

   public void a(acj $$0) {
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

   public clb f() {
      return this.g;
   }

   public Int2ObjectMap<clb> g() {
      return this.h;
   }

   public cgn h() {
      return this.f;
   }

   public int i() {
      return this.c;
   }
}
