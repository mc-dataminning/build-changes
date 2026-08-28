import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgr extends cer {
   public static final bsj ca = bsj.b(0.9F, 1.3F).a(0.7F);
   private static final int ch = 2;
   private static final int ci = 1;
   protected static final ImmutableList<cdm<? extends cdl<? super cgr>>> cb = ImmutableList.of(cdm.c, cdm.d, cdm.b, cdm.o, cdm.f, cdm.r);
   protected static final ImmutableList<ccf<?>> cd = ImmutableList.of(
      ccf.n, ccf.h, ccf.m, ccf.E, ccf.t, ccf.av, ccf.r, ccf.S, ccf.T, ccf.O, ccf.K, ccf.P, new ccf[]{ccf.R, ccf.V, ccf.W, ccf.Z}
   );
   public static final int ce = 10;
   public static final double cf = 0.02;
   public static final double cg = 0.1F;
   private static final ajp<Boolean> cj = ajt.a(cgr.class, ajr.k);
   private static final ajp<Boolean> ck = ajt.a(cgr.class, ajr.k);
   private static final ajp<Boolean> cl = ajt.a(cgr.class, ajr.k);
   private boolean cm;
   private int cn;

   public cgr(bsm<? extends cgr> $$0, dcf $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eoy.f, -1.0F);
      this.a(eoy.g, -1.0F);
   }

   public cuc s() {
      ayo $$0 = ayo.a((long)this.cA().hashCode());
      awm<ctu> $$1 = this.gy() ? awe.b : awe.a;
      jn<ctu> $$2 = lq.ak.a($$1);
      return ctv.a(cuf.wh, $$2.a($$0).get());
   }

   @Override
   protected bud.b<cgr> dV() {
      return bud.a(cd, cb);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return cgs.a(this.dV().a($$0));
   }

   public static bui.a u() {
      return btd.A().a(buj.s, 10.0).a(buj.v, 0.2F).a(buj.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(buj.c).a(1.0);
         this.gx();
      } else {
         this.f(buj.c).a(2.0);
         this.gw();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected avg v() {
      return this.gy() ? avh.kU : avh.kK;
   }

   @Override
   protected avg d(bqz $$0) {
      return this.gy() ? avh.kX : avh.kN;
   }

   @Override
   protected avg o_() {
      return this.gy() ? avh.kV : avh.kL;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.ld, 0.15F, 1.0F);
   }

   protected avg y() {
      return this.gy() ? avh.kZ : avh.kP;
   }

   @Nullable
   public cgr b(aqm $$0, bsa $$1) {
      cgr $$2 = bsm.X.a((dcf)$$0);
      if ($$2 != null) {
         cgs.a($$2, $$0.E_());
         bsa $$3 = (bsa)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cgr $$4 && $$4.gy() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bud<cgr> dU() {
      return (bud<cgr>)super.dU();
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("goatBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      this.dQ().ag().a("goatActivityUpdate");
      cgs.a(this);
      this.dQ().ag().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void o(float $$0) {
      int $$1 = this.ab();
      float $$2 = ayg.c(this.aY, $$0);
      float $$3 = ayg.a($$2, (float)(-$$1), (float)$$1);
      super.o(this.aY + $$3);
   }

   @Override
   public avg d(cuc $$0) {
      return this.gy() ? avh.kW : avh.kM;
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.ab);
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cuc $$3 = cue.a($$2, $$0, cuf.qE.w());
         $$0.a($$1, $$3);
         return bqg.a(this.dQ().B);
      } else {
         bqg $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dQ().a(null, this, this.d($$2), avi.g, 1.0F, ayg.b(this.dQ().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      cgs.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
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
   public bsj e(btn $$0) {
      return $$0 == btn.g ? ca.a(this.eb()) : super.e($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gy());
      $$0.a("HasLeftHorn", this.go());
      $$0.a("HasRightHorn", this.gu());
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
   public void n_() {
      if (this.cm) {
         this.cn++;
      } else {
         this.cn -= 2;
      }

      this.cn = ayg.a(this.cn, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cj, false);
      $$0.a(ck, true);
      $$0.a(cl, true);
   }

   public boolean go() {
      return this.ao.a(ck);
   }

   public boolean gu() {
      return this.ao.a(cl);
   }

   public boolean gv() {
      boolean $$0 = this.go();
      boolean $$1 = this.gu();
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
         ewf $$5 = this.do();
         cuc $$6 = this.s();
         double $$7 = (double)ayg.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayg.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayg.b(this.ah, -0.2F, 0.2F);
         ciu $$10 = new ciu(this.dQ(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dQ().b($$10);
         return true;
      }
   }

   public void gw() {
      this.ao.a(ck, true);
      this.ao.a(cl, true);
   }

   public void gx() {
      this.ao.a(ck, false);
      this.ao.a(cl, false);
   }

   public boolean gy() {
      return this.ao.a(cj);
   }

   public void w(boolean $$0) {
      this.ao.a(cj, $$0);
   }

   public float gz() {
      return (float)this.cn / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsm<? extends cer> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return $$1.a_($$3.d()).a(avw.bZ) && a($$1, $$3);
   }
}
