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

public class cmm extends cmh implements bug, cmo {
   private static final Logger ce = LogUtils.getLogger();
   private static final akk<cmn> cf = ako.a(cmm.class, akm.u);
   public static final int ca = 12;
   public static final Map<cum, Integer> cb = ImmutableMap.of(cuu.px, 4, cuu.ug, 1, cuu.uf, 1, cuu.vk, 1);
   private static final int cg = 2;
   private static final Set<cum> ch = ImmutableSet.of(cuu.px, cuu.ug, cuu.uf, cuu.pw, cuu.pv, cuu.vk, new cum[]{cuu.vl, cuu.vi, cuu.vj});
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
   private cmz cr;
   private boolean cs;
   private int ct;
   private final ccr cu = new ccr();
   private long cv;
   private long cw;
   private int cx;
   private long cz;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<ccv<?>> cD = ImmutableList.of(
      ccv.b,
      ccv.c,
      ccv.d,
      ccv.e,
      ccv.g,
      ccv.h,
      ccv.i,
      ccv.j,
      ccv.k,
      ccv.l,
      ccv.L,
      ccv.aP,
      new ccv[]{ccv.m, ccv.n, ccv.q, ccv.r, ccv.t, ccv.v, ccv.w, ccv.x, ccv.y, ccv.A, ccv.f, ccv.C, ccv.D, ccv.E, ccv.H, ccv.I, ccv.J, ccv.F}
   );
   private static final ImmutableList<cec<? extends ceb<? super cmm>>> cE = ImmutableList.of(cec.c, cec.d, cec.b, cec.e, cec.f, cec.g, cec.h, cec.i, cec.j);
   public static final Map<ccv<jh>, BiPredicate<cmm, ji<cey>>> cd = ImmutableMap.of(
      ccv.b,
      (BiPredicate<cmm, ji>)($$0, $$1) -> $$1.a(cez.n),
      ccv.c,
      (BiPredicate<cmm, ji>)($$0, $$1) -> $$0.gB().b().b().test($$1),
      ccv.d,
      (BiPredicate<cmm, ji>)($$0, $$1) -> cmp.a.test($$1),
      ccv.e,
      (BiPredicate<cmm, ji>)($$0, $$1) -> $$1.a(cez.o)
   );

   public cmm(btc<? extends cmm> $$0, dca $$1) {
      this($$0, $$1, cmr.c);
   }

   public cmm(btc<? extends cmm> $$0, dca $$1, cmr $$2) {
      super($$0, $$1);
      ((cdc)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gB().a($$2).a(cmp.b));
   }

   @Override
   public but<cmm> dS() {
      return (but<cmm>)super.dS();
   }

   @Override
   protected but.b<cmm> dT() {
      return but.a(cD, cE);
   }

   @Override
   protected but<?> a(Dynamic<?> $$0) {
      but<cmm> $$1 = this.dT().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(arf $$0) {
      but<cmm> $$1 = this.dS();
      $$1.b($$0, this);
      this.bD = $$1.i();
      this.a(this.dS());
   }

   private void a(but<cmm> $$0) {
      cmp $$1 = this.gB().b();
      if (this.p_()) {
         $$0.a(cor.e);
         $$0.a(cop.d, byq.a(0.5F));
      } else {
         $$0.a(cor.f);
         $$0.a(cop.c, byq.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccv.c, ccw.a)));
      }

