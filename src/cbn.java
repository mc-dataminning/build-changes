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

public class cbn extends cbi implements bkb, cbp {
   private static final Logger bZ = LogUtils.getLogger();
   private static final aef<cbo> ca = aei.a(cbn.class, aeh.t);
   public static final int bV = 12;
   public static final Map<cjg, Integer> bW = ImmutableMap.of(cjo.oJ, 4, cjo.tm, 1, cjo.tl, 1, cjo.uq, 1);
   private static final int cb = 2;
   private static final Set<cjg> cc = ImmutableSet.of(cjo.oJ, cjo.tm, cjo.tl, cjo.oI, cjo.oH, cjo.uq, new cjg[]{cjo.ur, cjo.uo, cjo.up});
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
   private cca cm;
   private boolean cn;
   private int co;
   private final bsj cp = new bsj();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<bsn<?>> cx = ImmutableList.of(
      bsn.b,
      bsn.c,
      bsn.d,
      bsn.e,
      bsn.g,
      bsn.h,
      bsn.i,
      bsn.j,
      bsn.k,
      bsn.l,
      bsn.K,
      bsn.aO,
      new bsn[]{bsn.m, bsn.n, bsn.q, bsn.r, bsn.t, bsn.v, bsn.w, bsn.x, bsn.y, bsn.A, bsn.f, bsn.C, bsn.D, bsn.E, bsn.G, bsn.H, bsn.I, bsn.F}
   );
   private static final ImmutableList<bts<? extends btr<? super cbn>>> cy = ImmutableList.of(bts.c, bts.d, bts.b, bts.e, bts.f, bts.g, bts.h, bts.i, bts.j);
   public static final Map<bsn<hd>, BiPredicate<cbn, he<buo>>> bY = ImmutableMap.of(
      bsn.b,
      (BiPredicate<cbn, he>)($$0, $$1) -> $$1.a(bup.n),
      bsn.c,
      (BiPredicate<cbn, he>)($$0, $$1) -> $$0.gp().b().b().test($$1),
      bsn.d,
      (BiPredicate<cbn, he>)($$0, $$1) -> cbq.a.test($$1),
      bsn.e,
      (BiPredicate<cbn, he>)($$0, $$1) -> $$1.a(bup.o)
   );

   public cbn(bja<? extends cbn> $$0, cqb $$1) {
      this($$0, $$1, cbs.c);
   }

   public cbn(bja<? extends cbn> $$0, cqb $$1, cbs $$2) {
      super($$0, $$1);
      ((bsu)this.L()).b(true);
      this.L().a(true);
      this.s(true);
      this.a(this.gp().a($$2).a(cbq.b));
   }

   @Override
   public bkm<cbn> dN() {
      return (bkm<cbn>)super.dN();
   }

   @Override
   protected bkm.b<cbn> dO() {
      return bkm.a(cx, cy);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      bkm<cbn> $$1 = this.dO().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(akt $$0) {
      bkm<cbn> $$1 = this.dN();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dN());
   }

