import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cto {
   private final cto.a[] a;
   private WeakReference<ctq> b = new WeakReference<>(null);

   public cto(int $$0) {
      this.a = new cto.a[$$0];
   }

   public Optional<cte> a(cwz $$0, cme $$1) {
      if ($$1.ai_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cto.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(cwz $$0) {
      ctq $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cte> a(cme $$0, cwz $$1) {
      Optional<ctp<cte>> $$2 = $$1.r().a(cts.a, $$0, $$1);
      this.a($$0.h(), $$2.map(ctp::b).orElse(null));
      return $$2.map(ctp::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cto.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cqk> $$0, @Nullable cte $$1) {
      iu<cqk> $$2 = iu.a($$0.size(), cqk.h);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cto.a($$2, $$1);
   }

   static record a(iu<cqk> a, @Nullable cte b) {
      public boolean a(List<cqk> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cqk.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