      $$0.a(cop.a, byq.a($$1, 0.5F));
      $$0.a(cop.f, byq.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccv.e, ccw.a)));
      $$0.a(cop.e, byq.c($$1, 0.5F));
      $$0.a(cop.b, byq.e($$1, 0.5F));
      $$0.a(cop.g, byq.f($$1, 0.5F));
      $$0.a(cop.i, byq.g($$1, 0.5F));
      $$0.a(cop.h, byq.h($$1, 0.5F));
      $$0.a(cop.j, byq.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cop.a));
      $$0.b(cop.b);
      $$0.a(cop.b);
      $$0.a(this.dP().aa(), this.dP().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof arf) {
         this.c((arf)this.dP());
      }
   }

   public static buy.a gz() {
      return btt.A().a(buz.r, 0.5).a(buz.k, 48.0);
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

            this.b(new bse(bsg.j, 200, 0));
         }
      }

      if (this.cr != null && this.dP() instanceof arf) {
         ((arf)this.dP()).a(ces.e, this.cr, this);
         this.dP().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gg() && this.ah.a(100) == 0) {
         cok $$0 = ((arf)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gB().b() == cmp.b && this.gr()) {
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
   public bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if ($$2.a(cuu.tJ) || !this.bD() || this.gr() || this.fL()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gM();
         return bqw.a(this.dP().B);
      } else {
         boolean $$3 = this.gs().isEmpty();
         if ($$1 == bqv.a) {
            if ($$3 && !this.dP().B) {
               this.gM();
            }

            $$0.a(awk.S);
         }

         if ($$3) {
            return bqw.a(this.dP().B);
         } else {
            if (!this.dP().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return bqw.a(this.dP().B);
         }
      }
   }

   private void gM() {
      this.t(40);
      if (!this.dP().x_()) {
         this.b(awa.AS);
      }
   }

   private void h(cmz $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gB().c());
   }

   @Override
   public void f(@Nullable cmz $$0) {
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
      for (day $$0 : this.gs()) {
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

      for (day $$0 : this.gs()) {
         $$0.j();
      }

      this.gO();
      this.cz = this.dP().Z();
      this.cA++;
   }

   private void gO() {
      daz $$0 = this.gs();
      cmz $$1 = this.gq();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cb.j, $$0, this.gB().c(), this.u(), this.gt(), this.gC());
      }
   }

   private boolean gP() {
      for (day $$0 : this.gs()) {
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
         for (day $$1 : this.gs()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gS();
      }

      this.gO();
   }

   private void gS() {
      for (day $$0 : this.gs()) {
         $$0.g();
      }
   }

   private void i(cmz $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (day $$2 : this.gs()) {
            $$2.a(-ayz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bsg.F)) {
         bse $$3 = $$0.c(bsg.F);
         int $$4 = $$3.e();

         for (day $$5 : this.gs()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().I());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, new cmn(cmr.c, cmp.b, 1));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      cmn.c.encodeStart(vg.a, this.gB()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         cmn.c.parse(vg.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
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
   protected avz d(brp $$0) {
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
   public void a(cmn $$0) {
      cmn $$1 = this.gB();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public cmn gB() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(day $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gq();
      if (this.gW()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new bth(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gG() {
      return this.cs;
   }

   @Override
   public void a(@Nullable btr $$0) {
      if ($$0 != null && this.dP() instanceof arf) {
         ((arf)this.dP()).a(ces.c, $$0, this);
         if (this.bD() && $$0 instanceof cmz) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(brp $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bsw $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gT();
      super.a($$0);
   }

   private void gT() {
      this.a(ccv.b);
      this.a(ccv.c);
      this.a(ccv.d);
      this.a(ccv.e);
   }

   private void b(bsw $$0) {
      if (this.dP() instanceof arf $$1) {
         Optional<ccx> $$3 = this.bD.c(ccv.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bug.class::isInstance).forEach($$2x -> $$1.a(ces.d, $$0, (bug)$$2x));
         }
      }
   }

   public void a(ccv<jh> $$0) {
      if (this.dP() instanceof arf) {
         MinecraftServer $$1 = ((arf)this.dP()).o();
         this.bD.c($$0).ifPresent($$2 -> {
            arf $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cev $$4 = $$3.y();
               Optional<ji<cey>> $$5 = $$4.c($$2.b());
               BiPredicate<cmm, ji<cey>> $$6 = cd.get($$0);
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
            cur $$1 = this.y().a($$0);
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

   public int g(cmz $$0) {
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
   public void b(daz $$0) {
      this.bZ = $$0;
   }

   private boolean gW() {
      int $$0 = this.gB().c();
      return cmn.d($$0) && this.cx >= cmn.c($$0);
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
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      if ($$2 == btv.e) {
         this.a(this.gB().a(cmp.b));
      }

      if ($$2 == btv.n || $$2 == btv.m || btv.a($$2) || $$2 == btv.o) {
         this.a(this.gB().a(cmr.a($$0.t(this.dp()))));
      }

      if ($$2 == btv.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cmm b(arf $$0, bsq $$1) {
      double $$2 = this.ah.j();
      cmr $$3;
      if ($$2 < 0.5) {
         $$3 = cmr.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gB().a();
      } else {
         $$3 = ((cmm)$$1).gB().a();
      }

      cmm $$6 = new cmm(btc.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), btv.e, null);
      return $$6;
   }

   @Override
   public void a(arf $$0, btq $$1) {
      if ($$0.al() != bqt.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         ckv $$2 = btc.bo.a((dca)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), btv.i, null);
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
   protected void b(cjj $$0) {
      cmk.a(this, this, $$0);
   }

   @Override
   public boolean k(cur $$0) {
      cum $$1 = $$0.g();
      return (ch.contains($$1) || this.gB().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gI() {
      return this.gY() >= 24;
   }

   public boolean gJ() {
      return this.gY() < 12;
   }

   private int gY() {
      brf $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gK() {
      return this.y().a_($$0 -> $$0.a(awy.bx));
   }

   @Override
   protected void gx() {
      cmn $$0 = this.gB();
      Int2ObjectMap<cmq.g[]> $$2;
      if (this.dP().J().b(cpp.d)) {
         Int2ObjectMap<cmq.g[]> $$1 = cmq.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmq.a.get($$0.b());
      } else {
         $$2 = cmq.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmq.g[] $$4 = (cmq.g[])$$2.get($$0.c());
         if ($$4 != null) {
            daz $$5 = this.gs();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arf $$0, cmm $$1, long $$2) {
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
         evo $$3 = this.cK().c(10.0, 10.0, 10.0);
         List<cmm> $$4 = $$0.a(cmm.class, $$3);
         List<cmm> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azs.a(btc.af, btv.f, $$0, this.dp(), 10, 8, 6, azs.a.a).isEmpty()) {
               $$4.forEach(cdn::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Z()) ? false : !this.bD.a(ccv.F);
   }

   @Override
   public void a(ces $$0, bsw $$1) {
      if ($$0 == ces.a) {
         this.cu.a($$1.cz(), ccs.d, 20);
         this.cu.a($$1.cz(), ccs.c, 25);
      } else if ($$0 == ces.e) {
         this.cu.a($$1.cz(), ccs.e, 2);
      } else if ($$0 == ces.c) {
         this.cu.a($$1.cz(), ccs.b, 25);
      } else if ($$0 == ces.d) {
         this.cu.a($$1.cz(), ccs.a, 25);
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

   public ccr gL() {
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
      this.bD.a(ccv.H, this.dP().Z());
      this.bD.b(ccv.m);
      this.bD.b(ccv.E);
   }

   @Override
   public void fM() {
      super.fM();
      this.bD.a(ccv.I, this.dP().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bD.c(ccv.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
