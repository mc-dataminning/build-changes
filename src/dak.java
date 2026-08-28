import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dak {
   private final dak.a[] a;
   private WeakReference<dan> b = new WeakReference<>(null);

   public dak(int $$0) {
      this.a = new dak.a[$$0];
   }

   public Optional<dal<czz>> a(dev $$0, czy $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dak.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dev $$0) {
      dan $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dal<czz>> a(czy $$0, dev $$1) {
      Optional<dal<czz>> $$2 = $$1.r().a(dap.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dak.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(czy $$0, @Nullable dal<czz> $$1) {
      jy<cvx> $$2 = jy.a($$0.a(), cvx.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dak.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jy<cvx> a, int b, int c, @Nullable dal<czz> d) {
      public boolean a(czy $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cvx.c(this.a.get($$1), $$0.a($$1))) {
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
