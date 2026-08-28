import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bxy extends bxw implements bxi, bxu, byt {
   private static final akn<Byte> a = akr.a(bxy.class, akp.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int j = 1;
   private static final kb e = new kb(1, 0, 1);
   private static final List<bxf> bH = List.of(bxf.f, bxf.e, bxf.d, bxf.c);
   public static final float k = 0.15F;
   public static final float bu = 0.55F;
   public static final float bv = 0.5F;
   public static final float bw = 0.25F;
   public static final int bx = 2;
   private static final double bI = Math.sqrt(2.04F) - 0.6F;
   private static final boolean bJ = false;
   private static final boolean bK = false;
   private static final boolean bL = false;
   private static final boolean bM = false;
   protected static final alk by = alk.b("random_spawn_bonus");
   public int bz;
   protected int bA;
   protected cdu bB;
   protected cdv bC;
   protected cdt bD;
   private final cdq bN;
   protected chg bE;
   protected final cet bF;
   protected final cet bG;
   @Nullable
   private bxw bO;
   private final cid bP;
   private bwt bQ = bwt.d;
   private boolean bR = false;
   private boolean bS = false;
   private final Map<eyh, Float> bT = Maps.newEnumMap(eyh.class);
   private Optional<alj<fao>> bU = Optional.empty();
   private long bV;
   @Nullable
   private bxu.a bW;
   private iw bX = iw.c;
   private float bY = -1.0F;

   protected bxy(bxe<? extends bxy> $$0, djz $$1) {
      super($$0, $$1);
      this.bF = new cet();
      this.bG = new cet();
      this.bB = new cdu(this);
      this.bC = new cdv(this);
      this.bD = new cdt(this);
      this.bN = this.I();
      this.bE = this.b($$1);
      this.bP = new cid(this);
      if ($$1 instanceof aru) {
         this.D();
      }
   }

   protected void D() {
   }

   public static bzb.a E() {
      return bxw.ee().a(bzc.m, 16.0);
   }

   protected chg b(djz $$0) {
      return new chf(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(eyh $$0) {
      bxy $$2;
      label17: {
         if (this.dl() instanceof bxy $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bT.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eyh $$0, float $$1) {
      this.bT.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   public void H() {
   }

   protected cdq I() {
      return new cdq(this);
   }

   public cdu J() {
      return this.bB;
   }

   public cdv L() {
      return this.dl() instanceof bxy $$0 ? $$0.L() : this.bC;
   }

   public cdt N() {
      return this.bD;
   }

   public chg O() {
      return this.dl() instanceof bxy $$0 ? $$0.O() : this.bE;
   }

   @Nullable
   @Override
   public bxw cW() {
      bwv $$0 = this.cZ();
      if (!this.gj() && $$0 instanceof bxy $$1 && $$0.cb()) {
         return $$1;
      }

      return null;
   }

   public cid P() {
      return this.bP;
   }

   @Nullable
   @Override
   public bxw f() {
      return this.bO;
   }

   @Nullable
   protected final bxw Q() {
      return this.ec().c(cgy.p).orElse(null);
   }

   public void g(@Nullable bxw $$0) {
      this.bO = $$0;
   }

   @Override
   public boolean a(bxe<?> $$0) {
      return $$0 != bxe.ae;
   }

   public boolean a(dav $$0) {
      return false;
   }

   public void R() {
      this.a(egg.m);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   public int S() {
      return 80;
   }

   public void T() {
      this.b(this.u());
   }

   @Override
   public void aw() {
      super.aw();
      brd $$0 = brc.a();
      $$0.a("mobBaseTick");
      if (this.bJ() && this.ae.a(1000) < this.bz++) {
         this.j();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(bvk $$0) {
      this.j();
      super.h($$0);
   }

   private void j() {
      this.bz = -this.S();
   }

   @Override
   protected int e(aru $$0) {
      if (this.bA > 0) {
         int $$1 = this.bA;

         for (bxf $$2 : bxf.j) {
            if ($$2.g()) {
               daa $$3 = this.a($$2);
               if (!$$3.f() && this.bQ.b($$2) <= 1.0F) {
                  $$1 += 1 + this.ae.a(3);
               }
            }
         }

         return $$1;
      } else {
         return this.bA;
      }
   }

   public void U() {
      if (this.dV().C) {
         this.eY();
      } else {
         this.dV().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.U();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C && this.af % 5 == 0) {
         this.V();
      }
   }

   protected void V() {
      boolean $$0 = !(this.cW() instanceof bxy);
      boolean $$1 = !(this.dk() instanceof cuk);
      this.bF.a(ces.a.a, $$0);
      this.bF.a(ces.a.c, $$0 && $$1);
      this.bF.a(ces.a.b, $$0);
   }

   @Override
   protected void C(float $$0) {
      this.bN.a();
   }

   @Nullable
   protected awq u() {
      return null;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fN());
      $$0.a("PersistenceRequired", this.bS);
      ali<va> $$1 = this.dX().a(uo.a);
      if (!this.bQ.equals(bwt.d)) {
         $$0.a("drop_chances", bwt.e, $$1, this.bQ);
      }

      this.a($$0, this.bW);
      $$0.a("LeftHanded", this.gk());
      this.bU.ifPresent($$1x -> $$0.a("DeathLootTable", fao.a, $$1x));
      if (this.bV != 0L) {
         $$0.a("DeathLootTableSeed", this.bV);
      }

      if (this.gj()) {
         $$0.a("NoAI", this.gj());
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a_($$0.b("CanPickUpLoot", false));
      this.bS = $$0.b("PersistenceRequired", false);
      ali<va> $$1 = this.dX().a(uo.a);
      this.bQ = $$0.<bwt>a("drop_chances", bwt.e, $$1).orElse(bwt.d);
      this.c($$0);
      this.u($$0.b("LeftHanded", false));
      this.bU = $$0.a("DeathLootTable", fao.a);
      this.bV = $$0.b("DeathLootTableSeed", 0L);
      this.t($$0.b("NoAI", false));
   }

   @Override
   protected void b(aru $$0, bvk $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bU = Optional.empty();
   }

   @Override
   public final Optional<alj<fao>> ea() {
      return this.bU.isPresent() ? this.bU : super.ea();
   }

   @Override
   public long eJ() {
      return this.bV;
   }

   public void G(float $$0) {
      this.bi = $$0;
   }

   public void H(float $$0) {
      this.bh = $$0;
   }

   public void I(float $$0) {
      this.bg = $$0;
   }

   @Override
   public void B(float $$0) {
      super.B($$0);
      this.G($$0);
   }

   public void W() {
      this.O().m();
      this.I(0.0F);
      this.H(0.0F);
      this.B(0.0F);
   }

   @Override
   public void k_() {
      super.k_();
      brd $$0 = brc.a();
      $$0.a("looting");
      if (this.dV() instanceof aru $$1 && this.fN() && this.bJ() && !this.bc && $$1.O().c(djv.d)) {
         kb $$2 = this.X();

         for (coe $$4 : this.dV().a(coe.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dQ() && !$$4.f().f() && !$$4.o() && this.c($$1, $$4.f())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected kb X() {
      return e;
   }

   protected void a(aru $$0, coe $$1) {
      daa $$2 = $$1.f();
      daa $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.aq();
         }
      }
   }

   public daa b(aru $$0, daa $$1) {
      bxf $$2 = this.f($$1);
      if (!this.a($$1, $$2)) {
         return daa.k;
      } else {
         daa $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bxf.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.g($$1)) {
            double $$5 = (double)this.bQ.b($$2);
            if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            daa $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return daa.k;
         }
      }
   }

   protected void b(bxf $$0, daa $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bS = true;
   }

   public void g(bxf $$0) {
      this.bQ = this.bQ.a($$0);
   }

   protected boolean a(daa $$0, daa $$1, bxf $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bxf.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(daa $$0, daa $$1, bxf $$2) {
      if (dgp.a($$1, dgo.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, bzc.a, $$2);
         double $$4 = this.a($$1, bzc.a, $$2);
         double $$5 = this.a($$0, bzc.b, $$2);
         double $$6 = this.a($$1, bzc.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(daa $$0, daa $$1, bxf $$2) {
      axv<czw> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, bzc.c, $$2);
      double $$5 = this.a($$1, bzc.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(daa $$0, jg<byx> $$1, bxf $$2) {
      double $$3 = this.fa().b($$1) ? this.i($$1) : 0.0;
      dcr $$4 = $$0.a(kl.o, dcr.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(daa $$0, daa $$1) {
      Set<Entry<jg<dgn>>> $$2 = $$1.a(kl.l, dgt.a).b();
      Set<Entry<jg<dgn>>> $$3 = $$0.a(kl.l, dgt.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kl.g) && !$$1.c(kl.g);
      }
   }

   public boolean g(daa $$0) {
      return true;
   }

   public boolean c(aru $$0, daa $$1) {
      return this.g($$1);
   }

   @Nullable
   public axv<czw> Y() {
      return null;
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Z() {
      return this.bY();
   }

   protected boolean aa() {
      return false;
   }

   @Override
   public void dH() {
      if (this.dV().an() == buq.a && this.aa()) {
         this.aq();
      } else if (!this.gd() && !this.Z()) {
         bwv $$0 = this.dV().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.an().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.aq();
            }

            int $$4 = this.an().f().g();
            int $$5 = $$4 * $$4;
            if (this.bd > 600 && this.ae.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.aq();
            } else if ($$1 < (double)$$5) {
               this.bd = 0;
            }
         }
      } else {
         this.bd = 0;
      }
   }

   @Override
   protected final void fu() {
      this.bd++;
      brd $$0 = brc.a();
      $$0.a("sensing");
      this.bP.a();
      $$0.c();
      int $$1 = this.af + this.ao();
      if ($$1 % 2 != 0 && this.af > 1) {
         $$0.a("targetSelector");
         this.bG.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bF.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bG.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bF.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bE.c();
      $$0.c();
      $$0.a("mob tick");
      this.a((aru)this.dV());
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bC.a();
      $$0.b("look");
      this.bB.a();
      $$0.b("jump");
      this.bD.b();
      $$0.c();
      $$0.c();
      this.ac();
   }

   protected void ac() {
      agq.a(this.dV(), this, this.bF);
   }

   protected void a(aru $$0) {
   }

   public int ad() {
      return 40;
   }

   public int af() {
      return 75;
   }

   protected void ag() {
      float $$0 = (float)this.af();
      float $$1 = this.cA();
      float $$2 = azq.h(this.aV - $$1);
      float $$3 = azq.a(azq.h(this.aV - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int ah() {
      return 10;
   }

   public void a(bwv $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof bxw $$5) {
         $$6 = $$5.dE() - this.dE();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dE();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azq.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azq.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.x(this.a(this.dN(), $$10, $$2));
      this.w(this.a(this.dL(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azq.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bxe<? extends bxy> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      iw $$5 = $$3.e();
      return bxd.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dka $$0, bxd $$1) {
      return true;
   }

   public boolean a(dkc $$0) {
      return !$$0.d(this.cR()) && $$0.f(this);
   }

   public int fX() {
      return 4;
   }

   public boolean q(int $$0) {
      return false;
   }

   @Override
   public int cE() {
      if (this.f() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eG() - this.eU() * 0.33F);
         $$0 -= (3 - this.dV().an().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   public daa fY() {
      return this.a(bxf.g);
   }

   public boolean fZ() {
      return this.d(bxf.h);
   }

   public boolean ga() {
      return this.d(bxf.g);
   }

   public void h(daa $$0) {
      this.b(bxf.g, $$0);
   }

   public bum h(final bxf $$0) {
      return new fhe() {
         @Override
         public daa f() {
            return bxy.this.a($$0);
         }

         @Override
         public void b(daa $$0x) {
            bxy.this.a($$0, $$0);
            if (!$$0.f()) {
               bxy.this.g($$0);
               bxy.this.gc();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(crz $$0x) {
            return $$0.dk() == bxy.this || $$0.b(bxy.this, 4.0);
         }
      };
   }

   @Override
   protected void a(aru $$0, bvk $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bxf $$3 : bxf.j) {
         daa $$4 = this.a($$3);
         float $$5 = this.bQ.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bQ.c($$3);
            bwv var11 = $$1.d();
            if (var11 instanceof bxw) {
               bxw $$7 = (bxw)var11;
               if (this.dV() instanceof aru $$8) {
                  $$5 = dgp.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dgp.a($$4, dgo.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, daa.k);
            }
         }
      }
   }

   public bwt gb() {
      return this.bQ;
   }

   public void b(aru $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bxf> a(aru $$0, Predicate<daa> $$1) {
      Set<bxf> $$2 = new HashSet<>();

      for (bxf $$3 : bxf.j) {
         daa $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bQ.c($$3)) {
               this.a($$3, daa.k);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private fam g(aru $$0) {
      return new fam.a($$0).a(fdd.f, this.dt()).a(fdd.a, this).a(fdc.h);
   }

   public void a(bxh $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alj<fao> $$0, Map<bxf, Float> $$1) {
      if (this.dV() instanceof aru $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azz $$0, bur $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().an() == buq.d ? 0.1F : 0.25F;
         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         boolean $$4 = true;

         for (bxf $$5 : bH) {
            daa $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               czw $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new daa($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static czw a(bxf $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return dae.qm;
            } else if ($$1 == 1) {
               return dae.qC;
            } else if ($$1 == 2) {
               return dae.qq;
            } else if ($$1 == 3) {
               return dae.qu;
            } else if ($$1 == 4) {
               return dae.qy;
            }
         case e:
            if ($$1 == 0) {
               return dae.qn;
            } else if ($$1 == 1) {
               return dae.qD;
            } else if ($$1 == 2) {
               return dae.qr;
            } else if ($$1 == 3) {
               return dae.qv;
            } else if ($$1 == 4) {
               return dae.qz;
            }
         case d:
            if ($$1 == 0) {
               return dae.qo;
            } else if ($$1 == 1) {
               return dae.qE;
            } else if ($$1 == 2) {
               return dae.qs;
            } else if ($$1 == 3) {
               return dae.qw;
            } else if ($$1 == 4) {
               return dae.qA;
            }
         case c:
            if ($$1 == 0) {
               return dae.qp;
            } else if ($$1 == 1) {
               return dae.qF;
            } else if ($$1 == 2) {
               return dae.qt;
            } else if ($$1 == 3) {
               return dae.qx;
            } else if ($$1 == 4) {
               return dae.qB;
            }
         default:
            return null;
      }
   }

   protected void a(dkq $$0, azz $$1, bur $$2) {
      this.b($$0, $$1, $$2);

      for (bxf $$3 : bxf.j) {
         if ($$3.a() == bxf.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dkq $$0, azz $$1, bur $$2) {
      this.a($$0, bxf.a, $$1, 0.25F, $$2);
   }

   protected void a(dkq $$0, azz $$1, bxf $$2, bur $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dkq $$0, bxf $$1, azz $$2, float $$3, bur $$4) {
      daa $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dgp.a($$5, $$0.J_(), dib.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      byy $$5 = Objects.requireNonNull(this.g(bzc.m));
      if (!$$5.b(by)) {
         $$5.d(new bza(by, $$4.a(0.0, 0.11485000000000001), bza.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void gc() {
      this.bS = true;
   }

   @Override
   public void a(bxf $$0, float $$1) {
      this.bQ = this.bQ.a($$0, $$1);
   }

   @Override
   public boolean fN() {
      return this.bR;
   }

   public void a_(boolean $$0) {
      this.bR = $$0;
   }

   @Override
   protected boolean f(bxf $$0) {
      return this.fN();
   }

   public boolean gd() {
      return this.bS;
   }

   @Override
   public final but a(crz $$0, bus $$1) {
      if (!this.bJ()) {
         return but.e;
      } else {
         but $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(egg.r, $$0);
            return $$2;
         } else {
            but $$3 = super.a($$0, $$1);
            if ($$3 != but.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(egg.r, $$0);
                  return $$2;
               } else {
                  return but.e;
               }
            }
         }
      }
   }

   private but c(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.vW)) {
         but $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof dbh) {
         if (this.dV() instanceof aru) {
            dbh $$4 = (dbh)$$2.h();
            Optional<bxy> $$5 = $$4.a($$0, this, (bxe<? extends bxy>)this.an(), (aru)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return but.e;
            }
         }

         return but.b;
      } else {
         return but.e;
      }
   }

   protected void a(crz $$0, bxy $$1) {
   }

   protected but b(crz $$0, bus $$1) {
      return but.e;
   }

   public boolean ge() {
      return this.a(this.dv());
   }

   public boolean a(iw $$0) {
      return this.bY == -1.0F ? true : this.bX.j($$0) < (double)(this.bY * this.bY);
   }

   public void a(iw $$0, int $$1) {
      this.bX = $$0;
      this.bY = (float)$$1;
   }

   public iw gf() {
      return this.bX;
   }

   public float gg() {
      return this.bY;
   }

   public void gh() {
      this.bY = -1.0F;
   }

   public boolean gi() {
      return this.bY != -1.0F;
   }

   @Nullable
   public <T extends bxy> T a(bxe<T> $$0, bwp $$1, bxd $$2, bwp.a<T> $$3) {
      if (this.dQ()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dV(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dV() instanceof aru $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.aq();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bxy> T a(bxe<T> $$0, bwp $$1, bwp.a<T> $$2) {
      return this.a($$0, $$1, bxd.i, $$2);
   }

   @Nullable
   @Override
   public bxu.a Y_() {
      return this.bW;
   }

   @Override
   public void a(@Nullable bxu.a $$0) {
      this.bW = $$0;
   }

   @Override
   public void A() {
      if (this.Y_() == null) {
         this.gh();
      }
   }

   @Override
   public void B() {
      bxu.super.B();
      this.bF.a(ces.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cot);
   }

   @Override
   public boolean a(bwv $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.S_()) {
         this.y();
      }

      return $$2;
   }

   @Override
   public boolean di() {
      return super.di() && !this.gj();
   }

   @Override
   public boolean dj() {
      return super.dj() && !this.gj();
   }

   public void t(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gj() {
      return (this.al.a(a) & 1) != 0;
   }

   public boolean gk() {
      return (this.al.a(a) & 2) != 0;
   }

   public boolean gl() {
      return (this.al.a(a) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bxn fy() {
      return this.gk() ? bxn.a : bxn.b;
   }

   public boolean h(bxw $$0) {
      return this.gm().c($$0.eN());
   }

   protected ffn gm() {
      bwv $$0 = this.dk();
      ffn $$3;
      if ($$0 != null) {
         ffn $$1 = $$0.cR();
         ffn $$2 = this.cR();
         $$3 = new ffn(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bI, 0.0, bI);
   }

   @Override
   public boolean c(aru $$0, bwv $$1) {
      float $$2 = (float)this.h(bzc.c);
      daa $$3 = this.dZ();
      bvk $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((bxw)this));
      $$2 = dgp.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bxw $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azq.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azq.b(this.dL() * (float) (Math.PI / 180.0))));
            this.i(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bxw $$8) {
            $$3.a($$8, this);
         }

         dgp.a($$0, $$1, $$4);
         this.B($$1);
         this.gn();
      }

      return $$5;
   }

   protected void gn() {
   }

   protected boolean go() {
      if (this.dV().V() && !this.dV().C) {
         float $$0 = this.bw();
         iw $$1 = iw.a(this.dA(), this.dE(), this.dG());
         boolean $$2 = this.bk() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dV().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axv<exp> $$0) {
      if (this.O().o()) {
         super.c($$0);
      } else {
         this.i(this.dy().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gp() {
      this.c($$0 -> true);
      this.ec().h();
   }

   public void c(Predicate<ces> $$0) {
      this.bF.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();

      for (bxf $$0 : bxf.j) {
         daa $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public daa dI() {
      dbh $$0 = dbh.a(this.an());
      return $$0 == null ? null : new daa($$0);
   }

   @Override
   protected void f(jg<byx> $$0) {
      super.f($$0);
      if ($$0.a(bzc.m) || $$0.a(bzc.E)) {
         this.O().e();
      }
   }
}
