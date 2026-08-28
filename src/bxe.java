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

public abstract class bxe extends bxc implements bwq, bxa, bxz {
   private static final akj<Byte> a = akn.a(bxe.class, akl.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int h = 1;
   private static final jz bE = new jz(1, 0, 1);
   private static final List<bwn> bF = List.of(bwn.f, bwn.e, bwn.d, bwn.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bt = 0.25F;
   public static final int bu = 2;
   private static final double bG = Math.sqrt(2.04F) - 0.6F;
   protected static final alg bv = alg.b("random_spawn_bonus");
   public int bw;
   protected int bx;
   protected cda by;
   protected cdb bz;
   protected ccz bA;
   private final ccw bH;
   protected cgm bB;
   protected final cdz bC;
   protected final cdz bD;
   @Nullable
   private bxc bI;
   private final chj bJ;
   private bwh bK = new bwh();
   private bwb bL = bwb.d;
   private boolean bM;
   private boolean bN;
   private final Map<ewx, Float> bO = Maps.newEnumMap(ewx.class);
   private Optional<alf<eze>> bP = Optional.empty();
   private long bQ;
   @Nullable
   private bxa.a bR;
   private iu bS = iu.c;
   private float bT = -1.0F;

   protected bxe(bwm<? extends bxe> $$0, div $$1) {
      super($$0, $$1);
      this.bC = new cdz();
      this.bD = new cdz();
      this.by = new cda(this);
      this.bz = new cdb(this);
      this.bA = new ccz(this);
      this.bH = this.I();
      this.bB = this.b($$1);
      this.bJ = new chj(this);
      if ($$1 instanceof arq) {
         this.D();
      }
   }

   protected void D() {
   }

   public static byh.a E() {
      return bxc.ed().a(byi.m, 16.0);
   }

   protected cgm b(div $$0) {
      return new cgl(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(ewx $$0) {
      bxe $$2;
      label17: {
         if (this.dl() instanceof bxe $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bO.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(ewx $$0, float $$1) {
      this.bO.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   public void H() {
   }

   protected ccw I() {
      return new ccw(this);
   }

   public cda J() {
      return this.by;
   }

   public cdb L() {
      return this.dl() instanceof bxe $$0 ? $$0.L() : this.bz;
   }

   public ccz N() {
      return this.bA;
   }

   public cgm O() {
      return this.dl() instanceof bxe $$0 ? $$0.O() : this.bB;
   }

   @Nullable
   @Override
   public bxc cW() {
      bwd $$0 = this.cZ();
      if (!this.gf() && $$0 instanceof bxe $$1 && $$0.cc()) {
         return $$1;
      }

      return null;
   }

   public chj P() {
      return this.bJ;
   }

   @Nullable
   @Override
   public bxc f() {
      return this.bI;
   }

   @Nullable
   protected final bxc Q() {
      return this.eb().c(cge.p).orElse(null);
   }

   public void g(@Nullable bxc $$0) {
      this.bI = $$0;
   }

   @Override
   public boolean a(bwm<?> $$0) {
      return $$0 != bwm.ad;
   }

   public boolean a(czt $$0) {
      return false;
   }

   public void R() {
      this.a(eez.m);
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
      bqm $$0 = bql.a();
      $$0.a("mobBaseTick");
      if (this.bK() && this.ae.a(1000) < this.bw++) {
         this.j();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(bus $$0) {
      this.j();
      super.h($$0);
   }

   private void j() {
      this.bw = -this.S();
   }

   @Override
   protected int e(arq $$0) {
      if (this.bx > 0) {
         int $$1 = this.bx;

         for (bwn $$2 : bwn.j) {
            if ($$2.g()) {
               cyy $$3 = this.a($$2);
               if (!$$3.f() && this.bL.b($$2) <= 1.0F) {
                  $$1 += 1 + this.ae.a(3);
               }
            }
         }

         return $$1;
      } else {
         return this.bx;
      }
   }

   public void U() {
      if (this.dV().C) {
         this.eX();
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
      boolean $$0 = !(this.cW() instanceof bxe);
      boolean $$1 = !(this.dk() instanceof cti);
      this.bC.a(cdy.a.a, $$0);
      this.bC.a(cdy.a.c, $$0 && $$1);
      this.bC.a(cdy.a.b, $$0);
   }

   @Override
   protected void C(float $$0) {
      this.bH.a();
   }

   @Nullable
   protected awm u() {
      return null;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fM());
      $$0.a("PersistenceRequired", this.bN);
      ale<uw> $$1 = this.dX().a(un.a);
      if (!this.bK.a()) {
         $$0.a("equipment", bwh.a, $$1, this.bK);
      }

      if (!this.bL.equals(bwb.d)) {
         $$0.a("drop_chances", bwb.e, $$1, this.bL);
      }

      this.a($$0, this.bR);
      $$0.a("LeftHanded", this.gg());
      if (this.bP.isPresent()) {
         $$0.a("DeathLootTable", this.bP.get().a().toString());
      }

      if (this.bQ != 0L) {
         $$0.a("DeathLootTableSeed", this.bQ);
      }

      if (this.gf()) {
         $$0.a("NoAI", this.gf());
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a_($$0.q("CanPickUpLoot"));
      this.bN = $$0.q("PersistenceRequired");
      ale<uw> $$1 = this.dX().a(un.a);
      this.bK = $$0.<bwh>a("equipment", bwh.a, $$1).orElseGet(bwh::new);
      this.bL = $$0.<bwb>a("drop_chances", bwb.e, $$1).orElse(bwb.d);
      this.c($$0);
      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.bP = Optional.of(alf.a(mg.bp, alg.a($$0.l("DeathLootTable"))));
      } else {
         this.bP = Optional.empty();
      }

      this.bQ = $$0.i("DeathLootTableSeed");
      this.t($$0.q("NoAI"));
   }

   @Override
   protected void b(arq $$0, bus $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bP = Optional.empty();
   }

   @Override
   public final Optional<alf<eze>> ea() {
      return this.bP.isPresent() ? this.bP : super.ea();
   }

   @Override
   public long eI() {
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
      bqm $$0 = bql.a();
      $$0.a("looting");
      if (this.dV() instanceof arq $$1 && this.fM() && this.bK() && !this.bc && $$1.O().c(dir.c)) {
         jz $$2 = this.X();

         for (cnd $$4 : this.dV().a(cnd.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dQ() && !$$4.f().f() && !$$4.o() && this.c($$1, $$4.f())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected jz X() {
      return bE;
   }

   protected void a(arq $$0, cnd $$1) {
      cyy $$2 = $$1.f();
      cyy $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public cyy b(arq $$0, cyy $$1) {
      bwn $$2 = this.g($$1);
      if (!this.a($$1, $$2)) {
         return cyy.k;
      } else {
         cyy $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bwn.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.h($$1)) {
            double $$5 = (double)this.bL.b($$2);
            if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            cyy $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return cyy.k;
         }
      }
   }

   protected void b(bwn $$0, cyy $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bN = true;
   }

   public void g(bwn $$0) {
      this.bL = this.bL.a($$0);
   }

   protected boolean a(cyy $$0, cyy $$1, bwn $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bwn.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(cyy $$0, cyy $$1, bwn $$2) {
      if (dfn.a($$1, dfm.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, byi.a, $$2);
         double $$4 = this.a($$1, byi.a, $$2);
         double $$5 = this.a($$0, byi.b, $$2);
         double $$6 = this.a($$1, byi.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(cyy $$0, cyy $$1, bwn $$2) {
      axr<cyu> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, byi.c, $$2);
      double $$5 = this.a($$1, byi.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(cyy $$0, je<byd> $$1, bwn $$2) {
      double $$3 = this.eZ().b($$1) ? this.i($$1) : 0.0;
      dbp $$4 = $$0.a(kj.o, dbp.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cyy $$0, cyy $$1) {
      Set<Entry<je<dfl>>> $$2 = $$1.a(kj.l, dfr.a).b();
      Set<Entry<je<dfl>>> $$3 = $$0.a(kj.l, dfr.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kj.g) && !$$1.c(kj.g);
      }
   }

   public boolean h(cyy $$0) {
      return true;
   }

   public boolean c(arq $$0, cyy $$1) {
      return this.h($$1);
   }

   @Nullable
   public axr<cyu> Y() {
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
      if (this.dV().an() == bty.a && this.aa()) {
         this.at();
      } else if (!this.fZ() && !this.Z()) {
         bwd $$0 = this.dV().a(this, -1.0);
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
   protected final void ft() {
      this.bd++;
      bqm $$0 = bql.a();
      $$0.a("sensing");
      this.bJ.a();
      $$0.c();
      int $$1 = this.af + this.ar();
      if ($$1 % 2 != 0 && this.af > 1) {
         $$0.a("targetSelector");
         this.bD.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bC.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bD.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bC.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bB.c();
      $$0.c();
      $$0.a("mob tick");
      this.a((arq)this.dV());
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bz.a();
      $$0.b("look");
      this.by.a();
      $$0.b("jump");
      this.bA.b();
      $$0.c();
      $$0.c();
      this.ab();
   }

   protected void ab() {
      agm.a(this.dV(), this, this.bC);
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

   public void a(bwd $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof bxc $$5) {
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

   public static boolean a(bwm<? extends bxe> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      iu $$5 = $$3.e();
      return bwl.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(diw $$0, bwl $$1) {
      return true;
   }

   public boolean a(diy $$0) {
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
         int $$0 = (int)(this.eF() - this.eT() * 0.33F);
         $$0 -= (3 - this.dV().an().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   public cyy aj() {
      return this.a(bwn.g);
   }

   public boolean ak() {
      return this.d(bwn.h);
   }

   public boolean fW() {
      return this.d(bwn.g);
   }

   public void i(cyy $$0) {
      this.b(bwn.g, $$0);
   }

   @Override
   public cyy a(bwn $$0) {
      return this.bK.a($$0);
   }

   @Override
   public void a(bwn $$0, cyy $$1) {
      this.d($$1);
      cyy $$2 = this.bK.a($$0, $$1);
      this.a($$0, $$2, $$1);
   }

   public btu h(final bwn $$0) {
      return new ffu() {
         @Override
         public cyy f() {
            return bxe.this.a($$0);
         }

         @Override
         public void b(cyy $$0x) {
            bxe.this.a($$0, $$0);
            if (!$$0.f()) {
               bxe.this.g($$0);
               bxe.this.fY();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(cqy $$0x) {
            return $$0.dk() == bxe.this || $$0.b(bxe.this, 4.0);
         }
      };
   }

   @Override
   protected void a(arq $$0, bus $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bwn $$3 : bwn.j) {
         cyy $$4 = this.a($$3);
         float $$5 = this.bL.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bL.c($$3);
            bwd var11 = $$1.d();
            if (var11 instanceof bxc) {
               bxc $$7 = (bxc)var11;
               if (this.dV() instanceof arq $$8) {
                  $$5 = dfn.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dfn.a($$4, dfm.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, cyy.k);
            }
         }
      }
   }

   public bwb fX() {
      return this.bL;
   }

   public void b(arq $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bwn> a(arq $$0, Predicate<cyy> $$1) {
      Set<bwn> $$2 = new HashSet<>();

      for (bwn $$3 : bwn.j) {
         cyy $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bL.c($$3)) {
               this.a($$3, cyy.k);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private ezc g(arq $$0) {
      return new ezc.a($$0).a(fbt.f, this.dt()).a(fbt.a, this).a(fbs.h);
   }

   public void a(bwp $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alf<eze> $$0, Map<bwn, Float> $$1) {
      if (this.dV() instanceof arq $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azv $$0, btz $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().an() == bty.d ? 0.1F : 0.25F;
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

         for (bwn $$5 : bF) {
            cyy $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cyu $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cyy($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cyu a(bwn $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return czc.qj;
            } else if ($$1 == 1) {
               return czc.qz;
            } else if ($$1 == 2) {
               return czc.qn;
            } else if ($$1 == 3) {
               return czc.qr;
            } else if ($$1 == 4) {
               return czc.qv;
            }
         case e:
            if ($$1 == 0) {
               return czc.qk;
            } else if ($$1 == 1) {
               return czc.qA;
            } else if ($$1 == 2) {
               return czc.qo;
            } else if ($$1 == 3) {
               return czc.qs;
            } else if ($$1 == 4) {
               return czc.qw;
            }
         case d:
            if ($$1 == 0) {
               return czc.ql;
            } else if ($$1 == 1) {
               return czc.qB;
            } else if ($$1 == 2) {
               return czc.qp;
            } else if ($$1 == 3) {
               return czc.qt;
            } else if ($$1 == 4) {
               return czc.qx;
            }
         case c:
            if ($$1 == 0) {
               return czc.qm;
            } else if ($$1 == 1) {
               return czc.qC;
            } else if ($$1 == 2) {
               return czc.qq;
            } else if ($$1 == 3) {
               return czc.qu;
            } else if ($$1 == 4) {
               return czc.qy;
            }
         default:
            return null;
      }
   }

   protected void a(djm $$0, azv $$1, btz $$2) {
      this.b($$0, $$1, $$2);

      for (bwn $$3 : bwn.j) {
         if ($$3.a() == bwn.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(djm $$0, azv $$1, btz $$2) {
      this.a($$0, bwn.a, $$1, 0.25F, $$2);
   }

   protected void a(djm $$0, azv $$1, bwn $$2, btz $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(djm $$0, bwn $$1, azv $$2, float $$3, btz $$4) {
      cyy $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dfn.a($$5, $$0.F_(), dgz.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      bye $$5 = Objects.requireNonNull(this.g(byi.m));
      if (!$$5.b(bv)) {
         $$5.d(new byg(bv, $$4.a(0.0, 0.11485000000000001), byg.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fY() {
      this.bN = true;
   }

   @Override
   public void a(bwn $$0, float $$1) {
      this.bL = this.bL.a($$0, $$1);
   }

   @Override
   public boolean fM() {
      return this.bM;
   }

   public void a_(boolean $$0) {
      this.bM = $$0;
   }

   @Override
   protected boolean f(bwn $$0) {
      return this.fM();
   }

   public boolean fZ() {
      return this.bN;
   }

   @Override
   public final bub a(cqy $$0, bua $$1) {
      if (!this.bK()) {
         return bub.e;
      } else {
         bub $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(eez.r, $$0);
            return $$2;
         } else {
            bub $$3 = super.a($$0, $$1);
            if ($$3 != bub.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(eez.r, $$0);
                  return $$2;
               } else {
                  return bub.e;
               }
            }
         }
      }
   }

   private bub c(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.vR)) {
         bub $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof daf) {
         if (this.dV() instanceof arq) {
            daf $$4 = (daf)$$2.h();
            Optional<bxe> $$5 = $$4.a($$0, this, (bwm<? extends bxe>)this.aq(), (arq)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bub.e;
            }
         }

         return bub.b;
      } else {
         return bub.e;
      }
   }

   protected void a(cqy $$0, bxe $$1) {
   }

   protected bub b(cqy $$0, bua $$1) {
      return bub.e;
   }

   public boolean ga() {
      return this.a(this.dv());
   }

   public boolean a(iu $$0) {
      return this.bT == -1.0F ? true : this.bS.j($$0) < (double)(this.bT * this.bT);
   }

   public void a(iu $$0, int $$1) {
      this.bS = $$0;
      this.bT = (float)$$1;
   }

   public iu gb() {
      return this.bS;
   }

   public float gc() {
      return this.bT;
   }

   public void gd() {
      this.bT = -1.0F;
   }

   public boolean ge() {
      return this.bT != -1.0F;
   }

   @Nullable
   public <T extends bxe> T a(bwm<T> $$0, bvx $$1, bwl $$2, bvx.a<T> $$3) {
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
   public <T extends bxe> T a(bwm<T> $$0, bvx $$1, bvx.a<T> $$2) {
      return this.a($$0, $$1, bwl.i, $$2);
   }

   @Nullable
   @Override
   public bxa.a T_() {
      return this.bR;
   }

   @Override
   public void a(@Nullable bxa.a $$0) {
      this.bR = $$0;
   }

   @Override
   public void A() {
      if (this.T_() == null) {
         this.gd();
      }
   }

   @Override
   public void B() {
      bxa.super.B();
      this.bC.a(cdy.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cnr);
   }

   @Override
   public boolean a(bwd $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.O_()) {
         this.y();
      }

      return $$2;
   }

   @Override
   public boolean di() {
      return super.di() && !this.gf();
   }

   @Override
   public boolean dj() {
      return super.dj() && !this.gf();
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

   public boolean gf() {
      return (this.al.a(a) & 1) != 0;
   }

   public boolean gg() {
      return (this.al.a(a) & 2) != 0;
   }

   public boolean gh() {
      return (this.al.a(a) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bwv fx() {
      return this.gg() ? bwv.a : bwv.b;
   }

   public boolean h(bxc $$0) {
      return this.gi().c($$0.eM());
   }

   protected fed gi() {
      bwd $$0 = this.dk();
      fed $$3;
      if ($$0 != null) {
         fed $$1 = $$0.cR();
         fed $$2 = this.cR();
         $$3 = new fed(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bG, 0.0, bG);
   }

   @Override
   public boolean c(arq $$0, bwd $$1) {
      float $$2 = (float)this.h(byi.c);
      cyy $$3 = this.dZ();
      bus $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((bxc)this));
      $$2 = dfn.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bxc $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azm.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dL() * (float) (Math.PI / 180.0))));
            this.i(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bxc $$8) {
            $$3.a($$8, this);
         }

         dfn.a($$0, $$1, $$4);
         this.B($$1);
         this.gj();
      }

      return $$5;
   }

   protected void gj() {
   }

   protected boolean gk() {
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
   protected void c(axr<ewf> $$0) {
      if (this.O().o()) {
         super.c($$0);
      } else {
         this.i(this.dy().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gl() {
      this.c($$0 -> true);
      this.eb().h();
   }

   public void c(Predicate<cdy> $$0) {
      this.bC.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();

      for (bwn $$0 : bwn.j) {
         cyy $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public cyy dI() {
      daf $$0 = daf.a(this.aq());
      return $$0 == null ? null : new cyy($$0);
   }

   @Override
   protected void f(je<byd> $$0) {
      super.f($$0);
      if ($$0.a(byi.m) || $$0.a(byi.E)) {
         this.O().e();
      }
   }
}
