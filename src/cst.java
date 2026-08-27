import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cst {
   private final cst.a[] a;
   private WeakReference<csv> b = new WeakReference<>(null);

   public cst(int $$0) {
      this.a = new cst.a[$$0];
   }

   public Optional<csj> a(cwe $$0, clk $$1) {
      if ($$1.aj_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cst.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(cwe $$0) {
      csv $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<csj> a(clk $$0, cwe $$1) {
      Optional<csu<csj>> $$2 = $$1.r().a(csx.a, $$0, $$1);
      this.a($$0.h(), $$2.map(csu::b).orElse(null));
      return $$2.map(csu::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cst.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cpq> $$0, @Nullable csj $$1) {
      iu<cpq> $$2 = iu.a($$0.size(), cpq.h);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cst.a($$2, $$1);
   }

   static record a(iu<cpq> a, @Nullable csj b) {
      public boolean a(List<cpq> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cpq.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
