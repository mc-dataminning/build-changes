import java.util.Optional;
import javax.annotation.Nullable;

public abstract class egv extends egn {
   @Override
   public ego d() {
      return egq.b;
   }

   @Override
   public ego e() {
      return egq.c;
   }

   @Override
   public cou a() {
      return cpc.qy;
   }

   @Override
   public void a(cvn $$0, hz $$1, egp $$2, awo $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atk.Bg, atl.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
         }
      } else if ($$3.a(10) == 0) {
         $$0.a(jz.ai, (double)$$1.u() + $$3.j(), (double)$$1.v() + $$3.j(), (double)$$1.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }

   @Nullable
   @Override
   public jx h() {
      return jz.m;
   }

   @Override
   protected boolean a(cvn $$0) {
      return $$0.Z().b(cvj.U);
   }

   @Override
   protected void a(cvo $$0, hz $$1, dlf $$2) {
      dit $$3 = $$2.t() ? $$0.c_($$1) : null;
      cyo.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cvq $$0) {
      return 4;
   }

   @Override
   public dlf b(egp $$0) {
      return cyq.G.o().a(ddd.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ego $$0) {
      return $$0 == egq.c || $$0 == egq.b;
   }

   @Override
   public int c(cvq $$0) {
      return 1;
   }

   @Override
   public int a(cvq $$0) {
      return 5;
   }

   @Override
   public boolean a(egp $$0, cut $$1, hz $$2, ego $$3, ie $$4) {
      return $$4 == ie.a && !$$3.a(aue.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<atj> j() {
      return Optional.of(atk.cZ);
   }

   public static class a extends egv {
      @Override
      protected void a(dlg.a<ego, egp> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(egp $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(egp $$0) {
         return false;
      }
   }

   public static class b extends egv {
      @Override
      public int d(egp $$0) {
         return 8;
      }

      @Override
      public boolean c(egp $$0) {
         return true;
      }
   }
}
