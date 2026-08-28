import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dci {
   private final dci.a[] a;
   private WeakReference<dcl> b = new WeakReference<>(null);

   public dci(int $$0) {
      this.a = new dci.a[$$0];
   }

   public Optional<dcj<dbt>> a(ash $$0, dbs $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dci.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(ash $$0) {
      dcl $$1 = $$0.s();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dcj<dbt>> a(dbs $$0, ash $$1) {
      Optional<dcj<dbt>> $$2 = $$1.s().a(dcp.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dci.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dbs $$0, @Nullable dcj<dbt> $$1) {
      jz<cxp> $$2 = jz.a($$0.a(), cxp.j);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dci.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jz<cxp> a, int b, int c, @Nullable dcj<dbt> d) {
      public boolean a(dbs $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cxp.c(this.a.get($$1), $$0.a($$1))) {
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
