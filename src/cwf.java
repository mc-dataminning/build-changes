import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cwf<T> extends AbstractIterator<T> {
   private final epo a;
   private final epy b;
   private final id c;
   private final ib.a d;
   private final eqm e;
   private final cwl f;
   private final boolean g;
   @Nullable
   private cwh h;
   private long i;
   private final BiFunction<ib.a, eqm, T> j;

   public cwf(cwl $$0, @Nullable box $$1, epo $$2, boolean $$3, BiFunction<ib.a, eqm, T> $$4) {
      this.b = $$1 == null ? epy.a() : epy.a($$1);
      this.d = new ib.a();
      this.e = eqj.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = aww.a($$2.a - 1.0E-7) - 1;
      int $$6 = aww.a($$2.d + 1.0E-7) + 1;
      int $$7 = aww.a($$2.b - 1.0E-7) - 1;
      int $$8 = aww.a($$2.e + 1.0E-7) + 1;
      int $$9 = aww.a($$2.c - 1.0E-7) - 1;
      int $$10 = aww.a($$2.f + 1.0E-7) + 1;
      this.c = new id($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cwh a(int $$0, int $$1) {
      int $$2 = je.a($$0);
      int $$3 = je.a($$1);
      long $$4 = cwi.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cwh $$5 = this.f.c($$2, $$3);
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
            cwh $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dnb $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dae.bQ))) {
                  eqm $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eqj.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eqm $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && eqj.c($$7, this.e, epx.i)) {
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
