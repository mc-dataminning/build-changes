import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dbh<T> extends AbstractIterator<T> {
   private final evu a;
   private final ewe b;
   private final jc c;
   private final ja.a d;
   private final ews e;
   private final dbn f;
   private final boolean g;
   @Nullable
   private dbj h;
   private long i;
   private final BiFunction<ja.a, ews, T> j;

   public dbh(dbn $$0, @Nullable bsd $$1, evu $$2, boolean $$3, BiFunction<ja.a, ews, T> $$4) {
      this.b = $$1 == null ? ewe.a() : ewe.a($$1);
      this.d = new ja.a();
      this.e = ewp.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = aye.a($$2.a - 1.0E-7) - 1;
      int $$6 = aye.a($$2.d + 1.0E-7) + 1;
      int $$7 = aye.a($$2.b - 1.0E-7) - 1;
      int $$8 = aye.a($$2.e + 1.0E-7) + 1;
      int $$9 = aye.a($$2.c - 1.0E-7) - 1;
      int $$10 = aye.a($$2.f + 1.0E-7) + 1;
      this.c = new jc($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dbj a(int $$0, int $$1) {
      int $$2 = kc.a($$0);
      int $$3 = kc.a($$1);
      long $$4 = dbk.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dbj $$5 = this.f.c($$2, $$3);
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
            dbj $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dsh $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dfh.bQ))) {
                  ews $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ewp.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ews $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ewp.c($$7, this.e, ewd.i)) {
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
