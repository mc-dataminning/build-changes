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

public class caz extends cau implements bjn, cbb {
   private static final Logger bZ = LogUtils.getLogger();
   private static final adz<cba> ca = aec.a(caz.class, aeb.t);
   public static final int bV = 12;
   public static final Map<cis, Integer> bW = ImmutableMap.of(cja.oJ, 4, cja.tm, 1, cja.tl, 1, cja.uq, 1);
   private static final int cb = 2;
   private static final Set<cis> cc = ImmutableSet.of(cja.oJ, cja.tm, cja.tl, cja.oI, cja.oH, cja.uq, new cis[]{cja.ur, cja.uo, cja.up});
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
   private cbm cm;
   private boolean cn;
   private int co;
   private final brv cp = new brv();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<brz<?>> cx = ImmutableList.of(
      brz.b,
      brz.c,
      brz.d,
      brz.e,
      brz.g,
      brz.h,
      brz.i,
      brz.j,
      brz.k,
      brz.l,
      brz.K,
      brz.aO,
      new brz[]{brz.m, brz.n, brz.q, brz.r, brz.t, brz.v, brz.w, brz.x, brz.y, brz.A, brz.f, brz.C, brz.D, brz.E, brz.G, brz.H, brz.I, brz.F}
   );
   private static final ImmutableList<bte<? extends btd<? super caz>>> cy = ImmutableList.of(bte.c, bte.d, bte.b, bte.e, bte.f, bte.g, bte.h, bte.i, bte.j);
   public static final Map<brz<hd>, BiPredicate<caz, he<bua>>> bY = ImmutableMap.of(
      brz.b,
      (BiPredicate<caz, he>)($$0, $$1) -> $$1.a(bub.n),
      brz.c,
      (BiPredicate<caz, he>)($$0, $$1) -> $$0.gl().b().b().test($$1),
      brz.d,
      (BiPredicate<caz, he>)($$0, $$1) -> cbc.a.test($$1),
      brz.e,
      (BiPredicate<caz, he>)($$0, $$1) -> $$1.a(bub.o)
   );

   public caz(bim<? extends caz> $$0, cpl $$1) {
      this($$0, $$1, cbe.c);
   }

   public caz(bim<? extends caz> $$0, cpl $$1, cbe $$2) {
      super($$0, $$1);
      ((bsg)this.H()).b(true);
      this.H().a(true);
      this.s(true);
      this.a(this.gl().a($$2).a(cbc.b));
   }

   @Override
   public bjy<caz> dM() {
      return (bjy<caz>)super.dM();
   }

   @Override
   protected bjy.b<caz> dN() {
      return bjy.a(cx, cy);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      bjy<caz> $$1 = this.dN().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(akk $$0) {
      bjy<caz> $$1 = this.dM();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dM());
   }

