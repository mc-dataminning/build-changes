import java.util.List;

public class cjq extends cjx {
   public static final float b = bsy.D.l() / bsy.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cjq(bsy<? extends cjq> $$0, dbw $$1) {
      super($$0, $$1);
      this.fU();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static buu.a s() {
      return cjx.gq().a(buv.r, 0.3F).a(buv.c, 8.0).a(buv.q, 80.0);
   }

   @Override
   public int u() {
      return 60;
   }

   @Override
   protected avy v() {
      return this.bh() ? avz.hO : avz.hP;
   }

   @Override
   protected avy d(brl $$0) {
      return this.bh() ? avz.hU : avz.hV;
   }

   @Override
   protected avy o_() {
      return this.bh() ? avz.hR : avz.hS;
   }

   @Override
   protected avy y() {
      return avz.hT;
   }

   @Override
   protected void Z() {
      super.Z();
      if ((this.ai + this.al()) % 1200 == 0) {
         bsa $$0 = new bsa(bsc.d, 6000, 2);
         List<arf> $$1 = bsb.a((are)this.dP(), this, this.dn(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.c.b(new ado(ado.l, this.aW() ? 0.0F : 1.0F)));
      }

      if (!this.gb()) {
         this.a(this.dp(), 16);
      }
   }
}
