import javax.annotation.Nullable;

public class cly extends clc implements cli, coa {
   private static final ako<Boolean> b = aks.a(cly.class, akq.k);
   private static final int c = 5;
   private static final int bY = 300;
   private final bso bZ = new bso(5);

   public cly(bup<? extends cly> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbw(this));
      this.bS.a(2, new cqf.a(this, 10.0F));
      this.bS.a(3, new cdd<>(this, 1.0, 8.0F));
      this.bS.a(8, new ccz(this, 0.6));
      this.bS.a(9, new cck(this, cor.class, 15.0F, 1.0F));
      this.bS.a(10, new cck(this, bvg.class, 15.0F));
      this.bT.a(1, new cdu(this, cqf.class).a());
      this.bT.a(2, new cdv<>(this, cor.class, true));
      this.bT.a(3, new cdv<>(this, cnx.class, false));
      this.bT.a(3, new cdv<>(this, chh.class, true));
   }

   public static bwl.a t() {
      return clv.gB().a(bwm.v, 0.35F).a(bwm.s, 24.0).a(bwm.c, 5.0).a(bwm.m, 32.0);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cxb $$0) {
      return $$0 == cwj.wn;
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
      this.bf = 0;
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      this.b($$0, this.ea());
   }

   @Override
   public clc.a q() {
      if (this.gv()) {
         return clc.a.f;
      } else if (this.b(cwj.wn)) {
         return clc.a.e;
      } else {
         return this.gk() ? clc.a.b : clc.a.h;
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a($$0, this.ea());
      this.a_(true);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return 0.0F;
   }

   @Override
   public int aj() {
      return 1;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      this.a(buq.a, new cwf(cwj.wn));
   }

   @Override
   protected void b(dfw $$0, azv $$1, bsf $$2) {
      super.b($$0, $$1, $$2);
      if ($$1.a(300) == 0) {
         cwf $$3 = this.fc();
         if ($$3.a(cwj.wn)) {
            dby.a($$3, $$0.H_(), ddk.b, $$2, $$1);
         }
      }
   }

   @Override
   protected awn w() {
      return awo.tU;
   }

   @Override
   protected awn o_() {
      return awo.tW;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.tX;
   }

   @Override
   public void a(bve $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bso y() {
      return this.bZ;
   }

   @Override
   protected void b(ckz $$0) {
      cwf $$1 = $$0.m();
      if ($$1.h() instanceof cui) {
         super.b($$0);
      } else if (this.k($$1)) {
         this.a($$0);
         cwf $$2 = this.bZ.b($$1);
         if ($$2.f()) {
            $$0.av();
         } else {
            $$1.e($$2.L());
         }
      }
   }

   private boolean k(cwf $$0) {
      return this.gM() && $$0.a(cwj.vh);
   }

   @Override
   public bvw a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bvw.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
      cqe $$3 = this.gJ();
      boolean $$4 = this.af.i() <= $$3.v();
      if ($$4) {
         cwf $$5 = new cwf(cwj.wn);
         alk<dde> $$6;
         if ($$1 > $$3.a(bse.c)) {
            $$6 = ddk.d;
         } else if ($$1 > $$3.a(bse.b)) {
            $$6 = ddk.c;
         } else {
            $$6 = null;
         }

         if ($$6 != null) {
            dby.a($$5, $$0.H_(), $$6, $$0.d_(this.dy()), this.eb());
            this.a(buq.a, $$5);
         }
      }
   }

   @Override
   public awn aj_() {
      return awo.tV;
   }
}
