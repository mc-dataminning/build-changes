import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwu extends bmb implements bme<bwv> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cok bZ = cok.a(clm.qW, clm.qX);
   private static final afo<bwv> ca = afr.a(bwu.class, afq.w);
   private static final afo<Boolean> cb = afr.a(bwu.class, afq.k);
   private static final afo<Boolean> cc = afr.a(bwu.class, afq.k);
   private static final afo<Integer> cd = afr.a(bwu.class, afq.b);
   private bwu.a<cdu> ce;
   @Nullable
   private btj cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bwu(bku<? extends bwu> $$0, csa $$1) {
      super($$0, $$1);
   }

   public agi gl() {
      return this.gm().a();
   }

   @Override
   protected void B() {
      this.cf = new bwu.c(this, 0.6, bZ, true);
      this.bO.a(1, new brv(this));
      this.bO.a(1, new bsu(this, 1.5));
      this.bO.a(2, new btg(this));
      this.bO.a(3, new bwu.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new bro(this, 1.1, 8));
      this.bO.a(6, new brz(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new brp(this, 0.8));
      this.bO.a(8, new bsh(this, 0.3F));
      this.bO.a(9, new bsr(this));
      this.bO.a(10, new brn(this, 0.8));
      this.bO.a(11, new bto(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bsj(this, cdu.class, 10.0F));
      this.bP.a(1, new btx<>(this, bxl.class, false, null));
      this.bP.a(1, new btx<>(this, bxs.class, false, bxs.bU));
   }

   public bwv gm() {
      return this.an.b(ca);
   }

   public void a(bwv $$0) {
      this.an.b(ca, $$0);
   }

   public void A(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gn() {
      return this.an.b(cb);
   }

   public void B(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean go() {
      return this.an.b(cc);
   }

   public cjx gp() {
      return cjx.a(this.an.b(cd));
   }

   public void a(cjx $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, jy.al.e(bwv.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, cjx.o.a());
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("variant", jy.al.b(this.gm()).toString());
      $$0.a("CollarColor", (byte)this.gp().a());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      bwv $$1 = jy.al.a(agi.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cjx.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bls.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bls.a);
            this.g(true);
         } else {
            this.b(bls.a);
            this.g(false);
         }
      } else {
         this.b(bls.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected aqq y() {
      if (this.u()) {
         if (this.gj()) {
            return aqr.dq;
         } else {
            return this.ag.a(4) == 0 ? aqr.dr : aqr.dj;
         }
      } else {
         return aqr.dk;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gq() {
      this.a(aqr.dn, this.eX(), this.eY());
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.dp;
   }

   @Override
   protected aqq m_() {
      return aqr.dl;
   }

   public static bml.a gr() {
      return bli.C().a(bmm.l, 10.0).a(bmm.m, 0.3F).a(bmm.c, 3.0);
   }

   @Override
   protected void a(cdu $$0, biw $$1, clj $$2) {
      if (this.m($$2)) {
         this.a(aqr.dm, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gs() {
      return (float)this.b(bmm.c);
   }

   @Override
   public boolean C(bkq $$0) {
      return $$0.a(this.dO().b((blg)this), this.gs());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.u() && this.ah % 100 == 0) {
         this.a(aqr.do, 1.0F, 1.0F);
      }

      this.gt();
   }

   private void gt() {
      if ((this.gn() || this.go()) && this.ah % 5 == 0) {
         this.a(aqr.dq, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
      }

      this.gu();
      this.gv();
   }

   private void gu() {
      this.ch = this.cg;
      this.cj = this.ci;
      if (this.gn()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
         this.ci = Math.min(1.0F, this.ci + 0.08F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.22F);
         this.ci = Math.max(0.0F, this.ci - 0.13F);
      }
   }

   private void gv() {
      this.cl = this.ck;
      if (this.go()) {
         this.ck = Math.min(1.0F, this.ck + 0.1F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   public float E(float $$0) {
      return atm.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return atm.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return atm.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bwu b(ame $$0, bkl $$1) {
      bwu $$2 = bku.m.a((csa)$$0);
      if ($$2 != null && $$1 instanceof bwu $$3) {
         if (this.ag.h()) {
            $$2.a(this.gm());
         } else {
            $$2.a($$3.gm());
         }

         if (this.u()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.ag.h()) {
               $$2.a(this.gp());
            } else {
               $$2.a($$3.gp());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(bwr $$0) {
      if (!this.u()) {
         return false;
      } else {
         return !($$0 instanceof bwu $$1) ? false : $$1.u() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.ao() > 0.9F;
      arv<bwv> $$6 = $$5 ? arh.b : arh.a;
      jy.al.b($$6).flatMap($$1x -> $$1x.a($$0.E_())).ifPresent($$0x -> this.a((bwv)$$0x.a()));
      ame $$7 = $$0.D();
      if ($$7.a().a(this.dn(), arr.n).b()) {
         this.a(jy.al.e(bwv.k));
         this.fK();
      }

      return $$3;
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      cle $$3 = $$2.d();
      if (this.dN().B) {
         if (this.u() && this.j($$0)) {
            return bix.a;
         } else {
            return !this.m($$2) || !(this.ew() < this.eN()) && this.u() ? bix.d : bix.a;
         }
      } else {
         if (this.u()) {
            if (this.j($$0)) {
               if (!($$3 instanceof cjy)) {
                  if ($$3.u() && this.m($$2) && this.ew() < this.eN()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bix.b;
                  }

                  bix $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.n_()) {
                     this.z(!this.gf());
                  }

                  return $$5;
               }

               cjx $$4 = ((cjy)$$3).d();
               if ($$4 != this.gp()) {
                  this.a($$4);
                  if (!$$0.fU().d) {
                     $$2.h(1);
                  }

                  this.fK();
                  return bix.b;
               }
            }
         } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.ag.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dN().a(this, (byte)7);
            } else {
               this.dN().a(this, (byte)6);
            }

            this.fK();
            return bix.b;
         }

         bix $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fK();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(clj $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.ah > 2400;
   }

   @Override
   protected void w() {
      if (this.ce == null) {
         this.ce = new bwu.a<>(this, cdu.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.ce);
      if (!this.u()) {
         this.bO.a(4, this.ce);
      }
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends blg> extends bri<T> {
      private final bwu i;

      public a(bwu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bkt.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.u() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.u() && super.b();
      }
   }

   static class b extends bsb {
      private final bwu a;
      @Nullable
      private cdu b;
      @Nullable
      private ht c;
      private int d;

      public b(bwu $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.u()) {
            return false;
         } else if (this.a.gf()) {
            return false;
         } else {
            blg $$0 = this.a.Q_();
            if ($$0 instanceof cdu) {
               this.b = (cdu)$$0;
               if (!$$0.fE()) {
                  return false;
               }

               if (this.a.f((bkq)this.b) > 100.0) {
                  return false;
               }

               ht $$1 = this.b.dn();
               dhi $$2 = this.a.dN().a_($$1);
               if ($$2.a(arg.R)) {
                  this.c = $$2.d(cut.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ht($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bwu $$1 : this.a.dN().a(bwu.class, new ejp(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gn() || $$1.go())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.u() && !this.a.gf() && this.b != null && this.b.fE() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.A(false);
         float $$0 = this.a.dN().f(1.0F);
         if (this.b.fX() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dN().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.N().n();
      }

      private void i() {
         ats $$0 = this.a.eh();
         ht.a $$1 = new ht.a();
         $$1.g(this.a.fT() ? this.a.fU().dn() : this.a.dn());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dn());
         eff $$2 = this.a.dN().n().aJ().getLootTable(eev.am);
         efd $$3 = new efd.a((ame)this.a.dN()).a(ehi.f, this.a.dl()).a(ehi.a, this.a).a(ehh.i);

         for (clj $$5 : $$2.a($$3)) {
            this.a
               .dN()
               .b(
                  new can(
                     this.a.dN(),
                     (double)$$1.u() - (double)atm.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)atm.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((bkq)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends btj {
      @Nullable
      private cdu c;
      private final bwu d;

      public c(bwu $$0, double $$1, cok $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.eh().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.eh().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }
   }
}
