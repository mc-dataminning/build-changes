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

public class clu extends clp implements btn, clw {
   private static final Logger cg = LogUtils.getLogger();
   private static final ajp<clv> ch = ajt.a(clu.class, ajr.u);
   public static final int cc = 12;
   public static final Map<ctv, Integer> cd = ImmutableMap.of(cud.px, 4, cud.ug, 1, cud.uf, 1, cud.vk, 1);
   private static final int ci = 2;
   private static final Set<ctv> cj = ImmutableSet.of(cud.px, cud.ug, cud.uf, cud.pw, cud.pv, cud.vk, new ctv[]{cud.vl, cud.vi, cud.vj});
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
   private cmh ct;
   private boolean cu;
   private int cv;
   private final cby cw = new cby();
   private long cx;
   private long cy;
   private int cz;
   private long cB;
   private int cC;
   private long cD;
   private boolean cE;
   private static final ImmutableList<ccc<?>> cF = ImmutableList.of(
      ccc.b,
      ccc.c,
      ccc.d,
      ccc.e,
      ccc.g,
      ccc.h,
      ccc.i,
      ccc.j,
      ccc.k,
      ccc.l,
      ccc.L,
      ccc.aP,
      new ccc[]{ccc.m, ccc.n, ccc.q, ccc.r, ccc.t, ccc.v, ccc.w, ccc.x, ccc.y, ccc.A, ccc.f, ccc.C, ccc.D, ccc.E, ccc.H, ccc.I, ccc.J, ccc.F}
   );
   private static final ImmutableList<cdj<? extends cdi<? super clu>>> cG = ImmutableList.of(cdj.c, cdj.d, cdj.b, cdj.e, cdj.f, cdj.g, cdj.h, cdj.i, cdj.j);
   public static final Map<ccc<ji>, BiPredicate<clu, jj<cef>>> cf = ImmutableMap.of(
      ccc.b,
      (BiPredicate<clu, jj>)($$0, $$1) -> $$1.a(ceg.n),
      ccc.c,
      (BiPredicate<clu, jj>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      ccc.d,
      (BiPredicate<clu, jj>)($$0, $$1) -> clx.a.test($$1),
      ccc.e,
      (BiPredicate<clu, jj>)($$0, $$1) -> $$1.a(ceg.o)
   );

   public clu(bsj<? extends clu> $$0, dcd $$1) {
      this($$0, $$1, clz.c);
   }

   public clu(bsj<? extends clu> $$0, dcd $$1, clz $$2) {
      super($$0, $$1);
      ((ccj)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gy().a($$2).a(clx.b));
   }

   @Override
   public bua<clu> dT() {
      return (bua<clu>)super.dT();
   }

   @Override
   protected bua.b<clu> dU() {
      return bua.a(cF, cG);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      bua<clu> $$1 = this.dU().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aqk $$0) {
      bua<clu> $$1 = this.dT();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.dT());
   }

