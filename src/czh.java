import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class czh<T> extends AbstractIterator<T> {
   private final etk a;
   private final etu b;
   private final ip c;
   private final in.a d;
   private final eui e;
   private final czn f;
   private final boolean g;
   @Nullable
   private czj h;
   private long i;
   private final BiFunction<in.a, eui, T> j;

   public czh(czn $$0, @Nullable brh $$1, etk $$2, boolean $$3, BiFunction<in.a, eui, T> $$4) {
      this.b = $$1 == null ? etu.a() : etu.a($$1);
      this.d = new in.a();
      this.e = euf.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = axz.a($$2.a - 1.0E-7) - 1;
      int $$6 = axz.a($$2.d + 1.0E-7) + 1;
      int $$7 = axz.a($$2.b - 1.0E-7) - 1;
      int $$8 = axz.a($$2.e + 1.0E-7) + 1;
      int $$9 = axz.a($$2.c - 1.0E-7) - 1;
      int $$10 = axz.a($$2.f + 1.0E-7) + 1;
      this.c = new ip($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private czj a(int $$0, int $$1) {
      int $$2 = jp.a($$0);
      int $$3 = jp.a($$1);
      long $$4 = czk.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         czj $$5 = this.f.c($$2, $$3);
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
            czj $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dqh $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(ddg.bQ))) {
                  eui $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == euf.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eui $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && euf.c($$7, this.e, ett.i)) {
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
