import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cvt implements cvr {
   a(avw.bN, 59, 2.0F, 0.0F, 15, () -> cyf.a(awf.b)),
   b(avw.bL, 131, 4.0F, 1.0F, 5, () -> cyf.a(awf.aY)),
   c(avw.bK, 250, 6.0F, 2.0F, 14, () -> cyf.a(cuf.oF)),
   d(avw.bJ, 1561, 8.0F, 3.0F, 10, () -> cyf.a(cuf.oz)),
   e(avw.bM, 32, 12.0F, 0.0F, 22, () -> cyf.a(cuf.oJ)),
   f(avw.bI, 2031, 9.0F, 4.0F, 15, () -> cyf.a(cuf.oK));

   private final awm<dfh> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cyf> l;

   private cvt(final awm<dfh> $$0, final int $$1, final float $$2, final float $$3, final int $$4, final Supplier<cyf> $$5) {
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
   public awm<dfh> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cyf f() {
      return this.l.get();
   }
}
