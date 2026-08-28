import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckd extends cjz implements bxf<ckd.d>, cna {
   private static final int bZ = 5;
   private static final alc<Integer> ca = alg.a(ckd.class, ale.b);
   private static final alc<Integer> cb = alg.a(ckd.class, ale.b);
   private static final bvm cd = bvq.ay.n().a(bvl.a().a(bvk.a, 0.0F, bvq.ay.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private ckd cf;
   @Nullable
   private ckd cg;

   public ckd(bvq<? extends ckd> $$0, dhh $$1) {
      super($$0, $$1);
      this.L().a(40.0F);
   }

   public boolean gp() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(ca, Math.max(1, Math.min(5, $$0)));
   }

   private void b(bam $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gq() {
      return this.al.a(ca);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz().g);
      $$0.a("Strength", this.gq());
   }

   @Override
   public void a(ux $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(ckd.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new ceh(this, 1.2));
      this.bT.a(2, new cdk(this, 2.1F));
      this.bT.a(3, new cec(this, 1.25, 40, 20.0F));
      this.bT.a(3, new cdw(this, 1.2));
      this.bT.a(4, new ccp(this, 1.0));
      this.bT.a(5, new cel(this, 1.25, $$0 -> $$0.a(ayd.at), false));
      this.bT.a(6, new cdc(this, 1.0));
      this.bT.a(7, new ceq(this, 0.7));
      this.bT.a(8, new cdl(this, cpw.class, 6.0F));
      this.bT.a(9, new cdy(this));
      this.bU.a(1, new ckd.c(this));
      this.bU.a(2, new ckd.a(this));
   }

   public static bxm.a gy() {
      return p();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cb, 0);
   }

   public ckd.d gz() {
      return ckd.d.a(this.al.a(cb));
   }

   public void a(ckd.d $$0) {
      this.al.a(cb, $$0.g);
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.as);
   }

   @Override
   protected boolean a(cpw $$0, cxo $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cxs.pS)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dkn.iA.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gD() && this.Z_() == 0 && this.gt()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eD() < this.eR() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.e_() && $$2 > 0) {
         this.dV().a(ls.O, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gD()) && this.gJ() < this.gP()) {
         $$5 = true;
         if (!this.dV().C) {
            this.u($$3);
         }
      }

      if ($$5 && !this.bb()) {
         axe $$6 = this.go();
         if ($$6 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), this.go(), this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fg() {
      return this.eE() || this.gG();
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bam $$4 = $$0.H_();
      this.b($$4);
      ckd.d $$5;
      if ($$3 instanceof ckd.b) {
         $$5 = ((ckd.b)$$3).a;
      } else {
         $$5 = ae.a(ckd.d.values(), $$4);
         $$3 = new ckd.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   protected axe gN() {
      return axf.or;
   }

   @Override
   protected axe u() {
      return axf.oq;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.ov;
   }

   @Override
   protected axe o_() {
      return axf.ot;
   }

   @Nullable
   @Override
   protected axe go() {
      return axf.ou;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.ox, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(axf.os, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? this.gq() : 0;
   }

   @Override
   public boolean e(bvr $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gP() {
      return 30;
   }

   @Override
   public boolean a(chw $$0) {
      return $$0 != this && $$0 instanceof ckd && this.gV() && ((ckd)$$0).gV();
   }

   @Nullable
   public ckd b(ash $$0, bva $$1) {
      ckd $$2 = this.gA();
      if ($$2 != null) {
         this.a($$1, $$2);
         ckd $$3 = (ckd)$$1;
         int $$4 = this.ae.a(Math.max(this.gq(), $$3.gq())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gz() : $$3.gz());
      }

      return $$2;
   }

   @Nullable
   protected ckd gA() {
      return bvq.ay.a(this.dV(), bvp.e);
   }

   private void k(bwf $$0) {
      cqo $$1 = new cqo(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ash $$6) {
         cqp.a($$1, $$6, cxo.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.ow, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.ce = true;
   }

   void E(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, btz $$2) {
      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (bvj $$4 : this.dd()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eN();
         return true;
      }
   }

   public void gB() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(ckd $$0) {
      this.cf = $$0;
      this.cf.cg = this;
   }

   public boolean gC() {
      return this.cg != null;
   }

   public boolean gY() {
      return this.cf != null;
   }

   @Nullable
   public ckd gZ() {
      return this.cf;
   }

   @Override
   protected double gl() {
      return 2.0;
   }

   @Override
   protected void g(ash $$0) {
      if (!this.gY() && this.e_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gQ() {
      return false;
   }

   @Override
   public void a(bwf $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fbx cT() {
      return new fbx(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? cd : super.e($$0);
   }

   @Override
   protected fbx a(bvj $$0, bvm $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cew<ciz> {
      public a(ckd $$0) {
         super($$0, ciz.class, 16, false, true, ($$0x, $$1) -> !((ciz)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bva.a {
      public final ckd.d a;

      b(ckd.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cev {
      public c(ckd $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof ckd $$0 && $$0.ce) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bba {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<ckd.d> e = bba.a(ckd.d::values);
      private static final IntFunction<ckd.d> f = ayv.a(ckd.d::a, values(), ayv.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static ckd.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
