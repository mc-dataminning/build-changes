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

public class cmk extends cmf implements bud, cmm {
   private static final Logger cg = LogUtils.getLogger();
   private static final ajw<cml> ch = aka.a(cmk.class, ajy.u);
   public static final int cc = 12;
   public static final Map<cul, Integer> cd = ImmutableMap.of(cut.px, 4, cut.ug, 1, cut.uf, 1, cut.vk, 1);
   private static final int ci = 2;
   private static final Set<cul> cj = ImmutableSet.of(cut.px, cut.ug, cut.uf, cut.pw, cut.pv, cut.vk, new cul[]{cut.vl, cut.vi, cut.vj});
   private static final int ck = 10;
   private static final int cl = 1200;
   private static final int cm = 24000;
   private static final int cn = 25;
   private static final int co = 10;
   private static final int cp = 5;
   private static final long cq = 24000L;
   @VisibleForTesting
   public static final float ce = 0.5F;
   private int cr;
   private boolean cs;
   @Nullable
   private cmx ct;
   private boolean cu;
   private int cv;
   private final cco cw = new cco();
   private long cx;
   private long cy;
   private int cz;
   private long cB;
   private int cC;
   private long cD;
   private boolean cE;
   private static final ImmutableList<ccs<?>> cF = ImmutableList.of(
      ccs.b,
      ccs.c,
      ccs.d,
      ccs.e,
      ccs.g,
      ccs.h,
      ccs.i,
      ccs.j,
      ccs.k,
      ccs.l,
      ccs.L,
      ccs.aP,
      new ccs[]{ccs.m, ccs.n, ccs.q, ccs.r, ccs.t, ccs.v, ccs.w, ccs.x, ccs.y, ccs.A, ccs.f, ccs.C, ccs.D, ccs.E, ccs.H, ccs.I, ccs.J, ccs.F}
   );
   private static final ImmutableList<cdz<? extends cdy<? super cmk>>> cG = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.e, cdz.f, cdz.g, cdz.h, cdz.i, cdz.j);
   public static final Map<ccs<jl>, BiPredicate<cmk, jm<cev>>> cf = ImmutableMap.of(
      ccs.b,
      (BiPredicate<cmk, jm>)($$0, $$1) -> $$1.a(cew.n),
      ccs.c,
      (BiPredicate<cmk, jm>)($$0, $$1) -> $$0.gw().b().b().test($$1),
      ccs.d,
      (BiPredicate<cmk, jm>)($$0, $$1) -> cmn.a.test($$1),
      ccs.e,
      (BiPredicate<cmk, jm>)($$0, $$1) -> $$1.a(cew.o)
   );

   public cmk(bsx<? extends cmk> $$0, dcw $$1) {
      this($$0, $$1, cmp.c);
   }

   public cmk(bsx<? extends cmk> $$0, dcw $$1, cmp $$2) {
      super($$0, $$1);
      ((ccz)this.N()).b(true);
      this.N().a(true);
      this.a_(true);
      this.a(this.gw().a($$2).a(cmn.b));
   }

   @Override
   public buq<cmk> dU() {
      return (buq<cmk>)super.dU();
   }

   @Override
   protected buq.b<cmk> dV() {
      return buq.a(cF, cG);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      buq<cmk> $$1 = this.dV().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(aqu $$0) {
      buq<cmk> $$1 = this.dU();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.dU());
   }

   private void a(buq<cmk> $$0) {
      cmn $$1 = this.gw().b();
      if (this.o_()) {
         $$0.a(cop.e);
         $$0.a(com.d, byn.a(0.5F));
      } else {
         $$0.a(cop.f);
         $$0.a(com.c, byn.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccs.c, cct.a)));
      }

      $$0.a(com.a, byn.a($$1, 0.5F));
      $$0.a(com.f, byn.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccs.e, cct.a)));
      $$0.a(com.e, byn.c($$1, 0.5F));
      $$0.a(com.b, byn.e($$1, 0.5F));
      $$0.a(com.g, byn.f($$1, 0.5F));
      $$0.a(com.i, byn.g($$1, 0.5F));
      $$0.a(com.h, byn.h($$1, 0.5F));
      $$0.a(com.j, byn.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.a(com.b);
      $$0.a(this.dP().aa(), this.dP().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof aqu) {
         this.a((aqu)this.dP());
      }
   }

   public static buv.a gu() {
      return btp.C().a(buw.v, 0.5).a(buw.m, 48.0);
   }

   public boolean gv() {
      return this.cE;
   }

   @Override
   protected void ab() {
      this.dP().ag().a("villagerBrain");
      this.dU().a((aqu)this.dP(), this);
      this.dP().ag().c();
      if (this.cE) {
         this.cE = false;
      }

      if (!this.gm() && this.cr > 0) {
         this.cr--;
         if (this.cr <= 0) {
            if (this.cs) {
               this.gS();
               this.cs = false;
            }

            this.b(new brz(bsb.j, 200, 0));
         }
      }

      if (this.ct != null && this.dP() instanceof aqu) {
         ((aqu)this.dP()).a(cep.e, this.ct, this);
         this.dP().a(this, (byte)14);
         this.ct = null;
      }

      if (!this.ga() && this.ah.a(100) == 0) {
         coi $$0 = ((aqu)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gw().b() == cmn.b && this.gm()) {
         this.gr();
      }

      super.ab();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.s(this.s() - 1);
      }

      this.gU();
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.tJ) || !this.bE() || this.gm() || this.fI()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gH();
         return bqr.a(this.dP().B);
      } else {
         if (!this.dP().B) {
            boolean $$3 = this.gn().isEmpty();
            if ($$1 == bqq.a) {
               if ($$3) {
                  this.gH();
               }

               $$0.a(avz.S);
            }

            if ($$3) {
               return bqr.c;
            }

            this.g($$0);
         }

         return bqr.a(this.dP().B);
      }
   }

   private void gH() {
      this.s(40);
      if (!this.dP().x_()) {
         this.b(avp.AW);
      }
   }

   private void g(cmx $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.S_(), this.gw().c());
   }

   @Override
   public void a(@Nullable cmx $$0) {
      boolean $$1 = this.gl() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gr();
      }
   }

   @Override
   protected void gr() {
      super.gr();
      this.gI();
   }

   private void gI() {
      if (!this.dP().x_()) {
         for (dbu $$0 : this.gn()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gx() {
      return true;
   }

   @Override
   public boolean gt() {
      return this.dP().B;
   }

   public void gy() {
      this.gN();

      for (dbu $$0 : this.gn()) {
         $$0.j();
      }

      this.gJ();
      this.cB = this.dP().Z();
      this.cC++;
   }

   private void gJ() {
      dbv $$0 = this.gn();
      cmx $$1 = this.gl();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.j, $$0, this.gw().c(), this.t(), this.go(), this.gx());
      }
   }

   private boolean gK() {
      for (dbu $$0 : this.gn()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gL() {
      return this.cC == 0 || this.cC < 2 && this.dP().Z() > this.cB + 2400L;
   }

   public boolean gz() {
      long $$0 = this.cB + 12000L;
      long $$1 = this.dP().Z();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dP().aa();
      if (this.cD > 0L) {
         long $$4 = this.cD / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cD = $$3;
      if ($$2) {
         this.cB = $$1;
         this.gV();
      }

      return this.gL() && this.gK();
   }

   private void gM() {
      int $$0 = 2 - this.cC;
      if ($$0 > 0) {
         for (dbu $$1 : this.gn()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gN();
      }

      this.gJ();
   }

   private void gN() {
      for (dbu $$0 : this.gn()) {
         $$0.g();
      }
   }

   private void h(cmx $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dbu $$2 : this.gn()) {
            $$2.a(-ayo.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bsb.F)) {
         brz $$3 = $$0.c(bsb.F);
         int $$4 = $$3.e();

         for (dbu $$5 : this.gn()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().H());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ch, new cml(cmp.c, cmn.b, 1));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      cml.c.encodeStart(up.a, this.gw()).resultOrPartial(cg::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cv);
      $$0.a("Gossips", this.cw.a(up.a));
      $$0.a("Xp", this.cz);
      $$0.a("LastRestock", this.cB);
      $$0.a("LastGossipDecay", this.cy);
      $$0.a("RestocksToday", this.cC);
      if (this.cE) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cml.c.parse(up.a, $$0.c("VillagerData")).resultOrPartial(cg::error).ifPresent($$0x -> this.ao.a(ch, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cv = $$0.f("FoodLevel");
      }

      uh $$1 = $$0.c("Gossips", 10);
      this.cw.a(new Dynamic(up.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cz = $$0.h("Xp");
      }

      this.cB = $$0.i("LastRestock");
      this.cy = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dP() instanceof aqu) {
         this.a((aqu)this.dP());
      }

      this.cC = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cE = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected avo v() {
      if (this.fI()) {
         return null;
      } else {
         return this.gm() ? avp.AX : avp.AS;
      }
   }

   @Override
   protected avo d(brk $$0) {
      return avp.AV;
   }

   @Override
   protected avo n_() {
      return avp.AU;
   }

   public void gA() {
      this.b(this.gw().b().f());
   }

   @Override
   public void a(cml $$0) {
      cml $$1 = this.gw();
      if ($$1.b() != $$0.b()) {
         this.cb = null;
      }

      this.ao.a(ch, $$0);
   }

   @Override
   public cml gw() {
      return this.ao.a(ch);
   }

   @Override
   protected void b(dbu $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cz = this.cz + $$0.q();
      this.ct = this.gl();
      if (this.gR()) {
         this.cr = 40;
         this.cs = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new btc(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cu = $$0;
   }

   public boolean gB() {
      return this.cu;
   }

   @Override
   public void a(@Nullable btn $$0) {
      if ($$0 != null && this.dP() instanceof aqu) {
         ((aqu)this.dP()).a(cep.c, $$0, this);
         if (this.bE() && $$0 instanceof cmx) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(brk $$0) {
      cg.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bsr $$1 = $$0.d();
      if ($$1 != null) {
         this.c($$1);
      }

      this.gO();
      super.a($$0);
   }

   private void gO() {
      this.a(ccs.b);
      this.a(ccs.c);
      this.a(ccs.d);
      this.a(ccs.e);
   }

   private void c(bsr $$0) {
      if (this.dP() instanceof aqu $$1) {
         Optional<ccu> $$3 = this.bF.c(ccs.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bud.class::isInstance).forEach($$2x -> $$1.a(cep.d, $$0, (bud)$$2x));
         }
      }
   }

   public void a(ccs<jl> $$0) {
      if (this.dP() instanceof aqu) {
         MinecraftServer $$1 = ((aqu)this.dP()).o();
         this.bF.c($$0).ifPresent($$2 -> {
            aqu $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               ces $$4 = $$3.y();
               Optional<jm<cev>> $$5 = $$4.c($$2.b());
               BiPredicate<cmk, jm<cev>> $$6 = cf.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agf.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean ab_() {
      return this.cv + this.gT() >= 12 && !this.fI() && this.g() == 0;
   }

   private boolean gP() {
      return this.cv < 12;
   }

   private void gQ() {
      if (this.gP() && this.gT() != 0) {
         for (int $$0 = 0; $$0 < this.x().b(); $$0++) {
            cuq $$1 = this.x().a($$0);
            if (!$$1.e()) {
               Integer $$2 = cd.get($$1.g());
               if ($$2 != null) {
                  int $$3 = $$1.H();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cv = this.cv + $$2;
                     this.x().a($$0, 1);
                     if (!this.gP()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(cmx $$0) {
      return this.cw.a($$0.cA(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cv -= $$0;
   }

   public void gC() {
      this.gQ();
      this.v(12);
   }

   @Override
   public void b(dbv $$0) {
      this.cb = $$0;
   }

   private boolean gR() {
      int $$0 = this.gw().c();
      return cml.d($$0) && this.cz >= cml.c($$0);
   }

   private void gS() {
      this.a(this.gw().a(this.gw().c() + 1));
      this.gs();
   }

   @Override
   protected wz cs() {
      return wz.c(this.am().g() + "." + lt.x.b(this.gw().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lm.Q);
      } else if ($$0 == 13) {
         this.a(lm.a);
      } else if ($$0 == 14) {
         this.a(lm.O);
      } else if ($$0 == 42) {
         this.a(lm.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if ($$2 == btr.e) {
         this.a(this.gw().a(cmn.b));
      }

      if ($$2 == btr.n || $$2 == btr.m || btr.a($$2) || $$2 == btr.o) {
         this.a(this.gw().a(cmp.a($$0.t(this.dp()))));
      }

      if ($$2 == btr.d) {
         this.cE = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cmk b(aqu $$0, bsl $$1) {
      double $$2 = this.ah.j();
      cmp $$3;
      if ($$2 < 0.5) {
         $$3 = cmp.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gw().a();
      } else {
         $$3 = ((cmk)$$1).gw().a();
      }

      cmk $$6 = new cmk(bsx.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), btr.e, null);
      return $$6;
   }

   @Override
   public void a(aqu $$0, btm $$1) {
      if ($$0.al() != bqo.a) {
         cg.info("Villager {} was struck by lightning {}.", this, $$1);
         ckt $$2 = bsx.bo.a((dcw)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), btr.i, null);
            $$2.t(this.ga());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.o(this.cF());
            }

            $$2.fS();
            $$0.a_($$2);
            this.gO();
            this.aq();
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
   public boolean k(cuq $$0) {
      cul $$1 = $$0.g();
      return (cj.contains($$1) || this.gw().b().d().contains($$1)) && this.x().c($$0);
   }

   public boolean gD() {
      return this.gT() >= 24;
   }

   public boolean gE() {
      return this.gT() < 12;
   }

   private int gT() {
      bra $$0 = this.x();
      return cd.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gF() {
      return this.x().a_($$0 -> $$0.a(awn.bw));
   }

   @Override
   protected void gs() {
      cml $$0 = this.gw();
      Int2ObjectMap<cmo.g[]> $$2;
      if (this.dP().J().b(cpn.c)) {
         Int2ObjectMap<cmo.g[]> $$1 = cmo.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmo.a.get($$0.b());
      } else {
         $$2 = cmo.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmo.g[] $$4 = (cmo.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dbv $$5 = this.gn();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqu $$0, cmk $$1, long $$2) {
      if (($$2 < this.cx || $$2 >= this.cx + 1200L) && ($$2 < $$1.cx || $$2 >= $$1.cx + 1200L)) {
         this.cw.a($$1.cw, this.ah, 10);
         this.cx = $$2;
         $$1.cx = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gU() {
      long $$0 = this.dP().Z();
      if (this.cy == 0L) {
         this.cy = $$0;
      } else if ($$0 >= this.cy + 24000L) {
         this.cw.b();
         this.cy = $$0;
      }
   }

   public void a(aqu $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ewv $$3 = this.cL().c(10.0, 10.0, 10.0);
         List<cmk> $$4 = $$0.a(cmk.class, $$3);
         List<cmk> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azh.a(bsx.af, btr.f, $$0, this.dp(), 10, 8, 6, azh.a.a).isEmpty()) {
               $$4.forEach(cdk::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Z()) ? false : !this.bF.a(ccs.F);
   }

   @Override
   public void a(cep $$0, bsr $$1) {
      if ($$0 == cep.a) {
         this.cw.a($$1.cA(), ccp.d, 20);
         this.cw.a($$1.cA(), ccp.c, 25);
      } else if ($$0 == cep.e) {
         this.cw.a($$1.cA(), ccp.e, 2);
      } else if ($$0 == cep.c) {
         this.cw.a($$1.cA(), ccp.b, 25);
      } else if ($$0 == cep.d) {
         this.cw.a($$1.cA(), ccp.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cz;
   }

   public void u(int $$0) {
      this.cz = $$0;
   }

   private void gV() {
      this.gM();
      this.cC = 0;
   }

   public cco gG() {
      return this.cw;
   }

   public void a(uy $$0) {
      this.cw.a(new Dynamic(up.a, $$0));
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Override
   public void b(jd $$0) {
      super.b($$0);
      this.bF.a(ccs.H, this.dP().Z());
      this.bF.b(ccs.m);
      this.bF.b(ccs.E);
   }

   @Override
   public void fJ() {
      super.fJ();
      this.bF.a(ccs.I, this.dP().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(ccs.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
