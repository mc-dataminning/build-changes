import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cvh implements cvf {
   a(avx.bN, 59, 2.0F, 0.0F, 15, () -> cxt.a(awf.b)),
   b(avx.bL, 131, 4.0F, 1.0F, 5, () -> cxt.a(awf.aY)),
   c(avx.bK, 250, 6.0F, 2.0F, 14, () -> cxt.a(ctt.oE)),
   d(avx.bJ, 1561, 8.0F, 3.0F, 10, () -> cxt.a(ctt.oy)),
   e(avx.bM, 32, 12.0F, 0.0F, 22, () -> cxt.a(ctt.oI)),
   f(avx.bI, 2031, 9.0F, 4.0F, 15, () -> cxt.a(ctt.oJ));

   private final awm<dea> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cxt> l;

   private cvh(awm<dea> $$0, int $$1, float $$2, float $$3, int $$4, Supplier<cxt> $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = Suppliers.memoize($$5::get);
   }

   @Override
   public int a() {
      return this.h;
   }

   @Override
   public float b() {
      return this.i;
   }

   @Override
   public float c() {
      return this.j;
   }

   @Override
   public awm<dea> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cxt f() {
      return this.l.get();
   }
}
