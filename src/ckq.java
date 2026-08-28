import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class ckq extends cfe implements btj, bue {
   private static final akr ca = akr.b("suffocating");
   private static final buu cb = new buu(ca, -0.34F, buu.a.b);
   private static final float cc = 0.35F;
   private static final float ce = 0.55F;
   private static final ajw<Integer> cf = aka.a(ckq.class, ajy.b);
   private static final ajw<Boolean> cg = aka.a(ckq.class, ajy.k);
   private static final ajw<Boolean> ch = aka.a(ckq.class, ajy.k);
   private final bti ci = new bti(this.ao, cf, ch);
   @Nullable
   private cbu cj;

   public ckq(bsx<? extends ckq> $$0, dcw $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(ept.j, -1.0F);
      this.a(ept.i, 0.0F);
      this.a(ept.n, 0.0F);
      this.a(ept.o, 0.0F);
   }

   public static boolean c(bsx<ckq> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      jd.a $$5 = $$3.k();

      do {
         $$5.c(ji.b);
      } while ($$1.b_($$5).a(awk.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajw<?> $$0) {
      if (cf.equals($$0) && this.dP().B) {
         this.ci.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cf, 0);
      $$0.a(cg, false);
      $$0.a(ch, false);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      this.ci.a($$0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.ci.b($$0);
   }

   @Override
   public boolean i() {
      return this.ci.d();
   }

   @Override
   public boolean f() {
      return this.bE() && !this.o_();
   }

   @Override
   public void a(cuq $$0, @Nullable avq $$1) {
      this.ci.a(true);
      if ($$1 != null) {
         this.dP().a(null, this, avp.ye, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bU.a(1, new cbf(this, 1.65));
      this.bU.a(2, new bzy(this, 1.0));
      this.cj = new cbu(this, 1.4, $$0 -> $$0.a(awn.au), false);
      this.bU.a(3, this.cj);
      this.bU.a(4, new ckq.a(this, 1.0));
      this.bU.a(5, new cal(this, 1.0));
      this.bU.a(7, new cbj(this, 1.0, 60));
      this.bU.a(8, new cau(this, cmx.class, 8.0F));
      this.bU.a(8, new cbh(this));
      this.bU.a(9, new cau(this, ckq.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(cg, $$0);
      bus $$1 = this.f(buw.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(cb);
         } else {
            $$1.c(ca);
         }
      }
   }

   public boolean s() {
      return this.ao.a(cg);
   }

   @Override
   public boolean a(epc $$0) {
      return $$0.a(awk.b);
   }

   @Override
   protected exa a(bsr $$0, bsu $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayo.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dcz $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btn cR() {
      return (btn)(this.i() && this.cU() instanceof cmx $$0 && $$0.b(cut.nS) ? $$0 : super.cR());
   }

   @Override
   public exa b(btn $$0) {
      exa[] $$1 = new exa[]{
         a((double)this.dk(), (double)$$0.dk(), $$0.dF()),
         a((double)this.dk(), (double)$$0.dk(), $$0.dF() - 22.5F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dF() + 22.5F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dF() - 45.0F),
         a((double)this.dk(), (double)$$0.dk(), $$0.dF() + 45.0F)
      };
      Set<jd> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cL().e;
      double $$4 = this.cL().b - 0.5;
      jd.a $$5 = new jd.a();

      for (exa $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(ji.a);
         }
      }

      for (jd $$8 : $$2) {
         if (!this.dP().b_($$8).a(awk.b)) {
            double $$9 = this.dP().j($$8);
            if (coy.a($$9)) {
               exa $$10 = exa.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fF().iterator();

               while (var14.hasNext()) {
                  bua $$11 = (bua)var14.next();
                  ewv $$12 = $$0.f($$11);
                  if (coy.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new exa(this.du(), this.cL().e, this.dA());
   }

   @Override
   protected void a(cmx $$0, exa $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.ci.b();
      super.a($$0, $$1);
   }

   @Override
   protected exa b(cmx $$0, exa $$1) {
      return new exa(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmx $$0) {
      return (float)(this.g(buw.v) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.ci.c());
   }

   @Override
   protected float aP() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(this.bt() ? avp.yc : avp.yb, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ci.a(this.dS());
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
      this.aT();
      if (this.bt()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.x() && this.ah.a(140) == 0) {
         this.b(avp.xX);
      } else if (this.gi() && this.ah.a(60) == 0) {
         this.b(avp.xY);
      }

      if (!this.ga()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dtc $$0 = this.dP().a_(this.dp());
            dtc $$1 = this.bp();
            $$2 = $$0.a(awe.aU) || $$1.a(awe.aU) || this.b(awk.b) > 0.0;
            if (this.dd() instanceof ckq $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gl();
      this.aT();
   }

   private boolean x() {
      return this.cj != null && this.cj.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gl() {
      if (this.bt()) {
         exf $$0 = exf.a(this);
         if ($$0.a(dko.d, this.dp(), true) && !this.dP().b_(this.dp().d()).a(awk.b)) {
            this.d(true);
         } else {
            this.i(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static buv.a t() {
      return btp.C().a(buw.v, 0.175F).a(buw.m, 16.0);
   }

   @Override
   protected avo v() {
      return !this.gi() && !this.x() ? avp.xW : null;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.ya;
   }

   @Override
   protected avo n_() {
      return avp.xZ;
   }

   @Override
   protected boolean r(bsr $$0) {
      return !this.bT() && !this.a(awk.b);
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   protected cda b(dcw $$0) {
      return new ckq.b(this, $$0);
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      if ($$1.a_($$0).u().a(awk.b)) {
         return 10.0F;
      } else {
         return this.bt() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public ckq b(aqu $$0, bsl $$1) {
      return bsx.aZ.a((dcw)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.at);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(cut.nL);
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bT() && !$$0.fO()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqr.a(this.dP().B);
      } else {
         bqr $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuq $$4 = $$0.b($$1);
            return $$4.a(cut.nL) ? $$4.a($$0, this, $$1) : bqr.e;
         } else {
            if ($$2 && !this.aX()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), avp.yd, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public exa cN() {
      return new exa(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         ayw $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            btp $$5 = bsx.bx.a((dcw)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new ckw.b(ckw.a($$4), false));
               $$5.a(bsy.a, new cuq(cut.nS));
               this.a(new cuq(cut.nL), null);
            }
         } else if ($$4.a(10) == 0) {
            bsl $$6 = bsx.aZ.a((dcw)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bsl.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private buh a(ddl $$0, bqp $$1, btp $$2, @Nullable buh $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, btr.g, $$3);
      $$2.a(this, true);
      return new bsl.a(0.0F);
   }

   static class a extends caz {
      private final ckq g;

      a(ckq $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jd k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bt() && this.a(this.g.dP(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bt() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dcz $$0, jd $$1) {
         return $$0.a_($$1).a(dga.H) && $$0.a_($$1.d()).a(epr.a);
      }
   }

   static class b extends ccz {
      b(ckq $$0, dcw $$1) {
         super($$0, $$1);
      }

      @Override
      protected eps a(int $$0) {
         this.o = new epy();
         this.o.a(true);
         return new eps(this.o, $$0);
      }

      @Override
      protected boolean a(ept $$0) {
         return $$0 != ept.i && $$0 != ept.o && $$0 != ept.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jd $$0) {
         return this.b.a_($$0).a(dga.H) || super.a($$0);
      }
   }
}
