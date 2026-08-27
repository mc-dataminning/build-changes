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

public class cba extends cav implements bjn, cbc {
   private static final Logger bZ = LogUtils.getLogger();
   private static final adz<cbb> ca = aec.a(cba.class, aeb.t);
   public static final int bV = 12;
   public static final Map<cit, Integer> bW = ImmutableMap.of(cjb.oJ, 4, cjb.tm, 1, cjb.tl, 1, cjb.uq, 1);
   private static final int cb = 2;
   private static final Set<cit> cc = ImmutableSet.of(cjb.oJ, cjb.tm, cjb.tl, cjb.oI, cjb.oH, cjb.uq, new cit[]{cjb.ur, cjb.uo, cjb.up});
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
   private cbn cm;
   private boolean cn;
   private int co;
   private final brw cp = new brw();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<bsa<?>> cx = ImmutableList.of(
      bsa.b,
      bsa.c,
      bsa.d,
      bsa.e,
      bsa.g,
      bsa.h,
      bsa.i,
      bsa.j,
      bsa.k,
      bsa.l,
      bsa.K,
      bsa.aO,
      new bsa[]{bsa.m, bsa.n, bsa.q, bsa.r, bsa.t, bsa.v, bsa.w, bsa.x, bsa.y, bsa.A, bsa.f, bsa.C, bsa.D, bsa.E, bsa.G, bsa.H, bsa.I, bsa.F}
   );
   private static final ImmutableList<btf<? extends bte<? super cba>>> cy = ImmutableList.of(btf.c, btf.d, btf.b, btf.e, btf.f, btf.g, btf.h, btf.i, btf.j);
   public static final Map<bsa<hd>, BiPredicate<cba, he<bub>>> bY = ImmutableMap.of(
      bsa.b,
      (BiPredicate<cba, he>)($$0, $$1) -> $$1.a(buc.n),
      bsa.c,
      (BiPredicate<cba, he>)($$0, $$1) -> $$0.gk().b().b().test($$1),
      bsa.d,
      (BiPredicate<cba, he>)($$0, $$1) -> cbd.a.test($$1),
      bsa.e,
      (BiPredicate<cba, he>)($$0, $$1) -> $$1.a(buc.o)
   );

   public cba(bim<? extends cba> $$0, cpm $$1) {
      this($$0, $$1, cbf.c);
   }

   public cba(bim<? extends cba> $$0, cpm $$1, cbf $$2) {
      super($$0, $$1);
      ((bsh)this.H()).b(true);
      this.H().a(true);
      this.s(true);
      this.a(this.gk().a($$2).a(cbd.b));
   }

   @Override
   public bjz<cba> dM() {
      return (bjz<cba>)super.dM();
   }

   @Override
   protected bjz.b<cba> dN() {
      return bjz.a(cx, cy);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      bjz<cba> $$1 = this.dN().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(akk $$0) {
      bjz<cba> $$1 = this.dM();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dM());
   }

