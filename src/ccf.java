import org.joml.Vector3f;

public class ccf extends cco {
   private static final int b = 2400;
   private int c;

   public ccf(bly<? extends ccf> $$0, cto $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void B() {
      this.bO.a(1, new bta(this));
      this.bO.a(1, new bsv(this, this.dM()));
      this.bO.a(2, new btq(this, 1.0, false));
      this.bO.a(3, new but(this, 1.0));
      this.bO.a(7, new bto(this, cfh.class, 8.0F));
      this.bO.a(8, new bub(this));
      this.bP.a(1, new buy(this).a());
      this.bP.a(2, new buz<>(this, cfh.class, true));
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 0.13F;
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.l, 8.0).a(bnq.m, 0.25).a(bnq.c, 2.0);
   }

   @Override
   protected blu.b aW() {
      return blu.b.c;
   }

   @Override
   protected arq y() {
      return arr.hL;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.hN;
   }

   @Override
   protected arq n_() {
      return arr.hM;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.hO, 0.15F, 1.0F);
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

   public static boolean b(bly<ccf> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cfh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   @Override
   public bmp eS() {
      return bmp.c;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }
}
