import com.google.common.collect.AbstractIterator;
import java.util.function.BiFunction;
import javax.annotation.Nullable;

public class dgd<T> extends AbstractIterator<T> {
   private final fbn a;
   private final fbx b;
   private final jj c;
   private final jh.a d;
   private final fcm e;
   private final dgj f;
   private final boolean g;
   @Nullable
   private dgf h;
   private long i;
   private final BiFunction<jh.a, fcm, T> j;

   public dgd(dgj $$0, @Nullable bvf $$1, fbn $$2, boolean $$3, BiFunction<jh.a, fcm, T> $$4) {
      this($$0, $$1 == null ? fbx.a() : fbx.a($$1), $$2, $$3, $$4);
   }

   public dgd(dgj $$0, fbx $$1, fbn $$2, boolean $$3, BiFunction<jh.a, fcm, T> $$4) {
      this.b = $$1;
      this.d = new jh.a();
      this.e = fcj.a($$2);
      this.f = $$0;
      this.a = $$2;
      this.g = $$3;
      this.j = $$4;
      int $$5 = bae.a($$2.a - 1.0E-7) - 1;
      int $$6 = bae.a($$2.d + 1.0E-7) + 1;
      int $$7 = bae.a($$2.b - 1.0E-7) - 1;
      int $$8 = bae.a($$2.e + 1.0E-7) + 1;
      int $$9 = bae.a($$2.c - 1.0E-7) - 1;
      int $$10 = bae.a($$2.f + 1.0E-7) + 1;
      this.c = new jj($$5, $$7, $$9, $$6, $$8, $$10);
   }

   @Nullable
   private dgf a(int $$0, int $$1) {
      int $$2 = kj.a($$0);
      int $$3 = kj.a($$1);
      long $$4 = dgg.c($$2, $$3);
      if (this.h != null && this.i == $$4) {
         return this.h;
      } else {
         dgf $$5 = this.f.c($$2, $$3);
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
            dgf $$4 = this.a($$0, $$2);
            if ($$4 != null) {
               this.d.d($$0, $$1, $$2);
               dxn $$5 = $$4.a_(this.d);
               if ((!this.g || $$5.j($$4, this.d)) && ($$3 != 1 || $$5.i()) && ($$3 != 2 || $$5.a(dkg.bX))) {
                  fcm $$6 = this.b.a($$5, this.f, this.d);
                  if ($$6 == fcj.b()) {
                     if (this.a.a((double)$$0, (double)$$1, (double)$$2, (double)$$0 + 1.0, (double)$$1 + 1.0, (double)$$2 + 1.0)) {
                        return this.j.apply(this.d, $$6.a((double)$$0, (double)$$1, (double)$$2));
                     }
                  } else {
                     fcm $$7 = $$6.a((double)$$0, (double)$$1, (double)$$2);
                     if (!$$7.c() && fcj.c($$7, this.e, fbw.i)) {
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
