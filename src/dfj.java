import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dfj<T> extends AbstractIterator<T> {
   private final fat a;
   private final fbd b;
   private final jk c;
   private final ji.a d;
   private final fbs e;
   private final dfp f;
   private final boolean g;
   @Nullable
   private dfl h;
   private long i;
   private final BiFunction<ji.a, fbs, T> j;

   public dfj(dfp $$0, @Nullable buj $$1, fat $$2, boolean $$3, BiFunction<ji.a, fbs, T> $$4) {
      this($$0, $$1 == null ? fbd.a() : fbd.a($$1), $$2, $$3, $$4);
   }

   public dfj(dfp $$0, fbd $$1, fat $$2, boolean $$3, BiFunction<ji.a, fbs, T> $$4) {
      this.b = $$1;
      this.d = new ji.a();
      this.e = fbp.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ayy.a($$2.a - 1.0E-7) - 1;
      int $$6 = ayy.a($$2.d + 1.0E-7) + 1;
      int $$7 = ayy.a($$2.b - 1.0E-7) - 1;
      int $$8 = ayy.a($$2.e + 1.0E-7) + 1;
      int $$9 = ayy.a($$2.c - 1.0E-7) - 1;
      int $$10 = ayy.a($$2.f + 1.0E-7) + 1;
      this.c = new jk($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dfl a(int $$0, int $$1) {
      int $$2 = kk.a($$0);
      int $$3 = kk.a($$1);
      long $$4 = dfm.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dfl $$5 = this.f.c($$2, $$3);
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
            dfl $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dwv $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(djm.bX))) {
                  fbs $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fbp.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     fbs $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && fbp.c($$7, this.e, fbc.i)) {
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