   private void a(bkm<cbn> $$0) {
      cbq $$1 = this.gp().b();
      if (this.m_()) {
         $$0.a(cdn.e);
         $$0.a(cdl.d, boi.a(0.5F));
      } else {
         $$0.a(cdn.f);
         $$0.a(cdl.c, boi.b($$1, 0.5F), ImmutableSet.of(Pair.of(bsn.c, bso.a)));
      }

      $$0.a(cdl.a, boi.a($$1, 0.5F));
      $$0.a(cdl.f, boi.d($$1, 0.5F), ImmutableSet.of(Pair.of(bsn.e, bso.a)));
      $$0.a(cdl.e, boi.c($$1, 0.5F));
      $$0.a(cdl.b, boi.e($$1, 0.5F));
      $$0.a(cdl.g, boi.f($$1, 0.5F));
      $$0.a(cdl.i, boi.g($$1, 0.5F));
      $$0.a(cdl.h, boi.h($$1, 0.5F));
      $$0.a(cdl.j, boi.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cdl.a));
      $$0.b(cdl.b);
      $$0.a(cdl.b);
      $$0.a(this.dL().W(), this.dL().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dL() instanceof akt) {
         this.c((akt)this.dL());
      }
   }

   public static bkr.a gn() {
      return bjo.A().a(bks.m, 0.5).a(bks.g, 48.0);
   }

   public boolean go() {
      return this.cw;
   }

   @Override
   protected void X() {
      this.dL().ad().a("villagerBrain");
      this.dN().a((akt)this.dL(), this);
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

            this.b(new bij(bil.j, 200, 0));
         }
      }

      if (this.cm != null && this.dL() instanceof akt) {
         ((akt)this.dL()).a(bui.e, this.cm, this);
         this.dL().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fU() && this.ag.a(100) == 0) {
         cdh $$0 = ((akt)this.dL()).c(this.dl());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dL().a(this, (byte)42);
         }
      }

      if (this.gp().b() == cbq.b && this.gf()) {
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
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if ($$2.a(cjo.sR) || !this.bv() || this.gf() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.m_()) {
         this.gA();
         return bhe.a(this.dL().B);
      } else {
         boolean $$3 = this.gg().isEmpty();
         if ($$1 == bhd.a) {
            if ($$3 && !this.dL().B) {
               this.gA();
            }

            $$0.a(apq.S);
         }

         if ($$3) {
            return bhe.a(this.dL().B);
         } else {
            if (!this.dL().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bhe.a(this.dL().B);
         }
      }
   }

   private void gA() {
      this.s(40);
      if (!this.dL().w_()) {
         this.a(apg.yL, this.eV(), this.eW());
      }
   }

   private void h(cca $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.N_(), this.gp().c());
   }

   @Override
   public void f(@Nullable cca $$0) {
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
      for (coz $$0 : this.gg()) {
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

      for (coz $$0 : this.gg()) {
         $$0.h();
      }

      this.gC();
      this.ct = this.dL().V();
      this.cu++;
   }

   private void gC() {
      cpa $$0 = this.gg();
      cca $$1 = this.ge();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.gp().c(), this.t(), this.gh(), this.gq());
      }
   }

   private boolean gD() {
      for (coz $$0 : this.gg()) {
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
         for (coz $$1 : this.gg()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gG();
      }

      this.gC();
   }

   private void gG() {
      for (coz $$0 : this.gg()) {
         $$0.e();
      }
   }

   private void i(cca $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (coz $$2 : this.gg()) {
            $$2.a(-asb.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bil.F)) {
         bij $$3 = $$0.b(bil.F);
         int $$4 = $$3.e();

         for (coz $$5 : this.gg()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, new cbo(cbs.c, cbq.b, 1));
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cbo.c.encodeStart(ri.a, this.gp()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(ri.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cbo> $$1 = cbo.c.parse(new Dynamic(ri.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cpa($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      rc $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(ri.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dL() instanceof akt) {
         this.c((akt)this.dL());
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
   protected apf w() {
      if (this.fD()) {
         return null;
      } else {
         return this.gf() ? apg.yM : apg.yH;
      }
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.yK;
   }

   @Override
   protected apf l_() {
      return apg.yJ;
   }

   public void gt() {
      apf $$0 = this.gp().b().f();
      if ($$0 != null) {
         this.a($$0, this.eV(), this.eW());
      }
   }

   @Override
   public void a(cbo $$0) {
      cbo $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cbo gp() {
      return this.an.b(ca);
   }

   @Override
   protected void b(coz $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.ge();
      if (this.gK()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dL().b(new bjc(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gu() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bjm $$0) {
      if ($$0 != null && this.dL() instanceof akt) {
         ((akt)this.dL()).a(bui.c, $$0, this);
         if (this.bv() && $$0 instanceof cca) {
            this.dL().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bhu $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      biw $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gH();
      super.a($$0);
   }

   private void gH() {
      this.a(bsn.b);
      this.a(bsn.c);
      this.a(bsn.d);
      this.a(bsn.e);
   }

   private void a(biw $$0) {
      if (this.dL() instanceof akt $$1) {
         Optional<bsp> $$3 = this.bz.c(bsn.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bkb.class::isInstance).forEach($$2x -> $$1.a(bui.d, $$0, (bkb)$$2x));
         }
      }
   }

   public void a(bsn<hd> $$0) {
      if (this.dL() instanceof akt) {
         MinecraftServer $$1 = ((akt)this.dL()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            akt $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bul $$4 = $$3.w();
               Optional<he<buo>> $$5 = $$4.c($$2.b());
               BiPredicate<cbn, he<buo>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  abc.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean V_() {
      return this.co + this.gM() >= 12 && !this.fD() && this.h() == 0;
   }

   private boolean gI() {
      return this.co < 12;
   }

   private void gJ() {
      if (this.gI() && this.gM() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cjl $$1 = this.y().a($$0);
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

   public int g(cca $$0) {
      return this.cp.a($$0.cv(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gv() {
      this.gJ();
      this.v(12);
   }

   public void b(cpa $$0) {
      this.bU = $$0;
   }

   private boolean gK() {
      int $$0 = this.gp().c();
      return cbo.d($$0) && this.cs >= cbo.c($$0);
   }

   private void gL() {
      this.a(this.gp().a(this.gp().c() + 1));
      this.gl();
   }

   @Override
   protected tl cn() {
      return tl.c(this.ag().g() + "." + jb.A.b(this.gp().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(iv.M);
      } else if ($$0 == 13) {
         this.a(iv.b);
      } else if ($$0 == 14) {
         this.a(iv.K);
      } else if ($$0 == 42) {
         this.a(iv.ag);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      if ($$2 == bjq.e) {
         this.a(this.gp().a(cbq.b));
      }

      if ($$2 == bjq.n || $$2 == bjq.m || $$2 == bjq.c || $$2 == bjq.o) {
         this.a(this.gp().a(cbs.a($$0.s(this.dl()))));
      }

      if ($$2 == bjq.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cbn b(akt $$0, bir $$1) {
      double $$2 = this.ag.j();
      cbs $$3;
      if ($$2 < 0.5) {
         $$3 = cbs.a($$0.s(this.dl()));
      } else if ($$2 < 0.75) {
         $$3 = this.gp().a();
      } else {
         $$3 = ((cbn)$$1).gp().a();
      }

      cbn $$6 = new cbn(bja.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dl()), bjq.e, null, null);
      return $$6;
   }

   @Override
   public void a(akt $$0, bjl $$1) {
      if ($$0.ai() != bhb.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         cae $$2 = bja.bj.a((cqb)$$0);
         if ($$2 != null) {
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.a($$0, $$0.d_($$2.dl()), bjq.i, null, null);
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
   protected void b(byt $$0) {
      cbl.a(this, this, $$0);
   }

   @Override
   public boolean k(cjl $$0) {
      cjg $$1 = $$0.d();
      return (cc.contains($$1) || this.gp().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gw() {
      return this.gM() >= 24;
   }

   public boolean gx() {
      return this.gM() < 12;
   }

   private int gM() {
      bhl $$0 = this.y();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gy() {
      return this.y().a_($$0 -> $$0.a(aqd.aU));
   }

   @Override
   protected void gl() {
      cbo $$0 = this.gp();
      Int2ObjectMap<cbr.g[]> $$2;
      if (this.dL().G().b(cek.c)) {
         Int2ObjectMap<cbr.g[]> $$1 = cbr.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cbr.a.get($$0.b());
      } else {
         $$2 = cbr.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cbr.g[] $$4 = (cbr.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cpa $$5 = this.gg();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(akt $$0, cbn $$1, long $$2) {
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

   public void a(akt $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ehc $$3 = this.cG().c(10.0, 10.0, 10.0);
         List<cbn> $$4 = $$0.a(cbn.class, $$3);
         List<cbn> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ass.a(bja.ac, bjq.f, $$0, this.dl(), 10, 8, 6, ass.a.a).isEmpty()) {
               $$4.forEach(bte::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dL().V()) ? false : !this.bz.a(bsn.F);
   }

   @Override
   public void a(bui $$0, biw $$1) {
      if ($$0 == bui.a) {
         this.cp.a($$1.cv(), bsk.d, 20);
         this.cp.a($$1.cv(), bsk.c, 25);
      } else if ($$0 == bui.e) {
         this.cp.a($$1.cv(), bsk.e, 2);
      } else if ($$0 == bui.c) {
         this.cp.a($$1.cv(), bsk.b, 25);
      } else if ($$0 == bui.d) {
         this.cp.a($$1.cv(), bsk.a, 25);
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

   public bsj gz() {
      return this.cp;
   }

   public void a(rq $$0) {
      this.cp.a(new Dynamic(ri.a, $$0));
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   @Override
   public void b(gw $$0) {
      super.b($$0);
      this.bz.a(bsn.G, this.dL().V());
      this.bz.b(bsn.m);
      this.bz.b(bsn.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(bsn.H, this.dL().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bsn.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
