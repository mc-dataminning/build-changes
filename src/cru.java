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

public class cru extends crp implements byu, crw {
   private static final Logger bO = LogUtils.getLogger();
   private static final aku<crv> bP = aky.a(cru.class, akw.u);
   public static final int bK = 12;
   public static final Map<dag, Integer> bL = ImmutableMap.of(dao.ql, 4, dao.vq, 1, dao.vp, 1, dao.wv, 1);
   private static final int bQ = 2;
   private static final int bR = 10;
   private static final int bS = 1200;
   private static final int bT = 24000;
   private static final int bU = 10;
   private static final int bV = 5;
   private static final long bW = 24000L;
   @VisibleForTesting
   public static final float bM = 0.5F;
   private static final int bX = 0;
   private static final byte bY = 0;
   private static final int bZ = 0;
   private static final int ca = 0;
   private static final int cb = 0;
   private static final boolean cc = false;
   private int cd;
   private boolean ce;
   @Nullable
   private csi cf;
   private boolean cg;
   private int ch = 0;
   private final chd ci = new chd();
   private long cj;
   private long ck = 0L;
   private int cl = 0;
   private long cm = 0L;
   private int cn = 0;
   private long cq;
   private boolean cr = false;
   private static final ImmutableList<chh<?>> cs = ImmutableList.of(
      chh.b,
      chh.c,
      chh.d,
      chh.e,
      chh.g,
      chh.h,
      chh.i,
      chh.j,
      chh.k,
      chh.l,
      chh.M,
      chh.aQ,
      new chh[]{chh.n, chh.o, chh.r, chh.s, chh.u, chh.w, chh.x, chh.y, chh.z, chh.B, chh.f, chh.D, chh.E, chh.F, chh.I, chh.J, chh.K, chh.G}
   );
   private static final ImmutableList<cio<? extends cin<? super cru>>> ct = ImmutableList.of(cio.c, cio.d, cio.b, cio.e, cio.f, cio.g, cio.h, cio.i, cio.j);
   public static final Map<chh<jf>, BiPredicate<cru, jg<cjk>>> bN = ImmutableMap.of(
      chh.b,
      (BiPredicate<cru, jg>)($$0, $$1) -> $$1.a(cjl.n),
      chh.c,
      (BiPredicate<cru, jg>)($$0, $$1) -> $$0.gF().b().a().b().test($$1),
      chh.d,
      (BiPredicate<cru, jg>)($$0, $$1) -> crx.a.test($$1),
      chh.e,
      (BiPredicate<cru, jg>)($$0, $$1) -> $$1.a(cjl.o)
   );

   public cru(bxn<? extends cru> $$0, dkj $$1) {
      this($$0, $$1, crz.c);
   }

   public cru(bxn<? extends cru> $$0, dkj $$1, alq<crz> $$2) {
      this($$0, $$1, $$1.J_().d($$2));
   }

   public cru(bxn<? extends cru> $$0, dkj $$1, jg<crz> $$2) {
      super($$0, $$1);
      ((cho)this.N()).b(true);
      this.N().a(true);
      this.N().a(48.0F);
      this.a_(true);
      this.a(this.gF().a($$2).b($$1.J_(), crx.b));
   }

   @Override
   public bzf<cru> ec() {
      return (bzf<cru>)super.ec();
   }

   @Override
   protected bzf.b<cru> ed() {
      return bzf.a(cs, ct);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      bzf<cru> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(asb $$0) {
      bzf<cru> $$1 = this.ec();
      $$1.b($$0, this);
      this.bs = $$1.i();
      this.a(this.ec());
   }

   private void a(bzf<cru> $$0) {
      jg<crx> $$1 = this.gF().b();
      if (this.e_()) {
         $$0.a(cue.e);
         $$0.a(cuc.d, cdc.a(0.5F));
      } else {
         $$0.a(cue.f);
         $$0.a(cuc.c, cdc.b($$1, 0.5F), ImmutableSet.of(Pair.of(chh.c, chi.a)));
      }

      $$0.a(cuc.a, cdc.a($$1, 0.5F));
      $$0.a(cuc.f, cdc.d($$1, 0.5F), ImmutableSet.of(Pair.of(chh.e, chi.a)));
      $$0.a(cuc.e, cdc.c($$1, 0.5F));
      $$0.a(cuc.b, cdc.e($$1, 0.5F));
      $$0.a(cuc.g, cdc.f($$1, 0.5F));
      $$0.a(cuc.i, cdc.g($$1, 0.5F));
      $$0.a(cuc.h, cdc.h($$1, 0.5F));
      $$0.a(cuc.j, cdc.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cuc.a));
      $$0.b(cuc.b);
      $$0.a(cuc.b);
      $$0.a(this.dV().af(), this.dV().ae());
   }

