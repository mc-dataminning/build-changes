import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Optional;
import javax.annotation.Nullable;

public class dff {
   private final dff.a[] a;
   private WeakReference<dfi> b = new WeakReference<>(null);

   public dff(int $$0) {
      this.a = new dff.a[$$0];
   }

   public Optional<dfg<deq>> a(asb $$0, dep $$1) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         this.a($$0);

         for (int $$2 = 0; $$2 < this.a.length; $$2++) {
            dff.a $$3 = this.a[$$2];
            if ($$3 != null && $$3.a($$1)) {
               this.a($$2);
               return Optional.ofNullable($$3.d());
            }
         }

         return this.a($$1, $$0);
      }
   }

   private void a(asb $$0) {
      dfi $$1 = $$0.t();
      if ($$1 != this.b.get()) {
         this.b = new WeakReference<>($$1);
         Arrays.fill(this.a, null);
      }
   }

   private Optional<dfg<deq>> a(dep $$0, asb $$1) {
      Optional<dfg<deq>> $$2 = $$1.t().a(dfm.a, $$0, $$1);
      this.a($$0, $$2.orElse(null));
      return $$2;
   }

   private void a(int $$0) {
      if ($$0 > 0) {
         dff.a $$1 = this.a[$$0];
         System.arraycopy(this.a, 0, this.a, 1, $$0);
         this.a[0] = $$1;
      }
   }

   private void a(dep $$0, @Nullable dfg<deq> $$1) {
      jp<dak> $$2 = jp.a($$0.a(), dak.l);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         $$2.set($$3, $$0.a($$3).c(1));
      }

      System.arraycopy(this.a, 0, this.a, 1, this.a.length - 1);
      this.a[0] = new dff.a($$2, $$0.f(), $$0.g(), $$1);
   }

   static record a(jp<dak> a, int b, int c, @Nullable dfg<deq> d) {
      public boolean a(dep $$0) {
         if (this.b == $$0.f() && this.c == $$0.g()) {
            for (int $$1 = 0; $$1 < this.a.size(); $$1++) {
               if (!dak.c(this.a.get($$1), $$0.a($$1))) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }
}
