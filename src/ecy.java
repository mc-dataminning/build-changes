import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ecy extends ecq {
   @Override
   public ecr d() {
      return ect.b;
   }

   @Override
   public ecr e() {
      return ect.c;
   }

   @Override
   public cle a() {
      return clm.qw;
   }

   @Override
   public void a(csa $$0, ht $$1, ecs $$2, ats $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, aqr.Aw, aqs.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(js.ag, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public jq h() {
      return js.m;
   }

   @Override
   protected boolean a(csa $$0) {
      return $$0.Y().b(crw.U);
   }

   @Override
   protected void a(csb $$0, ht $$1, dhi $$2) {
      dfd $$3 = $$2.t() ? $$0.c_($$1) : null;
      cva.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(csd $$0) {
      return 4;
   }

   @Override
   public dhi b(ecs $$0) {
      return cvc.G.o().a(czp.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ecr $$0) {
      return $$0 == ect.c || $$0 == ect.b;
   }

   @Override
   public int c(csd $$0) {
      return 1;
   }

   @Override
   public int a(csd $$0) {
      return 5;
   }

   @Override
   public boolean a(ecs $$0, crg $$1, ht $$2, ecr $$3, hx $$4) {
      return $$4 == hx.a && !$$3.a(arl.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<aqq> j() {
      return Optional.of(aqr.cB);
   }

   public static class a extends ecy {
      @Override
      protected void a(dhj.a<ecr, ecs> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ecs $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ecs $$0) {
         return false;
      }
   }

   public static class b extends ecy {
      @Override
      public int d(ecs $$0) {
         return 8;
      }

      @Override
      public boolean c(ecs $$0) {
         return true;
      }
   }
}