   @Override
   protected void h() {
      super.h();
      if (this.dV() instanceof asb) {
         this.g((asb)this.dV());
      }
   }

   public static bzk.a gD() {
      return byh.D().a(bzl.v, 0.5);
   }

   public boolean gE() {
      return this.cr;
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("villagerBrain");
      this.ec().a($$0, this);
      $$1.c();
      if (this.cr) {
         this.cr = false;
      }

      if (!this.gv() && this.cd > 0) {
         this.cd--;
         if (this.cd <= 0) {
            if (this.ce) {
               this.hb();
               this.ce = false;
            }

            this.a(new bwi(bwk.j, 200, 0));
         }
      }

      if (this.cf != null) {
         $$0.a(cje.e, this.cf, this);
         $$0.a(this, (byte)14);
         this.cf = null;
      }

      if (!this.gj() && this.ae.a(100) == 0) {
         cty $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.r() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gF().b().a(crx.b) && this.gv()) {
         this.gA();
      }

      super.a($$0);
   }

   @Override
   public void g() {
      super.g();
      if (this.m() > 0) {
         this.r(this.m() - 1);
      }

      this.hd();
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.uR) || !this.bJ() || this.gv() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gQ();
         return bvc.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gw().isEmpty();
            if ($$1 == bvb.a) {
               if ($$3) {
                  this.gQ();
               }

               $$0.a(axi.S);
            }

            if ($$3) {
               return bvc.c;
            }

