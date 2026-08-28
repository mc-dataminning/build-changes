import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckt extends cld implements bus {
   private static final ale c = ale.b("attacking");
   private static final bvs d = new bvs(c, 0.15F, bvs.a.a);
   private static final int e = 400;
   private static final int bY = 600;
   private static final akh<Optional<dus>> bZ = akl.a(ckt.class, akj.j);
   private static final akh<Boolean> ca = akl.a(ckt.class, akj.k);
   private static final akh<Boolean> cb = akl.a(ckt.class, akj.k);
   private int cc = Integer.MIN_VALUE;
   private int cd;
   private static final brd ce = bag.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public ckt(bty<? extends ckt> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.j, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new ckt.a(this));
      this.bS.a(2, new cbu(this, 1.0, false));
      this.bS.a(7, new ccx(this, 1.0, 0.0F));
      this.bS.a(8, new cbs(this, cnx.class, 8.0F));
      this.bS.a(8, new ccf(this));
      this.bS.a(10, new ckt.b(this));
      this.bS.a(11, new ckt.d(this));
      this.bT.a(1, new ckt.c(this, this::a_));
      this.bT.a(2, new cdc(this));
      this.bT.a(3, new cdd<>(this, cku.class, true, false));
      this.bT.a(4, new cdj<>(this, false));
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.s, 40.0).a(bvu.v, 0.3F).a(bvu.c, 7.0).a(bvu.m, 64.0).a(bvu.B, 1.0);
   }

   @Override
   public void h(@Nullable bun $$0) {
      super.h($$0);
      bvq $$1 = this.g(bvu.v);
      if ($$0 == null) {
         this.cd = 0;
         this.am.a(ca, false);
         this.am.a(cb, false);
         $$1.c(c);
      } else {
         this.cd = this.ag;
         this.am.a(ca, true);
         if (!$$1.b(c)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bZ, Optional.empty());
      $$0.a(ca, false);
      $$0.a(cb, false);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   public void t() {
      if (this.ag >= this.cc + 400) {
         this.cc = this.ag;
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dB(), this.dD(), awg.io, this.di(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(akh<?> $$0) {
      if (ca.equals($$0) && this.gq() && this.dS().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      dus $$1 = this.go();
      if ($$1 != null) {
         $$0.a("carriedBlockState", uv.a($$1));
      }

      this.a_($$0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      dus $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = uv.a(this.dS().a(lw.f), $$0.p("carriedBlockState"));
         if ($$1.l()) {
            $$1 = null;
         }
      }

      this.c($$1);
      this.a(this.dS(), $$0);
   }

   boolean f(cnx $$0) {
      cvs $$1 = $$0.gd().h.get(3);
      if ($$1.a(dho.ee.q())) {
         return false;
      } else {
         eyw $$2 = $$0.g(1.0F).d();
         eyw $$3 = new eyw(this.dx() - $$0.dx(), this.dB() - $$0.dB(), this.dD() - $$0.dD());
         double $$4 = $$3.g();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.G(this) : false;
      }
   }

   @Override
   public void n_() {
      if (this.dS().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dS().a(lo.ac, this.d(0.5), this.dA() - 0.25, this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dS().B) {
         this.a((arj)this.dS(), true);
      }

      super.n_();
   }

   @Override
   public boolean fo() {
      return true;
   }

   @Override
   protected void ac() {
      if (this.dS().S() && this.ag >= this.cd + 600) {
         float $$0 = this.bx();
         if ($$0 > 0.5F && this.dS().h(this.ds()) && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.ac();
   }

   protected boolean y() {
      if (!this.dS().x_() && this.bI()) {
         double $$0 = this.dx() + (this.af.j() - 0.5) * 64.0;
         double $$1 = this.dz() + (double)(this.af.a(64) - 32);
         double $$2 = this.dD() + (this.af.j() - 0.5) * 64.0;
         return this.q($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean c(btr $$0) {
      eyw $$1 = new eyw(this.dx() - $$0.dx(), this.e(0.5) - $$0.dB(), this.dD() - $$0.dD());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dx() + (this.af.j() - 0.5) * 8.0 - $$1.d * 16.0;
      double $$4 = this.dz() + (double)(this.af.a(16) - 8) - $$1.e * 16.0;
      double $$5 = this.dD() + (this.af.j() - 0.5) * 8.0 - $$1.f * 16.0;
      return this.q($$3, $$4, $$5);
   }

   private boolean q(double $$0, double $$1, double $$2) {
      jf.a $$3 = new jf.a($$0, $$1, $$2);

      while ($$3.v() > this.dS().H_() && !this.dS().a_($$3).d()) {
         $$3.c(jk.a);
      }

      dus $$4 = this.dS().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.y().a(axb.a);
      if ($$5 && !$$6) {
         eyw $$7 = this.dq();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dS().a(dzp.R, $$7, dzp.a.a(this));
            if (!this.ba()) {
               this.dS().a(null, this.L, this.M, this.N, awg.ip, this.di(), 1.0F, 1.0F);
               this.a(awg.ip, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected awf w() {
      return this.gp() ? awg.in : awg.ik;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.im;
   }

   @Override
   protected awf o_() {
      return awg.il;
   }

   @Override
   protected void a(arj $$0, bsj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dus $$3 = this.go();
      if ($$3 != null) {
         cvs $$4 = new cvs(cvw.pk);
         dbp.a($$4, $$0.G_(), ddb.g, $$0.d_(this.ds()), this.dV());
         eto.a $$5 = new eto.a((arj)this.dS()).a(ewh.f, this.dq()).a(ewh.i, $$4).b(ewh.a, this);

         for (cvs $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void c(@Nullable dus $$0) {
      this.am.a(bZ, Optional.ofNullable($$0));
   }

   @Nullable
   public dus go() {
      return this.am.a(bZ).orElse(null);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cpd;
         if (!$$0.a(awx.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dS().x_() && !($$0.d() instanceof bun) && this.af.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cpd)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bsj $$0, cpd $$1, float $$2) {
      cvs $$3 = $$1.m();
      cxr $$4 = $$3.a(ks.L, cxr.a);
      return $$4.a(cxs.a) ? super.a($$0, $$2) : false;
   }

   public boolean gp() {
      return this.am.a(ca);
   }

   public boolean gq() {
      return this.am.a(cb);
   }

   public void gr() {
      this.am.a(cb, true);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.go() != null;
   }

   static class a extends cbk {
      private final ckt a;
      @Nullable
      private bun b;

      public a(ckt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbk.a.c, cbk.a.a));
      }

      @Override
      public boolean b() {
         this.b = this.a.m();
         if (!(this.b instanceof cnx)) {
            return false;
         } else {
            double $$0 = this.b.g(this.a);
            return $$0 > 256.0 ? false : this.a.f((cnx)this.b);
         }
      }

      @Override
      public void d() {
         this.a.P().o();
      }

      @Override
      public void a() {
         this.a.K().a(this.b.dx(), this.b.dB(), this.b.dD());
      }
   }

   static class b extends cbk {
      private final ckt a;

      public b(ckt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.go() == null) {
            return false;
         } else {
            return !this.a.dS().ac().b(def.c) ? false : this.a.dV().a(b(2000)) == 0;
         }
      }

      @Override
      public void a() {
         azn $$0 = this.a.dV();
         dej $$1 = this.a.dS();
         int $$2 = azf.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         int $$3 = azf.a(this.a.dz() + $$0.j() * 2.0);
         int $$4 = azf.a(this.a.dD() - 1.0 + $$0.j() * 2.0);
         jf $$5 = new jf($$2, $$3, $$4);
         dus $$6 = $$1.a_($$5);
         jf $$7 = $$5.e();
         dus $$8 = $$1.a_($$7);
         dus $$9 = this.a.go();
         if ($$9 != null) {
            $$9 = dhm.b($$9, this.a.dS(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dzp.i, $$5, dzp.a.a(this.a, $$9));
               this.a.c(null);
            }
         }
      }

      private boolean a(dej $$0, jf $$1, dus $$2, dus $$3, dus $$4, jf $$5) {
         return $$3.l() && !$$4.l() && !$$4.a(dho.F) && $$4.m($$0, $$5) && $$2.a((dem)$$0, $$1) && $$0.a_(this.a, eyr.a(eyw.a($$1))).isEmpty();
      }
   }

   static class c extends cdd<cnx> {
      private final ckt i;
      @Nullable
      private cnx j;
      private int k;
      private int l;
      private final cfd m;
      private final cfd n = cfd.a().d();
      private final Predicate<bun> o;

      public c(ckt $$0, @Nullable Predicate<bun> $$1) {
         super($$0, cnx.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.f((cnx)$$1x) || $$0.a_($$1x)) && !$$0.A($$1x);
         this.m = cfd.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean b() {
         this.j = this.i.dS().a(this.m.a(this.l()), this.i);
         return this.j != null;
      }

      @Override
      public void d() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gr();
      }

      @Override
      public void e() {
         this.j = null;
         super.e();
      }

      @Override
      public boolean c() {
         if (this.j != null) {
            if (!this.o.test(this.j)) {
               return false;
            } else {
               this.i.a(this.j, 10.0F, 10.0F);
               return true;
            }
         } else {
            if (this.c != null) {
               if (this.i.A(this.c)) {
                  return false;
               }

               if (this.n.a(this.i, this.c)) {
                  return true;
               }
            }

            return super.c();
         }
      }

      @Override
      public void a() {
         if (this.i.m() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.d();
            }
         } else {
            if (this.c != null && !this.i.bW()) {
               if (this.i.f((cnx)this.c)) {
                  if (this.c.g(this.i) < 16.0) {
                     this.i.y();
                  }

                  this.l = 0;
               } else if (this.c.g(this.i) > 256.0 && this.l++ >= this.a(30) && this.i.c(this.c)) {
                  this.l = 0;
               }
            }

            super.a();
         }
      }
   }

   static class d extends cbk {
      private final ckt a;

      public d(ckt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (this.a.go() != null) {
            return false;
         } else {
            return !this.a.dS().ac().b(def.c) ? false : this.a.dV().a(b(20)) == 0;
         }
      }

      @Override
      public void a() {
         azn $$0 = this.a.dV();
         dej $$1 = this.a.dS();
         int $$2 = azf.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         int $$3 = azf.a(this.a.dz() + $$0.j() * 3.0);
         int $$4 = azf.a(this.a.dD() - 2.0 + $$0.j() * 4.0);
         jf $$5 = new jf($$2, $$3, $$4);
         dus $$6 = $$1.a_($$5);
         eyw $$7 = new eyw((double)this.a.dw() + 0.5, (double)$$3 + 0.5, (double)this.a.dC() + 0.5);
         eyw $$8 = new eyw((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         eys $$9 = $$1.a(new ddr($$7, $$8, ddr.a.b, ddr.b.a, this.a));
         boolean $$10 = $$9.b().equals($$5);
         if ($$6.a(awv.am) && $$10) {
            $$1.a($$5, false);
            $$1.a(dzp.f, $$5, dzp.a.a(this.a, $$6));
            this.a.c($$6.b().n());
         }
      }
   }
}
