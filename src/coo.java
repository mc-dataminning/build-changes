import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class coo<T> extends AbstractIterator<T> {
   private final eha a;
   private final ehk b;
   private final gy c;
   private final gv.a d;
   private final ehy e;
   private final cou f;
   private final boolean g;
   @Nullable
   private coq h;
   private long i;
   private final BiFunction<gv.a, ehy, T> j;

   public coo(cou $$0, @Nullable big $$1, eha $$2, boolean $$3, BiFunction<gv.a, ehy, T> $$4) {
      this.b = $$1 == null ? ehk.a() : ehk.a($$1);
      this.d = new gv.a();
      this.e = ehv.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = aro.a($$2.a - 1.0E-7) - 1;
      int $$6 = aro.a($$2.d + 1.0E-7) + 1;
      int $$7 = aro.a($$2.b - 1.0E-7) - 1;
      int $$8 = aro.a($$2.e + 1.0E-7) + 1;
      int $$9 = aro.a($$2.c - 1.0E-7) - 1;
      int $$10 = aro.a($$2.f + 1.0E-7) + 1;
      this.c = new gy($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private coq a(int $$0, int $$1) {
      int $$2 = hy.a($$0);
      int $$3 = hy.a($$1);
      long $$4 = cor.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         coq $$5 = this.f.c($$2, $$3);
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
            coq $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dey $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(csl.bQ))) {
                  ehy $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ehv.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ehy $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ehv.c($$7, this.e, ehj.i)) {
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
