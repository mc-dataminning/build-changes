import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccm extends ccw implements bmv {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bns d = new bns(c, "Attacking speed boost", 0.15F, bns.a.a);
   private static final int e = 400;
   private static final int bU = 600;
   private static final agn<Optional<djp>> bV = agq.a(ccm.class, agp.j);
   private static final agn<Boolean> bW = agq.a(ccm.class, agp.k);
   private static final agn<Boolean> bX = agq.a(ccm.class, agp.k);
   private int bY = Integer.MIN_VALUE;
   private int bZ;
   private static final bjn ca = avq.a(20, 39);
   private int cb;
   @Nullable
   private UUID cc;

   public ccm(bmc<? extends ccm> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bte(this));
      this.bP.a(1, new ccm.a(this));
      this.bP.a(2, new btu(this, 1.0, false));
      this.bP.a(7, new bux(this, 1.0, 0.0F));
      this.bP.a(8, new bts(this, cfq.class, 8.0F));
      this.bP.a(8, new buf(this));
      this.bP.a(10, new ccm.b(this));
      this.bP.a(11, new ccm.d(this));
      this.bQ.a(1, new ccm.c(this, this::a_));
      this.bQ.a(2, new bvc(this));
      this.bQ.a(3, new bvd<>(this, ccn.class, true, false));
      this.bQ.a(4, new bvj<>(this, false));
   }

   public static bnt.a u() {
      return ccw.gl().a(bnu.n, 40.0).a(bnu.o, 0.3F).a(bnu.c, 7.0).a(bnu.i, 64.0).a(bnu.r, 1.0);
   }

   @Override
   public void h(@Nullable bmo $$0) {
      super.h($$0);
      bnq $$1 = this.f(bnu.o);
      if ($$0 == null) {
         this.bZ = 0;
         this.an.b(bW, false);
         this.an.b(bX, false);
         $$1.b(d.a());
      } else {
         this.bZ = this.ah;
         this.an.b(bW, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bV, Optional.empty());
      this.an.a(bW, false);
      this.an.a(bX, false);
   }

   @Override
   public void c() {
      this.a(ca.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.cb = $$0;
   }

   @Override
   public int a() {
      return this.cb;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cc;
   }

   public void w() {
      if (this.ah >= this.bY + 400) {
         this.bY = this.ah;
         if (!this.aU()) {
            this.dL().a(this.dq(), this.du(), this.dw(), art.hY, this.db(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(agn<?> $$0) {
      if (bW.equals($$0) && this.gh() && this.dL().B) {
         this.w();
      }

      super.a($$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      djp $$1 = this.gf();
      if ($$1 != null) {
         $$0.a("carriedBlockState", td.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      djp $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = td.a(this.dL().a(ke.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dL(), $$0);
   }

   boolean g(cfq $$0) {
      cng $$1 = $$0.fS().j.get(3);
      if ($$1.a(cxa.ee.j())) {
         return false;
      } else {
         emc $$2 = $$0.f(1.0F).d();
         emc $$3 = new emc(this.dq() - $$0.dq(), this.du() - $$0.du(), this.dw() - $$0.dw());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.D(this) : false;
      }
   }

   @Override
   public void d_() {
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(jx.Z, this.d(0.5), this.dt() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dL().B) {
         this.a((ane)this.dL(), true);
      }

      super.d_();
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   protected void aa() {
      if (this.dL().P() && this.ah >= this.bZ + 600) {
         float $$0 = this.bo();
         if ($$0 > 0.5F && this.dL().h(this.dl()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.A();
         }
      }

      super.aa();
   }

   protected boolean A() {
      if (!this.dL().y_() && this.bx()) {
         double $$0 = this.dq() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.ds() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dw() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(blw $$0) {
      emc $$1 = new emc(this.dq() - $$0.dq(), this.e(0.5) - $$0.du(), this.dw() - $$0.dw());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dq() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.ds() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dw() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      hx.a $$3 = new hx.a($$0, $$1, $$2);

      while ($$3.v() > this.dL().J_() && !this.dL().a_($$3).d()) {
         $$3.c(ic.a);
      }

      djp $$4 = this.dL().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(asn.a);
      if ($$5 && !$$6) {
         emc $$7 = this.dj();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dL().a(dnz.R, $$7, dnz.a.a(this));
            if (!this.aU()) {
               this.dL().a(null, this.K, this.L, this.M, art.hZ, this.db(), 1.0F, 1.0F);
               this.a(art.hZ, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected ars y() {
      return this.gg() ? art.hX : art.hU;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.hW;
   }

   @Override
   protected ars n_() {
      return art.hV;
   }

   @Override
   protected void a(bkv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      djp $$3 = this.gf();
      if ($$3 != null) {
         cng $$4 = new cng(cnj.ph);
         $$4.a(crv.v, 1);
         ehl.a $$5 = new ehl.a((ane)this.dL()).a(ejq.f, this.dj()).a(ejq.i, $$4).b(ejq.a, this);

         for (cng $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable djp $$0) {
      this.an.b(bV, Optional.ofNullable($$0));
   }

   @Nullable
   public djp gf() {
      return this.an.b(bV).orElse(null);
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cgt;
         if (!$$0.a(ask.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dL().y_() && !($$0.d() instanceof bmo) && this.ag.a(10) != 0) {
               this.A();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cgt)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.A()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bkv $$0, cgt $$1, float $$2) {
      cng $$3 = $$1.q();
      ih<cpe> $$4 = cpg.d($$3);
      List<blj> $$5 = cpg.a($$3);
      boolean $$6 = $$4.a(cph.c) && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gg() {
      return this.an.b(bW);
   }

   public boolean gh() {
      return this.an.b(bX);
   }

   public void gi() {
      this.an.b(bX, true);
   }

   @Override
   public boolean X() {
      return super.X() || this.gf() != null;
   }

   static class a extends btk {
      private final ccm a;
      @Nullable
      private bmo b;

      public a(ccm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.c, btk.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cfq)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cfq)this.b);
         }
      }

      @Override
      public void c() {
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.b.dq(), this.b.du(), this.b.dw());
      }
   }

   static class b extends btk {
      private final ccm a;

      public b(ccm $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gf() == null) {
            return false;
         } else {
            return !this.a.dL().Z().b(ctt.c) ? false : this.a.eg().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         auw $$0 = this.a.eg();
         ctx $$1 = this.a.dL();
         int $$2 = aup.a(this.a.dq() - 1.0 + $$0.j() * 2.0);
         int $$3 = aup.a(this.a.ds() + $$0.j() * 2.0);
         int $$4 = aup.a(this.a.dw() - 1.0 + $$0.j() * 2.0);
         hx $$5 = new hx($$2, $$3, $$4);
         djp $$6 = $$1.a_($$5);
         hx $$7 = $$5.d();
         djp $$8 = $$1.a_($$7);
         djp $$9 = this.a.gf();
         if ($$9 != null) {
            $$9 = cwy.b($$9, this.a.dL(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dnz.i, $$5, dnz.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(ctx $$0, hx $$1, djp $$2, djp $$3, djp $$4, hx $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cxa.F) && $$4.r($$0, $$5) && $$2.a((cua)$$0, $$1) && $$0.a_(this.a, elx.a(emc.a($$1))).isEmpty();
      }
   }

   static class c extends bvd<cfq> {
      private final ccm i;
      @Nullable
      private cfq j;
      private int k;
      private int l;
      private final bxd m;
      private final bxd n = bxd.a().d();
      private final Predicate<bmo> o;

      public c(ccm $$0, @Nullable Predicate<bmo> $$1) {
         super($$0, cfq.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cfq)$$1x) || $$0.a_($$1x)) && !$$0.y($$1x);
         this.m = bxd.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dL().a(this.m, this.i);
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
            if (this.c != null && !this.i.bO()) {
               if (this.i.g((cfq)this.c)) {
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

   static class d extends btk {
      private final ccm a;

      public d(ccm $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gf() != null) {
            return false;
         } else {
            return !this.a.dL().Z().b(ctt.c) ? false : this.a.eg().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         auw $$0 = this.a.eg();
         ctx $$1 = this.a.dL();
         int $$2 = aup.a(this.a.dq() - 2.0 + $$0.j() * 4.0);
         int $$3 = aup.a(this.a.ds() + $$0.j() * 3.0);
         int $$4 = aup.a(this.a.dw() - 2.0 + $$0.j() * 4.0);
         hx $$5 = new hx($$2, $$3, $$4);
         djp $$6 = $$1.a_($$5);
         emc $$7 = new emc((double)this.a.dp() + 0.5, (double)$$3 + 0.5, (double)this.a.dv() + 0.5);
         emc $$8 = new emc((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ely $$9 = $$1.a(new ctg($$7, $$8, ctg.a.b, ctg.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(asi.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dnz.f, $$5, dnz.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
