import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cou {
   private final cou.a[] a;
   private WeakReference<cow> b = new WeakReference<>(null);

   public cou(int $$0) {
      this.a = new cou.a[$$0];
   }

   public Optional<coi> a(csf $$0, chh $$1) {
      if ($$1.aj_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cou.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(csf $$0) {
      cow $$1 = $$0.q();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<coi> a(chh $$0, csf $$1) {
      Optional<cov<coi>> $$2 = $$1.q().a(coy.a, $$0, $$1);
      this.a($$0.h(), $$2.map(cov::b).orElse(null));
      return $$2.map(cov::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cou.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<clo> $$0, @Nullable coi $$1) {
      ip<clo> $$2 = ip.a($$0.size(), clo.b);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cou.a($$2, $$1);
   }

   static record a(ip<clo> a, @Nullable coi b) {
      public boolean a(List<clo> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!clo.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
