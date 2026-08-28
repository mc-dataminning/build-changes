import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dhz<T> extends AbstractIterator<T> {
   private final fed a;
   private final fen b;
   private final ix c;
   private final iu.a d;
   private final ffc e;
   private final dif f;
   private final boolean g;
   @Nullable
   private dib h;
   private long i;
   private final BiFunction<iu.a, ffc, T> j;

   public dhz(dif $$0, @Nullable bwd $$1, fed $$2, boolean $$3, BiFunction<iu.a, ffc, T> $$4) {
      this($$0, $$1 == null ? fen.a() : fen.a($$1), $$2, $$3, $$4);
   }

   public dhz(dif $$0, fen $$1, fed $$2, boolean $$3, BiFunction<iu.a, ffc, T> $$4) {
      this.b = $$1;
      this.d = new iu.a();
      this.e = fez.a($$2);
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
   private dib a(int $$0, int $$1) {
      int $$2 = jx.a($$0);
      int $$3 = jx.a($$1);
      long $$4 = dic.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dib $$5 = this.f.c($$2, $$3);
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
            dib $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dzz $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dmc.bY))) {
                  ffc $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fez.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a(this.d));
                     }
                  } else {
                     ffc $$7 = $$6.a(this.d);
                     if (!$$7.c() && fez.c($$7, this.e, fem.i)) {
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
