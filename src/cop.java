import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cop {
   private final cop.a[] a;
   private WeakReference<cor> b = new WeakReference<>(null);

   public cop(int $$0) {
      this.a = new cop.a[$$0];
   }

   public Optional<cod> a(csa $$0, chc $$1) {
      if ($$1.ai_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cop.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(csa $$0) {
      cor $$1 = $$0.q();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cod> a(chc $$0, csa $$1) {
      Optional<coq<cod>> $$2 = $$1.q().a(cot.a, $$0, $$1);
      this.a($$0.h(), $$2.map(coq::b).orElse(null));
      return $$2.map(coq::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cop.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<clj> $$0, @Nullable cod $$1) {
      il<clj> $$2 = il.a($$0.size(), clj.b);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cop.a($$2, $$1);
   }

   static record a(il<clj> a, @Nullable cod b) {
      public boolean a(List<clj> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!clj.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
