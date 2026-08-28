import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bxb extends bwz implements bwn, bwx, bxw {
   private static final Logger a = LogUtils.getLogger();
   private static final akh<Byte> b = akl.a(bxb.class, akj.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int bE = 4;
   protected static final int h = 1;
   private static final jz bF = new jz(1, 0, 1);
   private static final List<bwk> bG = List.of(bwk.f, bwk.e, bwk.d, bwk.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bt = 0.25F;
   public static final int bu = 2;
   private static final double bH = Math.sqrt(2.04F) - 0.6F;
   protected static final ale bv = ale.b("random_spawn_bonus");
   public int bw;
   protected int bx;
   protected ccx by;
   protected ccy bz;
   protected ccw bA;
   private final cct bI;
   protected cgj bB;
   protected final cdw bC;
   protected final cdw bD;
   @Nullable
   private bwz bJ;
   private final chg bK;
   private bwe bL = new bwe();
   private bvy bM = bvy.d;
   private boolean bN;
   private boolean bO;
   private final Map<ewm, Float> bP = Maps.newEnumMap(ewm.class);
   private Optional<ald<eys>> bQ = Optional.empty();
   private long bR;
   @Nullable
   private bwx.a bS;
   private iu bT = iu.c;
   private float bU = -1.0F;

   protected bxb(bwj<? extends bxb> $$0, dip $$1) {
      super($$0, $$1);
      this.bC = new cdw();
      this.bD = new cdw();
      this.by = new ccx(this);
      this.bz = new ccy(this);
      this.bA = new ccw(this);
      this.bI = this.I();
      this.bB = this.b($$1);
      this.bK = new chg(this);
      if ($$1 instanceof aro) {
         this.D();
      }
   }

   protected void D() {
   }

   public static bye.a E() {
      return bwz.ed().a(byf.m, 16.0);
   }

   protected cgj b(dip $$0) {
      return new cgi(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(ewm $$0) {
      bxb $$2;
      label17: {
         if (this.dl() instanceof bxb $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bP.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(ewm $$0, float $$1) {
      this.bP.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   public void H() {
   }

   protected cct I() {
      return new cct(this);
   }

   public ccx J() {
      return this.by;
   }

   public ccy L() {
      return this.dl() instanceof bxb $$0 ? $$0.L() : this.bz;
   }

   public ccw N() {
      return this.bA;
   }

   public cgj O() {
      return this.dl() instanceof bxb $$0 ? $$0.O() : this.bB;
   }

   @Nullable
   @Override
   public bwz cW() {
      bwa $$0 = this.cZ();
      if (!this.gf() && $$0 instanceof bxb $$1 && $$0.cc()) {
         return $$1;
      }

      return null;
   }

   public chg P() {
      return this.bK;
   }

   @Nullable
   @Override
   public bwz f() {
      return this.bJ;
   }

   @Nullable
   protected final bwz Q() {
      return this.eb().c(cgb.p).orElse(null);
   }

   public void g(@Nullable bwz $$0) {
      this.bJ = $$0;
   }

   @Override
   public boolean a(bwj<?> $$0) {
      return $$0 != bwj.ad;
   }

   public boolean a(czn $$0) {
      return false;
   }

   public void R() {
      this.a(eeo.m);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
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
      bqj $$0 = bqi.a();
      $$0.a("mobBaseTick");
      if (this.bK() && this.ae.a(1000) < this.bw++) {
         this.j();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(bup $$0) {
      this.j();
      super.h($$0);
   }

   private void j() {
      this.bw = -this.S();
   }

   @Override
   protected int e(aro $$0) {
      if (this.bx > 0) {
         int $$1 = this.bx;

         for (bwk $$2 : bwk.j) {
            if ($$2.g()) {
               cys $$3 = this.a($$2);
               if (!$$3.f() && this.bM.b($$2) <= 1.0F) {
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
      boolean $$0 = !(this.cW() instanceof bxb);
      boolean $$1 = !(this.dk() instanceof ctc);
      this.bC.a(cdv.a.a, $$0);
      this.bC.a(cdv.a.c, $$0 && $$1);
      this.bC.a(cdv.a.b, $$0);
   }

   @Override
   protected void C(float $$0) {
      this.bI.a();
   }

   @Nullable
   protected awk u() {
      return null;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fM());
      $$0.a("PersistenceRequired", this.bO);
      if (!this.bL.a()) {
         alc<uu> $$1 = this.dX().a(ul.a);
         $$0.a("equipment", (uu)bwe.a.encodeStart($$1, this.bL).getOrThrow());
      }

      if (!this.bM.equals(bvy.d)) {
         $$0.a("drop_chances", (uu)bvy.e.encodeStart(ul.a, this.bM).getOrThrow());
      }

      this.a($$0, this.bS);
      $$0.a("LeftHanded", this.gg());
      if (this.bQ.isPresent()) {
         $$0.a("DeathLootTable", this.bQ.get().a().toString());
      }

      if (this.bR != 0L) {
         $$0.a("DeathLootTableSeed", this.bR);
      }

      if (this.gf()) {
         $$0.a("NoAI", this.gf());
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a_($$0.q("CanPickUpLoot"));
      this.bO = $$0.q("PersistenceRequired");
      if ($$0.e("equipment")) {
         alc<uu> $$1 = this.dX().a(ul.a);
         bwe.a.parse($$1, $$0.c("equipment")).resultOrPartial($$0x -> a.warn("Failed to parse equipment: {}", $$0x)).ifPresent($$0x -> this.bL = $$0x);
      } else {
         this.bL = new bwe();
      }

      if ($$0.e("drop_chances")) {
         bvy.e
            .parse(ul.a, $$0.c("drop_chances"))
            .resultOrPartial($$0x -> a.warn("Failed to parse mob drop chances: {}", $$0x))
            .ifPresent($$0x -> this.bM = $$0x);
      } else {
         this.bM = bvy.d;
      }

      this.c($$0);
      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.bQ = Optional.of(ald.a(mg.bo, ale.a($$0.l("DeathLootTable"))));
      } else {
         this.bQ = Optional.empty();
      }

      this.bR = $$0.i("DeathLootTableSeed");
      this.t($$0.q("NoAI"));
   }

   @Override
   protected void b(aro $$0, bup $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bQ = Optional.empty();
   }

   @Override
   public final Optional<ald<eys>> ea() {
      return this.bQ.isPresent() ? this.bQ : super.ea();
   }

   @Override
   public long eI() {
      return this.bR;
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
      bqj $$0 = bqi.a();
      $$0.a("looting");
      if (this.dV() instanceof aro $$1 && this.fM() && this.bK() && !this.bc && $$1.O().c(dil.c)) {
         jz $$2 = this.X();

         for (cmx $$4 : this.dV().a(cmx.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
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

   protected void a(aro $$0, cmx $$1) {
      cys $$2 = $$1.f();
      cys $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public cys b(aro $$0, cys $$1) {
      bwk $$2 = this.g($$1);
      if (!this.a($$1, $$2)) {
         return cys.k;
      } else {
         cys $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bwk.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.h($$1)) {
            double $$5 = (double)this.bM.b($$2);
            if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            cys $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return cys.k;
         }
      }
   }

   protected void b(bwk $$0, cys $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bO = true;
   }

   public void g(bwk $$0) {
      this.bM = this.bM.a($$0);
   }

   protected boolean a(cys $$0, cys $$1, bwk $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bwk.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(cys $$0, cys $$1, bwk $$2) {
      if (dfh.a($$1, dfg.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, byf.a, $$2);
         double $$4 = this.a($$1, byf.a, $$2);
         double $$5 = this.a($$0, byf.b, $$2);
         double $$6 = this.a($$1, byf.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(cys $$0, cys $$1, bwk $$2) {
      axp<cyo> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, byf.c, $$2);
      double $$5 = this.a($$1, byf.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(cys $$0, je<bya> $$1, bwk $$2) {
      double $$3 = this.eZ().b($$1) ? this.i($$1) : 0.0;
      dbj $$4 = $$0.a(kj.o, dbj.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cys $$0, cys $$1) {
      Set<Entry<je<dff>>> $$2 = $$1.a(kj.l, dfl.a).b();
      Set<Entry<je<dff>>> $$3 = $$0.a(kj.l, dfl.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kj.g) && !$$1.c(kj.g);
      }
   }

   public boolean h(cys $$0) {
      return true;
   }

   public boolean c(aro $$0, cys $$1) {
      return this.h($$1);
   }

   @Nullable
   public axp<cyo> Y() {
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
      if (this.dV().an() == btv.a && this.aa()) {
         this.at();
      } else if (!this.fZ() && !this.Z()) {
         bwa $$0 = this.dV().a(this, -1.0);
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
      bqj $$0 = bqi.a();
      $$0.a("sensing");
      this.bK.a();
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
      this.a((aro)this.dV());
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
      agk.a(this.dV(), this, this.bC);
   }

   protected void a(aro $$0) {
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
      float $$2 = azk.h(this.aV - $$1);
      float $$3 = azk.a(azk.h(this.aV - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int ag() {
      return 10;
   }

   public void a(bwa $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof bwz $$5) {
         $$6 = $$5.dE() - this.dE();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dE();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azk.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azk.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.x(this.a(this.dN(), $$10, $$2));
      this.w(this.a(this.dL(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azk.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bwj<? extends bxb> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      iu $$5 = $$3.e();
      return bwi.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(diq $$0, bwi $$1) {
      return true;
   }

   public boolean a(dis $$0) {
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

   public cys aj() {
      return this.a(bwk.g);
   }

   public boolean ak() {
      return this.d(bwk.h);
   }

   public boolean fW() {
      return this.d(bwk.g);
   }

   public void i(cys $$0) {
      this.b(bwk.g, $$0);
   }

   @Override
   public cys a(bwk $$0) {
      return this.bL.a($$0);
   }

   @Override
   public void a(bwk $$0, cys $$1) {
      this.d($$1);
      cys $$2 = this.bL.a($$0, $$1);
      this.a($$0, $$2, $$1);
   }

   public btr h(final bwk $$0) {
      return new ffi() {
         @Override
         public cys f() {
            return bxb.this.a($$0);
         }

         @Override
         public void b(cys $$0x) {
            bxb.this.a($$0, $$0);
            if (!$$0.f()) {
               bxb.this.g($$0);
               bxb.this.fY();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(cqs $$0x) {
            return $$0.dk() == bxb.this || $$0.b(bxb.this, 4.0);
         }
      };
   }

   @Override
   protected void a(aro $$0, bup $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bwk $$3 : bwk.j) {
         cys $$4 = this.a($$3);
         float $$5 = this.bM.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bM.c($$3);
            bwa var11 = $$1.d();
            if (var11 instanceof bwz) {
               bwz $$7 = (bwz)var11;
               if (this.dV() instanceof aro $$8) {
                  $$5 = dfh.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dfh.a($$4, dfg.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, cys.k);
            }
         }
      }
   }

   public bvy fX() {
      return this.bM;
   }

   public void b(aro $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bwk> a(aro $$0, Predicate<cys> $$1) {
      Set<bwk> $$2 = new HashSet<>();

      for (bwk $$3 : bwk.j) {
         cys $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bM.c($$3)) {
               this.a($$3, cys.k);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private eyq g(aro $$0) {
      return new eyq.a($$0).a(fbh.f, this.dt()).a(fbh.a, this).a(fbg.h);
   }

   public void a(bwm $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(ald<eys> $$0, Map<bwk, Float> $$1) {
      if (this.dV() instanceof aro $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azt $$0, btw $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().an() == btv.d ? 0.1F : 0.25F;
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

         for (bwk $$5 : bG) {
            cys $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cyo $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cys($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cyo a(bwk $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cyw.qh;
            } else if ($$1 == 1) {
               return cyw.qx;
            } else if ($$1 == 2) {
               return cyw.ql;
            } else if ($$1 == 3) {
               return cyw.qp;
            } else if ($$1 == 4) {
               return cyw.qt;
            }
         case e:
            if ($$1 == 0) {
               return cyw.qi;
            } else if ($$1 == 1) {
               return cyw.qy;
            } else if ($$1 == 2) {
               return cyw.qm;
            } else if ($$1 == 3) {
               return cyw.qq;
            } else if ($$1 == 4) {
               return cyw.qu;
            }
         case d:
            if ($$1 == 0) {
               return cyw.qj;
            } else if ($$1 == 1) {
               return cyw.qz;
            } else if ($$1 == 2) {
               return cyw.qn;
            } else if ($$1 == 3) {
               return cyw.qr;
            } else if ($$1 == 4) {
               return cyw.qv;
            }
         case c:
            if ($$1 == 0) {
               return cyw.qk;
            } else if ($$1 == 1) {
               return cyw.qA;
            } else if ($$1 == 2) {
               return cyw.qo;
            } else if ($$1 == 3) {
               return cyw.qs;
            } else if ($$1 == 4) {
               return cyw.qw;
            }
         default:
            return null;
      }
   }

   protected void a(djg $$0, azt $$1, btw $$2) {
      this.b($$0, $$1, $$2);

      for (bwk $$3 : bwk.j) {
         if ($$3.a() == bwk.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(djg $$0, azt $$1, btw $$2) {
      this.a($$0, bwk.a, $$1, 0.25F, $$2);
   }

   protected void a(djg $$0, azt $$1, bwk $$2, btw $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(djg $$0, bwk $$1, azt $$2, float $$3, btw $$4) {
      cys $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dfh.a($$5, $$0.F_(), dgt.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      byb $$5 = Objects.requireNonNull(this.g(byf.m));
      if (!$$5.b(bv)) {
         $$5.d(new byd(bv, $$4.a(0.0, 0.11485000000000001), byd.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fY() {
      this.bO = true;
   }

   @Override
   public void a(bwk $$0, float $$1) {
      this.bM = this.bM.a($$0, $$1);
   }

   @Override
   public boolean fM() {
      return this.bN;
   }

   public void a_(boolean $$0) {
      this.bN = $$0;
   }

   @Override
   protected boolean f(bwk $$0) {
      return this.fM();
   }

   public boolean fZ() {
      return this.bO;
   }

   @Override
   public final bty a(cqs $$0, btx $$1) {
      if (!this.bK()) {
         return bty.e;
      } else {
         bty $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(eeo.r, $$0);
            return $$2;
         } else {
            bty $$3 = super.a($$0, $$1);
            if ($$3 != bty.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(eeo.r, $$0);
                  return $$2;
               } else {
                  return bty.e;
               }
            }
         }
      }
   }

   private bty c(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.vP)) {
         bty $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof czz) {
         if (this.dV() instanceof aro) {
            czz $$4 = (czz)$$2.h();
            Optional<bxb> $$5 = $$4.a($$0, this, (bwj<? extends bxb>)this.aq(), (aro)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bty.e;
            }
         }

         return bty.b;
      } else {
         return bty.e;
      }
   }

   protected void a(cqs $$0, bxb $$1) {
   }

   protected bty b(cqs $$0, btx $$1) {
      return bty.e;
   }

   public boolean ga() {
      return this.a(this.dv());
   }

   public boolean a(iu $$0) {
      return this.bU == -1.0F ? true : this.bT.j($$0) < (double)(this.bU * this.bU);
   }

   public void a(iu $$0, int $$1) {
      this.bT = $$0;
      this.bU = (float)$$1;
   }

   public iu gb() {
      return this.bT;
   }

   public float gc() {
      return this.bU;
   }

   public void gd() {
      this.bU = -1.0F;
   }

   public boolean ge() {
      return this.bU != -1.0F;
   }

   @Nullable
   public <T extends bxb> T a(bwj<T> $$0, bvu $$1, bwi $$2, bvu.a<T> $$3) {
      if (this.dQ()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dV(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dV() instanceof aro $$5) {
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
   public <T extends bxb> T a(bwj<T> $$0, bvu $$1, bvu.a<T> $$2) {
      return this.a($$0, $$1, bwi.i, $$2);
   }

   @Nullable
   @Override
   public bwx.a T_() {
      return this.bS;
   }

   @Override
   public void a(@Nullable bwx.a $$0) {
      this.bS = $$0;
   }

   @Override
   public void A() {
      if (this.T_() == null) {
         this.gd();
      }
   }

   @Override
   public void B() {
      bwx.super.B();
      this.bC.a(cdv.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cnl);
   }

   @Override
   public boolean a(bwa $$0, boolean $$1) {
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
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gf() {
      return (this.al.a(b) & 1) != 0;
   }

   public boolean gg() {
      return (this.al.a(b) & 2) != 0;
   }

   public boolean gh() {
      return (this.al.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bws fx() {
      return this.gg() ? bws.a : bws.b;
   }

   public boolean h(bwz $$0) {
      return this.gi().c($$0.eM());
   }

   protected fdr gi() {
      bwa $$0 = this.dk();
      fdr $$3;
      if ($$0 != null) {
         fdr $$1 = $$0.cR();
         fdr $$2 = this.cR();
         $$3 = new fdr(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bH, 0.0, bH);
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      float $$2 = (float)this.h(byf.c);
      cys $$3 = this.dZ();
      bup $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((bwz)this));
      $$2 = dfh.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bwz $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azk.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azk.b(this.dL() * (float) (Math.PI / 180.0))));
            this.i(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bwz $$8) {
            $$3.a($$8, this);
         }

         dfh.a($$0, $$1, $$4);
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
   protected void c(axp<evu> $$0) {
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

   public void c(Predicate<cdv> $$0) {
      this.bC.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();

      for (bwk $$0 : bwk.j) {
         cys $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public cys dI() {
      czz $$0 = czz.a(this.aq());
      return $$0 == null ? null : new cys($$0);
   }

   @Override
   protected void f(je<bya> $$0) {
      super.f($$0);
      if ($$0.a(byf.m) || $$0.a(byf.E)) {
         this.O().e();
      }
   }
}
