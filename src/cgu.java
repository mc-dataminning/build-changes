import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
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

public class cgu extends cgp implements bou, cgw {
   private static final Logger bZ = LogUtils.getLogger();
   private static final aie<cgv> ca = aih.a(cgu.class, aig.t);
   public static final int bV = 12;
   public static final Map<cou, Integer> bW = ImmutableMap.of(cpc.pw, 4, cpc.uc, 1, cpc.ub, 1, cpc.vg, 1);
   private static final int cb = 2;
   private static final Set<cou> cc = ImmutableSet.of(cpc.pw, cpc.uc, cpc.ub, cpc.pv, cpc.pu, cpc.vg, new cou[]{cpc.vh, cpc.ve, cpc.vf});
   private static final int cd = 10;
   private static final int ce = 1200;
   private static final int cf = 24000;
   private static final int cg = 25;
   private static final int ch = 10;
   private static final int ci = 5;
   private static final long cj = 24000L;
   @VisibleForTesting
   public static final float bX = 0.5F;
   private int ck;
   private boolean cl;
   @Nullable
   private chh cm;
   private boolean cn;
   private int co;
   private final bxd cp = new bxd();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cw;
   private boolean cx;
   private static final ImmutableList<bxh<?>> cy = ImmutableList.of(
      bxh.b,
      bxh.c,
      bxh.d,
      bxh.e,
      bxh.g,
      bxh.h,
      bxh.i,
      bxh.j,
      bxh.k,
      bxh.l,
      bxh.L,
      bxh.aP,
      new bxh[]{bxh.m, bxh.n, bxh.q, bxh.r, bxh.t, bxh.v, bxh.w, bxh.x, bxh.y, bxh.A, bxh.f, bxh.C, bxh.D, bxh.E, bxh.H, bxh.I, bxh.J, bxh.F}
   );
   private static final ImmutableList<byo<? extends byn<? super cgu>>> cz = ImmutableList.of(byo.c, byo.d, byo.b, byo.e, byo.f, byo.g, byo.h, byo.i, byo.j);
   public static final Map<bxh<ii>, BiPredicate<cgu, ij<bzk>>> bY = ImmutableMap.of(
      bxh.b,
      (BiPredicate<cgu, ij>)($$0, $$1) -> $$1.a(bzl.n),
      bxh.c,
      (BiPredicate<cgu, ij>)($$0, $$1) -> $$0.gr().b().b().test($$1),
      bxh.d,
      (BiPredicate<cgu, ij>)($$0, $$1) -> cgx.a.test($$1),
      bxh.e,
      (BiPredicate<cgu, ij>)($$0, $$1) -> $$1.a(bzl.o)
   );

   public cgu(bnu<? extends cgu> $$0, cvn $$1) {
      this($$0, $$1, cgz.c);
   }

   public cgu(bnu<? extends cgu> $$0, cvn $$1, cgz $$2) {
      super($$0, $$1);
      ((bxo)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gr().a($$2).a(cgx.b));
   }

   @Override
   public bpf<cgu> dO() {
      return (bpf<cgu>)super.dO();
   }

