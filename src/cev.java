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

public class cev extends ceq implements bna, cex {
   private static final Logger bZ = LogUtils.getLogger();
   private static final agm<cew> ca = agp.a(cev.class, ago.t);
   public static final int bV = 12;
   public static final Map<cmt, Integer> bW = ImmutableMap.of(cnb.pu, 4, cnb.tZ, 1, cnb.tY, 1, cnb.vd, 1);
   private static final int cb = 2;
   private static final Set<cmt> cc = ImmutableSet.of(cnb.pu, cnb.tZ, cnb.tY, cnb.pt, cnb.ps, cnb.vd, new cmt[]{cnb.ve, cnb.vb, cnb.vc});
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
   private cfi cm;
   private boolean cn;
   private int co;
   private final bvj cp = new bvj();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cw;
   private boolean cx;
   private static final ImmutableList<bvn<?>> cy = ImmutableList.of(
      bvn.b,
      bvn.c,
      bvn.d,
      bvn.e,
      bvn.g,
      bvn.h,
      bvn.i,
      bvn.j,
      bvn.k,
      bvn.l,
      bvn.K,
      bvn.aO,
      new bvn[]{bvn.m, bvn.n, bvn.q, bvn.r, bvn.t, bvn.v, bvn.w, bvn.x, bvn.y, bvn.A, bvn.f, bvn.C, bvn.D, bvn.E, bvn.G, bvn.H, bvn.I, bvn.F}
   );
   private static final ImmutableList<bwt<? extends bws<? super cev>>> cz = ImmutableList.of(bwt.c, bwt.d, bwt.b, bwt.e, bwt.f, bwt.g, bwt.h, bwt.i, bwt.j);
   public static final Map<bvn<ig>, BiPredicate<cev, ih<bxp>>> bY = ImmutableMap.of(
      bvn.b,
      (BiPredicate<cev, ih>)($$0, $$1) -> $$1.a(bxq.n),
      bvn.c,
      (BiPredicate<cev, ih>)($$0, $$1) -> $$0.gp().b().b().test($$1),
      bvn.d,
      (BiPredicate<cev, ih>)($$0, $$1) -> cey.a.test($$1),
      bvn.e,
      (BiPredicate<cev, ih>)($$0, $$1) -> $$1.a(bxq.o)
   );

   public cev(blz<? extends cev> $$0, ctp $$1) {
      this($$0, $$1, cfa.c);
   }

   public cev(blz<? extends cev> $$0, ctp $$1, cfa $$2) {
      super($$0, $$1);
      ((bvu)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gp().a($$2).a(cey.b));
   }

   @Override
   public bnl<cev> dO() {
      return (bnl<cev>)super.dO();
   }

   @Override
   protected bnl.b<cev> dP() {
      return bnl.a(cy, cz);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      bnl<cev> $$1 = this.dP().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(and $$0) {
      bnl<cev> $$1 = this.dO();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dO());
   }

