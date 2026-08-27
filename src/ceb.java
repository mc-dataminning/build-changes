import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ceb extends ccd {
   public static final bpy bX = bpy.b(0.9F, 1.3F).a(0.7F);
   private static final int ce = 2;
   private static final int cf = 1;
   protected static final ImmutableList<cay<? extends cax<? super ceb>>> bY = ImmutableList.of(cay.c, cay.d, cay.b, cay.o, cay.f, cay.r);
   protected static final ImmutableList<bzr<?>> ca = ImmutableList.of(
      bzr.n, bzr.h, bzr.m, bzr.E, bzr.t, bzr.av, bzr.r, bzr.S, bzr.T, bzr.O, bzr.K, bzr.P, new bzr[]{bzr.R, bzr.V, bzr.W, bzr.Z}
   );
   public static final int cb = 10;
   public static final double cc = 0.02;
   public static final double cd = 0.1F;
   private static final aiy<Boolean> cg = ajc.a(ceb.class, aja.k);
   private static final aiy<Boolean> ch = ajc.a(ceb.class, aja.k);
   private static final aiy<Boolean> ci = ajc.a(ceb.class, aja.k);
   private boolean cj;
   private int ck;

   public ceb(bqb<? extends ceb> $$0, cyx $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(elj.f, -1.0F);
      this.a(elj.g, -1.0F);
   }

   public crj r() {
      axr $$0 = axr.a((long)this.cw().hashCode());
      avr<crb> $$1 = this.gx() ? avj.b : avj.a;
      ip<crb> $$2 = kr.an.a($$1);
      return crc.a(crm.wa, $$2.a($$0).get());
   }

   @Override
   protected brp.b<ceb> dQ() {
      return brp.a(ca, bY);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cec.a(this.dQ().a($$0));
   }

   public static bru.a u() {
      return bqq.A().a(brv.q, 10.0).a(brv.r, 0.2F).a(brv.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(brv.c).a(1.0);
         this.gw();
      } else {
         this.f(brv.c).a(2.0);
         this.gv();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aul v() {
      return this.gx() ? aum.kP : aum.kF;
   }

   @Override
   protected aul d(bot $$0) {
      return this.gx() ? aum.kS : aum.kI;
   }

   @Override
   protected aul o_() {
      return this.gx() ? aum.kQ : aum.kG;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.kY, 0.15F, 1.0F);
   }

   protected aul y() {
      return this.gx() ? aum.kU : aum.kK;
   }

   @Nullable
   public ceb b(aps $$0, bpp $$1) {
      ceb $$2 = bqb.X.a((cyx)$$0);
      if ($$2 != null) {
         cec.a($$2, $$0.E_());
         bpp $$3 = (bpp)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof ceb $$4 && $$4.gx() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public brp<ceb> dP() {
      return (brp<ceb>)super.dP();
   }

   @Override
   protected void Y() {
      this.dM().af().a("goatBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("goatActivityUpdate");
      cec.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.aa();
      float $$2 = axk.c(this.aX, $$0);
      float $$3 = axk.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aX + $$3);
   }

   @Override
   public aul d(crj $$0) {
      return this.gx() ? aum.kR : aum.kH;
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.qx) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         crj $$3 = crl.a($$2, $$0, crm.qD.x());
         $$0.a($$1, $$3);
         return boa.a(this.dM().B);
      } else {
         boa $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dM().a(null, this, this.d($$2), aun.g, 1.0F, axk.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      cec.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         aiy<Boolean> $$5 = $$4.h() ? ch : ci;
         this.an.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   @Override
   public bpy e(bqz $$0) {
      return $$0 == bqz.g ? bX.a(this.ea()) : super.e($$0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gx());
      $$0.a("HasLeftHorn", this.gn());
      $$0.a("HasRightHorn", this.gt());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.an.a(ch, $$0.q("HasLeftHorn"));
      this.an.a(ci, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cj = true;
      } else if ($$0 == 59) {
         this.cj = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void n_() {
      if (this.cj) {
         this.ck++;
      } else {
         this.ck -= 2;
      }

      this.ck = axk.a(this.ck, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
      $$0.a(ch, true);
      $$0.a(ci, true);
   }

   public boolean gn() {
      return this.an.a(ch);
   }

   public boolean gt() {
      return this.an.a(ci);
   }

   public boolean gu() {
      boolean $$0 = this.gn();
      boolean $$1 = this.gt();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aiy<Boolean> $$2;
         if (!$$0) {
            $$2 = ci;
         } else if (!$$1) {
            $$2 = ch;
         } else {
            $$2 = this.ag.h() ? ch : ci;
         }

         this.an.a($$2, false);
         esa $$5 = this.dk();
         crj $$6 = this.r();
         double $$7 = (double)axk.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)axk.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)axk.b(this.ag, -0.2F, 0.2F);
         cgd $$10 = new cgd(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dM().b($$10);
         return true;
      }
   }

   public void gv() {
      this.an.a(ch, true);
      this.an.a(ci, true);
   }

   public void gw() {
      this.an.a(ch, false);
      this.an.a(ci, false);
   }

   public boolean gx() {
      return this.an.a(cg);
   }

   public void w(boolean $$0) {
      this.an.a(cg, $$0);
   }

   public float gy() {
      return (float)this.ck / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bqb<? extends ccd> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.bT) && a($$1, $$3);
   }
}
