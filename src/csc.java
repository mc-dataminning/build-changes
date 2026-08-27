import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csc {
   private final csc.a[] a;
   private WeakReference<cse> b = new WeakReference<>(null);

   public csc(int $$0) {
      this.a = new csc.a[$$0];
   }

   public Optional<crs> a(cvn $$0, ckr $$1) {
      if ($$1.aj_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            csc.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(cvn $$0) {
      cse $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<crs> a(ckr $$0, cvn $$1) {
      Optional<csd<crs>> $$2 = $$1.r().a(csg.a, $$0, $$1);
      this.a($$0.h(), $$2.map(csd::b).orElse(null));
      return $$2.map(csd::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         csc.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<coz> $$0, @Nullable crs $$1) {
      is<coz> $$2 = is.a($$0.size(), coz.h);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new csc.a($$2, $$1);
   }

   static record a(is<coz> a, @Nullable crs b) {
      public boolean a(List<coz> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!coz.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
