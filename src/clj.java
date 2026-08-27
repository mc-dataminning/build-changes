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

public class clj extends cle implements btd, cll {
   private static final Logger ce = LogUtils.getLogger();
   private static final ajr<clk> cf = ajv.a(clj.class, ajt.u);
   public static final int ca = 12;
   public static final Map<ctj, Integer> cb = ImmutableMap.of(ctr.px, 4, ctr.ug, 1, ctr.uf, 1, ctr.vk, 1);
   private static final int cg = 2;
   private static final Set<ctj> ch = ImmutableSet.of(ctr.px, ctr.ug, ctr.uf, ctr.pw, ctr.pv, ctr.vk, new ctj[]{ctr.vl, ctr.vi, ctr.vj});
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
   private clw cr;
   private boolean cs;
   private int ct;
   private final cbo cu = new cbo();
   private long cv;
   private long cw;
   private int cx;
   private long cy;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<cbs<?>> cD = ImmutableList.of(
      cbs.b,
      cbs.c,
      cbs.d,
      cbs.e,
      cbs.g,
      cbs.h,
      cbs.i,
      cbs.j,
      cbs.k,
      cbs.l,
      cbs.L,
      cbs.aP,
      new cbs[]{cbs.m, cbs.n, cbs.q, cbs.r, cbs.t, cbs.v, cbs.w, cbs.x, cbs.y, cbs.A, cbs.f, cbs.C, cbs.D, cbs.E, cbs.H, cbs.I, cbs.J, cbs.F}
   );
   private static final ImmutableList<ccz<? extends ccy<? super clj>>> cE = ImmutableList.of(ccz.c, ccz.d, ccz.b, ccz.e, ccz.f, ccz.g, ccz.h, ccz.i, ccz.j);
   public static final Map<cbs<iw>, BiPredicate<clj, ix<cdv>>> cd = ImmutableMap.of(
      cbs.b,
      (BiPredicate<clj, ix>)($$0, $$1) -> $$1.a(cdw.n),
      cbs.c,
      (BiPredicate<clj, ix>)($$0, $$1) -> $$0.gA().b().b().test($$1),
      cbs.d,
      (BiPredicate<clj, ix>)($$0, $$1) -> clm.a.test($$1),
      cbs.e,
      (BiPredicate<clj, ix>)($$0, $$1) -> $$1.a(cdw.o)
   );

   public clj(bsa<? extends clj> $$0, dax $$1) {
      this($$0, $$1, clo.c);
   }

   public clj(bsa<? extends clj> $$0, dax $$1, clo $$2) {
      super($$0, $$1);
      ((cbz)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gA().a($$2).a(clm.b));
   }

   @Override
   public btq<clj> dS() {
      return (btq<clj>)super.dS();
   }

   @Override
   protected btq.b<clj> dT() {
      return btq.a(cD, cE);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      btq<clj> $$1 = this.dT().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aqm $$0) {
      btq<clj> $$1 = this.dS();
      $$1.b($$0, this);
      this.bE = $$1.i();
      this.a(this.dS());
   }

