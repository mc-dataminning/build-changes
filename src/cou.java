import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cou<T> extends AbstractIterator<T> {
   private final ehd a;
   private final ehn b;
   private final gz c;
   private final gw.a d;
   private final eib e;
   private final cpa f;
   private final boolean g;
   @Nullable
   private cow h;
   private long i;
   private final BiFunction<gw.a, eib, T> j;

   public cou(cpa $$0, @Nullable bil $$1, ehd $$2, boolean $$3, BiFunction<gw.a, eib, T> $$4) {
      this.b = $$1 == null ? ehn.a() : ehn.a($$1);
      this.d = new gw.a();
      this.e = ehy.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ars.a($$2.a - 1.0E-7) - 1;
      int $$6 = ars.a($$2.d + 1.0E-7) + 1;
      int $$7 = ars.a($$2.b - 1.0E-7) - 1;
      int $$8 = ars.a($$2.e + 1.0E-7) + 1;
      int $$9 = ars.a($$2.c - 1.0E-7) - 1;
      int $$10 = ars.a($$2.f + 1.0E-7) + 1;
      this.c = new gz($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cow a(int $$0, int $$1) {
      int $$2 = hz.a($$0);
      int $$3 = hz.a($$1);
      long $$4 = cox.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cow $$5 = this.f.c($$2, $$3);
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
            cow $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dfe $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(csr.bQ))) {
                  eib $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ehy.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eib $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ehy.c($$7, this.e, ehm.i)) {
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
