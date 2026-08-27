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

public class cdh extends cdc implements blv, cdj {
   private static final Logger bZ = LogUtils.getLogger();
   private static final afo<cdi> ca = afr.a(cdh.class, afq.t);
   public static final int bV = 12;
   public static final Map<cle, Integer> bW = ImmutableMap.of(clm.pu, 4, clm.tY, 1, clm.tX, 1, clm.vc, 1);
   private static final int cb = 2;
   private static final Set<cle> cc = ImmutableSet.of(clm.pu, clm.tY, clm.tX, clm.pt, clm.ps, clm.vc, new cle[]{clm.vd, clm.va, clm.vb});
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
   private cdu cm;
   private boolean cn;
   private int co;
   private final bud cp = new bud();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<buh<?>> cx = ImmutableList.of(
      buh.b,
      buh.c,
      buh.d,
      buh.e,
      buh.g,
      buh.h,
      buh.i,
      buh.j,
      buh.k,
      buh.l,
      buh.K,
      buh.aO,
      new buh[]{buh.m, buh.n, buh.q, buh.r, buh.t, buh.v, buh.w, buh.x, buh.y, buh.A, buh.f, buh.C, buh.D, buh.E, buh.G, buh.H, buh.I, buh.F}
   );
   private static final ImmutableList<bvm<? extends bvl<? super cdh>>> cy = ImmutableList.of(bvm.c, bvm.d, bvm.b, bvm.e, bvm.f, bvm.g, bvm.h, bvm.i, bvm.j);
   public static final Map<buh<ia>, BiPredicate<cdh, ib<bwi>>> bY = ImmutableMap.of(
      buh.b,
      (BiPredicate<cdh, ib>)($$0, $$1) -> $$1.a(bwj.n),
      buh.c,
      (BiPredicate<cdh, ib>)($$0, $$1) -> $$0.gq().b().b().test($$1),
      buh.d,
      (BiPredicate<cdh, ib>)($$0, $$1) -> cdk.a.test($$1),
      buh.e,
      (BiPredicate<cdh, ib>)($$0, $$1) -> $$1.a(bwj.o)
   );

   public cdh(bku<? extends cdh> $$0, csa $$1) {
      this($$0, $$1, cdm.c);
   }

   public cdh(bku<? extends cdh> $$0, csa $$1, cdm $$2) {
      super($$0, $$1);
      ((buo)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gq().a($$2).a(cdk.b));
   }

   @Override
   public bmg<cdh> dP() {
      return (bmg<cdh>)super.dP();
   }

   @Override
   protected bmg.b<cdh> dQ() {
      return bmg.a(cx, cy);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      bmg<cdh> $$1 = this.dQ().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(ame $$0) {
      bmg<cdh> $$1 = this.dP();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dP());
   }

