import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cre<T> extends AbstractIterator<T> {
   private final ejp a;
   private final ejz b;
   private final hu c;
   private final ht.a d;
   private final ekn e;
   private final crk f;
   private final boolean g;
   @Nullable
   private crg h;
   private long i;
   private final BiFunction<ht.a, ekn, T> j;

   public cre(crk $$0, @Nullable bkq $$1, ejp $$2, boolean $$3, BiFunction<ht.a, ekn, T> $$4) {
      this.b = $$1 == null ? ejz.a() : ejz.a($$1);
      this.d = new ht.a();
      this.e = ekk.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = atm.a($$2.a - 1.0E-7) - 1;
      int $$6 = atm.a($$2.d + 1.0E-7) + 1;
      int $$7 = atm.a($$2.b - 1.0E-7) - 1;
      int $$8 = atm.a($$2.e + 1.0E-7) + 1;
      int $$9 = atm.a($$2.c - 1.0E-7) - 1;
      int $$10 = atm.a($$2.f + 1.0E-7) + 1;
      this.c = new hu($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private crg a(int $$0, int $$1) {
      int $$2 = iu.a($$0);
      int $$3 = iu.a($$1);
      long $$4 = crh.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         crg $$5 = this.f.c($$2, $$3);
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
            crg $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dhi $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(cvc.bQ))) {
                  ekn $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ekk.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ekn $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ekk.c($$7, this.e, ejy.i)) {
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
