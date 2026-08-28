import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cep extends ceo implements bte, cex {
   public static final float ca = 120.32113F;
   public static final int cb = aye.f(1.4959966F);
   private static final ajp<Byte> ck = ajt.a(cep.class, ajr.a);
   private static final ajp<Integer> cl = ajt.a(cep.class, ajr.b);
   private static final int cm = 2;
   private static final int cn = 4;
   private static final int co = 8;
   private static final int cp = 1200;
   private static final int cq = 2400;
   private static final int cr = 3600;
   private static final int cs = 4;
   private static final int ct = 10;
   private static final int cu = 10;
   private static final int cv = 18;
   private static final int cw = 32;
   private static final int cx = 2;
   private static final int cy = 16;
   private static final int cz = 20;
   public static final String cd = "CropsGrownSincePollination";
   public static final String ce = "CannotEnterHiveTicks";
   public static final String cf = "TicksSincePollination";
   public static final String cg = "HasStung";
   public static final String ch = "HasNectar";
   public static final String ci = "flower_pos";
   public static final String cj = "hive_pos";
   private static final bpo cB = aze.a(20, 39);
   @Nullable
   private UUID cC;
   private float cD;
   private float cE;
   private int cF;
   int cG;
   private int cH;
   private int cI;
   private static final int cJ = 200;
   int cK;
   private static final int cL = 200;
   int cM = aye.a(this.ah, 20, 60);
   @Nullable
   ja cN;
   @Nullable
   ja cO;
   cep.k cP;
   cep.e cQ;
   private cep.f cR;
   private int cS;

   public cep(bsj<? extends cep> $$0, dcd $$1) {
      super($$0, $$1);
      this.bR = new byw(this, 20, true);
      this.bQ = new cep.j(this);
      this.a(eos.n, -1.0F);
      this.a(eos.j, -1.0F);
      this.a(eos.k, 16.0F);
      this.a(eos.x, -1.0F);
      this.a(eos.h, -1.0F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ck, (byte)0);
      $$0.a(cl, 0);
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      return $$1.a_($$0).i() ? 10.0F : 0.0F;
   }

   @Override
   protected void z() {
      this.bU.a(0, new cep.b(this, 1.4F, true));
      this.bU.a(1, new cep.d());
      this.bU.a(2, new bzi(this, 1.0));
      this.bU.a(3, new cbe(this, 1.25, $$0 -> $$0.a(awd.aj), false));
      this.cP = new cep.k();
      this.bU.a(4, this.cP);
      this.bU.a(5, new bzv(this, 1.25));
      this.bU.a(5, new cep.i());
      this.cQ = new cep.e();
      this.bU.a(5, this.cQ);
      this.cR = new cep.f();
      this.bU.a(6, this.cR);
      this.bU.a(7, new cep.g());
      this.bU.a(8, new cep.l());
      this.bU.a(9, new bzq(this));
      this.bV.a(1, new cep.h(this).a(new Class[0]));
      this.bV.a(2, new cep.c(this));
      this.bV.a(3, new cbv<>(this, true));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("hive_pos", um.a(this.gv()));
      }

      if (this.u()) {
         $$0.a("flower_pos", um.a(this.s()));
      }

      $$0.a("HasNectar", this.gx());
      $$0.a("HasStung", this.gy());
      $$0.a("TicksSincePollination", this.cG);
      $$0.a("CannotEnterHiveTicks", this.cH);
      $$0.a("CropsGrownSincePollination", this.cI);
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      this.cO = um.a($$0, "hive_pos").orElse(null);
      this.cN = um.a($$0, "flower_pos").orElse(null);
      super.a($$0);
      this.w($$0.q("HasNectar"));
      this.x($$0.q("HasStung"));
      this.cG = $$0.h("TicksSincePollination");
      this.cH = $$0.h("CannotEnterHiveTicks");
      this.cI = $$0.h("CropsGrownSincePollination");
      this.a(this.dP(), $$0);
   }

   @Override
   public boolean D(bsd $$0) {
      bqw $$1 = this.dQ().a((bsy)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.g(bug.c)));
      if ($$2) {
         if (this.dP() instanceof aqk $$3) {
            czl.a($$3, $$0, $$1);
         }

         if ($$0 instanceof bsy $$4) {
            $$4.q($$4.eQ() + 1);
            int $$5 = 0;
            if (this.dP().al() == bqa.c) {
               $$5 = 10;
            } else if (this.dP().al() == bqa.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new brl(brn.s, $$5 * 20, 0), this);
            }
         }

         this.x(true);
         this.V_();
         this.a(avf.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gx() && this.gG() < 10 && this.ah.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.ah.a(2) + 1; $$0++) {
            this.a(this.dP(), this.du() - 0.3F, this.du() + 0.3F, this.dA() - 0.3F, this.dA() + 0.3F, this.e(0.5), lj.ay);
         }
      }

      this.gE();
   }

   private void a(dcd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, lh $$6) {
      $$0.a($$6, aye.d($$0.z.j(), $$1, $$2), $$5, aye.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(ja $$0) {
      evz $$1 = evz.c($$0);
      int $$2 = 0;
      ja $$3 = this.dp();
      int $$4 = (int)$$1.d - $$3.v();
      if ($$4 > 2) {
         $$2 = 4;
      } else if ($$4 < -2) {
         $$2 = -4;
      }

      int $$5 = 6;
      int $$6 = 8;
      int $$7 = $$3.k($$0);
      if ($$7 < 15) {
         $$5 = $$7 / 2;
         $$6 = $$7 / 2;
      }

      evz $$8 = cds.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bT.a(0.5F);
         this.bT.a($$8.c, $$8.d, $$8.e, 1.0);
      }
   }

   @Nullable
   public ja s() {
      return this.cN;
   }

   public boolean u() {
      return this.cN != null;
   }

   public void h(ja $$0) {
      this.cN = $$0;
   }

   @azi
   public int y() {
      return Math.max(this.cQ.d, this.cR.d);
   }

   @azi
   public List<ja> gn() {
      return this.cQ.f;
   }

   private boolean gC() {
      return this.cG > 3600;
   }

   boolean gD() {
      if (this.cH <= 0 && !this.cP.l() && !this.gy() && this.p() == null) {
         boolean $$0 = this.gC() || this.dP().ad() || this.dP().S() || this.gx();
         return $$0 && !this.gF();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cH = $$0;
   }

   public float H(float $$0) {
      return aye.i($$0, this.cE, this.cD);
   }

   private void gE() {
      this.cE = this.cD;
      if (this.gK()) {
         this.cD = Math.min(1.0F, this.cD + 0.2F);
      } else {
         this.cD = Math.max(0.0F, this.cD - 0.24F);
      }
   }

   @Override
   protected void Z() {
      boolean $$0 = this.gy();
      if (this.bh()) {
         this.cS++;
      } else {
         this.cS = 0;
      }

      if (this.cS > 20) {
         this.a(this.dQ().i(), 1.0F);
      }

      if ($$0) {
         this.cF++;
         if (this.cF % 5 == 0 && this.ah.a(aye.a(1200 - this.cF, 1, 1200)) == 0) {
            this.a(this.dQ().o(), this.ew());
         }
      }

      if (!this.gx()) {
         this.cG++;
      }

      if (!this.dP().B) {
         this.a((aqk)this.dP(), false);
      }
   }

   public void gt() {
      this.cG = 0;
   }

   private boolean gF() {
      if (this.cO == null) {
         return false;
      } else {
         dpn $$0 = this.dP().c_(this.cO);
         return $$0 instanceof dpk && ((dpk)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.ao.a(cl);
   }

   @Override
   public void a(int $$0) {
      this.ao.a(cl, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cC;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cC = $$0;
   }

   @Override
   public void c() {
      this.a(cB.a(this.ah));
   }

   private boolean k(ja $$0) {
      dpn $$1 = this.dP().c_($$0);
      return $$1 instanceof dpk ? !((dpk)$$1).d() : false;
   }

   @azi
   public boolean gu() {
      return this.cO != null;
   }

   @Nullable
   @azi
   public ja gv() {
      return this.cO;
   }

   @azi
   public bzx gw() {
      return this.bU;
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   int gG() {
      return this.cI;
   }

   private void gH() {
      this.cI = 0;
   }

   void gI() {
      this.cI++;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         if (this.cH > 0) {
            this.cH--;
         }

         if (this.cK > 0) {
            this.cK--;
         }

         if (this.cM > 0) {
            this.cM--;
         }

         boolean $$0 = this.Z_() && !this.gy() && this.p() != null && this.p().g(this) < 4.0;
         this.y($$0);
         if (this.ai % 20 == 0 && !this.gJ()) {
            this.cO = null;
         }
      }
   }

   boolean gJ() {
      if (!this.gu()) {
         return false;
      } else if (this.l(this.cO)) {
         return false;
      } else {
         dpn $$0 = this.dP().c_(this.cO);
         return $$0 != null && $$0.r() == dpp.H;
      }
   }

   public boolean gx() {
      return this.u(8);
   }

   void w(boolean $$0) {
      if ($$0) {
         this.gt();
      }

      this.d(8, $$0);
   }

   public boolean gy() {
      return this.u(4);
   }

   private void x(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gK() {
      return this.u(2);
   }

   private void y(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(ja $$0) {
      return !this.b($$0, 32);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.ao.a(ck, (byte)(this.ao.a(ck) | $$0));
      } else {
         this.ao.a(ck, (byte)(this.ao.a(ck) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.ao.a(ck) & $$0) != 0;
   }

   public static buf.a gz() {
      return bta.A().a(bug.s, 10.0).a(bug.l, 0.6F).a(bug.v, 0.3F).a(bug.c, 2.0).a(bug.m, 48.0);
   }

   @Override
   protected cck b(dcd $$0) {
      cci $$1 = new cci(this, $$0) {
         @Override
         public boolean a(ja $$0) {
            return !this.b.a_($$0.d()).i();
         }

         @Override
         public void c() {
            if (!cep.this.cP.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.c(true);
      return $$1;
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.aj);
   }

   boolean m(ja $$0) {
      return this.dP().p($$0) && this.dP().a_($$0).a(avu.U);
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
   }

   @Override
   protected ave v() {
      return null;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.bP;
   }

   @Override
   protected ave o_() {
      return avf.bO;
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Nullable
   public cep b(aqk $$0, brx $$1) {
      return bsj.h.a((dcd)$$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsh $$2, ja $$3) {
   }

   @Override
   public boolean aV() {
      return this.gA() && this.ai % cb == 0;
   }

   @Override
   public boolean gA() {
      return !this.aE();
   }

   public void gB() {
      this.w(false);
      this.gH();
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B) {
            this.cP.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(awk<eoa> $$0) {
      this.h(this.ds().b(0.0, 0.01, 0.0));
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.2F));
   }

   boolean b(ja $$0, int $$1) {
      return $$0.a(this.dp(), (double)$$1);
   }

   public void i(ja $$0) {
      this.cO = $$0;
   }

   abstract class a extends bzw {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean a() {
         return this.h() && !cep.this.Z_();
      }

      @Override
      public boolean b() {
         return this.i() && !cep.this.Z_();
      }
   }

   class b extends cag {
      b(final bth $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean a() {
         return super.a() && cep.this.Z_() && !cep.this.gy();
      }

      @Override
      public boolean b() {
         return super.b() && cep.this.Z_() && !cep.this.gy();
      }
   }

   static class c extends cbp<cmh> {
      c(cep $$0) {
         super($$0, cmh.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean a() {
         return this.i() && super.a();
      }

      @Override
      public boolean b() {
         boolean $$0 = this.i();
         if ($$0 && this.e.p() != null) {
            return super.b();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cep $$0 = (cep)this.e;
         return $$0.Z_() && !$$0.gy();
      }
   }

   class d extends cep.a {
      @Override
      public boolean h() {
         if (cep.this.gu() && cep.this.gD() && cep.this.cO.a(cep.this.dn(), 2.0) && cep.this.dP().c_(cep.this.cO) instanceof dpk $$1) {
            if (!$$1.d()) {
               return true;
            }

            cep.this.cO = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         if (cep.this.dP().c_(cep.this.cO) instanceof dpk $$1) {
            $$1.a(cep.this);
         }
      }
   }

   @azi
   public class e extends cep.a {
      public static final int b = 600;
      int d = cep.this.dP().z.a(10);
      private static final int e = 3;
      final List<ja> f = Lists.newArrayList();
      @Nullable
      private eop g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean h() {
         return cep.this.cO != null && !cep.this.fX() && cep.this.gD() && !this.d(cep.this.cO) && cep.this.dP().a_(cep.this.cO).a(avu.aG);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void c() {
         this.d = 0;
         this.i = 0;
         super.c();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         cep.this.bT.n();
         cep.this.bT.g();
      }

      @Override
      public void e() {
         if (cep.this.cO != null) {
            this.d++;
            if (this.d > this.a(600)) {
               this.l();
            } else if (!cep.this.bT.m()) {
               if (!cep.this.b(cep.this.cO, 16)) {
                  if (cep.this.l(cep.this.cO)) {
                     this.m();
                  } else {
                     cep.this.j(cep.this.cO);
                  }
               } else {
                  boolean $$0 = this.a(cep.this.cO);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cep.this.bT.j().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        this.m();
                        this.i = 0;
                     }
                  } else {
                     this.g = cep.this.bT.j();
                  }
               }
            }
         }
      }

      private boolean a(ja $$0) {
         cep.this.bT.a(10.0F);
         cep.this.bT.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), 2, 1.0);
         return cep.this.bT.j() != null && cep.this.bT.j().j();
      }

      boolean b(ja $$0) {
         return this.f.contains($$0);
      }

      private void c(ja $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cep.this.cO != null) {
            this.c(cep.this.cO);
         }

         this.m();
      }

      private void m() {
         cep.this.cO = null;
         cep.this.cK = 200;
      }

      private boolean d(ja $$0) {
         if (cep.this.b($$0, 2)) {
            return true;
         } else {
            eop $$1 = cep.this.bT.j();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cep.a {
      private static final int c = 600;
      int d = cep.this.dP().z.a(10);

      f() {
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean h() {
         return cep.this.cN != null && !cep.this.fX() && this.k() && cep.this.m(cep.this.cN) && !cep.this.b(cep.this.cN, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void c() {
         this.d = 0;
         super.c();
      }

      @Override
      public void d() {
         this.d = 0;
         cep.this.bT.n();
         cep.this.bT.g();
      }

      @Override
      public void e() {
         if (cep.this.cN != null) {
            this.d++;
            if (this.d > this.a(600)) {
               cep.this.cN = null;
            } else if (!cep.this.bT.m()) {
               if (cep.this.l(cep.this.cN)) {
                  cep.this.cN = null;
               } else {
                  cep.this.j(cep.this.cN);
               }
            }
         }
      }

      private boolean k() {
         return cep.this.cG > 2400;
      }
   }

   class g extends cep.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cep.this.gG() >= 10) {
            return false;
         } else {
            return cep.this.ah.i() < 0.3F ? false : cep.this.gx() && cep.this.gJ();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void e() {
         if (cep.this.ah.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               ja $$1 = cep.this.dp().c($$0);
               dsh $$2 = cep.this.dP().a_($$1);
               dff $$3 = $$2.b();
               dsh $$4 = null;
               if ($$2.a(avu.aI)) {
                  if ($$3 instanceof dha) {
                     dha $$5 = (dha)$$3;
                     if (!$$5.h($$2)) {
                        $$4 = $$5.b($$5.g($$2) + 1);
                     }
                  } else if ($$3 instanceof dnb) {
                     int $$6 = $$2.c(dnb.c);
                     if ($$6 < 7) {
                        $$4 = $$2.a(dnb.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dfh.oi)) {
                     int $$7 = $$2.c(dni.c);
                     if ($$7 < 3) {
                        $$4 = $$2.a(dni.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dfh.sv) || $$2.a(dfh.sw)) {
                     ((dfi)$$2.b()).a((aqk)cep.this.dP(), cep.this.ah, $$1, $$2);
                  }

                  if ($$4 != null) {
                     cep.this.dP().c(2011, $$1, 15);
                     cep.this.dP().b($$1, $$4);
                     cep.this.gI();
                  }
               }
            }
         }
      }
   }

   class h extends cbo {
      h(final cep $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         return cep.this.Z_() && super.b();
      }

      @Override
      protected void a(bta $$0, bsy $$1) {
         if ($$0 instanceof cep && this.e.F($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cep.a {
      @Override
      public boolean h() {
         return cep.this.cK == 0 && !cep.this.gu() && cep.this.gD();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void c() {
         cep.this.cK = 200;
         List<ja> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (ja $$1 : $$0) {
               if (!cep.this.cQ.b($$1)) {
                  cep.this.cO = $$1;
                  return;
               }
            }

            cep.this.cQ.k();
            cep.this.cO = $$0.get(0);
         }
      }

      private List<ja> k() {
         ja $$0 = cep.this.dp();
         cec $$1 = ((aqk)cep.this.dP()).y();
         Stream<ced> $$2 = $$1.c($$0x -> $$0x.a(awf.c), $$0, 20, cec.b.c);
         return $$2.map(ced::f).filter(cep.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends byy {
      j(final bta $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cep.this.Z_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cep.this.cP.l();
      }
   }

   class k extends cep.a {
      private static final int c = 400;
      private static final int d = 20;
      private static final int e = 60;
      private final Predicate<dsh> f = $$0 -> {
         if ($$0.b(dsx.C) && $$0.c(dsx.C)) {
            return false;
         } else if ($$0.a(avu.U)) {
            return $$0.a(dfh.iD) ? $$0.c(dhn.b) == dtd.a : true;
         } else {
            return false;
         }
      };
      private static final double g = 0.1;
      private static final int h = 25;
      private static final float i = 0.35F;
      private static final float j = 0.6F;
      private static final float k = 0.33333334F;
      private int l;
      private int m;
      private boolean n;
      @Nullable
      private evz o;
      private int p;
      private static final int q = 600;

      k() {
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean h() {
         if (cep.this.cM > 0) {
            return false;
         } else if (cep.this.gx()) {
            return false;
         } else if (cep.this.dP().ad()) {
            return false;
         } else {
            Optional<ja> $$0 = this.p();
            if ($$0.isPresent()) {
               cep.this.cN = $$0.get();
               cep.this.bT.a((double)cep.this.cN.u() + 0.5, (double)cep.this.cN.v() + 0.5, (double)cep.this.cN.w() + 0.5, 1.2F);
               return true;
            } else {
               cep.this.cM = aye.a(cep.this.ah, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.n) {
            return false;
         } else if (!cep.this.u()) {
            return false;
         } else if (cep.this.dP().ad()) {
            return false;
         } else if (this.k()) {
            return cep.this.ah.i() < 0.2F;
         } else if (cep.this.ai % 20 == 0 && !cep.this.m(cep.this.cN)) {
            cep.this.cN = null;
            return false;
         } else {
            return true;
         }
      }

      private boolean k() {
         return this.l > 400;
      }

      boolean l() {
         return this.n;
      }

      void m() {
         this.n = false;
      }

      @Override
      public void c() {
         this.l = 0;
         this.p = 0;
         this.m = 0;
         this.n = true;
         cep.this.gt();
      }

      @Override
      public void d() {
         if (this.k()) {
            cep.this.w(true);
         }

         this.n = false;
         cep.this.bT.n();
         cep.this.cM = 200;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         this.p++;
         if (this.p > 600) {
            cep.this.cN = null;
         } else {
            evz $$0 = evz.c(cep.this.cN).b(0.0, 0.6F, 0.0);
            if ($$0.f(cep.this.dn()) > 1.0) {
               this.o = $$0;
               this.n();
            } else {
               if (this.o == null) {
                  this.o = $$0;
               }

               boolean $$1 = cep.this.dn().f(this.o) <= 0.1;
               boolean $$2 = true;
               if (!$$1 && this.p > 600) {
                  cep.this.cN = null;
               } else {
                  if ($$1) {
                     boolean $$3 = cep.this.ah.a(25) == 0;
                     if ($$3) {
                        this.o = new evz($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                        cep.this.bT.n();
                     } else {
                        $$2 = false;
                     }

                     cep.this.G().a($$0.a(), $$0.b(), $$0.c());
                  }

                  if ($$2) {
                     this.n();
                  }

                  this.l++;
                  if (cep.this.ah.i() < 0.05F && this.l > this.m + 60) {
                     this.m = this.l;
                     cep.this.a(avf.bT, 1.0F, 1.0F);
                  }
               }
            }
         }
      }

      private void n() {
         cep.this.H().a(this.o.a(), this.o.b(), this.o.c(), 0.35F);
      }

      private float o() {
         return (cep.this.ah.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<ja> p() {
         return this.a(this.f, 5.0);
      }

      private Optional<ja> a(Predicate<dsh> $$0, double $$1) {
         ja $$2 = cep.this.dp();
         ja.a $$3 = new ja.a();

         for (int $$4 = 0; (double)$$4 <= $$1; $$4 = $$4 > 0 ? -$$4 : 1 - $$4) {
            for (int $$5 = 0; (double)$$5 < $$1; $$5++) {
               for (int $$6 = 0; $$6 <= $$5; $$6 = $$6 > 0 ? -$$6 : 1 - $$6) {
                  for (int $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0; $$7 <= $$5; $$7 = $$7 > 0 ? -$$7 : 1 - $$7) {
                     $$3.a($$2, $$6, $$4 - 1, $$7);
                     if ($$2.a($$3, $$1) && $$0.test(cep.this.dP().a_($$3))) {
                        return Optional.of($$3);
                     }
                  }
               }
            }
         }

         return Optional.empty();
      }
   }

   class l extends bzw {
      private static final int b = 22;

      l() {
         this.a(EnumSet.of(bzw.a.a));
      }

      @Override
      public boolean a() {
         return cep.this.bT.l() && cep.this.ah.a(10) == 0;
      }

      @Override
      public boolean b() {
         return cep.this.bT.m();
      }

      @Override
      public void c() {
         evz $$0 = this.h();
         if ($$0 != null) {
            cep.this.bT.a(cep.this.bT.a(ja.a($$0), 1), 1.0);
         }
      }

      @Nullable
      private evz h() {
         evz $$1;
         if (cep.this.gJ() && !cep.this.b(cep.this.cO, 22)) {
            evz $$0 = evz.b(cep.this.cO);
            $$1 = $$0.d(cep.this.dn()).d();
         } else {
            $$1 = cep.this.g(0.0F);
         }

         int $$3 = 8;
         evz $$4 = cdv.a(cep.this, 8, 7, $$1.c, $$1.e, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cdr.a(cep.this, 8, 4, -2, $$1.c, $$1.e, (float) (Math.PI / 2));
      }
   }
}
