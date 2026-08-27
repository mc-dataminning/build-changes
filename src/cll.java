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
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cll extends clg implements btc, cln {
   private static final Logger cn = LogUtils.getLogger();
   private static final ajy<clm> co = akc.a(cll.class, aka.u);
   public static final int cj = 12;
   public static final Map<cuc, Integer> ck = ImmutableMap.of(cuk.qQ, 4, cuk.vI, 1, cuk.vH, 1, cuk.wV, 1);
   private static final int cp = 2;
   private static final Set<cuc> cq = ImmutableSet.of(cuk.qQ, cuk.vI, cuk.vH, cuk.qP, cuk.qO, cuk.wV, new cuc[]{cuk.wW, cuk.wT, cuk.wU});
   private static final int cr = 10;
   private static final int cs = 1200;
   private static final int ct = 24000;
   private static final int cu = 25;
   private static final int cv = 10;
   private static final int cw = 5;
   private static final long cx = 24000L;
   @VisibleForTesting
   public static final float cl = 0.5F;
   private int cy;
   private boolean cz;
   @Nullable
   private cly cA;
   private boolean cB;
   private int cC;
   private final cbn cD = new cbn();
   private long cE;
   private long cF;
   private int cG;
   private long cH;
   private int cI;
   private long cJ;
   private boolean cK;
   private static final ImmutableList<cbr<?>> cL = ImmutableList.of(
      cbr.b,
      cbr.c,
      cbr.d,
      cbr.e,
      cbr.g,
      cbr.h,
      cbr.i,
      cbr.j,
      cbr.k,
      cbr.l,
      cbr.L,
      cbr.aP,
      new cbr[]{cbr.m, cbr.n, cbr.q, cbr.r, cbr.t, cbr.v, cbr.w, cbr.x, cbr.y, cbr.A, cbr.f, cbr.C, cbr.D, cbr.E, cbr.H, cbr.I, cbr.J, cbr.F}
   );
   private static final ImmutableList<ccy<? extends ccx<? super cll>>> cM = ImmutableList.of(ccy.c, ccy.d, ccy.b, ccy.e, ccy.f, ccy.g, ccy.h, ccy.i, ccy.j);
   public static final Map<cbr<iz>, BiPredicate<cll, ja<cdu>>> cm = ImmutableMap.of(
      cbr.b,
      (BiPredicate<cll, ja>)($$0, $$1) -> $$1.a(cdv.n),
      cbr.c,
      (BiPredicate<cll, ja>)($$0, $$1) -> $$0.gL().b().b().test($$1),
      cbr.d,
      (BiPredicate<cll, ja>)($$0, $$1) -> clo.a.test($$1),
      cbr.e,
      (BiPredicate<cll, ja>)($$0, $$1) -> $$1.a(cdv.o)
   );

   public cll(bsb<? extends cll> $$0, dca $$1) {
      this($$0, $$1, clq.c);
   }

   public cll(bsb<? extends cll> $$0, dca $$1, clq $$2) {
      super($$0, $$1);
      ((cby)this.J()).b(true);
      this.J().a(true);
      this.a_(true);
      this.a(this.gL().a($$2).a(clo.b));
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   public btp<cll> dZ() {
      return (btp<cll>)super.dZ();
   }

   @Override
   protected btp.b<cll> ea() {
      return btp.a(cL, cM);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      btp<cll> $$1 = this.ea().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(aqt $$0) {
      btp<cll> $$1 = this.dZ();
      $$1.b($$0, this);
      this.bO = $$1.i();
      this.a(this.dZ());
   }

   private void a(btp<cll> $$0) {
      clo $$1 = this.gL().b();
      if (this.o_()) {
         $$0.a(cns.e);
         $$0.a(cnq.d, bxm.a(0.5F));
      } else {
         $$0.a(cns.f);
         $$0.a(cnq.c, bxm.b($$1, 0.5F), ImmutableSet.of(Pair.of(cbr.c, cbs.a)));
      }

      $$0.a(cnq.a, bxm.a($$1, 0.5F));
      $$0.a(cnq.f, bxm.d($$1, 0.5F), ImmutableSet.of(Pair.of(cbr.e, cbs.a)));
      $$0.a(cnq.e, bxm.c($$1, 0.5F));
      $$0.a(cnq.b, bxm.e($$1, 0.5F));
      $$0.a(cnq.g, bxm.f($$1, 0.5F));
      $$0.a(cnq.i, bxm.g($$1, 0.5F));
      $$0.a(cnq.h, bxm.h($$1, 0.5F));
      $$0.a(cnq.j, bxm.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cnq.a));
      $$0.b(cnq.b);
      $$0.a(cnq.b);
      $$0.a(this.dU().aa(), this.dU().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dU() instanceof aqt) {
         this.a((aqt)this.dU());
      }
   }

   public static btu.a gH() {
      return bsq.A().a(btv.r, 0.5).a(btv.k, 48.0);
   }

   public boolean gI() {
      return this.cK;
   }

   @Override
   protected void Y() {
      this.dU().ag().a("villagerBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      if (this.cK) {
         this.cK = false;
      }

      if (!this.gz() && this.cy > 0) {
         this.cy--;
         if (this.cy <= 0) {
            if (this.cz) {
               this.hf();
               this.cz = false;
            }

            this.b(new brh(brj.j, 200, 0));
         }
      }

      if (this.cA != null && this.dU() instanceof aqt) {
         ((aqt)this.dU()).a(cdo.e, this.cA, this);
         this.dU().a(this, (byte)14);
         this.cA = null;
      }

      if (!this.go() && this.al.a(100) == 0) {
         cnm $$0 = ((aqt)this.dU()).d(this.du());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dU().a(this, (byte)42);
         }
      }

      if (this.gL().b() == clo.b && this.gz()) {
         this.gE();
      }

      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.r() > 0) {
         this.u(this.r() - 1);
      }

      this.hh();
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.vk) || !this.bI() || this.gz() || this.fU()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gU();
         return bqa.a(this.dU().C);
      } else {
         boolean $$3 = this.gA().isEmpty();
         if ($$1 == bpz.a) {
            if ($$3 && !this.dU().C) {
               this.gU();
            }

            $$0.a(avz.S);
         }

         if ($$3) {
            return bqa.a(this.dU().C);
         } else {
            if (!this.dU().C && !this.ci.isEmpty()) {
               this.h($$0);
            }

            return bqa.a(this.dU().C);
         }
      }
   }

   private void gU() {
      this.u(40);
      if (!this.dU().x_()) {
         this.b(avo.Bq);
      }
   }

   private void h(cly $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.P_(), this.gL().c());
   }

   @Override
   public void f(@Nullable cly $$0) {
      boolean $$1 = this.gy() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gE();
      }
   }

   @Override
   protected void gE() {
      super.gE();
      this.gV();
   }

   private void gV() {
      for (day $$0 : this.gA()) {
         $$0.n();
      }
   }

   @Override
   public boolean gJ() {
      return true;
   }

   @Override
   public boolean gG() {
      return this.dU().C;
   }

   public void gK() {
      this.ha();

      for (day $$0 : this.gA()) {
         $$0.j();
      }

      this.gW();
      this.cH = this.dU().Z();
      this.cI++;
   }

   private void gW() {
      daz $$0 = this.gA();
      cly $$1 = this.gy();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cq.j, $$0, this.gL().c(), this.t(), this.gB(), this.gJ());
      }
   }

   private boolean gX() {
      for (day $$0 : this.gA()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gY() {
      return this.cI == 0 || this.cI < 2 && this.dU().Z() > this.cH + 2400L;
   }

   public boolean gM() {
      long $$0 = this.cH + 12000L;
      long $$1 = this.dU().Z();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dU().aa();
      if (this.cJ > 0L) {
         long $$4 = this.cJ / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cJ = $$3;
      if ($$2) {
         this.cH = $$1;
         this.hi();
      }

      return this.gY() && this.gX();
   }

   private void gZ() {
      int $$0 = 2 - this.cI;
      if ($$0 > 0) {
         for (day $$1 : this.gA()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.ha();
      }

      this.gW();
   }

   private void ha() {
      for (day $$0 : this.gA()) {
         $$0.g();
      }
   }

   private void i(cly $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (day $$2 : this.gA()) {
            $$2.a(-aym.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(brj.F)) {
         brh $$3 = $$0.c(brj.F);
         int $$4 = $$3.e();

         for (day $$5 : this.gA()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().G());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(co, new clm(clq.c, clo.b, 1));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      clm.c.encodeStart(uy.a, this.gL()).resultOrPartial(cn::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cC);
      $$0.a("Gossips", this.cD.a(uy.a));
      $$0.a("Xp", this.cG);
      $$0.a("LastRestock", this.cH);
      $$0.a("LastGossipDecay", this.cF);
      $$0.a("RestocksToday", this.cI);
      if (this.cK) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         clm.c.parse(uy.a, $$0.c("VillagerData")).resultOrPartial(cn::error).ifPresent($$0x -> this.as.a(co, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cC = $$0.f("FoodLevel");
      }

      uq $$1 = $$0.c("Gossips", 10);
      this.cD.a(new Dynamic(uy.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cG = $$0.h("Xp");
      }

      this.cH = $$0.i("LastRestock");
      this.cF = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dU() instanceof aqt) {
         this.a((aqt)this.dU());
      }

      this.cI = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cK = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected avn u() {
      if (this.fU()) {
         return null;
      } else {
         return this.gz() ? avo.Br : avo.Bm;
      }
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.Bp;
   }

   @Override
   protected avn n_() {
      return avo.Bo;
   }

   public void gN() {
      this.b(this.gL().b().f());
   }

   @Override
   public void a(clm $$0) {
      clm $$1 = this.gL();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.as.a(co, $$0);
   }

   @Override
   public clm gL() {
      return this.as.a(co);
   }

   @Override
   protected void b(day $$0) {
      int $$1 = 3 + this.al.a(4);
      this.cG = this.cG + $$0.q();
      this.cA = this.gy();
      if (this.he()) {
         this.cy = 40;
         this.cz = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dU().b(new bse(this.dU(), this.dz(), this.dB() + 0.5, this.dF(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cB = $$0;
   }

   public boolean gO() {
      return this.cB;
   }

   @Override
   public void a(@Nullable bso $$0) {
      if ($$0 != null && this.dU() instanceof aqt) {
         ((aqt)this.dU()).a(cdo.c, $$0, this);
         if (this.bI() && $$0 instanceof cly) {
            this.dU().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bqt $$0) {
      cn.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      brv $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.hb();
      super.a($$0);
   }

   private void hb() {
      this.a(cbr.b);
      this.a(cbr.c);
      this.a(cbr.d);
      this.a(cbr.e);
   }

   private void b(brv $$0) {
      if (this.dU() instanceof aqt $$1) {
         Optional<cbt> $$3 = this.bO.c(cbr.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(btc.class::isInstance).forEach($$2x -> $$1.a(cdo.d, $$0, (btc)$$2x));
         }
      }
   }

   public void a(cbr<iz> $$0) {
      if (this.dU() instanceof aqt) {
         MinecraftServer $$1 = ((aqt)this.dU()).o();
         this.bO.c($$0).ifPresent($$2 -> {
            aqt $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cdr $$4 = $$3.y();
               Optional<ja<cdu>> $$5 = $$4.c($$2.b());
               BiPredicate<cll, ja<cdu>> $$6 = cm.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agi.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.cC + this.hg() >= 12 && !this.fU() && this.g() == 0;
   }

   private boolean hc() {
      return this.cC < 12;
   }

   private void hd() {
      if (this.hc() && this.hg() != 0) {
         for (int $$0 = 0; $$0 < this.x().b(); $$0++) {
            cuh $$1 = this.x().a($$0);
            if (!$$1.d()) {
               Integer $$2 = ck.get($$1.f());
               if ($$2 != null) {
                  int $$3 = $$1.G();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cC = this.cC + $$2;
                     this.x().a($$0, 1);
                     if (!this.hc()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cly $$0) {
      return this.cD.a($$0.cE(), $$0x -> true);
   }

   private void x(int $$0) {
      this.cC -= $$0;
   }

   public void gP() {
      this.hd();
      this.x(12);
   }

   @Override
   public void b(daz $$0) {
      this.ci = $$0;
   }

   private boolean he() {
      int $$0 = this.gL().c();
      return clm.d($$0) && this.cG >= clm.c($$0);
   }

   private void hf() {
      this.a(this.gL().a(this.gL().c() + 1));
      this.gF();
   }

   @Override
   protected xe cw() {
      return xe.c(this.ak().g() + "." + lh.z.b(this.gL().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lb.O);
      } else if ($$0 == 13) {
         this.a(lb.a);
      } else if ($$0 == 14) {
         this.a(lb.M);
      } else if ($$0 == 42) {
         this.a(lb.ak);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if ($$2 == bss.e) {
         this.a(this.gL().a(clo.b));
      }

      if ($$2 == bss.n || $$2 == bss.m || bss.a($$2) || $$2 == bss.o) {
         this.a(this.gL().a(clq.a($$0.t(this.du()))));
      }

      if ($$2 == bss.d) {
         this.cK = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cll b(aqt $$0, brp $$1) {
      double $$2 = this.al.j();
      clq $$3;
      if ($$2 < 0.5) {
         $$3 = clq.a($$0.t(this.du()));
      } else if ($$2 < 0.75) {
         $$3 = this.gL().a();
      } else {
         $$3 = ((cll)$$1).gL().a();
      }

      cll $$6 = new cll(bsb.bn, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.du()), bss.e, null);
      return $$6;
   }

   @Override
   public void a(aqt $$0, bsn $$1) {
      if ($$0.al() != bpx.a) {
         cn.info("Villager {} was struck by lightning {}.", this, $$1);
         cju $$2 = bsb.bs.a((dca)$$0);
         if ($$2 != null) {
            $$2.b(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
            $$2.a($$0, $$0.d_($$2.du()), bss.i, null);
            $$2.t(this.go());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cJ());
            }

            $$2.gc();
            $$0.a_($$2);
            this.hb();
            this.ao();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cig $$0) {
      clj.a(this, this, $$0);
   }

   @Override
   public boolean k(cuh $$0) {
      cuc $$1 = $$0.f();
      return (cq.contains($$1) || this.gL().b().d().contains($$1)) && this.x().c($$0);
   }

   public boolean gQ() {
      return this.hg() >= 24;
   }

   public boolean gR() {
      return this.hg() < 12;
   }

   private int hg() {
      bqj $$0 = this.x();
      return ck.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gS() {
      return this.x().b($$0 -> $$0.a(awm.bz));
   }

   @Override
   protected void gF() {
      clm $$0 = this.gL();
      Int2ObjectMap<clp.g[]> $$2;
      if (this.dU().K().b(cor.d)) {
         Int2ObjectMap<clp.g[]> $$1 = clp.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : clp.a.get($$0.b());
      } else {
         $$2 = clp.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         clp.g[] $$4 = (clp.g[])$$2.get($$0.c());
         if ($$4 != null) {
            daz $$5 = this.gA();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqt $$0, cll $$1, long $$2) {
      if (($$2 < this.cE || $$2 >= this.cE + 1200L) && ($$2 < $$1.cE || $$2 >= $$1.cE + 1200L)) {
         this.cD.a($$1.cD, this.al, 10);
         this.cE = $$2;
         $$1.cE = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void hh() {
      long $$0 = this.dU().Z();
      if (this.cF == 0L) {
         this.cF = $$0;
      } else if ($$0 >= this.cF + 24000L) {
         this.cD.b();
         this.cF = $$0;
      }
   }

   public void a(aqt $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ewp $$3 = this.cP().c(10.0, 10.0, 10.0);
         List<cll> $$4 = $$0.a(cll.class, $$3);
         List<cll> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!aze.a(bsb.ah, bss.f, $$0, this.du(), 10, 8, 6, aze.a.a).isEmpty()) {
               $$4.forEach(ccj::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dU().Z()) ? false : !this.bO.a(cbr.F);
   }

   @Override
   public void a(cdo $$0, brv $$1) {
      if ($$0 == cdo.a) {
         this.cD.a($$1.cE(), cbo.d, 20);
         this.cD.a($$1.cE(), cbo.c, 25);
      } else if ($$0 == cdo.e) {
         this.cD.a($$1.cE(), cbo.e, 2);
      } else if ($$0 == cdo.c) {
         this.cD.a($$1.cE(), cbo.b, 25);
      } else if ($$0 == cdo.d) {
         this.cD.a($$1.cE(), cbo.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cG;
   }

   public void w(int $$0) {
      this.cG = $$0;
   }

   private void hi() {
      this.gZ();
      this.cI = 0;
   }

   public cbn gT() {
      return this.cD;
   }

   public void a(vh $$0) {
      this.cD.a(new Dynamic(uy.a, $$0));
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   @Override
   public void b(ir $$0) {
      super.b($$0);
      this.bO.a(cbr.H, this.dU().Z());
      this.bO.b(cbr.m);
      this.bO.b(cbr.E);
   }

   @Override
   public void fV() {
      super.fV();
      this.bO.a(cbr.I, this.dU().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bO.c(cbr.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
