import java.util.List;

public class cll extends cls {
   public static final float a = buq.M.l() / buq.ai.l();
   private static final int d = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public cll(buq<? extends cll> $$0, dgg $$1) {
      super($$0, $$1);
      this.aj();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bwm.a m() {
      return cls.x().a(bwn.v, 0.3F).a(bwn.c, 8.0).a(bwn.s, 80.0);
   }

   @Override
   public int p() {
      return 60;
   }

   @Override
   protected avy u() {
      return this.bm() ? avz.ij : avz.ik;
   }

   @Override
   protected avy e(bsz $$0) {
      return this.bm() ? avz.ip : avz.iq;
   }

   @Override
   protected avy o_() {
      return this.bm() ? avz.im : avz.in;
   }

   @Override
   protected avy t() {
      return avz.io;
   }

   @Override
   protected void a(arc $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         bto $$1 = new bto(btq.d, 6000, 2);
         List<ard> $$2 = btp.a($$0, this, this.du(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new acs(acs.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.gb()) {
         this.a(this.dw(), 16);
      }
   }
}
