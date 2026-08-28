import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcp {
   private final dcp.a[] a;
   private WeakReference<dcs> b = new WeakReference<>(null);

   public dcp(int $$0) {
      this.a = new dcp.a[$$0];
   }

   public Optional<dcq<dca>> a(arn $$0, dbz $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dcp.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(arn $$0) {
      dcs $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dcq<dca>> a(dbz $$0, arn $$1) {
      Optional<dcq<dca>> $$2 = $$1.t().a(dcw.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dcp.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dbz $$0, @Nullable dcq<dca> $$1) {
      kb<cxy> $$2 = kb.a($$0.a(), cxy.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dcp.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(kb<cxy> a, int b, int c, @Nullable dcq<dca> d) {
      public boolean a(dbz $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cxy.c(this.a.get($$1), $$0.a($$1))) {
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
