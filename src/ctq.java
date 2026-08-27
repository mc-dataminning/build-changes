import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ctq {
   private final ctq.a[] a;
   private WeakReference<cts> b = new WeakReference<>(null);

   public ctq(int $$0) {
      this.a = new ctq.a[$$0];
   }

   public Optional<ctg> a(cxb $$0, cmg $$1) {
      if ($$1.ai_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            ctq.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(cxb $$0) {
      cts $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<ctg> a(cmg $$0, cxb $$1) {
      Optional<ctr<ctg>> $$2 = $$1.r().a(ctu.a, $$0, $$1);
      this.a($$0.h(), $$2.map(ctr::b).orElse(null));
      return $$2.map(ctr::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         ctq.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cqm> $$0, @Nullable ctg $$1) {
      iu<cqm> $$2 = iu.a($$0.size(), cqm.h);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new ctq.a($$2, $$1);
   }

   static record a(iu<cqm> a, @Nullable ctg b) {
      public boolean a(List<cqm> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cqm.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
