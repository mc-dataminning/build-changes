import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dad<T> extends AbstractIterator<T> {
   private final euh a;
   private final eur b;
   private final iq c;
   private final io.a d;
   private final evf e;
   private final daj f;
   private final boolean g;
   @Nullable
   private daf h;
   private long i;
   private final BiFunction<io.a, evf, T> j;

   public dad(daj $$0, @Nullable brw $$1, euh $$2, boolean $$3, BiFunction<io.a, evf, T> $$4) {
      this.b = $$1 == null ? eur.a() : eur.a($$1);
      this.d = new io.a();
      this.e = evc.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = ayf.a($$2.a - 1.0E-7) - 1;
      int $$6 = ayf.a($$2.d + 1.0E-7) + 1;
      int $$7 = ayf.a($$2.b - 1.0E-7) - 1;
      int $$8 = ayf.a($$2.e + 1.0E-7) + 1;
      int $$9 = ayf.a($$2.c - 1.0E-7) - 1;
      int $$10 = ayf.a($$2.f + 1.0E-7) + 1;
      this.c = new iq($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private daf a(int $$0, int $$1) {
      int $$2 = jq.a($$0);
      int $$3 = jq.a($$1);
      long $$4 = dag.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         daf $$5 = this.f.c($$2, $$3);
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
            daf $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               drd $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dec.bQ))) {
                  evf $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == evc.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     evf $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && evc.c($$7, this.e, euq.i)) {
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
