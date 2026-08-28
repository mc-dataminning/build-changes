import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbj {
   private final dbj.a[] a;
   private WeakReference<dbm> b = new WeakReference<>(null);

   public dbj(int $$0) {
      this.a = new dbj.a[$$0];
   }

   public Optional<dbk<dau>> a(ard $$0, dat $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dbj.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(ard $$0) {
      dbm $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dbk<dau>> a(dat $$0, ard $$1) {
      Optional<dbk<dau>> $$2 = $$1.t().a(dbq.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dbj.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dat $$0, @Nullable dbk<dau> $$1) {
      ka<cwq> $$2 = ka.a($$0.a(), cwq.j);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dbj.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(ka<cwq> a, int b, int c, @Nullable dbk<dau> d) {
      public boolean a(dat $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cwq.c(this.a.get($$1), $$0.a($$1))) {
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
