import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class djb<T> extends AbstractIterator<T> {
   private final ffn a;
   private final ffx b;
   private final iz c;
   private final iw.a d;
   private final fgm e;
   private final djh f;
   private final boolean g;
   @Nullable
   private djd h;
   private long i;
   private final BiFunction<iw.a, fgm, T> j;

   public djb(djh $$0, @Nullable bwv $$1, ffn $$2, boolean $$3, BiFunction<iw.a, fgm, T> $$4) {
      this($$0, $$1 == null ? ffx.a() : ffx.a($$1), $$2, $$3, $$4);
   }

   public djb(djh $$0, ffx $$1, ffn $$2, boolean $$3, BiFunction<iw.a, fgm, T> $$4) {
      this.b = $$1;
      this.d = new iw.a();
      this.e = fgj.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azq.a($$2.a - 1.0E-7) - 1;
      int $$6 = azq.a($$2.d + 1.0E-7) + 1;
      int $$7 = azq.a($$2.b - 1.0E-7) - 1;
      int $$8 = azq.a($$2.e + 1.0E-7) + 1;
      int $$9 = azq.a($$2.c - 1.0E-7) - 1;
      int $$10 = azq.a($$2.f + 1.0E-7) + 1;
      this.c = new iz($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private djd a(int $$0, int $$1) {
      int $$2 = jz.a($$0);
      int $$3 = jz.a($$1);
      long $$4 = dje.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         djd $$5 = this.f.c($$2, $$3);
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
            djd $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               ebg $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dng.ca))) {
                  fgm $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fgj.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a(this.d));
                     }
                  } else {
                     fgm $$7 = $$6.a(this.d);
                     if (!$$7.c() && fgj.c($$7, this.e, ffw.i)) {
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
