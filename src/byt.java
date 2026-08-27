import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byt extends bzd implements bji {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bkf d = new bkf(c, "Attacking speed boost", 0.15F, bkf.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final aec<Optional<dfe>> bU = aef.a(byt.class, aee.j);
   private static final aec<Boolean> bV = aef.a(byt.class, aee.k);
   private static final aec<Boolean> bW = aef.a(byt.class, aee.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bge bZ = asp.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public byt(bip<? extends byt> $$0, cpq $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(eas.j, -1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new byt.a(this));
      this.bO.a(2, new bqg(this, 1.0, false));
      this.bO.a(7, new brj(this, 1.0, 0.0F));
      this.bO.a(8, new bqe(this, cbp.class, 8.0F));
      this.bO.a(8, new bqr(this));
      this.bO.a(10, new byt.b(this));
      this.bO.a(11, new byt.d(this));
      this.bP.a(1, new byt.c(this, this::a_));
      this.bP.a(2, new bro(this));
      this.bP.a(3, new brp<>(this, byu.class, true, false));
      this.bP.a(4, new brv<>(this, false));
   }

   public static bkg.a p() {
      return bzd.gg().a(bkh.a, 40.0).a(bkh.d, 0.3F).a(bkh.f, 7.0).a(bkh.b, 64.0);
   }

   @Override
   public void h(@Nullable bjb $$0) {
      super.h($$0);
      bkd $$1 = this.a(bkh.d);
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
            this.dK().a(this.dp(), this.dt(), this.dv(), aoz.hg, this.da(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aec<?> $$0) {
      if (bV.equals($$0) && this.gc() && this.dK().B) {
         this.q();
      }

      super.a($$0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      dfe $$1 = this.ga();
      if ($$1 != null) {
         $$0.a("carriedBlockState", rg.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      dfe $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = rg.a(this.dK().a(je.e), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dK(), $$0);
   }

   boolean g(cbp $$0) {
      cja $$1 = $$0.fQ().j.get(3);
      if ($$1.a(csr.ef.k())) {
         return false;
      } else {
         ehi $$2 = $$0.f(1.0F).d();
         ehi $$3 = new ehi(this.dp() - $$0.dp(), this.dt() - $$0.dt(), this.dv() - $$0.dv());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void b_() {
      if (this.dK().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dK().a(ix.X, this.d(0.5), this.ds() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dK().B) {
         this.a((akn)this.dK(), true);
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

   boolean a(bil $$0) {
      ehi $$1 = new ehi(this.dp() - $$0.dp(), this.e(0.5) - $$0.dt(), this.dv() - $$0.dv());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dp() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dr() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dv() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      gw.a $$3 = new gw.a($$0, $$1, $$2);

      while ($$3.v() > this.dK().C_() && !this.dK().a_($$3).d()) {
         $$3.c(hc.a);
      }

      dfe $$4 = this.dK().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(apt.a);
      if ($$5 && !$$6) {
         ehi $$7 = this.di();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dK().a(djo.R, $$7, djo.a.a(this));
            if (!this.aS()) {
               this.dK().a(null, this.K, this.L, this.M, aoz.hh, this.da(), 1.0F, 1.0F);
               this.a(aoz.hh, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected aoy r() {
      return this.gb() ? aoz.hf : aoz.hc;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.he;
   }

   @Override
   protected aoy h_() {
      return aoz.hd;
   }

   @Override
   protected void a(bhj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dfe $$3 = this.ga();
      if ($$3 != null) {
         cja $$4 = new cja(cjd.ou);
         $$4.a(cnn.v, 1);
         ecr.a $$5 = new ecr.a((akn)this.dK()).a(eew.f, this.di()).a(eew.i, $$4).b(eew.a, this);

         for (cja $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dfe $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dfe ga() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof ccs;
         if (!$$0.a(apq.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dK().r_() && !($$0.d() instanceof bjb) && this.ag.a(10) != 0) {
               this.t();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (ccs)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.t()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bhj $$0, ccs $$1, float $$2) {
      cja $$3 = $$1.j();
      ckx $$4 = ckz.d($$3);
      List<bhy> $$5 = ckz.a($$3);
      boolean $$6 = $$4 == cla.c && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gb() {
      return this.an.b(bV);
   }

   public boolean gc() {
      return this.an.b(bW);
   }

   public void gd() {
      this.an.b(bW, true);
   }

   @Override
   public boolean R() {
      return super.R() || this.ga() != null;
   }

   static class a extends bpw {
      private final byt a;
      @Nullable
      private bjb b;

      public a(byt $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpw.a.c, bpw.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.j();
         if (!(this.b instanceof cbp)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cbp)this.b);
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

   static class b extends bpw {
      private final byt a;

      public b(byt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ga() == null) {
            return false;
         } else {
            return !this.a.dK().X().b(cpm.c) ? false : this.a.ee().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         arx $$0 = this.a.ee();
         cpq $$1 = this.a.dK();
         int $$2 = ars.a(this.a.dp() - 1.0 + $$0.j() * 2.0);
         int $$3 = ars.a(this.a.dr() + $$0.j() * 2.0);
         int $$4 = ars.a(this.a.dv() - 1.0 + $$0.j() * 2.0);
         gw $$5 = new gw($$2, $$3, $$4);
         dfe $$6 = $$1.a_($$5);
         gw $$7 = $$5.d();
         dfe $$8 = $$1.a_($$7);
         dfe $$9 = this.a.ga();
         if ($$9 != null) {
            $$9 = csq.b($$9, this.a.dK(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(djo.i, $$5, djo.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cpq $$0, gw $$1, dfe $$2, dfe $$3, dfe $$4, gw $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(csr.F) && $$4.r($$0, $$5) && $$2.a((cpt)$$0, $$1) && $$0.a_(this.a, ehd.a(ehi.a($$1))).isEmpty();
      }
   }

   static class c extends brp<cbp> {
      private final byt i;
      @Nullable
      private cbp j;
      private int k;
      private int l;
      private final btn m;
      private final btn n = btn.a().d();
      private final Predicate<bjb> o;

      public c(byt $$0, @Nullable Predicate<bjb> $$1) {
         super($$0, cbp.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cbp)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = btn.a().a(this.l()).a(this.o);
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
         this.i.gd();
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
               if (this.i.g((cbp)this.c)) {
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

   static class d extends bpw {
      private final byt a;

      public d(byt $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ga() != null) {
            return false;
         } else {
            return !this.a.dK().X().b(cpm.c) ? false : this.a.ee().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         arx $$0 = this.a.ee();
         cpq $$1 = this.a.dK();
         int $$2 = ars.a(this.a.dp() - 2.0 + $$0.j() * 4.0);
         int $$3 = ars.a(this.a.dr() + $$0.j() * 3.0);
         int $$4 = ars.a(this.a.dv() - 2.0 + $$0.j() * 4.0);
         gw $$5 = new gw($$2, $$3, $$4);
         dfe $$6 = $$1.a_($$5);
         ehi $$7 = new ehi((double)this.a.do() + 0.5, (double)$$3 + 0.5, (double)this.a.du() + 0.5);
         ehi $$8 = new ehi((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ehe $$9 = $$1.a(new coz($$7, $$8, coz.a.b, coz.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(apo.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(djo.f, $$5, djo.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
