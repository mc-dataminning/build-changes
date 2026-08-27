import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxv {
   private final cxv.a[] a;
   private WeakReference<cxx> b = new WeakReference<>(null);

   public cxv(int $$0) {
      this.a = new cxv.a[$$0];
   }

   public Optional<cxw<cxl>> a(dax $$0, cpj $$1) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cxv.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dax $$0) {
      cxx $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cxw<cxl>> a(cpj $$0, dax $$1) {
      Optional<cxw<cxl>> $$2 = $$1.r().a(cxz.a, $$0, $$1);
      this.a($$0.h(), $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cxv.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cto> $$0, @Nullable cxw<cxl> $$1) {
      jg<cto> $$2 = jg.a($$0.size(), cto.i);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cxv.a($$2, $$1);
   }

   static record a(jg<cto> a, @Nullable cxw<cxl> b) {
      public boolean a(List<cto> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cto.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
