import java.util.List;

public class cmd extends cmk {
   public static final float a = bvi.N.l() / bvi.aj.l();
   private static final int d = 1200;
   private static final int bZ = 50;
   private static final int ca = 6000;
   private static final int cb = 2;
   private static final int cc = 1200;

   public cmd(bvi<? extends cmd> $$0, dgz $$1) {
      super($$0, $$1);
      this.ai();
      if (this.c != null) {
         this.c.c(400);
      }
   }

   public static bxe.a m() {
      return cmk.x().a(bxf.v, 0.3F).a(bxf.c, 8.0).a(bxf.s, 80.0);
   }

   @Override
   public int p() {
      return 60;
   }

   @Override
   protected awu u() {
      return this.bm() ? awv.ij : awv.ik;
   }

   @Override
   protected awu e(btr $$0) {
      return this.bm() ? awv.ip : awv.iq;
   }

   @Override
   protected awu o_() {
      return this.bm() ? awv.im : awv.in;
   }

   @Override
   protected awu t() {
      return awv.io;
   }

   @Override
   protected void a(arx $$0) {
      super.a($$0);
      if ((this.af + this.ar()) % 1200 == 0) {
         bug $$1 = new bug(bui.d, 6000, 2);
         List<ary> $$2 = buh.a($$0, this, this.du(), 50.0, $$1, 1200);
         $$2.forEach($$0x -> $$0x.f.b(new ado(ado.l, this.bb() ? 0.0F : 1.0F)));
      }

      if (!this.ga()) {
         this.a(this.dw(), 16);
      }
   }
}
