import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ced extends cen implements bom {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bpj d = new bpj(c, "Attacking speed boost", 0.15F, bpj.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final aie<Optional<dlf>> bU = aih.a(ced.class, aig.j);
   private static final aie<Boolean> bV = aih.a(ced.class, aig.k);
   private static final aie<Boolean> bW = aih.a(ced.class, aig.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final blf bZ = axh.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public ced(bnu<? extends ced> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buv(this));
      this.bO.a(1, new ced.a(this));
      this.bO.a(2, new bvl(this, 1.0, false));
      this.bO.a(7, new bwo(this, 1.0, 0.0F));
      this.bO.a(8, new bvj(this, chh.class, 8.0F));
      this.bO.a(8, new bvw(this));
      this.bO.a(10, new ced.b(this));
      this.bO.a(11, new ced.d(this));
      this.bP.a(1, new ced.c(this, this::a_));
      this.bP.a(2, new bwt(this));
      this.bP.a(3, new bwu<>(this, cee.class, true, false));
      this.bP.a(4, new bxa<>(this, false));
   }

   public static bpk.a u() {
      return cen.gm().a(bpl.n, 40.0).a(bpl.o, 0.3F).a(bpl.c, 7.0).a(bpl.i, 64.0).a(bpl.r, 1.0);
   }

   @Override
   public void h(@Nullable bog $$0) {
      super.h($$0);
      bph $$1 = this.f(bpl.o);
      if ($$0 == null) {
         this.bY = 0;
         this.am.b(bV, false);
         this.am.b(bW, false);
         $$1.b(d.a());
      } else {
         this.bY = this.ag;
         this.am.b(bV, true);
         if (!$$1.a(d)) {
            $$1.c(d);
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bU, Optional.empty());
      this.am.a(bV, false);
      this.am.a(bW, false);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.af));
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
      if (this.ag >= this.bX + 400) {
         this.bX = this.ag;
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), atk.hY, this.db(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(aie<?> $$0) {
      if (bV.equals($$0) && this.gi() && this.dM().B) {
         this.w();
      }

      super.a($$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      dlf $$1 = this.gg();
      if ($$1 != null) {
         $$0.a("carriedBlockState", tl.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      dlf $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = tl.a(this.dM().a(kg.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dM(), $$0);
   }

   boolean g(chh $$0) {
      coz $$1 = $$0.fT().j.get(3);
      if ($$1.a(cyq.ee.j())) {
         return false;
      } else {
         ens $$2 = $$0.f(1.0F).d();
         ens $$3 = new ens(this.dr() - $$0.dr(), this.dv() - $$0.dv(), this.dx() - $$0.dx());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.D(this) : false;
      }
   }

   @Override
   public void d_() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jz.Z, this.d(0.5), this.du() - 0.25, this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dM().B) {
         this.a((aov)this.dM(), true);
      }

      super.d_();
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   protected void aa() {
      if (this.dM().P() && this.ag >= this.bY + 600) {
         float $$0 = this.bo();
         if ($$0 > 0.5F && this.dM().h(this.dm()) && this.af.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.A();
         }
      }

      super.aa();
   }

   protected boolean A() {
      if (!this.dM().y_() && this.bx()) {
         double $$0 = this.dr() + (this.af.j() - 0.5) * 64.0;
         double $$1 = this.dt() + (double)(this.af.a(64) - 32);
         double $$2 = this.dx() + (this.af.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(bno $$0) {
      ens $$1 = new ens(this.dr() - $$0.dr(), this.e(0.5) - $$0.dv(), this.dx() - $$0.dx());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dr() + (this.af.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dt() + (double)(this.af.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dx() + (this.af.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      hz.a $$3 = new hz.a($$0, $$1, $$2);

      while ($$3.v() > this.dM().J_() && !this.dM().a_($$3).d()) {
         $$3.c(ie.a);
      }

      dlf $$4 = this.dM().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(aue.a);
      if ($$5 && !$$6) {
         ens $$7 = this.dk();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dM().a(dpp.R, $$7, dpp.a.a(this));
            if (!this.aU()) {
               this.dM().a(null, this.J, this.K, this.L, atk.hZ, this.db(), 1.0F, 1.0F);
               this.a(atk.hZ, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected atj y() {
      return this.gh() ? atk.hX : atk.hU;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.hW;
   }

   @Override
   protected atj n_() {
      return atk.hV;
   }

   @Override
   protected void a(bmn $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dlf $$3 = this.gg();
      if ($$3 != null) {
         coz $$4 = new coz(cpc.ph);
         $$4.a(ctl.v, 1);
         ejb.a $$5 = new ejb.a((aov)this.dM()).a(elg.f, this.dk()).a(elg.i, $$4).b(elg.a, this);

         for (coz $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dlf $$0) {
      this.am.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dlf gg() {
      return this.am.b(bU).orElse(null);
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cil;
         if (!$$0.a(aub.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dM().y_() && !($$0.d() instanceof bog) && this.af.a(10) != 0) {
               this.A();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cil)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.A()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bmn $$0, cil $$1, float $$2) {
      coz $$3 = $$1.q();
      ij<cqv> $$4 = cqx.d($$3);
      List<bnb> $$5 = cqx.a($$3);
      boolean $$6 = $$4.a(cqy.c) && $$5.isEmpty();
      return $$6 ? super.a($$0, $$2) : false;
   }

   public boolean gh() {
      return this.am.b(bV);
   }

   public boolean gi() {
      return this.am.b(bW);
   }

   public void gj() {
      this.am.b(bW, true);
   }

   @Override
   public boolean X() {
      return super.X() || this.gg() != null;
   }

   static class a extends bvb {
      private final ced a;
      @Nullable
      private bog b;

      public a(ced $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvb.a.c, bvb.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof chh)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((chh)this.b);
         }
      }

      @Override
      public void c() {
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.b.dr(), this.b.dv(), this.b.dx());
      }
   }

   static class b extends bvb {
      private final ced a;

      public b(ced $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gg() == null) {
            return false;
         } else {
            return !this.a.dM().Z().b(cvj.c) ? false : this.a.eh().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         awo $$0 = this.a.eh();
         cvn $$1 = this.a.dM();
         int $$2 = awh.a(this.a.dr() - 1.0 + $$0.j() * 2.0);
         int $$3 = awh.a(this.a.dt() + $$0.j() * 2.0);
         int $$4 = awh.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         hz $$5 = new hz($$2, $$3, $$4);
         dlf $$6 = $$1.a_($$5);
         hz $$7 = $$5.d();
         dlf $$8 = $$1.a_($$7);
         dlf $$9 = this.a.gg();
         if ($$9 != null) {
            $$9 = cyo.b($$9, this.a.dM(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dpp.i, $$5, dpp.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cvn $$0, hz $$1, dlf $$2, dlf $$3, dlf $$4, hz $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cyq.F) && $$4.r($$0, $$5) && $$2.a((cvq)$$0, $$1) && $$0.a_(this.a, enn.a(ens.a($$1))).isEmpty();
      }
   }

   static class c extends bwu<chh> {
      private final ced i;
      @Nullable
      private chh j;
      private int k;
      private int l;
      private final byu m;
      private final byu n = byu.a().d();
      private final Predicate<bog> o;

      public c(ced $$0, @Nullable Predicate<bog> $$1) {
         super($$0, chh.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((chh)$$1x) || $$0.a_($$1x)) && !$$0.y($$1x);
         this.m = byu.a().a(this.l()).a(this.o);
      }

      @Override
      public boolean a() {
         this.j = this.i.dM().a(this.m, this.i);
         return this.j != null;
      }

      @Override
      public void c() {
         this.k = this.a(5);
         this.l = 0;
         this.i.gj();
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
               if (this.i.g((chh)this.c)) {
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

   static class d extends bvb {
      private final ced a;

      public d(ced $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.gg() != null) {
            return false;
         } else {
            return !this.a.dM().Z().b(cvj.c) ? false : this.a.eh().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         awo $$0 = this.a.eh();
         cvn $$1 = this.a.dM();
         int $$2 = awh.a(this.a.dr() - 2.0 + $$0.j() * 4.0);
         int $$3 = awh.a(this.a.dt() + $$0.j() * 3.0);
         int $$4 = awh.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         hz $$5 = new hz($$2, $$3, $$4);
         dlf $$6 = $$1.a_($$5);
         ens $$7 = new ens((double)this.a.dq() + 0.5, (double)$$3 + 0.5, (double)this.a.dw() + 0.5);
         ens $$8 = new ens((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         eno $$9 = $$1.a(new cuw($$7, $$8, cuw.a.b, cuw.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(atz.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dpp.f, $$5, dpp.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
