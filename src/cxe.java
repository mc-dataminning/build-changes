import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cxe {
   private final cxe.a[] a;
   private WeakReference<cxg> b = new WeakReference<>(null);

   public cxe(int $$0) {
      this.a = new cxe.a[$$0];
   }

   public Optional<cxf<cwu>> a(dad $$0, cou $$1) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cxe.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dad $$0) {
      cxg $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cxf<cwu>> a(cou $$0, dad $$1) {
      Optional<cxf<cwu>> $$2 = $$1.r().a(cxi.a, $$0, $$1);
      this.a($$0.h(), $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cxe.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<csz> $$0, @Nullable cxf<cwu> $$1) {
      jf<csz> $$2 = jf.a($$0.size(), csz.i);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cxe.a($$2, $$1);
   }

   static record a(jf<csz> a, @Nullable cxf<cwu> b) {
      public boolean a(List<csz> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!csz.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
