import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cur<T> extends AbstractIterator<T> {
   private final enn a;
   private final enx b;
   private final ib c;
   private final hz.a d;
   private final eol e;
   private final cux f;
   private final boolean g;
   @Nullable
   private cut h;
   private long i;
   private final BiFunction<hz.a, eol, T> j;

   public cur(cux $$0, @Nullable bno $$1, enn $$2, boolean $$3, BiFunction<hz.a, eol, T> $$4) {
      this.b = $$1 == null ? enx.a() : enx.a($$1);
      this.d = new hz.a();
      this.e = eoi.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = awh.a($$2.a - 1.0E-7) - 1;
      int $$6 = awh.a($$2.d + 1.0E-7) + 1;
      int $$7 = awh.a($$2.b - 1.0E-7) - 1;
      int $$8 = awh.a($$2.e + 1.0E-7) + 1;
      int $$9 = awh.a($$2.c - 1.0E-7) - 1;
      int $$10 = awh.a($$2.f + 1.0E-7) + 1;
      this.c = new ib($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cut a(int $$0, int $$1) {
      int $$2 = jb.a($$0);
      int $$3 = jb.a($$1);
      long $$4 = cuu.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cut $$5 = this.f.c($$2, $$3);
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
            cut $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dlf $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(cyq.bQ))) {
                  eol $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == eoi.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     eol $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && eoi.c($$7, this.e, enw.i)) {
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
