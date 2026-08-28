import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbb {
   private final dbb.a[] a;
   private WeakReference<dbe> b = new WeakReference<>(null);

   public dbb(int $$0) {
      this.a = new dbb.a[$$0];
   }

   public Optional<dbc<daq>> a(dfm $$0, dap $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dbb.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dfm $$0) {
      dbe $$1 = $$0.s();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dbc<daq>> a(dap $$0, dfm $$1) {
      Optional<dbc<daq>> $$2 = $$1.s().a(dbg.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dbb.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dap $$0, @Nullable dbc<daq> $$1) {
      jz<cwm> $$2 = jz.a($$0.a(), cwm.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dbb.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jz<cwm> a, int b, int c, @Nullable dbc<daq> d) {
      public boolean a(dap $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cwm.c(this.a.get($$1), $$0.a($$1))) {
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
