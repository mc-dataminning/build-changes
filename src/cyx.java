import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyx {
   private final cyx.a[] a;
   private WeakReference<cyz> b = new WeakReference<>(null);

   public cyx(int $$0) {
      this.a = new cyx.a[$$0];
   }

   public Optional<cyy<cyn>> a(dbz $$0, cql $$1) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cyx.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dbz $$0) {
      cyz $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cyy<cyn>> a(cql $$0, dbz $$1) {
      Optional<cyy<cyn>> $$2 = $$1.r().a(czb.a, $$0, $$1);
      this.a($$0.h(), $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cyx.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cuq> $$0, @Nullable cyy<cyn> $$1) {
      jr<cuq> $$2 = jr.a($$0.size(), cuq.l);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cyx.a($$2, $$1);
   }

   static record a(jr<cuq> a, @Nullable cyy<cyn> b) {
      public boolean a(List<cuq> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cuq.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
