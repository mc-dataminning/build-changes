import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class coz<T> extends AbstractIterator<T> {
   private final ehi a;
   private final ehs b;
   private final gz c;
   private final gw.a d;
   private final eig e;
   private final cpf f;
   private final boolean g;
   @Nullable
   private cpb h;
   private long i;
   private final BiFunction<gw.a, eig, T> j;

   public coz(cpf $$0, @Nullable biq $$1, ehi $$2, boolean $$3, BiFunction<gw.a, eig, T> $$4) {
      this.b = $$1 == null ? ehs.a() : ehs.a($$1);
      this.d = new gw.a();
      this.e = eid.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = arx.a($$2.a - 1.0E-7) - 1;
      int $$6 = arx.a($$2.d + 1.0E-7) + 1;
      int $$7 = arx.a($$2.b - 1.0E-7) - 1;
      int $$8 = arx.a($$2.e + 1.0E-7) + 1;
      int $$9 = arx.a($$2.c - 1.0E-7) - 1;
      int $$10 = arx.a($$2.f + 1.0E-7) + 1;
      this.c = new gz($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cpb a(int $$0, int $$1) {
      int $$2 = hz.a($$0);
      int $$3 = hz.a($$1);
      long $$4 = cpc.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cpb $$5 = this.f.c($$2, $$3);
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
            cpb $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dfj $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(csw.bQ))) {
                  eig $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eid.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eig $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && eid.c($$7, this.e, ehr.i)) {
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
