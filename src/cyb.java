import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cyb<T> extends AbstractIterator<T> {
   private final erv a;
   private final esf b;
   private final id c;
   private final ib.a d;
   private final est e;
   private final cyh f;
   private final boolean g;
   @Nullable
   private cyd h;
   private long i;
   private final BiFunction<ib.a, est, T> j;

   public cyb(cyh $$0, @Nullable bpv $$1, erv $$2, boolean $$3, BiFunction<ib.a, est, T> $$4) {
      this.b = $$1 == null ? esf.a() : esf.a($$1);
      this.d = new ib.a();
      this.e = esq.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = axk.a($$2.a - 1.0E-7) - 1;
      int $$6 = axk.a($$2.d + 1.0E-7) + 1;
      int $$7 = axk.a($$2.b - 1.0E-7) - 1;
      int $$8 = axk.a($$2.e + 1.0E-7) + 1;
      int $$9 = axk.a($$2.c - 1.0E-7) - 1;
      int $$10 = axk.a($$2.f + 1.0E-7) + 1;
      this.c = new id($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cyd a(int $$0, int $$1) {
      int $$2 = je.a($$0);
      int $$3 = je.a($$1);
      long $$4 = cye.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cyd $$5 = this.f.c($$2, $$3);
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
            cyd $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               doz $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dca.bQ))) {
                  est $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == esq.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     est $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && esq.c($$7, this.e, ese.i)) {
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
