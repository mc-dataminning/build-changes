import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class crj<T> extends AbstractIterator<T> {
   private final eju a;
   private final eke b;
   private final hy c;
   private final hx.a d;
   private final eks e;
   private final crp f;
   private final boolean g;
   @Nullable
   private crl h;
   private long i;
   private final BiFunction<hx.a, eks, T> j;

   public crj(crp $$0, @Nullable bkv $$1, eju $$2, boolean $$3, BiFunction<hx.a, eks, T> $$4) {
      this.b = $$1 == null ? eke.a() : eke.a($$1);
      this.d = new hx.a();
      this.e = ekp.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = atq.a($$2.a - 1.0E-7) - 1;
      int $$6 = atq.a($$2.d + 1.0E-7) + 1;
      int $$7 = atq.a($$2.b - 1.0E-7) - 1;
      int $$8 = atq.a($$2.e + 1.0E-7) + 1;
      int $$9 = atq.a($$2.c - 1.0E-7) - 1;
      int $$10 = atq.a($$2.f + 1.0E-7) + 1;
      this.c = new hy($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private crl a(int $$0, int $$1) {
      int $$2 = iy.a($$0);
      int $$3 = iy.a($$1);
      long $$4 = crm.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         crl $$5 = this.f.c($$2, $$3);
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
            crl $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dhn $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(cvh.bQ))) {
                  eks $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == ekp.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eks $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ekp.c($$7, this.e, ekd.i)) {
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
