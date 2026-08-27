import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cay extends cbi implements bln {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bmk d = new bmk(c, "Attacking speed boost", 0.15F, bmk.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final afo<Optional<dhi>> bU = afr.a(cay.class, afq.j);
   private static final afo<Boolean> bV = afr.a(cay.class, afq.k);
   private static final afo<Boolean> bW = afr.a(cay.class, afq.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bii bZ = aul.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cay(bku<? extends cay> $$0, csa $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(edd.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new brv(this));
      this.bO.a(1, new cay.a(this));
      this.bO.a(2, new bsl(this, 1.0, false));
      this.bO.a(7, new bto(this, 1.0, 0.0F));
      this.bO.a(8, new bsj(this, cdu.class, 8.0F));
      this.bO.a(8, new bsw(this));
      this.bO.a(10, new cay.b(this));
      this.bO.a(11, new cay.d(this));
      this.bP.a(1, new cay.c(this, this::a_));
      this.bP.a(2, new btt(this));
      this.bP.a(3, new btu<>(this, caz.class, true, false));
      this.bP.a(4, new bua<>(this, false));
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.l, 40.0).a(bmm.m, 0.3F).a(bmm.c, 7.0).a(bmm.g, 64.0);
   }

   @Override
   public void h(@Nullable blg $$0) {
      super.h($$0);
      bmi $$1 = this.a(bmm.m);
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
   protected void b_() {
      super.b_();
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

   public void w() {
      if (this.ah >= this.bX + 400) {
         this.bX = this.ah;
         if (!this.aU()) {
            this.dN().a(this.ds(), this.dw(), this.dy(), aqr.hA, this.dc(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(afo<?> $$0) {
      if (bV.equals($$0) && this.gh() && this.dN().B) {
         this.w();
      }

      super.a($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      dhi $$1 = this.gf();
      if ($$1 != null) {
         $$0.a("carriedBlockState", so.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      dhi $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = so.a(this.dN().a(jz.e), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dN(), $$0);
   }

   boolean g(cdu $$0) {
      clj $$1 = $$0.fT().j.get(3);
      if ($$1.a(cvc.ee.k())) {
         return false;
      } else {
         eju $$2 = $$0.f(1.0F).d();
         eju $$3 = new eju(this.ds() - $$0.ds(), this.dw() - $$0.dw(), this.dy() - $$0.dy());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void c_() {
      if (this.dN().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dN().a(js.X, this.d(0.5), this.dv() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dN().B) {
         this.a((ame)this.dN(), true);
      }

      super.c_();
   }

   @Override
   public boolean fi() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dN().O() && this.ah >= this.bY + 600) {
         float $$0 = this.bo();
         if ($$0 > 0.5F && this.dN().g(this.dn()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.A();
         }
      }

      super.Z();
   }

   protected boolean A() {
      if (!this.dN().x_() && this.bx()) {
         double $$0 = this.ds() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.du() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dy() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(bkq $$0) {
      eju $$1 = new eju(this.ds() - $$0.ds(), this.e(0.5) - $$0.dw(), this.dy() - $$0.dy());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.ds() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.du() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dy() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      ht.a $$3 = new ht.a($$0, $$1, $$2);

      while ($$3.v() > this.dN().I_() && !this.dN().a_($$3).d()) {
         $$3.c(hx.a);
      }

      dhi $$4 = this.dN().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(arl.a);
      if ($$5 && !$$6) {
         eju $$7 = this.dl();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dN().a(dls.R, $$7, dls.a.a(this));
            if (!this.aU()) {
               this.dN().a(null, this.K, this.L, this.M, aqr.hB, this.dc(), 1.0F, 1.0F);
               this.a(aqr.hB, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected aqq y() {
      return this.gg() ? aqr.hz : aqr.hw;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.hy;
   }

   @Override
   protected aqq m_() {
      return aqr.hx;
   }

   @Override
   protected void a(bjo $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dhi $$3 = this.gf();
      if ($$3 != null) {
         clj $$4 = new clj(clm.pf);
         $$4.a(cpy.v, 1);
         efd.a $$5 = new efd.a((ame)this.dN()).a(ehi.f, this.dl()).a(ehi.i, $$4).b(ehi.a, this);

         for (clj $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dhi $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dhi gf() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cex;
         if (!$$0.a(ari.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dN().x_() && !($$0.d() instanceof blg) && this.ag.a(10) != 0) {
               this.A();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cex)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.A()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bjo $$0, cex $$1, float $$2) {
      clj $$3 = $$1.q();
      cng $$4 = cni.d($$3);
      List<bkd> $$5 = cni.a($$3);
      boolean $$6 = $$4 == cnj.c && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gg() {
      return this.an.b(bV);
   }

   public boolean gh() {
      return this.an.b(bW);
   }

   public void gi() {
      this.an.b(bW, true);
   }

   @Override
   public boolean W() {
      return super.W() || this.gf() != null;
   }

   static class a extends bsb {
      private final cay a;
      @Nullable
      private blg b;

      public a(cay $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.c, bsb.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cdu)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cdu)this.b);
         }
      }

      @Override
      public void c() {
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.b.ds(), this.b.dw(), this.b.dy());
      }
   }

   static class b extends bsb {
      private final cay a;

      public b(cay $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gf() == null) {
            return false;
         } else {
            return !this.a.dN().Y().b(crw.c) ? false : this.a.eh().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ats $$0 = this.a.eh();
         csa $$1 = this.a.dN();
         int $$2 = atm.a(this.a.ds() - 1.0 + $$0.j() * 2.0);
         int $$3 = atm.a(this.a.du() + $$0.j() * 2.0);
         int $$4 = atm.a(this.a.dy() - 1.0 + $$0.j() * 2.0);
         ht $$5 = new ht($$2, $$3, $$4);
         dhi $$6 = $$1.a_($$5);
         ht $$7 = $$5.d();
         dhi $$8 = $$1.a_($$7);
         dhi $$9 = this.a.gf();
         if ($$9 != null) {
            $$9 = cva.b($$9, this.a.dN(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dls.i, $$5, dls.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(csa $$0, ht $$1, dhi $$2, dhi $$3, dhi $$4, ht $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cvc.F) && $$4.r($$0, $$5) && $$2.a((csd)$$0, $$1) && $$0.a_(this.a, ejp.a(eju.a($$1))).isEmpty();
      }
   }

   static class c extends btu<cdu> {
      private final cay i;
      @Nullable
      private cdu j;
      private int k;
      private int l;
      private final bvs m;
      private final bvs n = bvs.a().d();
      private final Predicate<blg> o;

      public c(cay $$0, @Nullable Predicate<blg> $$1) {
         super($$0, cdu.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cdu)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = bvs.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dN().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gi();
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
            if (this.c != null && !this.i.bO()) {
               if (this.i.g((cdu)this.c)) {
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

   static class d extends bsb {
      private final cay a;

      public d(cay $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gf() != null) {
            return false;
         } else {
            return !this.a.dN().Y().b(crw.c) ? false : this.a.eh().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ats $$0 = this.a.eh();
         csa $$1 = this.a.dN();
         int $$2 = atm.a(this.a.ds() - 2.0 + $$0.j() * 4.0);
         int $$3 = atm.a(this.a.du() + $$0.j() * 3.0);
         int $$4 = atm.a(this.a.dy() - 2.0 + $$0.j() * 4.0);
         ht $$5 = new ht($$2, $$3, $$4);
         dhi $$6 = $$1.a_($$5);
         eju $$7 = new eju((double)this.a.dr() + 0.5, (double)$$3 + 0.5, (double)this.a.dx() + 0.5);
         eju $$8 = new eju((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ejq $$9 = $$1.a(new crj($$7, $$8, crj.a.b, crj.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(arg.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dls.f, $$5, dls.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
