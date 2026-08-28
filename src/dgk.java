import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dgk<T> extends AbstractIterator<T> {
   private final fbs a;
   private final fcc b;
   private final jj c;
   private final jh.a d;
   private final fcr e;
   private final dgq f;
   private final boolean g;
   @Nullable
   private dgm h;
   private long i;
   private final BiFunction<jh.a, fcr, T> j;

   public dgk(dgq $$0, @Nullable bvj $$1, fbs $$2, boolean $$3, BiFunction<jh.a, fcr, T> $$4) {
      this($$0, $$1 == null ? fcc.a() : fcc.a($$1), $$2, $$3, $$4);
   }

   public dgk(dgq $$0, fcc $$1, fbs $$2, boolean $$3, BiFunction<jh.a, fcr, T> $$4) {
      this.b = $$1;
      this.d = new jh.a();
      this.e = fco.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = bae.a($$2.a - 1.0E-7) - 1;
      int $$6 = bae.a($$2.d + 1.0E-7) + 1;
      int $$7 = bae.a($$2.b - 1.0E-7) - 1;
      int $$8 = bae.a($$2.e + 1.0E-7) + 1;
      int $$9 = bae.a($$2.c - 1.0E-7) - 1;
      int $$10 = bae.a($$2.f + 1.0E-7) + 1;
      this.c = new jj($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dgm a(int $$0, int $$1) {
      int $$2 = kj.a($$0);
      int $$3 = kj.a($$1);
      long $$4 = dgn.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dgm $$5 = this.f.c($$2, $$3);
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
            dgm $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dxu $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dkn.bX))) {
                  fcr $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fco.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     fcr $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && fco.c($$7, this.e, fcb.i)) {
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
