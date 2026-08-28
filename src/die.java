import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class die<T> extends AbstractIterator<T> {
   private final fel a;
   private final fev b;
   private final ix c;
   private final iu.a d;
   private final ffk e;
   private final dik f;
   private final boolean g;
   @Nullable
   private dig h;
   private long i;
   private final BiFunction<iu.a, ffk, T> j;

   public die(dik $$0, @Nullable bwf $$1, fel $$2, boolean $$3, BiFunction<iu.a, ffk, T> $$4) {
      this($$0, $$1 == null ? fev.a() : fev.a($$1), $$2, $$3, $$4);
   }

   public die(dik $$0, fev $$1, fel $$2, boolean $$3, BiFunction<iu.a, ffk, T> $$4) {
      this.b = $$1;
      this.d = new iu.a();
      this.e = ffh.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azm.a($$2.a - 1.0E-7) - 1;
      int $$6 = azm.a($$2.d + 1.0E-7) + 1;
      int $$7 = azm.a($$2.b - 1.0E-7) - 1;
      int $$8 = azm.a($$2.e + 1.0E-7) + 1;
      int $$9 = azm.a($$2.c - 1.0E-7) - 1;
      int $$10 = azm.a($$2.f + 1.0E-7) + 1;
      this.c = new ix($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dig a(int $$0, int $$1) {
      int $$2 = jx.a($$0);
      int $$3 = jx.a($$1);
      long $$4 = dih.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dig $$5 = this.f.c($$2, $$3);
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
            dig $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               eah $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dmh.ca))) {
                  ffk $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == ffh.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a(this.d));
                     }
                  } else {
                     ffk $$7 = $$6.a(this.d);
                     if (!$$7.c() && ffh.c($$7, this.e, feu.i)) {
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
