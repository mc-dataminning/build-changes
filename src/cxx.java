import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxx {
   private final cxx.a[] a;
   private WeakReference<cxz> b = new WeakReference<>(null);

   public cxx(int $$0) {
      this.a = new cxx.a[$$0];
   }

   public Optional<cxy<cxn>> a(daz $$0, cpl $$1) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cxx.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(daz $$0) {
      cxz $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cxy<cxn>> a(cpl $$0, daz $$1) {
      Optional<cxy<cxn>> $$2 = $$1.r().a(cyb.a, $$0, $$1);
      this.a($$0.h(), $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cxx.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<ctq> $$0, @Nullable cxy<cxn> $$1) {
      jg<ctq> $$2 = jg.a($$0.size(), ctq.i);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cxx.a($$2, $$1);
   }

   static record a(jg<ctq> a, @Nullable cxy<cxn> b) {
      public boolean a(List<ctq> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!ctq.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
