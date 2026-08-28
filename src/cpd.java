import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cpd extends coy implements bwn, cpf {
   private static final Logger bL = LogUtils.getLogger();
   private static final ajx<cpe> bM = akb.a(cpd.class, ajz.u);
   public static final int bH = 12;
   public static final Map<cxd, Integer> bI = ImmutableMap.of(cxl.qe, 4, cxl.vh, 1, cxl.vg, 1, cxl.wm, 1);
   private static final int bN = 2;
   private static final int bO = 10;
   private static final int bP = 1200;
   private static final int bQ = 24000;
   private static final int bR = 10;
   private static final int bS = 5;
   private static final long bT = 24000L;
   @VisibleForTesting
   public static final float bJ = 0.5F;
   private int bU;
   private boolean bV;
   @Nullable
   private cpr bW;
   private boolean bX;
   private int bY;
   private final cey bZ = new cey();
   private long ca;
   private long cb;
   private int cc;
   private long cd;
   private int ce;
   private long cf;
   private boolean cg;
   private static final ImmutableList<cfc<?>> ch = ImmutableList.of(
      cfc.b,
      cfc.c,
      cfc.d,
      cfc.e,
      cfc.g,
      cfc.h,
      cfc.i,
      cfc.j,
      cfc.k,
      cfc.l,
      cfc.L,
      cfc.aP,
      new cfc[]{cfc.m, cfc.n, cfc.q, cfc.r, cfc.t, cfc.v, cfc.w, cfc.x, cfc.y, cfc.A, cfc.f, cfc.C, cfc.D, cfc.E, cfc.H, cfc.I, cfc.J, cfc.F}
   );
   private static final ImmutableList<cgj<? extends cgi<? super cpd>>> ci = ImmutableList.of(cgj.c, cgj.d, cgj.b, cgj.e, cgj.f, cgj.g, cgj.h, cgj.i, cgj.j);
   public static final Map<cfc<jq>, BiPredicate<cpd, jr<chf>>> bK = ImmutableMap.of(
      cfc.b,
      (BiPredicate<cpd, jr>)($$0, $$1) -> $$1.a(chg.n),
      cfc.c,
      (BiPredicate<cpd, jr>)($$0, $$1) -> $$0.gA().b().b().test($$1),
      cfc.d,
      (BiPredicate<cpd, jr>)($$0, $$1) -> cpg.a.test($$1),
      cfc.e,
      (BiPredicate<cpd, jr>)($$0, $$1) -> $$1.a(chg.o)
   );

   public cpd(bvi<? extends cpd> $$0, dgz $$1) {
      this($$0, $$1, cpi.c);
   }

   public cpd(bvi<? extends cpd> $$0, dgz $$1, cpi $$2) {
      super($$0, $$1);
      ((cfj)this.O()).b(true);
      this.O().a(true);
      this.O().a(48.0F);
      this.a_(true);
      this.a(this.gA().a($$2).a(cpg.b));
   }

   @Override
   public bxa<cpd> ea() {
      return (bxa<cpd>)super.ea();
   }

   @Override
   protected bxa.b<cpd> eb() {
      return bxa.a(ch, ci);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      bxa<cpd> $$1 = this.eb().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(ard $$0) {
      bxa<cpd> $$1 = this.ea();
      $$1.b($$0, this);
      this.bs = $$1.i();
      this.a(this.ea());
   }

   private void a(bxa<cpd> $$0) {
      cpg $$1 = this.gA().b();
      if (this.n_()) {
         $$0.a(crk.e);
         $$0.a(cri.d, cax.a(0.5F));
      } else {
         $$0.a(crk.f);
         $$0.a(cri.c, cax.b($$1, 0.5F), ImmutableSet.of(Pair.of(cfc.c, cfd.a)));
      }

      $$0.a(cri.a, cax.a($$1, 0.5F));
      $$0.a(cri.f, cax.d($$1, 0.5F), ImmutableSet.of(Pair.of(cfc.e, cfd.a)));
      $$0.a(cri.e, cax.c($$1, 0.5F));
      $$0.a(cri.b, cax.e($$1, 0.5F));
      $$0.a(cri.g, cax.f($$1, 0.5F));
      $$0.a(cri.i, cax.g($$1, 0.5F));
      $$0.a(cri.h, cax.h($$1, 0.5F));
      $$0.a(cri.j, cax.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.a(cri.b);
      $$0.a(this.dU().af(), this.dU().ae());
   }

   @Override
   protected void X_() {
      super.X_();
      if (this.dU() instanceof ard) {
         this.g((ard)this.dU());
      }
   }

   public static bxf.a gB() {
      return bwa.E().a(bxg.v, 0.5);
   }

   public boolean gC() {
      return this.cg;
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("villagerBrain");
      this.ea().a($$0, this);
      $$1.c();
      if (this.cg) {
         this.cg = false;
      }

      if (!this.gs() && this.bU > 0) {
         this.bU--;
         if (this.bU <= 0) {
            if (this.bV) {
               this.gX();
               this.bV = false;
            }

            this.a(new bue(bug.j, 200, 0));
         }
      }

      if (this.bW != null) {
         $$0.a(cgz.e, this.bW, this);
         $$0.a(this, (byte)14);
         this.bW = null;
      }

      if (!this.gh() && this.ae.a(100) == 0) {
         cre $$2 = $$0.d(this.du());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gA().b() == cpg.b && this.gs()) {
         this.gx();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.q() > 0) {
         this.r(this.q() - 1);
      }

      this.gZ();
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.uI) || !this.bJ() || this.gs() || this.fT()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gM();
         return bsy.a;
      } else {
         if (!this.dU().C) {
            boolean $$3 = this.gt().isEmpty();
            if ($$1 == bsx.a) {
               if ($$3) {
                  this.gM();
               }

               $$0.a(awk.S);
            }

            if ($$3) {
               return bsy.c;
            }

            this.g($$0);
         }

         return bsy.a;
      }
   }

   private void gM() {
      this.r(40);
      if (!this.dU().w_()) {
         this.b(awa.BU);
      }
   }

   private void g(cpr $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.m_(), this.gA().c());
   }

   @Override
   public void a(@Nullable cpr $$0) {
      boolean $$1 = this.x() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gx();
      }
   }

   @Override
   protected void gx() {
      super.gx();
      this.gN();
   }

   private void gN() {
      if (!this.dU().w_()) {
         for (dfx $$0 : this.gt()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gD() {
      return true;
   }

   public void gE() {
      this.gS();

      for (dfx $$0 : this.gt()) {
         $$0.j();
      }

      this.gO();
      this.cd = this.dU().ae();
      this.ce++;
   }

   private void gO() {
      dfy $$0 = this.gt();
      cpr $$1 = this.x();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bQ.l, $$0, this.gA().c(), this.t(), this.gu(), this.gD());
      }
   }

   private boolean gP() {
      for (dfx $$0 : this.gt()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gQ() {
      return this.ce == 0 || this.ce < 2 && this.dU().ae() > this.cd + 2400L;
   }

   public boolean gF() {
      long $$0 = this.cd + 12000L;
      long $$1 = this.dU().ae();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dU().af();
      if (this.cf > 0L) {
         long $$4 = this.cf / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cf = $$3;
      if ($$2) {
         this.cd = $$1;
         this.ha();
      }

      return this.gQ() && this.gP();
   }

   private void gR() {
      int $$0 = 2 - this.ce;
      if ($$0 > 0) {
         for (dfx $$1 : this.gt()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gS();
      }

      this.gO();
   }

   private void gS() {
      for (dfx $$0 : this.gt()) {
         $$0.g();
      }
   }

   private void h(cpr $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dfx $$2 : this.gt()) {
            $$2.a(-ayz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bug.F)) {
         bue $$3 = $$0.c(bug.F);
         int $$4 = $$3.e();

         for (dfx $$5 : this.gt()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bM, new cpe(cpi.c, cpg.b, 1));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      cpe.c.encodeStart(ue.a, this.gA()).resultOrPartial(bL::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.bY);
      $$0.a("Gossips", this.bZ.a(ue.a));
      $$0.a("Xp", this.cc);
      $$0.a("LastRestock", this.cd);
      $$0.a("LastGossipDecay", this.cb);
      $$0.a("RestocksToday", this.ce);
      if (this.cg) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cpe.c.parse(ue.a, $$0.c("VillagerData")).resultOrPartial(bL::error).ifPresent($$0x -> this.al.a(bM, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.bY = $$0.f("FoodLevel");
      }

      tw $$1 = $$0.c("Gossips", 10);
      this.bZ.a(new Dynamic(ue.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cc = $$0.h("Xp");
      }

      this.cd = $$0.i("LastRestock");
      this.cb = $$0.i("LastGossipDecay");
      if (this.dU() instanceof ard) {
         this.g((ard)this.dU());
      }

      this.ce = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cg = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected avz u() {
      if (this.fT()) {
         return null;
      } else {
         return this.gs() ? awa.BV : awa.BQ;
      }
   }

   @Override
   protected avz e(btp $$0) {
      return awa.BT;
   }

   @Override
   protected avz l_() {
      return awa.BS;
   }

   public void gG() {
      this.b(this.gA().b().f());
   }

   @Override
   public void a(cpe $$0) {
      cpe $$1 = this.gA();
      if ($$1.b() != $$0.b()) {
         this.bG = null;
      }

      this.al.a(bM, $$0);
   }

   @Override
   public cpe gA() {
      return this.al.a(bM);
   }

   @Override
   protected void b(dfx $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cc = this.cc + $$0.q();
      this.bW = this.x();
      if (this.gW()) {
         this.bU = 40;
         this.bV = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dU().b(new bvn(this.dU(), this.dz(), this.dB() + 0.5, this.dF(), $$1));
      }
   }

   @Override
   public void a(@Nullable bvy $$0) {
      if ($$0 != null && this.dU() instanceof ard) {
         ((ard)this.dU()).a(cgz.c, $$0, this);
         if (this.bJ() && $$0 instanceof cpr) {
            this.dU().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(btp $$0) {
      bL.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bva $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gT();
      super.a($$0);
   }

   private void gT() {
      this.a(cfc.b);
      this.a(cfc.c);
      this.a(cfc.d);
      this.a(cfc.e);
   }

   private void b(bva $$0) {
      if (this.dU() instanceof ard $$1) {
         Optional<cfe> $$3 = this.bs.c(cfc.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bwn.class::isInstance).forEach($$2x -> $$1.a(cgz.d, $$0, (bwn)$$2x));
         }
      }
   }

   public void a(cfc<jq> $$0) {
      if (this.dU() instanceof ard) {
         MinecraftServer $$1 = ((ard)this.dU()).p();
         this.bs.c($$0).ifPresent($$2 -> {
            ard $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               chc $$4 = $$3.A();
               Optional<jr<chf>> $$5 = $$4.c($$2.b());
               BiPredicate<cpd, jr<chf>> $$6 = bK.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agc.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean S_() {
      return this.bY + this.gY() >= 12 && !this.fT() && this.g() == 0;
   }

   private boolean gU() {
      return this.bY < 12;
   }

   private void gV() {
      if (this.gU() && this.gY() != 0) {
         for (int $$0 = 0; $$0 < this.n().b(); $$0++) {
            cxh $$1 = this.n().a($$0);
            if (!$$1.f()) {
               Integer $$2 = bI.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.bY = this.bY + $$2;
                     this.n().a($$0, 1);
                     if (!this.gU()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(cpr $$0) {
      return this.bZ.a($$0.cF(), $$0x -> true);
   }

   private void u(int $$0) {
      this.bY -= $$0;
   }

   public void gH() {
      this.gV();
      this.u(12);
   }

   @Override
   public void b(dfy $$0) {
      this.bG = $$0;
   }

   private boolean gW() {
      int $$0 = this.gA().c();
      return cpe.d($$0) && this.cc >= cpe.c($$0);
   }

   private void gX() {
      this.a(this.gA().a(this.gA().c() + 1));
      this.gy();
   }

   @Override
   protected wp cy() {
      return wp.c(this.aq().g() + "." + mb.x.b(this.gA().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lt.S);
      } else if ($$0 == 13) {
         this.a(lt.a);
      } else if ($$0 == 14) {
         this.a(lt.Q);
      } else if ($$0 == 42) {
         this.a(lt.ap);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$2 == bvh.e) {
         this.a(this.gA().a(cpg.b));
      }

      if ($$2 == bvh.n || $$2 == bvh.m || bvh.a($$2) || $$2 == bvh.o) {
         this.a(this.gA().a(cpi.a($$0.t(this.du()))));
      }

      if ($$2 == bvh.d) {
         this.cg = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cpd b(ard $$0, buq $$1) {
      double $$2 = this.ae.j();
      cpi $$3;
      if ($$2 < 0.5) {
         $$3 = cpi.a($$0.t(this.du()));
      } else if ($$2 < 0.75) {
         $$3 = this.gA().a();
      } else {
         $$3 = ((cpd)$$1).gA().a();
      }

      cpd $$6 = new cpd(bvi.bC, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.du()), bvh.e, null);
      return $$6;
   }

   @Override
   public void a(ard $$0, bvx $$1) {
      if ($$0.an() != bsv.a) {
         bL.info("Villager {} was struck by lightning {}.", this, $$1);
         cni $$2 = this.a(bvi.bH, buu.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.du()), bvh.i, null);
            $$1x.ga();
            this.gT();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ard $$0, clw $$1) {
      cpb.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(ard $$0, cxh $$1) {
      cxd $$2 = $$1.h();
      return ($$1.a(awy.bN) || this.gA().b().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gI() {
      return this.gY() >= 24;
   }

   public boolean gJ() {
      return this.gY() < 12;
   }

   private int gY() {
      btf $$0 = this.n();
      return bI.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gK() {
      return this.n().a_($$0 -> $$0.a(awy.bM));
   }

   @Override
   protected void gy() {
      cpe $$0 = this.gA();
      Int2ObjectMap<cph.g[]> $$2;
      if (this.dU().K().b(csp.b)) {
         Int2ObjectMap<cph.g[]> $$1 = cph.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cph.a.get($$0.b());
      } else {
         $$2 = cph.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cph.g[] $$4 = (cph.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dfy $$5 = this.gt();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ard $$0, cpd $$1, long $$2) {
      if (($$2 < this.ca || $$2 >= this.ca + 1200L) && ($$2 < $$1.ca || $$2 >= $$1.ca + 1200L)) {
         this.bZ.a($$1.bZ, this.ae, 10);
         this.ca = $$2;
         $$1.ca = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gZ() {
      long $$0 = this.dU().ae();
      if (this.cb == 0L) {
         this.cb = $$0;
      } else if ($$0 >= this.cb + 24000L) {
         this.bZ.b();
         this.cb = $$0;
      }
   }

   public void a(ard $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fbs $$3 = this.cQ().c(10.0, 10.0, 10.0);
         List<cpd> $$4 = $$0.a(cpd.class, $$3);
         List<cpd> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!azs.a(bvi.ap, bvh.f, $$0, this.du(), 10, 8, 6, azs.a.a, false).isEmpty()) {
               $$4.forEach(cfu::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dU().ae()) ? false : !this.bs.a(cfc.F);
   }

   @Override
   public void a(cgz $$0, bva $$1) {
      if ($$0 == cgz.a) {
         this.bZ.a($$1.cF(), cez.d, 20);
         this.bZ.a($$1.cF(), cez.c, 25);
      } else if ($$0 == cgz.e) {
         this.bZ.a($$1.cF(), cez.e, 2);
      } else if ($$0 == cgz.c) {
         this.bZ.a($$1.cF(), cez.b, 25);
      } else if ($$0 == cgz.d) {
         this.bZ.a($$1.cF(), cez.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cc;
   }

   public void t(int $$0) {
      this.cc = $$0;
   }

   private void ha() {
      this.gR();
      this.ce = 0;
   }

   public cey gL() {
      return this.bZ;
   }

   public void a(un $$0) {
      this.bZ.a(new Dynamic(ue.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   public void b(ji $$0) {
      super.b($$0);
      this.bs.a(cfc.H, this.dU().ae());
      this.bs.b(cfc.m);
      this.bs.b(cfc.E);
   }

   @Override
   public void fU() {
      super.fU();
      this.bs.a(cfc.I, this.dU().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bs.c(cfc.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
