import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwz extends bmg implements bmj<bxa> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final coq bZ = coq.a(clr.qW, clr.qX);
   private static final afs<bxa> ca = afv.a(bwz.class, afu.w);
   private static final afs<Boolean> cb = afv.a(bwz.class, afu.k);
   private static final afs<Boolean> cc = afv.a(bwz.class, afu.k);
   private static final afs<Integer> cd = afv.a(bwz.class, afu.b);
   private bwz.a<cdz> ce;
   @Nullable
   private bto cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bwz(bkz<? extends bwz> $$0, csf $$1) {
      super($$0, $$1);
   }

   public agm gl() {
      return this.gm().a();
   }

   @Override
   protected void B() {
      this.cf = new bwz.c(this, 0.6, bZ, true);
      this.bO.a(1, new bsa(this));
      this.bO.a(1, new bsz(this, 1.5));
      this.bO.a(2, new btl(this));
      this.bO.a(3, new bwz.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new brt(this, 1.1, 8));
      this.bO.a(6, new bse(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bru(this, 0.8));
      this.bO.a(8, new bsm(this, 0.3F));
      this.bO.a(9, new bsw(this));
      this.bO.a(10, new brs(this, 0.8));
      this.bO.a(11, new btt(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bso(this, cdz.class, 10.0F));
      this.bP.a(1, new buc<>(this, bxq.class, false, null));
      this.bP.a(1, new buc<>(this, bxx.class, false, bxx.bU));
   }

   public bxa gm() {
      return this.an.b(ca);
   }

   public void a(bxa $$0) {
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

   public ckc gp() {
      return ckc.a(this.an.b(cd));
   }

   public void a(ckc $$0) {
      this.an.b(cd, $$0.a());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, kc.al.e(bxa.b));
      this.an.a(cb, false);
      this.an.a(cc, false);
      this.an.a(cd, ckc.o.a());
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("variant", kc.al.b(this.gm()).toString());
      $$0.a("CollarColor", (byte)this.gp().a());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      bxa $$1 = kc.al.a(agm.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(ckc.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(blx.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(blx.a);
            this.g(true);
         } else {
            this.b(blx.a);
            this.g(false);
         }
      } else {
         this.b(blx.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected aqu y() {
      if (this.u()) {
         if (this.gj()) {
            return aqv.dq;
         } else {
            return this.ag.a(4) == 0 ? aqv.dr : aqv.dj;
         }
      } else {
         return aqv.dk;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gq() {
      this.a(aqv.dn, this.eX(), this.eY());
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.dp;
   }

   @Override
   protected aqu n_() {
      return aqv.dl;
   }

   public static bmq.a gr() {
      return bln.C().a(bmr.l, 10.0).a(bmr.m, 0.3F).a(bmr.c, 3.0);
   }

   @Override
   protected void a(cdz $$0, bja $$1, clo $$2) {
      if (this.m($$2)) {
         this.a(aqv.dm, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gs() {
      return (float)this.b(bmr.c);
   }

   @Override
   public boolean C(bkv $$0) {
      return $$0.a(this.dO().b((bll)this), this.gs());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.u() && this.ah % 100 == 0) {
         this.a(aqv.do, 1.0F, 1.0F);
      }

      this.gt();
   }

   private void gt() {
      if ((this.gn() || this.go()) && this.ah % 5 == 0) {
         this.a(aqv.dq, 0.6F + 0.4F * (this.ag.i() - this.ag.i()), 1.0F);
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
      return atq.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return atq.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return atq.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bwz b(ami $$0, bkq $$1) {
      bwz $$2 = bkz.m.a((csf)$$0);
      if ($$2 != null && $$1 instanceof bwz $$3) {
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
   public boolean a(bww $$0) {
      if (!this.u()) {
         return false;
      } else {
         return !($$0 instanceof bwz $$1) ? false : $$1.u() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.ao() > 0.9F;
      arz<bxa> $$6 = $$5 ? arl.b : arl.a;
      kc.al.b($$6).flatMap($$1x -> $$1x.a($$0.F_())).ifPresent($$0x -> this.a((bxa)$$0x.a()));
      ami $$7 = $$0.D();
      if ($$7.a().a(this.dn(), arv.n).b()) {
         this.a(kc.al.e(bxa.k));
         this.fK();
      }

      return $$3;
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      clj $$3 = $$2.d();
      if (this.dN().B) {
         if (this.u() && this.j($$0)) {
            return bjb.a;
         } else {
            return !this.m($$2) || !(this.ew() < this.eN()) && this.u() ? bjb.d : bjb.a;
         }
      } else {
         if (this.u()) {
            if (this.j($$0)) {
               if (!($$3 instanceof ckd)) {
                  if ($$3.u() && this.m($$2) && this.ew() < this.eN()) {
                     this.a($$0, $$1, $$2);
                     this.b((float)$$3.v().a());
                     return bjb.b;
                  }

                  bjb $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.z(!this.gf());
                  }

                  return $$5;
               }

               ckc $$4 = ((ckd)$$3).d();
               if ($$4 != this.gp()) {
                  this.a($$4);
                  if (!$$0.fU().d) {
                     $$2.h(1);
                  }

                  this.fK();
                  return bjb.b;
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
            return bjb.b;
         }

         bjb $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fK();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(clo $$0) {
      return bZ.a($$0);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.ah > 2400;
   }

   @Override
   protected void w() {
      if (this.ce == null) {
         this.ce = new bwz.a<>(this, cdz.class, 16.0F, 0.8, 1.33);
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
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }

   static class a<T extends bll> extends brn<T> {
      private final bwz i;

      public a(bwz $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bky.e::test);
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

   static class b extends bsg {
      private final bwz a;
      @Nullable
      private cdz b;
      @Nullable
      private hx c;
      private int d;

      public b(bwz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.u()) {
            return false;
         } else if (this.a.gf()) {
            return false;
         } else {
            bll $$0 = this.a.R_();
            if ($$0 instanceof cdz) {
               this.b = (cdz)$$0;
               if (!$$0.fE()) {
                  return false;
               }

               if (this.a.f((bkv)this.b) > 100.0) {
                  return false;
               }

               hx $$1 = this.b.dn();
               dhn $$2 = this.a.dN().a_($$1);
               if ($$2.a(ark.R)) {
                  this.c = $$2.d(cuy.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new hx($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bwz $$1 : this.a.dN().a(bwz.class, new eju(this.c).g(2.0))) {
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
         if (this.b.fX() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dN().F_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.N().n();
      }

      private void i() {
         atw $$0 = this.a.eh();
         hx.a $$1 = new hx.a();
         $$1.g(this.a.fT() ? this.a.fU().dn() : this.a.dn());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dn());
         efk $$2 = this.a.dN().n().aJ().getLootTable(efa.am);
         efi $$3 = new efi.a((ami)this.a.dN()).a(ehn.f, this.a.dl()).a(ehn.a, this.a).a(ehm.i);

         for (clo $$5 : $$2.a($$3)) {
            this.a
               .dN()
               .b(
                  new cas(
                     this.a.dN(),
                     (double)$$1.u() - (double)atq.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)atq.b(this.a.aU * (float) (Math.PI / 180.0)),
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
            if (this.a.f((bkv)this.b) < 2.5) {
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

   static class c extends bto {
      @Nullable
      private cdz c;
      private final bwz d;

      public c(bwz $$0, double $$1, coq $$2, boolean $$3) {
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
