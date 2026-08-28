import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dei {
   private final dei.a[] a;
   private WeakReference<del> b = new WeakReference<>(null);

   public dei(int $$0) {
      this.a = new dei.a[$$0];
   }

   public Optional<dej<ddt>> a(arq $$0, dds $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dei.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(arq $$0) {
      del $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dej<ddt>> a(dds $$0, arq $$1) {
      Optional<dej<ddt>> $$2 = $$1.t().a(dep.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dei.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dds $$0, @Nullable dej<ddt> $$1) {
      jo<czn> $$2 = jo.a($$0.a(), czn.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dei.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jo<czn> a, int b, int c, @Nullable dej<ddt> d) {
      public boolean a(dds $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!czn.c(this.a.get($$1), $$0.a($$1))) {
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
