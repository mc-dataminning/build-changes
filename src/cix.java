import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cix extends cgx {
   public static final bun bY = bun.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cfr<? extends cfq<? super cix>>> bZ = ImmutableList.of(cfr.c, cfr.d, cfr.b, cfr.o, cfr.f, cfr.r);
   protected static final ImmutableList<cek<?>> ca = ImmutableList.of(
      cek.n, cek.h, cek.m, cek.E, cek.t, cek.av, cek.r, cek.S, cek.T, cek.O, cek.K, cek.P, new cek[]{cek.R, cek.V, cek.W, cek.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final ajy<Boolean> ch = akc.a(cix.class, aka.k);
   private static final ajy<Boolean> ci = akc.a(cix.class, aka.k);
   private static final ajy<Boolean> cj = akc.a(cix.class, aka.k);
   private boolean ck;
   private int cl;

   public cix(bur<? extends cix> $$0, dgh $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(etp.f, -1.0F);
      this.a(etp.g, -1.0F);
   }

   public cwo p() {
      azh $$0 = azh.a((long)this.cG().hashCode());
      axf<cwh> $$1 = this.gE() ? awx.b : awx.a;
      return this.dV().K_().e(mc.I).a($$1, $$0).map($$0x -> cwi.a(cws.xi, $$0x)).orElseGet(() -> new cwo(cws.xi));
   }

   @Override
   protected bwi.b<cix> ec() {
      return bwi.a(ca, bZ);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return ciy.a(this.ec().a($$0));
   }

   public static bwn.a t() {
      return cgx.gx().a(bwo.s, 10.0).a(bwo.v, 0.2F).a(bwo.c, 2.0);
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.g(bwo.c).a(1.0);
         this.gw();
      } else {
         this.g(bwo.c).a(2.0);
         this.gv();
      }
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 10;
   }

   @Override
   protected avz u() {
      return this.gE() ? awa.lt : awa.lk;
   }

   @Override
   protected avz e(bta $$0) {
      return this.gE() ? awa.lw : awa.ln;
   }

   @Override
   protected avz o_() {
      return this.gE() ? awa.lu : awa.ll;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.lB, 0.15F, 1.0F);
   }

   protected avz x() {
      return this.gE() ? awa.ly : awa.lp;
   }

   @Nullable
   public cix b(ard $$0, bub $$1) {
      cix $$2 = bur.ah.a($$0, buq.e);
      if ($$2 != null) {
         ciy.a($$2, $$0.H_());
         bub $$3 = (bub)($$0.H_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cix $$4 && $$4.gE() || $$0.H_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bwi<cix> eb() {
      return (bwi<cix>)super.eb();
   }

   @Override
   protected void a(ard $$0) {
      bos $$1 = bor.a();
      $$1.a("goatBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      ciy.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int af() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.af();
      float $$2 = ayz.c(this.aX, $$0);
      float $$3 = ayz.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aX + $$3);
   }

   @Override
   protected void gy() {
      this.dV().a(null, this, this.gE() ? awa.lv : awa.lm, awb.g, 1.0F, ayz.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.ae);
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if ($$2.a(cws.rf) && !this.e_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cwo $$3 = cwr.a($$2, $$0, cws.rl.n());
         $$0.a($$1, $$3);
         return bsj.a;
      } else {
         bsj $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gy();
         }

         return $$4;
      }
   }

   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      azh $$4 = $$0.H_();
      ciy.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.i();
      if (!this.e_() && (double)$$4.i() < 0.1F) {
         ajy<Boolean> $$5 = $$4.h() ? ci : cj;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public bun e(bvs $$0) {
      return $$0 == bvs.g ? bY.a(this.ei()) : super.e($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gE());
      $$0.a("HasLeftHorn", this.gs());
      $$0.a("HasRightHorn", this.gt());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.al.a(ci, $$0.q("HasLeftHorn"));
      this.al.a(cj, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.ck = true;
      } else if ($$0 == 59) {
         this.ck = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void d_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = ayz.a(this.cl, 0, 20);
      super.d_();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gs() {
      return this.al.a(ci);
   }

   public boolean gt() {
      return this.al.a(cj);
   }

   public boolean gu() {
      boolean $$0 = this.gs();
      boolean $$1 = this.gt();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajy<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ae.h() ? ci : cj;
         }

         this.al.a($$2, false);
         faz $$5 = this.dt();
         cwo $$6 = this.p();
         double $$7 = (double)ayz.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)ayz.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)ayz.b(this.ae, -0.2F, 0.2F);
         clb $$10 = new clb(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dV().b($$10);
         return true;
      }
   }

   public void gv() {
      this.al.a(ci, true);
      this.al.a(cj, true);
   }

   public void gw() {
      this.al.a(ci, false);
      this.al.a(cj, false);
   }

   public boolean gE() {
      return this.al.a(ch);
   }

   public void x(boolean $$0) {
      this.al.a(ch, $$0);
   }

   public float gF() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bur<? extends cgx> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cb) && a($$1, $$3);
   }
}
