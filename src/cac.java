import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cac extends bxu<cpe> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cxk e;
   private final List<cxk> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cac(int $$0, int $$1) {
      super(ImmutableMap.of(cff.q, cfg.a), $$0, $$1);
   }

   public boolean a(ash $$0, cpe $$1) {
      bxd<?> $$2 = $$1.eb();
      if ($$2.c(cff.q).isEmpty()) {
         return false;
      } else {
         bwb $$3 = $$2.c(cff.q).get();
         return $$3.aq() == bvm.bS && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(ash $$0, cpe $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.eb().c(cff.q).isPresent();
   }

   public void b(ash $$0, cpe $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ash $$0, cpe $$1, long $$2) {
      bwb $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ash $$0, cpe $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.eb().b(cff.q);
      c($$1);
      this.e = null;
   }

   private void a(bwb $$0, cpe $$1) {
      boolean $$2 = false;
      cxk $$3 = $$0.eX();
      if (this.e == null || !cxk.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.f()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cpe $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cpe $$0) {
      for (dfx $$1 : $$0.go()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dfx $$0) {
      return cxk.b(this.e, $$0.b()) || cxk.b(this.e, $$0.c());
   }

   private static void c(cpe $$0) {
      $$0.a(bvn.a, cxk.k);
      $$0.a(bvn.a, 0.085F);
   }

   private static void a(cpe $$0, cxk $$1) {
      $$0.a(bvn.a, $$1);
      $$0.a(bvn.a, 0.0F);
   }

   private bwb d(cpe $$0) {
      bxd<?> $$1 = $$0.eb();
      bwb $$2 = $$1.c(cff.q).get();
      $$1.a(cff.n, new byf($$2, true));
      return $$2;
   }

   private void e(cpe $$0) {
      if (this.f.size() >= 2 && ++this.g >= 40) {
         this.h++;
         this.g = 0;
         if (this.h > this.f.size() - 1) {
            this.h = 0;
         }

         a($$0, this.f.get(this.h));
      }
   }
}
