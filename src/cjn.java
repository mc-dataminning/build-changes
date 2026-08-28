import java.util.List;

public class cjn extends cju {
   public static final float b = bsv.D.l() / bsv.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cjn(bsv<? extends cjn> $$0, dbt $$1) {
      super($$0, $$1);
      this.fU();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bur.a s() {
      return cju.gq().a(bus.r, 0.3F).a(bus.c, 8.0).a(bus.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected avv v() {
      return this.bh() ? avw.hO : avw.hP;
   }

   @Override
   protected avv d(bri $$0) {
      return this.bh() ? avw.hU : avw.hV;
   }

   @Override
   protected avv o_() {
      return this.bh() ? avw.hR : avw.hS;
   }

   @Override
   protected avv y() {
      return avw.hT;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ai + this.al()) % 1200 == 0) {
         brx $$0 = new brx(brz.d, 6000, 2);
         List<arc> $$1 = bry.a((arb)this.dP(), this, this.dn(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new adl(adl.l, this.aW() ? 0.0F : 1.0F)));
      }

      if (!this.gb()) {
         this.a(this.dp(), 16);
      }
   }
}