            this.g($$0);
         }

         return bvc.a;
      }
   }

   private void gQ() {
      this.r(40);
      if (!this.dV().A_()) {
         this.b(awy.Ca);
      }
   }

   private void g(csi $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.P_(), this.gF().c());
   }

   @Override
   public void a(@Nullable csi $$0) {
      boolean $$1 = this.gu() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gA();
      }
   }

   @Override
   protected void gA() {
      super.gA();
      this.gR();
   }

   private void gR() {
      if (!this.dV().A_()) {
         for (djf $$0 : this.gw()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gG() {
      return true;
   }

   public void gH() {
      this.gW();

      for (djf $$0 : this.gw()) {
         $$0.j();
      }

      this.gS();
      this.cm = this.dV().ae();
      this.cn++;
   }

   private void gS() {
      djg $$0 = this.gw();
      csi $$1 = this.gu();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bR.l, $$0, this.gF().c(), this.p(), this.gx(), this.gG());
      }
   }

   private boolean gT() {
      for (djf $$0 : this.gw()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gU() {
      return this.cn == 0 || this.cn < 2 && this.dV().ae() > this.cm + 2400L;
   }

   public boolean gI() {
      long $$0 = this.cm + 12000L;
      long $$1 = this.dV().ae();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dV().af();
      if (this.cq > 0L) {
         long $$4 = this.cq / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cq = $$3;
      if ($$2) {
         this.cm = $$1;
         this.he();
      }

      return this.gU() && this.gT();
   }

   private void gV() {
      int $$0 = 2 - this.cn;
      if ($$0 > 0) {
         for (djf $$1 : this.gw()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gW();
      }

      this.gS();
   }

   private void gW() {
      for (djf $$0 : this.gw()) {
         $$0.g();
      }
   }

   private void h(csi $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (djf $$2 : this.gw()) {
            $$2.a(-azz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bwk.F)) {
         bwi $$3 = $$0.c(bwk.F);
         int $$4 = $$3.e();

         for (djf $$5 : this.gw()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bP, gJ());
   }

   public static crv gJ() {
      return new crv(mh.w.b(crz.c), mh.x.b(crx.b), 1);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("VillagerData", crv.c, this.gF());
      $$0.a("FoodLevel", (byte)this.ch);
      $$0.a("Gossips", chd.a, this.ci);
      $$0.a("Xp", this.cl);
      $$0.a("LastRestock", this.cm);
      $$0.a("LastGossipDecay", this.ck);
      $$0.a("RestocksToday", this.cn);
      if (this.cr) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.al.a(bP, $$0.<crv>a("VillagerData", crv.c).orElseGet(cru::gJ));
      this.ch = $$0.b("FoodLevel", (byte)0);
      this.ci.c();
      $$0.<chd>a("Gossips", chd.a).ifPresent(this.ci::a);
      this.cl = $$0.b("Xp", 0);
      this.cm = $$0.b("LastRestock", 0L);
      this.ck = $$0.b("LastGossipDecay", 0L);
      if (this.dV() instanceof asb) {
         this.g((asb)this.dV());
      }

      this.cn = $$0.b("RestocksToday", 0);
      this.cr = $$0.b("AssignProfessionWhenSpawned", false);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected awx s() {
      if (this.fR()) {
         return null;
      } else {
         return this.gv() ? awy.Cb : awy.BW;
      }
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.BZ;
   }

   @Override
   protected awx j_() {
      return awy.BY;
   }

   public void gK() {
      this.b(this.gF().b().a().f());
   }

   @Override
   public void a(crv $$0) {
      crv $$1 = this.gF();
      if (!$$1.b().equals($$0.b())) {
         this.bJ = null;
      }

      this.al.a(bP, $$0);
   }

   @Override
   public crv gF() {
      return this.al.a(bP);
   }

   @Override
   protected void b(djf $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cl = this.cl + $$0.q();
      this.cf = this.gu();
      if (this.ha()) {
         this.cd = 40;
         this.ce = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bxs(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable byf $$0) {
      if ($$0 != null && this.dV() instanceof asb) {
         ((asb)this.dV()).a(cje.c, $$0, this);
         if (this.bJ() && $$0 instanceof csi) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bvt $$0) {
      bO.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bxe $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gX();
      super.a($$0);
   }

   private void gX() {
      this.a(chh.b);
      this.a(chh.c);
      this.a(chh.d);
      this.a(chh.e);
   }

   private void b(bxe $$0) {
      if (this.dV() instanceof asb $$1) {
         Optional<chj> $$3 = this.bs.c(chh.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(byu.class::isInstance).forEach($$2x -> $$1.a(cje.d, $$0, (byu)$$2x));
         }
      }
   }

   public void a(chh<jf> $$0) {
      if (this.dV() instanceof asb) {
         MinecraftServer $$1 = ((asb)this.dV()).p();
         this.bs.c($$0).ifPresent($$2 -> {
            asb $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cjh $$4 = $$3.A();
               Optional<jg<cjk>> $$5 = $$4.c($$2.b());
               BiPredicate<cru, jg<cjk>> $$6 = bN.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agx.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.ch + this.hc() >= 12 && !this.fR() && this.Y_() == 0;
   }

   private boolean gY() {
      return this.ch < 12;
   }

   private void gZ() {
      if (this.gY() && this.hc() != 0) {
         for (int $$0 = 0; $$0 < this.u().b(); $$0++) {
            dak $$1 = this.u().a($$0);
            if (!$$1.f()) {
               Integer $$2 = bL.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.ch = this.ch + $$2;
                     this.u().a($$0, 1);
                     if (!this.gY()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(csi $$0) {
      return this.ci.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.ch -= $$0;
   }

   public void gL() {
      this.gZ();
      this.u(12);
   }

   public void b(djg $$0) {
      this.bJ = $$0;
   }

   private boolean ha() {
      int $$0 = this.gF().c();
      return crv.d($$0) && this.cl >= crv.c($$0);
   }

   private void hb() {
      this.a(this.gF().a(this.gF().c() + 1));
      this.gB();
   }

   @Override
   protected xg cz() {
      return this.gF().b().a().a();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lz.S);
      } else if ($$0 == 13) {
         this.a(lz.a);
      } else if ($$0 == 14) {
         this.a(lz.Q);
      } else if ($$0 == 42) {
         this.a(lz.ap);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$2 == bxm.e) {
         this.a(this.gF().b($$0.J_(), crx.b));
      }

      if ($$2 == bxm.n || $$2 == bxm.m || bxm.a($$2) || $$2 == bxm.o) {
         this.a(this.gF().a($$0.J_(), crz.a($$0.u(this.dv()))));
      }

      if ($$2 == bxm.d) {
         this.cr = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cru b(asb $$0, bwu $$1) {
      double $$2 = this.ae.j();
      jg<crz> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.J_().d(crz.a($$0.u(this.dv())));
      } else if ($$2 < 0.75) {
         $$3 = this.gF().a();
      } else {
         $$3 = ((cru)$$1).gF().a();
      }

      cru $$6 = new cru(bxn.bE, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bxm.e, null);
      return $$6;
   }

   @Override
   public void a(asb $$0, bye $$1) {
      if ($$0.an() != buz.a) {
         bO.info("Villager {} was struck by lightning {}.", this, $$1);
         cqa $$2 = this.a(bxn.bJ, bwy.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bxm.i, null);
            $$1x.gc();
            this.gX();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(asb $$0, coo $$1) {
      crs.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(asb $$0, dak $$1) {
      dag $$2 = $$1.h();
      return ($$1.a(axv.bP) || this.gF().b().a().d().contains($$2)) && this.u().c($$1);
   }

   public boolean gM() {
      return this.hc() >= 24;
   }

   public boolean gN() {
      return this.hc() < 12;
   }

   private int hc() {
      bvj $$0 = this.u();
      return bL.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gO() {
      return this.u().a_($$0 -> $$0.a(axv.bO));
   }

   @Override
   protected void gB() {
      crv $$0 = this.gF();
      alq<crx> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<cry.g[]> $$3;
         if (this.dV().K().b(cvu.b)) {
            Int2ObjectMap<cry.g[]> $$2 = cry.c.get($$1);
            $$3 = $$2 != null ? $$2 : cry.a.get($$1);
         } else {
            $$3 = cry.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            cry.g[] $$5 = (cry.g[])$$3.get($$0.c());
            if ($$5 != null) {
               djg $$6 = this.gw();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(asb $$0, cru $$1, long $$2) {
      if (($$2 < this.cj || $$2 >= this.cj + 1200L) && ($$2 < $$1.cj || $$2 >= $$1.cj + 1200L)) {
         this.ci.a($$1.ci, this.ae, 10);
         this.cj = $$2;
         $$1.cj = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void hd() {
      long $$0 = this.dV().ae();
      if (this.ck == 0L) {
         this.ck = $$0;
      } else if ($$0 >= this.ck + 24000L) {
         this.ci.b();
         this.ck = $$0;
      }
   }

   public void a(asb $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ffx $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cru> $$4 = $$0.a(cru.class, $$3);
         List<cru> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bau.a(bxn.aq, bxm.f, $$0, this.dv(), 10, 8, 6, bau.a.a, false).isEmpty()) {
               $$4.forEach(chz::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ae()) ? false : !this.bs.a(chh.G);
   }

   @Override
   public void a(cje $$0, bxe $$1) {
      if ($$0 == cje.a) {
         this.ci.a($$1.cG(), che.d, 20);
         this.ci.a($$1.cG(), che.c, 25);
      } else if ($$0 == cje.e) {
         this.ci.a($$1.cG(), che.e, 2);
      } else if ($$0 == cje.c) {
         this.ci.a($$1.cG(), che.b, 25);
      } else if ($$0 == cje.d) {
         this.ci.a($$1.cG(), che.a, 25);
      }
   }

   @Override
   public int p() {
      return this.cl;
   }

   public void t(int $$0) {
      this.cl = $$0;
   }

   private void he() {
      this.gV();
      this.cn = 0;
   }

   public chd gP() {
      return this.ci;
   }

   public void a(chd $$0) {
      this.ci.a($$0);
   }

   @Override
   protected void ab() {
      super.ab();
      agx.a(this);
   }

   @Override
   public void b(iw $$0) {
      super.b($$0);
      this.bs.a(chh.I, this.dV().ae());
      this.bs.b(chh.n);
      this.bs.b(chh.F);
   }

   @Override
   public void fS() {
      super.fS();
      this.bs.a(chh.J, this.dV().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bs.c(chh.I);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.av ? c((kk<T>)$$0, this.gF().a()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.av) {
         jg<crz> $$2 = c(kl.av, $$1);
         this.a(this.gF().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
