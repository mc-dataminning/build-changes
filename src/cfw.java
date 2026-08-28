import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cfw extends cfv implements buk, cge {
   public static final float bZ = 120.32113F;
   public static final int ca = azc.f(1.4959966F);
   private static final akg<Byte> cj = akk.a(cfw.class, aki.a);
   private static final akg<Integer> ck = akk.a(cfw.class, aki.b);
   private static final int cl = 2;
   private static final int cm = 4;
   private static final int cn = 8;
   private static final int co = 1200;
   private static final int cp = 600;
   private static final int cq = 3600;
   private static final int cr = 4;
   private static final int cs = 10;
   private static final int ct = 10;
   private static final int cu = 18;
   private static final int cv = 48;
   private static final int cw = 2;
   private static final int cx = 24;
   private static final int cy = 16;
   private static final int cz = 16;
   private static final int cB = 20;
   public static final String cb = "CropsGrownSincePollination";
   public static final String cd = "CannotEnterHiveTicks";
   public static final String ce = "TicksSincePollination";
   public static final String cf = "HasStung";
   public static final String cg = "HasNectar";
   public static final String ch = "flower_pos";
   public static final String ci = "hive_pos";
   private static final bqv cC = bad.a(20, 39);
   @Nullable
   private UUID cD;
   private float cE;
   private float cF;
   private int cG;
   int cH;
   private int cI;
   private int cJ;
   private static final int cK = 200;
   int cL;
   private static final int cM = 200;
   private static final int cN = 20;
   private static final int cO = 60;
   int cP = azc.a(this.af, 20, 60);
   @Nullable
   je cQ;
   @Nullable
   je cR;
   cfw.k cS;
   cfw.e cT;
   private cfw.f cU;
   private int cV;

   public cfw(btq<? extends cfw> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new cac(this, 20, true);
      this.bP = new cfw.j(this);
      this.a(eqs.n, -1.0F);
      this.a(eqs.j, -1.0F);
      this.a(eqs.k, 16.0F);
      this.a(eqs.x, -1.0F);
      this.a(eqs.h, -1.0F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cj, (byte)0);
      $$0.a(ck, 0);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return $$1.a_($$0).l() ? 10.0F : 0.0F;
   }

   @Override
   protected void D() {
      this.bT.a(0, new cfw.b(this, 1.4F, true));
      this.bT.a(1, new cfw.d());
      this.bT.a(2, new cao(this, 1.0));
      this.bT.a(3, new cck(this, 1.25, $$0 -> $$0.a(axb.aj), false));
      this.bT.a(3, new cfw.n());
      this.bT.a(3, new cfw.m());
      this.cS = new cfw.k();
      this.bT.a(4, this.cS);
      this.bT.a(5, new cbb(this, 1.25));
      this.bT.a(5, new cfw.i());
      this.cT = new cfw.e();
      this.bT.a(5, this.cT);
      this.cU = new cfw.f();
      this.bT.a(6, this.cU);
      this.bT.a(7, new cfw.g());
      this.bT.a(8, new cfw.l());
      this.bT.a(9, new caw(this));
      this.bU.a(1, new cfw.h(this).a(new Class[0]));
      this.bU.a(2, new cfw.c(this));
      this.bU.a(3, new cdb<>(this, true));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.gq()) {
         $$0.a("hive_pos", uu.a(this.gr()));
      }

      if (this.t()) {
         $$0.a("flower_pos", uu.a(this.q()));
      }

      $$0.a("HasNectar", this.gA());
      $$0.a("HasStung", this.gB());
      $$0.a("TicksSincePollination", this.cH);
      $$0.a("CannotEnterHiveTicks", this.cI);
      $$0.a("CropsGrownSincePollination", this.cJ);
      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.x($$0.q("HasNectar"));
      this.y($$0.q("HasStung"));
      this.cH = $$0.h("TicksSincePollination");
      this.cI = $$0.h("CannotEnterHiveTicks");
      this.cJ = $$0.h("CropsGrownSincePollination");
      this.cR = uu.a($$0, "hive_pos").orElse(null);
      this.cQ = uu.a($$0, "flower_pos").orElse(null);
      this.a(this.dS(), $$0);
   }

   @Override
   public boolean E(btj $$0) {
      bsb $$1 = this.dT().a((buf)this);
      boolean $$2 = $$0.a($$1, (float)((int)this.h(bvm.c)));
      if ($$2) {
         if (this.dS() instanceof arg $$3) {
            day.a($$3, $$0, $$1);
         }

         if ($$0 instanceof buf $$4) {
            $$4.q($$4.eT() + 1);
            int $$5 = 0;
            if (this.dS().am() == brh.c) {
               $$5 = 10;
            } else if (this.dS().am() == brh.d) {
               $$5 = 18;
            }

            if ($$5 > 0) {
               $$4.b(new bsq(bss.s, $$5 * 20, 0), this);
            }
         }

         this.y(true);
         this.Y_();
         this.a(awd.bS, 1.0F, 1.0F);
      }

      return $$2;
   }

   @Override
   public void l() {
      super.l();
      if (this.gA() && this.gL() < 10 && this.af.i() < 0.05F) {
         for (int $$0 = 0; $$0 < this.af.a(2) + 1; $$0++) {
            this.a(this.dS(), this.dx() - 0.3F, this.dx() + 0.3F, this.dD() - 0.3F, this.dD() + 0.3F, this.e(0.5), ln.ay);
         }
      }

      this.gJ();
   }

   private void a(dds $$0, double $$1, double $$2, double $$3, double $$4, double $$5, ll $$6) {
      $$0.a($$6, azc.d($$0.z.j(), $$1, $$2), $$5, azc.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   void j(je $$0) {
      eye $$1 = eye.c($$0);
      int $$2 = 0;
      je $$3 = this.ds();
      int $$4 = (int)$$1.e - $$3.v();
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

      eye $$8 = cey.a(this, $$5, $$6, $$2, $$1, (float) (Math.PI / 10));
      if ($$8 != null) {
         this.bS.b(0.5F);
         this.bS.a($$8.d, $$8.e, $$8.f, 1.0);
      }
   }

   @Nullable
   public je q() {
      return this.cQ;
   }

   public boolean t() {
      return this.cQ != null;
   }

   public void h(je $$0) {
      this.cQ = $$0;
   }

   @bai
   public int y() {
      return Math.max(this.cT.d, this.cU.d);
   }

   @bai
   public List<je> go() {
      return this.cT.f;
   }

   private boolean gF() {
      return this.cH > 3600;
   }

   void gG() {
      this.cR = null;
      this.cL = 200;
   }

   void gH() {
      this.cQ = null;
      this.cP = azc.a(this.af, 20, 60);
   }

   boolean gI() {
      if (this.cI <= 0 && !this.cS.l() && !this.gB() && this.m() == null) {
         boolean $$0 = this.gF() || this.dS().ae() || this.dS().T() || this.gA();
         return $$0 && !this.gK();
      } else {
         return false;
      }
   }

   public void t(int $$0) {
      this.cI = $$0;
   }

   public float J(float $$0) {
      return azc.h($$0, this.cF, this.cE);
   }

   private void gJ() {
      this.cF = this.cE;
      if (this.gP()) {
         this.cE = Math.min(1.0F, this.cE + 0.2F);
      } else {
         this.cE = Math.max(0.0F, this.cE - 0.24F);
      }
   }

   @Override
   protected void ad() {
      boolean $$0 = this.gB();
      if (this.bl()) {
         this.cV++;
      } else {
         this.cV = 0;
      }

      if (this.cV > 20) {
         this.a(this.dT().i(), 1.0F);
      }

      if ($$0) {
         this.cG++;
         if (this.cG % 5 == 0 && this.af.a(azc.a(1200 - this.cG, 1, 1200)) == 0) {
            this.a(this.dT().p(), this.eA());
         }
      }

      if (!this.gA()) {
         this.cH++;
      }

      if (!this.dS().B) {
         this.a((arg)this.dS(), false);
      }
   }

   public void gp() {
      this.cH = 0;
   }

   private boolean gK() {
      if (this.cR == null) {
         return false;
      } else {
         dre $$0 = this.dS().c_(this.cR);
         return $$0 instanceof drb && ((drb)$$0).b();
      }
   }

   @Override
   public int a() {
      return this.am.a(ck);
   }

   @Override
   public void a(int $$0) {
      this.am.a(ck, $$0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cD;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cD = $$0;
   }

   @Override
   public void c() {
      this.a(cC.a(this.af));
   }

   private boolean k(je $$0) {
      dre $$1 = this.dS().c_($$0);
      return $$1 instanceof drb ? !((drb)$$1).d() : false;
   }

   @bai
   public boolean gq() {
      return this.cR != null;
   }

   @Nullable
   @bai
   public je gr() {
      return this.cR;
   }

   @bai
   public cbd gs() {
      return this.bT;
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   int gL() {
      return this.cJ;
   }

   private void gM() {
      this.cJ = 0;
   }

   void gN() {
      this.cJ++;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         if (this.cI > 0) {
            this.cI--;
         }

         if (this.cL > 0) {
            this.cL--;
         }

         if (this.cP > 0) {
            this.cP--;
         }

         boolean $$0 = this.ac_() && !this.gB() && this.m() != null && this.m().g(this) < 4.0;
         this.z($$0);
         if (this.ag % 20 == 0 && !this.gO()) {
            this.cR = null;
         }
      }
   }

   boolean gO() {
      if (!this.gq()) {
         return false;
      } else if (this.l(this.cR)) {
         return false;
      } else {
         dre $$0 = this.dS().c_(this.cR);
         return $$0 != null && $$0.q() == drg.H;
      }
   }

   public boolean gA() {
      return this.u(8);
   }

   void x(boolean $$0) {
      if ($$0) {
         this.gp();
      }

      this.d(8, $$0);
   }

   public boolean gB() {
      return this.u(4);
   }

   private void y(boolean $$0) {
      this.d(4, $$0);
   }

   private boolean gP() {
      return this.u(2);
   }

   private void z(boolean $$0) {
      this.d(2, $$0);
   }

   boolean l(je $$0) {
      return !this.b($$0, 48);
   }

   private void d(int $$0, boolean $$1) {
      if ($$1) {
         this.am.a(cj, (byte)(this.am.a(cj) | $$0));
      } else {
         this.am.a(cj, (byte)(this.am.a(cj) & ~$$0));
      }
   }

   private boolean u(int $$0) {
      return (this.am.a(cj) & $$0) != 0;
   }

   public static bvl.a gC() {
      return cfv.gt().a(bvm.s, 10.0).a(bvm.l, 0.6F).a(bvm.v, 0.3F).a(bvm.c, 2.0);
   }

   @Override
   protected cdq b(dds $$0) {
      cdo $$1 = new cdo(this, $$0) {
         @Override
         public boolean a(je $$0) {
            return !this.b.a_($$0.e()).l();
         }

         @Override
         public void c() {
            if (!cfw.this.cS.l()) {
               super.c();
            }
         }
      };
      $$1.b(false);
      $$1.a(false);
      $$1.c(true);
      $$1.a(48.0F);
      return $$1;
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.aj);
   }

   @Override
   protected void b(je $$0, dua $$1) {
   }

   @Override
   protected awc w() {
      return null;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.bP;
   }

   @Override
   protected awc n_() {
      return awd.bO;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Nullable
   public cfw b(arg $$0, btc $$1) {
      return btq.h.a($$0, btp.e);
   }

   @Override
   protected void a(double $$0, boolean $$1, dua $$2, je $$3) {
   }

   @Override
   public boolean aZ() {
      return this.gD() && this.ag % ca == 0;
   }

   @Override
   public boolean gD() {
      return !this.aH();
   }

   public void gE() {
      this.x(false);
      this.gM();
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.cS.m();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void c(axi<eqa> $$0) {
      this.h(this.dv().b(0.0, 0.01, 0.0));
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.5F * this.cP()), (double)(this.dn() * 0.2F));
   }

   boolean b(je $$0, int $$1) {
      return $$0.a(this.ds(), (double)$$1);
   }

   public void i(je $$0) {
      this.cR = $$0;
   }

   abstract class a extends cbc {
      public abstract boolean h();

      public abstract boolean i();

      @Override
      public boolean b() {
         return this.h() && !cfw.this.ac_();
      }

      @Override
      public boolean c() {
         return this.i() && !cfw.this.ac_();
      }
   }

   class b extends cbm {
      b(final bun $$0, final double $$1, final boolean $$2) {
         super($$0, $$1, $$2);
      }

      @Override
      public boolean b() {
         return super.b() && cfw.this.ac_() && !cfw.this.gB();
      }

      @Override
      public boolean c() {
         return super.c() && cfw.this.ac_() && !cfw.this.gB();
      }
   }

   static class c extends ccv<cnp> {
      c(cfw $$0) {
         super($$0, cnp.class, 10, true, false, $$0::a_);
      }

      @Override
      public boolean b() {
         return this.i() && super.b();
      }

      @Override
      public boolean c() {
         boolean $$0 = this.i();
         if ($$0 && this.e.m() != null) {
            return super.c();
         } else {
            this.g = null;
            return false;
         }
      }

      private boolean i() {
         cfw $$0 = (cfw)this.e;
         return $$0.ac_() && !$$0.gB();
      }
   }

   class d extends cfw.a {
      @Override
      public boolean h() {
         if (cfw.this.gq() && cfw.this.gI() && cfw.this.cR.a(cfw.this.dq(), 2.0) && cfw.this.dS().c_(cfw.this.cR) instanceof drb $$1) {
            if (!$$1.d()) {
               return true;
            }

            cfw.this.cR = null;
         }

         return false;
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         if (cfw.this.dS().c_(cfw.this.cR) instanceof drb $$1) {
            $$1.a(cfw.this);
         }
      }
   }

   @bai
   public class e extends cfw.a {
      public static final int b = 2400;
      int d = cfw.this.dS().z.a(10);
      private static final int e = 3;
      final List<je> f = Lists.newArrayList();
      @Nullable
      private eqp g;
      private static final int h = 60;
      private int i;

      e() {
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean h() {
         return cfw.this.cR != null && !cfw.this.gc() && cfw.this.gI() && !this.d(cfw.this.cR) && cfw.this.dS().a_(cfw.this.cR).a(aws.aH);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         this.i = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         this.i = 0;
         cfw.this.bS.o();
         cfw.this.bS.h();
      }

      @Override
      public void a() {
         if (cfw.this.cR != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               this.l();
            } else if (!cfw.this.bS.n()) {
               if (!cfw.this.b(cfw.this.cR, 16)) {
                  if (cfw.this.l(cfw.this.cR)) {
                     cfw.this.gG();
                  } else {
                     cfw.this.j(cfw.this.cR);
                  }
               } else {
                  boolean $$0 = this.a(cfw.this.cR);
                  if (!$$0) {
                     this.l();
                  } else if (this.g != null && cfw.this.bS.k().a(this.g)) {
                     this.i++;
                     if (this.i > 60) {
                        cfw.this.gG();
                        this.i = 0;
                     }
                  } else {
                     this.g = cfw.this.bS.k();
                  }
               }
            }
         }
      }

      private boolean a(je $$0) {
         int $$1 = cfw.this.b(cfw.this.cR, 3) ? 1 : 2;
         cfw.this.bS.b(10.0F);
         cfw.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), $$1, 1.0);
         return cfw.this.bS.k() != null && cfw.this.bS.k().j();
      }

      boolean b(je $$0) {
         return this.f.contains($$0);
      }

      private void c(je $$0) {
         this.f.add($$0);

         while (this.f.size() > 3) {
            this.f.remove(0);
         }
      }

      void k() {
         this.f.clear();
      }

      private void l() {
         if (cfw.this.cR != null) {
            this.c(cfw.this.cR);
         }

         cfw.this.gG();
      }

      private boolean d(je $$0) {
         if (cfw.this.b($$0, 2)) {
            return true;
         } else {
            eqp $$1 = cfw.this.bS.k();
            return $$1 != null && $$1.l().equals($$0) && $$1.j() && $$1.c();
         }
      }
   }

   public class f extends cfw.a {
      private static final int c = 2400;
      int d = cfw.this.dS().z.a(10);

      f() {
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean h() {
         return cfw.this.cQ != null && !cfw.this.gc() && this.k() && !cfw.this.b(cfw.this.cQ, 2);
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void d() {
         this.d = 0;
         super.d();
      }

      @Override
      public void e() {
         this.d = 0;
         cfw.this.bS.o();
         cfw.this.bS.h();
      }

      @Override
      public void a() {
         if (cfw.this.cQ != null) {
            this.d++;
            if (this.d > this.a(2400)) {
               cfw.this.gH();
            } else if (!cfw.this.bS.n()) {
               if (cfw.this.l(cfw.this.cQ)) {
                  cfw.this.gH();
               } else {
                  cfw.this.j(cfw.this.cQ);
               }
            }
         }
      }

      private boolean k() {
         return cfw.this.cH > 600;
      }
   }

   class g extends cfw.a {
      static final int b = 30;

      @Override
      public boolean h() {
         if (cfw.this.gL() >= 10) {
            return false;
         } else {
            return cfw.this.af.i() < 0.3F ? false : cfw.this.gA() && cfw.this.gO();
         }
      }

      @Override
      public boolean i() {
         return this.h();
      }

      @Override
      public void a() {
         if (cfw.this.af.a(this.a(30)) == 0) {
            for (int $$0 = 1; $$0 <= 2; $$0++) {
               je $$1 = cfw.this.ds().c($$0);
               dua $$2 = cfw.this.dS().a_($$1);
               dgv $$3 = $$2.b();
               dua $$4 = null;
               if ($$2.a(aws.aJ)) {
                  if ($$3 instanceof diq) {
                     diq $$5 = (diq)$$3;
                     if (!$$5.i($$2)) {
                        $$4 = $$5.b($$5.h($$2) + 1);
                     }
                  } else if ($$3 instanceof dos) {
                     int $$6 = $$2.c(dos.c);
                     if ($$6 < 7) {
                        $$4 = $$2.b(dos.c, Integer.valueOf($$6 + 1));
                     }
                  } else if ($$2.a(dgx.oi)) {
                     int $$7 = $$2.c(doz.c);
                     if ($$7 < 3) {
                        $$4 = $$2.b(doz.c, Integer.valueOf($$7 + 1));
                     }
                  } else if ($$2.a(dgx.sv) || $$2.a(dgx.sw)) {
                     dgy $$8 = (dgy)$$2.b();
                     if ($$8.b(cfw.this.dS(), $$1, $$2)) {
                        $$8.a((arg)cfw.this.dS(), cfw.this.af, $$1, $$2);
                        $$4 = cfw.this.dS().a_($$1);
                     }
                  }

                  if ($$4 != null) {
                     cfw.this.dS().c(2011, $$1, 15);
                     cfw.this.dS().b($$1, $$4);
                     cfw.this.gN();
                  }
               }
            }
         }
      }
   }

   class h extends ccu {
      h(final cfw $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         return cfw.this.ac_() && super.c();
      }

      @Override
      protected void a(buh $$0, buf $$1) {
         if ($$0 instanceof cfw && this.e.G($$1)) {
            $$0.h($$1);
         }
      }
   }

   class i extends cfw.a {
      @Override
      public boolean h() {
         return cfw.this.cL == 0 && !cfw.this.gq() && cfw.this.gI();
      }

      @Override
      public boolean i() {
         return false;
      }

      @Override
      public void d() {
         cfw.this.cL = 200;
         List<je> $$0 = this.k();
         if (!$$0.isEmpty()) {
            for (je $$1 : $$0) {
               if (!cfw.this.cT.b($$1)) {
                  cfw.this.cR = $$1;
                  return;
               }
            }

            cfw.this.cT.k();
            cfw.this.cR = $$0.get(0);
         }
      }

      private List<je> k() {
         je $$0 = cfw.this.ds();
         cfi $$1 = ((arg)cfw.this.dS()).y();
         Stream<cfj> $$2 = $$1.c($$0x -> $$0x.a(axd.c), $$0, 20, cfi.b.c);
         return $$2.map(cfj::g).filter(cfw.this::k).sorted(Comparator.comparingDouble($$1x -> $$1x.j($$0))).collect(Collectors.toList());
      }
   }

   class j extends cae {
      j(final buh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (!cfw.this.ac_()) {
            super.a();
         }
      }

      @Override
      protected boolean c() {
         return !cfw.this.cS.l();
      }
   }

   class k extends cfw.a {
      private static final int c = 400;
      private final Predicate<dua> d = $$0 -> {
         if ($$0.b(duq.C) && $$0.c(duq.C)) {
            return false;
         } else if ($$0.a(aws.V)) {
            return $$0.a(dgx.iD) ? $$0.c(djd.b) == duw.a : true;
         } else {
            return false;
         }
      };
      private static final double e = 0.1;
      private static final int f = 25;
      private static final float g = 0.35F;
      private static final float h = 0.6F;
      private static final float i = 0.33333334F;
      private static final int j = 5;
      private int k;
      private int l;
      private boolean m;
      @Nullable
      private eye n;
      private int o;
      private static final int p = 600;
      private Long2LongOpenHashMap q = new Long2LongOpenHashMap();

      k() {
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean h() {
         if (cfw.this.cP > 0) {
            return false;
         } else if (cfw.this.gA()) {
            return false;
         } else if (cfw.this.dS().ae()) {
            return false;
         } else {
            Optional<je> $$0 = this.p();
            if ($$0.isPresent()) {
               cfw.this.cQ = $$0.get();
               cfw.this.bS.a((double)cfw.this.cQ.u() + 0.5, (double)cfw.this.cQ.v() + 0.5, (double)cfw.this.cQ.w() + 0.5, 1.2F);
               return true;
            } else {
               cfw.this.cP = azc.a(cfw.this.af, 20, 60);
               return false;
            }
         }
      }

      @Override
      public boolean i() {
         if (!this.m) {
            return false;
         } else if (!cfw.this.t()) {
            return false;
         } else if (cfw.this.dS().ae()) {
            return false;
         } else {
            return this.k() ? cfw.this.af.i() < 0.2F : true;
         }
      }

      private boolean k() {
         return this.k > 400;
      }

      boolean l() {
         return this.m;
      }

      void m() {
         this.m = false;
      }

      @Override
      public void d() {
         this.k = 0;
         this.o = 0;
         this.l = 0;
         this.m = true;
         cfw.this.gp();
      }

      @Override
      public void e() {
         if (this.k()) {
            cfw.this.x(true);
         }

         this.m = false;
         cfw.this.bS.o();
         cfw.this.cP = 200;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (cfw.this.t()) {
            this.o++;
            if (this.o > 600) {
               cfw.this.gH();
               this.m = false;
               cfw.this.cP = 200;
            } else {
               eye $$0 = eye.c(cfw.this.cQ).b(0.0, 0.6F, 0.0);
               if ($$0.f(cfw.this.dq()) > 1.0) {
                  this.n = $$0;
                  this.n();
               } else {
                  if (this.n == null) {
                     this.n = $$0;
                  }

                  boolean $$1 = cfw.this.dq().f(this.n) <= 0.1;
                  boolean $$2 = true;
                  if (!$$1 && this.o > 600) {
                     cfw.this.gH();
                  } else {
                     if ($$1) {
                        boolean $$3 = cfw.this.af.a(25) == 0;
                        if ($$3) {
                           this.n = new eye($$0.a() + (double)this.o(), $$0.b(), $$0.c() + (double)this.o());
                           cfw.this.bS.o();
                        } else {
                           $$2 = false;
                        }

                        cfw.this.K().a($$0.a(), $$0.b(), $$0.c());
                     }

                     if ($$2) {
                        this.n();
                     }

                     this.k++;
                     if (cfw.this.af.i() < 0.05F && this.k > this.l + 60) {
                        this.l = this.k;
                        cfw.this.a(awd.bT, 1.0F, 1.0F);
                     }
                  }
               }
            }
         }
      }

      private void n() {
         cfw.this.M().a(this.n.a(), this.n.b(), this.n.c(), 0.35F);
      }

      private float o() {
         return (cfw.this.af.i() * 2.0F - 1.0F) * 0.33333334F;
      }

      private Optional<je> p() {
         Iterable<je> $$0 = je.a(cfw.this.ds(), 5, 5, 5);
         Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();

         for (je $$2 : $$0) {
            long $$3 = this.q.getOrDefault($$2.a(), Long.MIN_VALUE);
            if (cfw.this.dS().aa() < $$3) {
               $$1.put($$2.a(), $$3);
            } else if (this.d.test(cfw.this.dS().a_($$2))) {
               eqp $$4 = cfw.this.bS.a($$2, 1);
               if ($$4 != null && $$4.j()) {
                  return Optional.of($$2);
               }

               $$1.put($$2.a(), cfw.this.dS().aa() + 600L);
            }
         }

         this.q = $$1;
         return Optional.empty();
      }
   }

   class l extends cbc {
      l() {
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         return cfw.this.bS.m() && cfw.this.af.a(10) == 0;
      }

      @Override
      public boolean c() {
         return cfw.this.bS.n();
      }

      @Override
      public void d() {
         eye $$0 = this.h();
         if ($$0 != null) {
            cfw.this.bS.a(cfw.this.bS.a(je.a((jx)$$0), 1), 1.0);
         }
      }

      @Nullable
      private eye h() {
         eye $$1;
         if (cfw.this.gO() && !cfw.this.b(cfw.this.cR, this.i())) {
            eye $$0 = eye.b(cfw.this.cR);
            $$1 = $$0.d(cfw.this.dq()).d();
         } else {
            $$1 = cfw.this.g(0.0F);
         }

         int $$3 = 8;
         eye $$4 = cfb.a(cfw.this, 8, 7, $$1.d, $$1.f, (float) (Math.PI / 2), 3, 1);
         return $$4 != null ? $$4 : cex.a(cfw.this, 8, 4, -2, $$1.d, $$1.f, (float) (Math.PI / 2));
      }

      private int i() {
         int $$0 = !cfw.this.gq() && !cfw.this.t() ? 16 : 24;
         return 48 - $$0;
      }
   }

   class m extends cfw.a {
      private final int c = azc.a(cfw.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cfw.this.cQ != null && cfw.this.dS().p(cfw.this.cQ) && !this.a(cfw.this.cQ)) {
            cfw.this.gH();
         }

         this.d = cfw.this.dS().aa();
      }

      @Override
      public boolean h() {
         return cfw.this.dS().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }

      private boolean a(je $$0) {
         return cfw.this.dS().a_($$0).a(aws.V);
      }
   }

   class n extends cfw.a {
      private final int c = azc.a(cfw.this.af, 20, 40);
      private long d = -1L;

      @Override
      public void d() {
         if (cfw.this.cR != null && cfw.this.dS().p(cfw.this.cR) && !cfw.this.gO()) {
            cfw.this.gG();
         }

         this.d = cfw.this.dS().aa();
      }

      @Override
      public boolean h() {
         return cfw.this.dS().aa() > this.d + (long)this.c;
      }

      @Override
      public boolean i() {
         return false;
      }
   }
}
