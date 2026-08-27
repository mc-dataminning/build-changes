import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cpb<T> extends AbstractIterator<T> {
   private final ehk a;
   private final ehu b;
   private final gz c;
   private final gw.a d;
   private final eii e;
   private final cph f;
   private final boolean g;
   @Nullable
   private cpd h;
   private long i;
   private final BiFunction<gw.a, eii, T> j;

   public cpb(cph $$0, @Nullable bis $$1, ehk $$2, boolean $$3, BiFunction<gw.a, eii, T> $$4) {
      this.b = $$1 == null ? ehu.a() : ehu.a($$1);
      this.d = new gw.a();
      this.e = eif.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ary.a($$2.a - 1.0E-7) - 1;
      int $$6 = ary.a($$2.d + 1.0E-7) + 1;
      int $$7 = ary.a($$2.b - 1.0E-7) - 1;
      int $$8 = ary.a($$2.e + 1.0E-7) + 1;
      int $$9 = ary.a($$2.c - 1.0E-7) - 1;
      int $$10 = ary.a($$2.f + 1.0E-7) + 1;
      this.c = new gz($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cpd a(int $$0, int $$1) {
      int $$2 = hz.a($$0);
      int $$3 = hz.a($$1);
      long $$4 = cpe.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cpd $$5 = this.f.c($$2, $$3);
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
            cpd $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dfl $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(csy.bQ))) {
                  eii $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eif.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eii $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && eif.c($$7, this.e, eht.i)) {
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
