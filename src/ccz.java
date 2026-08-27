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

public class ccz extends ccu implements bln, cdb {
   private static final Logger bZ = LogUtils.getLogger();
   private static final afm<cda> ca = afp.a(ccz.class, afo.t);
   public static final int bV = 12;
   public static final Map<ckw, Integer> bW = ImmutableMap.of(cle.oJ, 4, cle.tn, 1, cle.tm, 1, cle.ur, 1);
   private static final int cb = 2;
   private static final Set<ckw> cc = ImmutableSet.of(cle.oJ, cle.tn, cle.tm, cle.oI, cle.oH, cle.ur, new ckw[]{cle.us, cle.up, cle.uq});
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
   private cdm cm;
   private boolean cn;
   private int co;
   private final btv cp = new btv();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<btz<?>> cx = ImmutableList.of(
      btz.b,
      btz.c,
      btz.d,
      btz.e,
      btz.g,
      btz.h,
      btz.i,
      btz.j,
      btz.k,
      btz.l,
      btz.K,
      btz.aO,
      new btz[]{btz.m, btz.n, btz.q, btz.r, btz.t, btz.v, btz.w, btz.x, btz.y, btz.A, btz.f, btz.C, btz.D, btz.E, btz.G, btz.H, btz.I, btz.F}
   );
   private static final ImmutableList<bve<? extends bvd<? super ccz>>> cy = ImmutableList.of(bve.c, bve.d, bve.b, bve.e, bve.f, bve.g, bve.h, bve.i, bve.j);
   public static final Map<btz<ia>, BiPredicate<ccz, ib<bwa>>> bY = ImmutableMap.of(
      btz.b,
      (BiPredicate<ccz, ib>)($$0, $$1) -> $$1.a(bwb.n),
      btz.c,
      (BiPredicate<ccz, ib>)($$0, $$1) -> $$0.gp().b().b().test($$1),
      btz.d,
      (BiPredicate<ccz, ib>)($$0, $$1) -> cdc.a.test($$1),
      btz.e,
      (BiPredicate<ccz, ib>)($$0, $$1) -> $$1.a(bwb.o)
   );

   public ccz(bkm<? extends ccz> $$0, crs $$1) {
      this($$0, $$1, cde.c);
   }

   public ccz(bkm<? extends ccz> $$0, crs $$1, cde $$2) {
      super($$0, $$1);
      ((bug)this.L()).b(true);
      this.L().a(true);
      this.s(true);
      this.a(this.gp().a($$2).a(cdc.b));
   }

   @Override
   public bly<ccz> dN() {
      return (bly<ccz>)super.dN();
   }

   @Override
   protected bly.b<ccz> dO() {
      return bly.a(cx, cy);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      bly<ccz> $$1 = this.dO().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(ama $$0) {
      bly<ccz> $$1 = this.dN();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dN());
   }