   private void a(bua<clu> $$0) {
      clx $$1 = this.gy().b();
      if (this.p_()) {
         $$0.a(cny.e);
         $$0.a(cnw.d, bxx.a(0.5F));
      } else {
         $$0.a(cny.f);
         $$0.a(cnw.c, bxx.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccc.c, ccd.a)));
      }

      $$0.a(cnw.a, bxx.a($$1, 0.5F));
      $$0.a(cnw.f, bxx.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccc.e, ccd.a)));
      $$0.a(cnw.e, bxx.c($$1, 0.5F));
      $$0.a(cnw.b, bxx.e($$1, 0.5F));
      $$0.a(cnw.g, bxx.f($$1, 0.5F));
      $$0.a(cnw.i, bxx.g($$1, 0.5F));
      $$0.a(cnw.h, bxx.h($$1, 0.5F));
      $$0.a(cnw.j, bxx.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cnw.a));
      $$0.b(cnw.b);
      $$0.a(cnw.b);
      $$0.a(this.dP().aa(), this.dP().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof aqk) {
         this.c((aqk)this.dP());
      }
   }

   public static buf.a gw() {
      return bta.A().a(bug.v, 0.5).a(bug.m, 48.0);
   }

   public boolean gx() {
      return this.cE;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("villagerBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      if (this.cE) {
         this.cE = false;
      }

      if (!this.go() && this.cr > 0) {
         this.cr--;
         if (this.cr <= 0) {
            if (this.cs) {
               this.gU();
               this.cs = false;
            }

            this.b(new brl(brn.j, 200, 0));
         }
      }

      if (this.ct != null && this.dP() instanceof aqk) {
         ((aqk)this.dP()).a(cdz.e, this.ct, this);
         this.dP().a(this, (byte)14);
         this.ct = null;
      }

      if (!this.gc() && this.ah.a(100) == 0) {
         cns $$0 = ((aqk)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gy().b() == clx.b && this.go()) {
         this.gt();
      }

      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.s(this.s() - 1);
      }

      this.gW();
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.tJ) || !this.bD() || this.go() || this.fH()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gJ();
         return bqd.a(this.dP().B);
      } else {
         boolean $$3 = this.gp().isEmpty();
         if ($$1 == bqc.a) {
            if ($$3 && !this.dP().B) {
               this.gJ();
            }

            $$0.a(avp.S);
         }

         if ($$3) {
            return bqd.a(this.dP().B);
         } else {
            if (!this.dP().B && !this.cb.isEmpty()) {
               this.h($$0);
            }

            return bqd.a(this.dP().B);
         }
      }
   }

   private void gJ() {
      this.s(40);
      if (!this.dP().x_()) {
         this.b(avf.AV);
      }
   }

   private void h(cmh $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gy().c());
   }

   @Override
   public void f(@Nullable cmh $$0) {
      boolean $$1 = this.gn() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gt();
      }
   }

   @Override
   protected void gt() {
      super.gt();
      this.gK();
   }

   private void gK() {
      for (dbb $$0 : this.gp()) {
         $$0.n();
      }
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Override
   public boolean gv() {
      return this.dP().B;
   }

   public void gA() {
      this.gP();

      for (dbb $$0 : this.gp()) {
         $$0.j();
      }

      this.gL();
      this.cB = this.dP().Z();
      this.cC++;
   }

   private void gL() {
      dbc $$0 = this.gp();
      cmh $$1 = this.gn();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.j, $$0, this.gy().c(), this.u(), this.gq(), this.gz());
      }
   }

   private boolean gM() {
      for (dbb $$0 : this.gp()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gN() {
      return this.cC == 0 || this.cC < 2 && this.dP().Z() > this.cB + 2400L;
   }

   public boolean gB() {
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
         this.gX();
      }

      return this.gN() && this.gM();
   }

   private void gO() {
      int $$0 = 2 - this.cC;
      if ($$0 > 0) {
         for (dbb $$1 : this.gp()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (dbb $$0 : this.gp()) {
         $$0.g();
      }
   }

   private void i(cmh $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dbb $$2 : this.gp()) {
            $$2.a(-aye.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(brn.F)) {
         brl $$3 = $$0.c(brn.F);
         int $$4 = $$3.e();

         for (dbb $$5 : this.gp()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().H());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ch, new clv(clz.c, clx.b, 1));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      clv.c.encodeStart(ul.a, this.gy()).resultOrPartial(cg::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cv);
      $$0.a("Gossips", this.cw.a(ul.a));
      $$0.a("Xp", this.cz);
      $$0.a("LastRestock", this.cB);
      $$0.a("LastGossipDecay", this.cy);
      $$0.a("RestocksToday", this.cC);
      if (this.cE) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         clv.c.parse(ul.a, $$0.c("VillagerData")).resultOrPartial(cg::error).ifPresent($$0x -> this.ao.a(ch, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cv = $$0.f("FoodLevel");
      }

      ud $$1 = $$0.c("Gossips", 10);
      this.cw.a(new Dynamic(ul.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cz = $$0.h("Xp");
      }

      this.cB = $$0.i("LastRestock");
      this.cy = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dP() instanceof aqk) {
         this.c((aqk)this.dP());
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
   protected ave v() {
      if (this.fH()) {
         return null;
      } else {
         return this.go() ? avf.AW : avf.AR;
      }
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.AU;
   }

   @Override
   protected ave o_() {
      return avf.AT;
   }

   public void gC() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(clv $$0) {
      clv $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.cb = null;
      }

      this.ao.a(ch, $$0);
   }

   @Override
   public clv gy() {
      return this.ao.a(ch);
   }

   @Override
   protected void b(dbb $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cz = this.cz + $$0.q();
      this.ct = this.gn();
      if (this.gT()) {
         this.cr = 40;
         this.cs = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new bso(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cu = $$0;
   }

   public boolean gD() {
      return this.cu;
   }

   @Override
   public void a(@Nullable bsy $$0) {
      if ($$0 != null && this.dP() instanceof aqk) {
         ((aqk)this.dP()).a(cdz.c, $$0, this);
         if (this.bD() && $$0 instanceof cmh) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bqw $$0) {
      cg.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bsd $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(ccc.b);
      this.a(ccc.c);
      this.a(ccc.d);
      this.a(ccc.e);
   }

   private void b(bsd $$0) {
      if (this.dP() instanceof aqk $$1) {
         Optional<cce> $$3 = this.bF.c(ccc.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(btn.class::isInstance).forEach($$2x -> $$1.a(cdz.d, $$0, (btn)$$2x));
         }
      }
   }

   public void a(ccc<ji> $$0) {
      if (this.dP() instanceof aqk) {
         MinecraftServer $$1 = ((aqk)this.dP()).o();
         this.bF.c($$0).ifPresent($$2 -> {
            aqk $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cec $$4 = $$3.y();
               Optional<jj<cef>> $$5 = $$4.c($$2.b());
               BiPredicate<clu, jj<cef>> $$6 = cf.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  afy.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.cv + this.gV() >= 12 && !this.fH() && this.g() == 0;
   }

   private boolean gR() {
      return this.cv < 12;
   }

   private void gS() {
      if (this.gR() && this.gV() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cua $$1 = this.y().a($$0);
            if (!$$1.e()) {
               Integer $$2 = cd.get($$1.g());
               if ($$2 != null) {
                  int $$3 = $$1.H();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cv = this.cv + $$2;
                     this.y().a($$0, 1);
                     if (!this.gR()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cmh $$0) {
      return this.cw.a($$0.cz(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cv -= $$0;
   }

   public void gE() {
      this.gS();
      this.v(12);
   }

   @Override
   public void b(dbc $$0) {
      this.cb = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return clv.d($$0) && this.cz >= clv.c($$0);
   }

   private void gU() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gu();
   }

   @Override
   protected wu cr() {
      return wu.c(this.ak().g() + "." + lq.x.b(this.gy().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lj.Q);
      } else if ($$0 == 13) {
         this.a(lj.a);
      } else if ($$0 == 14) {
         this.a(lj.O);
      } else if ($$0 == 42) {
         this.a(lj.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if ($$2 == btc.e) {
         this.a(this.gy().a(clx.b));
      }

      if ($$2 == btc.n || $$2 == btc.m || btc.a($$2) || $$2 == btc.o) {
         this.a(this.gy().a(clz.a($$0.t(this.dp()))));
      }

      if ($$2 == btc.d) {
         this.cE = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public clu b(aqk $$0, brx $$1) {
      double $$2 = this.ah.j();
      clz $$3;
      if ($$2 < 0.5) {
         $$3 = clz.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((clu)$$1).gy().a();
      }

      clu $$6 = new clu(bsj.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), btc.e, null);
      return $$6;
   }

   @Override
   public void a(aqk $$0, bsx $$1) {
      if ($$0.al() != bqa.a) {
         cg.info("Villager {} was struck by lightning {}.", this, $$1);
         ckd $$2 = bsj.bo.a((dcd)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), btc.i, null);
            $$2.t(this.gc());
            if (this.ag()) {
               $$2.b(this.ah());
               $$2.o(this.cE());
            }

            $$2.fQ();
            $$0.a_($$2);
            this.gQ();
            this.ao();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cir $$0) {
      cls.a(this, this, $$0);
   }

   @Override
   public boolean k(cua $$0) {
      ctv $$1 = $$0.g();
      return (cj.contains($$1) || this.gy().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      bqm $$0 = this.y();
      return cd.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.y().a_($$0 -> $$0.a(awd.bx));
   }

   @Override
   protected void gu() {
      clv $$0 = this.gy();
      Int2ObjectMap<cly.g[]> $$2;
      if (this.dP().J().b(cox.c)) {
         Int2ObjectMap<cly.g[]> $$1 = cly.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cly.a.get($$0.b());
      } else {
         $$2 = cly.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cly.g[] $$4 = (cly.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dbc $$5 = this.gp();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqk $$0, clu $$1, long $$2) {
      if (($$2 < this.cx || $$2 >= this.cx + 1200L) && ($$2 < $$1.cx || $$2 >= $$1.cx + 1200L)) {
         this.cw.a($$1.cw, this.ah, 10);
         this.cx = $$2;
         $$1.cx = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gW() {
      long $$0 = this.dP().Z();
      if (this.cy == 0L) {
         this.cy = $$0;
      } else if ($$0 >= this.cy + 24000L) {
         this.cw.b();
         this.cy = $$0;
      }
   }

   public void a(aqk $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         evu $$3 = this.cK().c(10.0, 10.0, 10.0);
         List<clu> $$4 = $$0.a(clu.class, $$3);
         List<clu> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ayx.a(bsj.af, btc.f, $$0, this.dp(), 10, 8, 6, ayx.a.a).isEmpty()) {
               $$4.forEach(ccu::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Z()) ? false : !this.bF.a(ccc.F);
   }

   @Override
   public void a(cdz $$0, bsd $$1) {
      if ($$0 == cdz.a) {
         this.cw.a($$1.cz(), cbz.d, 20);
         this.cw.a($$1.cz(), cbz.c, 25);
      } else if ($$0 == cdz.e) {
         this.cw.a($$1.cz(), cbz.e, 2);
      } else if ($$0 == cdz.c) {
         this.cw.a($$1.cz(), cbz.b, 25);
      } else if ($$0 == cdz.d) {
         this.cw.a($$1.cz(), cbz.a, 25);
      }
   }

   @Override
   public int u() {
      return this.cz;
   }

   public void u(int $$0) {
      this.cz = $$0;
   }

   private void gX() {
      this.gO();
      this.cC = 0;
   }

   public cby gI() {
      return this.cw;
   }

   public void a(uu $$0) {
      this.cw.a(new Dynamic(ul.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void b(ja $$0) {
      super.b($$0);
      this.bF.a(ccc.H, this.dP().Z());
      this.bF.b(ccc.m);
      this.bF.b(ccc.E);
   }

   @Override
   public void fI() {
      super.fI();
      this.bF.a(ccc.I, this.dP().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(ccc.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
