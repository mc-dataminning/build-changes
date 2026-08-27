import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class caq extends cba implements blf {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bmc d = new bmc(c, "Attacking speed boost", 0.15F, bmc.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final afm<Optional<dgw>> bU = afp.a(caq.class, afo.j);
   private static final afm<Boolean> bV = afp.a(caq.class, afo.k);
   private static final afm<Boolean> bW = afp.a(caq.class, afo.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bib bZ = aug.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public caq(bkm<? extends caq> $$0, crs $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(ecr.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(0, new brn(this));
      this.bO.a(1, new caq.a(this));
      this.bO.a(2, new bsd(this, 1.0, false));
      this.bO.a(7, new btg(this, 1.0, 0.0F));
      this.bO.a(8, new bsb(this, cdm.class, 8.0F));
      this.bO.a(8, new bso(this));
      this.bO.a(10, new caq.b(this));
      this.bO.a(11, new caq.d(this));
      this.bP.a(1, new caq.c(this, this::a_));
      this.bP.a(2, new btl(this));
      this.bP.a(3, new btm<>(this, car.class, true, false));
      this.bP.a(4, new bts<>(this, false));
   }

   public static bmd.a s() {
      return cba.gk().a(bme.l, 40.0).a(bme.m, 0.3F).a(bme.c, 7.0).a(bme.g, 64.0);
   }

   @Override
   public void h(@Nullable bky $$0) {
      super.h($$0);
      bma $$1 = this.a(bme.m);
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

   public void t() {
      if (this.ah >= this.bX + 400) {
         this.bX = this.ah;
         if (!this.aS()) {
            this.dL().a(this.dq(), this.du(), this.dw(), aqn.hk, this.da(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(afm<?> $$0) {
      if (bV.equals($$0) && this.gg() && this.dL().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      dgw $$1 = this.ge();
      if ($$1 != null) {
         $$0.a("carriedBlockState", so.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      dgw $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = so.a(this.dL().a(jz.e), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dL(), $$0);
   }

   boolean g(cdm $$0) {
      clb $$1 = $$0.fS().j.get(3);
      if ($$1.a(cuv.ee.k())) {
         return false;
      } else {
         eji $$2 = $$0.f(1.0F).d();
         eji $$3 = new eji(this.dq() - $$0.dq(), this.du() - $$0.du(), this.dw() - $$0.dw());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void c_() {
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(js.X, this.d(0.5), this.dt() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dL().B) {
         this.a((ama)this.dL(), true);
      }

      super.c_();
   }

   @Override
   public boolean fg() {
      return true;
   }

   @Override
   protected void X() {
      if (this.dL().N() && this.ah >= this.bY + 600) {
         float $$0 = this.bm();
         if ($$0 > 0.5F && this.dL().g(this.dl()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.y();
         }
      }

      super.X();
   }

   protected boolean y() {
      if (!this.dL().x_() && this.bv()) {
         double $$0 = this.dq() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.ds() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dw() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(bki $$0) {
      eji $$1 = new eji(this.dq() - $$0.dq(), this.e(0.5) - $$0.du(), this.dw() - $$0.dw());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dq() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.ds() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dw() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      ht.a $$3 = new ht.a($$0, $$1, $$2);

      while ($$3.v() > this.dL().I_() && !this.dL().a_($$3).d()) {
         $$3.c(hx.a);
      }

      dgw $$4 = this.dL().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(arh.a);
      if ($$5 && !$$6) {
         eji $$7 = this.dj();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dL().a(dlg.R, $$7, dlg.a.a(this));
            if (!this.aS()) {
               this.dL().a(null, this.K, this.L, this.M, aqn.hl, this.da(), 1.0F, 1.0F);
               this.a(aqn.hl, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected aqm w() {
      return this.gf() ? aqn.hj : aqn.hg;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.hi;
   }

   @Override
   protected aqm m_() {
      return aqn.hh;
   }

   @Override
   protected void a(bjg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dgw $$3 = this.ge();
      if ($$3 != null) {
         clb $$4 = new clb(cle.ou);
         $$4.a(cpq.v, 1);
         eer.a $$5 = new eer.a((ama)this.dL()).a(egw.f, this.dj()).a(egw.i, $$4).b(egw.a, this);

         for (clb $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dgw $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dgw ge() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cep;
         if (!$$0.a(are.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dL().x_() && !($$0.d() instanceof bky) && this.ag.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cep)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bjg $$0, cep $$1, float $$2) {
      clb $$3 = $$1.q();
      cmy $$4 = cna.d($$3);
      List<bjv> $$5 = cna.a($$3);
      boolean $$6 = $$4 == cnb.c && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gf() {
      return this.an.b(bV);
   }

   public boolean gg() {
      return this.an.b(bW);
   }

   public void gh() {
      this.an.b(bW, true);
   }

   @Override
   public boolean U() {
      return super.U() || this.ge() != null;
   }

   static class a extends brt {
      private final caq a;
      @Nullable
      private bky b;

      public a(caq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(brt.a.c, brt.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cdm)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cdm)this.b);
         }
      }

      @Override
      public void c() {
         this.a.L().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.b.dq(), this.b.du(), this.b.dw());
      }
   }

   static class b extends brt {
      private final caq a;

      public b(caq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() == null) {
            return false;
         } else {
            return !this.a.dL().X().b(cro.c) ? false : this.a.ef().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ato $$0 = this.a.ef();
         crs $$1 = this.a.dL();
         int $$2 = ati.a(this.a.dq() - 1.0 + $$0.j() * 2.0);
         int $$3 = ati.a(this.a.ds() + $$0.j() * 2.0);
         int $$4 = ati.a(this.a.dw() - 1.0 + $$0.j() * 2.0);
         ht $$5 = new ht($$2, $$3, $$4);
         dgw $$6 = $$1.a_($$5);
         ht $$7 = $$5.d();
         dgw $$8 = $$1.a_($$7);
         dgw $$9 = this.a.ge();
         if ($$9 != null) {
            $$9 = cut.b($$9, this.a.dL(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dlg.i, $$5, dlg.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(crs $$0, ht $$1, dgw $$2, dgw $$3, dgw $$4, ht $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cuv.F) && $$4.r($$0, $$5) && $$2.a((crv)$$0, $$1) && $$0.a_(this.a, ejd.a(eji.a($$1))).isEmpty();
      }
   }

   static class c extends btm<cdm> {
      private final caq i;
      @Nullable
      private cdm j;
      private int k;
      private int l;
      private final bvk m;
      private final bvk n = bvk.a().d();
      private final Predicate<bky> o;

      public c(caq $$0, @Nullable Predicate<bky> $$1) {
         super($$0, cdm.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cdm)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = bvk.a().a(this.l()).a(this.o);
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
         this.i.gh();
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
            if (this.c != null && !this.i.bN()) {
               if (this.i.g((cdm)this.c)) {
                  if (this.c.f(this.i) < 16.0) {
                     this.i.y();
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

   static class d extends brt {
      private final caq a;

      public d(caq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() != null) {
            return false;
         } else {
            return !this.a.dL().X().b(cro.c) ? false : this.a.ef().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ato $$0 = this.a.ef();
         crs $$1 = this.a.dL();
         int $$2 = ati.a(this.a.dq() - 2.0 + $$0.j() * 4.0);
         int $$3 = ati.a(this.a.ds() + $$0.j() * 3.0);
         int $$4 = ati.a(this.a.dw() - 2.0 + $$0.j() * 4.0);
         ht $$5 = new ht($$2, $$3, $$4);
         dgw $$6 = $$1.a_($$5);
         eji $$7 = new eji((double)this.a.dp() + 0.5, (double)$$3 + 0.5, (double)this.a.dv() + 0.5);
         eji $$8 = new eji((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         eje $$9 = $$1.a(new crb($$7, $$8, crb.a.b, crb.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(arc.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dlg.f, $$5, dlg.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
