import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cjo extends cho {
   public static final bve bZ = bve.b(0.9F, 1.3F).a(0.7F);
   private static final int cg = 2;
   private static final int ch = 1;
   protected static final ImmutableList<cgi<? extends cgh<? super cjo>>> ca = ImmutableList.of(cgi.c, cgi.d, cgi.b, cgi.o, cgi.f, cgi.r);
   protected static final ImmutableList<cfb<?>> cb = ImmutableList.of(
      cfb.n, cfb.h, cfb.m, cfb.E, cfb.t, cfb.av, cfb.r, cfb.S, cfb.T, cfb.O, cfb.K, cfb.P, new cfb[]{cfb.R, cfb.V, cfb.W, cfb.Z}
   );
   public static final int cd = 10;
   public static final double ce = 0.02;
   public static final double cf = 0.1F;
   private static final aks<Boolean> ci = akw.a(cjo.class, aku.k);
   private static final aks<Boolean> cj = akw.a(cjo.class, aku.k);
   private static final aks<Boolean> ck = akw.a(cjo.class, aku.k);
   private boolean cl;
   private int cm;

   public cjo(bvi<? extends cjo> $$0, dgz $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(euh.f, -1.0F);
      this.a(euh.g, -1.0F);
   }

   public cxg p() {
      bac $$0 = bac.a((long)this.cG().hashCode());
      aya<cwz> $$1 = this.gA() ? axs.b : axs.a;
      return this.dW().K_().e(mb.I).a($$1, $$0).map($$0x -> cxa.a(cxk.xi, $$0x)).orElseGet(() -> new cxg(cxk.xi));
   }

   @Override
   protected bwz.b<cjo> ed() {
      return bwz.a(cb, ca);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cjp.a(this.ed().a($$0));
   }

   public static bxe.a t() {
      return cho.gt().a(bxf.s, 10.0).a(bxf.v, 0.2F).a(bxf.c, 2.0);
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.g(bxf.c).a(1.0);
         this.gs();
      } else {
         this.g(bxf.c).a(2.0);
         this.gr();
      }
   }

   @Override
   protected int f(float $$0, float $$1) {
      return super.f($$0, $$1) - 10;
   }

   @Override
   protected awu u() {
      return this.gA() ? awv.lt : awv.lk;
   }

   @Override
   protected awu e(btr $$0) {
      return this.gA() ? awv.lw : awv.ln;
   }

   @Override
   protected awu o_() {
      return this.gA() ? awv.lu : awv.ll;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.lB, 0.15F, 1.0F);
   }

   protected awu x() {
      return this.gA() ? awv.ly : awv.lp;
   }

   @Nullable
   public cjo b(arx $$0, bus $$1) {
      cjo $$2 = bvi.ai.a($$0, bvh.e);
      if ($$2 != null) {
         cjp.a($$2, $$0.H_());
         bus $$3 = (bus)($$0.H_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cjo $$4 && $$4.gA() || $$0.H_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bwz<cjo> ec() {
      return (bwz<cjo>)super.ec();
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("goatBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      cjp.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.aa();
      float $$2 = azu.c(this.aX, $$0);
      float $$3 = azu.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aX + $$3);
   }

   @Override
   protected void gu() {
      this.dW().a(null, this, this.gA() ? awv.lv : awv.lm, aww.g, 1.0F, azu.b(this.dW().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.ag);
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.a(cxk.rf) && !this.e_()) {
         $$0.a(this.x(), 1.0F, 1.0F);
         cxg $$3 = cxj.a($$2, $$0, cxk.rl.n());
         $$0.a($$1, $$3);
         return bta.a;
      } else {
         bta $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gu();
         }

         return $$4;
      }
   }

   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bac $$4 = $$0.H_();
      cjp.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.i();
      if (!this.e_() && (double)$$4.i() < 0.1F) {
         aks<Boolean> $$5 = $$4.h() ? cj : ck;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   public bve e(bwj $$0) {
      return $$0 == bwj.g ? bZ.a(this.ej()) : super.e($$0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gA());
      $$0.a("HasLeftHorn", this.go());
      $$0.a("HasRightHorn", this.gp());
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.al.a(cj, $$0.q("HasLeftHorn"));
      this.al.a(ck, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cl = true;
      } else if ($$0 == 59) {
         this.cl = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void d_() {
      if (this.cl) {
         this.cm++;
      } else {
         this.cm -= 2;
      }

      this.cm = azu.a(this.cm, 0, 20);
      super.d_();
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ci, false);
      $$0.a(cj, true);
      $$0.a(ck, true);
   }

   public boolean go() {
      return this.al.a(cj);
   }

   public boolean gp() {
      return this.al.a(ck);
   }

   public boolean gq() {
      boolean $$0 = this.go();
      boolean $$1 = this.gp();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aks<Boolean> $$2;
         if (!$$0) {
            $$2 = ck;
         } else if (!$$1) {
            $$2 = cj;
         } else {
            $$2 = this.ae.h() ? cj : ck;
         }

         this.al.a($$2, false);
         fbr $$5 = this.du();
         cxg $$6 = this.p();
         double $$7 = (double)azu.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azu.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azu.b(this.ae, -0.2F, 0.2F);
         cls $$10 = new cls(this.dW(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dW().b($$10);
         return true;
      }
   }

   public void gr() {
      this.al.a(cj, true);
      this.al.a(ck, true);
   }

   public void gs() {
      this.al.a(cj, false);
      this.al.a(ck, false);
   }

   public boolean gA() {
      return this.al.a(ci);
   }

   public void x(boolean $$0) {
      this.al.a(ci, $$0);
   }

   public float gB() {
      return (float)this.cm / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bvi<? extends cho> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.a_($$3.e()).a(axk.cb) && a($$1, $$3);
   }
}
