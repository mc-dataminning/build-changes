import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dbk<T> extends AbstractIterator<T> {
   private final ewc a;
   private final ewm b;
   private final jc c;
   private final ja.a d;
   private final exa e;
   private final dbq f;
   private final boolean g;
   @Nullable
   private dbm h;
   private long i;
   private final BiFunction<ja.a, exa, T> j;

   public dbk(dbq $$0, @Nullable bsh $$1, ewc $$2, boolean $$3, BiFunction<ja.a, exa, T> $$4) {
      this.b = $$1 == null ? ewm.a() : ewm.a($$1);
      this.d = new ja.a();
      this.e = ewx.a($$2);
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
   private dbm a(int $$0, int $$1) {
      int $$2 = kc.a($$0);
      int $$3 = kc.a($$1);
      long $$4 = dbn.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dbm $$5 = this.f.c($$2, $$3);
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
            dbm $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dsl $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dfk.bQ))) {
                  exa $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ewx.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     exa $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ewx.c($$7, this.e, ewl.i)) {
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
