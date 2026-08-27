import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgg extends ceg {
   public static final brz bY = brz.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cdb<? extends cda<? super cgg>>> bZ = ImmutableList.of(cdb.c, cdb.d, cdb.b, cdb.o, cdb.f, cdb.r);
   protected static final ImmutableList<cbu<?>> cb = ImmutableList.of(
      cbu.n, cbu.h, cbu.m, cbu.E, cbu.t, cbu.av, cbu.r, cbu.S, cbu.T, cbu.O, cbu.K, cbu.P, new cbu[]{cbu.R, cbu.V, cbu.W, cbu.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final ajs<Boolean> ch = ajw.a(cgg.class, aju.k);
   private static final ajs<Boolean> ci = ajw.a(cgg.class, aju.k);
   private static final ajs<Boolean> cj = ajw.a(cgg.class, aju.k);
   private boolean ck;
   private int cl;

   public cgg(bsc<? extends cgg> $$0, daz $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(enn.f, -1.0F);
      this.a(enn.g, -1.0F);
   }

   public ctq s() {
      aym $$0 = aym.a((long)this.cz().hashCode());
      awm<cti> $$1 = this.gz() ? awe.b : awe.a;
      jb<cti> $$2 = le.am.a($$1);
      return ctj.a(ctt.we, $$2.a($$0).get());
   }

   @Override
   protected bts.b<cgg> dT() {
      return bts.a(cb, bZ);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cgh.a(this.dT().a($$0));
   }

   public static btx.a u() {
      return bss.A().a(bty.q, 10.0).a(bty.r, 0.2F).a(bty.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(bty.c).a(1.0);
         this.gy();
      } else {
         this.f(bty.c).a(2.0);
         this.gx();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected avh v() {
      return this.gz() ? avi.kU : avi.kK;
   }

   @Override
   protected avh d(bqp $$0) {
      return this.gz() ? avi.kX : avi.kN;
   }

   @Override
   protected avh o_() {
      return this.gz() ? avi.kV : avi.kL;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.ld, 0.15F, 1.0F);
   }

   protected avh y() {
      return this.gz() ? avi.kZ : avi.kP;
   }

   @Nullable
   public cgg b(aqn $$0, brq $$1) {
      cgg $$2 = bsc.X.a((daz)$$0);
      if ($$2 != null) {
         cgh.a($$2, $$0.E_());
         brq $$3 = (brq)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cgg $$4 && $$4.gz() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bts<cgg> dS() {
      return (bts<cgg>)super.dS();
   }

   @Override
   protected void Y() {
      this.dP().af().a("goatBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("goatActivityUpdate");
      cgh.a(this);
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
      float $$2 = ayf.c(this.aY, $$0);
      float $$3 = ayf.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aY + $$3);
   }

   @Override
   public avh d(ctq $$0) {
      return this.gz() ? avi.kW : avi.kM;
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.ab);
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.qy) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         ctq $$3 = cts.a($$2, $$0, ctt.qE.w());
         $$0.a($$1, $$3);
         return bpw.a(this.dP().B);
      } else {
         bpw $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dP().a(null, this, this.d($$2), avj.g, 1.0F, ayf.b(this.dP().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      cgh.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         ajs<Boolean> $$5 = $$4.h() ? ci : cj;
         this.ao.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   @Override
   public brz e(btc $$0) {
      return $$0 == btc.g ? bY.a(this.ed()) : super.e($$0);
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

      this.cl = ayf.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ajw.a $$0) {
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
         ajs<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ah.h() ? ci : cj;
         }

         this.ao.a($$2, false);
         eum $$5 = this.dn();
         ctq $$6 = this.s();
         double $$7 = (double)ayf.b(this.ah, -0.2F, 0.2F);
         double $$8 = (double)ayf.b(this.ah, 0.3F, 0.7F);
         double $$9 = (double)ayf.b(this.ah, -0.2F, 0.2F);
         cii $$10 = new cii(this.dP(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bsc<? extends ceg> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.bZ) && a($$1, $$3);
   }
}
