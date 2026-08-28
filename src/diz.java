import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class diz<T> extends AbstractIterator<T> {
   private final ffl a;
   private final ffv b;
   private final iy c;
   private final iv.a d;
   private final fgk e;
   private final djf f;
   private final boolean g;
   @Nullable
   private djb h;
   private long i;
   private final BiFunction<iv.a, fgk, T> j;

   public diz(djf $$0, @Nullable bwt $$1, ffl $$2, boolean $$3, BiFunction<iv.a, fgk, T> $$4) {
      this($$0, $$1 == null ? ffv.a() : ffv.a($$1), $$2, $$3, $$4);
   }

   public diz(djf $$0, ffv $$1, ffl $$2, boolean $$3, BiFunction<iv.a, fgk, T> $$4) {
      this.b = $$1;
      this.d = new iv.a();
      this.e = fgh.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azo.a($$2.a - 1.0E-7) - 1;
      int $$6 = azo.a($$2.d + 1.0E-7) + 1;
      int $$7 = azo.a($$2.b - 1.0E-7) - 1;
      int $$8 = azo.a($$2.e + 1.0E-7) + 1;
      int $$9 = azo.a($$2.c - 1.0E-7) - 1;
      int $$10 = azo.a($$2.f + 1.0E-7) + 1;
      this.c = new iy($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private djb a(int $$0, int $$1) {
      int $$2 = jy.a($$0);
      int $$3 = jy.a($$1);
      long $$4 = djc.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         djb $$5 = this.f.c($$2, $$3);
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
            djb $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               ebe $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dne.ca))) {
                  fgk $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fgh.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a(this.d));
                     }
                  } else {
                     fgk $$7 = $$6.a(this.d);
                     if (!$$7.c() && fgh.c($$7, this.e, ffu.i)) {
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
