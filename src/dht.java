import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dht<T> extends AbstractIterator<T> {
   private final fdr a;
   private final feb b;
   private final ix c;
   private final iu.a d;
   private final feq e;
   private final dhz f;
   private final boolean g;
   @Nullable
   private dhv h;
   private long i;
   private final BiFunction<iu.a, feq, T> j;

   public dht(dhz $$0, @Nullable bwa $$1, fdr $$2, boolean $$3, BiFunction<iu.a, feq, T> $$4) {
      this($$0, $$1 == null ? feb.a() : feb.a($$1), $$2, $$3, $$4);
   }

   public dht(dhz $$0, feb $$1, fdr $$2, boolean $$3, BiFunction<iu.a, feq, T> $$4) {
      this.b = $$1;
      this.d = new iu.a();
      this.e = fen.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azk.a($$2.a - 1.0E-7) - 1;
      int $$6 = azk.a($$2.d + 1.0E-7) + 1;
      int $$7 = azk.a($$2.b - 1.0E-7) - 1;
      int $$8 = azk.a($$2.e + 1.0E-7) + 1;
      int $$9 = azk.a($$2.c - 1.0E-7) - 1;
      int $$10 = azk.a($$2.f + 1.0E-7) + 1;
      this.c = new ix($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dhv a(int $$0, int $$1) {
      int $$2 = jx.a($$0);
      int $$3 = jx.a($$1);
      long $$4 = dhw.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dhv $$5 = this.f.c($$2, $$3);
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
            dhv $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dzo $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dlw.bX))) {
                  feq $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fen.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a(this.d));
                     }
                  } else {
                     feq $$7 = $$6.a(this.d);
                     if (!$$7.c() && fen.c($$7, this.e, fea.i)) {
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
