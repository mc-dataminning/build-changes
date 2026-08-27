import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cyk<T> extends AbstractIterator<T> {
   private final ese a;
   private final eso b;
   private final ig c;
   private final id.a d;
   private final etc e;
   private final cyq f;
   private final boolean g;
   @Nullable
   private cym h;
   private long i;
   private final BiFunction<id.a, etc, T> j;

   public cyk(cyq $$0, @Nullable bqa $$1, ese $$2, boolean $$3, BiFunction<id.a, etc, T> $$4) {
      this.b = $$1 == null ? eso.a() : eso.a($$1);
      this.d = new id.a();
      this.e = esz.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = axm.a($$2.a - 1.0E-7) - 1;
      int $$6 = axm.a($$2.d + 1.0E-7) + 1;
      int $$7 = axm.a($$2.b - 1.0E-7) - 1;
      int $$8 = axm.a($$2.e + 1.0E-7) + 1;
      int $$9 = axm.a($$2.c - 1.0E-7) - 1;
      int $$10 = axm.a($$2.f + 1.0E-7) + 1;
      this.c = new ig($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cym a(int $$0, int $$1) {
      int $$2 = jg.a($$0);
      int $$3 = jg.a($$1);
      long $$4 = cyn.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cym $$5 = this.f.c($$2, $$3);
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
            cym $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dpi $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dcj.bQ))) {
                  etc $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == esz.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     etc $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && esz.c($$7, this.e, esn.i)) {
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
