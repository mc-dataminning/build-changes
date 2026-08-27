import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dab<T> extends AbstractIterator<T> {
   private final euf a;
   private final eup b;
   private final iq c;
   private final io.a d;
   private final evd e;
   private final dah f;
   private final boolean g;
   @Nullable
   private dad h;
   private long i;
   private final BiFunction<io.a, evd, T> j;

   public dab(dah $$0, @Nullable bru $$1, euf $$2, boolean $$3, BiFunction<io.a, evd, T> $$4) {
      this.b = $$1 == null ? eup.a() : eup.a($$1);
      this.d = new io.a();
      this.e = eva.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ayd.a($$2.a - 1.0E-7) - 1;
      int $$6 = ayd.a($$2.d + 1.0E-7) + 1;
      int $$7 = ayd.a($$2.b - 1.0E-7) - 1;
      int $$8 = ayd.a($$2.e + 1.0E-7) + 1;
      int $$9 = ayd.a($$2.c - 1.0E-7) - 1;
      int $$10 = ayd.a($$2.f + 1.0E-7) + 1;
      this.c = new iq($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dad a(int $$0, int $$1) {
      int $$2 = jq.a($$0);
      int $$3 = jq.a($$1);
      long $$4 = dae.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dad $$5 = this.f.c($$2, $$3);
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
            dad $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               drb $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dea.bQ))) {
                  evd $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eva.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     evd $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && eva.c($$7, this.e, euo.i)) {
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
