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

public class cfd extends cey implements bnd, cff {
   private static final Logger ca = LogUtils.getLogger();
   private static final agn<cfe> cb = agq.a(cfd.class, agp.t);
   public static final int bW = 12;
   public static final Map<cnb, Integer> bX = ImmutableMap.of(cnj.pw, 4, cnj.uc, 1, cnj.ub, 1, cnj.vg, 1);
   private static final int cc = 2;
   private static final Set<cnb> cd = ImmutableSet.of(cnj.pw, cnj.uc, cnj.ub, cnj.pv, cnj.pu, cnj.vg, new cnb[]{cnj.vh, cnj.ve, cnj.vf});
   private static final int ce = 10;
   private static final int cf = 1200;
   private static final int cg = 24000;
   private static final int ch = 25;
   private static final int ci = 10;
   private static final int cj = 5;
   private static final long ck = 24000L;
   @VisibleForTesting
   public static final float bY = 0.5F;
   private int cl;
   private boolean cm;
   @Nullable
   private cfq cn;
   private boolean co;
   private int cp;
   private final bvm cq = new bvm();
   private long cr;
   private long cs;
   private int ct;
   private long cu;
   private int cv;
   private long cx;
   private boolean cy;
   private static final ImmutableList<bvq<?>> cz = ImmutableList.of(
      bvq.b,
      bvq.c,
      bvq.d,
      bvq.e,
      bvq.g,
      bvq.h,
      bvq.i,
      bvq.j,
      bvq.k,
      bvq.l,
      bvq.L,
      bvq.aP,
      new bvq[]{bvq.m, bvq.n, bvq.q, bvq.r, bvq.t, bvq.v, bvq.w, bvq.x, bvq.y, bvq.A, bvq.f, bvq.C, bvq.D, bvq.E, bvq.H, bvq.I, bvq.J, bvq.F}
   );
   private static final ImmutableList<bwx<? extends bww<? super cfd>>> cA = ImmutableList.of(bwx.c, bwx.d, bwx.b, bwx.e, bwx.f, bwx.g, bwx.h, bwx.i, bwx.j);
   public static final Map<bvq<ig>, BiPredicate<cfd, ih<bxt>>> bZ = ImmutableMap.of(
      bvq.b,
      (BiPredicate<cfd, ih>)($$0, $$1) -> $$1.a(bxu.n),
      bvq.c,
      (BiPredicate<cfd, ih>)($$0, $$1) -> $$0.gq().b().b().test($$1),
      bvq.d,
      (BiPredicate<cfd, ih>)($$0, $$1) -> cfg.a.test($$1),
      bvq.e,
      (BiPredicate<cfd, ih>)($$0, $$1) -> $$1.a(bxu.o)
   );

   public cfd(bmc<? extends cfd> $$0, ctx $$1) {
      this($$0, $$1, cfi.c);
   }

   public cfd(bmc<? extends cfd> $$0, ctx $$1, cfi $$2) {
      super($$0, $$1);
      ((bvx)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gq().a($$2).a(cfg.b));
   }

   @Override
   public bno<cfd> dN() {
      return (bno<cfd>)super.dN();
   }

   @Override
   protected bno.b<cfd> dO() {
      return bno.a(cz, cA);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      bno<cfd> $$1 = this.dO().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(ane $$0) {
      bno<cfd> $$1 = this.dN();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dN());
   }

