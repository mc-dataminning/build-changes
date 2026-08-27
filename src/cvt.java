import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvt {
   private final cvt.a[] a;
   private WeakReference<cvv> b = new WeakReference<>(null);

   public cvt(int $$0) {
      this.a = new cvt.a[$$0];
   }

   public Optional<cvj> a(czg $$0, cnm $$1) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cvt.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(czg $$0) {
      cvv $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cvj> a(cnm $$0, czg $$1) {
      Optional<cvu<cvj>> $$2 = $$1.r().a(cvx.a, $$0, $$1);
      this.a($$0.h(), $$2.map(cvu::b).orElse(null));
      return $$2.map(cvu::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cvt.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<crs> $$0, @Nullable cvj $$1) {
      iw<crs> $$2 = iw.a($$0.size(), crs.i);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cvt.a($$2, $$1);
   }

   static record a(iw<crs> a, @Nullable cvj b) {
      public boolean a(List<crs> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!crs.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
