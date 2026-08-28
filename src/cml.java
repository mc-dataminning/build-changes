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

public class cml extends cmg implements buf, cmn {
   private static final Logger ce = LogUtils.getLogger();
   private static final akk<cmm> cf = ako.a(cml.class, akm.u);
   public static final int ca = 12;
   public static final Map<cul, Integer> cb = ImmutableMap.of(cut.px, 4, cut.ug, 1, cut.uf, 1, cut.vk, 1);
   private static final int cg = 2;
   private static final Set<cul> ch = ImmutableSet.of(cut.px, cut.ug, cut.uf, cut.pw, cut.pv, cut.vk, new cul[]{cut.vl, cut.vi, cut.vj});
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
   private cmy cr;
   private boolean cs;
   private int ct;
   private final ccq cu = new ccq();
   private long cv;
   private long cw;
   private int cx;
   private long cz;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<ccu<?>> cD = ImmutableList.of(
      ccu.b,
      ccu.c,
      ccu.d,
      ccu.e,
      ccu.g,
      ccu.h,
      ccu.i,
      ccu.j,
      ccu.k,
      ccu.l,
      ccu.L,
      ccu.aP,
      new ccu[]{ccu.m, ccu.n, ccu.q, ccu.r, ccu.t, ccu.v, ccu.w, ccu.x, ccu.y, ccu.A, ccu.f, ccu.C, ccu.D, ccu.E, ccu.H, ccu.I, ccu.J, ccu.F}
   );
   private static final ImmutableList<ceb<? extends cea<? super cml>>> cE = ImmutableList.of(ceb.c, ceb.d, ceb.b, ceb.e, ceb.f, ceb.g, ceb.h, ceb.i, ceb.j);
   public static final Map<ccu<jh>, BiPredicate<cml, ji<cex>>> cd = ImmutableMap.of(
      ccu.b,
      (BiPredicate<cml, ji>)($$0, $$1) -> $$1.a(cey.n),
      ccu.c,
      (BiPredicate<cml, ji>)($$0, $$1) -> $$0.gB().b().b().test($$1),
      ccu.d,
      (BiPredicate<cml, ji>)($$0, $$1) -> cmo.a.test($$1),
      ccu.e,
      (BiPredicate<cml, ji>)($$0, $$1) -> $$1.a(cey.o)
   );

   public cml(btb<? extends cml> $$0, dbz $$1) {
      this($$0, $$1, cmq.c);
   }

   public cml(btb<? extends cml> $$0, dbz $$1, cmq $$2) {
      super($$0, $$1);
      ((cdb)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gB().a($$2).a(cmo.b));
   }

   @Override
   public bus<cml> dS() {
      return (bus<cml>)super.dS();
   }

   @Override
   protected bus.b<cml> dT() {
      return bus.a(cD, cE);
   }

   @Override
   protected bus<?> a(Dynamic<?> $$0) {
      bus<cml> $$1 = this.dT().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(arf $$0) {
      bus<cml> $$1 = this.dS();
      $$1.b($$0, this);
      this.bD = $$1.i();
      this.a(this.dS());
   }

   private void a(bus<cml> $$0) {
      cmo $$1 = this.gB().b();
      if (this.p_()) {
         $$0.a(coq.e);
         $$0.a(coo.d, byp.a(0.5F));
      } else {
         $$0.a(coq.f);
         $$0.a(coo.c, byp.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccu.c, ccv.a)));
      }

