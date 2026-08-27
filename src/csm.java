import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class csm<T> extends AbstractIterator<T> {
   private final elh a;
   private final elr b;
   private final hz c;
   private final hx.a d;
   private final emf e;
   private final css f;
   private final boolean g;
   @Nullable
   private cso h;
   private long i;
   private final BiFunction<hx.a, emf, T> j;

   public csm(css $$0, @Nullable blp $$1, elh $$2, boolean $$3, BiFunction<hx.a, emf, T> $$4) {
      this.b = $$1 == null ? elr.a() : elr.a($$1);
      this.d = new hx.a();
      this.e = emc.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = aui.a($$2.a - 1.0E-7) - 1;
      int $$6 = aui.a($$2.d + 1.0E-7) + 1;
      int $$7 = aui.a($$2.b - 1.0E-7) - 1;
      int $$8 = aui.a($$2.e + 1.0E-7) + 1;
      int $$9 = aui.a($$2.c - 1.0E-7) - 1;
      int $$10 = aui.a($$2.f + 1.0E-7) + 1;
      this.c = new hz($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cso a(int $$0, int $$1) {
      int $$2 = iz.a($$0);
      int $$3 = iz.a($$1);
      long $$4 = csp.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cso $$5 = this.f.c($$2, $$3);
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
            cso $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dja $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(cwl.bQ))) {
                  emf $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == emc.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     emf $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && emc.c($$7, this.e, elq.i)) {
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
