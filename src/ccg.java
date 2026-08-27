import org.joml.Vector3f;

public class ccg extends ccp {
   private static final int b = 2400;
   private int c;

   public ccg(blz<? extends ccg> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void B() {
      this.bO.a(1, new btb(this));
      this.bO.a(1, new bsw(this, this.dM()));
      this.bO.a(2, new btr(this, 1.0, false));
      this.bO.a(3, new buu(this, 1.0));
      this.bO.a(7, new btp(this, cfi.class, 8.0F));
      this.bO.a(8, new buc(this));
      this.bP.a(1, new buz(this).a());
      this.bP.a(2, new bva<>(this, cfi.class, true));
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 0.13F;
   }

   public static bnq.a u() {
      return ccp.gk().a(bnr.l, 8.0).a(bnr.m, 0.25).a(bnr.c, 2.0);
   }

   @Override
   protected blv.b aW() {
      return blv.b.c;
   }

   @Override
   protected arr y() {
      return ars.hL;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.hN;
   }

   @Override
   protected arr n_() {
      return ars.hM;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.hO, 0.15F, 1.0F);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dC();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jx.Z, this.d(0.5), this.du(), this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fL()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(blz<ccg> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cfi $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bmq eS() {
      return bmq.c;
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
