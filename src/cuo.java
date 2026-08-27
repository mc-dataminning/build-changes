import com.google.common.base.Suppliers;
import java.util.function.Supplier;

public enum cuo implements cum {
   a(avr.bN, 59, 2.0F, 0.0F, 15, () -> cxa.a(avz.b)),
   b(avr.bL, 131, 4.0F, 1.0F, 5, () -> cxa.a(avz.aY)),
   c(avr.bK, 250, 6.0F, 2.0F, 14, () -> cxa.a(ctc.oE)),
   d(avr.bJ, 1561, 8.0F, 3.0F, 10, () -> cxa.a(ctc.oy)),
   e(avr.bM, 32, 12.0F, 0.0F, 22, () -> cxa.a(ctc.oI)),
   f(avr.bI, 2031, 9.0F, 4.0F, 15, () -> cxa.a(ctc.oJ));

   private final awg<dde> g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final Supplier<cxa> l;

   private cuo(awg<dde> $$0, int $$1, float $$2, float $$3, int $$4, Supplier<cxa> $$5) {
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
   public awg<dde> d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public cxa f() {
      return this.l.get();
   }
}
