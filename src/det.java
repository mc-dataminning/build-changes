import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class det {
   private final det.a[] a;
   private WeakReference<dew> b = new WeakReference<>(null);

   public det(int $$0) {
      this.a = new det.a[$$0];
   }

   public Optional<deu<dee>> a(ars $$0, ded $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            det.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(ars $$0) {
      dew $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<deu<dee>> a(ded $$0, ars $$1) {
      Optional<deu<dee>> $$2 = $$1.t().a(dfa.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         det.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(ded $$0, @Nullable deu<dee> $$1) {
      jo<czy> $$2 = jo.a($$0.a(), czy.k);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new det.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jo<czy> a, int b, int c, @Nullable deu<dee> d) {
      public boolean a(ded $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!czy.c(this.a.get($$1), $$0.a($$1))) {
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
