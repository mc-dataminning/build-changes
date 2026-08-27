import javax.annotation.Nullable;

public class cap extends bpt implements bpw<caq> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.33;
   private static final csp cb = csp.a(cpt.qY, cpt.qZ);
   private static final aii<caq> cc = ail.a(cap.class, aik.w);
   private static final aii<Boolean> cd = ail.a(cap.class, aik.k);
   private static final aii<Boolean> ce = ail.a(cap.class, aik.k);
   private static final aii<Integer> cf = ail.a(cap.class, aik.b);
   private cap.a<cia> cg;
   @Nullable
   private bxc ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;
   private float cm;
   private float cn;

   public cap(bol<? extends cap> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ajc gr() {
      return this.gs().a();
   }

   @Override
   protected void B() {
      this.ch = new cap.c(this, 0.6, cb, true);
      this.bP.a(1, new bvo(this));
      this.bP.a(1, new bwn(this, 1.5));
      this.bP.a(2, new bwz(this));
      this.bP.a(3, new cap.b(this));
      this.bP.a(4, this.ch);
      this.bP.a(5, new bvh(this, 1.1, 8));
      this.bP.a(6, new bvs(this, 1.0, 10.0F, 5.0F, false));
      this.bP.a(7, new bvi(this, 0.8));
      this.bP.a(8, new bwa(this, 0.3F));
      this.bP.a(9, new bwk(this));
      this.bP.a(10, new bvg(this, 0.8));
      this.bP.a(11, new bxh(this, 0.8, 1.0000001E-5F));
      this.bP.a(12, new bwc(this, cia.class, 10.0F));
      this.bQ.a(1, new bxq<>(this, cbg.class, false, null));
      this.bQ.a(1, new bxq<>(this, cbn.class, false, cbn.bW));
   }

   public caq gs() {
      return this.am.b(cc);
   }

   public void a(caq $$0) {
      this.am.b(cc, $$0);
   }

   public void A(boolean $$0) {
      this.am.b(cd, $$0);
   }

   public boolean gt() {
      return this.am.b(cd);
   }

   public void B(boolean $$0) {
      this.am.b(ce, $$0);
   }

   public boolean gu() {
      return this.am.b(ce);
   }

   public cog gv() {
      return cog.a(this.am.b(cf));
   }

   public void a(cog $$0) {
      this.am.b(cf, $$0.a());
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, kh.ak.e(caq.b));
      this.am.a(cd, false);
      this.am.a(ce, false);
      this.am.a(cf, cog.o.a());
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("variant", kh.ak.b(this.gs()).toString());
      $$0.a("CollarColor", (byte)this.gv().a());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      caq $$1 = kh.ak.a(ajc.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cog.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void aa() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bpi.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bpi.a);
            this.g(true);
         } else {
            this.b(bpi.a);
            this.g(false);
         }
      } else {
         this.b(bpi.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected ato y() {
      if (this.u()) {
         if (this.gp()) {
            return atp.dP;
         } else {
            return this.af.a(4) == 0 ? atp.dQ : atp.dI;
         }
      } else {
         return atp.dJ;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gw() {
      this.b(atp.dM);
   }

   @Override
   protected ato d(bne $$0) {
      return atp.dO;
   }

   @Override
   protected ato n_() {
      return atp.dK;
   }

   public static bqd.a gx() {
      return boz.C().a(bqe.n, 10.0).a(bqe.o, 0.3F).a(bqe.c, 3.0);
   }

   @Override
   protected void a(cia $$0, bmk $$1, cpq $$2) {
      if (this.o($$2)) {
         this.a(atp.dL, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gy() {
      return (float)this.g(bqe.c);
   }

   @Override
   public boolean B(bof $$0) {
      return $$0.a(this.dK().b((box)this), this.gy());
   }

   @Override
   public void l() {
      super.l();
      if (this.ch != null && this.ch.i() && !this.u() && this.ag % 100 == 0) {
         this.a(atp.dN, 1.0F, 1.0F);
      }

      this.gz();
   }

   private void gz() {
      if ((this.gt() || this.gu()) && this.ag % 5 == 0) {
         this.a(atp.dP, 0.6F + 0.4F * (this.af.i() - this.af.i()), 1.0F);
      }

      this.gA();
      this.gB();
   }

   private void gA() {
      this.cj = this.ci;
      this.cl = this.ck;
      if (this.gt()) {
         this.ci = Math.min(1.0F, this.ci + 0.15F);
         this.ck = Math.min(1.0F, this.ck + 0.08F);
      } else {
         this.ci = Math.max(0.0F, this.ci - 0.22F);
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   private void gB() {
      this.cn = this.cm;
      if (this.gu()) {
         this.cm = Math.min(1.0F, this.cm + 0.1F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.13F);
      }
   }

   public float E(float $$0) {
      return awm.i($$0, this.cj, this.ci);
   }

   public float F(float $$0) {
      return awm.i($$0, this.cl, this.ck);
   }

   public float G(float $$0) {
      return awm.i($$0, this.cn, this.cm);
   }

   @Nullable
   public cap b(apa $$0, boa $$1) {
      cap $$2 = bol.o.a((cwe)$$0);
      if ($$2 != null && $$1 instanceof cap $$3) {
         if (this.af.h()) {
            $$2.a(this.gs());
         } else {
            $$2.a($$3.gs());
         }

         if (this.u()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.af.h()) {
               $$2.a(this.gv());
            } else {
               $$2.a($$3.gv());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cam $$0) {
      if (!this.u()) {
         return false;
      } else {
         return !($$0 instanceof cap $$1) ? false : $$1.u() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ao() > 0.9F;
      aut<caq> $$5 = $$4 ? auf.b : auf.a;
      kh.ak.a($$5, $$0.F_()).ifPresent($$0x -> this.a((caq)$$0x.a()));
      apa $$6 = $$0.E();
      if ($$6.a().a(this.dj(), aup.n).b()) {
         this.a(kh.ak.e(caq.k));
         this.fQ();
      }

      return $$3;
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      cpl $$3 = $$2.d();
      if (this.dJ().B) {
         if (this.u() && this.j($$0)) {
            return bml.a;
         } else {
            return !this.o($$2) || !(this.eu() < this.eL()) && this.u() ? bml.d : bml.a;
         }
      } else {
         if (this.u()) {
            if (this.j($$0)) {
               if (!($$3 instanceof coh)) {
                  if ($$3.v() && this.o($$2) && this.eu() < this.eL()) {
                     this.a($$0, $$1, $$2);
                     this.c((float)$$3.w().a());
                     return bml.b;
                  }

                  bml $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.z(!this.gl());
                  }

                  return $$5;
               }

               cog $$4 = ((coh)$$3).c();
               if ($$4 != this.gv()) {
                  this.a($$4);
                  if (!$$0.fW().d) {
                     $$2.h(1);
                  }

                  this.fQ();
                  return bml.b;
               }
            }
         } else if (this.o($$2)) {
            this.a($$0, $$1, $$2);
            if (this.af.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dJ().a(this, (byte)7);
            } else {
               this.dJ().a(this, (byte)6);
            }

            this.fQ();
            return bml.b;
         }

         bml $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fQ();
         }

         return $$6;
      }
   }

   @Override
   public boolean o(cpq $$0) {
      return cb.a($$0);
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.ag > 2400;
   }

   @Override
   protected void w() {
      if (this.cg == null) {
         this.cg = new cap.a<>(this, cia.class, 16.0F, 0.8, 1.33);
      }

      this.bP.a(this.cg);
      if (!this.u()) {
         this.bP.a(4, this.cg);
      }
   }

   @Override
   public boolean bQ() {
      return this.bU() || super.bQ();
   }

   static class a<T extends box> extends bvb<T> {
      private final cap i;

      public a(cap $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bok.e::test);
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

   static class b extends bvu {
      private final cap a;
      @Nullable
      private cia b;
      @Nullable
      private ib c;
      private int d;

      public b(cap $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.u()) {
            return false;
         } else if (this.a.gl()) {
            return false;
         } else {
            box $$0 = this.a.R_();
            if ($$0 instanceof cia) {
               this.b = (cia)$$0;
               if (!$$0.fF()) {
                  return false;
               }

               if (this.a.f((bof)this.b) > 100.0) {
                  return false;
               }

               ib $$1 = this.b.dj();
               dme $$2 = this.a.dJ().a_($$1);
               if ($$2.a(aue.R)) {
                  this.c = $$2.d(cyy.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ib($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cap $$1 : this.a.dJ().a(cap.class, new eoq(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gt() || $$1.gu())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.u() && !this.a.gl() && this.b != null && this.b.fF() && this.c != null && !this.h();
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
         float $$0 = this.a.dJ().f(1.0F);
         if (this.b.fZ() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dJ().F_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.N().n();
      }

      private void i() {
         awt $$0 = this.a.ef();
         ib.a $$1 = new ib.a();
         $$1.g(this.a.fZ() ? this.a.ga().dj() : this.a.dj());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dj());
         ekg $$2 = this.a.dJ().o().aM().getLootTable(ejw.aw);
         eke $$3 = new eke.a((apa)this.a.dJ()).a(emj.f, this.a.dh()).a(emj.a, this.a).a(emi.i);

         for (cpq $$5 : $$2.a($$3)) {
            this.a
               .dJ()
               .b(
                  new cel(
                     this.a.dJ(),
                     (double)$$1.u() - (double)awm.a(this.a.aV * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)awm.b(this.a.aV * (float) (Math.PI / 180.0)),
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
            if (this.a.f((bof)this.b) < 2.5) {
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

   static class c extends bxc {
      @Nullable
      private cia c;
      private final cap d;

      public c(cap $$0, double $$1, csp $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.ef().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.ef().a(this.a(500)) == 0) {
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
