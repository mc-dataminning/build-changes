import javax.annotation.Nullable;

public class chf extends cgy {
   private static final buo bY = bus.C.n().a(0.5F).b(0.665F);

   public chf(bus<? extends chf> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new ccy(this, 2.0));
      this.bS.a(2, new cbr(this, 1.0));
      this.bS.a(3, new cdn(this, 1.25, $$0 -> $$0.a(axl.ae), false));
      this.bS.a(4, new cce(this, 1.25));
      this.bS.a(5, new cds(this, 1.0));
      this.bS.a(6, new ccn(this, cou.class, 6.0F));
      this.bS.a(7, new cda(this));
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ae);
   }

   public static bwo.a n() {
      return cgy.gr().a(bwp.s, 10.0).a(bwp.v, 0.2F);
   }

   @Override
   protected awm t() {
      return awn.gc;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.ge;
   }

   @Override
   protected awm n_() {
      return awn.gd;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.gg, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.qz) && !this.e_()) {
         $$0.a(awn.gf, 1.0F, 1.0F);
         cwm $$3 = cwp.a($$2, $$0, cwq.qF.o());
         $$0.a($$1, $$3);
         return bsk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public chf b(arp $$0, buc $$1) {
      return bus.C.a($$0, bur.e);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? bY : super.e($$0);
   }
}
