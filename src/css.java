import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class css<T> extends AbstractIterator<T> {
   private final eln a;
   private final elx b;
   private final hz c;
   private final hx.a d;
   private final eml e;
   private final csy f;
   private final boolean g;
   @Nullable
   private csu h;
   private long i;
   private final BiFunction<hx.a, eml, T> j;

   public css(csy $$0, @Nullable blu $$1, eln $$2, boolean $$3, BiFunction<hx.a, eml, T> $$4) {
      this.b = $$1 == null ? elx.a() : elx.a($$1);
      this.d = new hx.a();
      this.e = emi.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = aun.a($$2.a - 1.0E-7) - 1;
      int $$6 = aun.a($$2.d + 1.0E-7) + 1;
      int $$7 = aun.a($$2.b - 1.0E-7) - 1;
      int $$8 = aun.a($$2.e + 1.0E-7) + 1;
      int $$9 = aun.a($$2.c - 1.0E-7) - 1;
      int $$10 = aun.a($$2.f + 1.0E-7) + 1;
      this.c = new hz($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private csu a(int $$0, int $$1) {
      int $$2 = iz.a($$0);
      int $$3 = iz.a($$1);
      long $$4 = csv.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         csu $$5 = this.f.c($$2, $$3);
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
            csu $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               djg $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(cwr.bQ))) {
                  eml $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == emi.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eml $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && emi.c($$7, this.e, elw.i)) {
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
