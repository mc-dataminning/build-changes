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

public class cmi extends cmd implements buc, cmk {
   private static final Logger ce = LogUtils.getLogger();
   private static final akj<cmj> cf = akn.a(cmi.class, akl.u);
   public static final int ca = 12;
   public static final Map<cui, Integer> cb = ImmutableMap.of(cuq.px, 4, cuq.ug, 1, cuq.uf, 1, cuq.vk, 1);
   private static final int cg = 2;
   private static final Set<cui> ch = ImmutableSet.of(cuq.px, cuq.ug, cuq.uf, cuq.pw, cuq.pv, cuq.vk, new cui[]{cuq.vl, cuq.vi, cuq.vj});
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
   private cmv cr;
   private boolean cs;
   private int ct;
   private final ccn cu = new ccn();
   private long cv;
   private long cw;
   private int cx;
   private long cz;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<ccr<?>> cD = ImmutableList.of(
      ccr.b,
      ccr.c,
      ccr.d,
      ccr.e,
      ccr.g,
      ccr.h,
      ccr.i,
      ccr.j,
      ccr.k,
      ccr.l,
      ccr.L,
      ccr.aP,
      new ccr[]{ccr.m, ccr.n, ccr.q, ccr.r, ccr.t, ccr.v, ccr.w, ccr.x, ccr.y, ccr.A, ccr.f, ccr.C, ccr.D, ccr.E, ccr.H, ccr.I, ccr.J, ccr.F}
   );
   private static final ImmutableList<cdy<? extends cdx<? super cmi>>> cE = ImmutableList.of(cdy.c, cdy.d, cdy.b, cdy.e, cdy.f, cdy.g, cdy.h, cdy.i, cdy.j);
   public static final Map<ccr<jh>, BiPredicate<cmi, ji<ceu>>> cd = ImmutableMap.of(
      ccr.b,
      (BiPredicate<cmi, ji>)($$0, $$1) -> $$1.a(cev.n),
      ccr.c,
      (BiPredicate<cmi, ji>)($$0, $$1) -> $$0.gB().b().b().test($$1),
      ccr.d,
      (BiPredicate<cmi, ji>)($$0, $$1) -> cml.a.test($$1),
      ccr.e,
      (BiPredicate<cmi, ji>)($$0, $$1) -> $$1.a(cev.o)
   );

   public cmi(bsy<? extends cmi> $$0, dbw $$1) {
      this($$0, $$1, cmn.c);
   }

   public cmi(bsy<? extends cmi> $$0, dbw $$1, cmn $$2) {
      super($$0, $$1);
      ((ccy)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gB().a($$2).a(cml.b));
   }

   @Override
   public bup<cmi> dS() {
      return (bup<cmi>)super.dS();
   }

   @Override
   protected bup.b<cmi> dT() {
      return bup.a(cD, cE);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      bup<cmi> $$1 = this.dT().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(are $$0) {
      bup<cmi> $$1 = this.dS();
      $$1.b($$0, this);
      this.bD = $$1.i();
      this.a(this.dS());
   }

   private void a(bup<cmi> $$0) {
      cml $$1 = this.gB().b();
      if (this.p_()) {
         $$0.a(com.e);
         $$0.a(cok.d, bym.a(0.5F));
      } else {
         $$0.a(com.f);
         $$0.a(cok.c, bym.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccr.c, ccs.a)));
      }