   private void a(bno<cfd> $$0) {
      cfg $$1 = this.gq().b();
      if (this.o_()) {
         $$0.a(che.e);
         $$0.a(chc.d, brl.a(0.5F));
      } else {
         $$0.a(che.f);
         $$0.a(chc.c, brl.b($$1, 0.5F), ImmutableSet.of(Pair.of(bvq.c, bvr.a)));
      }

      $$0.a(chc.a, brl.a($$1, 0.5F));
      $$0.a(chc.f, brl.d($$1, 0.5F), ImmutableSet.of(Pair.of(bvq.e, bvr.a)));
      $$0.a(chc.e, brl.c($$1, 0.5F));
      $$0.a(chc.b, brl.e($$1, 0.5F));
      $$0.a(chc.g, brl.f($$1, 0.5F));
      $$0.a(chc.i, brl.g($$1, 0.5F));
      $$0.a(chc.h, brl.h($$1, 0.5F));
      $$0.a(chc.j, brl.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(chc.a));
      $$0.b(chc.b);
      $$0.a(chc.b);
      $$0.a(this.dL().Y(), this.dL().X());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dL() instanceof ane) {
         this.c((ane)this.dL());
      }
   }

   public static bnt.a go() {
      return bmq.C().a(bnu.o, 0.5).a(bnu.i, 48.0);
   }

   public boolean gp() {
      return this.cy;
   }

   @Override
   protected void aa() {
      this.dL().af().a("villagerBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      if (this.cy) {
         this.cy = false;
      }

      if (!this.gg() && this.cl > 0) {
         this.cl--;
         if (this.cl <= 0) {
            if (this.cm) {
               this.gM();
               this.cm = false;
            }

            this.b(new blj(bll.j, 200, 0));
         }
      }

      if (this.cn != null && this.dL() instanceof ane) {
         ((ane)this.dL()).a(bxn.e, this.cn, this);
         this.dL().a(this, (byte)14);
         this.cn = null;
      }

      if (!this.fV() && this.ag.a(100) == 0) {
         cgy $$0 = ((ane)this.dL()).d(this.dl());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dL().a(this, (byte)42);
         }
      }

      if (this.gq().b() == cfg.b && this.gg()) {
         this.gl();
      }

      super.aa();
   }

   @Override
   public void l() {
      super.l();
      if (this.u() > 0) {
         this.s(this.u() - 1);
      }

      this.gO();
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(cnj.tH) || !this.bx() || this.gg() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gB();
         return bkc.a(this.dL().B);
      } else {
         boolean $$3 = this.gh().isEmpty();
         if ($$1 == bkb.a) {
            if ($$3 && !this.dL().B) {
               this.gB();
            }

            $$0.a(asd.S);
         }

         if ($$3) {
            return bkc.a(this.dL().B);
         } else {
            if (!this.dL().B && !this.bV.isEmpty()) {
               this.h($$0);
            }

            return bkc.a(this.dL().B);
         }
      }
   }

   private void gB() {
      this.s(40);
      if (!this.dL().y_()) {
         this.a(art.Aa, this.eW(), this.eX());
      }
   }

   private void h(cfq $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.Q_(), this.gq().c());
   }

   @Override
   public void f(@Nullable cfq $$0) {
      boolean $$1 = this.gf() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gl();
      }
   }

   @Override
   protected void gl() {
      super.gl();
      this.gC();
   }

   private void gC() {
      for (csv $$0 : this.gh()) {
         $$0.l();
      }
   }

   @Override
   public boolean gr() {
      return true;
   }

   @Override
   public boolean gn() {
      return this.dL().B;
   }

   public void gs() {
      this.gH();

      for (csv $$0 : this.gh()) {
         $$0.h();
      }

      this.gD();
      this.cu = this.dL().X();
      this.cv++;
   }

   private void gD() {
      csw $$0 = this.gh();
      cfq $$1 = this.gf();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bW.j, $$0, this.gq().c(), this.w(), this.gi(), this.gr());
      }
   }

   private boolean gE() {
      for (csv $$0 : this.gh()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gF() {
      return this.cv == 0 || this.cv < 2 && this.dL().X() > this.cu + 2400L;
   }

   public boolean gt() {
      long $$0 = this.cu + 12000L;
      long $$1 = this.dL().X();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dL().Y();
      if (this.cx > 0L) {
         long $$4 = this.cx / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cx = $$3;
      if ($$2) {
         this.cu = $$1;
         this.gP();
      }

      return this.gF() && this.gE();
   }

   private void gG() {
      int $$0 = 2 - this.cv;
      if ($$0 > 0) {
         for (csv $$1 : this.gh()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gH();
      }

      this.gD();
   }

   private void gH() {
      for (csv $$0 : this.gh()) {
         $$0.e();
      }
   }

   private void i(cfq $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (csv $$2 : this.gh()) {
            $$2.a(-aup.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bll.F)) {
         blj $$3 = $$0.c(bll.F);
         int $$4 = $$3.d();

         for (csv $$5 : this.gh()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cb, new cfe(cfi.c, cfg.b, 1));
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      cfe.c.encodeStart(tc.a, this.gq()).resultOrPartial(ca::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cp);
      $$0.a("Gossips", this.cq.a(tc.a));
      $$0.a("Xp", this.ct);
      $$0.a("LastRestock", this.cu);
      $$0.a("LastGossipDecay", this.cs);
      $$0.a("RestocksToday", this.cv);
      if (this.cy) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cfe> $$1 = cfe.c.parse(new Dynamic(tc.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(ca::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bV = new csw($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cp = $$0.f("FoodLevel");
      }

      su $$2 = $$0.c("Gossips", 10);
      this.cq.a(new Dynamic(tc.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.ct = $$0.h("Xp");
      }

      this.cu = $$0.i("LastRestock");
      this.cs = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dL() instanceof ane) {
         this.c((ane)this.dL());
      }

      this.cv = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cy = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected ars y() {
      if (this.fD()) {
         return null;
      } else {
         return this.gg() ? art.Ab : art.zW;
      }
   }

   @Override
   protected ars d(bkv $$0) {
      return art.zZ;
   }

   @Override
   protected ars n_() {
      return art.zY;
   }

   public void gu() {
      ars $$0 = this.gq().b().f();
      if ($$0 != null) {
         this.a($$0, this.eW(), this.eX());
      }
   }

   @Override
   public void a(cfe $$0) {
      cfe $$1 = this.gq();
      if ($$1.b() != $$0.b()) {
         this.bV = null;
      }

      this.an.b(cb, $$0);
   }

   @Override
   public cfe gq() {
      return this.an.b(cb);
   }

   @Override
   protected void b(csv $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.ct = this.ct + $$0.o();
      this.cn = this.gf();
      if (this.gL()) {
         this.cl = 40;
         this.cm = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dL().b(new bme(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.co = $$0;
   }

   public boolean gv() {
      return this.co;
   }

   @Override
   public void a(@Nullable bmo $$0) {
      if ($$0 != null && this.dL() instanceof ane) {
         ((ane)this.dL()).a(bxn.c, $$0, this);
         if (this.bx() && $$0 instanceof cfq) {
            this.dL().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bkv $$0) {
      ca.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      blw $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gI();
      super.a($$0);
   }

   private void gI() {
      this.a(bvq.b);
      this.a(bvq.c);
      this.a(bvq.d);
      this.a(bvq.e);
   }

   private void a(blw $$0) {
      if (this.dL() instanceof ane $$1) {
         Optional<bvs> $$3 = this.bz.c(bvq.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bnd.class::isInstance).forEach($$2x -> $$1.a(bxn.d, $$0, (bnd)$$2x));
         }
      }
   }

   public void a(bvq<ig> $$0) {
      if (this.dL() instanceof ane) {
         MinecraftServer $$1 = ((ane)this.dL()).o();
         this.bz.c($$0).ifPresent($$2 -> {
            ane $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bxq $$4 = $$3.y();
               Optional<ih<bxt>> $$5 = $$4.c($$2.b());
               BiPredicate<cfd, ih<bxt>> $$6 = bZ.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  adj.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.cp + this.gN() >= 12 && !this.fD() && this.h() == 0;
   }

   private boolean gJ() {
      return this.cp < 12;
   }

   private void gK() {
      if (this.gJ() && this.gN() != 0) {
         for (int $$0 = 0; $$0 < this.A().b(); $$0++) {
            cng $$1 = this.A().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bX.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cp = this.cp + $$2;
                     this.A().a($$0, 1);
                     if (!this.gJ()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cfq $$0) {
      return this.cq.a($$0.cw(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cp -= $$0;
   }

   public void gw() {
      this.gK();
      this.v(12);
   }

   public void b(csw $$0) {
      this.bV = $$0;
   }

   private boolean gL() {
      int $$0 = this.gq().c();
      return cfe.d($$0) && this.ct >= cfe.c($$0);
   }

   private void gM() {
      this.a(this.gq().a(this.gq().c() + 1));
      this.gm();
   }

   @Override
   protected vg co() {
      return vg.c(this.ai().g() + "." + kd.z.b(this.gq().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(jx.O);
      } else if ($$0 == 13) {
         this.a(jx.b);
      } else if ($$0 == 14) {
         this.a(jx.M);
      } else if ($$0 == 42) {
         this.a(jx.aj);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if ($$2 == bms.e) {
         this.a(this.gq().a(cfg.b));
      }

      if ($$2 == bms.n || $$2 == bms.m || bms.a($$2) || $$2 == bms.o) {
         this.a(this.gq().a(cfi.a($$0.t(this.dl()))));
      }

      if ($$2 == bms.d) {
         this.cy = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cfd b(ane $$0, blr $$1) {
      double $$2 = this.ag.j();
      cfi $$3;
      if ($$2 < 0.5) {
         $$3 = cfi.a($$0.t(this.dl()));
      } else if ($$2 < 0.75) {
         $$3 = this.gq().a();
      } else {
         $$3 = ((cfd)$$1).gq().a();
      }

      cfd $$6 = new cfd(bmc.bh, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dl()), bms.e, null, null);
      return $$6;
   }

   @Override
   public void a(ane $$0, bmn $$1) {
      if ($$0.ak() != bjz.a) {
         ca.info("Villager {} was struck by lightning {}.", this, $$1);
         cdm $$2 = bmc.bm.a((ctx)$$0);
         if ($$2 != null) {
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.a($$0, $$0.d_($$2.dl()), bms.i, null, null);
            $$2.t(this.fV());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fK();
            $$0.a_($$2);
            this.gI();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(ccb $$0) {
      cfb.a(this, this, $$0);
   }

   @Override
   public boolean k(cng $$0) {
      cnb $$1 = $$0.d();
      return (cd.contains($$1) || this.gq().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gx() {
      return this.gN() >= 24;
   }

   public boolean gy() {
      return this.gN() < 12;
   }

   private int gN() {
      bkl $$0 = this.A();
      return bX.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gz() {
      return this.A().a_($$0 -> $$0.a(asq.aU));
   }

   @Override
   protected void gm() {
      cfe $$0 = this.gq();
      Int2ObjectMap<cfh.g[]> $$2;
      if (this.dL().I().b(cic.d)) {
         Int2ObjectMap<cfh.g[]> $$1 = cfh.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cfh.a.get($$0.b());
      } else {
         $$2 = cfh.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cfh.g[] $$4 = (cfh.g[])$$2.get($$0.c());
         if ($$4 != null) {
            csw $$5 = this.gh();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ane $$0, cfd $$1, long $$2) {
      if (($$2 < this.cr || $$2 >= this.cr + 1200L) && ($$2 < $$1.cr || $$2 >= $$1.cr + 1200L)) {
         this.cq.a($$1.cq, this.ag, 10);
         this.cr = $$2;
         $$1.cr = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gO() {
      long $$0 = this.dL().X();
      if (this.cs == 0L) {
         this.cs = $$0;
      } else if ($$0 >= this.cs + 24000L) {
         this.cq.b();
         this.cs = $$0;
      }
   }

   public void a(ane $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         elx $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cfd> $$4 = $$0.a(cfd.class, $$3);
         List<cfd> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!avj.a(bmc.ae, bms.f, $$0, this.dl(), 10, 8, 6, avj.a.a).isEmpty()) {
               $$4.forEach(bwi::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dL().X()) ? false : !this.bz.a(bvq.F);
   }

   @Override
   public void a(bxn $$0, blw $$1) {
      if ($$0 == bxn.a) {
         this.cq.a($$1.cw(), bvn.d, 20);
         this.cq.a($$1.cw(), bvn.c, 25);
      } else if ($$0 == bxn.e) {
         this.cq.a($$1.cw(), bvn.e, 2);
      } else if ($$0 == bxn.c) {
         this.cq.a($$1.cw(), bvn.b, 25);
      } else if ($$0 == bxn.d) {
         this.cq.a($$1.cw(), bvn.a, 25);
      }
   }

   @Override
   public int w() {
      return this.ct;
   }

   public void u(int $$0) {
      this.ct = $$0;
   }

   private void gP() {
      this.gG();
      this.cv = 0;
   }

   public bvm gA() {
      return this.cq;
   }

   public void a(tl $$0) {
      this.cq.a(new Dynamic(tc.a, $$0));
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   @Override
   public void b(hx $$0) {
      super.b($$0);
      this.bz.a(bvq.H, this.dL().X());
      this.bz.b(bvq.m);
      this.bz.b(bvq.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(bvq.I, this.dL().X());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bvq.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
