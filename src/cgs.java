import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgs extends ces {
   public static final bsk ca = bsk.b(0.9F, 1.3F).a(0.7F);
   private static final int ch = 2;
   private static final int ci = 1;
   protected static final ImmutableList<cdn<? extends cdm<? super cgs>>> cb = ImmutableList.of(cdn.c, cdn.d, cdn.b, cdn.o, cdn.f, cdn.r);
   protected static final ImmutableList<ccg<?>> cd = ImmutableList.of(
      ccg.n, ccg.h, ccg.m, ccg.E, ccg.t, ccg.av, ccg.r, ccg.S, ccg.T, ccg.O, ccg.K, ccg.P, new ccg[]{ccg.R, ccg.V, ccg.W, ccg.Z}
   );
   public static final int ce = 10;
   public static final double cf = 0.02;
   public static final double cg = 0.1F;
   private static final ajp<Boolean> cj = ajt.a(cgs.class, ajr.k);
   private static final ajp<Boolean> ck = ajt.a(cgs.class, ajr.k);
   private static final ajp<Boolean> cl = ajt.a(cgs.class, ajr.k);
   private boolean cm;
   private int cn;

   public cgs(bsn<? extends cgs> $$0, dcg $$1) {
      super($$0, $$1);
      this.J().a(true);
      this.a(epa.f, -1.0F);
      this.a(epa.g, -1.0F);
   }

   public cud s() {
      ayo $$0 = ayo.a((long)this.cB().hashCode());
      awm<ctv> $$1 = this.gx() ? awe.b : awe.a;
      jn<ctv> $$2 = lq.ak.a($$1);
      return ctw.a(cug.wh, $$2.a($$0).get());
   }

   @Override
   protected bue.b<cgs> dW() {
      return bue.a(cd, cb);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return cgt.a(this.dW().a($$0));
   }

   public static buj.a t() {
      return bte.A().a(buk.s, 10.0).a(buk.v, 0.2F).a(buk.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.f(buk.c).a(1.0);
         this.gw();
      } else {
         this.f(buk.c).a(2.0);
         this.gv();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected avg v() {
      return this.gx() ? avh.kU : avh.kK;
   }

   @Override
   protected avg d(bra $$0) {
      return this.gx() ? avh.kX : avh.kN;
   }

   @Override
   protected avg n_() {
      return this.gx() ? avh.kV : avh.kL;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.ld, 0.15F, 1.0F);
   }

   protected avg x() {
      return this.gx() ? avh.kZ : avh.kP;
   }

   @Nullable
   public cgs b(aqm $$0, bsb $$1) {
      cgs $$2 = bsn.X.a((dcg)$$0);
      if ($$2 != null) {
         cgt.a($$2, $$0.E_());
         bsb $$3 = (bsb)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cgs $$4 && $$4.gx() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bue<cgs> dV() {
      return (bue<cgs>)super.dV();
   }

   @Override
   protected void Z() {
      this.dR().ag().a("goatBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      this.dR().ag().a("goatActivityUpdate");
      cgt.a(this);
      this.dR().ag().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void o(float $$0) {
      int $$1 = this.ab();
      float $$2 = ayg.c(this.aZ, $$0);
      float $$3 = ayg.a($$2, (float)(-$$1), (float)$$1);
      super.o(this.aZ + $$3);
   }

   @Override
   public avg d(cud $$0) {
      return this.gx() ? avh.kW : avh.kM;
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.ab);
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.qy) && !this.o_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cud $$3 = cuf.a($$2, $$0, cug.qE.w());
         $$0.a($$1, $$3);
         return bqh.a(this.dR().B);
      } else {
         bqh $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dR().a(null, this, this.d($$2), avi.g, 1.0F, ayg.b(this.dR().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      cgt.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.o_() && (double)$$4.i() < 0.1F) {
         ajp<Boolean> $$5 = $$4.h() ? ck : cl;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public bsk e(bto $$0) {
      return $$0 == bto.g ? ca.a(this.ec()) : super.e($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gx());
      $$0.a("HasLeftHorn", this.gn());
      $$0.a("HasRightHorn", this.gt());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.ao.a(ck, $$0.q("HasLeftHorn"));
      this.ao.a(cl, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cm = true;
      } else if ($$0 == 59) {
         this.cm = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void m_() {
      if (this.cm) {
         this.cn++;
      } else {
         this.cn -= 2;
      }

      this.cn = ayg.a(this.cn, 0, 20);
      super.m_();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cj, false);
      $$0.a(ck, true);
      $$0.a(cl, true);
   }

   public boolean gn() {
      return this.ao.a(ck);
   }

   public boolean gt() {
      return this.ao.a(cl);
   }

   public boolean gu() {
      boolean $$0 = this.gn();
      boolean $$1 = this.gt();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajp<Boolean> $$2;
         if (!$$0) {
            $$2 = cl;
         } else if (!$$1) {
            $$2 = ck;
         } else {
            $$2 = this.ah.h() ? ck : cl;
         }

         this.ao.a($$2, false);
         ewh $$5 = this.dp();
         cud $$6 = this.s();
         double $$7 = (double)ayg.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayg.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayg.b(this.ah, -0.2F, 0.2F);
         civ $$10 = new civ(this.dR(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dR().b($$10);
         return true;
      }
   }

   public void gv() {
      this.ao.a(ck, true);
      this.ao.a(cl, true);
   }

   public void gw() {
      this.ao.a(ck, false);
      this.ao.a(cl, false);
   }

   public boolean gx() {
      return this.ao.a(cj);
   }

   public void w(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   public float gy() {
      return (float)this.cn / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsn<? extends ces> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.bZ) && a($$1, $$3);
   }
}
