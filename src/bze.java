import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bze extends bzo implements bjt {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bkq d = new bkq(c, "Attacking speed boost", 0.15F, bkq.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final aef<Optional<dfd>> bU = aei.a(bze.class, aeh.j);
   private static final aef<Boolean> bV = aei.a(bze.class, aeh.k);
   private static final aef<Boolean> bW = aei.a(bze.class, aeh.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bgp bZ = asz.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bze(bja<? extends bze> $$0, cqb $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(ear.j, -1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new bze.a(this));
      this.bO.a(2, new bqr(this, 1.0, false));
      this.bO.a(7, new bru(this, 1.0, 0.0F));
      this.bO.a(8, new bqp(this, cca.class, 8.0F));
      this.bO.a(8, new brc(this));
      this.bO.a(10, new bze.b(this));
      this.bO.a(11, new bze.d(this));
      this.bP.a(1, new bze.c(this, this::a_));
      this.bP.a(2, new brz(this));
      this.bP.a(3, new bsa<>(this, bzf.class, true, false));
      this.bP.a(4, new bsg<>(this, false));
   }

   public static bkr.a s() {
      return bzo.gk().a(bks.l, 40.0).a(bks.m, 0.3F).a(bks.c, 7.0).a(bks.g, 64.0);
   }

   @Override
   public void h(@Nullable bjm $$0) {
      super.h($$0);
      bko $$1 = this.a(bks.m);
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
            this.dL().a(this.dq(), this.du(), this.dw(), apg.hg, this.da(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aef<?> $$0) {
      if (bV.equals($$0) && this.gg() && this.dL().B) {
         this.t();
      }

      super.a($$0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      dfd $$1 = this.ge();
      if ($$1 != null) {
         $$0.a("carriedBlockState", rj.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      dfd $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = rj.a(this.dL().a(jc.e), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dL(), $$0);
   }

   boolean g(cca $$0) {
      cjl $$1 = $$0.fS().j.get(3);
      if ($$1.a(cte.ee.k())) {
         return false;
      } else {
         ehh $$2 = $$0.f(1.0F).d();
         ehh $$3 = new ehh(this.dq() - $$0.dq(), this.du() - $$0.du(), this.dw() - $$0.dw());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void b_() {
      if (this.dL().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dL().a(iv.X, this.d(0.5), this.dt() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dL().B) {
         this.a((akt)this.dL(), true);
      }

      super.b_();
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
      if (!this.dL().w_() && this.bv()) {
         double $$0 = this.dq() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.ds() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dw() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(biw $$0) {
      ehh $$1 = new ehh(this.dq() - $$0.dq(), this.e(0.5) - $$0.du(), this.dw() - $$0.dw());
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
         $$3.c(ha.a);
      }

      dfd $$4 = this.dL().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(aqa.a);
      if ($$5 && !$$6) {
         ehh $$7 = this.dj();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dL().a(djn.R, $$7, djn.a.a(this));
            if (!this.aS()) {
               this.dL().a(null, this.K, this.L, this.M, apg.hh, this.da(), 1.0F, 1.0F);
               this.a(apg.hh, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected apf w() {
      return this.gf() ? apg.hf : apg.hc;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.he;
   }

   @Override
   protected apf l_() {
      return apg.hd;
   }

   @Override
   protected void a(bhu $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dfd $$3 = this.ge();
      if ($$3 != null) {
         cjl $$4 = new cjl(cjo.ou);
         $$4.a(cny.v, 1);
         ecq.a $$5 = new ecq.a((akt)this.dL()).a(eev.f, this.dj()).a(eev.i, $$4).b(eev.a, this);

         for (cjl $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dfd $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dfd ge() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cdd;
         if (!$$0.a(apx.j) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dL().w_() && !($$0.d() instanceof bjm) && this.ag.a(10) != 0) {
               this.y();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cdd)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.y()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bhu $$0, cdd $$1, float $$2) {
      cjl $$3 = $$1.q();
      cli $$4 = clk.d($$3);
      List<bij> $$5 = clk.a($$3);
      boolean $$6 = $$4 == cll.c && $$5.isEmpty();
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

   static class a extends bqh {
      private final bze a;
      @Nullable
      private bjm b;

      public a(bze $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqh.a.c, bqh.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cca)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cca)this.b);
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

   static class b extends bqh {
      private final bze a;

      public b(bze $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() == null) {
            return false;
         } else {
            return !this.a.dL().X().b(cpx.c) ? false : this.a.ef().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         ash $$0 = this.a.ef();
         cqb $$1 = this.a.dL();
         int $$2 = asb.a(this.a.dq() - 1.0 + $$0.j() * 2.0);
         int $$3 = asb.a(this.a.ds() + $$0.j() * 2.0);
         int $$4 = asb.a(this.a.dw() - 1.0 + $$0.j() * 2.0);
         gw $$5 = new gw($$2, $$3, $$4);
         dfd $$6 = $$1.a_($$5);
         gw $$7 = $$5.d();
         dfd $$8 = $$1.a_($$7);
         dfd $$9 = this.a.ge();
         if ($$9 != null) {
            $$9 = ctc.b($$9, this.a.dL(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(djn.i, $$5, djn.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cqb $$0, gw $$1, dfd $$2, dfd $$3, dfd $$4, gw $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cte.F) && $$4.r($$0, $$5) && $$2.a((cqe)$$0, $$1) && $$0.a_(this.a, ehc.a(ehh.a($$1))).isEmpty();
      }
   }

   static class c extends bsa<cca> {
      private final bze i;
      @Nullable
      private cca j;
      private int k;
      private int l;
      private final bty m;
      private final bty n = bty.a().d();
      private final Predicate<bjm> o;

      public c(bze $$0, @Nullable Predicate<bjm> $$1) {
         super($$0, cca.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cca)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = bty.a().a(this.l()).a(this.o);
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
               if (this.i.g((cca)this.c)) {
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

   static class d extends bqh {
      private final bze a;

      public d(bze $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() != null) {
            return false;
         } else {
            return !this.a.dL().X().b(cpx.c) ? false : this.a.ef().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         ash $$0 = this.a.ef();
         cqb $$1 = this.a.dL();
         int $$2 = asb.a(this.a.dq() - 2.0 + $$0.j() * 4.0);
         int $$3 = asb.a(this.a.ds() + $$0.j() * 3.0);
         int $$4 = asb.a(this.a.dw() - 2.0 + $$0.j() * 4.0);
         gw $$5 = new gw($$2, $$3, $$4);
         dfd $$6 = $$1.a_($$5);
         ehh $$7 = new ehh((double)this.a.dp() + 0.5, (double)$$3 + 0.5, (double)this.a.dv() + 0.5);
         ehh $$8 = new ehh((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ehd $$9 = $$1.a(new cpk($$7, $$8, cpk.a.b, cpk.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(apv.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(djn.f, $$5, djn.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
