import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dbj<T> extends AbstractIterator<T> {
   private final ewa a;
   private final ewk b;
   private final jc c;
   private final ja.a d;
   private final ewy e;
   private final dbp f;
   private final boolean g;
   @Nullable
   private dbl h;
   private long i;
   private final BiFunction<ja.a, ewy, T> j;

   public dbj(dbp $$0, @Nullable bsg $$1, ewa $$2, boolean $$3, BiFunction<ja.a, ewy, T> $$4) {
      this.b = $$1 == null ? ewk.a() : ewk.a($$1);
      this.d = new ja.a();
      this.e = ewv.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ayg.a($$2.a - 1.0E-7) - 1;
      int $$6 = ayg.a($$2.d + 1.0E-7) + 1;
      int $$7 = ayg.a($$2.b - 1.0E-7) - 1;
      int $$8 = ayg.a($$2.e + 1.0E-7) + 1;
      int $$9 = ayg.a($$2.c - 1.0E-7) - 1;
      int $$10 = ayg.a($$2.f + 1.0E-7) + 1;
      this.c = new jc($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dbl a(int $$0, int $$1) {
      int $$2 = kc.a($$0);
      int $$3 = kc.a($$1);
      long $$4 = dbm.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dbl $$5 = this.f.c($$2, $$3);
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
            dbl $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dsk $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dfj.bQ))) {
                  ewy $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ewv.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ewy $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ewv.c($$7, this.e, ewj.i)) {
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