   private void a(bnl<cev> $$0) {
      cey $$1 = this.gp().b();
      if (this.o_()) {
         $$0.a(cgw.e);
         $$0.a(cgu.d, bri.a(0.5F));
      } else {
         $$0.a(cgw.f);
         $$0.a(cgu.c, bri.b($$1, 0.5F), ImmutableSet.of(Pair.of(bvn.c, bvo.a)));
      }

      $$0.a(cgu.a, bri.a($$1, 0.5F));
      $$0.a(cgu.f, bri.d($$1, 0.5F), ImmutableSet.of(Pair.of(bvn.e, bvo.a)));
      $$0.a(cgu.e, bri.c($$1, 0.5F));
      $$0.a(cgu.b, bri.e($$1, 0.5F));
      $$0.a(cgu.g, bri.f($$1, 0.5F));
      $$0.a(cgu.i, bri.g($$1, 0.5F));
      $$0.a(cgu.h, bri.h($$1, 0.5F));
      $$0.a(cgu.j, bri.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cgu.a));
      $$0.b(cgu.b);
      $$0.a(cgu.b);
      $$0.a(this.dM().Y(), this.dM().X());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dM() instanceof and) {
         this.c((and)this.dM());
      }
   }

   public static bnq.a gn() {
      return bmn.C().a(bnr.m, 0.5).a(bnr.g, 48.0);
   }

   public boolean go() {
      return this.cx;
   }

   @Override
   protected void Z() {
      this.dM().af().a("villagerBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      if (this.cx) {
         this.cx = false;
      }

      if (!this.gf() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gL();
               this.cl = false;
            }

            this.b(new bli(blk.j, 200, 0));
         }
      }

      if (this.cm != null && this.dM() instanceof and) {
         ((and)this.dM()).a(bxj.e, this.cm, this);
         this.dM().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fU() && this.ag.a(100) == 0) {
         cgq $$0 = ((and)this.dM()).d(this.dm());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gp().b() == cey.b && this.gf()) {
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
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.a(cnb.tE) || !this.bx() || this.gf() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gA();
         return bkb.a(this.dM().B);
      } else {
         boolean $$3 = this.gg().isEmpty();
         if ($$1 == bka.a) {
            if ($$3 && !this.dM().B) {
               this.gA();
            }

            $$0.a(asc.S);
         }

         if ($$3) {
            return bkb.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bkb.a(this.dM().B);
         }
      }
   }

   private void gA() {
      this.s(40);
      if (!this.dM().y_()) {
         this.a(ars.zL, this.eW(), this.eX());
      }
   }

   private void h(cfi $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.Q_(), this.gp().c());
   }

   @Override
   public void f(@Nullable cfi $$0) {
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
      for (csn $$0 : this.gg()) {
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

      for (csn $$0 : this.gg()) {
         $$0.h();
      }

      this.gC();
      this.ct = this.dM().X();
      this.cu++;
   }

   private void gC() {
      cso $$0 = this.gg();
      cfi $$1 = this.ge();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.gp().c(), this.w(), this.gh(), this.gq());
      }
   }

   private boolean gD() {
      for (csn $$0 : this.gg()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gE() {
      return this.cu == 0 || this.cu < 2 && this.dM().X() > this.ct + 2400L;
   }

   public boolean gs() {
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
         this.gO();
      }

      return this.gE() && this.gD();
   }

   private void gF() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (csn $$1 : this.gg()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gG();
      }

      this.gC();
   }

   private void gG() {
      for (csn $$0 : this.gg()) {
         $$0.e();
      }
   }

   private void i(cfi $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (csn $$2 : this.gg()) {
            $$2.a(-auo.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(blk.F)) {
         bli $$3 = $$0.b(blk.F);
         int $$4 = $$3.e();

         for (csn $$5 : this.gg()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, new cew(cfa.c, cey.b, 1));
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cew.c.encodeStart(tb.a, this.gp()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(tb.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cx) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cew> $$1 = cew.c.parse(new Dynamic(tb.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cso($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      st $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(tb.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dM() instanceof and) {
         this.c((and)this.dM());
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
   protected arr y() {
      if (this.fD()) {
         return null;
      } else {
         return this.gf() ? ars.zM : ars.zH;
      }
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.zK;
   }

   @Override
   protected arr n_() {
      return ars.zJ;
   }

   public void gt() {
      arr $$0 = this.gp().b().f();
      if ($$0 != null) {
         this.a($$0, this.eW(), this.eX());
      }
   }

   @Override
   public void a(cew $$0) {
      cew $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cew gp() {
      return this.an.b(ca);
   }

   @Override
   protected void b(csn $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.ge();
      if (this.gK()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dM().b(new bmb(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gu() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bml $$0) {
      if ($$0 != null && this.dM() instanceof and) {
         ((and)this.dM()).a(bxj.c, $$0, this);
         if (this.bx() && $$0 instanceof cfi) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bkt $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      blv $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gH();
      super.a($$0);
   }

   private void gH() {
      this.a(bvn.b);
      this.a(bvn.c);
      this.a(bvn.d);
      this.a(bvn.e);
   }

   private void a(blv $$0) {
      if (this.dM() instanceof and $$1) {
         Optional<bvp> $$3 = this.bz.c(bvn.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bna.class::isInstance).forEach($$2x -> $$1.a(bxj.d, $$0, (bna)$$2x));
         }
      }
   }

   public void a(bvn<ig> $$0) {
      if (this.dM() instanceof and) {
         MinecraftServer $$1 = ((and)this.dM()).o();
         this.bz.c($$0).ifPresent($$2 -> {
            and $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bxm $$4 = $$3.y();
               Optional<ih<bxp>> $$5 = $$4.c($$2.b());
               BiPredicate<cev, ih<bxp>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  adi.c($$3, $$2.b());
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
            cmy $$1 = this.A().a($$0);
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

   public int g(cfi $$0) {
      return this.cp.a($$0.cw(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gv() {
      this.gJ();
      this.v(12);
   }

   public void b(cso $$0) {
      this.bU = $$0;
   }

   private boolean gK() {
      int $$0 = this.gp().c();
      return cew.d($$0) && this.cs >= cew.c($$0);
   }

   private void gL() {
      this.a(this.gp().a(this.gp().c() + 1));
      this.gl();
   }

   @Override
   protected vf co() {
      return vf.c(this.ai().g() + "." + kd.z.b(this.gp().b()).a());
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
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      if ($$2 == bmp.e) {
         this.a(this.gp().a(cey.b));
      }

      if ($$2 == bmp.n || $$2 == bmp.m || bmp.a($$2) || $$2 == bmp.o) {
         this.a(this.gp().a(cfa.a($$0.t(this.dm()))));
      }

      if ($$2 == bmp.d) {
         this.cx = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cev b(and $$0, blq $$1) {
      double $$2 = this.ag.j();
      cfa $$3;
      if ($$2 < 0.5) {
         $$3 = cfa.a($$0.t(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gp().a();
      } else {
         $$3 = ((cev)$$1).gp().a();
      }

      cev $$6 = new cev(blz.bg, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), bmp.e, null, null);
      return $$6;
   }

   @Override
   public void a(and $$0, bmk $$1) {
      if ($$0.ak() != bjy.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         cdf $$2 = blz.bl.a((ctp)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), bmp.i, null, null);
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
   protected void b(cbu $$0) {
      cet.a(this, this, $$0);
   }

   @Override
   public boolean k(cmy $$0) {
      cmt $$1 = $$0.d();
      return (cc.contains($$1) || this.gp().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gw() {
      return this.gM() >= 24;
   }

   public boolean gx() {
      return this.gM() < 12;
   }

   private int gM() {
      bkj $$0 = this.A();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gy() {
      return this.A().a_($$0 -> $$0.a(asp.aU));
   }

   @Override
   protected void gl() {
      cew $$0 = this.gp();
      Int2ObjectMap<cez.g[]> $$2;
      if (this.dM().I().b(chu.d)) {
         Int2ObjectMap<cez.g[]> $$1 = cez.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cez.a.get($$0.b());
      } else {
         $$2 = cez.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cez.g[] $$4 = (cez.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cso $$5 = this.gg();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(and $$0, cev $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gN() {
      long $$0 = this.dM().X();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(and $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         elo $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cev> $$4 = $$0.a(cev.class, $$3);
         List<cev> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!avi.a(blz.ad, bmp.f, $$0, this.dm(), 10, 8, 6, avi.a.a).isEmpty()) {
               $$4.forEach(bwf::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().X()) ? false : !this.bz.a(bvn.F);
   }

   @Override
   public void a(bxj $$0, blv $$1) {
      if ($$0 == bxj.a) {
         this.cp.a($$1.cw(), bvk.d, 20);
         this.cp.a($$1.cw(), bvk.c, 25);
      } else if ($$0 == bxj.e) {
         this.cp.a($$1.cw(), bvk.e, 2);
      } else if ($$0 == bxj.c) {
         this.cp.a($$1.cw(), bvk.b, 25);
      } else if ($$0 == bxj.d) {
         this.cp.a($$1.cw(), bvk.a, 25);
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

   public bvj gz() {
      return this.cp;
   }

   public void a(tk $$0) {
      this.cp.a(new Dynamic(tb.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public void b(hx $$0) {
      super.b($$0);
      this.bz.a(bvn.G, this.dM().X());
      this.bz.b(bvn.m);
      this.bz.b(bvn.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(bvn.H, this.dM().X());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bvn.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
