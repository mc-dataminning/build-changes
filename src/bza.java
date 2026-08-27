import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bza extends bzk implements bjp {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bkm d = new bkm(c, "Attacking speed boost", 0.15F, bkm.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final aeg<Optional<dfl>> bU = aej.a(bza.class, aei.j);
   private static final aeg<Boolean> bV = aej.a(bza.class, aei.k);
   private static final aeg<Boolean> bW = aej.a(bza.class, aei.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bgl bZ = asw.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bza(biw<? extends bza> $$0, cpx $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(eaz.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bza.a(this));
      this.bO.a(2, new bqn(this, 1.0, false));
      this.bO.a(7, new brq(this, 1.0, 0.0F));
      this.bO.a(8, new bql(this, cbw.class, 8.0F));
      this.bO.a(8, new bqy(this));
      this.bO.a(10, new bza.b(this));
      this.bO.a(11, new bza.d(this));
      this.bP.a(1, new bza.c(this, this::a_));
      this.bP.a(2, new brv(this));
      this.bP.a(3, new brw<>(this, bzb.class, true, false));
      this.bP.a(4, new bsc<>(this, false));
   }

   public static bkn.a s() {
      return bzk.gj().a(bko.a, 40.0).a(bko.d, 0.3F).a(bko.f, 7.0).a(bko.b, 64.0);
   }

   @Override
   public void h(@Nullable bji $$0) {
      super.h($$0);
      bkk $$1 = this.a(bko.d);
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

   public void t() {
      if (this.ah >= this.bX + 400) {
         this.bX = this.ah;
         if (!this.aS()) {
            this.dL().a(this.dq(), this.du(), this.dw(), apf.hg, this.da(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aeg<?> $$0) {
      if (bV.equals($$0) && this.gf() && this.dL().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      dfl $$1 = this.gd();
      if ($$1 != null) {
         $$0.a("carriedBlockState", rl.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      dfl $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = rl.a(this.dL().a(je.e), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dL(), $$0);
   }

   boolean g(cbw $$0) {
      cjh $$1 = $$0.fR().j.get(3);
      if ($$1.a(csy.ef.k())) {
         return false;
      } else {
         ehp $$2 = $$0.f(1.0F).d();
         ehp $$3 = new ehp(this.dq() - $$0.dq(), this.du() - $$0.du(), this.dw() - $$0.dw());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void b_() {
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(ix.X, this.d(0.5), this.dt() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dL().B) {
         this.a((aks)this.dL(), true);
      }

      super.b_();
   }

   @Override
   public boolean ff() {
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
      if (!this.dL().w_() && this.bv()) {
         double $$0 = this.dq() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.ds() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dw() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(bis $$0) {
      ehp $$1 = new ehp(this.dq() - $$0.dq(), this.e(0.5) - $$0.du(), this.dw() - $$0.dw());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dq() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.ds() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dw() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      gw.a $$3 = new gw.a($$0, $$1, $$2);

      while ($$3.v() > this.dL().H_() && !this.dL().a_($$3).d()) {
         $$3.c(hc.a);
      }

      dfl $$4 = this.dL().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(apz.a);
      if ($$5 && !$$6) {
         ehp $$7 = this.dj();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dL().a(djv.R, $$7, djv.a.a(this));
            if (!this.aS()) {
               this.dL().a(null, this.K, this.L, this.M, apf.hh, this.da(), 1.0F, 1.0F);
               this.a(apf.hh, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected ape w() {
      return this.ge() ? apf.hf : apf.hc;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.he;
   }

   @Override
   protected ape l_() {
      return apf.hd;
   }

   @Override
   protected void a(bhq $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dfl $$3 = this.gd();
      if ($$3 != null) {
         cjh $$4 = new cjh(cjk.ou);
         $$4.a(cnu.v, 1);
         ecy.a $$5 = new ecy.a((aks)this.dL()).a(efd.f, this.dj()).a(efd.i, $$4).b(efd.a, this);

         for (cjh $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dfl $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dfl gd() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof ccz;
         if (!$$0.a(apw.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dL().w_() && !($$0.d() instanceof bji) && this.ag.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (ccz)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bhq $$0, ccz $$1, float $$2) {
      cjh $$3 = $$1.q();
      cle $$4 = clg.d($$3);
      List<bif> $$5 = clg.a($$3);
      boolean $$6 = $$4 == clh.c && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean ge() {
      return this.an.b(bV);
   }

   public boolean gf() {
      return this.an.b(bW);
   }

   public void gg() {
      this.an.b(bW, true);
   }

   @Override
   public boolean U() {
      return super.U() || this.gd() != null;
   }

   static class a extends bqd {
      private final bza a;
      @Nullable
      private bji b;

      public a(bza $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqd.a.c, bqd.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cbw)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cbw)this.b);
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

   static class b extends bqd {
      private final bza a;

      public b(bza $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gd() == null) {
            return false;
         } else {
            return !this.a.dL().X().b(cpt.c) ? false : this.a.ef().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ase $$0 = this.a.ef();
         cpx $$1 = this.a.dL();
         int $$2 = ary.a(this.a.dq() - 1.0 + $$0.j() * 2.0);
         int $$3 = ary.a(this.a.ds() + $$0.j() * 2.0);
         int $$4 = ary.a(this.a.dw() - 1.0 + $$0.j() * 2.0);
         gw $$5 = new gw($$2, $$3, $$4);
         dfl $$6 = $$1.a_($$5);
         gw $$7 = $$5.d();
         dfl $$8 = $$1.a_($$7);
         dfl $$9 = this.a.gd();
         if ($$9 != null) {
            $$9 = csx.b($$9, this.a.dL(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(djv.i, $$5, djv.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cpx $$0, gw $$1, dfl $$2, dfl $$3, dfl $$4, gw $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(csy.F) && $$4.r($$0, $$5) && $$2.a((cqa)$$0, $$1) && $$0.a_(this.a, ehk.a(ehp.a($$1))).isEmpty();
      }
   }

   static class c extends brw<cbw> {
      private final bza i;
      @Nullable
      private cbw j;
      private int k;
      private int l;
      private final btu m;
      private final btu n = btu.a().d();
      private final Predicate<bji> o;

      public c(bza $$0, @Nullable Predicate<bji> $$1) {
         super($$0, cbw.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cbw)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = btu.a().a(this.l()).a(this.o);
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
         this.i.gg();
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
               if (this.i.g((cbw)this.c)) {
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

   static class d extends bqd {
      private final bza a;

      public d(bza $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gd() != null) {
            return false;
         } else {
            return !this.a.dL().X().b(cpt.c) ? false : this.a.ef().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ase $$0 = this.a.ef();
         cpx $$1 = this.a.dL();
         int $$2 = ary.a(this.a.dq() - 2.0 + $$0.j() * 4.0);
         int $$3 = ary.a(this.a.ds() + $$0.j() * 3.0);
         int $$4 = ary.a(this.a.dw() - 2.0 + $$0.j() * 4.0);
         gw $$5 = new gw($$2, $$3, $$4);
         dfl $$6 = $$1.a_($$5);
         ehp $$7 = new ehp((double)this.a.dp() + 0.5, (double)$$3 + 0.5, (double)this.a.dv() + 0.5);
         ehp $$8 = new ehp((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ehl $$9 = $$1.a(new cpg($$7, $$8, cpg.a.b, cpg.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(apu.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(djv.f, $$5, djv.a.a(this.a, $$6));
            this.a.d($$6.b().n());
         }
      }
   }
}
