import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyw {
   private final cyw.a[] a;
   private WeakReference<cyy> b = new WeakReference<>(null);

   public cyw(int $$0) {
      this.a = new cyw.a[$$0];
   }

   public Optional<cyx<cym>> a(dby $$0, cqk $$1) {
      if ($$1.c()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cyw.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(dby $$0) {
      cyy $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cyx<cym>> a(cqk $$0, dby $$1) {
      Optional<cyx<cym>> $$2 = $$1.r().a(cza.a, $$0, $$1);
      this.a($$0.h(), $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cyw.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cup> $$0, @Nullable cyx<cym> $$1) {
      jr<cup> $$2 = jr.a($$0.size(), cup.l);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cyw.a($$2, $$1);
   }

   static record a(jr<cup> a, @Nullable cyx<cym> b) {
      public boolean a(List<cup> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cup.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
