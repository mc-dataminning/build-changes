import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byp extends byz implements bjd {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bkb d = new bkb(c, "Attacking speed boost", 0.15F, bkb.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final adx<Optional<dey>> bU = aea.a(byp.class, adz.j);
   private static final adx<Boolean> bV = aea.a(byp.class, adz.k);
   private static final adx<Boolean> bW = aea.a(byp.class, adz.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bfz bZ = ask.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public byp(bik<? extends byp> $$0, cpk $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(eam.j, -1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new byp.a(this));
      this.bO.a(2, new bqc(this, 1.0, false));
      this.bO.a(7, new brf(this, 1.0, 0.0F));
      this.bO.a(8, new bqa(this, cbl.class, 8.0F));
      this.bO.a(8, new bqn(this));
      this.bO.a(10, new byp.b(this));
      this.bO.a(11, new byp.d(this));
      this.bP.a(1, new byp.c(this, this::a_));
      this.bP.a(2, new brk(this));
      this.bP.a(3, new brl<>(this, byq.class, true, false));
      this.bP.a(4, new brr<>(this, false));
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.a, 40.0).a(bkd.d, 0.3F).a(bkd.f, 7.0).a(bkd.b, 64.0);
   }

   @Override
   public void h(@Nullable biw $$0) {
      super.h($$0);
      bjz $$1 = this.a(bkd.d);
      if ($$0 == null) {
         this.bY = 0;
         this.an.b(bV, false);
         this.an.b(bW, false);
         $$1.b(d.a());
      } else {
         this.bY = this.ah;
         this.an.b(bV, true);
         if (!$$1.a(d)) {
            $$1.b(d);
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bU, Optional.empty());
      this.an.a(bV, false);
      this.an.a(bW, false);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   public void q() {
      if (this.ah >= this.bX + 400) {
         this.bX = this.ah;
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dt(), this.dv(), aou.hg, this.da(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(adx<?> $$0) {
      if (bV.equals($$0) && this.gb() && this.dK().B) {
         this.q();
      }

      super.a($$0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      dey $$1 = this.fZ();
      if ($$1 != null) {
         $$0.a("carriedBlockState", re.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      dey $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = re.a(this.dK().a(jd.e), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dK(), $$0);
   }

   boolean g(cbl $$0) {
      ciw $$1 = $$0.fQ().j.get(3);
      if ($$1.a(csl.ef.k())) {
         return false;
      } else {
         ehf $$2 = $$0.f(1.0F).d();
         ehf $$3 = new ehf(this.dp() - $$0.dp(), this.dt() - $$0.dt(), this.dv() - $$0.dv());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void b_() {
      if (this.dK().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dK().a(iw.X, this.d(0.5), this.ds() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dK().B) {
         this.a((aki)this.dK(), true);
      }

      super.b_();
   }

   @Override
   public boolean fe() {
      return true;
   }

   @Override
   protected void V() {
      if (this.dK().N() && this.ah >= this.bY + 600) {
         float $$0 = this.bm();
         if ($$0 > 0.5F && this.dK().g(this.dk()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.t();
         }
      }

      super.V();
   }

   protected boolean t() {
      if (!this.dK().r_() && this.bv()) {
         double $$0 = this.dp() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.dr() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dv() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(big $$0) {
      ehf $$1 = new ehf(this.dp() - $$0.dp(), this.e(0.5) - $$0.dt(), this.dv() - $$0.dv());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dp() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dr() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dv() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      gv.a $$3 = new gv.a($$0, $$1, $$2);

      while ($$3.v() > this.dK().C_() && !this.dK().a_($$3).d()) {
         $$3.c(hb.a);
      }

      dey $$4 = this.dK().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(apo.a);
      if ($$5 && !$$6) {
         ehf $$7 = this.di();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dK().a(dji.R, $$7, dji.a.a(this));
            if (!this.aS()) {
               this.dK().a(null, this.K, this.L, this.M, aou.hh, this.da(), 1.0F, 1.0F);
               this.a(aou.hh, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected aot r() {
      return this.ga() ? aou.hf : aou.hc;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.he;
   }

   @Override
   protected aot h_() {
      return aou.hd;
   }

   @Override
   protected void a(bhe $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dey $$3 = this.fZ();
      if ($$3 != null) {
         ciw $$4 = new ciw(ciz.ou);
         $$4.a(cnh.v, 1);
         ecn.a $$5 = new ecn.a((aki)this.dK()).a(eet.f, this.di()).a(eet.i, $$4).b(eet.a, this);

         for (ciw $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dey $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dey fZ() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cco;
         if (!$$0.a(apl.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dK().r_() && !($$0.d() instanceof biw) && this.ag.a(10) != 0) {
               this.t();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cco)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bhe $$0, cco $$1, float $$2) {
      ciw $$3 = $$1.j();
      ckt $$4 = ckv.d($$3);
      List<bht> $$5 = ckv.a($$3);
      boolean $$6 = $$4 == ckw.c && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean ga() {
      return this.an.b(bV);
   }

   public boolean gb() {
      return this.an.b(bW);
   }

   public void gc() {
      this.an.b(bW, true);
   }

   @Override
   public boolean R() {
      return super.R() || this.fZ() != null;
   }

   static class a extends bps {
      private final byp a;
      @Nullable
      private biw b;

      public a(byp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.c, bps.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.j();
         if (!(this.b instanceof cbl)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cbl)this.b);
         }
      }

      @Override
      public void c() {
         this.a.H().n();
      }

      @Override
      public void e() {
         this.a.D().a(this.b.dp(), this.b.dt(), this.b.dv());
      }
   }

   static class b extends bps {
      private final byp a;

      public b(byp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.fZ() == null) {
            return false;
         } else {
            return !this.a.dK().X().b(cpg.c) ? false : this.a.ee().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         art $$0 = this.a.ee();
         cpk $$1 = this.a.dK();
         int $$2 = aro.a(this.a.dp() - 1.0 + $$0.j() * 2.0);
         int $$3 = aro.a(this.a.dr() + $$0.j() * 2.0);
         int $$4 = aro.a(this.a.dv() - 1.0 + $$0.j() * 2.0);
         gv $$5 = new gv($$2, $$3, $$4);
         dey $$6 = $$1.a_($$5);
         gv $$7 = $$5.d();
         dey $$8 = $$1.a_($$7);
         dey $$9 = this.a.fZ();
         if ($$9 != null) {
            $$9 = csk.b($$9, this.a.dK(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dji.i, $$5, dji.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cpk $$0, gv $$1, dey $$2, dey $$3, dey $$4, gv $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(csl.F) && $$4.r($$0, $$5) && $$2.a((cpn)$$0, $$1) && $$0.a_(this.a, eha.a(ehf.a($$1))).isEmpty();
      }
   }

   static class c extends brl<cbl> {
      private final byp i;
      @Nullable
      private cbl j;
      private int k;
      private int l;
      private final btj m;
      private final btj n = btj.a().d();
      private final Predicate<biw> o;

      public c(byp $$0, @Nullable Predicate<biw> $$1) {
         super($$0, cbl.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cbl)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = btj.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dK().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gc();
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
               if (this.i.z(this.c)) {
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
         if (this.i.j() == null) {
            super.a(null);
         }

         if (this.j != null) {
            if (--this.k <= 0) {
               this.c = this.j;
               this.j = null;
               super.c();
            }
         } else {
            if (this.c != null && !this.i.bN()) {
               if (this.i.g((cbl)this.c)) {
                  if (this.c.f(this.i) < 16.0) {
                     this.i.t();
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

   static class d extends bps {
      private final byp a;

      public d(byp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.fZ() != null) {
            return false;
         } else {
            return !this.a.dK().X().b(cpg.c) ? false : this.a.ee().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         art $$0 = this.a.ee();
         cpk $$1 = this.a.dK();
         int $$2 = aro.a(this.a.dp() - 2.0 + $$0.j() * 4.0);
         int $$3 = aro.a(this.a.dr() + $$0.j() * 3.0);
         int $$4 = aro.a(this.a.dv() - 2.0 + $$0.j() * 4.0);
         gv $$5 = new gv($$2, $$3, $$4);
         dey $$6 = $$1.a_($$5);
         ehf $$7 = new ehf((double)this.a.do() + 0.5, (double)$$3 + 0.5, (double)this.a.du() + 0.5);
         ehf $$8 = new ehf((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ehb $$9 = $$1.a(new cot($$7, $$8, cot.a.b, cot.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(apj.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dji.f, $$5, dji.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