   private void a(bly<ccz> $$0) {
      cdc $$1 = this.gp().b();
      if (this.n_()) {
         $$0.a(cez.e);
         $$0.a(cex.d, bpu.a(0.5F));
      } else {
         $$0.a(cez.f);
         $$0.a(cex.c, bpu.b($$1, 0.5F), ImmutableSet.of(Pair.of(btz.c, bua.a)));
      }

      $$0.a(cex.a, bpu.a($$1, 0.5F));
      $$0.a(cex.f, bpu.d($$1, 0.5F), ImmutableSet.of(Pair.of(btz.e, bua.a)));
      $$0.a(cex.e, bpu.c($$1, 0.5F));
      $$0.a(cex.b, bpu.e($$1, 0.5F));
      $$0.a(cex.g, bpu.f($$1, 0.5F));
      $$0.a(cex.i, bpu.g($$1, 0.5F));
      $$0.a(cex.h, bpu.h($$1, 0.5F));
      $$0.a(cex.j, bpu.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cex.a));
      $$0.b(cex.b);
      $$0.a(cex.b);
      $$0.a(this.dL().W(), this.dL().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dL() instanceof ama) {
         this.c((ama)this.dL());
      }
   }

   public static bmd.a gn() {
      return bla.A().a(bme.m, 0.5).a(bme.g, 48.0);
   }

   public boolean go() {
      return this.cw;
   }

   @Override
   protected void X() {
      this.dL().ad().a("villagerBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
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

            this.b(new bjv(bjx.j, 200, 0));
         }
      }

      if (this.cm != null && this.dL() instanceof ama) {
         ((ama)this.dL()).a(bvu.e, this.cm, this);
         this.dL().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fU() && this.ag.a(100) == 0) {
         cet $$0 = ((ama)this.dL()).c(this.dl());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dL().a(this, (byte)42);
         }
      }

      if (this.gp().b() == cdc.b && this.gf()) {
         this.gk();
      }

      super.X();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.s(this.s() - 1);
      }

      this.gN();
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.a(cle.sS) || !this.bv() || this.gf() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gA();
         return biq.a(this.dL().B);
      } else {
         boolean $$3 = this.gg().isEmpty();
         if ($$1 == bip.a) {
            if ($$3 && !this.dL().B) {
               this.gA();
            }

            $$0.a(aqx.S);
         }

         if ($$3) {
            return biq.a(this.dL().B);
         } else {
            if (!this.dL().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return biq.a(this.dL().B);
         }
      }
   }

   private void gA() {
      this.s(40);
      if (!this.dL().x_()) {
         this.a(aqn.yP, this.eV(), this.eW());
      }
   }

   private void h(cdm $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gp().c());
   }

   @Override
   public void f(@Nullable cdm $$0) {
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
      for (cqq $$0 : this.gg()) {
         $$0.l();
      }
   }

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public boolean gm() {
      return this.dL().B;
   }

   public void gr() {
      this.gG();

      for (cqq $$0 : this.gg()) {
         $$0.h();
      }

      this.gC();
      this.ct = this.dL().V();
      this.cu++;
   }

   private void gC() {
      cqr $$0 = this.gg();
      cdm $$1 = this.ge();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.gp().c(), this.t(), this.gh(), this.gq());
      }
   }

   private boolean gD() {
      for (cqq $$0 : this.gg()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gE() {
      return this.cu == 0 || this.cu < 2 && this.dL().V() > this.ct + 2400L;
   }

   public boolean gs() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dL().V();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dL().W();
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
         for (cqq $$1 : this.gg()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gG();
      }

      this.gC();
   }

   private void gG() {
      for (cqq $$0 : this.gg()) {
         $$0.e();
      }
   }

   private void i(cdm $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cqq $$2 : this.gg()) {
            $$2.a(-ati.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bjx.F)) {
         bjv $$3 = $$0.b(bjx.F);
         int $$4 = $$3.e();

         for (cqq $$5 : this.gg()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, new cda(cde.c, cdc.b, 1));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      cda.c.encodeStart(sn.a, this.gp()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(sn.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cda> $$1 = cda.c.parse(new Dynamic(sn.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cqr($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      sf $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(sn.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dL() instanceof ama) {
         this.c((ama)this.dL());
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
   protected aqm w() {
      if (this.fD()) {
         return null;
      } else {
         return this.gf() ? aqn.yQ : aqn.yL;
      }
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.yO;
   }

   @Override
   protected aqm m_() {
      return aqn.yN;
   }

   public void gt() {
      aqm $$0 = this.gp().b().f();
      if ($$0 != null) {
         this.a($$0, this.eV(), this.eW());
      }
   }

   @Override
   public void a(cda $$0) {
      cda $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cda gp() {
      return this.an.b(ca);
   }

   @Override
   protected void b(cqq $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.ge();
      if (this.gK()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dL().b(new bko(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gu() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bky $$0) {
      if ($$0 != null && this.dL() instanceof ama) {
         ((ama)this.dL()).a(bvu.c, $$0, this);
         if (this.bv() && $$0 instanceof cdm) {
            this.dL().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bjg $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bki $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gH();
      super.a($$0);
   }

   private void gH() {
      this.a(btz.b);
      this.a(btz.c);
      this.a(btz.d);
      this.a(btz.e);
   }

   private void a(bki $$0) {
      if (this.dL() instanceof ama $$1) {
         Optional<bub> $$3 = this.bz.c(btz.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bln.class::isInstance).forEach($$2x -> $$1.a(bvu.d, $$0, (bln)$$2x));
         }
      }
   }

   public void a(btz<ia> $$0) {
      if (this.dL() instanceof ama) {
         MinecraftServer $$1 = ((ama)this.dL()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            ama $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bvx $$4 = $$3.w();
               Optional<ib<bwa>> $$5 = $$4.c($$2.b());
               BiPredicate<ccz, ib<bwa>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aci.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean W_() {
      return this.co + this.gM() >= 12 && !this.fD() && this.h() == 0;
   }

   private boolean gI() {
      return this.co < 12;
   }

   private void gJ() {
      if (this.gI() && this.gM() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            clb $$1 = this.y().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.y().a($$0, 1);
                     if (!this.gI()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cdm $$0) {
      return this.cp.a($$0.cv(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gv() {
      this.gJ();
      this.v(12);
   }

   public void b(cqr $$0) {
      this.bU = $$0;
   }

   private boolean gK() {
      int $$0 = this.gp().c();
      return cda.d($$0) && this.cs >= cda.c($$0);
   }

   private void gL() {
      this.a(this.gp().a(this.gp().c() + 1));
      this.gl();
   }

   @Override
   protected ur cn() {
      return ur.c(this.ag().g() + "." + jy.A.b(this.gp().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(js.M);
      } else if ($$0 == 13) {
         this.a(js.b);
      } else if ($$0 == 14) {
         this.a(js.K);
      } else if ($$0 == 42) {
         this.a(js.ah);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      if ($$2 == blc.e) {
         this.a(this.gp().a(cdc.b));
      }

      if ($$2 == blc.n || $$2 == blc.m || $$2 == blc.c || $$2 == blc.o) {
         this.a(this.gp().a(cde.a($$0.s(this.dl()))));
      }

      if ($$2 == blc.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public ccz b(ama $$0, bkd $$1) {
      double $$2 = this.ag.j();
      cde $$3;
      if ($$2 < 0.5) {
         $$3 = cde.a($$0.s(this.dl()));
      } else if ($$2 < 0.75) {
         $$3 = this.gp().a();
      } else {
         $$3 = ((ccz)$$1).gp().a();
      }

      ccz $$6 = new ccz(bkm.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dl()), blc.e, null, null);
      return $$6;
   }

   @Override
   public void a(ama $$0, bkx $$1) {
      if ($$0.ai() != bin.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         cbq $$2 = bkm.bj.a((crs)$$0);
         if ($$2 != null) {
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.a($$0, $$0.d_($$2.dl()), blc.i, null, null);
            $$2.t(this.fU());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fJ();
            $$0.a_($$2);
            this.gH();
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(caf $$0) {
      ccx.a(this, this, $$0);
   }

   @Override
   public boolean k(clb $$0) {
      ckw $$1 = $$0.d();
      return (cc.contains($$1) || this.gp().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gw() {
      return this.gM() >= 24;
   }

   public boolean gx() {
      return this.gM() < 12;
   }

   private int gM() {
      bix $$0 = this.y();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gy() {
      return this.y().a_($$0 -> $$0.a(ark.aU));
   }

   @Override
   protected void gl() {
      cda $$0 = this.gp();
      Int2ObjectMap<cdd.g[]> $$2;
      if (this.dL().G().b(cfx.d)) {
         Int2ObjectMap<cdd.g[]> $$1 = cdd.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cdd.a.get($$0.b());
      } else {
         $$2 = cdd.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cdd.g[] $$4 = (cdd.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cqr $$5 = this.gg();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ama $$0, ccz $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gN() {
      long $$0 = this.dL().V();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(ama $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ejd $$3 = this.cG().c(10.0, 10.0, 10.0);
         List<ccz> $$4 = $$0.a(ccz.class, $$3);
         List<ccz> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!atz.a(bkm.ac, blc.f, $$0, this.dl(), 10, 8, 6, atz.a.a).isEmpty()) {
               $$4.forEach(buq::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dL().V()) ? false : !this.bz.a(btz.F);
   }

   @Override
   public void a(bvu $$0, bki $$1) {
      if ($$0 == bvu.a) {
         this.cp.a($$1.cv(), btw.d, 20);
         this.cp.a($$1.cv(), btw.c, 25);
      } else if ($$0 == bvu.e) {
         this.cp.a($$1.cv(), btw.e, 2);
      } else if ($$0 == bvu.c) {
         this.cp.a($$1.cv(), btw.b, 25);
      } else if ($$0 == bvu.d) {
         this.cp.a($$1.cv(), btw.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gO() {
      this.gF();
      this.cu = 0;
   }

   public btv gz() {
      return this.cp;
   }

   public void a(sw $$0) {
      this.cp.a(new Dynamic(sn.a, $$0));
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   @Override
   public void b(ht $$0) {
      super.b($$0);
      this.bz.a(btz.G, this.dL().V());
      this.bz.b(btz.m);
      this.bz.b(btz.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(btz.H, this.dL().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(btz.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
