import java.util.List;

public class cfp extends cfw {
   public static final float b = bpd.E.k() / bpd.Z.k();
   private static final int e = 1200;
   private static final int bX = 50;
   private static final int bY = 6000;
   private static final int bZ = 2;
   private static final int ca = 1200;

   public cfp(bpd<? extends cfp> $$0, cxb $$1) {
      super($$0, $$1);
      this.fS();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bqv.a r() {
      return cfw.gn().a(bqw.r, 0.3F).a(bqw.c, 8.0).a(bqw.q, 80.0);
   }

   @Override
   public int s() {
      return 60;
   }

   @Override
   protected atx v() {
      return this.bf() ? aty.hH : aty.hI;
   }

   @Override
   protected atx d(bnw $$0) {
      return this.bf() ? aty.hN : aty.hO;
   }

   @Override
   protected atx n_() {
      return this.bf() ? aty.hK : aty.hL;
   }

   @Override
   protected atx y() {
      return aty.hM;
   }

   @Override
   protected void Y() {
      super.Y();
      if ((this.ah + this.aj()) % 1200 == 0) {
         bok $$0 = new bok(bom.d, 6000, 2);
         List<apg> $$1 = bol.a((apf)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new abt(abt.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fZ()) {
         this.a(this.dm(), 16);
      }
   }
}
