import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cvf implements cvd {
   a(avw.bN, 59, 2.0F, 0.0F, 15, () -> cxr.a(awe.b)),
   b(avw.bL, 131, 4.0F, 1.0F, 5, () -> cxr.a(awe.aY)),
   c(avw.bK, 250, 6.0F, 2.0F, 14, () -> cxr.a(ctr.oE)),
   d(avw.bJ, 1561, 8.0F, 3.0F, 10, () -> cxr.a(ctr.oy)),
   e(avw.bM, 32, 12.0F, 0.0F, 22, () -> cxr.a(ctr.oI)),
   f(avw.bI, 2031, 9.0F, 4.0F, 15, () -> cxr.a(ctr.oJ));

   private final awl<ddy> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cxr> l;

   private cvf(awl<ddy> $$0, int $$1, float $$2, float $$3, int $$4, Supplier<cxr> $$5) {
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
   public awl<ddy> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cxr f() {
      return this.l.get();
   }
}
