import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvk {
   private final cvk.a[] a;
   private WeakReference<cvm> b = new WeakReference<>(null);

   public cvk(int $$0) {
      this.a = new cvk.a[$$0];
   }

   public Optional<cva> a(cyx $$0, cnf $$1) {
      if ($$1.ah_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cvk.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(cyx $$0) {
      cvm $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cva> a(cnf $$0, cyx $$1) {
      Optional<cvl<cva>> $$2 = $$1.r().a(cvo.a, $$0, $$1);
      this.a($$0.h(), $$2.map(cvl::b).orElse(null));
      return $$2.map(cvl::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cvk.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<crj> $$0, @Nullable cva $$1) {
      iu<crj> $$2 = iu.a($$0.size(), crj.i);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cvk.a($$2, $$1);
   }

   static record a(iu<crj> a, @Nullable cva b) {
      public boolean a(List<crj> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!crj.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
