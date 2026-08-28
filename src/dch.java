import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dch {
   private final dch.a[] a;
   private WeakReference<dck> b = new WeakReference<>(null);

   public dch(int $$0) {
      this.a = new dch.a[$$0];
   }

   public Optional<dci<dbs>> a(ash $$0, dbr $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dch.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(ash $$0) {
      dck $$1 = $$0.s();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dci<dbs>> a(dbr $$0, ash $$1) {
      Optional<dci<dbs>> $$2 = $$1.s().a(dco.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dch.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dbr $$0, @Nullable dci<dbs> $$1) {
      jz<cxo> $$2 = jz.a($$0.a(), cxo.j);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dch.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jz<cxo> a, int b, int c, @Nullable dci<dbs> d) {
      public boolean a(dbr $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cxo.c(this.a.get($$1), $$0.a($$1))) {
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
