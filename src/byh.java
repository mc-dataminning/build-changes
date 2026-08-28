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

public abstract class byh extends byf implements bxr, byd, bzc {
   private static final aku<Byte> a = aky.a(byh.class, akw.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int j = 1;
   private static final kb e = new kb(1, 0, 1);
   private static final List<bxo> bH = List.of(bxo.f, bxo.e, bxo.d, bxo.c);
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
   protected static final alr by = alr.b("random_spawn_bonus");
   public int bz;
   protected int bA;
   protected ced bB;
   protected cee bC;
   protected cec bD;
   private final cdz bN;
   protected chp bE;
   protected final cfc bF;
   protected final cfc bG;
   @Nullable
   private byf bO;
   private final cim bP;
   private bxc bQ = bxc.d;
   private boolean bR = false;
   private boolean bS = false;
   private final Map<eyr, Float> bT = Maps.newEnumMap(eyr.class);
   private Optional<alq<fay>> bU = Optional.empty();
   private long bV;
   @Nullable
   private byd.a bW;
   private iw bX = iw.c;
   private float bY = -1.0F;

   protected byh(bxn<? extends byh> $$0, dkj $$1) {
      super($$0, $$1);
      this.bF = new cfc();
      this.bG = new cfc();
      this.bB = new ced(this);
      this.bC = new cee(this);
      this.bD = new cec(this);
      this.bN = this.I();
      this.bE = this.b($$1);
      this.bP = new cim(this);
      if ($$1 instanceof asb) {
         this.D();
      }
   }

   protected void D() {
   }

   public static bzk.a E() {
      return byf.ee().a(bzl.m, 16.0);
   }

   protected chp b(dkj $$0) {
      return new cho(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(eyr $$0) {
      byh $$2;
      label17: {
         if (this.dl() instanceof byh $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bT.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eyr $$0, float $$1) {
      this.bT.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   public void H() {
   }

   protected cdz I() {
      return new cdz(this);
   }

   public ced J() {
      return this.bB;
   }

   public cee L() {
      return this.dl() instanceof byh $$0 ? $$0.L() : this.bC;
   }

   public cec N() {
      return this.bD;
   }

   public chp O() {
      return this.dl() instanceof byh $$0 ? $$0.O() : this.bE;
   }

   @Nullable
   @Override
   public byf cW() {
      bxe $$0 = this.cZ();
      if (!this.gj() && $$0 instanceof byh $$1 && $$0.cb()) {
         return $$1;
      }

      return null;
   }

   public cim P() {
      return this.bP;
   }

   @Nullable
   @Override
   public byf f() {
      return this.bO;
   }

   @Nullable
   protected final byf Q() {
      return this.ec().c(chh.p).orElse(null);
   }

   public void g(@Nullable byf $$0) {
      this.bO = $$0;
   }

   @Override
   public boolean a(bxn<?> $$0) {
      return $$0 != bxn.ae;
   }

   public boolean a(dbf $$0) {
      return false;
   }

   public void R() {
      this.a(egq.m);
   }

   @Override
   protected void a(aky.a $$0) {
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
      brm $$0 = brl.a();
      $$0.a("mobBaseTick");
      if (this.bJ() && this.ae.a(1000) < this.bz++) {
         this.j();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(bvt $$0) {
      this.j();
      super.h($$0);
   }

   private void j() {
      this.bz = -this.S();
   }

   @Override
   protected int e(asb $$0) {
      if (this.bA > 0) {
         int $$1 = this.bA;

         for (bxo $$2 : bxo.j) {
            if ($$2.g()) {
               dak $$3 = this.a($$2);
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
      boolean $$0 = !(this.cW() instanceof byh);
      boolean $$1 = !(this.dk() instanceof cut);
      this.bF.a(cfb.a.a, $$0);
      this.bF.a(cfb.a.c, $$0 && $$1);
      this.bF.a(cfb.a.b, $$0);
   }

   @Override
   protected void C(float $$0) {
      this.bN.a();
   }

   @Nullable
   protected awx u() {
      return null;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fN());
      $$0.a("PersistenceRequired", this.bS);
      alp<va> $$1 = this.dX().a(uo.a);
      if (!this.bQ.equals(bxc.d)) {
         $$0.a("drop_chances", bxc.e, $$1, this.bQ);
      }

      this.a($$0, this.bW);
      $$0.a("LeftHanded", this.gk());
      this.bU.ifPresent($$1x -> $$0.a("DeathLootTable", fay.a, $$1x));
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
      alp<va> $$1 = this.dX().a(uo.a);
      this.bQ = $$0.<bxc>a("drop_chances", bxc.e, $$1).orElse(bxc.d);
      this.c($$0);
      this.u($$0.b("LeftHanded", false));
      this.bU = $$0.a("DeathLootTable", fay.a);
      this.bV = $$0.b("DeathLootTableSeed", 0L);
      this.t($$0.b("NoAI", false));
   }

   @Override
   protected void b(asb $$0, bvt $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bU = Optional.empty();
   }

   @Override
   public final Optional<alq<fay>> ea() {
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
      brm $$0 = brl.a();
      $$0.a("looting");
      if (this.dV() instanceof asb $$1 && this.fN() && this.bJ() && !this.bc && $$1.O().c(dkf.d)) {
         kb $$2 = this.X();

         for (coo $$4 : this.dV().a(coo.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
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

   protected void a(asb $$0, coo $$1) {
      dak $$2 = $$1.f();
      dak $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.aq();
         }
      }
   }

   public dak b(asb $$0, dak $$1) {
      bxo $$2 = this.f($$1);
      if (!this.a($$1, $$2)) {
         return dak.l;
      } else {
         dak $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bxo.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.g($$1)) {
            double $$5 = (double)this.bQ.b($$2);
            if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            dak $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return dak.l;
         }
      }
   }

   protected void b(bxo $$0, dak $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bS = true;
   }

   public void g(bxo $$0) {
      this.bQ = this.bQ.a($$0);
   }

   protected boolean a(dak $$0, dak $$1, bxo $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bxo.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(dak $$0, dak $$1, bxo $$2) {
      if (dgz.a($$1, dgy.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, bzl.a, $$2);
         double $$4 = this.a($$1, bzl.a, $$2);
         double $$5 = this.a($$0, bzl.b, $$2);
         double $$6 = this.a($$1, bzl.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(dak $$0, dak $$1, bxo $$2) {
      ayc<dag> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, bzl.c, $$2);
      double $$5 = this.a($$1, bzl.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(dak $$0, jg<bzg> $$1, bxo $$2) {
      double $$3 = this.fa().b($$1) ? this.i($$1) : 0.0;
      ddb $$4 = $$0.a(kl.o, ddb.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(dak $$0, dak $$1) {
      Set<Entry<jg<dgx>>> $$2 = $$1.a(kl.l, dhd.a).b();
      Set<Entry<jg<dgx>>> $$3 = $$0.a(kl.l, dhd.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kl.g) && !$$1.c(kl.g);
      }
   }

   public boolean g(dak $$0) {
      return true;
   }

   public boolean c(asb $$0, dak $$1) {
      return this.g($$1);
   }

   @Nullable
   public ayc<dag> Y() {
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
      if (this.dV().an() == buz.a && this.aa()) {
         this.aq();
      } else if (!this.gd() && !this.Z()) {
         bxe $$0 = this.dV().a(this, -1.0);
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
      brm $$0 = brl.a();
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
      this.a((asb)this.dV());
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
      agx.a(this.dV(), this, this.bF);
   }

   protected void a(asb $$0) {
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
      float $$2 = azz.h(this.aV - $$1);
      float $$3 = azz.a(azz.h(this.aV - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int ah() {
      return 10;
   }

   public void a(bxe $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof byf $$5) {
         $$6 = $$5.dE() - this.dE();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dE();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azz.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azz.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.x(this.a(this.dN(), $$10, $$2));
      this.w(this.a(this.dL(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azz.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bxn<? extends byh> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      iw $$5 = $$3.e();
      return bxm.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dkk $$0, bxm $$1) {
      return true;
   }

   public boolean a(dkm $$0) {
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

   public dak fY() {
      return this.a(bxo.g);
   }

   public boolean fZ() {
      return this.d(bxo.h);
   }

   public boolean ga() {
      return this.d(bxo.g);
   }

   public void h(dak $$0) {
      this.b(bxo.g, $$0);
   }

   public buv h(final bxo $$0) {
      return new fho() {
         @Override
         public dak f() {
            return byh.this.a($$0);
         }

         @Override
         public void b(dak $$0x) {
            byh.this.a($$0, $$0);
            if (!$$0.f()) {
               byh.this.g($$0);
               byh.this.gc();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(csi $$0x) {
            return $$0.dk() == byh.this || $$0.b(byh.this, 4.0);
         }
      };
   }

   @Override
   protected void a(asb $$0, bvt $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bxo $$3 : bxo.j) {
         dak $$4 = this.a($$3);
         float $$5 = this.bQ.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bQ.c($$3);
            bxe var11 = $$1.d();
            if (var11 instanceof byf) {
               byf $$7 = (byf)var11;
               if (this.dV() instanceof asb $$8) {
                  $$5 = dgz.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dgz.a($$4, dgy.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, dak.l);
            }
         }
      }
   }

   public bxc gb() {
      return this.bQ;
   }

   public void b(asb $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bxo> a(asb $$0, Predicate<dak> $$1) {
      Set<bxo> $$2 = new HashSet<>();

      for (bxo $$3 : bxo.j) {
         dak $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bQ.c($$3)) {
               this.a($$3, dak.l);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private faw g(asb $$0) {
      return new faw.a($$0).a(fdn.f, this.dt()).a(fdn.a, this).a(fdm.h);
   }

   public void a(bxq $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alq<fay> $$0, Map<bxo, Float> $$1) {
      if (this.dV() instanceof asb $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(bai $$0, bva $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().an() == buz.d ? 0.1F : 0.25F;
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

         for (bxo $$5 : bH) {
            dak $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               dag $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new dak($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static dag a(bxo $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return dao.qm;
            } else if ($$1 == 1) {
               return dao.qC;
            } else if ($$1 == 2) {
               return dao.qq;
            } else if ($$1 == 3) {
               return dao.qu;
            } else if ($$1 == 4) {
               return dao.qy;
            }
         case e:
            if ($$1 == 0) {
               return dao.qn;
            } else if ($$1 == 1) {
               return dao.qD;
            } else if ($$1 == 2) {
               return dao.qr;
            } else if ($$1 == 3) {
               return dao.qv;
            } else if ($$1 == 4) {
               return dao.qz;
            }
         case d:
            if ($$1 == 0) {
               return dao.qo;
            } else if ($$1 == 1) {
               return dao.qE;
            } else if ($$1 == 2) {
               return dao.qs;
            } else if ($$1 == 3) {
               return dao.qw;
            } else if ($$1 == 4) {
               return dao.qA;
            }
         case c:
            if ($$1 == 0) {
               return dao.qp;
            } else if ($$1 == 1) {
               return dao.qF;
            } else if ($$1 == 2) {
               return dao.qt;
            } else if ($$1 == 3) {
               return dao.qx;
            } else if ($$1 == 4) {
               return dao.qB;
            }
         default:
            return null;
      }
   }

   protected void a(dla $$0, bai $$1, bva $$2) {
      this.b($$0, $$1, $$2);

      for (bxo $$3 : bxo.j) {
         if ($$3.a() == bxo.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dla $$0, bai $$1, bva $$2) {
      this.a($$0, bxo.a, $$1, 0.25F, $$2);
   }

   protected void a(dla $$0, bai $$1, bxo $$2, bva $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dla $$0, bxo $$1, bai $$2, float $$3, bva $$4) {
      dak $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dgz.a($$5, $$0.J_(), dil.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      bzh $$5 = Objects.requireNonNull(this.g(bzl.m));
      if (!$$5.b(by)) {
         $$5.d(new bzj(by, $$4.a(0.0, 0.11485000000000001), bzj.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void gc() {
      this.bS = true;
   }

   @Override
   public void a(bxo $$0, float $$1) {
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
   protected boolean f(bxo $$0) {
      return this.fN();
   }

   public boolean gd() {
      return this.bS;
   }

   @Override
   public final bvc a(csi $$0, bvb $$1) {
      if (!this.bJ()) {
         return bvc.e;
      } else {
         bvc $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(egq.r, $$0);
            return $$2;
         } else {
            bvc $$3 = super.a($$0, $$1);
            if ($$3 != bvc.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(egq.r, $$0);
                  return $$2;
               } else {
                  return bvc.e;
               }
            }
         }
      }
   }

   private bvc c(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.vW)) {
         bvc $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof dbr) {
         if (this.dV() instanceof asb) {
            dbr $$4 = (dbr)$$2.h();
            Optional<byh> $$5 = $$4.a($$0, this, (bxn<? extends byh>)this.an(), (asb)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bvc.e;
            }
         }

         return bvc.b;
      } else {
         return bvc.e;
      }
   }

   protected void a(csi $$0, byh $$1) {
   }

   protected bvc b(csi $$0, bvb $$1) {
      return bvc.e;
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
   public <T extends byh> T a(bxn<T> $$0, bwy $$1, bxm $$2, bwy.a<T> $$3) {
      if (this.dQ()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dV(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dV() instanceof asb $$5) {
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
   public <T extends byh> T a(bxn<T> $$0, bwy $$1, bwy.a<T> $$2) {
      return this.a($$0, $$1, bxm.i, $$2);
   }

   @Nullable
   @Override
   public byd.a Z_() {
      return this.bW;
   }

   @Override
   public void a(@Nullable byd.a $$0) {
      this.bW = $$0;
   }

   @Override
   public void A() {
      if (this.Z_() == null) {
         this.gh();
      }
   }

   @Override
   public void B() {
      byd.super.B();
      this.bF.a(cfb.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cpc);
   }

   @Override
   public boolean a(bxe $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.T_()) {
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
   public bxw fy() {
      return this.gk() ? bxw.a : bxw.b;
   }

   public boolean h(byf $$0) {
      return this.gm().c($$0.eN());
   }

   protected ffx gm() {
      bxe $$0 = this.dk();
      ffx $$3;
      if ($$0 != null) {
         ffx $$1 = $$0.cR();
         ffx $$2 = this.cR();
         $$3 = new ffx(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bI, 0.0, bI);
   }

   @Override
   public boolean c(asb $$0, bxe $$1) {
      float $$2 = (float)this.h(bzl.c);
      dak $$3 = this.dZ();
      bvt $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((byf)this));
      $$2 = dgz.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof byf $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azz.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azz.b(this.dL() * (float) (Math.PI / 180.0))));
            this.i(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof byf $$8) {
            $$3.a($$8, this);
         }

         dgz.a($$0, $$1, $$4);
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
   protected void c(ayc<exz> $$0) {
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

   public void c(Predicate<cfb> $$0) {
      this.bF.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();

      for (bxo $$0 : bxo.j) {
         dak $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public dak dI() {
      dbr $$0 = dbr.a(this.an());
      return $$0 == null ? null : new dak($$0);
   }

   @Override
   protected void f(jg<bzg> $$0) {
      super.f($$0);
      if ($$0.a(bzl.m) || $$0.a(bzl.E)) {
         this.O().e();
      }
   }
}
