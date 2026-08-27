import javax.annotation.Nullable;

public class cab extends byt {
   public cab(biw<? extends cab> $$0, cpx $$1) {
      super($$0, $$1);
      this.a(eaz.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bP.a(3, new brw<>(this, cal.class, true));
      super.z();
   }

   @Override
   protected ape w() {
      return apf.Ao;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.Aq;
   }

   @Override
   protected ape l_() {
      return apf.Ap;
   }

   @Override
   ape t() {
      return apf.Ar;
   }

   @Override
   protected void a(bhq $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byw $$4 && $$4.ge()) {
         $$4.gf();
         this.a((cpw)cjk.ts);
      }
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      this.a(bix.a, new cjh(cjk.oc));
   }

   @Override
   protected void b(ase $$0, bgy $$1) {
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      bkb $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bko.f).a(4.0);
      this.y();
      return $$5;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 2.1F;
   }

   @Override
   protected float l(bis $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(bis $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bji) {
            ((bji)$$0).b(new bif(bih.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected ccc b(cjh $$0, float $$1) {
      ccc $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bif $$0) {
      return $$0.c() == bih.t ? false : super.c($$0);
   }
}
