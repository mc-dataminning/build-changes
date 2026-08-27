import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbp extends cbz implements bmc {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bmz d = new bmz(c, "Attacking speed boost", 0.15F, bmz.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final afz<Optional<dip>> bU = agc.a(cbp.class, agb.j);
   private static final afz<Boolean> bV = agc.a(cbp.class, agb.k);
   private static final afz<Boolean> bW = agc.a(cbp.class, agb.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final biw bZ = auz.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cbp(blj<? extends cbp> $$0, csy $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(eek.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new cbp.a(this));
      this.bO.a(2, new btb(this, 1.0, false));
      this.bO.a(7, new bue(this, 1.0, 0.0F));
      this.bO.a(8, new bsz(this, cer.class, 8.0F));
      this.bO.a(8, new btm(this));
      this.bO.a(10, new cbp.b(this));
      this.bO.a(11, new cbp.d(this));
      this.bP.a(1, new cbp.c(this, this::a_));
      this.bP.a(2, new buj(this));
      this.bP.a(3, new buk<>(this, cbq.class, true, false));
      this.bP.a(4, new buq<>(this, false));
   }

   public static bna.a u() {
      return cbz.gk().a(bnb.l, 40.0).a(bnb.m, 0.3F).a(bnb.c, 7.0).a(bnb.g, 64.0);
   }

   @Override
   public void h(@Nullable blv $$0) {
      super.h($$0);
      bmx $$1 = this.a(bnb.m);
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
   protected void c_() {
      super.c_();
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
            this.dM().a(this.dr(), this.dv(), this.dx(), arc.hJ, this.db(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(afz<?> $$0) {
      if (bV.equals($$0) && this.gg() && this.dM().B) {
         this.w();
      }

      super.a($$0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      dip $$1 = this.ge();
      if ($$1 != null) {
         $$0.a("carriedBlockState", sy.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      dip $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = sy.a(this.dM().a(kc.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dM(), $$0);
   }

   boolean g(cer $$0) {
      cmh $$1 = $$0.fS().j.get(3);
      if ($$1.a(cwb.ee.k())) {
         return false;
      } else {
         elb $$2 = $$0.f(1.0F).d();
         elb $$3 = new elb(this.dr() - $$0.dr(), this.dv() - $$0.dv(), this.dx() - $$0.dx());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void d_() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jv.Z, this.d(0.5), this.du() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dM().B) {
         this.a((amp)this.dM(), true);
      }

      super.d_();
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dM().O() && this.ah >= this.bY + 600) {
         float $$0 = this.bo();
         if ($$0 > 0.5F && this.dM().g(this.dm()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
            this.h(null);
            this.A();
         }
      }

      super.Z();
   }

   protected boolean A() {
      if (!this.dM().y_() && this.bx()) {
         double $$0 = this.dr() + (this.ag.j() - 0.5) * 64.0;
         double $$1 = this.dt() + (double)(this.ag.a(64) - 32);
         double $$2 = this.dx() + (this.ag.j() - 0.5) * 64.0;
         return this.r($$0, $$1, $$2);
      } else {
         return false;
      }
   }

   boolean a(blf $$0) {
      elb $$1 = new elb(this.dr() - $$0.dr(), this.e(0.5) - $$0.dv(), this.dx() - $$0.dx());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dr() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dt() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dx() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      hv.a $$3 = new hv.a($$0, $$1, $$2);

      while ($$3.v() > this.dM().J_() && !this.dM().a_($$3).d()) {
         $$3.c(ia.a);
      }

      dip $$4 = this.dM().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(arw.a);
      if ($$5 && !$$6) {
         elb $$7 = this.dk();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dM().a(dmz.R, $$7, dmz.a.a(this));
            if (!this.aU()) {
               this.dM().a(null, this.K, this.L, this.M, arc.hK, this.db(), 1.0F, 1.0F);
               this.a(arc.hK, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected arb y() {
      return this.gf() ? arc.hI : arc.hF;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.hH;
   }

   @Override
   protected arb n_() {
      return arc.hG;
   }

   @Override
   protected void a(bkd $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      dip $$3 = this.ge();
      if ($$3 != null) {
         cmh $$4 = new cmh(cmk.pf);
         $$4.a(cqw.v, 1);
         egk.a $$5 = new egk.a((amp)this.dM()).a(eip.f, this.dk()).a(eip.i, $$4).b(eip.a, this);

         for (cmh $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable dip $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public dip ge() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cfu;
         if (!$$0.a(art.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dM().y_() && !($$0.d() instanceof blv) && this.ag.a(10) != 0) {
               this.A();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cfu)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.A()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bkd $$0, cfu $$1, float $$2) {
      cmh $$3 = $$1.q();
      coe $$4 = cog.d($$3);
      List<bks> $$5 = cog.a($$3);
      boolean $$6 = $$4 == coh.c && $$5.isEmpty();
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
   public boolean W() {
      return super.W() || this.ge() != null;
   }

   static class a extends bsr {
      private final cbp a;
      @Nullable
      private blv b;

      public a(cbp $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsr.a.c, bsr.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cer)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cer)this.b);
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

   static class b extends bsr {
      private final cbp a;

      public b(cbp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() == null) {
            return false;
         } else {
            return !this.a.dM().Y().b(csu.c) ? false : this.a.eg().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         auf $$0 = this.a.eg();
         csy $$1 = this.a.dM();
         int $$2 = aty.a(this.a.dr() - 1.0 + $$0.j() * 2.0);
         int $$3 = aty.a(this.a.dt() + $$0.j() * 2.0);
         int $$4 = aty.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         hv $$5 = new hv($$2, $$3, $$4);
         dip $$6 = $$1.a_($$5);
         hv $$7 = $$5.d();
         dip $$8 = $$1.a_($$7);
         dip $$9 = this.a.ge();
         if ($$9 != null) {
            $$9 = cvz.b($$9, this.a.dM(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dmz.i, $$5, dmz.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(csy $$0, hv $$1, dip $$2, dip $$3, dip $$4, hv $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cwb.F) && $$4.r($$0, $$5) && $$2.a((ctb)$$0, $$1) && $$0.a_(this.a, ekw.a(elb.a($$1))).isEmpty();
      }
   }

   static class c extends buk<cer> {
      private final cbp i;
      @Nullable
      private cer j;
      private int k;
      private int l;
      private final bwj m;
      private final bwj n = bwj.a().d();
      private final Predicate<blv> o;

      public c(cbp $$0, @Nullable Predicate<blv> $$1) {
         super($$0, cer.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cer)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = bwj.a().a(this.l()).a(this.o);
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
            if (this.c != null && !this.i.bO()) {
               if (this.i.g((cer)this.c)) {
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

   static class d extends bsr {
      private final cbp a;

      public d(cbp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() != null) {
            return false;
         } else {
            return !this.a.dM().Y().b(csu.c) ? false : this.a.eg().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         auf $$0 = this.a.eg();
         csy $$1 = this.a.dM();
         int $$2 = aty.a(this.a.dr() - 2.0 + $$0.j() * 4.0);
         int $$3 = aty.a(this.a.dt() + $$0.j() * 3.0);
         int $$4 = aty.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         hv $$5 = new hv($$2, $$3, $$4);
         dip $$6 = $$1.a_($$5);
         elb $$7 = new elb((double)this.a.dq() + 0.5, (double)$$3 + 0.5, (double)this.a.dw() + 0.5);
         elb $$8 = new elb((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         ekx $$9 = $$1.a(new csh($$7, $$8, csh.a.b, csh.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(arr.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dmz.f, $$5, dmz.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
