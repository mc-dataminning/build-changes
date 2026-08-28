import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dep<T> extends AbstractIterator<T> {
   private final ezt a;
   private final fad b;
   private final jj c;
   private final jh.a d;
   private final fas e;
   private final dev f;
   private final boolean g;
   @Nullable
   private der h;
   private long i;
   private final BiFunction<jh.a, fas, T> j;

   public dep(dev $$0, @Nullable bul $$1, ezt $$2, boolean $$3, BiFunction<jh.a, fas, T> $$4) {
      this($$0, $$1 == null ? fad.a() : fad.a($$1), $$2, $$3, $$4);
   }

   public dep(dev $$0, fad $$1, ezt $$2, boolean $$3, BiFunction<jh.a, fas, T> $$4) {
      this.b = $$1;
      this.d = new jh.a();
      this.e = fap.a($$2);
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
      this.c = new jj($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private der a(int $$0, int $$1) {
      int $$2 = kj.a($$0);
      int $$3 = kj.a($$1);
      long $$4 = des.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         der $$5 = this.f.c($$2, $$3);
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
            der $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dvv $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dis.bQ))) {
                  fas $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fap.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     fas $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && fap.c($$7, this.e, fac.i)) {
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
