import javax.annotation.Nullable;

public class cli extends clg implements bvy {
   private static final int b = 50;
   private static final int c = 70;
   private static final ajy<Boolean> d = akc.a(cli.class, aka.k);
   public static final String a = "sheared";

   public static bwo.a gu() {
      return clg.m().a(bwp.s, 16.0);
   }

   public cli(bus<? extends cli> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("sheared", this.gv());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gv() {
      return this.al.a(d);
   }

   public void x(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.sS) && this.a()) {
         if (this.dV() instanceof ard $$3) {
            this.a($$3, awb.h, $$2);
            this.a(ebt.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz u() {
      return awa.cn;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.cp;
   }

   @Override
   protected avz o_() {
      return awa.co;
   }

   @Override
   protected avz p() {
      return awa.cr;
   }

   @Override
   protected cpe a(cwp $$0, float $$1, @Nullable cwp $$2) {
      cpe $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpg $$4) {
         $$4.a(new btq(bts.s, 100));
      }

      return $$3;
   }

   @Override
   protected int x() {
      return 50;
   }

   @Override
   protected int gs() {
      return 70;
   }

   @Override
   public void a(ard $$0, awb $$1, cwp $$2) {
      $$0.a(null, this, awa.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.x(true);
   }

   private void d(ard $$0, cwp $$1) {
      this.a($$0, evn.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gv() && this.bL();
   }
}
