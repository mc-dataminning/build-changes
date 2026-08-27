import javax.annotation.Nullable;

public class ccw extends bsa implements bsd<ccx> {
   public static final double cb = 0.6;
   public static final double cc = 0.8;
   public static final double cd = 1.33;
   private static final cwd ce = cwd.a(csg.qZ, csg.ra);
   private static final ajk<ccx> cf = ajo.a(ccw.class, ajm.x);
   private static final ajk<Boolean> cg = ajo.a(ccw.class, ajm.k);
   private static final ajk<Boolean> ch = ajo.a(ccw.class, ajm.k);
   private static final ajk<Integer> ci = ajo.a(ccw.class, ajm.b);
   @Nullable
   private ccw.a<ckl> cj;
   @Nullable
   private bzj ck;
   private float cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private float cq;

   public ccw(bqr<? extends ccw> $$0, czu $$1) {
      super($$0, $$1);
      this.gB();
   }

   public akf gv() {
      return this.gw().a();
   }

   @Override
   protected void z() {
      this.ck = new ccw.c(this, 0.6, ce, true);
      this.bS.a(1, new bxv(this));
      this.bS.a(1, new byu(this, 1.5));
      this.bS.a(2, new bzg(this));
      this.bS.a(3, new ccw.b(this));
      this.bS.a(4, this.ck);
      this.bS.a(5, new bxo(this, 1.1, 8));
      this.bS.a(6, new bxz(this, 1.0, 10.0F, 5.0F, false));
      this.bS.a(7, new bxp(this, 0.8));
      this.bS.a(8, new byh(this, 0.3F));
      this.bS.a(9, new byr(this));
      this.bS.a(10, new bxn(this, 0.8));
      this.bS.a(11, new bzo(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new byj(this, ckl.class, 10.0F));
      this.bT.a(1, new bzx<>(this, cdn.class, false, null));
      this.bT.a(1, new bzx<>(this, cdu.class, false, cdu.bZ));
   }

   public ccx gw() {
      return this.ao.a(cf);
   }

   public void a(ccx $$0) {
      this.ao.a(cf, $$0);
   }

   public void z(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   public boolean gx() {
      return this.ao.a(cg);
   }

   void A(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   boolean gC() {
      return this.ao.a(ch);
   }

   public cqw gy() {
      return cqw.a(this.ao.a(ci));
   }

   private void a(cqw $$0) {
      this.ao.a(ci, $$0.a());
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cf, lc.ak.f(ccx.b));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cqw.o.a());
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("variant", lc.ak.b(this.gw()).toString());
      $$0.a("CollarColor", (byte)this.gy().a());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      ccx $$1 = lc.ak.a(akf.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cqw.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(brp.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(brp.a);
            this.h(true);
         } else {
            this.b(brp.a);
            this.h(false);
         }
      } else {
         this.b(brp.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected auy v() {
      if (this.r()) {
         if (this.gt()) {
            return auz.dX;
         } else {
            return this.ah.a(4) == 0 ? auz.dY : auz.dQ;
         }
      } else {
         return auz.dR;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gz() {
      this.b(auz.dU);
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.dW;
   }

   @Override
   protected auy o_() {
      return auz.dS;
   }

   public static bsk.a gA() {
      return brg.A().a(bsl.q, 10.0).a(bsl.r, 0.3F).a(bsl.c, 3.0);
   }

   @Override
   protected void a(ckl $$0, bop $$1, csd $$2) {
      if (this.o($$2)) {
         this.a(auz.dT, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gD() {
      return (float)this.g(bsl.c);
   }

   @Override
   public boolean C(bql $$0) {
      return $$0.a(this.dO().b((bre)this), this.gD());
   }

   @Override
   public void l() {
      super.l();
      if (this.ck != null && this.ck.i() && !this.r() && this.ai % 100 == 0) {
         this.a(auz.dV, 1.0F, 1.0F);
      }

      this.gE();
   }

   private void gE() {
      if ((this.gx() || this.gC()) && this.ai % 5 == 0) {
         this.a(auz.dX, 0.6F + 0.4F * (this.ah.i() - this.ah.i()), 1.0F);
      }

      this.gF();
      this.gG();
   }

   private void gF() {
      this.cm = this.cl;
      this.co = this.cn;
      if (this.gx()) {
         this.cl = Math.min(1.0F, this.cl + 0.15F);
         this.cn = Math.min(1.0F, this.cn + 0.08F);
      } else {
         this.cl = Math.max(0.0F, this.cl - 0.22F);
         this.cn = Math.max(0.0F, this.cn - 0.13F);
      }
   }

   private void gG() {
      this.cq = this.cp;
      if (this.gC()) {
         this.cp = Math.min(1.0F, this.cp + 0.1F);
      } else {
         this.cp = Math.max(0.0F, this.cp - 0.13F);
      }
   }

   public float G(float $$0) {
      return axw.i($$0, this.cm, this.cl);
   }

   public float H(float $$0) {
      return axw.i($$0, this.co, this.cn);
   }

   public float I(float $$0) {
      return axw.i($$0, this.cq, this.cp);
   }

   @Nullable
   public ccw b(aqe $$0, bqf $$1) {
      ccw $$2 = bqr.p.a((czu)$$0);
      if ($$2 != null && $$1 instanceof ccw $$3) {
         if (this.ah.h()) {
            $$2.a(this.gw());
         } else {
            $$2.a($$3.gw());
         }

         if (this.r()) {
            $$2.b(this.W_());
            $$2.b(true, true);
            if (this.ah.h()) {
               $$2.a(this.gy());
            } else {
               $$2.a($$3.gy());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cct $$0) {
      if (!this.r()) {
         return false;
      } else {
         return !($$0 instanceof ccw $$1) ? false : $$1.r() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      awd<ccx> $$5 = $$4 ? avp.b : avp.a;
      lc.ak.a($$5, $$0.E_()).ifPresent($$0x -> this.a((ccx)$$0x.a()));
      aqe $$6 = $$0.E();
      if ($$6.a().a(this.dn(), avz.n).b()) {
         this.a(lc.ak.f(ccx.k));
         this.fT();
      }

      return $$3;
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      cry $$3 = $$2.f();
      if (this.r()) {
         if (this.j($$0)) {
            if ($$3 instanceof cqx $$4) {
               cqw $$5 = $$4.c();
               if ($$5 != this.gy()) {
                  if (!this.dN().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.fT();
                  }

                  return boq.a(this.dN().x_());
               }
            } else if ($$3.y() && this.o($$2) && this.ey() < this.eP()) {
               if (!this.dN().x_()) {
                  this.a($$0, $$1, $$2);
                  this.c((float)$$3.z().a());
               }

               return boq.a(this.dN().x_());
            }

            boq $$6 = super.b($$0, $$1);
            if (!$$6.a()) {
               this.y(!this.gp());
               return boq.a(this.dN().x_());
            }

            return $$6;
         }
      } else if (this.o($$2)) {
         if (!this.dN().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.fT();
         }

         return boq.a(this.dN().x_());
      }

      boq $$7 = super.b($$0, $$1);
      if ($$7.a()) {
         this.fT();
      }

      return $$7;
   }

   @Override
   public boolean o(csd $$0) {
      return ce.a($$0);
   }

   @Override
   public boolean h(double $$0) {
      return !this.r() && this.ai > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gB();
   }

   protected void gB() {
      if (this.cj == null) {
         this.cj = new ccw.a<>(this, ckl.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cj);
      if (!this.r()) {
         this.bS.a(4, this.cj);
      }
   }

   private void h(ckl $$0) {
      if (this.ah.a(3) == 0) {
         this.f($$0);
         this.y(true);
         this.dN().a(this, (byte)7);
      } else {
         this.dN().a(this, (byte)6);
      }
   }

   @Override
   public boolean bU() {
      return this.bY() || super.bU();
   }

   static class a<T extends bre> extends bxi<T> {
      private final ccw i;

      public a(ccw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bqq.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.r() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.r() && super.b();
      }
   }

   static class b extends byb {
      private final ccw a;
      @Nullable
      private ckl b;
      @Nullable
      private im c;
      private int d;

      public b(ccw $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.r()) {
            return false;
         } else if (this.a.gp()) {
            return false;
         } else {
            bre $$0 = this.a.P_();
            if ($$0 instanceof ckl) {
               this.b = (ckl)$$0;
               if (!$$0.fJ()) {
                  return false;
               }

               if (this.a.g((bql)this.b) > 100.0) {
                  return false;
               }

               im $$1 = this.b.dn();
               dpy $$2 = this.a.dN().a_($$1);
               if ($$2.a(avo.R)) {
                  this.c = $$2.d(dco.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new im($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (ccw $$1 : this.a.dN().a(ccw.class, new eta(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gx() || $$1.gC())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.r() && !this.a.gp() && this.b != null && this.b.fJ() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.x(false);
            this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.z(false);
         float $$0 = this.a.dN().f(1.0F);
         if (this.b.ge() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dN().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.K().n();
      }

      private void i() {
         ayd $$0 = this.a.ej();
         im.a $$1 = new im.a();
         $$1.g(this.a.gc() ? this.a.ge().dn() : this.a.dn());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dn());
         eoi $$2 = this.a.dN().o().aM().getLootTable(eny.az);
         eog $$3 = new eog.a((aqe)this.a.dN()).a(eqt.f, this.a.dl()).a(eqt.a, this.a).a(eqs.i);

         for (csd $$5 : $$2.a($$3)) {
            this.a
               .dN()
               .b(
                  new cgv(
                     this.a.dN(),
                     (double)$$1.u() - (double)axw.a(this.a.aZ * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)axw.b(this.a.aZ * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.K().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g((bql)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends bzj {
      @Nullable
      private ckl c;
      private final ccw d;

      public c(ccw $$0, double $$1, cwd $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.ej().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.ej().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.r();
      }
   }
}