   @Override
   protected bpf.b<cgu> dP() {
      return bpf.a(cy, cz);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      bpf<cgu> $$1 = this.dP().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aov $$0) {
      bpf<cgu> $$1 = this.dO();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dO());
   }

   private void a(bpf<cgu> $$0) {
      cgx $$1 = this.gr().b();
      if (this.o_()) {
         $$0.a(ciw.e);
         $$0.a(ciu.d, btc.a(0.5F));
      } else {
         $$0.a(ciw.f);
         $$0.a(ciu.c, btc.b($$1, 0.5F), ImmutableSet.of(Pair.of(bxh.c, bxi.a)));
      }

      $$0.a(ciu.a, btc.a($$1, 0.5F));
      $$0.a(ciu.f, btc.d($$1, 0.5F), ImmutableSet.of(Pair.of(bxh.e, bxi.a)));
      $$0.a(ciu.e, btc.c($$1, 0.5F));
      $$0.a(ciu.b, btc.e($$1, 0.5F));
      $$0.a(ciu.g, btc.f($$1, 0.5F));
      $$0.a(ciu.i, btc.g($$1, 0.5F));
      $$0.a(ciu.h, btc.h($$1, 0.5F));
      $$0.a(ciu.j, btc.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ciu.a));
      $$0.b(ciu.b);
      $$0.a(ciu.b);
      $$0.a(this.dM().Y(), this.dM().X());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dM() instanceof aov) {
         this.c((aov)this.dM());
      }
   }

   public static bpk.a gp() {
      return boi.C().a(bpl.o, 0.5).a(bpl.i, 48.0);
   }

   public boolean gq() {
      return this.cx;
   }

   @Override
   protected void aa() {
      this.dM().af().a("villagerBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      if (this.cx) {
         this.cx = false;
      }

      if (!this.gh() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gN();
               this.cl = false;
            }

            this.b(new bnb(bnd.j, 200, 0));
         }
      }

      if (this.cm != null && this.dM() instanceof aov) {
         ((aov)this.dM()).a(bze.e, this.cm, this);
         this.dM().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fW() && this.af.a(100) == 0) {
         ciq $$0 = ((aov)this.dM()).d(this.dm());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gr().b() == cgx.b && this.gh()) {
         this.gm();
      }

      super.aa();
   }

   @Override
   public void l() {
      super.l();
      if (this.u() > 0) {
         this.t(this.u() - 1);
      }

      this.gP();
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.tH) || !this.bx() || this.gh() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gC();
         return blu.a(this.dM().B);
      } else {
         boolean $$3 = this.gi().isEmpty();
         if ($$1 == blt.a) {
            if ($$3 && !this.dM().B) {
               this.gC();
            }

            $$0.a(atu.S);
         }

         if ($$3) {
            return blu.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return blu.a(this.dM().B);
         }
      }
   }

   private void gC() {
      this.t(40);
      if (!this.dM().y_()) {
         this.b(atk.Aa);
      }
   }

   private void h(chh $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.Q_(), this.gr().c());
   }

   @Override
   public void f(@Nullable chh $$0) {
      boolean $$1 = this.gg() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gm();
      }
   }

   @Override
   protected void gm() {
      super.gm();
      this.gD();
   }

   private void gD() {
      for (cul $$0 : this.gi()) {
         $$0.m();
      }
   }

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public boolean go() {
      return this.dM().B;
   }

   public void gt() {
      this.gI();

      for (cul $$0 : this.gi()) {
         $$0.h();
      }

      this.gE();
      this.ct = this.dM().X();
      this.cu++;
   }

   private void gE() {
      cum $$0 = this.gi();
      chh $$1 = this.gg();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bW.j, $$0, this.gr().c(), this.w(), this.gj(), this.gs());
      }
   }

   private boolean gF() {
      for (cul $$0 : this.gi()) {
         if ($$0.s()) {
            return true;
         }
      }

      return false;
   }

   private boolean gG() {
      return this.cu == 0 || this.cu < 2 && this.dM().X() > this.ct + 2400L;
   }

   public boolean gu() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dM().X();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dM().Y();
      if (this.cw > 0L) {
         long $$4 = this.cw / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cw = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gQ();
      }

      return this.gG() && this.gF();
   }

   private void gH() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (cul $$1 : this.gi()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gI();
      }

      this.gE();
   }

   private void gI() {
      for (cul $$0 : this.gi()) {
         $$0.e();
      }
   }

   private void i(chh $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cul $$2 : this.gi()) {
            $$2.a(-awh.d((float)$$1 * $$2.o()));
         }
      }

      if ($$0.a(bnd.F)) {
         bnb $$3 = $$0.c(bnd.F);
         int $$4 = $$3.d();

         for (cul $$5 : this.gi()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, new cgv(cgz.c, cgx.b, 1));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cgv.c.encodeStart(tk.a, this.gr()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(tk.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cx) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cgv> $$1 = cgv.c.parse(new Dynamic(tk.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cum($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      tc $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(tk.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dM() instanceof aov) {
         this.c((aov)this.dM());
      }

      this.cu = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cx = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected atj y() {
      if (this.fD()) {
         return null;
      } else {
         return this.gh() ? atk.Ab : atk.zW;
      }
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.zZ;
   }

   @Override
   protected atj n_() {
      return atk.zY;
   }

   public void gv() {
      this.b(this.gr().b().f());
   }

   @Override
   public void a(cgv $$0) {
      cgv $$1 = this.gr();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.am.b(ca, $$0);
   }

   @Override
   public cgv gr() {
      return this.am.b(ca);
   }

   @Override
   protected void b(cul $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cs = this.cs + $$0.p();
      this.cm = this.gg();
      if (this.gM()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.t()) {
         this.dM().b(new bnw(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gw() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bog $$0) {
      if ($$0 != null && this.dM() instanceof aov) {
         ((aov)this.dM()).a(bze.c, $$0, this);
         if (this.bx() && $$0 instanceof chh) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bmn $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bno $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gJ();
      super.a($$0);
   }

   private void gJ() {
      this.a(bxh.b);
      this.a(bxh.c);
      this.a(bxh.d);
      this.a(bxh.e);
   }

   private void a(bno $$0) {
      if (this.dM() instanceof aov $$1) {
         Optional<bxj> $$3 = this.bz.c(bxh.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bou.class::isInstance).forEach($$2x -> $$1.a(bze.d, $$0, (bou)$$2x));
         }
      }
   }

   public void a(bxh<ii> $$0) {
      if (this.dM() instanceof aov) {
         MinecraftServer $$1 = ((aov)this.dM()).o();
         this.bz.c($$0).ifPresent($$2 -> {
            aov $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bzh $$4 = $$3.y();
               Optional<ij<bzk>> $$5 = $$4.c($$2.b());
               BiPredicate<cgu, ij<bzk>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aep.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.co + this.gO() >= 12 && !this.fD() && this.h() == 0;
   }

   private boolean gK() {
      return this.co < 12;
   }

   private void gL() {
      if (this.gK() && this.gO() != 0) {
         for (int $$0 = 0; $$0 < this.A().b(); $$0++) {
            coz $$1 = this.A().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.A().a($$0, 1);
                     if (!this.gK()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(chh $$0) {
      return this.cp.a($$0.cw(), $$0x -> true);
   }

   private void w(int $$0) {
      this.co -= $$0;
   }

   public void gx() {
      this.gL();
      this.w(12);
   }

   public void b(cum $$0) {
      this.bU = $$0;
   }

   private boolean gM() {
      int $$0 = this.gr().c();
      return cgv.d($$0) && this.cs >= cgv.c($$0);
   }

   private void gN() {
      this.a(this.gr().a(this.gr().c() + 1));
      this.gn();
   }

   @Override
   protected vq co() {
      return vq.c(this.ai().g() + "." + kf.z.b(this.gr().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(jz.O);
      } else if ($$0 == 13) {
         this.a(jz.b);
      } else if ($$0 == 14) {
         this.a(jz.M);
      } else if ($$0 == 42) {
         this.a(jz.aj);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      if ($$2 == bok.e) {
         this.a(this.gr().a(cgx.b));
      }

      if ($$2 == bok.n || $$2 == bok.m || bok.a($$2) || $$2 == bok.o) {
         this.a(this.gr().a(cgz.a($$0.t(this.dm()))));
      }

      if ($$2 == bok.d) {
         this.cx = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cgu b(aov $$0, bnj $$1) {
      double $$2 = this.af.j();
      cgz $$3;
      if ($$2 < 0.5) {
         $$3 = cgz.a($$0.t(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gr().a();
      } else {
         $$3 = ((cgu)$$1).gr().a();
      }

      cgu $$6 = new cgu(bnu.bh, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), bok.e, null, null);
      return $$6;
   }

   @Override
   public void a(aov $$0, bof $$1) {
      if ($$0.ak() != blr.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         cfd $$2 = bnu.bm.a((cvn)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), bok.i, null, null);
            $$2.t(this.fW());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fL();
            $$0.a_($$2);
            this.gJ();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cds $$0) {
      cgs.a(this, this, $$0);
   }

   @Override
   public boolean k(coz $$0) {
      cou $$1 = $$0.d();
      return (cc.contains($$1) || this.gr().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gy() {
      return this.gO() >= 24;
   }

   public boolean gz() {
      return this.gO() < 12;
   }

   private int gO() {
      bmd $$0 = this.A();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gA() {
      return this.A().a_($$0 -> $$0.a(auh.aZ));
   }

   @Override
   protected void gn() {
      cgv $$0 = this.gr();
      Int2ObjectMap<cgy.g[]> $$2;
      if (this.dM().I().b(cju.d)) {
         Int2ObjectMap<cgy.g[]> $$1 = cgy.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cgy.a.get($$0.b());
      } else {
         $$2 = cgy.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cgy.g[] $$4 = (cgy.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cum $$5 = this.gi();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aov $$0, cgu $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.af, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gP() {
      long $$0 = this.dM().X();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(aov $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         enn $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cgu> $$4 = $$0.a(cgu.class, $$3);
         List<cgu> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!axa.a(bnu.ae, bok.f, $$0, this.dm(), 10, 8, 6, axa.a.a).isEmpty()) {
               $$4.forEach(bxz::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().X()) ? false : !this.bz.a(bxh.F);
   }

   @Override
   public void a(bze $$0, bno $$1) {
      if ($$0 == bze.a) {
         this.cp.a($$1.cw(), bxe.d, 20);
         this.cp.a($$1.cw(), bxe.c, 25);
      } else if ($$0 == bze.e) {
         this.cp.a($$1.cw(), bxe.e, 2);
      } else if ($$0 == bze.c) {
         this.cp.a($$1.cw(), bxe.b, 25);
      } else if ($$0 == bze.d) {
         this.cp.a($$1.cw(), bxe.a, 25);
      }
   }

   @Override
   public int w() {
      return this.cs;
   }

   public void v(int $$0) {
      this.cs = $$0;
   }

   private void gQ() {
      this.gH();
      this.cu = 0;
   }

   public bxd gB() {
      return this.cp;
   }

   public void a(tt $$0) {
      this.cp.a(new Dynamic(tk.a, $$0));
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public void b(hz $$0) {
      super.b($$0);
      this.bz.a(bxh.H, this.dM().X());
      this.bz.b(bxh.m);
      this.bz.b(bxh.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(bxh.I, this.dM().X());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bxh.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
