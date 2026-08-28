import javax.annotation.Nullable;

public class cmp extends clg {
   public cmp(bus<? extends cmp> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bT.a(3, new cdy<>(this, cnh.class, true));
      super.B();
   }

   @Override
   protected awm t() {
      return awn.CH;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.CJ;
   }

   @Override
   protected awm n_() {
      return awn.CI;
   }

   @Override
   awm q() {
      return awn.CK;
   }

   @Override
   protected void a(arp $$0, btb $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof clk $$4 && $$4.go()) {
         $$4.gp();
         this.a($$0, cwq.uE);
      }
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      this.a(but.a, new cwm(cwq.oS));
   }

   @Override
   protected void a(dgd $$0, azu $$1, bsi $$2) {
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      bwa $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bwp.c).a(4.0);
      this.v();
      return $$4;
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bvh) {
            ((bvh)$$1).b(new btq(bts.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cpb a(cwm $$0, float $$1, @Nullable cwm $$2) {
      cpb $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(btq $$0) {
      return $$0.a(bts.t) ? false : super.b($$0);
   }
}
