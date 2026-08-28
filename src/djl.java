import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class djl<T> extends AbstractIterator<T> {
   private final ffx a;
   private final fgh b;
   private final iz c;
   private final iw.a d;
   private final fgw e;
   private final djr f;
   private final boolean g;
   @Nullable
   private djn h;
   private long i;
   private final BiFunction<iw.a, fgw, T> j;

   public djl(djr $$0, @Nullable bxe $$1, ffx $$2, boolean $$3, BiFunction<iw.a, fgw, T> $$4) {
      this($$0, $$1 == null ? fgh.a() : fgh.a($$1), $$2, $$3, $$4);
   }

   public djl(djr $$0, fgh $$1, ffx $$2, boolean $$3, BiFunction<iw.a, fgw, T> $$4) {
      this.b = $$1;
      this.d = new iw.a();
      this.e = fgt.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azz.a($$2.a - 1.0E-7) - 1;
      int $$6 = azz.a($$2.d + 1.0E-7) + 1;
      int $$7 = azz.a($$2.b - 1.0E-7) - 1;
      int $$8 = azz.a($$2.e + 1.0E-7) + 1;
      int $$9 = azz.a($$2.c - 1.0E-7) - 1;
      int $$10 = azz.a($$2.f + 1.0E-7) + 1;
      this.c = new iz($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private djn a(int $$0, int $$1) {
      int $$2 = jz.a($$0);
      int $$3 = jz.a($$1);
      long $$4 = djo.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         djn $$5 = this.f.c($$2, $$3);
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
            djn $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               ebq $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dnq.ca))) {
                  fgw $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fgt.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a(this.d));
                     }
                  } else {
                     fgw $$7 = $$6.a(this.d);
                     if (!$$7.c() && fgt.c($$7, this.e, fgg.i)) {
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
