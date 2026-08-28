import java.util.List;

public class clk extends clr {
   public static final float b = bup.D.l() / bup.Y.l();
   private static final int e = 1200;
   private static final int bY = 50;
   private static final int bZ = 6000;
   private static final int ca = 2;
   private static final int cb = 1200;

   public clk(bup<? extends clk> $$0, dff $$1) {
      super($$0, $$1);
      this.gb();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bwl.a q() {
      return clr.gv().a(bwm.v, 0.3F).a(bwm.c, 8.0).a(bwm.s, 80.0);
   }

   @Override
   public int t() {
      return 60;
   }

   @Override
   protected awn w() {
      return this.bo() ? awo.hP : awo.hQ;
   }

   @Override
   protected awn d(bsy $$0) {
      return this.bo() ? awo.hV : awo.hW;
   }

   @Override
   protected awn o_() {
      return this.bo() ? awo.hS : awo.hT;
   }

   @Override
   protected awn y() {
      return awo.hU;
   }

   @Override
   protected void ac() {
      super.ac();
      if ((this.ag + this.as()) % 1200 == 0) {
         btn $$0 = new btn(btp.d, 6000, 2);
         List<arr> $$1 = bto.a((arq)this.dY(), this, this.dw(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.g.b(new ado(ado.l, this.bd() ? 0.0F : 1.0F)));
      }

      if (!this.gh()) {
         this.a(this.dy(), 16);
      }
   }
}
