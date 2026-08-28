import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class czu {
   private final czu.a[] a;
   private WeakReference<czx> b = new WeakReference<>(null);

   public czu(int $$0) {
      this.a = new czu.a[$$0];
   }

   public Optional<czv<czj>> a(dds $$0, czi $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            czu.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dds $$0) {
      czx $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<czv<czj>> a(czi $$0, dds $$1) {
      Optional<czv<czj>> $$2 = $$1.r().a(czz.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         czu.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(czi $$0, @Nullable czv<czj> $$1) {
      jw<cvl> $$2 = jw.a($$0.a(), cvl.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new czu.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jw<cvl> a, int b, int c, @Nullable czv<czj> d) {
      public boolean a(czi $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cvl.c(this.a.get($$1), $$0.a($$1))) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