   private void a(bjy<caz> $$0) {
      cbc $$1 = this.gl().b();
      if (this.i_()) {
         $$0.a(ccz.e);
         $$0.a(ccx.d, bnu.a(0.5F));
      } else {
         $$0.a(ccz.f);
         $$0.a(ccx.c, bnu.b($$1, 0.5F), ImmutableSet.of(Pair.of(brz.c, bsa.a)));
      }

      $$0.a(ccx.a, bnu.a($$1, 0.5F));
      $$0.a(ccx.f, bnu.d($$1, 0.5F), ImmutableSet.of(Pair.of(brz.e, bsa.a)));
      $$0.a(ccx.e, bnu.c($$1, 0.5F));
      $$0.a(ccx.b, bnu.e($$1, 0.5F));
      $$0.a(ccx.g, bnu.f($$1, 0.5F));
      $$0.a(ccx.i, bnu.g($$1, 0.5F));
      $$0.a(ccx.h, bnu.h($$1, 0.5F));
      $$0.a(ccx.j, bnu.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ccx.a));
      $$0.b(ccx.b);
      $$0.a(ccx.b);
      $$0.a(this.dK().W(), this.dK().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dK() instanceof akk) {
         this.c((akk)this.dK());
      }
   }

   public static bkd.a gj() {
      return bja.x().a(bke.d, 0.5).a(bke.b, 48.0);
   }

   public boolean gk() {
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

      if (!this.gb() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gH();
               this.cl = false;
            }

            this.b(new bhv(bhx.j, 200, 0));
         }
      }

      if (this.cm != null && this.dK() instanceof akk) {
         ((akk)this.dK()).a(btu.e, this.cm, this);
         this.dK().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fQ() && this.ag.a(100) == 0) {
         cct $$0 = ((akk)this.dK()).c(this.dk());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dK().a(this, (byte)42);
         }
      }

      if (this.gl().b() == cbc.b && this.gb()) {
         this.gg();
      }

      super.V();
   }

   @Override
   public void l() {
      super.l();
      if (this.p() > 0) {
         this.s(this.p() - 1);
      }

      this.gJ();
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if ($$2.a(cja.sR) || !this.bv() || this.gb() || this.fB()) {
         return super.b($$0, $$1);
      } else if (this.i_()) {
         this.gw();
         return bgq.a(this.dK().B);
      } else {
         boolean $$3 = this.gc().isEmpty();
         if ($$1 == bgp.a) {
            if ($$3 && !this.dK().B) {
               this.gw();
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

   private void gw() {
      this.s(40);
      if (!this.dK().r_()) {
         this.a(aow.yL, this.eU(), this.eV());
      }
   }

   private void h(cbm $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.H_(), this.gl().c());
   }

   @Override
   public void f(@Nullable cbm $$0) {
      boolean $$1 = this.ga() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gg();
      }
   }

   @Override
   protected void gg() {
      super.gg();
      this.gx();
   }

   private void gx() {
      for (coi $$0 : this.gc()) {
         $$0.l();
      }
   }

   @Override
   public boolean gm() {
      return true;
   }

   @Override
   public boolean gi() {
      return this.dK().B;
   }

   public void gn() {
      this.gC();

      for (coi $$0 : this.gc()) {
         $$0.h();
      }

      this.gy();
      this.ct = this.dK().V();
      this.cu++;
   }

   private void gy() {
      coj $$0 = this.gc();
      cbm $$1 = this.ga();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bQ.j, $$0, this.gl().c(), this.q(), this.gd(), this.gm());
      }
   }

   private boolean gz() {
      for (coi $$0 : this.gc()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gA() {
      return this.cu == 0 || this.cu < 2 && this.dK().V() > this.ct + 2400L;
   }

   public boolean go() {
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
         this.gK();
      }

      return this.gA() && this.gz();
   }

   private void gB() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (coi $$1 : this.gc()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gC();
      }

      this.gy();
   }

   private void gC() {
      for (coi $$0 : this.gc()) {
         $$0.e();
      }
   }

   private void i(cbm $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (coi $$2 : this.gc()) {
            $$2.a(-arp.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bhx.F)) {
         bhv $$3 = $$0.b(bhx.F);
         int $$4 = $$3.e();

         for (coi $$5 : this.gc()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, new cba(cbe.c, cbc.b, 1));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cba.c.encodeStart(rc.a, this.gl()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         DataResult<cba> $$1 = cba.c.parse(new Dynamic(rc.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new coj($$0.p("Offers"));
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
         return this.gb() ? aow.yM : aow.yH;
      }
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.yK;
   }

   @Override
   protected aov h_() {
      return aow.yJ;
   }

   public void gp() {
      aov $$0 = this.gl().b().f();
      if ($$0 != null) {
         this.a($$0, this.eU(), this.eV());
      }
   }

   @Override
   public void a(cba $$0) {
      cba $$1 = this.gl();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cba gl() {
      return this.an.b(ca);
   }

   @Override
   protected void b(coi $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.ga();
      if (this.gG()) {
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

   public boolean gq() {
      return this.cn;
   }

   @Override
   public void a(@Nullable biy $$0) {
      if ($$0 != null && this.dK() instanceof akk) {
         ((akk)this.dK()).a(btu.c, $$0, this);
         if (this.bv() && $$0 instanceof cbm) {
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

      this.gD();
      super.a($$0);
   }

   private void gD() {
      this.a(brz.b);
      this.a(brz.c);
      this.a(brz.d);
      this.a(brz.e);
   }

   private void a(bii $$0) {
      if (this.dK() instanceof akk $$1) {
         Optional<bsb> $$3 = this.bz.c(brz.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bjn.class::isInstance).forEach($$2x -> $$1.a(btu.d, $$0, (bjn)$$2x));
         }
      }
   }

   public void a(brz<hd> $$0) {
      if (this.dK() instanceof akk) {
         MinecraftServer $$1 = ((akk)this.dK()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            akk $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               btx $$4 = $$3.w();
               Optional<he<bua>> $$5 = $$4.c($$2.b());
               BiPredicate<caz, he<bua>> $$6 = bY.get($$0);
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
      return this.co + this.gI() >= 12 && !this.fB() && this.h() == 0;
   }

   private boolean gE() {
      return this.co < 12;
   }

   private void gF() {
      if (this.gE() && this.gI() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            cix $$1 = this.t().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.t().a($$0, 1);
                     if (!this.gE()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cbm $$0) {
      return this.cp.a($$0.cv(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gr() {
      this.gF();
      this.v(12);
   }

   public void b(coj $$0) {
      this.bU = $$0;
   }

   private boolean gG() {
      int $$0 = this.gl().c();
      return cba.d($$0) && this.cs >= cba.c($$0);
   }

   private void gH() {
      this.a(this.gl().a(this.gl().c() + 1));
      this.gh();
   }

   @Override
   protected tf cn() {
      return tf.c(this.ag().g() + "." + jb.A.b(this.gl().b()).a());
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
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      if ($$2 == bjc.e) {
         this.a(this.gl().a(cbc.b));
      }

      if ($$2 == bjc.n || $$2 == bjc.m || $$2 == bjc.c || $$2 == bjc.o) {
         this.a(this.gl().a(cbe.a($$0.s(this.dk()))));
      }

      if ($$2 == bjc.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public caz b(akk $$0, bid $$1) {
      double $$2 = this.ag.j();
      cbe $$3;
      if ($$2 < 0.5) {
         $$3 = cbe.a($$0.s(this.dk()));
      } else if ($$2 < 0.75) {
         $$3 = this.gl().a();
      } else {
         $$3 = ((caz)$$1).gl().a();
      }

      caz $$6 = new caz(bim.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dk()), bjc.e, null, null);
      return $$6;
   }

   @Override
   public void a(akk $$0, bix $$1) {
      if ($$0.ai() != bgn.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         bzq $$2 = bim.bj.a((cpl)$$0);
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
            this.gD();
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(byf $$0) {
      cax.a(this, this, $$0);
   }

   @Override
   public boolean k(cix $$0) {
      cis $$1 = $$0.d();
      return (cc.contains($$1) || this.gl().b().d().contains($$1)) && this.t().b($$0);
   }

   public boolean gs() {
      return this.gI() >= 24;
   }

   public boolean gt() {
      return this.gI() < 12;
   }

   private int gI() {
      bgx $$0 = this.t();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gu() {
      return this.t().a_($$0 -> $$0.a(apt.aU));
   }

   @Override
   protected void gh() {
      cba $$0 = this.gl();
      Int2ObjectMap<cbd.f[]> $$2;
      if (this.dK().G().b(cdw.c)) {
         Int2ObjectMap<cbd.f[]> $$1 = cbd.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cbd.a.get($$0.b());
      } else {
         $$2 = cbd.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cbd.f[] $$4 = (cbd.f[])$$2.get($$0.c());
         if ($$4 != null) {
            coj $$5 = this.gc();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(akk $$0, caz $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gJ() {
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
         egy $$3 = this.cG().c(10.0, 10.0, 10.0);
         List<caz> $$4 = $$0.a(caz.class, $$3);
         List<caz> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!asf.a(bim.ac, bjc.f, $$0, this.dk(), 10, 8, 6, asf.a.a).isEmpty()) {
               $$4.forEach(bsq::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dK().V()) ? false : !this.bz.a(brz.F);
   }

   @Override
   public void a(btu $$0, bii $$1) {
      if ($$0 == btu.a) {
         this.cp.a($$1.cv(), brw.d, 20);
         this.cp.a($$1.cv(), brw.c, 25);
      } else if ($$0 == btu.e) {
         this.cp.a($$1.cv(), brw.e, 2);
      } else if ($$0 == btu.c) {
         this.cp.a($$1.cv(), brw.b, 25);
      } else if ($$0 == btu.d) {
         this.cp.a($$1.cv(), brw.a, 25);
      }
   }

   @Override
   public int q() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gK() {
      this.gB();
      this.cu = 0;
   }

   public brv gv() {
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
      this.bz.a(brz.G, this.dK().V());
      this.bz.b(brz.m);
      this.bz.b(brz.E);
   }

   @Override
   public void fC() {
      super.fC();
      this.bz.a(brz.H, this.dK().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(brz.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
