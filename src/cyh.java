import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyh {
   private final cyh.a[] a;
   private WeakReference<cyk> b = new WeakReference<>(null);

   public cyh(int $$0) {
      this.a = new cyh.a[$$0];
   }

   public Optional<cyi<cxx>> a(dcd $$0, cxw $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cyh.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.d())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dcd $$0) {
      cyk $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cyi<cxx>> a(cxw $$0, dcd $$1) {
      Optional<cyi<cxx>> $$2 = $$1.r().a(cym.a, $$0, $$1);
      this.a($$0.d(), $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cyh.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cua> $$0, @Nullable cyi<cxx> $$1) {
      js<cua> $$2 = js.a($$0.size(), cua.l);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cyh.a($$2, $$1);
   }

   static record a(js<cua> a, @Nullable cyi<cxx> b) {
      public boolean a(List<cua> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cua.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
