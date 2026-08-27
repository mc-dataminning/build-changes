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

public class cee extends cdz implements bmk, ceg {
   private static final Logger bZ = LogUtils.getLogger();
   private static final afz<cef> ca = agc.a(cee.class, agb.t);
   public static final int bV = 12;
   public static final Map<cmc, Integer> bW = ImmutableMap.of(cmk.pu, 4, cmk.tZ, 1, cmk.tY, 1, cmk.vd, 1);
   private static final int cb = 2;
   private static final Set<cmc> cc = ImmutableSet.of(cmk.pu, cmk.tZ, cmk.tY, cmk.pt, cmk.ps, cmk.vd, new cmc[]{cmk.ve, cmk.vb, cmk.vc});
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
   private cer cm;
   private boolean cn;
   private int co;
   private final but cp = new but();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<bux<?>> cx = ImmutableList.of(
      bux.b,
      bux.c,
      bux.d,
      bux.e,
      bux.g,
      bux.h,
      bux.i,
      bux.j,
      bux.k,
      bux.l,
      bux.K,
      bux.aO,
      new bux[]{bux.m, bux.n, bux.q, bux.r, bux.t, bux.v, bux.w, bux.x, bux.y, bux.A, bux.f, bux.C, bux.D, bux.E, bux.G, bux.H, bux.I, bux.F}
   );
   private static final ImmutableList<bwd<? extends bwc<? super cee>>> cy = ImmutableList.of(bwd.c, bwd.d, bwd.b, bwd.e, bwd.f, bwd.g, bwd.h, bwd.i, bwd.j);
   public static final Map<bux<id>, BiPredicate<cee, ie<bwz>>> bY = ImmutableMap.of(
      bux.b,
      (BiPredicate<cee, ie>)($$0, $$1) -> $$1.a(bxa.n),
      bux.c,
      (BiPredicate<cee, ie>)($$0, $$1) -> $$0.gp().b().b().test($$1),
      bux.d,
      (BiPredicate<cee, ie>)($$0, $$1) -> ceh.a.test($$1),
      bux.e,
      (BiPredicate<cee, ie>)($$0, $$1) -> $$1.a(bxa.o)
   );

   public cee(blj<? extends cee> $$0, csy $$1) {
      this($$0, $$1, cej.c);
   }

   public cee(blj<? extends cee> $$0, csy $$1, cej $$2) {
      super($$0, $$1);
      ((bve)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gp().a($$2).a(ceh.b));
   }

   @Override
   public bmv<cee> dO() {
      return (bmv<cee>)super.dO();
   }

   @Override
   protected bmv.b<cee> dP() {
      return bmv.a(cx, cy);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      bmv<cee> $$1 = this.dP().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(amp $$0) {
      bmv<cee> $$1 = this.dO();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dO());
   }

