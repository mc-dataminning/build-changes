import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class clq<T> extends AbstractIterator<T> {
   private final eed a;
   private final een b;
   private final gx c;
   private final gu.a d;
   private final efb e;
   private final clw f;
   private final boolean g;
   @Nullable
   private cls h;
   private long i;
   private final BiFunction<gu.a, efb, T> j;

   public clq(clw $$0, @Nullable bfj $$1, eed $$2, boolean $$3, BiFunction<gu.a, efb, T> $$4) {
      this.b = $$1 == null ? een.a() : een.a($$1);
      this.d = new gu.a();
      this.e = eey.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = apa.a($$2.a - 1.0E-7) - 1;
      int $$6 = apa.a($$2.d + 1.0E-7) + 1;
      int $$7 = apa.a($$2.b - 1.0E-7) - 1;
      int $$8 = apa.a($$2.e + 1.0E-7) + 1;
      int $$9 = apa.a($$2.c - 1.0E-7) - 1;
      int $$10 = apa.a($$2.f + 1.0E-7) + 1;
      this.c = new gx($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cls a(int $$0, int $$1) {
      int $$2 = hx.a($$0);
      int $$3 = hx.a($$1);
      long $$4 = clt.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cls $$5 = this.f.c($$2, $$3);
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
            cls $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dcb $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(cpo.bQ))) {
                  efb $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eey.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     efb $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.b() && eey.c($$7, this.e, eem.i)) {
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