      $$0.a(cok.a, bym.a($$1, 0.5F));
      $$0.a(cok.f, bym.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccr.e, ccs.a)));
      $$0.a(cok.e, bym.c($$1, 0.5F));
      $$0.a(cok.b, bym.e($$1, 0.5F));
      $$0.a(cok.g, bym.f($$1, 0.5F));
      $$0.a(cok.i, bym.g($$1, 0.5F));
      $$0.a(cok.h, bym.h($$1, 0.5F));
      $$0.a(cok.j, bym.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.a(cok.b);
      $$0.a(this.dP().aa(), this.dP().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof are) {
         this.c((are)this.dP());
      }
   }

   public static buu.a gz() {
      return btp.A().a(buv.r, 0.5).a(buv.k, 48.0);
   }

   public boolean gA() {
      return this.cC;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("villagerBrain");
      this.dS().a((are)this.dP(), this);
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

            this.b(new bsa(bsc.j, 200, 0));
         }
      }

      if (this.cr != null && this.dP() instanceof are) {
         ((are)this.dP()).a(ceo.e, this.cr, this);
         this.dP().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gg() && this.ah.a(100) == 0) {
         cog $$0 = ((are)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gB().b() == cml.b && this.gr()) {
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
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if ($$2.a(cuq.tJ) || !this.bD() || this.gr() || this.fL()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gM();
         return bqs.a(this.dP().B);
      } else {
         boolean $$3 = this.gs().isEmpty();
         if ($$1 == bqr.a) {
            if ($$3 && !this.dP().B) {
               this.gM();
            }

            $$0.a(awj.S);
         }

         if ($$3) {
            return bqs.a(this.dP().B);
         } else {
            if (!this.dP().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return bqs.a(this.dP().B);
         }
      }
   }

   private void gM() {
      this.t(40);
      if (!this.dP().x_()) {
         this.b(avz.AS);
      }
   }

   private void h(cmv $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gB().c());
   }

   @Override
   public void f(@Nullable cmv $$0) {
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
      for (dau $$0 : this.gs()) {
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

      for (dau $$0 : this.gs()) {
         $$0.j();
      }

      this.gO();
      this.cz = this.dP().Z();
      this.cA++;
   }

   private void gO() {
      dav $$0 = this.gs();
      cmv $$1 = this.gq();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cb.j, $$0, this.gB().c(), this.u(), this.gt(), this.gC());
      }
   }

   private boolean gP() {
      for (dau $$0 : this.gs()) {
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
         for (dau $$1 : this.gs()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gS();
      }

      this.gO();
   }

   private void gS() {
      for (dau $$0 : this.gs()) {
         $$0.g();
      }
   }

   private void i(cmv $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dau $$2 : this.gs()) {
            $$2.a(-ayx.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bsc.F)) {
         bsa $$3 = $$0.c(bsc.F);
         int $$4 = $$3.e();

         for (dau $$5 : this.gs()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().I());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cf, new cmj(cmn.c, cml.b, 1));
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      cmj.c.encodeStart(vf.a, this.gB()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.ct);
      $$0.a("Gossips", this.cu.a(vf.a));
      $$0.a("Xp", this.cx);
      $$0.a("LastRestock", this.cz);
      $$0.a("LastGossipDecay", this.cw);
      $$0.a("RestocksToday", this.cA);
      if (this.cC) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cmj.c.parse(vf.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.ct = $$0.f("FoodLevel");
      }

      ux $$1 = $$0.c("Gossips", 10);
      this.cu.a(new Dynamic(vf.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cx = $$0.h("Xp");
      }

      this.cz = $$0.i("LastRestock");
      this.cw = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dP() instanceof are) {
         this.c((are)this.dP());
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
   protected avy v() {
      if (this.fL()) {
         return null;
      } else {
         return this.gr() ? avz.AT : avz.AO;
      }
   }

   @Override
   protected avy d(brl $$0) {
      return avz.AR;
   }

   @Override
   protected avy o_() {
      return avz.AQ;
   }

   public void gF() {
      this.b(this.gB().b().f());
   }

   @Override
   public void a(cmj $$0) {
      cmj $$1 = this.gB();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public cmj gB() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(dau $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gq();
      if (this.gW()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new btd(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gG() {
      return this.cs;
   }

   @Override
   public void a(@Nullable btn $$0) {
      if ($$0 != null && this.dP() instanceof are) {
         ((are)this.dP()).a(ceo.c, $$0, this);
         if (this.bD() && $$0 instanceof cmv) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(brl $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bss $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gT();
      super.a($$0);
   }

   private void gT() {
      this.a(ccr.b);
      this.a(ccr.c);
      this.a(ccr.d);
      this.a(ccr.e);
   }

   private void b(bss $$0) {
      if (this.dP() instanceof are $$1) {
         Optional<cct> $$3 = this.bD.c(ccr.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(buc.class::isInstance).forEach($$2x -> $$1.a(ceo.d, $$0, (buc)$$2x));
         }
      }
   }

   public void a(ccr<jh> $$0) {
      if (this.dP() instanceof are) {
         MinecraftServer $$1 = ((are)this.dP()).o();
         this.bD.c($$0).ifPresent($$2 -> {
            are $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cer $$4 = $$3.y();
               Optional<ji<ceu>> $$5 = $$4.c($$2.b());
               BiPredicate<cmi, ji<ceu>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  ags.c($$3, $$2.b());
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
            cun $$1 = this.y().a($$0);
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

   public int g(cmv $$0) {
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
   public void b(dav $$0) {
      this.bZ = $$0;
   }

   private boolean gW() {
      int $$0 = this.gB().c();
      return cmj.d($$0) && this.cx >= cmj.c($$0);
   }

   private void gX() {
      this.a(this.gB().a(this.gB().c() + 1));
      this.gx();
   }

   @Override
   protected xo cr() {
      return xo.c(this.ak().g() + "." + lp.z.b(this.gB().b()).a());
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
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      if ($$2 == btr.e) {
         this.a(this.gB().a(cml.b));
      }

      if ($$2 == btr.n || $$2 == btr.m || btr.a($$2) || $$2 == btr.o) {
         this.a(this.gB().a(cmn.a($$0.t(this.dp()))));
      }

      if ($$2 == btr.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cmi b(are $$0, bsm $$1) {
      double $$2 = this.ah.j();
      cmn $$3;
      if ($$2 < 0.5) {
         $$3 = cmn.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gB().a();
      } else {
         $$3 = ((cmi)$$1).gB().a();
      }

      cmi $$6 = new cmi(bsy.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), btr.e, null);
      return $$6;
   }

   @Override
   public void a(are $$0, btm $$1) {
      if ($$0.al() != bqp.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         ckr $$2 = bsy.bo.a((dbw)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), btr.i, null);
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
   protected void b(cjf $$0) {
      cmg.a(this, this, $$0);
   }

   @Override
   public boolean k(cun $$0) {
      cui $$1 = $$0.g();
      return (ch.contains($$1) || this.gB().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gI() {
      return this.gY() >= 24;
   }

   public boolean gJ() {
      return this.gY() < 12;
   }

   private int gY() {
      brb $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gK() {
      return this.y().a_($$0 -> $$0.a(awx.bx));
   }

   @Override
   protected void gx() {
      cmj $$0 = this.gB();
      Int2ObjectMap<cmm.g[]> $$2;
      if (this.dP().J().b(cpl.d)) {
         Int2ObjectMap<cmm.g[]> $$1 = cmm.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmm.a.get($$0.b());
      } else {
         $$2 = cmm.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmm.g[] $$4 = (cmm.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dav $$5 = this.gs();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(are $$0, cmi $$1, long $$2) {
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

   public void a(are $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         evk $$3 = this.cK().c(10.0, 10.0, 10.0);
         List<cmi> $$4 = $$0.a(cmi.class, $$3);
         List<cmi> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azq.a(bsy.af, btr.f, $$0, this.dp(), 10, 8, 6, azq.a.a).isEmpty()) {
               $$4.forEach(cdj::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Z()) ? false : !this.bD.a(ccr.F);
   }

   @Override
   public void a(ceo $$0, bss $$1) {
      if ($$0 == ceo.a) {
         this.cu.a($$1.cz(), cco.d, 20);
         this.cu.a($$1.cz(), cco.c, 25);
      } else if ($$0 == ceo.e) {
         this.cu.a($$1.cz(), cco.e, 2);
      } else if ($$0 == ceo.c) {
         this.cu.a($$1.cz(), cco.b, 25);
      } else if ($$0 == ceo.d) {
         this.cu.a($$1.cz(), cco.a, 25);
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

   public ccn gL() {
      return this.cu;
   }

   public void a(vo $$0) {
      this.cu.a(new Dynamic(vf.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   public void b(iz $$0) {
      super.b($$0);
      this.bD.a(ccr.H, this.dP().Z());
      this.bD.b(ccr.m);
      this.bD.b(ccr.E);
   }

   @Override
   public void fM() {
      super.fM();
      this.bD.a(ccr.I, this.dP().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bD.c(ccr.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
