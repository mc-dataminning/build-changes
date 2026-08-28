import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbh {
   private final dbh.a[] a;
   private WeakReference<dbk> b = new WeakReference<>(null);

   public dbh(int $$0) {
      this.a = new dbh.a[$$0];
   }

   public Optional<dbi<das>> a(ard $$0, dar $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dbh.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(ard $$0) {
      dbk $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dbi<das>> a(dar $$0, ard $$1) {
      Optional<dbi<das>> $$2 = $$1.t().a(dbo.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dbh.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dar $$0, @Nullable dbi<das> $$1) {
      ka<cwo> $$2 = ka.a($$0.a(), cwo.j);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dbh.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(ka<cwo> a, int b, int c, @Nullable dbi<das> d) {
      public boolean a(dar $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cwo.c(this.a.get($$1), $$0.a($$1))) {
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
