import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcc {
   private final dcc.a[] a;
   private WeakReference<dcf> b = new WeakReference<>(null);

   public dcc(int $$0) {
      this.a = new dcc.a[$$0];
   }

   public Optional<dcd<dbp>> a(ash $$0, dbo $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dcc.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(ash $$0) {
      dcf $$1 = $$0.s();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dcd<dbp>> a(dbo $$0, ash $$1) {
      Optional<dcd<dbp>> $$2 = $$1.s().a(dcj.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dcc.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dbo $$0, @Nullable dcd<dbp> $$1) {
      jz<cxk> $$2 = jz.a($$0.a(), cxk.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dcc.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jz<cxk> a, int b, int c, @Nullable dcd<dbp> d) {
      public boolean a(dbo $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cxk.c(this.a.get($$1), $$0.a($$1))) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
