import java.util.List;

public class cln extends clu {
   public static final float a = bus.L.l() / bus.ah.l();
   private static final int d = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cln(bus<? extends cln> $$0, dfm $$1) {
      super($$0, $$1);
      this.ai();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bwo.a n() {
      return clu.gm().a(bwp.v, 0.3F).a(bwp.c, 8.0).a(bwp.s, 80.0);
   }

   @Override
   public int q() {
      return 60;
   }

   @Override
   protected awm t() {
      return this.bm() ? awn.hP : awn.hQ;
   }

   @Override
   protected awm e(btb $$0) {
      return this.bm() ? awn.hV : awn.hW;
   }

   @Override
   protected awm n_() {
      return this.bm() ? awn.hS : awn.hT;
   }

   @Override
   protected awm v() {
      return awn.hU;
   }

   @Override
   protected void a(arp $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         btq $$1 = new btq(bts.d, 6000, 2);
         List<arq> $$2 = btr.a($$0, this, this.dt(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new adm(adm.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.fY()) {
         this.a(this.dv(), 16);
      }
   }
}
