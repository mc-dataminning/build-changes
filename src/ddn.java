import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddn {
   private final ddn.a[] a;
   private WeakReference<ddq> b = new WeakReference<>(null);

   public ddn(int $$0) {
      this.a = new ddn.a[$$0];
   }

   public Optional<ddo<dcy>> a(aro $$0, dcx $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            ddn.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(aro $$0) {
      ddq $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<ddo<dcy>> a(dcx $$0, aro $$1) {
      Optional<ddo<dcy>> $$2 = $$1.t().a(ddu.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         ddn.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dcx $$0, @Nullable ddo<dcy> $$1) {
      jn<cys> $$2 = jn.a($$0.a(), cys.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new ddn.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jn<cys> a, int b, int c, @Nullable ddo<dcy> d) {
      public boolean a(dcx $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cys.c(this.a.get($$1), $$0.a($$1))) {
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
