import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cge extends cee {
   public static final brx bY = brx.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<ccz<? extends ccy<? super cge>>> bZ = ImmutableList.of(ccz.c, ccz.d, ccz.b, ccz.o, ccz.f, ccz.r);
   protected static final ImmutableList<cbs<?>> cb = ImmutableList.of(
      cbs.n, cbs.h, cbs.m, cbs.E, cbs.t, cbs.av, cbs.r, cbs.S, cbs.T, cbs.O, cbs.K, cbs.P, new cbs[]{cbs.R, cbs.V, cbs.W, cbs.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final ajr<Boolean> ch = ajv.a(cge.class, ajt.k);
   private static final ajr<Boolean> ci = ajv.a(cge.class, ajt.k);
   private static final ajr<Boolean> cj = ajv.a(cge.class, ajt.k);
   private boolean ck;
   private int cl;

   public cge(bsa<? extends cge> $$0, dax $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(enl.f, -1.0F);
      this.a(enl.g, -1.0F);
   }

   public cto s() {
      ayk $$0 = ayk.a((long)this.cz().hashCode());
      awl<ctg> $$1 = this.gz() ? awd.b : awd.a;
      jb<ctg> $$2 = le.am.a($$1);
      return cth.a(ctr.we, $$2.a($$0).get());
   }

   @Override
   protected btq.b<cge> dT() {
      return btq.a(cb, bZ);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cgf.a(this.dT().a($$0));
   }

   public static btv.a u() {
      return bsq.A().a(btw.q, 10.0).a(btw.r, 0.2F).a(btw.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(btw.c).a(1.0);
         this.gy();
      } else {
         this.f(btw.c).a(2.0);
         this.gx();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected avg v() {
      return this.gz() ? avh.kU : avh.kK;
   }

   @Override
   protected avg d(bqn $$0) {
      return this.gz() ? avh.kX : avh.kN;
   }

   @Override
   protected avg o_() {
      return this.gz() ? avh.kV : avh.kL;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.ld, 0.15F, 1.0F);
   }

   protected avg y() {
      return this.gz() ? avh.kZ : avh.kP;
   }

   @Nullable
   public cge b(aqm $$0, bro $$1) {
      cge $$2 = bsa.X.a((dax)$$0);
      if ($$2 != null) {
         cgf.a($$2, $$0.E_());
         bro $$3 = (bro)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cge $$4 && $$4.gz() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public btq<cge> dS() {
      return (btq<cge>)super.dS();
   }

   @Override
   protected void Y() {
      this.dP().af().a("goatBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("goatActivityUpdate");
      cgf.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.aa();
      float $$2 = ayd.c(this.aZ, $$0);
      float $$3 = ayd.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aZ + $$3);
   }

   @Override
   public avg d(cto $$0) {
      return this.gz() ? avh.kW : avh.kM;
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.ab);
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(ctr.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cto $$3 = ctq.a($$2, $$0, ctr.qE.v());
         $$0.a($$1, $$3);
         return bpu.a(this.dP().B);
      } else {
         bpu $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), avi.g, 1.0F, ayd.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
      cgf.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         ajr<Boolean> $$5 = $$4.h() ? ci : cj;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   @Override
   public brx e(bta $$0) {
      return $$0 == bta.g ? bY.a(this.ed()) : super.e($$0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gz());
      $$0.a("HasLeftHorn", this.gp());
      $$0.a("HasRightHorn", this.gv());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.ao.a(ci, $$0.q("HasLeftHorn"));
      this.ao.a(cj, $$0.q("HasRightHorn"));
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
   public void n_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = ayd.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gp() {
      return this.ao.a(ci);
   }

   public boolean gv() {
      return this.ao.a(cj);
   }

   public boolean gw() {
      boolean $$0 = this.gp();
      boolean $$1 = this.gv();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ajr<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ah.h() ? ci : cj;
         }

         this.ao.a($$2, false);
         euk $$5 = this.dn();
         cto $$6 = this.s();
         double $$7 = (double)ayd.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayd.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayd.b(this.ah, -0.2F, 0.2F);
         cig $$10 = new cig(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dP().b($$10);
         return true;
      }
   }

   public void gx() {
      this.ao.a(ci, true);
      this.ao.a(cj, true);
   }

   public void gy() {
      this.ao.a(ci, false);
      this.ao.a(cj, false);
   }

   public boolean gz() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   public float gA() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsa<? extends cee> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.bZ) && a($$1, $$3);
   }
}
