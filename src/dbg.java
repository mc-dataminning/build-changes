import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbg {
   private final dbg.a[] a;
   private WeakReference<dbj> b = new WeakReference<>(null);

   public dbg(int $$0) {
      this.a = new dbg.a[$$0];
   }

   public Optional<dbh<dar>> a(arc $$0, daq $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dbg.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(arc $$0) {
      dbj $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dbh<dar>> a(daq $$0, arc $$1) {
      Optional<dbh<dar>> $$2 = $$1.t().a(dbn.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dbg.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(daq $$0, @Nullable dbh<dar> $$1) {
      ka<cwn> $$2 = ka.a($$0.a(), cwn.j);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dbg.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(ka<cwn> a, int b, int c, @Nullable dbh<dar> d) {
      public boolean a(daq $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cwn.c(this.a.get($$1), $$0.a($$1))) {
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
