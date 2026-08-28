import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dfm<T> extends AbstractIterator<T> {
   private final faw a;
   private final fbg b;
   private final jk c;
   private final ji.a d;
   private final fbv e;
   private final dfs f;
   private final boolean g;
   @Nullable
   private dfo h;
   private long i;
   private final BiFunction<ji.a, fbv, T> j;

   public dfm(dfs $$0, @Nullable bum $$1, faw $$2, boolean $$3, BiFunction<ji.a, fbv, T> $$4) {
      this($$0, $$1 == null ? fbg.a() : fbg.a($$1), $$2, $$3, $$4);
   }

   public dfm(dfs $$0, fbg $$1, faw $$2, boolean $$3, BiFunction<ji.a, fbv, T> $$4) {
      this.b = $$1;
      this.d = new ji.a();
      this.e = fbs.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ayz.a($$2.a - 1.0E-7) - 1;
      int $$6 = ayz.a($$2.d + 1.0E-7) + 1;
      int $$7 = ayz.a($$2.b - 1.0E-7) - 1;
      int $$8 = ayz.a($$2.e + 1.0E-7) + 1;
      int $$9 = ayz.a($$2.c - 1.0E-7) - 1;
      int $$10 = ayz.a($$2.f + 1.0E-7) + 1;
      this.c = new jk($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dfo a(int $$0, int $$1) {
      int $$2 = kk.a($$0);
      int $$3 = kk.a($$1);
      long $$4 = dfp.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dfo $$5 = this.f.c($$2, $$3);
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
            dfo $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dwy $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(djp.bX))) {
                  fbv $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fbs.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     fbv $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && fbs.c($$7, this.e, fbf.i)) {
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
