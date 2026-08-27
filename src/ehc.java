import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ehc extends egu {
   @Override
   public egv d() {
      return egx.b;
   }

   @Override
   public egv e() {
      return egx.c;
   }

   @Override
   public coy a() {
      return cpg.qy;
   }

   @Override
   public void a(cvr $$0, hz $$1, egw $$2, awp $$3) {
      if (!$$2.b() && !$$2.c(a)) {
         if ($$3.a(64) == 0) {
            $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, atl.Bh, atm.e, $$3.i() * 0.25F + 0.75F, $$3.i() + 0.5F, false);
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
   protected boolean a(cvr $$0) {
      return $$0.Z().b(cvn.U);
   }

   @Override
   protected void a(cvs $$0, hz $$1, dlj $$2) {
      dix $$3 = $$2.t() ? $$0.c_($$1) : null;
      cys.a($$2, $$0, $$1, $$3);
   }

   @Override
   public int b(cvu $$0) {
      return 4;
   }

   @Override
   public dlj b(egw $$0) {
      return cyu.G.o().a(ddh.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(egv $$0) {
      return $$0 == egx.c || $$0 == egx.b;
   }

   @Override
   public int c(cvu $$0) {
      return 1;
   }

   @Override
   public int a(cvu $$0) {
      return 5;
   }

   @Override
   public boolean a(egw $$0, cux $$1, hz $$2, egv $$3, ie $$4) {
      return $$4 == ie.a && !$$3.a(auf.a);
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<atk> j() {
      return Optional.of(atl.da);
   }

   public static class a extends ehc {
      @Override
      protected void a(dlk.a<egv, egw> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(egw $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(egw $$0) {
         return false;
      }
   }

   public static class b extends ehc {
      @Override
      public int d(egw $$0) {
         return 8;
      }

      @Override
      public boolean c(egw $$0) {
         return true;
      }
   }
}
