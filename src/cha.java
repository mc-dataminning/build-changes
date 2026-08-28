import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cha extends cfa {
   public static final bss bY = bss.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cdv<? extends cdu<? super cha>>> bZ = ImmutableList.of(cdv.c, cdv.d, cdv.b, cdv.o, cdv.f, cdv.r);
   protected static final ImmutableList<cco<?>> cb = ImmutableList.of(
      cco.n, cco.h, cco.m, cco.E, cco.t, cco.av, cco.r, cco.S, cco.T, cco.O, cco.K, cco.P, new cco[]{cco.R, cco.V, cco.W, cco.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akg<Boolean> ch = akk.a(cha.class, aki.k);
   private static final akg<Boolean> ci = akk.a(cha.class, aki.k);
   private static final akg<Boolean> cj = akk.a(cha.class, aki.k);
   private boolean ck;
   private int cl;

   public cha(bsv<? extends cha> $$0, dbt $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(eoh.f, -1.0F);
      this.a(eoh.g, -1.0F);
   }

   public cuk s() {
      azc $$0 = azc.a((long)this.cz().hashCode());
      axb<cuc> $$1 = this.gA() ? awt.b : awt.a;
      jm<cuc> $$2 = lp.am.a($$1);
      return cud.a(cun.we, $$2.a($$0).get());
   }

   @Override
   protected bum.b<cha> dT() {
      return bum.a(cb, bZ);
   }

   @Override
   protected bum<?> a(Dynamic<?> $$0) {
      return chb.a(this.dT().a($$0));
   }

   public static bur.a u() {
      return btm.A().a(bus.q, 10.0).a(bus.r, 0.2F).a(bus.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(bus.c).a(1.0);
         this.gz();
      } else {
         this.f(bus.c).a(2.0);
         this.gy();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected avv v() {
      return this.gA() ? avw.kU : avw.kK;
   }

   @Override
   protected avv d(bri $$0) {
      return this.gA() ? avw.kX : avw.kN;
   }

   @Override
   protected avv o_() {
      return this.gA() ? avw.kV : avw.kL;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.ld, 0.15F, 1.0F);
   }

   protected avv y() {
      return this.gA() ? avw.kZ : avw.kP;
   }

   @Nullable
   public cha b(arb $$0, bsj $$1) {
      cha $$2 = bsv.X.a((dbt)$$0);
      if ($$2 != null) {
         chb.a($$2, $$0.E_());
         bsj $$3 = (bsj)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cha $$4 && $$4.gA() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bum<cha> dS() {
      return (bum<cha>)super.dS();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("goatBrain");
      this.dS().a((arb)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("goatActivityUpdate");
      chb.a(this);
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
      float $$2 = ayu.c(this.aY, $$0);
      float $$3 = ayu.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aY + $$3);
   }

   @Override
   public avv d(cuk $$0) {
      return this.gA() ? avw.kW : avw.kM;
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.ab);
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ($$2.a(cun.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cuk $$3 = cum.a($$2, $$0, cun.qE.w());
         $$0.a($$1, $$3);
         return bqp.a(this.dP().B);
      } else {
         bqp $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), avx.g, 1.0F, ayu.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      azc $$4 = $$0.E_();
      chb.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         akg<Boolean> $$5 = $$4.h() ? ci : cj;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      agp.a(this);
   }

   @Override
   public bss e(btw $$0) {
      return $$0 == btw.g ? bY.a(this.ed()) : super.e($$0);
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

      this.cl = ayu.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(akk.a $$0) {
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
         akg<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ah.h() ? ci : cj;
         }

         this.ao.a($$2, false);
         evm $$5 = this.dn();
         cuk $$6 = this.s();
         double $$7 = (double)ayu.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayu.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayu.b(this.ah, -0.2F, 0.2F);
         cjc $$10 = new cjc(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bsv<? extends cfa> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.bZ) && a($$1, $$3);
   }
}
