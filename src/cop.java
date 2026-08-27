import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cop<T> extends AbstractIterator<T> {
   private final egy a;
   private final ehi b;
   private final gx c;
   private final gu.a d;
   private final ehw e;
   private final cov f;
   private final boolean g;
   @Nullable
   private cor h;
   private long i;
   private final BiFunction<gu.a, ehw, T> j;

   public cop(cov $$0, @Nullable bii $$1, egy $$2, boolean $$3, BiFunction<gu.a, ehw, T> $$4) {
      this.b = $$1 == null ? ehi.a() : ehi.a($$1);
      this.d = new gu.a();
      this.e = eht.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = arp.a($$2.a - 1.0E-7) - 1;
      int $$6 = arp.a($$2.d + 1.0E-7) + 1;
      int $$7 = arp.a($$2.b - 1.0E-7) - 1;
      int $$8 = arp.a($$2.e + 1.0E-7) + 1;
      int $$9 = arp.a($$2.c - 1.0E-7) - 1;
      int $$10 = arp.a($$2.f + 1.0E-7) + 1;
      this.c = new gx($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cor a(int $$0, int $$1) {
      int $$2 = hx.a($$0);
      int $$3 = hx.a($$1);
      long $$4 = cos.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cor $$5 = this.f.c($$2, $$3);
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
            cor $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dez $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(csm.bQ))) {
                  ehw $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eht.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ehw $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && eht.c($$7, this.e, ehh.i)) {
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