   private void a(bjz<cba> $$0) {
      cbd $$1 = this.gk().b();
      if (this.i_()) {
         $$0.a(cda.e);
         $$0.a(ccy.d, bnv.a(0.5F));
      } else {
         $$0.a(cda.f);
         $$0.a(ccy.c, bnv.b($$1, 0.5F), ImmutableSet.of(Pair.of(bsa.c, bsb.a)));
      }

      $$0.a(ccy.a, bnv.a($$1, 0.5F));
      $$0.a(ccy.f, bnv.d($$1, 0.5F), ImmutableSet.of(Pair.of(bsa.e, bsb.a)));
      $$0.a(ccy.e, bnv.c($$1, 0.5F));
      $$0.a(ccy.b, bnv.e($$1, 0.5F));
      $$0.a(ccy.g, bnv.f($$1, 0.5F));
      $$0.a(ccy.i, bnv.g($$1, 0.5F));
      $$0.a(ccy.h, bnv.h($$1, 0.5F));
      $$0.a(ccy.j, bnv.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ccy.a));
      $$0.b(ccy.b);
      $$0.a(ccy.b);
      $$0.a(this.dK().W(), this.dK().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dK() instanceof akk) {
         this.c((akk)this.dK());
      }
   }

   public static bke.a gi() {
      return bja.x().a(bkf.d, 0.5).a(bkf.b, 48.0);
   }

   public boolean gj() {
      return this.cw;
   }

   @Override
   protected void V() {
      this.dK().ad().a("villagerBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.ga() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gG();
               this.cl = false;
            }

            this.b(new bhv(bhx.j, 200, 0));
         }
      }

      if (this.cm != null && this.dK() instanceof akk) {
         ((akk)this.dK()).a(btv.e, this.cm, this);
         this.dK().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fQ() && this.ag.a(100) == 0) {
         ccu $$0 = ((akk)this.dK()).c(this.dk());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dK().a(this, (byte)42);
         }
      }

      if (this.gk().b() == cbd.b && this.ga()) {
         this.gf();
      }

      super.V();
   }

   @Override
   public void l() {
      super.l();
      if (this.p() > 0) {
         this.s(this.p() - 1);
      }

      this.gI();
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ($$2.a(cjb.sR) || !this.bv() || this.ga() || this.fB()) {
         return super.b($$0, $$1);
      } else if (this.i_()) {
         this.gv();
         return bgq.a(this.dK().B);
      } else {
         boolean $$3 = this.gb().isEmpty();
         if ($$1 == bgp.a) {
            if ($$3 && !this.dK().B) {
               this.gv();
            }

            $$0.a(apg.S);
         }

         if ($$3) {
            return bgq.a(this.dK().B);
         } else {
            if (!this.dK().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bgq.a(this.dK().B);
         }
      }
   }

   private void gv() {
      this.s(40);
      if (!this.dK().r_()) {
         this.a(aow.yG, this.eU(), this.eV());
      }
   }

   private void h(cbn $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.H_(), this.gk().c());
   }

   @Override
   public void f(@Nullable cbn $$0) {
      boolean $$1 = this.fZ() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gf();
      }
   }

   @Override
   protected void gf() {
      super.gf();
      this.gw();
   }

   private void gw() {
      for (coj $$0 : this.gb()) {
         $$0.l();
      }
   }

   @Override
   public boolean gl() {
      return true;
   }

   @Override
   public boolean gh() {
      return this.dK().B;
   }

   public void gm() {
      this.gB();

      for (coj $$0 : this.gb()) {
         $$0.h();
      }

      this.gx();
      this.ct = this.dK().V();
      this.cu++;
   }

   private void gx() {
      cok $$0 = this.gb();
      cbn $$1 = this.fZ();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bQ.j, $$0, this.gk().c(), this.q(), this.gc(), this.gl());
      }
   }

   private boolean gy() {
      for (coj $$0 : this.gb()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gz() {
      return this.cu == 0 || this.cu < 2 && this.dK().V() > this.ct + 2400L;
   }

   public boolean gn() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dK().V();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dK().W();
      if (this.cv > 0L) {
         long $$4 = this.cv / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cv = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gJ();
      }

      return this.gz() && this.gy();
   }

   private void gA() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (coj $$1 : this.gb()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gB();
      }

      this.gx();
   }

   private void gB() {
      for (coj $$0 : this.gb()) {
         $$0.e();
      }
   }

   private void i(cbn $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (coj $$2 : this.gb()) {
            $$2.a(-arp.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bhx.F)) {
         bhv $$3 = $$0.b(bhx.F);
         int $$4 = $$3.e();

         for (coj $$5 : this.gb()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, new cbb(cbf.c, cbd.b, 1));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cbb.c.encodeStart(rc.a, this.gk()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(rc.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cbb> $$1 = cbb.c.parse(new Dynamic(rc.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cok($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      qx $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(rc.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dK() instanceof akk) {
         this.c((akk)this.dK());
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
   protected aov r() {
      if (this.fB()) {
         return null;
      } else {
         return this.ga() ? aow.yH : aow.yC;
      }
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.yF;
   }

   @Override
   protected aov h_() {
      return aow.yE;
   }

   public void go() {
      aov $$0 = this.gk().b().f();
      if ($$0 != null) {
         this.a($$0, this.eU(), this.eV());
      }
   }

   @Override
   public void a(cbb $$0) {
      cbb $$1 = this.gk();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cbb gk() {
      return this.an.b(ca);
   }

   @Override
   protected void b(coj $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.fZ();
      if (this.gF()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dK().b(new bio(this.dK(), this.dp(), this.dr() + 0.5, this.dv(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gp() {
      return this.cn;
   }

   @Override
   public void a(@Nullable biy $$0) {
      if ($$0 != null && this.dK() instanceof akk) {
         ((akk)this.dK()).a(btv.c, $$0, this);
         if (this.bv() && $$0 instanceof cbn) {
            this.dK().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bhg $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bii $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gC();
      super.a($$0);
   }

   private void gC() {
      this.a(bsa.b);
      this.a(bsa.c);
      this.a(bsa.d);
      this.a(bsa.e);
   }

   private void a(bii $$0) {
      if (this.dK() instanceof akk $$1) {
         Optional<bsc> $$3 = this.bz.c(bsa.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bjn.class::isInstance).forEach($$2x -> $$1.a(btv.d, $$0, (bjn)$$2x));
         }
      }
   }

   public void a(bsa<hd> $$0) {
      if (this.dK() instanceof akk) {
         MinecraftServer $$1 = ((akk)this.dK()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            akk $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bty $$4 = $$3.w();
               Optional<he<bub>> $$5 = $$4.c($$2.b());
               BiPredicate<cba, he<bub>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aav.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean P_() {
      return this.co + this.gH() >= 12 && !this.fB() && this.h() == 0;
   }

   private boolean gD() {
      return this.co < 12;
   }

   private void gE() {
      if (this.gD() && this.gH() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            ciy $$1 = this.t().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.t().a($$0, 1);
                     if (!this.gD()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cbn $$0) {
      return this.cp.a($$0.cv(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gq() {
      this.gE();
      this.v(12);
   }

   public void b(cok $$0) {
      this.bU = $$0;
   }

   private boolean gF() {
      int $$0 = this.gk().c();
      return cbb.d($$0) && this.cs >= cbb.c($$0);
   }

   private void gG() {
      this.a(this.gk().a(this.gk().c() + 1));
      this.gg();
   }

   @Override
   protected tf cn() {
      return tf.c(this.ag().g() + "." + jb.A.b(this.gk().b()).a());
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
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      if ($$2 == bjc.e) {
         this.a(this.gk().a(cbd.b));
      }

      if ($$2 == bjc.n || $$2 == bjc.m || $$2 == bjc.c || $$2 == bjc.o) {
         this.a(this.gk().a(cbf.a($$0.s(this.dk()))));
      }

      if ($$2 == bjc.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cba b(akk $$0, bid $$1) {
      double $$2 = this.ag.j();
      cbf $$3;
      if ($$2 < 0.5) {
         $$3 = cbf.a($$0.s(this.dk()));
      } else if ($$2 < 0.75) {
         $$3 = this.gk().a();
      } else {
         $$3 = ((cba)$$1).gk().a();
      }

      cba $$6 = new cba(bim.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dk()), bjc.e, null, null);
      return $$6;
   }

   @Override
   public void a(akk $$0, bix $$1) {
      if ($$0.ai() != bgn.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         bzr $$2 = bim.bj.a((cpm)$$0);
         if ($$2 != null) {
            $$2.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$2.a($$0, $$0.d_($$2.dk()), bjc.i, null, null);
            $$2.t(this.fQ());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fF();
            $$0.a_($$2);
            this.gC();
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(byg $$0) {
      cay.a(this, this, $$0);
   }

   @Override
   public boolean k(ciy $$0) {
      cit $$1 = $$0.d();
      return (cc.contains($$1) || this.gk().b().d().contains($$1)) && this.t().b($$0);
   }

   public boolean gr() {
      return this.gH() >= 24;
   }

   public boolean gs() {
      return this.gH() < 12;
   }

   private int gH() {
      bgx $$0 = this.t();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gt() {
      return this.t().a_($$0 -> $$0.a(apt.aU));
   }

   @Override
   protected void gg() {
      cbb $$0 = this.gk();
      Int2ObjectMap<cbe.f[]> $$2;
      if (this.dK().G().b(cdx.c)) {
         Int2ObjectMap<cbe.f[]> $$1 = cbe.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cbe.a.get($$0.b());
      } else {
         $$2 = cbe.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cbe.f[] $$4 = (cbe.f[])$$2.get($$0.c());
         if ($$4 != null) {
            cok $$5 = this.gb();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(akk $$0, cba $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gI() {
      long $$0 = this.dK().V();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(akk $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         egz $$3 = this.cG().c(10.0, 10.0, 10.0);
         List<cba> $$4 = $$0.a(cba.class, $$3);
         List<cba> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!asf.a(bim.ac, bjc.f, $$0, this.dk(), 10, 8, 6, asf.a.a).isEmpty()) {
               $$4.forEach(bsr::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dK().V()) ? false : !this.bz.a(bsa.F);
   }

   @Override
   public void a(btv $$0, bii $$1) {
      if ($$0 == btv.a) {
         this.cp.a($$1.cv(), brx.d, 20);
         this.cp.a($$1.cv(), brx.c, 25);
      } else if ($$0 == btv.e) {
         this.cp.a($$1.cv(), brx.e, 2);
      } else if ($$0 == btv.c) {
         this.cp.a($$1.cv(), brx.b, 25);
      } else if ($$0 == btv.d) {
         this.cp.a($$1.cv(), brx.a, 25);
      }
   }

   @Override
   public int q() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gJ() {
      this.gA();
      this.cu = 0;
   }

   public brw gu() {
      return this.cp;
   }

   public void a(rk $$0) {
      this.cp.a(new Dynamic(rc.a, $$0));
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public void b(gu $$0) {
      super.b($$0);
      this.bz.a(bsa.G, this.dK().V());
      this.bz.b(bsa.m);
      this.bz.b(bsa.E);
   }

   @Override
   public void fC() {
      super.fC();
      this.bz.a(bsa.H, this.dK().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bsa.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
