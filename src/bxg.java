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

public abstract class bxg extends bxe implements bws, bxc, byb {
   private static final akj<Byte> a = akn.a(bxg.class, akl.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int h = 1;
   private static final jz bF = new jz(1, 0, 1);
   private static final List<bwp> bG = List.of(bwp.f, bwp.e, bwp.d, bwp.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bu = 0.25F;
   public static final int bv = 2;
   private static final double bH = Math.sqrt(2.04F) - 0.6F;
   protected static final alg bw = alg.b("random_spawn_bonus");
   public int bx;
   protected int by;
   protected cdc bz;
   protected cdd bA;
   protected cdb bB;
   private final ccy bI;
   protected cgo bC;
   protected final ceb bD;
   protected final ceb bE;
   @Nullable
   private bxe bJ;
   private final chl bK;
   private bwd bL = bwd.d;
   private boolean bM;
   private boolean bN;
   private final Map<exf, Float> bO = Maps.newEnumMap(exf.class);
   private Optional<alf<ezm>> bP = Optional.empty();
   private long bQ;
   @Nullable
   private bxc.a bR;
   private iu bS = iu.c;
   private float bT = -1.0F;

   protected bxg(bwo<? extends bxg> $$0, dja $$1) {
      super($$0, $$1);
      this.bD = new ceb();
      this.bE = new ceb();
      this.bz = new cdc(this);
      this.bA = new cdd(this);
      this.bB = new cdb(this);
      this.bI = this.I();
      this.bC = this.b($$1);
      this.bK = new chl(this);
      if ($$1 instanceof arq) {
         this.D();
      }
   }

   protected void D() {
   }

   public static byj.a E() {
      return bxe.ee().a(byk.m, 16.0);
   }

   protected cgo b(dja $$0) {
      return new cgn(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(exf $$0) {
      bxg $$2;
      label17: {
         if (this.dl() instanceof bxg $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bO.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(exf $$0, float $$1) {
      this.bO.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   public void H() {
   }

   protected ccy I() {
      return new ccy(this);
   }

   public cdc J() {
      return this.bz;
   }

   public cdd L() {
      return this.dl() instanceof bxg $$0 ? $$0.L() : this.bA;
   }

   public cdb N() {
      return this.bB;
   }

   public cgo O() {
      return this.dl() instanceof bxg $$0 ? $$0.O() : this.bC;
   }

   @Nullable
   @Override
   public bxe cW() {
      bwf $$0 = this.cZ();
      if (!this.gg() && $$0 instanceof bxg $$1 && $$0.cc()) {
         return $$1;
      }

      return null;
   }

   public chl P() {
      return this.bK;
   }

   @Nullable
   @Override
   public bxe f() {
      return this.bJ;
   }

   @Nullable
   protected final bxe Q() {
      return this.ec().c(cgg.p).orElse(null);
   }

   public void g(@Nullable bxe $$0) {
      this.bJ = $$0;
   }

   @Override
   public boolean a(bwo<?> $$0) {
      return $$0 != bwo.ad;
   }

   public boolean a(czy $$0) {
      return false;
   }

   public void R() {
      this.a(efh.m);
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void az() {
      super.az();
      bqo $$0 = bqn.a();
      $$0.a("mobBaseTick");
      if (this.bK() && this.ae.a(1000) < this.bx++) {
         this.j();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(buu $$0) {
      this.j();
      super.h($$0);
   }

   private void j() {
      this.bx = -this.S();
   }

   @Override
   protected int e(arq $$0) {
      if (this.by > 0) {
         int $$1 = this.by;

         for (bwp $$2 : bwp.j) {
            if ($$2.g()) {
               czd $$3 = this.a($$2);
               if (!$$3.f() && this.bL.b($$2) <= 1.0F) {
                  $$1 += 1 + this.ae.a(3);
               }
            }
         }

         return $$1;
      } else {
         return this.by;
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
      boolean $$0 = !(this.cW() instanceof bxg);
      boolean $$1 = !(this.dk() instanceof ctn);
      this.bD.a(cea.a.a, $$0);
      this.bD.a(cea.a.c, $$0 && $$1);
      this.bD.a(cea.a.b, $$0);
   }

   @Override
   protected void C(float $$0) {
      this.bI.a();
   }

   @Nullable
   protected awm u() {
      return null;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fN());
      $$0.a("PersistenceRequired", this.bN);
      ale<uw> $$1 = this.dX().a(un.a);
      if (!this.bL.equals(bwd.d)) {
         $$0.a("drop_chances", bwd.e, $$1, this.bL);
      }

      this.a($$0, this.bR);
      $$0.a("LeftHanded", this.gh());
      if (this.bP.isPresent()) {
         $$0.a("DeathLootTable", this.bP.get().a().toString());
      }

      if (this.bQ != 0L) {
         $$0.a("DeathLootTableSeed", this.bQ);
      }

      if (this.gg()) {
         $$0.a("NoAI", this.gg());
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a_($$0.q("CanPickUpLoot"));
      this.bN = $$0.q("PersistenceRequired");
      ale<uw> $$1 = this.dX().a(un.a);
      this.bL = $$0.<bwd>a("drop_chances", bwd.e, $$1).orElse(bwd.d);
      this.c($$0);
      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.bP = Optional.of(alf.a(mg.bq, alg.a($$0.l("DeathLootTable"))));
      } else {
         this.bP = Optional.empty();
      }

      this.bQ = $$0.i("DeathLootTableSeed");
      this.t($$0.q("NoAI"));
   }

   @Override
   protected void b(arq $$0, buu $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bP = Optional.empty();
   }

   @Override
   public final Optional<alf<ezm>> ea() {
      return this.bP.isPresent() ? this.bP : super.ea();
   }

   @Override
   public long eJ() {
      return this.bQ;
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
      bqo $$0 = bqn.a();
      $$0.a("looting");
      if (this.dV() instanceof arq $$1 && this.fN() && this.bK() && !this.bc && $$1.O().c(diw.d)) {
         jz $$2 = this.X();

         for (cnh $$4 : this.dV().a(cnh.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dQ() && !$$4.f().f() && !$$4.o() && this.c($$1, $$4.f())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected jz X() {
      return bF;
   }

   protected void a(arq $$0, cnh $$1) {
      czd $$2 = $$1.f();
      czd $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public czd b(arq $$0, czd $$1) {
      bwp $$2 = this.f($$1);
      if (!this.a($$1, $$2)) {
         return czd.k;
      } else {
         czd $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bwp.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.g($$1)) {
            double $$5 = (double)this.bL.b($$2);
            if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            czd $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return czd.k;
         }
      }
   }

   protected void b(bwp $$0, czd $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bN = true;
   }

   public void g(bwp $$0) {
      this.bL = this.bL.a($$0);
   }

   protected boolean a(czd $$0, czd $$1, bwp $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bwp.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(czd $$0, czd $$1, bwp $$2) {
      if (dfs.a($$1, dfr.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, byk.a, $$2);
         double $$4 = this.a($$1, byk.a, $$2);
         double $$5 = this.a($$0, byk.b, $$2);
         double $$6 = this.a($$1, byk.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(czd $$0, czd $$1, bwp $$2) {
      axr<cyz> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, byk.c, $$2);
      double $$5 = this.a($$1, byk.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(czd $$0, je<byf> $$1, bwp $$2) {
      double $$3 = this.fa().b($$1) ? this.i($$1) : 0.0;
      dbu $$4 = $$0.a(kj.o, dbu.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(czd $$0, czd $$1) {
      Set<Entry<je<dfq>>> $$2 = $$1.a(kj.l, dfw.a).b();
      Set<Entry<je<dfq>>> $$3 = $$0.a(kj.l, dfw.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kj.g) && !$$1.c(kj.g);
      }
   }

   public boolean g(czd $$0) {
      return true;
   }

   public boolean c(arq $$0, czd $$1) {
      return this.g($$1);
   }

   @Nullable
   public axr<cyz> Y() {
      return null;
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Z() {
      return this.bZ();
   }

   protected boolean aa() {
      return false;
   }

   @Override
   public void dH() {
      if (this.dV().an() == bua.a && this.aa()) {
         this.at();
      } else if (!this.ga() && !this.Z()) {
         bwf $$0 = this.dV().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.aq().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.at();
            }

            int $$4 = this.aq().f().g();
            int $$5 = $$4 * $$4;
            if (this.bd > 600 && this.ae.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.at();
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
      bqo $$0 = bqn.a();
      $$0.a("sensing");
      this.bK.a();
      $$0.c();
      int $$1 = this.af + this.ar();
      if ($$1 % 2 != 0 && this.af > 1) {
         $$0.a("targetSelector");
         this.bE.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bD.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bE.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bD.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bC.c();
      $$0.c();
      $$0.a("mob tick");
      this.a((arq)this.dV());
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bA.a();
      $$0.b("look");
      this.bz.a();
      $$0.b("jump");
      this.bB.b();
      $$0.c();
      $$0.c();
      this.ab();
   }

   protected void ab() {
      agm.a(this.dV(), this, this.bD);
   }

   protected void a(arq $$0) {
   }

   public int ac() {
      return 40;
   }

   public int ad() {
      return 75;
   }

   protected void af() {
      float $$0 = (float)this.ad();
      float $$1 = this.cA();
      float $$2 = azm.h(this.aV - $$1);
      float $$3 = azm.a(azm.h(this.aV - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int ag() {
      return 10;
   }

   public void a(bwf $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof bxe $$5) {
         $$6 = $$5.dE() - this.dE();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dE();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azm.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.x(this.a(this.dN(), $$10, $$2));
      this.w(this.a(this.dL(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azm.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bwo<? extends bxg> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      iu $$5 = $$3.e();
      return bwn.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(djb $$0, bwn $$1) {
      return true;
   }

   public boolean a(djd $$0) {
      return !$$0.d(this.cR()) && $$0.f(this);
   }

   public int ai() {
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

   public czd aj() {
      return this.a(bwp.g);
   }

   public boolean ak() {
      return this.d(bwp.h);
   }

   public boolean fX() {
      return this.d(bwp.g);
   }

   public void h(czd $$0) {
      this.b(bwp.g, $$0);
   }

   public btw h(final bwp $$0) {
      return new fgc() {
         @Override
         public czd f() {
            return bxg.this.a($$0);
         }

         @Override
         public void b(czd $$0x) {
            bxg.this.a($$0, $$0);
            if (!$$0.f()) {
               bxg.this.g($$0);
               bxg.this.fZ();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(crc $$0x) {
            return $$0.dk() == bxg.this || $$0.b(bxg.this, 4.0);
         }
      };
   }

   @Override
   protected void a(arq $$0, buu $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bwp $$3 : bwp.j) {
         czd $$4 = this.a($$3);
         float $$5 = this.bL.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bL.c($$3);
            bwf var11 = $$1.d();
            if (var11 instanceof bxe) {
               bxe $$7 = (bxe)var11;
               if (this.dV() instanceof arq $$8) {
                  $$5 = dfs.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dfs.a($$4, dfr.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, czd.k);
            }
         }
      }
   }

   public bwd fY() {
      return this.bL;
   }

   public void b(arq $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bwp> a(arq $$0, Predicate<czd> $$1) {
      Set<bwp> $$2 = new HashSet<>();

      for (bwp $$3 : bwp.j) {
         czd $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bL.c($$3)) {
               this.a($$3, czd.k);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private ezk g(arq $$0) {
      return new ezk.a($$0).a(fcb.f, this.dt()).a(fcb.a, this).a(fca.h);
   }

   public void a(bwr $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alf<ezm> $$0, Map<bwp, Float> $$1) {
      if (this.dV() instanceof arq $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azv $$0, bub $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().an() == bua.d ? 0.1F : 0.25F;
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

         for (bwp $$5 : bG) {
            czd $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cyz $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new czd($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cyz a(bwp $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return czh.qm;
            } else if ($$1 == 1) {
               return czh.qC;
            } else if ($$1 == 2) {
               return czh.qq;
            } else if ($$1 == 3) {
               return czh.qu;
            } else if ($$1 == 4) {
               return czh.qy;
            }
         case e:
            if ($$1 == 0) {
               return czh.qn;
            } else if ($$1 == 1) {
               return czh.qD;
            } else if ($$1 == 2) {
               return czh.qr;
            } else if ($$1 == 3) {
               return czh.qv;
            } else if ($$1 == 4) {
               return czh.qz;
            }
         case d:
            if ($$1 == 0) {
               return czh.qo;
            } else if ($$1 == 1) {
               return czh.qE;
            } else if ($$1 == 2) {
               return czh.qs;
            } else if ($$1 == 3) {
               return czh.qw;
            } else if ($$1 == 4) {
               return czh.qA;
            }
         case c:
            if ($$1 == 0) {
               return czh.qp;
            } else if ($$1 == 1) {
               return czh.qF;
            } else if ($$1 == 2) {
               return czh.qt;
            } else if ($$1 == 3) {
               return czh.qx;
            } else if ($$1 == 4) {
               return czh.qB;
            }
         default:
            return null;
      }
   }

   protected void a(djr $$0, azv $$1, bub $$2) {
      this.b($$0, $$1, $$2);

      for (bwp $$3 : bwp.j) {
         if ($$3.a() == bwp.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(djr $$0, azv $$1, bub $$2) {
      this.a($$0, bwp.a, $$1, 0.25F, $$2);
   }

   protected void a(djr $$0, azv $$1, bwp $$2, bub $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(djr $$0, bwp $$1, azv $$2, float $$3, bub $$4) {
      czd $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dfs.a($$5, $$0.F_(), dhe.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      byg $$5 = Objects.requireNonNull(this.g(byk.m));
      if (!$$5.b(bw)) {
         $$5.d(new byi(bw, $$4.a(0.0, 0.11485000000000001), byi.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fZ() {
      this.bN = true;
   }

   @Override
   public void a(bwp $$0, float $$1) {
      this.bL = this.bL.a($$0, $$1);
   }

   @Override
   public boolean fN() {
      return this.bM;
   }

   public void a_(boolean $$0) {
      this.bM = $$0;
   }

   @Override
   protected boolean f(bwp $$0) {
      return this.fN();
   }

   public boolean ga() {
      return this.bN;
   }

   @Override
   public final bud a(crc $$0, buc $$1) {
      if (!this.bK()) {
         return bud.e;
      } else {
         bud $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(efh.r, $$0);
            return $$2;
         } else {
            bud $$3 = super.a($$0, $$1);
            if ($$3 != bud.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(efh.r, $$0);
                  return $$2;
               } else {
                  return bud.e;
               }
            }
         }
      }
   }

   private bud c(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.vW)) {
         bud $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof dak) {
         if (this.dV() instanceof arq) {
            dak $$4 = (dak)$$2.h();
            Optional<bxg> $$5 = $$4.a($$0, this, (bwo<? extends bxg>)this.aq(), (arq)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bud.e;
            }
         }

         return bud.b;
      } else {
         return bud.e;
      }
   }

   protected void a(crc $$0, bxg $$1) {
   }

   protected bud b(crc $$0, buc $$1) {
      return bud.e;
   }

   public boolean gb() {
      return this.a(this.dv());
   }

   public boolean a(iu $$0) {
      return this.bT == -1.0F ? true : this.bS.j($$0) < (double)(this.bT * this.bT);
   }

   public void a(iu $$0, int $$1) {
      this.bS = $$0;
      this.bT = (float)$$1;
   }

   public iu gc() {
      return this.bS;
   }

   public float gd() {
      return this.bT;
   }

   public void ge() {
      this.bT = -1.0F;
   }

   public boolean gf() {
      return this.bT != -1.0F;
   }

   @Nullable
   public <T extends bxg> T a(bwo<T> $$0, bvz $$1, bwn $$2, bvz.a<T> $$3) {
      if (this.dQ()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dV(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dV() instanceof arq $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.at();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bxg> T a(bwo<T> $$0, bvz $$1, bvz.a<T> $$2) {
      return this.a($$0, $$1, bwn.i, $$2);
   }

   @Nullable
   @Override
   public bxc.a U_() {
      return this.bR;
   }

   @Override
   public void a(@Nullable bxc.a $$0) {
      this.bR = $$0;
   }

   @Override
   public void A() {
      if (this.U_() == null) {
         this.ge();
      }
   }

   @Override
   public void B() {
      bxc.super.B();
      this.bD.a(cea.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cnv);
   }

   @Override
   public boolean a(bwf $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.O_()) {
         this.y();
      }

      return $$2;
   }

   @Override
   public boolean di() {
      return super.di() && !this.gg();
   }

   @Override
   public boolean dj() {
      return super.dj() && !this.gg();
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

   public boolean gg() {
      return (this.al.a(a) & 1) != 0;
   }

   public boolean gh() {
      return (this.al.a(a) & 2) != 0;
   }

   public boolean gi() {
      return (this.al.a(a) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bwx fy() {
      return this.gh() ? bwx.a : bwx.b;
   }

   public boolean h(bxe $$0) {
      return this.gj().c($$0.eN());
   }

   protected fel gj() {
      bwf $$0 = this.dk();
      fel $$3;
      if ($$0 != null) {
         fel $$1 = $$0.cR();
         fel $$2 = this.cR();
         $$3 = new fel(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bH, 0.0, bH);
   }

   @Override
   public boolean c(arq $$0, bwf $$1) {
      float $$2 = (float)this.h(byk.c);
      czd $$3 = this.dZ();
      buu $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((bxe)this));
      $$2 = dfs.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bxe $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0))));
            this.i(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bxe $$8) {
            $$3.a($$8, this);
         }

         dfs.a($$0, $$1, $$4);
         this.B($$1);
         this.gk();
      }

      return $$5;
   }

   protected void gk() {
   }

   protected boolean gl() {
      if (this.dV().V() && !this.dV().C) {
         float $$0 = this.bx();
         iu $$1 = iu.a(this.dA(), this.dE(), this.dG());
         boolean $$2 = this.bl() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dV().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axr<ewn> $$0) {
      if (this.O().o()) {
         super.c($$0);
      } else {
         this.i(this.dy().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gm() {
      this.c($$0 -> true);
      this.ec().h();
   }

   public void c(Predicate<cea> $$0) {
      this.bD.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();

      for (bwp $$0 : bwp.j) {
         czd $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public czd dI() {
      dak $$0 = dak.a(this.aq());
      return $$0 == null ? null : new czd($$0);
   }

   @Override
   protected void f(je<byf> $$0) {
      super.f($$0);
      if ($$0.a(byk.m) || $$0.a(byk.E)) {
         this.O().e();
      }
   }
}
