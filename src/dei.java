import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dei<T> extends AbstractIterator<T> {
   private final ezm a;
   private final ezw b;
   private final jj c;
   private final jh.a d;
   private final fal e;
   private final deo f;
   private final boolean g;
   @Nullable
   private dek h;
   private long i;
   private final BiFunction<jh.a, fal, T> j;

   public dei(deo $$0, @Nullable bui $$1, ezm $$2, boolean $$3, BiFunction<jh.a, fal, T> $$4) {
      this($$0, $$1 == null ? ezw.a() : ezw.a($$1), $$2, $$3, $$4);
   }

   public dei(deo $$0, ezw $$1, ezm $$2, boolean $$3, BiFunction<jh.a, fal, T> $$4) {
      this.b = $$1;
      this.d = new jh.a();
      this.e = fai.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azn.a($$2.a - 1.0E-7) - 1;
      int $$6 = azn.a($$2.d + 1.0E-7) + 1;
      int $$7 = azn.a($$2.b - 1.0E-7) - 1;
      int $$8 = azn.a($$2.e + 1.0E-7) + 1;
      int $$9 = azn.a($$2.c - 1.0E-7) - 1;
      int $$10 = azn.a($$2.f + 1.0E-7) + 1;
      this.c = new jj($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dek a(int $$0, int $$1) {
      int $$2 = kj.a($$0);
      int $$3 = kj.a($$1);
      long $$4 = del.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dek $$5 = this.f.c($$2, $$3);
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
            dek $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dvo $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dil.bQ))) {
                  fal $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fai.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     fal $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && fai.c($$7, this.e, ezv.i)) {
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
