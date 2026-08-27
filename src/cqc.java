import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cqc {
   private final cqc.a[] a;
   private WeakReference<cqe> b = new WeakReference<>(null);

   public cqc(int $$0) {
      this.a = new cqc.a[$$0];
   }

   public Optional<cps> a(cto $$0, ciq $$1) {
      if ($$1.ai_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cqc.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(cto $$0) {
      cqe $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cps> a(ciq $$0, cto $$1) {
      Optional<cqd<cps>> $$2 = $$1.r().a(cqg.a, $$0, $$1);
      this.a($$0.h(), $$2.map(cqd::b).orElse(null));
      return $$2.map(cqd::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cqc.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cmx> $$0, @Nullable cps $$1) {
      iq<cmx> $$2 = iq.a($$0.size(), cmx.f);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cqc.a($$2, $$1);
   }

   static record a(iq<cmx> a, @Nullable cps b) {
      public boolean a(List<cmx> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cmx.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
