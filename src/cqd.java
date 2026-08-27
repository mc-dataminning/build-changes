import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqd {
   private final cqd.a[] a;
   private WeakReference<cqf> b = new WeakReference<>(null);

   public cqd(int $$0) {
      this.a = new cqd.a[$$0];
   }

   public Optional<cpt> a(ctp $$0, cir $$1) {
      if ($$1.ai_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cqd.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(ctp $$0) {
      cqf $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cpt> a(cir $$0, ctp $$1) {
      Optional<cqe<cpt>> $$2 = $$1.r().a(cqh.a, $$0, $$1);
      this.a($$0.h(), $$2.map(cqe::b).orElse(null));
      return $$2.map(cqe::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cqd.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cmy> $$0, @Nullable cpt $$1) {
      iq<cmy> $$2 = iq.a($$0.size(), cmy.f);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cqd.a($$2, $$1);
   }

   static record a(iq<cmy> a, @Nullable cpt b) {
      public boolean a(List<cmy> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cmy.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
