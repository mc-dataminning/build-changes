import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgu extends bvx implements bwa<jq<cgv>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final akl<jq<cgv>> cf = akp.a(cgu.class, akn.x);
   private static final akl<Boolean> cg = akp.a(cgu.class, akn.k);
   private static final akl<Boolean> ch = akp.a(cgu.class, akn.k);
   private static final akl<Integer> ci = akp.a(cgu.class, akn.b);
   private static final alh<cgv> cj = cgv.c;
   @Nullable
   private cgu.a<com> ck;
   @Nullable
   private cdg cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public cgu(bul<? extends cgu> $$0, dfb $$1) {
      super($$0, $$1);
      this.gM();
   }

   @Override
   protected void D() {
      this.cl = new cgu.c(this, 0.6, $$0 -> $$0.a(axj.ah), true);
      this.bS.a(1, new cbs(this));
      this.bS.a(1, new bvx.a(1.5));
      this.bS.a(2, new cdd(this));
      this.bS.a(3, new cgu.b(this));
      this.bS.a(4, this.cl);
      this.bS.a(5, new cbl(this, 1.1, 8));
      this.bS.a(6, new cbw(this, 1.0, 10.0F, 5.0F));
      this.bS.a(7, new cbm(this, 0.8));
      this.bS.a(8, new cce(this, 0.3F));
      this.bS.a(9, new cco(this));
      this.bS.a(10, new cbk(this, 0.8));
      this.bS.a(11, new cdl(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new ccg(this, com.class, 10.0F));
      this.bT.a(1, new cdu<>(this, chl.class, false, null));
      this.bT.a(1, new cdu<>(this, chs.class, false, chs.bY));
   }

   public jq<cgv> gG() {
      return this.am.a(cf);
   }

   public void j(jq<cgv> $$0) {
      this.am.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.am.a(cg, $$0);
   }

   public boolean gH() {
      return this.am.a(cg);
   }

   void B(boolean $$0) {
      this.am.a(ch, $$0);
   }

   boolean gN() {
      return this.am.a(ch);
   }

   public cuy gI() {
      return cuy.a(this.am.a(ci));
   }

   private void a(cuy $$0) {
      this.am.a(ci, $$0.a());
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cf, ly.ai.b(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cuy.o.a());
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("variant", this.gG().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gI().a());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      Optional.ofNullable(ali.c($$0.l("variant"))).map($$0x -> alh.a(lz.l, $$0x)).flatMap(ly.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cuy.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void ac() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(bvm.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bvm.a);
            this.h(true);
         } else {
            this.b(bvm.a);
            this.h(false);
         }
      } else {
         this.b(bvm.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awk w() {
      if (this.q()) {
         if (this.gE()) {
            return awl.dY;
         } else {
            return this.af.a(4) == 0 ? awl.dZ : awl.dR;
         }
      } else {
         return awl.dS;
      }
   }

   @Override
   public int T() {
      return 120;
   }

   public void gJ() {
      this.b(awl.dV);
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.dX;
   }

   @Override
   protected awk o_() {
      return awl.dT;
   }

   public static bwh.a gK() {
      return cgr.gz().a(bwi.s, 10.0).a(bwi.v, 0.3F).a(bwi.c, 3.0);
   }

   @Override
   protected void gA() {
      this.a(awl.dU, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.cl != null && this.cl.i() && !this.q() && this.ag % 100 == 0) {
         this.a(awl.dW, 1.0F, 1.0F);
      }

      this.gO();
   }

   private void gO() {
      if ((this.gH() || this.gN()) && this.ag % 5 == 0) {
         this.a(awl.dY, 0.6F + 0.4F * (this.af.i() - this.af.i()), 1.0F);
      }

      this.gP();
      this.gQ();
      this.cq = false;
      if (this.gH()) {
         jh $$0 = this.dx();

         for (com $$2 : this.dX().a(com.class, new ezi($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fT()) {
               this.cq = true;
               break;
            }
         }
      }
   }

   public boolean gL() {
      return this.cq;
   }

   private void gP() {
      this.cn = this.cm;
      this.cp = this.co;
      if (this.gH()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
         this.co = Math.min(1.0F, this.co + 0.08F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.22F);
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   private void gQ() {
      this.cs = this.cr;
      if (this.gN()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float J(float $$0) {
      return azk.h($$0, this.cn, this.cm);
   }

   public float K(float $$0) {
      return azk.h($$0, this.cp, this.co);
   }

   public float L(float $$0) {
      return azk.h($$0, this.cs, this.cr);
   }

   @Nullable
   public cgu b(arn $$0, btv $$1) {
      cgu $$2 = bul.p.a($$0, buk.e);
      if ($$2 != null && $$1 instanceof cgu $$3) {
         if (this.af.h()) {
            $$2.j(this.gG());
         } else {
            $$2.j($$3.gG());
         }

         if (this.q()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gI());
            } else {
               $$2.a($$3.gI());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cgr $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cgu $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      axq<cgv> $$5 = $$4 ? axb.b : axb.a;
      ly.ai.a($$5, $$0.E_()).ifPresent(this::j);
      arn $$6 = $$0.E();
      if ($$6.a().a(this.dx(), axm.o).b()) {
         this.j(ly.ai.b(cgv.l));
         this.ga();
      }

      return $$3;
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      cvx $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cuz $$4) {
               cuy $$5 = $$4.b();
               if ($$5 != this.gI()) {
                  if (!this.dX().y_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.ga();
                  }

                  return bsd.a;
               }
            } else if (this.l($$2) && this.eG() < this.eV()) {
               if (!this.dX().y_()) {
                  this.a($$0, $$1, $$2);
                  crl $$6 = $$2.a(ku.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gA();
               }

               return bsd.a;
            }

            bsd $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gu());
               return bsd.a;
            }

            return $$7;
         }
      } else if (this.l($$2)) {
         if (!this.dX().y_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.ga();
            this.gA();
         }

         return bsd.a;
      }

      bsd $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.ga();
      }

      return $$8;
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ah);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.ag > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gM();
   }

   protected void gM() {
      if (this.ck == null) {
         this.ck = new cgu.a<>(this, com.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.q()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(com $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dX().a(this, (byte)7);
      } else {
         this.dX().a(this, (byte)6);
      }
   }

   @Override
   public boolean cf() {
      return this.cj() || super.cf();
   }

   static class a<T extends bva> extends cbf<T> {
      private final cgu i;

      public a(cgu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buj.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.q() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.q() && super.c();
      }
   }

   static class b extends cby {
      private final cgu a;
      @Nullable
      private com b;
      @Nullable
      private jh c;
      private int d;

      public b(cgu $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gu()) {
            return false;
         } else {
            bva $$0 = this.a.T_();
            if ($$0 instanceof com) {
               this.b = (com)$$0;
               if (!$$0.fT()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jh $$1 = this.b.dx();
               dvj $$2 = this.a.dX().a_($$1);
               if ($$2.a(axa.S)) {
                  this.c = $$2.d(dhx.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jh($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cgu $$1 : this.a.dX().a(cgu.class, new ezi(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gH() || $$1.gN())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gu() && this.b != null && this.b.fT() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.y(false);
            this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.A(false);
         float $$0 = this.a.dX().f(1.0F);
         if (this.b.go() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dX().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.P().o();
      }

      private void i() {
         azs $$0 = this.a.ea();
         jh.a $$1 = new jh.a();
         $$1.g(this.a.M_() ? this.a.C().dx() : this.a.dx());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dx());
         this.a
            .a(
               ety.aq,
               $$1x -> this.a
                     .dX()
                     .b(
                        new ckv(
                           this.a.dX(),
                           (double)$$1.u() - (double)azk.a(this.a.aX * (float) (Math.PI / 180.0)),
                           (double)$$1.v(),
                           (double)$$1.w() + (double)azk.b(this.a.aX * (float) (Math.PI / 180.0)),
                           $$1x
                        )
                     )
            );
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
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

   static class c extends cdg {
      @Nullable
      private com c;
      private final cgu d;

      public c(cgu $$0, double $$1, Predicate<cwb> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.ea().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.ea().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }
   }
}