   private void a(bmg<cdh> $$0) {
      cdk $$1 = this.gq().b();
      if (this.n_()) {
         $$0.a(cfh.e);
         $$0.a(cff.d, bqc.a(0.5F));
      } else {
         $$0.a(cfh.f);
         $$0.a(cff.c, bqc.b($$1, 0.5F), ImmutableSet.of(Pair.of(buh.c, bui.a)));
      }

      $$0.a(cff.a, bqc.a($$1, 0.5F));
      $$0.a(cff.f, bqc.d($$1, 0.5F), ImmutableSet.of(Pair.of(buh.e, bui.a)));
      $$0.a(cff.e, bqc.c($$1, 0.5F));
      $$0.a(cff.b, bqc.e($$1, 0.5F));
      $$0.a(cff.g, bqc.f($$1, 0.5F));
      $$0.a(cff.i, bqc.g($$1, 0.5F));
      $$0.a(cff.h, bqc.h($$1, 0.5F));
      $$0.a(cff.j, bqc.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cff.a));
      $$0.b(cff.b);
      $$0.a(cff.b);
      $$0.a(this.dN().X(), this.dN().W());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dN() instanceof ame) {
         this.c((ame)this.dN());
      }
   }

   public static bml.a go() {
      return bli.C().a(bmm.m, 0.5).a(bmm.g, 48.0);
   }

   public boolean gp() {
      return this.cw;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("villagerBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.gg() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gM();
               this.cl = false;
            }

            this.b(new bkd(bkf.j, 200, 0));
         }
      }

      if (this.cm != null && this.dN() instanceof ame) {
         ((ame)this.dN()).a(bwc.e, this.cm, this);
         this.dN().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fV() && this.ag.a(100) == 0) {
         cfb $$0 = ((ame)this.dN()).c(this.dn());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dN().a(this, (byte)42);
         }
      }

      if (this.gq().b() == cdk.b && this.gg()) {
         this.gl();
      }

      super.Z();
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
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.a(clm.tD) || !this.bx() || this.gg() || this.fE()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gB();
         return bix.a(this.dN().B);
      } else {
         boolean $$3 = this.gh().isEmpty();
         if ($$1 == biw.a) {
            if ($$3 && !this.dN().B) {
               this.gB();
            }

            $$0.a(arb.S);
         }

         if ($$3) {
            return bix.a(this.dN().B);
         } else {
            if (!this.dN().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bix.a(this.dN().B);
         }
      }
   }

   private void gB() {
      this.s(40);
      if (!this.dN().x_()) {
         this.a(aqr.zq, this.eX(), this.eY());
      }
   }

   private void h(cdu $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.P_(), this.gq().c());
   }

   @Override
   public void f(@Nullable cdu $$0) {
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
      for (cqy $$0 : this.gh()) {
         $$0.l();
      }
   }

   @Override
   public boolean gr() {
      return true;
   }

   @Override
   public boolean gn() {
      return this.dN().B;
   }

   public void gs() {
      this.gH();

      for (cqy $$0 : this.gh()) {
         $$0.h();
      }

      this.gD();
      this.ct = this.dN().W();
      this.cu++;
   }

   private void gD() {
      cqz $$0 = this.gh();
      cdu $$1 = this.gf();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.gq().c(), this.w(), this.gi(), this.gr());
      }
   }

   private boolean gE() {
      for (cqy $$0 : this.gh()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gF() {
      return this.cu == 0 || this.cu < 2 && this.dN().W() > this.ct + 2400L;
   }

   public boolean gt() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dN().W();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dN().X();
      if (this.cv > 0L) {
         long $$4 = this.cv / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cv = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gP();
      }

      return this.gF() && this.gE();
   }

   private void gG() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (cqy $$1 : this.gh()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gH();
      }

      this.gD();
   }

   private void gH() {
      for (cqy $$0 : this.gh()) {
         $$0.e();
      }
   }

   private void i(cdu $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cqy $$2 : this.gh()) {
            $$2.a(-atm.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bkf.F)) {
         bkd $$3 = $$0.b(bkf.F);
         int $$4 = $$3.e();

         for (cqy $$5 : this.gh()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, new cdi(cdm.c, cdk.b, 1));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      cdi.c.encodeStart(sn.a, this.gq()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         DataResult<cdi> $$1 = cdi.c.parse(new Dynamic(sn.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cqz($$0.p("Offers"));
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
      if (this.dN() instanceof ame) {
         this.c((ame)this.dN());
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
   protected aqq y() {
      if (this.fE()) {
         return null;
      } else {
         return this.gg() ? aqr.zr : aqr.zm;
      }
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.zp;
   }

   @Override
   protected aqq m_() {
      return aqr.zo;
   }

   public void gu() {
      aqq $$0 = this.gq().b().f();
      if ($$0 != null) {
         this.a($$0, this.eX(), this.eY());
      }
   }

   @Override
   public void a(cdi $$0) {
      cdi $$1 = this.gq();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cdi gq() {
      return this.an.b(ca);
   }

   @Override
   protected void b(cqy $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.gf();
      if (this.gL()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dN().b(new bkw(this.dN(), this.ds(), this.du() + 0.5, this.dy(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gv() {
      return this.cn;
   }

   @Override
   public void a(@Nullable blg $$0) {
      if ($$0 != null && this.dN() instanceof ame) {
         ((ame)this.dN()).a(bwc.c, $$0, this);
         if (this.bx() && $$0 instanceof cdu) {
            this.dN().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bjo $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bkq $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gI();
      super.a($$0);
   }

   private void gI() {
      this.a(buh.b);
      this.a(buh.c);
      this.a(buh.d);
      this.a(buh.e);
   }

   private void a(bkq $$0) {
      if (this.dN() instanceof ame $$1) {
         Optional<buj> $$3 = this.bz.c(buh.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(blv.class::isInstance).forEach($$2x -> $$1.a(bwc.d, $$0, (blv)$$2x));
         }
      }
   }

   public void a(buh<ia> $$0) {
      if (this.dN() instanceof ame) {
         MinecraftServer $$1 = ((ame)this.dN()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            ame $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bwf $$4 = $$3.x();
               Optional<ib<bwi>> $$5 = $$4.c($$2.b());
               BiPredicate<cdh, ib<bwi>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  ack.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.co + this.gN() >= 12 && !this.fE() && this.h() == 0;
   }

   private boolean gJ() {
      return this.co < 12;
   }

   private void gK() {
      if (this.gJ() && this.gN() != 0) {
         for (int $$0 = 0; $$0 < this.A().b(); $$0++) {
            clj $$1 = this.A().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
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

   public int g(cdu $$0) {
      return this.cp.a($$0.cw(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gw() {
      this.gK();
      this.v(12);
   }

   public void b(cqz $$0) {
      this.bU = $$0;
   }

   private boolean gL() {
      int $$0 = this.gq().c();
      return cdi.d($$0) && this.cs >= cdi.c($$0);
   }

   private void gM() {
      this.a(this.gq().a(this.gq().c() + 1));
      this.gm();
   }

   @Override
   protected ur co() {
      return ur.c(this.ai().g() + "." + jy.A.b(this.gq().b()).a());
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
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      if ($$2 == blk.e) {
         this.a(this.gq().a(cdk.b));
      }

      if ($$2 == blk.n || $$2 == blk.m || $$2 == blk.c || $$2 == blk.o) {
         this.a(this.gq().a(cdm.a($$0.s(this.dn()))));
      }

      if ($$2 == blk.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cdh b(ame $$0, bkl $$1) {
      double $$2 = this.ag.j();
      cdm $$3;
      if ($$2 < 0.5) {
         $$3 = cdm.a($$0.s(this.dn()));
      } else if ($$2 < 0.75) {
         $$3 = this.gq().a();
      } else {
         $$3 = ((cdh)$$1).gq().a();
      }

      cdh $$6 = new cdh(bku.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dn()), blk.e, null, null);
      return $$6;
   }

   @Override
   public void a(ame $$0, blf $$1) {
      if ($$0.aj() != biu.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         cby $$2 = bku.bj.a((csa)$$0);
         if ($$2 != null) {
            $$2.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$2.a($$0, $$0.d_($$2.dn()), blk.i, null, null);
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
   protected void b(can $$0) {
      cdf.a(this, this, $$0);
   }

   @Override
   public boolean k(clj $$0) {
      cle $$1 = $$0.d();
      return (cc.contains($$1) || this.gq().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gx() {
      return this.gN() >= 24;
   }

   public boolean gy() {
      return this.gN() < 12;
   }

   private int gN() {
      bje $$0 = this.A();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gz() {
      return this.A().a_($$0 -> $$0.a(aro.aU));
   }

   @Override
   protected void gm() {
      cdi $$0 = this.gq();
      Int2ObjectMap<cdl.g[]> $$2;
      if (this.dN().H().b(cgf.d)) {
         Int2ObjectMap<cdl.g[]> $$1 = cdl.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cdl.a.get($$0.b());
      } else {
         $$2 = cdl.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cdl.g[] $$4 = (cdl.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cqz $$5 = this.gh();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ame $$0, cdh $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gO() {
      long $$0 = this.dN().W();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(ame $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ejp $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cdh> $$4 = $$0.a(cdh.class, $$3);
         List<cdh> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!aue.a(bku.ac, blk.f, $$0, this.dn(), 10, 8, 6, aue.a.a).isEmpty()) {
               $$4.forEach(buy::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dN().W()) ? false : !this.bz.a(buh.F);
   }

   @Override
   public void a(bwc $$0, bkq $$1) {
      if ($$0 == bwc.a) {
         this.cp.a($$1.cw(), bue.d, 20);
         this.cp.a($$1.cw(), bue.c, 25);
      } else if ($$0 == bwc.e) {
         this.cp.a($$1.cw(), bue.e, 2);
      } else if ($$0 == bwc.c) {
         this.cp.a($$1.cw(), bue.b, 25);
      } else if ($$0 == bwc.d) {
         this.cp.a($$1.cw(), bue.a, 25);
      }
   }

   @Override
   public int w() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gP() {
      this.gG();
      this.cu = 0;
   }

   public bud gA() {
      return this.cp;
   }

   public void a(sw $$0) {
      this.cp.a(new Dynamic(sn.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   @Override
   public void b(ht $$0) {
      super.b($$0);
      this.bz.a(buh.G, this.dN().W());
      this.bz.b(buh.m);
      this.bz.b(buh.E);
   }

   @Override
   public void fF() {
      super.fF();
      this.bz.a(buh.H, this.dN().W());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(buh.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
