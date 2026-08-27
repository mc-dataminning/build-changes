import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cvi<T> extends AbstractIterator<T> {
   private final eoq a;
   private final epa b;
   private final id c;
   private final ib.a d;
   private final epo e;
   private final cvo f;
   private final boolean g;
   @Nullable
   private cvk h;
   private long i;
   private final BiFunction<ib.a, epo, T> j;

   public cvi(cvo $$0, @Nullable bof $$1, eoq $$2, boolean $$3, BiFunction<ib.a, epo, T> $$4) {
      this.b = $$1 == null ? epa.a() : epa.a($$1);
      this.d = new ib.a();
      this.e = epl.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = awm.a($$2.a - 1.0E-7) - 1;
      int $$6 = awm.a($$2.d + 1.0E-7) + 1;
      int $$7 = awm.a($$2.b - 1.0E-7) - 1;
      int $$8 = awm.a($$2.e + 1.0E-7) + 1;
      int $$9 = awm.a($$2.c - 1.0E-7) - 1;
      int $$10 = awm.a($$2.f + 1.0E-7) + 1;
      this.c = new id($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cvk a(int $$0, int $$1) {
      int $$2 = jd.a($$0);
      int $$3 = jd.a($$1);
      long $$4 = cvl.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cvk $$5 = this.f.c($$2, $$3);
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
            cvk $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dme $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(czh.bQ))) {
                  epo $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == epl.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     epo $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && epl.c($$7, this.e, eoz.i)) {
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
