import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class ddm<T> extends AbstractIterator<T> {
   private final eyr a;
   private final ezb b;
   private final jh c;
   private final jf.a d;
   private final ezq e;
   private final dds f;
   private final boolean g;
   @Nullable
   private ddo h;
   private long i;
   private final BiFunction<jf.a, ezq, T> j;

   public ddm(dds $$0, @Nullable btr $$1, eyr $$2, boolean $$3, BiFunction<jf.a, ezq, T> $$4) {
      this($$0, $$1 == null ? ezb.a() : ezb.a($$1), $$2, $$3, $$4);
   }

   public ddm(dds $$0, ezb $$1, eyr $$2, boolean $$3, BiFunction<jf.a, ezq, T> $$4) {
      this.b = $$1;
      this.d = new jf.a();
      this.e = ezn.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = azf.a($$2.a - 1.0E-7) - 1;
      int $$6 = azf.a($$2.d + 1.0E-7) + 1;
      int $$7 = azf.a($$2.b - 1.0E-7) - 1;
      int $$8 = azf.a($$2.e + 1.0E-7) + 1;
      int $$9 = azf.a($$2.c - 1.0E-7) - 1;
      int $$10 = azf.a($$2.f + 1.0E-7) + 1;
      this.c = new jh($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private ddo a(int $$0, int $$1) {
      int $$2 = kh.a($$0);
      int $$3 = kh.a($$1);
      long $$4 = ddp.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         ddo $$5 = this.f.c($$2, $$3);
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
            ddo $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dus $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dho.bQ))) {
                  ezq $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == ezn.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ezq $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && ezn.c($$7, this.e, eza.i)) {
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
