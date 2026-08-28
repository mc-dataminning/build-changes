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

public abstract class bxw extends bxu implements bxg, bxs, byr {
   private static final akl<Byte> a = akp.a(bxw.class, akn.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int j = 1;
   private static final ka e = new ka(1, 0, 1);
   private static final List<bxd> bH = List.of(bxd.f, bxd.e, bxd.d, bxd.c);
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
   protected static final ali by = ali.b("random_spawn_bonus");
   public int bz;
   protected int bA;
   protected cds bB;
   protected cdt bC;
   protected cdr bD;
   private final cdo bN;
   protected che bE;
   protected final cer bF;
   protected final cer bG;
   @Nullable
   private bxu bO;
   private final cib bP;
   private bwr bQ = bwr.d;
   private boolean bR = false;
   private boolean bS = false;
   private final Map<eyf, Float> bT = Maps.newEnumMap(eyf.class);
   private Optional<alh<fam>> bU = Optional.empty();
   private long bV;
   @Nullable
   private bxs.a bW;
   private iv bX = iv.c;
   private float bY = -1.0F;

   protected bxw(bxc<? extends bxw> $$0, djx $$1) {
      super($$0, $$1);
      this.bF = new cer();
      this.bG = new cer();
      this.bB = new cds(this);
      this.bC = new cdt(this);
      this.bD = new cdr(this);
      this.bN = this.I();
      this.bE = this.b($$1);
      this.bP = new cib(this);
      if ($$1 instanceof ars) {
         this.D();
      }
   }

   protected void D() {
   }

   public static byz.a E() {
      return bxu.ee().a(bza.m, 16.0);
   }

   protected che b(djx $$0) {
      return new chd(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(eyf $$0) {
      bxw $$2;
      label17: {
         if (this.dl() instanceof bxw $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bT.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(eyf $$0, float $$1) {
      this.bT.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   public void H() {
   }

   protected cdo I() {
      return new cdo(this);
   }

   public cds J() {
      return this.bB;
   }

   public cdt L() {
      return this.dl() instanceof bxw $$0 ? $$0.L() : this.bC;
   }

   public cdr N() {
      return this.bD;
   }

   public che O() {
      return this.dl() instanceof bxw $$0 ? $$0.O() : this.bE;
   }

   @Nullable
   @Override
   public bxu cW() {
      bwt $$0 = this.cZ();
      if (!this.gj() && $$0 instanceof bxw $$1 && $$0.cb()) {
         return $$1;
      }

      return null;
   }

   public cib P() {
      return this.bP;
   }

   @Nullable
   @Override
   public bxu f() {
      return this.bO;
   }

   @Nullable
   protected final bxu Q() {
      return this.ec().c(cgw.p).orElse(null);
   }

   public void g(@Nullable bxu $$0) {
      this.bO = $$0;
   }

   @Override
   public boolean a(bxc<?> $$0) {
      return $$0 != bxc.ae;
   }

   public boolean a(dat $$0) {
      return false;
   }

   public void R() {
      this.a(ege.m);
   }

   @Override
   protected void a(akp.a $$0) {
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
      brb $$0 = bra.a();
      $$0.a("mobBaseTick");
      if (this.bJ() && this.ae.a(1000) < this.bz++) {
         this.j();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(bvi $$0) {
      this.j();
      super.h($$0);
   }

   private void j() {
      this.bz = -this.S();
   }

   @Override
   protected int e(ars $$0) {
      if (this.bA > 0) {
         int $$1 = this.bA;

         for (bxd $$2 : bxd.j) {
            if ($$2.g()) {
               czy $$3 = this.a($$2);
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
      boolean $$0 = !(this.cW() instanceof bxw);
      boolean $$1 = !(this.dk() instanceof cui);
      this.bF.a(ceq.a.a, $$0);
      this.bF.a(ceq.a.c, $$0 && $$1);
      this.bF.a(ceq.a.b, $$0);
   }

   @Override
   protected void C(float $$0) {
      this.bN.a();
   }

   @Nullable
   protected awo u() {
      return null;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fN());
      $$0.a("PersistenceRequired", this.bS);
      alg<uy> $$1 = this.dX().a(un.a);
      if (!this.bQ.equals(bwr.d)) {
         $$0.a("drop_chances", bwr.e, $$1, this.bQ);
      }

      this.a($$0, this.bW);
      $$0.a("LeftHanded", this.gk());
      this.bU.ifPresent($$1x -> $$0.a("DeathLootTable", fam.a, $$1x));
      if (this.bV != 0L) {
         $$0.a("DeathLootTableSeed", this.bV);
      }

      if (this.gj()) {
         $$0.a("NoAI", this.gj());
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a_($$0.b("CanPickUpLoot", false));
      this.bS = $$0.b("PersistenceRequired", false);
      alg<uy> $$1 = this.dX().a(un.a);
      this.bQ = $$0.<bwr>a("drop_chances", bwr.e, $$1).orElse(bwr.d);
      this.c($$0);
      this.u($$0.b("LeftHanded", false));
      this.bU = $$0.a("DeathLootTable", fam.a);
      this.bV = $$0.b("DeathLootTableSeed", 0L);
      this.t($$0.b("NoAI", false));
   }

   @Override
   protected void b(ars $$0, bvi $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bU = Optional.empty();
   }

   @Override
   public final Optional<alh<fam>> ea() {
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
      brb $$0 = bra.a();
      $$0.a("looting");
      if (this.dV() instanceof ars $$1 && this.fN() && this.bJ() && !this.bc && $$1.O().c(djt.d)) {
         ka $$2 = this.X();

         for (coc $$4 : this.dV().a(coc.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dQ() && !$$4.f().f() && !$$4.o() && this.c($$1, $$4.f())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected ka X() {
      return e;
   }

   protected void a(ars $$0, coc $$1) {
      czy $$2 = $$1.f();
      czy $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.aq();
         }
      }
   }

   public czy b(ars $$0, czy $$1) {
      bxd $$2 = this.f($$1);
      if (!this.a($$1, $$2)) {
         return czy.k;
      } else {
         czy $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bxd.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.g($$1)) {
            double $$5 = (double)this.bQ.b($$2);
            if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            czy $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return czy.k;
         }
      }
   }

   protected void b(bxd $$0, czy $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bS = true;
   }

   public void g(bxd $$0) {
      this.bQ = this.bQ.a($$0);
   }

   protected boolean a(czy $$0, czy $$1, bxd $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bxd.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(czy $$0, czy $$1, bxd $$2) {
      if (dgn.a($$1, dgm.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, bza.a, $$2);
         double $$4 = this.a($$1, bza.a, $$2);
         double $$5 = this.a($$0, bza.b, $$2);
         double $$6 = this.a($$1, bza.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(czy $$0, czy $$1, bxd $$2) {
      axt<czu> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, bza.c, $$2);
      double $$5 = this.a($$1, bza.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(czy $$0, jf<byv> $$1, bxd $$2) {
      double $$3 = this.fa().b($$1) ? this.i($$1) : 0.0;
      dcp $$4 = $$0.a(kk.o, dcp.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(czy $$0, czy $$1) {
      Set<Entry<jf<dgl>>> $$2 = $$1.a(kk.l, dgr.a).b();
      Set<Entry<jf<dgl>>> $$3 = $$0.a(kk.l, dgr.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kk.g) && !$$1.c(kk.g);
      }
   }

   public boolean g(czy $$0) {
      return true;
   }

   public boolean c(ars $$0, czy $$1) {
      return this.g($$1);
   }

   @Nullable
   public axt<czu> Y() {
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
      if (this.dV().an() == buo.a && this.aa()) {
         this.aq();
      } else if (!this.gd() && !this.Z()) {
         bwt $$0 = this.dV().a(this, -1.0);
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
      brb $$0 = bra.a();
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
      this.a((ars)this.dV());
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
      ago.a(this.dV(), this, this.bF);
   }

   protected void a(ars $$0) {
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
      float $$2 = azo.h(this.aV - $$1);
      float $$3 = azo.a(azo.h(this.aV - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int ah() {
      return 10;
   }

   public void a(bwt $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof bxu $$5) {
         $$6 = $$5.dE() - this.dE();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dE();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azo.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azo.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.x(this.a(this.dN(), $$10, $$2));
      this.w(this.a(this.dL(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azo.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bxc<? extends bxw> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      iv $$5 = $$3.e();
      return bxb.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(djy $$0, bxb $$1) {
      return true;
   }

   public boolean a(dka $$0) {
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

   public czy fY() {
      return this.a(bxd.g);
   }

   public boolean fZ() {
      return this.d(bxd.h);
   }

   public boolean ga() {
      return this.d(bxd.g);
   }

   public void h(czy $$0) {
      this.b(bxd.g, $$0);
   }

   public buk h(final bxd $$0) {
      return new fhc() {
         @Override
         public czy f() {
            return bxw.this.a($$0);
         }

         @Override
         public void b(czy $$0x) {
            bxw.this.a($$0, $$0);
            if (!$$0.f()) {
               bxw.this.g($$0);
               bxw.this.gc();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(crx $$0x) {
            return $$0.dk() == bxw.this || $$0.b(bxw.this, 4.0);
         }
      };
   }

   @Override
   protected void a(ars $$0, bvi $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bxd $$3 : bxd.j) {
         czy $$4 = this.a($$3);
         float $$5 = this.bQ.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bQ.c($$3);
            bwt var11 = $$1.d();
            if (var11 instanceof bxu) {
               bxu $$7 = (bxu)var11;
               if (this.dV() instanceof ars $$8) {
                  $$5 = dgn.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dgn.a($$4, dgm.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, czy.k);
            }
         }
      }
   }

   public bwr gb() {
      return this.bQ;
   }

   public void b(ars $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bxd> a(ars $$0, Predicate<czy> $$1) {
      Set<bxd> $$2 = new HashSet<>();

      for (bxd $$3 : bxd.j) {
         czy $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bQ.c($$3)) {
               this.a($$3, czy.k);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private fak g(ars $$0) {
      return new fak.a($$0).a(fdb.f, this.dt()).a(fdb.a, this).a(fda.h);
   }

   public void a(bxf $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alh<fam> $$0, Map<bxd, Float> $$1) {
      if (this.dV() instanceof ars $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azx $$0, bup $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().an() == buo.d ? 0.1F : 0.25F;
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

         for (bxd $$5 : bH) {
            czy $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               czu $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new czy($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static czu a(bxd $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return dac.qm;
            } else if ($$1 == 1) {
               return dac.qC;
            } else if ($$1 == 2) {
               return dac.qq;
            } else if ($$1 == 3) {
               return dac.qu;
            } else if ($$1 == 4) {
               return dac.qy;
            }
         case e:
            if ($$1 == 0) {
               return dac.qn;
            } else if ($$1 == 1) {
               return dac.qD;
            } else if ($$1 == 2) {
               return dac.qr;
            } else if ($$1 == 3) {
               return dac.qv;
            } else if ($$1 == 4) {
               return dac.qz;
            }
         case d:
            if ($$1 == 0) {
               return dac.qo;
            } else if ($$1 == 1) {
               return dac.qE;
            } else if ($$1 == 2) {
               return dac.qs;
            } else if ($$1 == 3) {
               return dac.qw;
            } else if ($$1 == 4) {
               return dac.qA;
            }
         case c:
            if ($$1 == 0) {
               return dac.qp;
            } else if ($$1 == 1) {
               return dac.qF;
            } else if ($$1 == 2) {
               return dac.qt;
            } else if ($$1 == 3) {
               return dac.qx;
            } else if ($$1 == 4) {
               return dac.qB;
            }
         default:
            return null;
      }
   }

   protected void a(dko $$0, azx $$1, bup $$2) {
      this.b($$0, $$1, $$2);

      for (bxd $$3 : bxd.j) {
         if ($$3.a() == bxd.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dko $$0, azx $$1, bup $$2) {
      this.a($$0, bxd.a, $$1, 0.25F, $$2);
   }

   protected void a(dko $$0, azx $$1, bxd $$2, bup $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dko $$0, bxd $$1, azx $$2, float $$3, bup $$4) {
      czy $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dgn.a($$5, $$0.J_(), dhz.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      byw $$5 = Objects.requireNonNull(this.g(bza.m));
      if (!$$5.b(by)) {
         $$5.d(new byy(by, $$4.a(0.0, 0.11485000000000001), byy.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void gc() {
      this.bS = true;
   }

   @Override
   public void a(bxd $$0, float $$1) {
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
   protected boolean f(bxd $$0) {
      return this.fN();
   }

   public boolean gd() {
      return this.bS;
   }

   @Override
   public final bur a(crx $$0, buq $$1) {
      if (!this.bJ()) {
         return bur.e;
      } else {
         bur $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(ege.r, $$0);
            return $$2;
         } else {
            bur $$3 = super.a($$0, $$1);
            if ($$3 != bur.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(ege.r, $$0);
                  return $$2;
               } else {
                  return bur.e;
               }
            }
         }
      }
   }

   private bur c(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.vW)) {
         bur $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof dbf) {
         if (this.dV() instanceof ars) {
            dbf $$4 = (dbf)$$2.h();
            Optional<bxw> $$5 = $$4.a($$0, this, (bxc<? extends bxw>)this.an(), (ars)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bur.e;
            }
         }

         return bur.b;
      } else {
         return bur.e;
      }
   }

   protected void a(crx $$0, bxw $$1) {
   }

   protected bur b(crx $$0, buq $$1) {
      return bur.e;
   }

   public boolean ge() {
      return this.a(this.dv());
   }

   public boolean a(iv $$0) {
      return this.bY == -1.0F ? true : this.bX.j($$0) < (double)(this.bY * this.bY);
   }

   public void a(iv $$0, int $$1) {
      this.bX = $$0;
      this.bY = (float)$$1;
   }

   public iv gf() {
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
   public <T extends bxw> T a(bxc<T> $$0, bwn $$1, bxb $$2, bwn.a<T> $$3) {
      if (this.dQ()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dV(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dV() instanceof ars $$5) {
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
   public <T extends bxw> T a(bxc<T> $$0, bwn $$1, bwn.a<T> $$2) {
      return this.a($$0, $$1, bxb.i, $$2);
   }

   @Nullable
   @Override
   public bxs.a Y_() {
      return this.bW;
   }

   @Override
   public void a(@Nullable bxs.a $$0) {
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
      bxs.super.B();
      this.bF.a(ceq.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cor);
   }

   @Override
   public boolean a(bwt $$0, boolean $$1) {
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
   public bxl fy() {
      return this.gk() ? bxl.a : bxl.b;
   }

   public boolean h(bxu $$0) {
      return this.gm().c($$0.eN());
   }

   protected ffl gm() {
      bwt $$0 = this.dk();
      ffl $$3;
      if ($$0 != null) {
         ffl $$1 = $$0.cR();
         ffl $$2 = this.cR();
         $$3 = new ffl(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bI, 0.0, bI);
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      float $$2 = (float)this.h(bza.c);
      czy $$3 = this.dZ();
      bvi $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((bxu)this));
      $$2 = dgn.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bxu $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azo.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azo.b(this.dL() * (float) (Math.PI / 180.0))));
            this.i(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bxu $$8) {
            $$3.a($$8, this);
         }

         dgn.a($$0, $$1, $$4);
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
         iv $$1 = iv.a(this.dA(), this.dE(), this.dG());
         boolean $$2 = this.bk() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dV().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axt<exn> $$0) {
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

   public void c(Predicate<ceq> $$0) {
      this.bF.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();

      for (bxd $$0 : bxd.j) {
         czy $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public czy dI() {
      dbf $$0 = dbf.a(this.an());
      return $$0 == null ? null : new czy($$0);
   }

   @Override
   protected void f(jf<byv> $$0) {
      super.f($$0);
      if ($$0.a(bza.m) || $$0.a(bza.E)) {
         this.O().e();
      }
   }
}
