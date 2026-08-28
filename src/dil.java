import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dil<T> extends AbstractIterator<T> {
   private final fes a;
   private final ffc b;
   private final iy c;
   private final iv.a d;
   private final ffr e;
   private final dir f;
   private final boolean g;
   @Nullable
   private din h;
   private long i;
   private final BiFunction<iv.a, ffr, T> j;

   public dil(dir $$0, @Nullable bwi $$1, fes $$2, boolean $$3, BiFunction<iv.a, ffr, T> $$4) {
      this($$0, $$1 == null ? ffc.a() : ffc.a($$1), $$2, $$3, $$4);
   }

   public dil(dir $$0, ffc $$1, fes $$2, boolean $$3, BiFunction<iv.a, ffr, T> $$4) {
      this.b = $$1;
      this.d = new iv.a();
      this.e = ffo.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azm.a($$2.a - 1.0E-7) - 1;
      int $$6 = azm.a($$2.d + 1.0E-7) + 1;
      int $$7 = azm.a($$2.b - 1.0E-7) - 1;
      int $$8 = azm.a($$2.e + 1.0E-7) + 1;
      int $$9 = azm.a($$2.c - 1.0E-7) - 1;
      int $$10 = azm.a($$2.f + 1.0E-7) + 1;
      this.c = new iy($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private din a(int $$0, int $$1) {
      int $$2 = jy.a($$0);
      int $$3 = jy.a($$1);
      long $$4 = dio.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         din $$5 = this.f.c($$2, $$3);
         this.h = $$5;
         this.i = $$4;
         return $$5;
      }
   }

   protected T computeNext() {
      while (this.c.a()) {
         int $$0 = this.c.b();
         int $$1 = this.c.c();
         int $$2 = this.c.d();
         int $$3 = this.c.e();
         if ($$3 != 3) {
            din $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               eao $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dmo.ca))) {
                  ffr $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == ffo.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a(this.d));
                     }
                  } else {
                     ffr $$7 = $$6.a(this.d);
                     if (!$$7.c() && ffo.c($$7, this.e, ffb.i)) {
                        return this.j.apply(this.d, $$7);
                     }
                  }
               }
            }
         }
      }

      return (T)this.endOfData();
   }
}