      $$0.a(coo.a, byp.a($$1, 0.5F));
      $$0.a(coo.f, byp.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccu.e, ccv.a)));
      $$0.a(coo.e, byp.c($$1, 0.5F));
      $$0.a(coo.b, byp.e($$1, 0.5F));
      $$0.a(coo.g, byp.f($$1, 0.5F));
      $$0.a(coo.i, byp.g($$1, 0.5F));
      $$0.a(coo.h, byp.h($$1, 0.5F));
      $$0.a(coo.j, byp.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(coo.a));
      $$0.b(coo.b);
      $$0.a(coo.b);
      $$0.a(this.dP().aa(), this.dP().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof arf) {
         this.c((arf)this.dP());
      }
   }

   public static bux.a gz() {
      return bts.A().a(buy.r, 0.5).a(buy.k, 48.0);
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

            this.b(new bsd(bsf.j, 200, 0));
         }
      }

      if (this.cr != null && this.dP() instanceof arf) {
         ((arf)this.dP()).a(cer.e, this.cr, this);
         this.dP().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gg() && this.ah.a(100) == 0) {
         coj $$0 = ((arf)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gB().b() == cmo.b && this.gr()) {
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
   public bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.tJ) || !this.bD() || this.gr() || this.fL()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gM();
         return bqv.a(this.dP().B);
      } else {
         boolean $$3 = this.gs().isEmpty();
         if ($$1 == bqu.a) {
            if ($$3 && !this.dP().B) {
               this.gM();
            }

            $$0.a(awk.S);
         }

         if ($$3) {
            return bqv.a(this.dP().B);
         } else {
            if (!this.dP().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return bqv.a(this.dP().B);
         }
      }
   }

   private void gM() {
      this.t(40);
      if (!this.dP().x_()) {
         this.b(awa.AS);
      }
   }

   private void h(cmy $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gB().c());
   }

   @Override
   public void f(@Nullable cmy $$0) {
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
      for (dax $$0 : this.gs()) {
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

      for (dax $$0 : this.gs()) {
         $$0.j();
      }

      this.gO();
      this.cz = this.dP().Z();
      this.cA++;
   }

   private void gO() {
      day $$0 = this.gs();
      cmy $$1 = this.gq();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cb.j, $$0, this.gB().c(), this.u(), this.gt(), this.gC());
      }
   }

   private boolean gP() {
      for (dax $$0 : this.gs()) {
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
         for (dax $$1 : this.gs()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gS();
      }

      this.gO();
   }

   private void gS() {
      for (dax $$0 : this.gs()) {
         $$0.g();
      }
   }

   private void i(cmy $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dax $$2 : this.gs()) {
            $$2.a(-ayz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bsf.F)) {
         bsd $$3 = $$0.c(bsf.F);
         int $$4 = $$3.e();

         for (dax $$5 : this.gs()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().I());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, new cmm(cmq.c, cmo.b, 1));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      cmm.c.encodeStart(vg.a, this.gB()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         cmm.c.parse(vg.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
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
   protected avz d(bro $$0) {
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
   public void a(cmm $$0) {
      cmm $$1 = this.gB();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public cmm gB() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(dax $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gq();
      if (this.gW()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new btg(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gG() {
      return this.cs;
   }

   @Override
   public void a(@Nullable btq $$0) {
      if ($$0 != null && this.dP() instanceof arf) {
         ((arf)this.dP()).a(cer.c, $$0, this);
         if (this.bD() && $$0 instanceof cmy) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bro $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bsv $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gT();
      super.a($$0);
   }

   private void gT() {
      this.a(ccu.b);
      this.a(ccu.c);
      this.a(ccu.d);
      this.a(ccu.e);
   }

   private void b(bsv $$0) {
      if (this.dP() instanceof arf $$1) {
         Optional<ccw> $$3 = this.bD.c(ccu.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(buf.class::isInstance).forEach($$2x -> $$1.a(cer.d, $$0, (buf)$$2x));
         }
      }
   }

   public void a(ccu<jh> $$0) {
      if (this.dP() instanceof arf) {
         MinecraftServer $$1 = ((arf)this.dP()).o();
         this.bD.c($$0).ifPresent($$2 -> {
            arf $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               ceu $$4 = $$3.y();
               Optional<ji<cex>> $$5 = $$4.c($$2.b());
               BiPredicate<cml, ji<cex>> $$6 = cd.get($$0);
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
            cuq $$1 = this.y().a($$0);
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

   public int g(cmy $$0) {
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
   public void b(day $$0) {
      this.bZ = $$0;
   }

   private boolean gW() {
      int $$0 = this.gB().c();
      return cmm.d($$0) && this.cx >= cmm.c($$0);
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
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      if ($$2 == btu.e) {
         this.a(this.gB().a(cmo.b));
      }

      if ($$2 == btu.n || $$2 == btu.m || btu.a($$2) || $$2 == btu.o) {
         this.a(this.gB().a(cmq.a($$0.t(this.dp()))));
      }

      if ($$2 == btu.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cml b(arf $$0, bsp $$1) {
      double $$2 = this.ah.j();
      cmq $$3;
      if ($$2 < 0.5) {
         $$3 = cmq.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gB().a();
      } else {
         $$3 = ((cml)$$1).gB().a();
      }

      cml $$6 = new cml(btb.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), btu.e, null);
      return $$6;
   }

   @Override
   public void a(arf $$0, btp $$1) {
      if ($$0.al() != bqs.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cku $$2 = btb.bo.a((dbz)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), btu.i, null);
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
   protected void b(cji $$0) {
      cmj.a(this, this, $$0);
   }

   @Override
   public boolean k(cuq $$0) {
      cul $$1 = $$0.g();
      return (ch.contains($$1) || this.gB().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gI() {
      return this.gY() >= 24;
   }

   public boolean gJ() {
      return this.gY() < 12;
   }

   private int gY() {
      bre $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gK() {
      return this.y().a_($$0 -> $$0.a(awy.bx));
   }

   @Override
   protected void gx() {
      cmm $$0 = this.gB();
      Int2ObjectMap<cmp.g[]> $$2;
      if (this.dP().J().b(cpo.d)) {
         Int2ObjectMap<cmp.g[]> $$1 = cmp.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmp.a.get($$0.b());
      } else {
         $$2 = cmp.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmp.g[] $$4 = (cmp.g[])$$2.get($$0.c());
         if ($$4 != null) {
            day $$5 = this.gs();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arf $$0, cml $$1, long $$2) {
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
         evn $$3 = this.cK().c(10.0, 10.0, 10.0);
         List<cml> $$4 = $$0.a(cml.class, $$3);
         List<cml> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azs.a(btb.af, btu.f, $$0, this.dp(), 10, 8, 6, azs.a.a).isEmpty()) {
               $$4.forEach(cdm::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Z()) ? false : !this.bD.a(ccu.F);
   }

   @Override
   public void a(cer $$0, bsv $$1) {
      if ($$0 == cer.a) {
         this.cu.a($$1.cz(), ccr.d, 20);
         this.cu.a($$1.cz(), ccr.c, 25);
      } else if ($$0 == cer.e) {
         this.cu.a($$1.cz(), ccr.e, 2);
      } else if ($$0 == cer.c) {
         this.cu.a($$1.cz(), ccr.b, 25);
      } else if ($$0 == cer.d) {
         this.cu.a($$1.cz(), ccr.a, 25);
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

   public ccq gL() {
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
      this.bD.a(ccu.H, this.dP().Z());
      this.bD.b(ccu.m);
      this.bD.b(ccu.E);
   }

   @Override
   public void fM() {
      super.fM();
      this.bD.a(ccu.I, this.dP().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bD.c(ccu.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
