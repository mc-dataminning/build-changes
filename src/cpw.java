import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cpw {
   private final cpw.a[] a;
   private WeakReference<cpy> b = new WeakReference<>(null);

   public cpw(int $$0) {
      this.a = new cpw.a[$$0];
   }

   public Optional<cpm> a(cti $$0, cik $$1) {
      if ($$1.ai_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cpw.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(cti $$0) {
      cpy $$1 = $$0.r();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cpm> a(cik $$0, cti $$1) {
      Optional<cpx<cpm>> $$2 = $$1.r().a(cqa.a, $$0, $$1);
      this.a($$0.h(), $$2.map(cpx::b).orElse(null));
      return $$2.map(cpx::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cpw.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<cmr> $$0, @Nullable cpm $$1) {
      iq<cmr> $$2 = iq.a($$0.size(), cmr.f);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cpw.a($$2, $$1);
   }

   static record a(iq<cmr> a, @Nullable cpm b) {
      public boolean a(List<cmr> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!cmr.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
