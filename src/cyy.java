import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class cyy<T> extends AbstractIterator<T> {
   private final eta a;
   private final etk b;
   private final io c;
   private final im.a d;
   private final ety e;
   private final cze f;
   private final boolean g;
   @Nullable
   private cza h;
   private long i;
   private final BiFunction<im.a, ety, T> j;

   public cyy(cze $$0, @Nullable bql $$1, eta $$2, boolean $$3, BiFunction<im.a, ety, T> $$4) {
      this.b = $$1 == null ? etk.a() : etk.a($$1);
      this.d = new im.a();
      this.e = etv.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = axw.a($$2.a - 1.0E-7) - 1;
      int $$6 = axw.a($$2.d + 1.0E-7) + 1;
      int $$7 = axw.a($$2.b - 1.0E-7) - 1;
      int $$8 = axw.a($$2.e + 1.0E-7) + 1;
      int $$9 = axw.a($$2.c - 1.0E-7) - 1;
      int $$10 = axw.a($$2.f + 1.0E-7) + 1;
      this.c = new io($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private cza a(int $$0, int $$1) {
      int $$2 = jo.a($$0);
      int $$3 = jo.a($$1);
      long $$4 = czb.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         cza $$5 = this.f.c($$2, $$3);
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
            cza $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dpy $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.o($$4, this.d)) && ($$3 != 1 || $$5.f()) && ($$3 != 2 || $$5.a(dcx.bQ))) {
                  ety $$6 = $$5.b(this.f, this.d, this.b);
                  if ($$6 == etv.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     ety $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && etv.c($$7, this.e, etj.i)) {
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
