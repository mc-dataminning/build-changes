import javax.annotation.Nullable;

public class cli extends clg implements bvy {
   private static final int b = 50;
   private static final int c = 70;
   private static final akm<Boolean> d = akq.a(cli.class, ako.k);
   public static final String a = "sheared";

   public static bwo.a gp() {
      return clg.n().a(bwp.s, 16.0);
   }

   public cli(bus<? extends cli> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("sheared", this.gq());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("sheared"));
   }

   public boolean gq() {
      return this.al.a(d);
   }

   public void x(boolean $$0) {
      this.al.a(d, $$0);
   }

   @Override
   protected bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.sm) && this.a()) {
         if (this.dV() instanceof arp $$3) {
            this.a($$3, awo.h, $$2);
            this.a(ear.M, $$0);
            $$2.a(1, $$0, d($$1));
         }

         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awm t() {
      return awn.cn;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.cp;
   }

   @Override
   protected awm n_() {
      return awn.co;
   }

   @Override
   protected awm q() {
      return awn.cr;
   }

   @Override
   protected cpb a(cwm $$0, float $$1, @Nullable cwm $$2) {
      cpb $$3 = super.a($$0, $$1, $$2);
      if ($$3 instanceof cpd $$4) {
         $$4.a(new btq(bts.s, 100));
      }

      return $$3;
   }

   @Override
   protected int gm() {
      return 50;
   }

   @Override
   protected int gn() {
      return 70;
   }

   @Override
   public void a(arp $$0, awo $$1, cwm $$2) {
      $$0.a(null, this, awn.cq, $$1, 1.0F, 1.0F);
      this.d($$0, $$2);
      this.x(true);
   }

   private void d(arp $$0, cwm $$1) {
      this.a($$0, euj.aQ, $$1, ($$0x, $$1x) -> this.a($$0x, $$1x, this.dr()));
   }

   @Override
   public boolean a() {
      return !this.gq() && this.bL();
   }
}
