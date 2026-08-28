import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxr extends bvj<cml> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cuq e;
   private final List<cuq> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxr(int $$0, int $$1) {
      super(ImmutableMap.of(ccu.q, ccv.a), $$0, $$1);
   }

   public boolean a(arf $$0, cml $$1) {
      bus<?> $$2 = $$1.dS();
      if ($$2.c(ccu.q).isEmpty()) {
         return false;
      } else {
         btq $$3 = $$2.c(ccu.q).get();
         return $$3.ak() == btb.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(arf $$0, cml $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dS().c(ccu.q).isPresent();
   }

   public void b(arf $$0, cml $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arf $$0, cml $$1, long $$2) {
      btq $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arf $$0, cml $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dS().b(ccu.q);
      c($$1);
      this.e = null;
   }

   private void a(btq $$0, cml $$1) {
      boolean $$2 = false;
      cuq $$3 = $$0.eX();
      if (this.e == null || !cuq.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.e()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cml $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cml $$0) {
      for (dax $$1 : $$0.gs()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dax $$0) {
      return cuq.b(this.e, $$0.b()) || cuq.b(this.e, $$0.c());
   }

   private static void c(cml $$0) {
      $$0.a(btc.a, cuq.l);
      $$0.a(btc.a, 0.085F);
   }

   private static void a(cml $$0, cuq $$1) {
      $$0.a(btc.a, $$1);
      $$0.a(btc.a, 0.0F);
   }

   private btq d(cml $$0) {
      bus<?> $$1 = $$0.dS();
      btq $$2 = $$1.c(ccu.q).get();
      $$1.a(ccu.n, new bvu($$2, true));
      return $$2;
   }

   private void e(cml $$0) {
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
