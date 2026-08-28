import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class daq {
   private final daq.a[] a;
   private WeakReference<dat> b = new WeakReference<>(null);

   public daq(int $$0) {
      this.a = new daq.a[$$0];
   }

   public Optional<dar<daf>> a(dfb $$0, dae $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            daq.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dfb $$0) {
      dat $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dar<daf>> a(dae $$0, dfb $$1) {
      Optional<dar<daf>> $$2 = $$1.r().a(dav.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         daq.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dae $$0, @Nullable dar<daf> $$1) {
      jz<cwb> $$2 = jz.a($$0.a(), cwb.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new daq.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jz<cwb> a, int b, int c, @Nullable dar<daf> d) {
      public boolean a(dae $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cwb.c(this.a.get($$1), $$0.a($$1))) {
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
