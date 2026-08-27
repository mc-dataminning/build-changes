import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bow extends bmp<ccz> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private clb e;
   private final List<clb> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bow(int $$0, int $$1) {
      super(ImmutableMap.of(btz.q, bua.a), $$0, $$1);
   }

   public boolean a(ama $$0, ccz $$1) {
      bly<?> $$2 = $$1.dN();
      if ($$2.c(btz.q).isEmpty()) {
         return false;
      } else {
         bky $$3 = $$2.c(btz.q).get();
         return $$3.ag() == bkm.bt && $$1.bv() && $$3.bv() && !$$1.n_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(ama $$0, ccz $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dN().c(btz.q).isPresent();
   }

   public void b(ama $$0, ccz $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ama $$0, ccz $$1, long $$2) {
      bky $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ama $$0, ccz $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dN().b(btz.q);
      c($$1);
      this.e = null;
   }

   private void a(bky $$0, ccz $$1) {
      boolean $$2 = false;
      clb $$3 = $$0.eS();
      if (this.e == null || !clb.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.b()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(ccz $$0) {
      a($$0, this.f.get(0));
   }

   private void b(ccz $$0) {
      for (cqq $$1 : $$0.gg()) {
         if (!$$1.p() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cqq $$0) {
      return clb.b(this.e, $$0.b()) || clb.b(this.e, $$0.c());
   }

   private static void c(ccz $$0) {
      $$0.a(bkn.a, clb.b);
      $$0.a(bkn.a, 0.085F);
   }

   private static void a(ccz $$0, clb $$1) {
      $$0.a(bkn.a, $$1);
      $$0.a(bkn.a, 0.0F);
   }

   private bky d(ccz $$0) {
      bly<?> $$1 = $$0.dN();
      bky $$2 = $$1.c(btz.q).get();
      $$1.a(btz.n, new bna($$2, true));
      return $$2;
   }

   private void e(ccz $$0) {
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
