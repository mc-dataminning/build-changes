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
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cku extends ckp implements bso, ckw {
   private static final Logger ce = LogUtils.getLogger();
   private static final ajm<ckv> cf = ajq.a(cku.class, ajo.u);
   public static final int ca = 12;
   public static final Map<csu, Integer> cb = ImmutableMap.of(ctc.px, 4, ctc.ug, 1, ctc.uf, 1, ctc.vk, 1);
   private static final int cg = 2;
   private static final Set<csu> ch = ImmutableSet.of(ctc.px, ctc.ug, ctc.uf, ctc.pw, ctc.pv, ctc.vk, new csu[]{ctc.vl, ctc.vi, ctc.vj});
   private static final int ci = 10;
   private static final int cj = 1200;
   private static final int ck = 24000;
   private static final int cl = 25;
   private static final int cm = 10;
   private static final int cn = 5;
   private static final long co = 24000L;
   @VisibleForTesting
   public static final float cc = 0.5F;
   private int cp;
   private boolean cq;
   @Nullable
   private clh cr;
   private boolean cs;
   private int ct;
   private final caz cu = new caz();
   private long cv;
   private long cw;
   private int cx;
   private long cy;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<cbd<?>> cD = ImmutableList.of(
      cbd.b,
      cbd.c,
      cbd.d,
      cbd.e,
      cbd.g,
      cbd.h,
      cbd.i,
      cbd.j,
      cbd.k,
      cbd.l,
      cbd.L,
      cbd.aP,
      new cbd[]{cbd.m, cbd.n, cbd.q, cbd.r, cbd.t, cbd.v, cbd.w, cbd.x, cbd.y, cbd.A, cbd.f, cbd.C, cbd.D, cbd.E, cbd.H, cbd.I, cbd.J, cbd.F}
   );
   private static final ImmutableList<cck<? extends ccj<? super cku>>> cE = ImmutableList.of(cck.c, cck.d, cck.b, cck.e, cck.f, cck.g, cck.h, cck.i, cck.j);
   public static final Map<cbd<iv>, BiPredicate<cku, iw<cdg>>> cd = ImmutableMap.of(
      cbd.b,
      (BiPredicate<cku, iw>)($$0, $$1) -> $$1.a(cdh.n),
      cbd.c,
      (BiPredicate<cku, iw>)($$0, $$1) -> $$0.gA().b().b().test($$1),
      cbd.d,
      (BiPredicate<cku, iw>)($$0, $$1) -> ckx.a.test($$1),
      cbd.e,
      (BiPredicate<cku, iw>)($$0, $$1) -> $$1.a(cdh.o)
   );

   public cku(brn<? extends cku> $$0, dad $$1) {
      this($$0, $$1, ckz.c);
   }

   public cku(brn<? extends cku> $$0, dad $$1, ckz $$2) {
      super($$0, $$1);
      ((cbk)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gA().a($$2).a(ckx.b));
   }

   @Override
   public btb<cku> dQ() {
      return (btb<cku>)super.dQ();
   }

   @Override
   protected btb.b<cku> dR() {
      return btb.a(cD, cE);
   }

   @Override
   protected btb<?> a(Dynamic<?> $$0) {
      btb<cku> $$1 = this.dR().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aqh $$0) {
      btb<cku> $$1 = this.dQ();
      $$1.b($$0, this);
      this.bE = $$1.i();
      this.a(this.dQ());
   }

   private void a(btb<cku> $$0) {
      ckx $$1 = this.gA().b();
      if (this.p_()) {
         $$0.a(cmy.e);
         $$0.a(cmw.d, bwy.a(0.5F));
      } else {
         $$0.a(cmy.f);
         $$0.a(cmw.c, bwy.b($$1, 0.5F), ImmutableSet.of(Pair.of(cbd.c, cbe.a)));
      }

      $$0.a(cmw.a, bwy.a($$1, 0.5F));
      $$0.a(cmw.f, bwy.d($$1, 0.5F), ImmutableSet.of(Pair.of(cbd.e, cbe.a)));
      $$0.a(cmw.e, bwy.c($$1, 0.5F));
      $$0.a(cmw.b, bwy.e($$1, 0.5F));
      $$0.a(cmw.g, bwy.f($$1, 0.5F));
      $$0.a(cmw.i, bwy.g($$1, 0.5F));
      $$0.a(cmw.h, bwy.h($$1, 0.5F));
      $$0.a(cmw.j, bwy.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cmw.a));
      $$0.b(cmw.b);
      $$0.a(cmw.b);
      $$0.a(this.dN().Z(), this.dN().Y());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dN() instanceof aqh) {
         this.c((aqh)this.dN());
      }
   }

   public static btg.a gy() {
      return bsc.A().a(bth.r, 0.5).a(bth.k, 48.0);
   }

   public boolean gz() {
      return this.cC;
   }

   @Override
   protected void Y() {
      this.dN().af().a("villagerBrain");
      this.dQ().a((aqh)this.dN(), this);
      this.dN().af().c();
      if (this.cC) {
         this.cC = false;
      }

      if (!this.gq() && this.cp > 0) {
         this.cp--;
         if (this.cp <= 0) {
            if (this.cq) {
               this.gW();
               this.cq = false;
            }

            this.b(new bqt(bqv.j, 200, 0));
         }
      }

      if (this.cr != null && this.dN() instanceof aqh) {
         ((aqh)this.dN()).a(cda.e, this.cr, this);
         this.dN().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gf() && this.ah.a(100) == 0) {
         cms $$0 = ((aqh)this.dN()).d(this.dn());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dN().a(this, (byte)42);
         }
      }

      if (this.gA().b() == ckx.b && this.gq()) {
         this.gv();
      }

      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.r() > 0) {
         this.t(this.r() - 1);
      }

      this.gY();
   }

   @Override
   public bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.tJ) || !this.bB() || this.gq() || this.fJ()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gL();
         return bpm.a(this.dN().B);
      } else {
         boolean $$3 = this.gr().isEmpty();
         if ($$1 == bpl.a) {
            if ($$3 && !this.dN().B) {
               this.gL();
            }

            $$0.a(avm.S);
         }

         if ($$3) {
            return bpm.a(this.dN().B);
         } else {
            if (!this.dN().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return bpm.a(this.dN().B);
         }
      }
   }

   private void gL() {
      this.t(40);
      if (!this.dN().x_()) {
         this.b(avc.AH);
      }
   }

   private void h(clh $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gA().c());
   }

   @Override
   public void f(@Nullable clh $$0) {
      boolean $$1 = this.gp() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gv();
      }
   }

   @Override
   protected void gv() {
      super.gv();
      this.gM();
   }

   private void gM() {
      for (czb $$0 : this.gr()) {
         $$0.n();
      }
   }

   @Override
   public boolean gB() {
      return true;
   }

   @Override
   public boolean gx() {
      return this.dN().B;
   }

   public void gC() {
      this.gR();

      for (czb $$0 : this.gr()) {
         $$0.j();
      }

      this.gN();
      this.cy = this.dN().Y();
      this.cA++;
   }

   private void gN() {
      czc $$0 = this.gr();
      clh $$1 = this.gp();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cc.j, $$0, this.gA().c(), this.u(), this.gs(), this.gB());
      }
   }

   private boolean gO() {
      for (czb $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gP() {
      return this.cA == 0 || this.cA < 2 && this.dN().Y() > this.cy + 2400L;
   }

   public boolean gD() {
      long $$0 = this.cy + 12000L;
      long $$1 = this.dN().Y();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dN().Z();
      if (this.cB > 0L) {
         long $$4 = this.cB / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cB = $$3;
      if ($$2) {
         this.cy = $$1;
         this.gZ();
      }

      return this.gP() && this.gO();
   }

   private void gQ() {
      int $$0 = 2 - this.cA;
      if ($$0 > 0) {
         for (czb $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gR();
      }

      this.gN();
   }

   private void gR() {
      for (czb $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void i(clh $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (czb $$2 : this.gr()) {
            $$2.a(-axz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bqv.F)) {
         bqt $$3 = $$0.c(bqv.F);
         int $$4 = $$3.e();

         for (czb $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().G());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cf, new ckv(ckz.c, ckx.b, 1));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      ckv.c.encodeStart(uo.a, this.gA()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.ct);
      $$0.a("Gossips", this.cu.a(uo.a));
      $$0.a("Xp", this.cx);
      $$0.a("LastRestock", this.cy);
      $$0.a("LastGossipDecay", this.cw);
      $$0.a("RestocksToday", this.cA);
      if (this.cC) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         ckv.c.parse(uo.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.ct = $$0.f("FoodLevel");
      }

      ug $$1 = $$0.c("Gossips", 10);
      this.cu.a(new Dynamic(uo.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cx = $$0.h("Xp");
      }

      this.cy = $$0.i("LastRestock");
      this.cw = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dN() instanceof aqh) {
         this.c((aqh)this.dN());
      }

      this.cA = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cC = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected avb v() {
      if (this.fJ()) {
         return null;
      } else {
         return this.gq() ? avc.AI : avc.AD;
      }
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.AG;
   }

   @Override
   protected avb o_() {
      return avc.AF;
   }

   public void gE() {
      this.b(this.gA().b().f());
   }

   @Override
   public void a(ckv $$0) {
      ckv $$1 = this.gA();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public ckv gA() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(czb $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gp();
      if (this.gV()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dN().b(new brq(this.dN(), this.ds(), this.du() + 0.5, this.dy(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gF() {
      return this.cs;
   }

   @Override
   public void a(@Nullable bsa $$0) {
      if ($$0 != null && this.dN() instanceof aqh) {
         ((aqh)this.dN()).a(cda.c, $$0, this);
         if (this.bB() && $$0 instanceof clh) {
            this.dN().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bqf $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      brh $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gS();
      super.a($$0);
   }

   private void gS() {
      this.a(cbd.b);
      this.a(cbd.c);
      this.a(cbd.d);
      this.a(cbd.e);
   }

   private void b(brh $$0) {
      if (this.dN() instanceof aqh $$1) {
         Optional<cbf> $$3 = this.bE.c(cbd.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bso.class::isInstance).forEach($$2x -> $$1.a(cda.d, $$0, (bso)$$2x));
         }
      }
   }

   public void a(cbd<iv> $$0) {
      if (this.dN() instanceof aqh) {
         MinecraftServer $$1 = ((aqh)this.dN()).o();
         this.bE.c($$0).ifPresent($$2 -> {
            aqh $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cdd $$4 = $$3.y();
               Optional<iw<cdg>> $$5 = $$4.c($$2.b());
               BiPredicate<cku, iw<cdg>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  afw.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.ct + this.gX() >= 12 && !this.fJ() && this.g() == 0;
   }

   private boolean gT() {
      return this.ct < 12;
   }

   private void gU() {
      if (this.gT() && this.gX() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            csz $$1 = this.y().a($$0);
            if (!$$1.d()) {
               Integer $$2 = cb.get($$1.f());
               if ($$2 != null) {
                  int $$3 = $$1.G();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.ct = this.ct + $$2;
                     this.y().a($$0, 1);
                     if (!this.gT()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(clh $$0) {
      return this.cu.a($$0.cx(), $$0x -> true);
   }

   private void w(int $$0) {
      this.ct -= $$0;
   }

   public void gG() {
      this.gU();
      this.w(12);
   }

   @Override
   public void b(czc $$0) {
      this.bZ = $$0;
   }

   private boolean gV() {
      int $$0 = this.gA().c();
      return ckv.d($$0) && this.cx >= ckv.c($$0);
   }

   private void gW() {
      this.a(this.gA().a(this.gA().c() + 1));
      this.gw();
   }

   @Override
   protected wu cp() {
      return wu.c(this.ai().g() + "." + ld.z.b(this.gA().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(kx.O);
      } else if ($$0 == 13) {
         this.a(kx.a);
      } else if ($$0 == 14) {
         this.a(kx.M);
      } else if ($$0 == 42) {
         this.a(kx.aj);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      if ($$2 == bse.e) {
         this.a(this.gA().a(ckx.b));
      }

      if ($$2 == bse.n || $$2 == bse.m || bse.a($$2) || $$2 == bse.o) {
         this.a(this.gA().a(ckz.a($$0.t(this.dn()))));
      }

      if ($$2 == bse.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cku b(aqh $$0, brb $$1) {
      double $$2 = this.ah.j();
      ckz $$3;
      if ($$2 < 0.5) {
         $$3 = ckz.a($$0.t(this.dn()));
      } else if ($$2 < 0.75) {
         $$3 = this.gA().a();
      } else {
         $$3 = ((cku)$$1).gA().a();
      }

      cku $$6 = new cku(brn.bi, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dn()), bse.e, null);
      return $$6;
   }

   @Override
   public void a(aqh $$0, brz $$1) {
      if ($$0.ak() != bpj.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cjd $$2 = brn.bn.a((dad)$$0);
         if ($$2 != null) {
            $$2.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$2.a($$0, $$0.d_($$2.dn()), bse.i, null);
            $$2.t(this.gf());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.o(this.cC());
            }

            $$2.fT();
            $$0.a_($$2);
            this.gS();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(chr $$0) {
      cks.a(this, this, $$0);
   }

   @Override
   public boolean k(csz $$0) {
      csu $$1 = $$0.f();
      return (ch.contains($$1) || this.gA().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gH() {
      return this.gX() >= 24;
   }

   public boolean gI() {
      return this.gX() < 12;
   }

   private int gX() {
      bpv $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gJ() {
      return this.y().a_($$0 -> $$0.a(avz.by));
   }

   @Override
   protected void gw() {
      ckv $$0 = this.gA();
      Int2ObjectMap<cky.g[]> $$2;
      if (this.dN().J().b(cnw.d)) {
         Int2ObjectMap<cky.g[]> $$1 = cky.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cky.a.get($$0.b());
      } else {
         $$2 = cky.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cky.g[] $$4 = (cky.g[])$$2.get($$0.c());
         if ($$4 != null) {
            czc $$5 = this.gr();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqh $$0, cku $$1, long $$2) {
      if (($$2 < this.cv || $$2 >= this.cv + 1200L) && ($$2 < $$1.cv || $$2 >= $$1.cv + 1200L)) {
         this.cu.a($$1.cu, this.ah, 10);
         this.cv = $$2;
         $$1.cv = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gY() {
      long $$0 = this.dN().Y();
      if (this.cw == 0L) {
         this.cw = $$0;
      } else if ($$0 >= this.cw + 24000L) {
         this.cu.b();
         this.cw = $$0;
      }
   }

   public void a(aqh $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         etk $$3 = this.cI().c(10.0, 10.0, 10.0);
         List<cku> $$4 = $$0.a(cku.class, $$3);
         List<cku> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ayr.a(brn.af, bse.f, $$0, this.dn(), 10, 8, 6, ayr.a.a).isEmpty()) {
               $$4.forEach(cbv::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dN().Y()) ? false : !this.bE.a(cbd.F);
   }

   @Override
   public void a(cda $$0, brh $$1) {
      if ($$0 == cda.a) {
         this.cu.a($$1.cx(), cba.d, 20);
         this.cu.a($$1.cx(), cba.c, 25);
      } else if ($$0 == cda.e) {
         this.cu.a($$1.cx(), cba.e, 2);
      } else if ($$0 == cda.c) {
         this.cu.a($$1.cx(), cba.b, 25);
      } else if ($$0 == cda.d) {
         this.cu.a($$1.cx(), cba.a, 25);
      }
   }

   @Override
   public int u() {
      return this.cx;
   }

   public void v(int $$0) {
      this.cx = $$0;
   }

   private void gZ() {
      this.gQ();
      this.cA = 0;
   }

   public caz gK() {
      return this.cu;
   }

   public void a(ux $$0) {
      this.cu.a(new Dynamic(uo.a, $$0));
   }

   @Override
   protected void X() {
      super.X();
      afw.a(this);
   }

   @Override
   public void b(in $$0) {
      super.b($$0);
      this.bE.a(cbd.H, this.dN().Y());
      this.bE.b(cbd.m);
      this.bE.b(cbd.E);
   }

   @Override
   public void fK() {
      super.fK();
      this.bE.a(cbd.I, this.dN().Y());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bE.c(cbd.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
