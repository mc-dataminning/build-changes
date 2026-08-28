import javax.annotation.Nullable;

public class clp extends ckt implements ckz, cnr {
   private static final akk<Boolean> b = ako.a(clp.class, akm.k);
   private static final int c = 5;
   private static final int bY = 300;
   private final bsf bZ = new bsf(5);

   public clp(bug<? extends clp> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbn(this));
      this.bS.a(2, new cpw.a(this, 10.0F));
      this.bS.a(3, new ccu<>(this, 1.0, 8.0F));
      this.bS.a(8, new ccq(this, 0.6));
      this.bS.a(9, new ccb(this, coh.class, 15.0F, 1.0F));
      this.bS.a(10, new ccb(this, bux.class, 15.0F));
      this.bT.a(1, new cdl(this, cpw.class).a());
      this.bT.a(2, new cdm<>(this, coh.class, true));
      this.bT.a(3, new cdm<>(this, cno.class, false));
      this.bT.a(3, new cdm<>(this, cgy.class, true));
   }

   public static bwc.a t() {
      return clm.gB().a(bwd.v, 0.35F).a(bwd.s, 24.0).a(bwd.c, 5.0).a(bwd.m, 32.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cwt $$0) {
      return $$0 == cwb.vX;
   }

   public boolean gv() {
      return this.am.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a() {
      this.bc = 0;
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      this.b($$0, this.dZ());
   }

   @Override
   public ckt.a q() {
      if (this.gv()) {
         return ckt.a.f;
      } else if (this.b(cwb.vX)) {
         return ckt.a.e;
      } else {
         return this.gk() ? ckt.a.b : ckt.a.h;
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a($$0, this.dZ());
      this.a_(true);
   }

   @Override
   public float a(jg $$0, dey $$1) {
      return 0.0F;
   }

   @Override
   public int aj() {
      return 1;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      this.a(buh.a, new cvx(cwb.vX));
   }

   @Override
   protected void b(dfl $$0, azr $$1, brw $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cvx $$3 = this.fb();
         if ($$3.a(cwb.vX)) {
            dbo.a($$3, $$0.H_(), dda.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awj w() {
      return awk.tU;
   }

   @Override
   protected awj o_() {
      return awk.tW;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.tX;
   }

   @Override
   public void a(buv $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bsf y() {
      return this.bZ;
   }

   @Override
   protected void b(ckq $$0) {
      cvx $$1 = $$0.m();
      if ($$1.h() instanceof ctz) {
         super.b($$0);
      } else if (this.k($$1)) {
         this.a($$0);
         cvx $$2 = this.bZ.b($$1);
         if ($$2.f()) {
            $$0.au();
         } else {
            $$1.e($$2.L());
         }
      }
   }

   private boolean k(cvx $$0) {
      return this.gM() && $$0.a(cwb.uR);
   }

   @Override
   public bvn a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bvn.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(arm $$0, int $$1, boolean $$2) {
      cpv $$3 = this.gJ();
      boolean $$4 = this.af.i() <= $$3.v();
      if ($$4) {
         cvx $$5 = new cvx(cwb.vX);
         alg<dcu> $$6;
         if ($$1 > $$3.a(brv.c)) {
            $$6 = dda.d;
         } else if ($$1 > $$3.a(brv.b)) {
            $$6 = dda.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dbo.a($$5, $$0.H_(), $$6, $$0.d_(this.dx()), this.ea());
            this.a(buh.a, $$5);
         }
      }
   }

   @Override
   public awj aj_() {
      return awk.tV;
   }
}
