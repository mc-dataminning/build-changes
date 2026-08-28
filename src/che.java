import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class che extends cfe {
   public static final bsw bY = bsw.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cdz<? extends cdy<? super che>>> bZ = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.o, cdz.f, cdz.r);
   protected static final ImmutableList<ccs<?>> cb = ImmutableList.of(
      ccs.n, ccs.h, ccs.m, ccs.E, ccs.t, ccs.av, ccs.r, ccs.S, ccs.T, ccs.O, ccs.K, ccs.P, new ccs[]{ccs.R, ccs.V, ccs.W, ccs.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akj<Boolean> ch = akn.a(che.class, akl.k);
   private static final akj<Boolean> ci = akn.a(che.class, akl.k);
   private static final akj<Boolean> cj = akn.a(che.class, akl.k);
   private boolean ck;
   private int cl;

   public che(bsz<? extends che> $$0, dbx $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eol.f, -1.0F);
      this.a(eol.g, -1.0F);
   }

   public cuo s() {
      azg $$0 = azg.a((long)this.cz().hashCode());
      axe<cug> $$1 = this.gA() ? aww.b : aww.a;
      jm<cug> $$2 = lp.am.a($$1);
      return cuh.a(cur.we, $$2.a($$0).get());
   }

   @Override
   protected buq.b<che> dT() {
      return buq.a(cb, bZ);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return chf.a(this.dT().a($$0));
   }

   public static buv.a u() {
      return btq.A().a(buw.q, 10.0).a(buw.r, 0.2F).a(buw.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(buw.c).a(1.0);
         this.gz();
      } else {
         this.f(buw.c).a(2.0);
         this.gy();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected avy v() {
      return this.gA() ? avz.kU : avz.kK;
   }

   @Override
   protected avy d(brm $$0) {
      return this.gA() ? avz.kX : avz.kN;
   }

   @Override
   protected avy o_() {
      return this.gA() ? avz.kV : avz.kL;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.ld, 0.15F, 1.0F);
   }

   protected avy y() {
      return this.gA() ? avz.kZ : avz.kP;
   }

   @Nullable
   public che b(are $$0, bsn $$1) {
      che $$2 = bsz.X.a((dbx)$$0);
      if ($$2 != null) {
         chf.a($$2, $$0.E_());
         bsn $$3 = (bsn)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof che $$4 && $$4.gA() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public buq<che> dS() {
      return (buq<che>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("goatBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("goatActivityUpdate");
      chf.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.ab();
      float $$2 = ayy.c(this.aY, $$0);
      float $$3 = ayy.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aY + $$3);
   }

   @Override
   public avy d(cuo $$0) {
      return this.gA() ? avz.kW : avz.kM;
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.ab);
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cuo $$3 = cuq.a($$2, $$0, cur.qE.w());
         $$0.a($$1, $$3);
         return bqt.a(this.dP().B);
      } else {
         bqt $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), awa.g, 1.0F, ayy.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      azg $$4 = $$0.E_();
      chf.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         akj<Boolean> $$5 = $$4.h() ? ci : cj;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public bsw e(bua $$0) {
      return $$0 == bua.g ? bY.a(this.ed()) : super.e($$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gA());
      $$0.a("HasLeftHorn", this.gq());
      $$0.a("HasRightHorn", this.gw());
   }

   @Override
   public void a(ur $$0) {
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

      this.cl = ayy.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gq() {
      return this.ao.a(ci);
   }

   public boolean gw() {
      return this.ao.a(cj);
   }

   public boolean gx() {
      boolean $$0 = this.gq();
      boolean $$1 = this.gw();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akj<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ah.h() ? ci : cj;
         }

         this.ao.a($$2, false);
         evq $$5 = this.dn();
         cuo $$6 = this.s();
         double $$7 = (double)ayy.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayy.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayy.b(this.ah, -0.2F, 0.2F);
         cjg $$10 = new cjg(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dP().b($$10);
         return true;
      }
   }

   public void gy() {
      this.ao.a(ci, true);
      this.ao.a(cj, true);
   }

   public void gz() {
      this.ao.a(ci, false);
      this.ao.a(cj, false);
   }

   public boolean gA() {
      return this.ao.a(ch);
   }

   public void w(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   public float gB() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bsz<? extends cfe> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.a_($$3.d()).a(awo.bZ) && a($$1, $$3);
   }
}
