import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbz {
   private final dbz.a[] a;
   private WeakReference<dcc> b = new WeakReference<>(null);

   public dbz(int $$0) {
      this.a = new dbz.a[$$0];
   }

   public Optional<dca<dbk>> a(arx $$0, dbj $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dbz.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(arx $$0) {
      dcc $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dca<dbk>> a(dbj $$0, arx $$1) {
      Optional<dca<dbk>> $$2 = $$1.t().a(dcg.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dbz.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dbj $$0, @Nullable dca<dbk> $$1) {
      jz<cxg> $$2 = jz.a($$0.a(), cxg.j);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dbz.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jz<cxg> a, int b, int c, @Nullable dca<dbk> d) {
      public boolean a(dbj $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cxg.c(this.a.get($$1), $$0.a($$1))) {
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
