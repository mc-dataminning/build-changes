import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cli extends cfv implements buc, buu {
   private static final alb bZ = alb.b("suffocating");
   private static final bvk ca = new bvk(bZ, -0.34F, bvk.a.b);
   private static final float cb = 0.35F;
   private static final float cd = 0.55F;
   private static final akg<Integer> ce = akk.a(cli.class, aki.b);
   private static final akg<Boolean> cf = akk.a(cli.class, aki.k);
   private static final akg<Boolean> cg = akk.a(cli.class, aki.k);
   private final bub ch = new bub(this.am, ce, cg);
   @Nullable
   private cck ci;

   public cli(btq<? extends cli> $$0, dds $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(eqs.j, -1.0F);
      this.a(eqs.i, 0.0F);
      this.a(eqs.n, 0.0F);
      this.a(eqs.o, 0.0F);
   }

   public static boolean c(btq<cli> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      je.a $$5 = $$3.k();

      do {
         $$5.c(jj.b);
      } while ($$1.b_($$5).a(awy.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akg<?> $$0) {
      if (ce.equals($$0) && this.dS().B) {
         this.ch.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.ch.a($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.ch.b($$0);
   }

   @Override
   public boolean i() {
      return this.ch.d();
   }

   @Override
   public boolean f() {
      return this.bI() && !this.o_();
   }

   @Override
   public void a(cvl $$0, @Nullable awe $$1) {
      this.ch.a(true);
      if ($$1 != null) {
         this.dS().a(null, this, awd.yk, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   protected void D() {
      this.bT.a(1, new cbv(this, 1.65));
      this.bT.a(2, new cao(this, 1.0));
      this.ci = new cck(this, 1.4, $$0 -> $$0.a(axb.au), false);
      this.bT.a(3, this.ci);
      this.bT.a(4, new cli.a(this, 1.0));
      this.bT.a(5, new cbb(this, 1.0));
      this.bT.a(7, new cbz(this, 1.0, 60));
      this.bT.a(8, new cbk(this, cnp.class, 8.0F));
      this.bT.a(8, new cbx(this));
      this.bT.a(9, new cbk(this, cli.class, 8.0F));
   }

   public void x(boolean $$0) {
      this.am.a(cf, $$0);
      bvi $$1 = this.g(bvm.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(ca);
         } else {
            $$1.c(bZ);
         }
      }
   }

   @Override
   public boolean q() {
      return this.am.a(cf);
   }

   @Override
   public boolean a(eqb $$0) {
      return $$0.a(awy.b);
   }

   @Override
   protected eye a(btj $$0, btm $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.b());
      float $$4 = this.aQ.c();
      float $$5 = 0.12F * azc.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(ddv $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public buf cU() {
      return (buf)(this.i() && this.cX() instanceof cnp $$0 && $$0.b(cvo.nS) ? $$0 : super.cU());
   }

   @Override
   public eye b(buf $$0) {
      eye[] $$1 = new eye[]{
         a((double)this.dn(), (double)$$0.dn(), $$0.dI()),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() - 22.5F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() + 22.5F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() - 45.0F),
         a((double)this.dn(), (double)$$0.dn(), $$0.dI() + 45.0F)
      };
      Set<je> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cO().e;
      double $$4 = this.cO().b - 0.5;
      je.a $$5 = new je.a();

      for (eye $$6 : $$1) {
         $$5.b(this.dx() + $$6.d, $$3, this.dD() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jj.a);
         }
      }

      for (je $$8 : $$2) {
         if (!this.dS().b_($$8).a(awy.b)) {
            double $$9 = this.dS().j($$8);
            if (cpr.a($$9)) {
               eye $$10 = eye.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fI().iterator();

               while (var14.hasNext()) {
                  bur $$11 = (bur)var14.next();
                  exz $$12 = $$0.f($$11);
                  if (cpr.a(this.dS(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eye(this.dx(), this.cO().e, this.dD());
   }

   @Override
   protected void a(cnp $$0, eye $$1) {
      this.a($$0.dI(), $$0.dK() * 0.5F);
      this.O = this.aU = this.aW = this.dI();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected eye b(cnp $$0, eye $$1) {
      return new eye(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cnp $$0) {
      return (float)(this.h(bvm.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aS() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(this.bw() ? awd.yi : awd.yh, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.dV());
   }

   @Override
   protected void a(double $$0, boolean $$1, dua $$2, je $$3) {
      if (this.bw()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.af.a(140) == 0) {
         this.b(awd.yd);
      } else if (this.gl() && this.af.a(60) == 0) {
         this.b(awd.ye);
      }

      if (!this.gd()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dua $$0 = this.dS().a_(this.ds());
            dua $$1 = this.bs();
            $$2 = $$0.a(aws.aV) || $$1.a(aws.aV) || this.b(awy.b) > 0.0;
            if (this.dg() instanceof cli $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.x(!$$2 || $$4);
      }

      super.l();
      this.go();
      this.aW();
   }

   private boolean y() {
      return this.ci != null && this.ci.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void go() {
      if (this.bw()) {
         eyj $$0 = eyj.a(this);
         if ($$0.a(dll.d, this.ds(), true) && !this.dS().b_(this.ds().d()).a(awy.b)) {
            this.d(true);
         } else {
            this.h(this.dv().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bvl.a t() {
      return cfv.gt().a(bvm.v, 0.175F);
   }

   @Override
   protected awc w() {
      return !this.gl() && !this.y() ? awd.yc : null;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.yg;
   }

   @Override
   protected awc n_() {
      return awd.yf;
   }

   @Override
   protected boolean r(btj $$0) {
      return !this.bX() && !this.a(awy.b);
   }

   @Override
   public boolean fo() {
      return true;
   }

   @Override
   public boolean bV() {
      return false;
   }

   @Override
   protected cdq b(dds $$0) {
      return new cli.b(this, $$0);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      if ($$1.a_($$0).y().a(awy.b)) {
         return 10.0F;
      } else {
         return this.bw() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cli b(arg $$0, btc $$1) {
      return btq.aZ.a($$0, btp.e);
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cvo.nL);
      }
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      boolean $$2 = this.p($$0.b($$1));
      if (!$$2 && this.i() && !this.bX() && !$$0.fR()) {
         if (!this.dS().B) {
            $$0.n(this);
         }

         return brk.a;
      } else {
         brk $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cvl $$4 = $$0.b($$1);
            return (brk)($$4.a(cvo.nL) ? $$4.a($$0, this, $$1) : brk.e);
         } else {
            if ($$2 && !this.ba()) {
               this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.yj, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azk $$4 = $$0.C_();
         if ($$4.a(30) == 0) {
            buh $$5 = btq.bx.a($$0.E(), btp.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new clo.b(clo.a($$4), false));
               $$5.a(btr.a, new cvl(cvo.nS));
               this.a(new cvl(cvo.nL), null);
            }
         } else if ($$4.a(10) == 0) {
            btc $$6 = btq.aZ.a($$0.E(), btp.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new btc.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bux a(dei $$0, bri $$1, buh $$2, @Nullable bux $$3) {
      $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
      $$2.a($$0, $$1, btp.g, $$3);
      $$2.a(this, true);
      return new btc.a(0.0F);
   }

   static class a extends cbp {
      private final cli g;

      a(cli $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public je k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bw() && this.a(this.g.dS(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bw() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(ddv $$0, je $$1) {
         return $$0.a_($$1).a(dgx.H) && $$0.a_($$1.d()).a(eqq.a);
      }
   }

   static class b extends cdp {
      b(cli $$0, dds $$1) {
         super($$0, $$1);
      }

      @Override
      protected eqr a(int $$0) {
         this.o = new eqx();
         this.o.a(true);
         return new eqr(this.o, $$0);
      }

      @Override
      protected boolean a(eqs $$0) {
         return $$0 != eqs.i && $$0 != eqs.o && $$0 != eqs.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(je $$0) {
         return this.b.a_($$0).a(dgx.H) || super.a($$0);
      }
   }
}
