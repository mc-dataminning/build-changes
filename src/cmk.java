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

public class cmk extends cmf implements bue, cmm {
   private static final Logger ce = LogUtils.getLogger();
   private static final akk<cml> cf = ako.a(cmk.class, akm.u);
   public static final int ca = 12;
   public static final Map<cuk, Integer> cb = ImmutableMap.of(cus.px, 4, cus.ug, 1, cus.uf, 1, cus.vk, 1);
   private static final int cg = 2;
   private static final Set<cuk> ch = ImmutableSet.of(cus.px, cus.ug, cus.uf, cus.pw, cus.pv, cus.vk, new cuk[]{cus.vl, cus.vi, cus.vj});
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
   private cmx cr;
   private boolean cs;
   private int ct;
   private final ccp cu = new ccp();
   private long cv;
   private long cw;
   private int cx;
   private long cz;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<cct<?>> cD = ImmutableList.of(
      cct.b,
      cct.c,
      cct.d,
      cct.e,
      cct.g,
      cct.h,
      cct.i,
      cct.j,
      cct.k,
      cct.l,
      cct.L,
      cct.aP,
      new cct[]{cct.m, cct.n, cct.q, cct.r, cct.t, cct.v, cct.w, cct.x, cct.y, cct.A, cct.f, cct.C, cct.D, cct.E, cct.H, cct.I, cct.J, cct.F}
   );
   private static final ImmutableList<cea<? extends cdz<? super cmk>>> cE = ImmutableList.of(cea.c, cea.d, cea.b, cea.e, cea.f, cea.g, cea.h, cea.i, cea.j);
   public static final Map<cct<jh>, BiPredicate<cmk, ji<cew>>> cd = ImmutableMap.of(
      cct.b,
      (BiPredicate<cmk, ji>)($$0, $$1) -> $$1.a(cex.n),
      cct.c,
      (BiPredicate<cmk, ji>)($$0, $$1) -> $$0.gB().b().b().test($$1),
      cct.d,
      (BiPredicate<cmk, ji>)($$0, $$1) -> cmn.a.test($$1),
      cct.e,
      (BiPredicate<cmk, ji>)($$0, $$1) -> $$1.a(cex.o)
   );

   public cmk(bta<? extends cmk> $$0, dby $$1) {
      this($$0, $$1, cmp.c);
   }

   public cmk(bta<? extends cmk> $$0, dby $$1, cmp $$2) {
      super($$0, $$1);
      ((cda)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gB().a($$2).a(cmn.b));
   }

   @Override
   public bur<cmk> dS() {
      return (bur<cmk>)super.dS();
   }

   @Override
   protected bur.b<cmk> dT() {
      return bur.a(cD, cE);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      bur<cmk> $$1 = this.dT().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(arf $$0) {
      bur<cmk> $$1 = this.dS();
      $$1.b($$0, this);
      this.bD = $$1.i();
      this.a(this.dS());
   }

   private void a(bur<cmk> $$0) {
      cmn $$1 = this.gB().b();
      if (this.p_()) {
         $$0.a(cop.e);
         $$0.a(com.d, byo.a(0.5F));
      } else {
         $$0.a(cop.f);
         $$0.a(com.c, byo.b($$1, 0.5F), ImmutableSet.of(Pair.of(cct.c, ccu.a)));
      }

      $$0.a(com.a, byo.a($$1, 0.5F));
      $$0.a(com.f, byo.d($$1, 0.5F), ImmutableSet.of(Pair.of(cct.e, ccu.a)));
      $$0.a(com.e, byo.c($$1, 0.5F));
      $$0.a(com.b, byo.e($$1, 0.5F));
      $$0.a(com.g, byo.f($$1, 0.5F));
      $$0.a(com.i, byo.g($$1, 0.5F));
      $$0.a(com.h, byo.h($$1, 0.5F));
      $$0.a(com.j, byo.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.a(com.b);
      $$0.a(this.dP().aa(), this.dP().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof arf) {
         this.c((arf)this.dP());
      }
   }

   public static buw.a gz() {
      return btr.A().a(bux.r, 0.5).a(bux.k, 48.0);
   }

   public boolean gA() {
      return this.cC;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("villagerBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      if (this.cC) {
         this.cC = false;
      }

      if (!this.gr() && this.cp > 0) {
         this.cp--;
         if (this.cp <= 0) {
            if (this.cq) {
               this.gX();
               this.cq = false;
            }

            this.b(new bsc(bse.j, 200, 0));
         }
      }

      if (this.cr != null && this.dP() instanceof arf) {
         ((arf)this.dP()).a(ceq.e, this.cr, this);
         this.dP().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gg() && this.ah.a(100) == 0) {
         coi $$0 = ((arf)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gB().b() == cmn.b && this.gr()) {
         this.gw();
      }

      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.t(this.s() - 1);
      }

      this.gZ();
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$2.a(cus.tJ) || !this.bD() || this.gr() || this.fL()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gM();
         return bqu.a(this.dP().B);
      } else {
         boolean $$3 = this.gs().isEmpty();
         if ($$1 == bqt.a) {
            if ($$3 && !this.dP().B) {
               this.gM();
            }

            $$0.a(awk.S);
         }

         if ($$3) {
            return bqu.a(this.dP().B);
         } else {
            if (!this.dP().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return bqu.a(this.dP().B);
         }
      }
   }

   private void gM() {
      this.t(40);
      if (!this.dP().x_()) {
         this.b(awa.AS);
      }
   }

   private void h(cmx $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gB().c());
   }

   @Override
   public void f(@Nullable cmx $$0) {
      boolean $$1 = this.gq() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gw();
      }
   }

