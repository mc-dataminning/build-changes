import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cuv<T> extends AbstractIterator<T> {
   private final enu a;
   private final eoe b;
   private final ib c;
   private final hz.a d;
   private final eos e;
   private final cvb f;
   private final boolean g;
   @Nullable
   private cux h;
   private long i;
   private final BiFunction<hz.a, eos, T> j;

   public cuv(cvb $$0, @Nullable bnq $$1, enu $$2, boolean $$3, BiFunction<hz.a, eos, T> $$4) {
      this.b = $$1 == null ? eoe.a() : eoe.a($$1);
      this.d = new hz.a();
      this.e = eop.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = awi.a($$2.a - 1.0E-7) - 1;
      int $$6 = awi.a($$2.d + 1.0E-7) + 1;
      int $$7 = awi.a($$2.b - 1.0E-7) - 1;
      int $$8 = awi.a($$2.e + 1.0E-7) + 1;
      int $$9 = awi.a($$2.c - 1.0E-7) - 1;
      int $$10 = awi.a($$2.f + 1.0E-7) + 1;
      this.c = new ib($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cux a(int $$0, int $$1) {
      int $$2 = jb.a($$0);
      int $$3 = jb.a($$1);
      long $$4 = cuy.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cux $$5 = this.f.c($$2, $$3);
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
            cux $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dlj $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(cyu.bQ))) {
                  eos $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eop.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eos $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && eop.c($$7, this.e, eod.i)) {
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
