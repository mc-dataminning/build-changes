import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cce extends cco implements bmr {
   private static final UUID c = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
   private static final bno d = new bno(c, "Attacking speed boost", 0.15F, bno.a.a);
   private static final int e = 400;
   private static final int bT = 600;
   private static final agm<Optional<djg>> bU = agp.a(cce.class, ago.j);
   private static final agm<Boolean> bV = agp.a(cce.class, ago.k);
   private static final agm<Boolean> bW = agp.a(cce.class, ago.k);
   private int bX = Integer.MIN_VALUE;
   private int bY;
   private static final bjl bZ = avo.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public cce(bly<? extends cce> $$0, cto $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.a(efb.j, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bta(this));
      this.bO.a(1, new cce.a(this));
      this.bO.a(2, new btq(this, 1.0, false));
      this.bO.a(7, new but(this, 1.0, 0.0F));
      this.bO.a(8, new bto(this, cfh.class, 8.0F));
      this.bO.a(8, new bub(this));
      this.bO.a(10, new cce.b(this));
      this.bO.a(11, new cce.d(this));
      this.bP.a(1, new cce.c(this, this::a_));
      this.bP.a(2, new buy(this));
      this.bP.a(3, new buz<>(this, ccf.class, true, false));
      this.bP.a(4, new bvf<>(this, false));
   }

   public static bnp.a u() {
      return cco.gk().a(bnq.l, 40.0).a(bnq.m, 0.3F).a(bnq.c, 7.0).a(bnq.g, 64.0);
   }

   @Override
   public void h(@Nullable bmk $$0) {
      super.h($$0);
      bnm $$1 = this.a(bnq.m);
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
            this.dM().a(this.dr(), this.dv(), this.dx(), arr.hJ, this.db(), 2.5F, 1.0F, false);
         }
      }
   }

   @Override
   public void a(agm<?> $$0) {
      if (bV.equals($$0) && this.gg() && this.dM().B) {
         this.w();
      }

      super.a($$0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      djg $$1 = this.ge();
      if ($$1 != null) {
         $$0.a("carriedBlockState", tc.a($$1));
      }

      this.c($$0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      djg $$1 = null;
      if ($$0.b("carriedBlockState", 10)) {
         $$1 = tc.a(this.dM().a(ke.f), $$0.p("carriedBlockState"));
         if ($$1.i()) {
            $$1 = null;
         }
      }

      this.d($$1);
      this.a(this.dM(), $$0);
   }

   boolean g(cfh $$0) {
      cmx $$1 = $$0.fS().j.get(3);
      if ($$1.a(cwr.ee.k())) {
         return false;
      } else {
         els $$2 = $$0.f(1.0F).d();
         els $$3 = new els(this.dr() - $$0.dr(), this.dv() - $$0.dv(), this.dx() - $$0.dx());
         double $$4 = $$3.f();
         $$3 = $$3.d();
         double $$5 = $$2.b($$3);
         return $$5 > 1.0 - 0.025 / $$4 ? $$0.E(this) : false;
      }
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 2.55F;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.09375F * $$2, 0.0F);
   }

   @Override
   public void d_() {
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jx.Z, this.d(0.5), this.du() - 0.25, this.g(0.5), (this.ag.j() - 0.5) * 2.0, -this.ag.j(), (this.ag.j() - 0.5) * 2.0);
         }
      }

      this.bj = false;
      if (!this.dM().B) {
         this.a((and)this.dM(), true);
      }

      super.d_();
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   protected void Z() {
      if (this.dM().P() && this.ah >= this.bY + 600) {
         float $$0 = this.bo();
         if ($$0 > 0.5F && this.dM().h(this.dm()) && this.ag.i() * 30.0F < ($$0 - 0.4F) * 2.0F) {
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

   boolean a(blu $$0) {
      els $$1 = new els(this.dr() - $$0.dr(), this.e(0.5) - $$0.dv(), this.dx() - $$0.dx());
      $$1 = $$1.d();
      double $$2 = 16.0;
      double $$3 = this.dr() + (this.ag.j() - 0.5) * 8.0 - $$1.c * 16.0;
      double $$4 = this.dt() + (double)(this.ag.a(16) - 8) - $$1.d * 16.0;
      double $$5 = this.dx() + (this.ag.j() - 0.5) * 8.0 - $$1.e * 16.0;
      return this.r($$3, $$4, $$5);
   }

   private boolean r(double $$0, double $$1, double $$2) {
      hx.a $$3 = new hx.a($$0, $$1, $$2);

      while ($$3.v() > this.dM().J_() && !this.dM().a_($$3).d()) {
         $$3.c(ic.a);
      }

      djg $$4 = this.dM().a_($$3);
      boolean $$5 = $$4.d();
      boolean $$6 = $$4.u().a(asl.a);
      if ($$5 && !$$6) {
         els $$7 = this.dk();
         boolean $$8 = this.b($$0, $$1, $$2, true);
         if ($$8) {
            this.dM().a(dnq.R, $$7, dnq.a.a(this));
            if (!this.aU()) {
               this.dM().a(null, this.K, this.L, this.M, arr.hK, this.db(), 1.0F, 1.0F);
               this.a(arr.hK, 1.0F, 1.0F);
            }
         }

         return $$8;
      } else {
         return false;
      }
   }

   @Override
   protected arq y() {
      return this.gf() ? arr.hI : arr.hF;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.hH;
   }

   @Override
   protected arq n_() {
      return arr.hG;
   }

   @Override
   protected void a(bks $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      djg $$3 = this.ge();
      if ($$3 != null) {
         cmx $$4 = new cmx(cna.pf);
         $$4.a(crm.v, 1);
         ehb.a $$5 = new ehb.a((and)this.dM()).a(ejg.f, this.dk()).a(ejg.i, $$4).b(ejg.a, this);

         for (cmx $$7 : $$3.a($$5)) {
            this.b($$7);
         }
      }
   }

   public void d(@Nullable djg $$0) {
      this.an.b(bU, Optional.ofNullable($$0));
   }

   @Nullable
   public djg ge() {
      return this.an.b(bU).orElse(null);
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = $$0.c() instanceof cgk;
         if (!$$0.a(asi.k) && !$$2) {
            boolean $$5 = super.a($$0, $$1);
            if (!this.dM().y_() && !($$0.d() instanceof bmk) && this.ag.a(10) != 0) {
               this.A();
            }

            return $$5;
         } else {
            boolean $$3 = $$2 && this.a($$0, (cgk)$$0.c(), $$1);

            for (int $$4 = 0; $$4 < 64; $$4++) {
               if (this.A()) {
                  return true;
               }
            }

            return $$3;
         }
      }
   }

   private boolean a(bks $$0, cgk $$1, float $$2) {
      cmx $$3 = $$1.q();
      cov $$4 = cox.d($$3);
      List<blh> $$5 = cox.a($$3);
      boolean $$6 = $$4 == coy.c && $$5.isEmpty();
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

   static class a extends btg {
      private final cce a;
      @Nullable
      private bmk b;

      public a(cce $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btg.a.c, btg.a.a));
      }

      @Override
      public boolean a() {
         this.b = this.a.q();
         if (!(this.b instanceof cfh)) {
            return false;
         } else {
            double $$0 = this.b.f(this.a);
            return $$0 > 256.0 ? false : this.a.g((cfh)this.b);
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

   static class b extends btg {
      private final cce a;

      public b(cce $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() == null) {
            return false;
         } else {
            return !this.a.dM().Z().b(ctk.c) ? false : this.a.eg().a(b(2000)) == 0;
         }
      }

      @Override
      public void e() {
         auu $$0 = this.a.eg();
         cto $$1 = this.a.dM();
         int $$2 = aun.a(this.a.dr() - 1.0 + $$0.j() * 2.0);
         int $$3 = aun.a(this.a.dt() + $$0.j() * 2.0);
         int $$4 = aun.a(this.a.dx() - 1.0 + $$0.j() * 2.0);
         hx $$5 = new hx($$2, $$3, $$4);
         djg $$6 = $$1.a_($$5);
         hx $$7 = $$5.d();
         djg $$8 = $$1.a_($$7);
         djg $$9 = this.a.ge();
         if ($$9 != null) {
            $$9 = cwp.b($$9, this.a.dM(), $$5);
            if (this.a($$1, $$5, $$9, $$6, $$8, $$7)) {
               $$1.a($$5, $$9, 3);
               $$1.a(dnq.i, $$5, dnq.a.a(this.a, $$9));
               this.a.d(null);
            }
         }
      }

      private boolean a(cto $$0, hx $$1, djg $$2, djg $$3, djg $$4, hx $$5) {
         return $$3.i() && !$$4.i() && !$$4.a(cwr.F) && $$4.r($$0, $$5) && $$2.a((ctr)$$0, $$1) && $$0.a_(this.a, eln.a(els.a($$1))).isEmpty();
      }
   }

   static class c extends buz<cfh> {
      private final cce i;
      @Nullable
      private cfh j;
      private int k;
      private int l;
      private final bwy m;
      private final bwy n = bwy.a().d();
      private final Predicate<bmk> o;

      public c(cce $$0, @Nullable Predicate<bmk> $$1) {
         super($$0, cfh.class, 10, false, false, $$1);
         this.i = $$0;
         this.o = $$1x -> ($$0.g((cfh)$$1x) || $$0.a_($$1x)) && !$$0.z($$1x);
         this.m = bwy.a().a(this.l()).a(this.o);
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
               if (this.i.g((cfh)this.c)) {
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

   static class d extends btg {
      private final cce a;

      public d(cce $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (this.a.ge() != null) {
            return false;
         } else {
            return !this.a.dM().Z().b(ctk.c) ? false : this.a.eg().a(b(20)) == 0;
         }
      }

      @Override
      public void e() {
         auu $$0 = this.a.eg();
         cto $$1 = this.a.dM();
         int $$2 = aun.a(this.a.dr() - 2.0 + $$0.j() * 4.0);
         int $$3 = aun.a(this.a.dt() + $$0.j() * 3.0);
         int $$4 = aun.a(this.a.dx() - 2.0 + $$0.j() * 4.0);
         hx $$5 = new hx($$2, $$3, $$4);
         djg $$6 = $$1.a_($$5);
         els $$7 = new els((double)this.a.dq() + 0.5, (double)$$3 + 0.5, (double)this.a.dw() + 0.5);
         els $$8 = new els((double)$$2 + 0.5, (double)$$3 + 0.5, (double)$$4 + 0.5);
         elo $$9 = $$1.a(new csx($$7, $$8, csx.a.b, csx.b.a, this.a));
         boolean $$10 = $$9.a().equals($$5);
         if ($$6.a(asg.ak) && $$10) {
            $$1.a($$5, false);
            $$1.a(dnq.f, $$5, dnq.a.a(this.a, $$6));
            this.a.d($$6.b().o());
         }
      }
   }
}
