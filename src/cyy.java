import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyy {
   private final cyy.a[] a;
   private WeakReference<cza> b = new WeakReference<>(null);

   public cyy(int $$0) {
      this.a = new cyy.a[$$0];
   }

   public Optional<cyz<cyo>> a(dca $$0, cqm $$1) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cyy.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dca $$0) {
      cza $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cyz<cyo>> a(cqm $$0, dca $$1) {
      Optional<cyz<cyo>> $$2 = $$1.r().a(czc.a, $$0, $$1);
      this.a($$0.h(), $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cyy.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cur> $$0, @Nullable cyz<cyo> $$1) {
      jr<cur> $$2 = jr.a($$0.size(), cur.l);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cyy.a($$2, $$1);
   }

   static record a(jr<cur> a, @Nullable cyz<cyo> b) {
      public boolean a(List<cur> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cur.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
