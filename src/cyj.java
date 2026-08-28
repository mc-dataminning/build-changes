import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyj {
   private final cyj.a[] a;
   private WeakReference<cym> b = new WeakReference<>(null);

   public cyj(int $$0) {
      this.a = new cyj.a[$$0];
   }

   public Optional<cyk<cxz>> a(dcf $$0, cxy $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cyj.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.d())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dcf $$0) {
      cym $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cyk<cxz>> a(cxy $$0, dcf $$1) {
      Optional<cyk<cxz>> $$2 = $$1.r().a(cyo.a, $$0, $$1);
      this.a($$0.d(), $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cyj.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cuc> $$0, @Nullable cyk<cxz> $$1) {
      js<cuc> $$2 = js.a($$0.size(), cuc.l);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cyj.a($$2, $$1);
   }

   static record a(js<cuc> a, @Nullable cyk<cxz> b) {
      public boolean a(List<cuc> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cuc.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
