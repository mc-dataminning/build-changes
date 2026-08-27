import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class csg {
   private final csg.a[] a;
   private WeakReference<csi> b = new WeakReference<>(null);

   public csg(int $$0) {
      this.a = new csg.a[$$0];
   }

   public Optional<crw> a(cvr $$0, ckv $$1) {
      if ($$1.aj_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            csg.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(cvr $$0) {
      csi $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<crw> a(ckv $$0, cvr $$1) {
      Optional<csh<crw>> $$2 = $$1.r().a(csk.a, $$0, $$1);
      this.a($$0.h(), $$2.map(csh::b).orElse(null));
      return $$2.map(csh::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         csg.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cpd> $$0, @Nullable crw $$1) {
      is<cpd> $$2 = is.a($$0.size(), cpd.h);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new csg.a($$2, $$1);
   }

   static record a(is<cpd> a, @Nullable crw b) {
      public boolean a(List<cpd> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cpd.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
