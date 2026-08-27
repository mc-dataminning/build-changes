import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cog {
   private final cog.a[] a;
   private WeakReference<coi> b = new WeakReference<>(null);

   public cog(int $$0) {
      this.a = new cog.a[$$0];
   }

   public Optional<cnv> a(crs $$0, cgu $$1) {
      if ($$1.ai_()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            cog.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1.h())) {
               this.a($$2);
               return Optional.ofNullable($$3.b());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(crs $$0) {
      coi $$1 = $$0.q();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<cnv> a(cgu $$0, crs $$1) {
      Optional<coh<cnv>> $$2 = $$1.q().a(cok.a, $$0, $$1);
      this.a($$0.h(), $$2.map(coh::b).orElse(null));
      return $$2.map(coh::b);
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         cog.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(List<clb> $$0, @Nullable cnv $$1) {
      il<clb> $$2 = il.a($$0.size(), clb.b);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         $$2.set($$3, $$0.get($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new cog.a($$2, $$1);
   }

   static record a(il<clb> a, @Nullable cnv b) {
      public boolean a(List<clb> $$0) {
         if (this.a.size() != $$0.size()) {
            return false;
         } else {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!clb.c(this.a.get($$1), $$0.get($$1))) {
                  return false;
               }
            }

            return true;
         }
      }
   }
}
