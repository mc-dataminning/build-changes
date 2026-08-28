import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class cza {
   private final cza.a[] a;
   private WeakReference<czd> b = new WeakReference<>(null);

   public cza(int $$0) {
      this.a = new cza.a[$$0];
   }

   public Optional<czb<cyq>> a(dcw $$0, cyp $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cza.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dcw $$0) {
      czd $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<czb<cyq>> a(cyp $$0, dcw $$1) {
      Optional<czb<cyq>> $$2 = $$1.r().a(czf.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cza.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(cyp $$0, @Nullable czb<cyq> $$1) {
      jv<cuq> $$2 = jv.a($$0.a(), cuq.l);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cza.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jv<cuq> a, int b, int c, @Nullable czb<cyq> d) {
      public boolean a(cyp $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cuq.c(this.a.get($$1), $$0.a($$1))) {
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