   private void a(btq<clj> $$0) {
      clm $$1 = this.gA().b();
      if (this.p_()) {
         $$0.a(cnn.e);
         $$0.a(cnl.d, bxn.a(0.5F));
      } else {
         $$0.a(cnn.f);
         $$0.a(cnl.c, bxn.b($$1, 0.5F), ImmutableSet.of(Pair.of(cbs.c, cbt.a)));
      }

      $$0.a(cnl.a, bxn.a($$1, 0.5F));
      $$0.a(cnl.f, bxn.d($$1, 0.5F), ImmutableSet.of(Pair.of(cbs.e, cbt.a)));
      $$0.a(cnl.e, bxn.c($$1, 0.5F));
      $$0.a(cnl.b, bxn.e($$1, 0.5F));
      $$0.a(cnl.g, bxn.f($$1, 0.5F));
      $$0.a(cnl.i, bxn.g($$1, 0.5F));
      $$0.a(cnl.h, bxn.h($$1, 0.5F));
      $$0.a(cnl.j, bxn.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cnl.a));
      $$0.b(cnl.b);
      $$0.a(cnl.b);
      $$0.a(this.dP().Z(), this.dP().Y());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof aqm) {
         this.c((aqm)this.dP());
      }
   }

   public static btv.a gy() {
      return bsq.A().a(btw.r, 0.5).a(btw.k, 48.0);
   }

   public boolean gz() {
      return this.cC;
   }

   @Override
   protected void Y() {
      this.dP().af().a("villagerBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
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

            this.b(new brc(bre.j, 200, 0));
         }
      }

      if (this.cr != null && this.dP() instanceof aqm) {
         ((aqm)this.dP()).a(cdp.e, this.cr, this);
         this.dP().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gf() && this.ah.a(100) == 0) {
         cnh $$0 = ((aqm)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gA().b() == clm.b && this.gq()) {
         this.gv();
      }

      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.t(this.s() - 1);
      }

      this.gY();
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(ctr.tJ) || !this.bD() || this.gq() || this.fL()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gL();
         return bpu.a(this.dP().B);
      } else {
         boolean $$3 = this.gr().isEmpty();
         if ($$1 == bpt.a) {
            if ($$3 && !this.dP().B) {
               this.gL();
            }

            $$0.a(avr.S);
         }

         if ($$3) {
            return bpu.a(this.dP().B);
         } else {
            if (!this.dP().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return bpu.a(this.dP().B);
         }
      }
   }

   private void gL() {
      this.t(40);
      if (!this.dP().x_()) {
         this.b(avh.AS);
      }
   }

   private void h(clw $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gA().c());
   }

   @Override
   public void f(@Nullable clw $$0) {
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
      for (czv $$0 : this.gr()) {
         $$0.n();
      }
   }

   @Override
   public boolean gB() {
      return true;
   }

   @Override
   public boolean gx() {
      return this.dP().B;
   }

   public void gC() {
      this.gR();

      for (czv $$0 : this.gr()) {
         $$0.j();
      }

      this.gN();
      this.cy = this.dP().Y();
      this.cA++;
   }

   private void gN() {
      czw $$0 = this.gr();
      clw $$1 = this.gp();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cc.j, $$0, this.gA().c(), this.u(), this.gs(), this.gB());
      }
   }

   private boolean gO() {
      for (czv $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gP() {
      return this.cA == 0 || this.cA < 2 && this.dP().Y() > this.cy + 2400L;
   }

   public boolean gD() {
      long $$0 = this.cy + 12000L;
      long $$1 = this.dP().Y();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dP().Z();
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
         for (czv $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gR();
      }

      this.gN();
   }

   private void gR() {
      for (czv $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void i(clw $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (czv $$2 : this.gr()) {
            $$2.a(-ayd.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bre.F)) {
         brc $$3 = $$0.c(bre.F);
         int $$4 = $$3.e();

         for (czv $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().I());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cf, new clk(clo.c, clm.b, 1));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      clk.c.encodeStart(ur.a, this.gA()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.ct);
      $$0.a("Gossips", this.cu.a(ur.a));
      $$0.a("Xp", this.cx);
      $$0.a("LastRestock", this.cy);
      $$0.a("LastGossipDecay", this.cw);
      $$0.a("RestocksToday", this.cA);
      if (this.cC) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         clk.c.parse(ur.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.ct = $$0.f("FoodLevel");
      }

      uj $$1 = $$0.c("Gossips", 10);
      this.cu.a(new Dynamic(ur.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cx = $$0.h("Xp");
      }

      this.cy = $$0.i("LastRestock");
      this.cw = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dP() instanceof aqm) {
         this.c((aqm)this.dP());
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
   protected avg v() {
      if (this.fL()) {
         return null;
      } else {
         return this.gq() ? avh.AT : avh.AO;
      }
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.AR;
   }

   @Override
   protected avg o_() {
      return avh.AQ;
   }

   public void gE() {
      this.b(this.gA().b().f());
   }

   @Override
   public void a(clk $$0) {
      clk $$1 = this.gA();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public clk gA() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(czv $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gp();
      if (this.gV()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new bse(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gF() {
      return this.cs;
   }

   @Override
   public void a(@Nullable bso $$0) {
      if ($$0 != null && this.dP() instanceof aqm) {
         ((aqm)this.dP()).a(cdp.c, $$0, this);
         if (this.bD() && $$0 instanceof clw) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bqn $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bru $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gS();
      super.a($$0);
   }

   private void gS() {
      this.a(cbs.b);
      this.a(cbs.c);
      this.a(cbs.d);
      this.a(cbs.e);
   }

   private void b(bru $$0) {
      if (this.dP() instanceof aqm $$1) {
         Optional<cbu> $$3 = this.bE.c(cbs.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(btd.class::isInstance).forEach($$2x -> $$1.a(cdp.d, $$0, (btd)$$2x));
         }
      }
   }

   public void a(cbs<iw> $$0) {
      if (this.dP() instanceof aqm) {
         MinecraftServer $$1 = ((aqm)this.dP()).o();
         this.bE.c($$0).ifPresent($$2 -> {
            aqm $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cds $$4 = $$3.y();
               Optional<ix<cdv>> $$5 = $$4.c($$2.b());
               BiPredicate<clj, ix<cdv>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aga.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.ct + this.gX() >= 12 && !this.fL() && this.g() == 0;
   }

   private boolean gT() {
      return this.ct < 12;
   }

   private void gU() {
      if (this.gT() && this.gX() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cto $$1 = this.y().a($$0);
            if (!$$1.e()) {
               Integer $$2 = cb.get($$1.g());
               if ($$2 != null) {
                  int $$3 = $$1.I();

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

   public int g(clw $$0) {
      return this.cu.a($$0.cz(), $$0x -> true);
   }

   private void w(int $$0) {
      this.ct -= $$0;
   }

   public void gG() {
      this.gU();
      this.w(12);
   }

   @Override
   public void b(czw $$0) {
      this.bZ = $$0;
   }

   private boolean gV() {
      int $$0 = this.gA().c();
      return clk.d($$0) && this.cx >= clk.c($$0);
   }

   private void gW() {
      this.a(this.gA().a(this.gA().c() + 1));
      this.gw();
   }

   @Override
   protected wx cr() {
      return wx.c(this.ak().g() + "." + le.z.b(this.gA().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(ky.Q);
      } else if ($$0 == 13) {
         this.a(ky.a);
      } else if ($$0 == 14) {
         this.a(ky.O);
      } else if ($$0 == 42) {
         this.a(ky.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      if ($$2 == bss.e) {
         this.a(this.gA().a(clm.b));
      }

      if ($$2 == bss.n || $$2 == bss.m || bss.a($$2) || $$2 == bss.o) {
         this.a(this.gA().a(clo.a($$0.t(this.dp()))));
      }

      if ($$2 == bss.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public clj b(aqm $$0, bro $$1) {
      double $$2 = this.ah.j();
      clo $$3;
      if ($$2 < 0.5) {
         $$3 = clo.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gA().a();
      } else {
         $$3 = ((clj)$$1).gA().a();
      }

      clj $$6 = new clj(bsa.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), bss.e, null);
      return $$6;
   }

   @Override
   public void a(aqm $$0, bsn $$1) {
      if ($$0.ak() != bpr.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cjs $$2 = bsa.bo.a((dax)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), bss.i, null);
            $$2.t(this.gf());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            $$2.fT();
            $$0.a_($$2);
            this.gS();
            this.ao();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cig $$0) {
      clh.a(this, this, $$0);
   }

   @Override
   public boolean k(cto $$0) {
      ctj $$1 = $$0.g();
      return (ch.contains($$1) || this.gA().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gH() {
      return this.gX() >= 24;
   }

   public boolean gI() {
      return this.gX() < 12;
   }

   private int gX() {
      bqd $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gJ() {
      return this.y().a_($$0 -> $$0.a(awe.by));
   }

   @Override
   protected void gw() {
      clk $$0 = this.gA();
      Int2ObjectMap<cln.g[]> $$2;
      if (this.dP().J().b(col.d)) {
         Int2ObjectMap<cln.g[]> $$1 = cln.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cln.a.get($$0.b());
      } else {
         $$2 = cln.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cln.g[] $$4 = (cln.g[])$$2.get($$0.c());
         if ($$4 != null) {
            czw $$5 = this.gr();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqm $$0, clj $$1, long $$2) {
      if (($$2 < this.cv || $$2 >= this.cv + 1200L) && ($$2 < $$1.cv || $$2 >= $$1.cv + 1200L)) {
         this.cu.a($$1.cu, this.ah, 10);
         this.cv = $$2;
         $$1.cv = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gY() {
      long $$0 = this.dP().Y();
      if (this.cw == 0L) {
         this.cw = $$0;
      } else if ($$0 >= this.cw + 24000L) {
         this.cu.b();
         this.cw = $$0;
      }
   }

   public void a(aqm $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         euf $$3 = this.cK().c(10.0, 10.0, 10.0);
         List<clj> $$4 = $$0.a(clj.class, $$3);
         List<clj> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ayv.a(bsa.af, bss.f, $$0, this.dp(), 10, 8, 6, ayv.a.a).isEmpty()) {
               $$4.forEach(cck::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Y()) ? false : !this.bE.a(cbs.F);
   }

   @Override
   public void a(cdp $$0, bru $$1) {
      if ($$0 == cdp.a) {
         this.cu.a($$1.cz(), cbp.d, 20);
         this.cu.a($$1.cz(), cbp.c, 25);
      } else if ($$0 == cdp.e) {
         this.cu.a($$1.cz(), cbp.e, 2);
      } else if ($$0 == cdp.c) {
         this.cu.a($$1.cz(), cbp.b, 25);
      } else if ($$0 == cdp.d) {
         this.cu.a($$1.cz(), cbp.a, 25);
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

   public cbo gK() {
      return this.cu;
   }

   public void a(va $$0) {
      this.cu.a(new Dynamic(ur.a, $$0));
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   @Override
   public void b(io $$0) {
      super.b($$0);
      this.bE.a(cbs.H, this.dP().Y());
      this.bE.b(cbs.m);
      this.bE.b(cbs.E);
   }

   @Override
   public void fM() {
      super.fM();
      this.bE.a(cbs.I, this.dP().Y());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bE.c(cbs.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