   @Override
   protected void gw() {
      super.gw();
      this.gN();
   }

   private void gN() {
      for (daw $$0 : this.gs()) {
         $$0.n();
      }
   }

   @Override
   public boolean gC() {
      return true;
   }

   @Override
   public boolean gy() {
      return this.dP().B;
   }

   public void gD() {
      this.gS();

      for (daw $$0 : this.gs()) {
         $$0.j();
      }

      this.gO();
      this.cz = this.dP().Z();
      this.cA++;
   }

   private void gO() {
      dax $$0 = this.gs();
      cmx $$1 = this.gq();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cb.j, $$0, this.gB().c(), this.u(), this.gt(), this.gC());
      }
   }

   private boolean gP() {
      for (daw $$0 : this.gs()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gQ() {
      return this.cA == 0 || this.cA < 2 && this.dP().Z() > this.cz + 2400L;
   }

   public boolean gE() {
      long $$0 = this.cz + 12000L;
      long $$1 = this.dP().Z();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dP().aa();
      if (this.cB > 0L) {
         long $$4 = this.cB / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cB = $$3;
      if ($$2) {
         this.cz = $$1;
         this.ha();
      }

      return this.gQ() && this.gP();
   }

   private void gR() {
      int $$0 = 2 - this.cA;
      if ($$0 > 0) {
         for (daw $$1 : this.gs()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gS();
      }

      this.gO();
   }

   private void gS() {
      for (daw $$0 : this.gs()) {
         $$0.g();
      }
   }

   private void i(cmx $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (daw $$2 : this.gs()) {
            $$2.a(-ayz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bse.F)) {
         bsc $$3 = $$0.c(bse.F);
         int $$4 = $$3.e();

         for (daw $$5 : this.gs()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().I());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, new cml(cmp.c, cmn.b, 1));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      cml.c.encodeStart(vg.a, this.gB()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.ct);
      $$0.a("Gossips", this.cu.a(vg.a));
      $$0.a("Xp", this.cx);
      $$0.a("LastRestock", this.cz);
      $$0.a("LastGossipDecay", this.cw);
      $$0.a("RestocksToday", this.cA);
      if (this.cC) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cml.c.parse(vg.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.ct = $$0.f("FoodLevel");
      }

      uy $$1 = $$0.c("Gossips", 10);
      this.cu.a(new Dynamic(vg.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cx = $$0.h("Xp");
      }

      this.cz = $$0.i("LastRestock");
      this.cw = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dP() instanceof arf) {
         this.c((arf)this.dP());
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
   protected avz v() {
      if (this.fL()) {
         return null;
      } else {
         return this.gr() ? awa.AT : awa.AO;
      }
   }

   @Override
   protected avz d(brn $$0) {
      return awa.AR;
   }

   @Override
   protected avz o_() {
      return awa.AQ;
   }

   public void gF() {
      this.b(this.gB().b().f());
   }

   @Override
   public void a(cml $$0) {
      cml $$1 = this.gB();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public cml gB() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(daw $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gq();
      if (this.gW()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new btf(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gG() {
      return this.cs;
   }

   @Override
   public void a(@Nullable btp $$0) {
      if ($$0 != null && this.dP() instanceof arf) {
         ((arf)this.dP()).a(ceq.c, $$0, this);
         if (this.bD() && $$0 instanceof cmx) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(brn $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bsu $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gT();
      super.a($$0);
   }

   private void gT() {
      this.a(cct.b);
      this.a(cct.c);
      this.a(cct.d);
      this.a(cct.e);
   }

   private void b(bsu $$0) {
      if (this.dP() instanceof arf $$1) {
         Optional<ccv> $$3 = this.bD.c(cct.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bue.class::isInstance).forEach($$2x -> $$1.a(ceq.d, $$0, (bue)$$2x));
         }
      }
   }

   public void a(cct<jh> $$0) {
      if (this.dP() instanceof arf) {
         MinecraftServer $$1 = ((arf)this.dP()).o();
         this.bD.c($$0).ifPresent($$2 -> {
            arf $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cet $$4 = $$3.y();
               Optional<ji<cew>> $$5 = $$4.c($$2.b());
               BiPredicate<cmk, ji<cew>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agt.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.ct + this.gY() >= 12 && !this.fL() && this.g() == 0;
   }

   private boolean gU() {
      return this.ct < 12;
   }

   private void gV() {
      if (this.gU() && this.gY() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cup $$1 = this.y().a($$0);
            if (!$$1.e()) {
               Integer $$2 = cb.get($$1.g());
               if ($$2 != null) {
                  int $$3 = $$1.I();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.ct = this.ct + $$2;
                     this.y().a($$0, 1);
                     if (!this.gU()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cmx $$0) {
      return this.cu.a($$0.cz(), $$0x -> true);
   }

   private void w(int $$0) {
      this.ct -= $$0;
   }

   public void gH() {
      this.gV();
      this.w(12);
   }

   @Override
   public void b(dax $$0) {
      this.bZ = $$0;
   }

   private boolean gW() {
      int $$0 = this.gB().c();
      return cml.d($$0) && this.cx >= cml.c($$0);
   }

   private void gX() {
      this.a(this.gB().a(this.gB().c() + 1));
      this.gx();
   }

   @Override
   protected xp cr() {
      return xp.c(this.ak().g() + "." + lp.z.b(this.gB().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(li.Q);
      } else if ($$0 == 13) {
         this.a(li.a);
      } else if ($$0 == 14) {
         this.a(li.O);
      } else if ($$0 == 42) {
         this.a(li.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      if ($$2 == btt.e) {
         this.a(this.gB().a(cmn.b));
      }

      if ($$2 == btt.n || $$2 == btt.m || btt.a($$2) || $$2 == btt.o) {
         this.a(this.gB().a(cmp.a($$0.t(this.dp()))));
      }

      if ($$2 == btt.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cmk b(arf $$0, bso $$1) {
      double $$2 = this.ah.j();
      cmp $$3;
      if ($$2 < 0.5) {
         $$3 = cmp.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gB().a();
      } else {
         $$3 = ((cmk)$$1).gB().a();
      }

      cmk $$6 = new cmk(bta.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), btt.e, null);
      return $$6;
   }

   @Override
   public void a(arf $$0, bto $$1) {
      if ($$0.al() != bqr.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         ckt $$2 = bta.bo.a((dby)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), btt.i, null);
            $$2.t(this.gg());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            $$2.fU();
            $$0.a_($$2);
            this.gT();
            this.ao();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cjh $$0) {
      cmi.a(this, this, $$0);
   }

   @Override
   public boolean k(cup $$0) {
      cuk $$1 = $$0.g();
      return (ch.contains($$1) || this.gB().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gI() {
      return this.gY() >= 24;
   }

   public boolean gJ() {
      return this.gY() < 12;
   }

   private int gY() {
      brd $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gK() {
      return this.y().a_($$0 -> $$0.a(awy.bx));
   }

   @Override
   protected void gx() {
      cml $$0 = this.gB();
      Int2ObjectMap<cmo.g[]> $$2;
      if (this.dP().J().b(cpn.d)) {
         Int2ObjectMap<cmo.g[]> $$1 = cmo.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmo.a.get($$0.b());
      } else {
         $$2 = cmo.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmo.g[] $$4 = (cmo.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dax $$5 = this.gs();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arf $$0, cmk $$1, long $$2) {
      if (($$2 < this.cv || $$2 >= this.cv + 1200L) && ($$2 < $$1.cv || $$2 >= $$1.cv + 1200L)) {
         this.cu.a($$1.cu, this.ah, 10);
         this.cv = $$2;
         $$1.cv = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gZ() {
      long $$0 = this.dP().Z();
      if (this.cw == 0L) {
         this.cw = $$0;
      } else if ($$0 >= this.cw + 24000L) {
         this.cu.b();
         this.cw = $$0;
      }
   }

   public void a(arf $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         evm $$3 = this.cK().c(10.0, 10.0, 10.0);
         List<cmk> $$4 = $$0.a(cmk.class, $$3);
         List<cmk> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azs.a(bta.af, btt.f, $$0, this.dp(), 10, 8, 6, azs.a.a).isEmpty()) {
               $$4.forEach(cdl::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Z()) ? false : !this.bD.a(cct.F);
   }

   @Override
   public void a(ceq $$0, bsu $$1) {
      if ($$0 == ceq.a) {
         this.cu.a($$1.cz(), ccq.d, 20);
         this.cu.a($$1.cz(), ccq.c, 25);
      } else if ($$0 == ceq.e) {
         this.cu.a($$1.cz(), ccq.e, 2);
      } else if ($$0 == ceq.c) {
         this.cu.a($$1.cz(), ccq.b, 25);
      } else if ($$0 == ceq.d) {
         this.cu.a($$1.cz(), ccq.a, 25);
      }
   }

   @Override
   public int u() {
      return this.cx;
   }

   public void v(int $$0) {
      this.cx = $$0;
   }

   private void ha() {
      this.gR();
      this.cA = 0;
   }

   public ccp gL() {
      return this.cu;
   }

   public void a(vp $$0) {
      this.cu.a(new Dynamic(vg.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void b(iz $$0) {
      super.b($$0);
      this.bD.a(cct.H, this.dP().Z());
      this.bD.b(cct.m);
      this.bD.b(cct.E);
   }

   @Override
   public void fM() {
      super.fM();
      this.bD.a(cct.I, this.dP().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bD.c(cct.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