   private void a(bmv<cee> $$0) {
      ceh $$1 = this.gp().b();
      if (this.o_()) {
         $$0.a(cgf.e);
         $$0.a(cgd.d, bqs.a(0.5F));
      } else {
         $$0.a(cgf.f);
         $$0.a(cgd.c, bqs.b($$1, 0.5F), ImmutableSet.of(Pair.of(bux.c, buy.a)));
      }

      $$0.a(cgd.a, bqs.a($$1, 0.5F));
      $$0.a(cgd.f, bqs.d($$1, 0.5F), ImmutableSet.of(Pair.of(bux.e, buy.a)));
      $$0.a(cgd.e, bqs.c($$1, 0.5F));
      $$0.a(cgd.b, bqs.e($$1, 0.5F));
      $$0.a(cgd.g, bqs.f($$1, 0.5F));
      $$0.a(cgd.i, bqs.g($$1, 0.5F));
      $$0.a(cgd.h, bqs.h($$1, 0.5F));
      $$0.a(cgd.j, bqs.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cgd.a));
      $$0.b(cgd.b);
      $$0.a(cgd.b);
      $$0.a(this.dM().X(), this.dM().W());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dM() instanceof amp) {
         this.c((amp)this.dM());
      }
   }

   public static bna.a gn() {
      return blx.C().a(bnb.m, 0.5).a(bnb.g, 48.0);
   }

   public boolean go() {
      return this.cw;
   }

   @Override
   protected void Z() {
      this.dM().ae().a("villagerBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.gf() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gL();
               this.cl = false;
            }

            this.b(new bks(bku.j, 200, 0));
         }
      }

      if (this.cm != null && this.dM() instanceof amp) {
         ((amp)this.dM()).a(bwt.e, this.cm, this);
         this.dM().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fU() && this.ag.a(100) == 0) {
         cfz $$0 = ((amp)this.dM()).c(this.dm());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gp().b() == ceh.b && this.gf()) {
         this.gk();
      }

      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.u() > 0) {
         this.s(this.u() - 1);
      }

      this.gN();
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.a(cmk.tE) || !this.bx() || this.gf() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gA();
         return bjl.a(this.dM().B);
      } else {
         boolean $$3 = this.gg().isEmpty();
         if ($$1 == bjk.a) {
            if ($$3 && !this.dM().B) {
               this.gA();
            }

            $$0.a(arm.S);
         }

         if ($$3) {
            return bjl.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bjl.a(this.dM().B);
         }
      }
   }

   private void gA() {
      this.s(40);
      if (!this.dM().y_()) {
         this.a(arc.zL, this.eW(), this.eX());
      }
   }

   private void h(cer $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.Q_(), this.gp().c());
   }

   @Override
   public void f(@Nullable cer $$0) {
      boolean $$1 = this.ge() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gk();
      }
   }

   @Override
   protected void gk() {
      super.gk();
      this.gB();
   }

   private void gB() {
      for (crw $$0 : this.gg()) {
         $$0.l();
      }
   }

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public boolean gm() {
      return this.dM().B;
   }

   public void gr() {
      this.gG();

      for (crw $$0 : this.gg()) {
         $$0.h();
      }

      this.gC();
      this.ct = this.dM().W();
      this.cu++;
   }

   private void gC() {
      crx $$0 = this.gg();
      cer $$1 = this.ge();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.gp().c(), this.w(), this.gh(), this.gq());
      }
   }

   private boolean gD() {
      for (crw $$0 : this.gg()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gE() {
      return this.cu == 0 || this.cu < 2 && this.dM().W() > this.ct + 2400L;
   }

   public boolean gs() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dM().W();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dM().X();
      if (this.cv > 0L) {
         long $$4 = this.cv / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cv = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gO();
      }

      return this.gE() && this.gD();
   }

   private void gF() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (crw $$1 : this.gg()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gG();
      }

      this.gC();
   }

   private void gG() {
      for (crw $$0 : this.gg()) {
         $$0.e();
      }
   }

   private void i(cer $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (crw $$2 : this.gg()) {
            $$2.a(-aty.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bku.F)) {
         bks $$3 = $$0.b(bku.F);
         int $$4 = $$3.e();

         for (crw $$5 : this.gg()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, new cef(cej.c, ceh.b, 1));
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      cef.c.encodeStart(sx.a, this.gp()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(sx.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cef> $$1 = cef.c.parse(new Dynamic(sx.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new crx($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      sp $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(sx.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dM() instanceof amp) {
         this.c((amp)this.dM());
      }

      this.cu = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cw = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected arb y() {
      if (this.fD()) {
         return null;
      } else {
         return this.gf() ? arc.zM : arc.zH;
      }
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.zK;
   }

   @Override
   protected arb n_() {
      return arc.zJ;
   }

   public void gt() {
      arb $$0 = this.gp().b().f();
      if ($$0 != null) {
         this.a($$0, this.eW(), this.eX());
      }
   }

   @Override
   public void a(cef $$0) {
      cef $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cef gp() {
      return this.an.b(ca);
   }

   @Override
   protected void b(crw $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.ge();
      if (this.gK()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dM().b(new bll(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gu() {
      return this.cn;
   }

   @Override
   public void a(@Nullable blv $$0) {
      if ($$0 != null && this.dM() instanceof amp) {
         ((amp)this.dM()).a(bwt.c, $$0, this);
         if (this.bx() && $$0 instanceof cer) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bkd $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      blf $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gH();
      super.a($$0);
   }

   private void gH() {
      this.a(bux.b);
      this.a(bux.c);
      this.a(bux.d);
      this.a(bux.e);
   }

   private void a(blf $$0) {
      if (this.dM() instanceof amp $$1) {
         Optional<buz> $$3 = this.bz.c(bux.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bmk.class::isInstance).forEach($$2x -> $$1.a(bwt.d, $$0, (bmk)$$2x));
         }
      }
   }

   public void a(bux<id> $$0) {
      if (this.dM() instanceof amp) {
         MinecraftServer $$1 = ((amp)this.dM()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            amp $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bww $$4 = $$3.x();
               Optional<ie<bwz>> $$5 = $$4.c($$2.b());
               BiPredicate<cee, ie<bwz>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  acv.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.co + this.gM() >= 12 && !this.fD() && this.h() == 0;
   }

   private boolean gI() {
      return this.co < 12;
   }

   private void gJ() {
      if (this.gI() && this.gM() != 0) {
         for (int $$0 = 0; $$0 < this.A().b(); $$0++) {
            cmh $$1 = this.A().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.A().a($$0, 1);
                     if (!this.gI()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cer $$0) {
      return this.cp.a($$0.cw(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gv() {
      this.gJ();
      this.v(12);
   }

   public void b(crx $$0) {
      this.bU = $$0;
   }

   private boolean gK() {
      int $$0 = this.gp().c();
      return cef.d($$0) && this.cs >= cef.c($$0);
   }

   private void gL() {
      this.a(this.gp().a(this.gp().c() + 1));
      this.gl();
   }

   @Override
   protected vb co() {
      return vb.c(this.ai().g() + "." + kb.z.b(this.gp().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(jv.O);
      } else if ($$0 == 13) {
         this.a(jv.b);
      } else if ($$0 == 14) {
         this.a(jv.M);
      } else if ($$0 == 42) {
         this.a(jv.aj);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if ($$2 == blz.e) {
         this.a(this.gp().a(ceh.b));
      }

      if ($$2 == blz.n || $$2 == blz.m || blz.a($$2) || $$2 == blz.o) {
         this.a(this.gp().a(cej.a($$0.s(this.dm()))));
      }

      if ($$2 == blz.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cee b(amp $$0, bla $$1) {
      double $$2 = this.ag.j();
      cej $$3;
      if ($$2 < 0.5) {
         $$3 = cej.a($$0.s(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gp().a();
      } else {
         $$3 = ((cee)$$1).gp().a();
      }

      cee $$6 = new cee(blj.bg, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), blz.e, null, null);
      return $$6;
   }

   @Override
   public void a(amp $$0, blu $$1) {
      if ($$0.aj() != bji.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         ccp $$2 = blj.bl.a((csy)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), blz.i, null, null);
            $$2.t(this.fU());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fJ();
            $$0.a_($$2);
            this.gH();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cbe $$0) {
      cec.a(this, this, $$0);
   }

   @Override
   public boolean k(cmh $$0) {
      cmc $$1 = $$0.d();
      return (cc.contains($$1) || this.gp().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gw() {
      return this.gM() >= 24;
   }

   public boolean gx() {
      return this.gM() < 12;
   }

   private int gM() {
      bjt $$0 = this.A();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gy() {
      return this.A().a_($$0 -> $$0.a(arz.aU));
   }

   @Override
   protected void gl() {
      cef $$0 = this.gp();
      Int2ObjectMap<cei.g[]> $$2;
      if (this.dM().H().b(chd.d)) {
         Int2ObjectMap<cei.g[]> $$1 = cei.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cei.a.get($$0.b());
      } else {
         $$2 = cei.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cei.g[] $$4 = (cei.g[])$$2.get($$0.c());
         if ($$4 != null) {
            crx $$5 = this.gg();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(amp $$0, cee $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gN() {
      long $$0 = this.dM().W();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(amp $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ekw $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cee> $$4 = $$0.a(cee.class, $$3);
         List<cee> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!aur.a(blj.ad, blz.f, $$0, this.dm(), 10, 8, 6, aur.a.a).isEmpty()) {
               $$4.forEach(bvp::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().W()) ? false : !this.bz.a(bux.F);
   }

   @Override
   public void a(bwt $$0, blf $$1) {
      if ($$0 == bwt.a) {
         this.cp.a($$1.cw(), buu.d, 20);
         this.cp.a($$1.cw(), buu.c, 25);
      } else if ($$0 == bwt.e) {
         this.cp.a($$1.cw(), buu.e, 2);
      } else if ($$0 == bwt.c) {
         this.cp.a($$1.cw(), buu.b, 25);
      } else if ($$0 == bwt.d) {
         this.cp.a($$1.cw(), buu.a, 25);
      }
   }

   @Override
   public int w() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gO() {
      this.gF();
      this.cu = 0;
   }

   public but gz() {
      return this.cp;
   }

   public void a(tg $$0) {
      this.cp.a(new Dynamic(sx.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   @Override
   public void b(hv $$0) {
      super.b($$0);
      this.bz.a(bux.G, this.dM().W());
      this.bz.b(bux.m);
      this.bz.b(bux.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(bux.H, this.dM().W());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bux.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
