import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dcv<T> extends AbstractIterator<T> {
   private final exz a;
   private final eyj b;
   private final jg c;
   private final je.a d;
   private final eyx e;
   private final ddb f;
   private final boolean g;
   @Nullable
   private dcx h;
   private long i;
   private final BiFunction<je.a, eyx, T> j;

   public dcv(ddb $$0, @Nullable btj $$1, exz $$2, boolean $$3, BiFunction<je.a, eyx, T> $$4) {
      this($$0, $$1 == null ? eyj.a() : eyj.a($$1), $$2, $$3, $$4);
   }

   public dcv(ddb $$0, eyj $$1, exz $$2, boolean $$3, BiFunction<je.a, eyx, T> $$4) {
      this.b = $$1;
      this.d = new je.a();
      this.e = eyu.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azc.a($$2.a - 1.0E-7) - 1;
      int $$6 = azc.a($$2.d + 1.0E-7) + 1;
      int $$7 = azc.a($$2.b - 1.0E-7) - 1;
      int $$8 = azc.a($$2.e + 1.0E-7) + 1;
      int $$9 = azc.a($$2.c - 1.0E-7) - 1;
      int $$10 = azc.a($$2.f + 1.0E-7) + 1;
      this.c = new jg($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dcx a(int $$0, int $$1) {
      int $$2 = kg.a($$0);
      int $$3 = kg.a($$1);
      long $$4 = dcy.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dcx $$5 = this.f.c($$2, $$3);
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
            dcx $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dua $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dgx.bQ))) {
                  eyx $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eyu.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eyx $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && eyu.c($$7, this.e, eyi.i)) {
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
