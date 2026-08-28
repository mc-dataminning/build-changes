import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyk {
   private final cyk.a[] a;
   private WeakReference<cyn> b = new WeakReference<>(null);

   public cyk(int $$0) {
      this.a = new cyk.a[$$0];
   }

   public Optional<cyl<cya>> a(dcg $$0, cxz $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cyk.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dcg $$0) {
      cyn $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cyl<cya>> a(cxz $$0, dcg $$1) {
      Optional<cyl<cya>> $$2 = $$1.r().a(cyp.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cyk.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(cxz $$0, @Nullable cyl<cya> $$1) {
      js<cud> $$2 = js.a($$0.a(), cud.l);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cyk.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(js<cud> a, int b, int c, @Nullable cyl<cya> d) {
      public boolean a(cxz $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cud.c(this.a.get($$1), $$0.a($$1))) {
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
