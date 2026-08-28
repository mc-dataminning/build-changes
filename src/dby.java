import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dby<T> extends AbstractIterator<T> {
   private final ewr a;
   private final exb b;
   private final jf c;
   private final jd.a d;
   private final exp e;
   private final dce f;
   private final boolean g;
   @Nullable
   private dca h;
   private long i;
   private final BiFunction<jd.a, exp, T> j;

   public dby(dce $$0, @Nullable bsq $$1, ewr $$2, boolean $$3, BiFunction<jd.a, exp, T> $$4) {
      this.b = $$1 == null ? exb.a() : exb.a($$1);
      this.d = new jd.a();
      this.e = exm.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ayn.a($$2.a - 1.0E-7) - 1;
      int $$6 = ayn.a($$2.d + 1.0E-7) + 1;
      int $$7 = ayn.a($$2.b - 1.0E-7) - 1;
      int $$8 = ayn.a($$2.e + 1.0E-7) + 1;
      int $$9 = ayn.a($$2.c - 1.0E-7) - 1;
      int $$10 = ayn.a($$2.f + 1.0E-7) + 1;
      this.c = new jf($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dca a(int $$0, int $$1) {
      int $$2 = kf.a($$0);
      int $$3 = kf.a($$1);
      long $$4 = dcb.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dca $$5 = this.f.c($$2, $$3);
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
            dca $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dta $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dfy.bQ))) {
                  exp $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == exm.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     exp $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && exm.c($$7, this.e, exa.i)) {
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
