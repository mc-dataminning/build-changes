import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cew extends cfg implements bpd {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bqc d = new bqc(c, "Attacking speed boost", 0.15F, bqc.a.a);
   private static final int e = 400;
   private static final int bV = 600;
   private static final aii<Optional<dme>> bW = ail.a(cew.class, aik.j);
   private static final aii<Boolean> bX = ail.a(cew.class, aik.k);
   private static final aii<Boolean> bY = ail.a(cew.class, aik.k);
   private int bZ = Integer.MIN_VALUE;
   private int ca;
   private static final blw cb = axl.a(20, 39);
   private int cc;
   @Nullable
   private UUID cd;

   public cew(bol<? extends cew> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new cew.a(this));
      this.bP.a(2, new bwe(this, 1.0, false));
      this.bP.a(7, new bxh(this, 1.0, 0.0F));
      this.bP.a(8, new bwc(this, cia.class, 8.0F));
      this.bP.a(8, new bwp(this));
      this.bP.a(10, new cew.b(this));
      this.bP.a(11, new cew.d(this));
      this.bQ.a(1, new cew.c(this, this::a_));
      this.bQ.a(2, new bxm(this));
      this.bQ.a(3, new bxn<>(this, cex.class, true, false));
      this.bQ.a(4, new bxt<>(this, false));
   }

   public static bqd.a u() {
      return cfg.gr().a(bqe.n, 40.0).a(bqe.o, 0.3F).a(bqe.c, 7.0).a(bqe.i, 64.0).a(bqe.r, 1.0);
   }

   @Override
   public void h(@Nullable box $$0) {
      super.h($$0);
      bqa $$1 = this.f(bqe.o);
      if ($$0 == null) {
         this.ca = 0;
         this.am.b(bX, false);
         this.am.b(bY, false);
         $$1.b(d.a());
      } else {
         this.ca = this.ag;
         this.am.b(bX, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bW, Optional.empty());
      this.am.a(bX, false);
      this.am.a(bY, false);
   }

   @Override
   public void c() {
      this.a(cb.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.cc = $$0;
   }

   @Override
   public int a() {
      return this.cc;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cd;
   }

   public void w() {
      if (this.ag >= this.bZ + 400) {
         this.bZ = this.ag;
         if (!this.aU()) {
            this.dJ().a(this.do(), this.ds(), this.du(), atp.hZ, this.cY(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aii<?> $$0) {
      if (bX.equals($$0) && this.gn() && this.dJ().B) {
         this.w();
      }

      super.a($$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      dme $$1 = this.gl();
      if ($$1 != null) {
         $$0.a("carriedBlockState", tn.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      dme $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = tn.a(this.dJ().a(ki.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dJ(), $$0);
   }

   boolean g(cia $$0) {
      cpq $$1 = $$0.fV().j.get(3);
      if ($$1.a(czh.ee.l())) {
         return false;
      } else {
         eov $$2 = $$0.f(1.0F).d();
         eov $$3 = new eov(this.do() - $$0.do(), this.ds() - $$0.ds(), this.du() - $$0.du());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.D(this) : false;
      }
   }

   @Override
   public void d_() {
      if (this.dJ().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dJ().a(kb.Z, this.d(0.5), this.dr() - 0.25, this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      }

      this.bk = false;
      if (!this.dJ().B) {
         this.a((apa)this.dJ(), true);
      }

      super.d_();
   }

   @Override
   public boolean fj() {
      return true;
   }

   @Override
   protected void aa() {
      if (this.dJ().P() && this.ag >= this.ca + 600) {
         float $$0 = this.bo();
         if ($$0 > 0.5F && this.dJ().h(this.dj()) && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.A();
         }
      }

      super.aa();
   }

   protected boolean A() {
      if (!this.dJ().y_() && this.bx()) {
         double $$0 = this.do() + (this.af.j() - 0.5) * 64.0;
         double $$1 = this.dq() + (double)(this.af.a(64) - 32);
         double $$2 = this.du() + (this.af.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(bof $$0) {
      eov $$1 = new eov(this.do() - $$0.do(), this.e(0.5) - $$0.ds(), this.du() - $$0.du());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.do() + (this.af.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dq() + (double)(this.af.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.du() + (this.af.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      ib.a $$3 = new ib.a($$0, $$1, $$2);

      while ($$3.v() > this.dJ().J_() && !this.dJ().a_($$3).d()) {
         $$3.c(ih.a);
      }

      dme $$4 = this.dJ().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(auj.a);
      if ($$5 && !$$6) {
         eov $$7 = this.dh();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dJ().a(dqr.R, $$7, dqr.a.a(this));
            if (!this.aU()) {
               this.dJ().a(null, this.J, this.K, this.L, atp.ia, this.cY(), 1.0F, 1.0F);
               this.a(atp.ia, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected ato y() {
      return this.gm() ? atp.hY : atp.hV;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.hX;
   }

   @Override
   protected ato n_() {
      return atp.hW;
   }

   @Override
   protected void a(bne $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dme $$3 = this.gl();
      if ($$3 != null) {
         cpq $$4 = new cpq(cpt.ph);
         $$4.a(cuc.v, 1);
         eke.a $$5 = new eke.a((apa)this.dJ()).a(emj.f, this.dh()).a(emj.i, $$4).b(emj.a, this);

         for (cpq $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dme $$0) {
      this.am.b(bW, Optional.ofNullable($$0));
   }

   @Nullable
   public dme gl() {
      return this.am.b(bW).orElse(null);
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cje;
         if (!$$0.a(aug.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dJ().y_() && !($$0.d() instanceof box) && this.af.a(10) != 0) {
               this.A();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cje)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.A()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bne $$0, cje $$1, float $$2) {
      cpq $$3 = $$1.q();
      il<crm> $$4 = cro.d($$3);
      List<bns> $$5 = cro.a($$3);
      boolean $$6 = $$4.a(crp.c) && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gm() {
      return this.am.b(bX);
   }

   public boolean gn() {
      return this.am.b(bY);
   }

   public void go() {
      this.am.b(bY, true);
   }

   @Override
   public boolean X() {
      return super.X() || this.gl() != null;
   }

   static class a extends bvu {
      private final cew a;
      @Nullable
      private box b;

      public a(cew $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.c, bvu.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cia)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cia)this.b);
         }
      }

      @Override
      public void c() {
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.b.do(), this.b.ds(), this.b.du());
      }
   }

   static class b extends bvu {
      private final cew a;

      public b(cew $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gl() == null) {
            return false;
         } else {
            return !this.a.dJ().Z().b(cwa.c) ? false : this.a.ef().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         awt $$0 = this.a.ef();
         cwe $$1 = this.a.dJ();
         int $$2 = awm.a(this.a.do() - 1.0 + $$0.j() * 2.0);
         int $$3 = awm.a(this.a.dq() + $$0.j() * 2.0);
         int $$4 = awm.a(this.a.du() - 1.0 + $$0.j() * 2.0);
         ib $$5 = new ib($$2, $$3, $$4);
         dme $$6 = $$1.a_($$5);
         ib $$7 = $$5.d();
         dme $$8 = $$1.a_($$7);
         dme $$9 = this.a.gl();
         if ($$9 != null) {
            $$9 = czf.b($$9, this.a.dJ(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dqr.i, $$5, dqr.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cwe $$0, ib $$1, dme $$2, dme $$3, dme $$4, ib $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(czh.F) && $$4.r($$0, $$5) && $$2.a((cwh)$$0, $$1) && $$0.a_(this.a, eoq.a(eov.a($$1))).isEmpty();
      }
   }

   static class c extends bxn<cia> {
      private final cew i;
      @Nullable
      private cia j;
      private int k;
      private int l;
      private final bzn m;
      private final bzn n = bzn.a().d();
      private final Predicate<box> o;

      public c(cew $$0, @Nullable Predicate<box> $$1) {
         super($$0, cia.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cia)$$1x) || $$0.a_($$1x)) && !$$0.y($$1x);
         this.m = bzn.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dJ().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.go();
      }

      @Override
      public void d() {
         this.j = null;
         super.d();
      }

      @Override
      public boolean b() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.y(this.c)) {
                  return false;
               }

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.b();
         }
      }

      @Override
      public void e() {
         if (this.i.q() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bL()) {
               if (this.i.g((cia)this.c)) {
                  if (this.c.f(this.i) < 16.0) {
                     this.i.A();
                  }

                  this.l = 0;
               } else if (this.c.f(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.a(this.c)) {
                  this.l = 0;
               }
            }

            super.e();
         }
      }
   }

   static class d extends bvu {
      private final cew a;

      public d(cew $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gl() != null) {
            return false;
         } else {
            return !this.a.dJ().Z().b(cwa.c) ? false : this.a.ef().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         awt $$0 = this.a.ef();
         cwe $$1 = this.a.dJ();
         int $$2 = awm.a(this.a.do() - 2.0 + $$0.j() * 4.0);
         int $$3 = awm.a(this.a.dq() + $$0.j() * 3.0);
         int $$4 = awm.a(this.a.du() - 2.0 + $$0.j() * 4.0);
         ib $$5 = new ib($$2, $$3, $$4);
         dme $$6 = $$1.a_($$5);
         eov $$7 = new eov((double)this.a.dn() + 0.5, (double)$$3 + 0.5, (double)this.a.dt() + 0.5);
         eov $$8 = new eov((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         eor $$9 = $$1.a(new cvn($$7, $$8, cvn.a.b, cvn.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(aue.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dqr.f, $$5, dqr.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
