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

public class cmi extends cmd implements bub, cmk {
   private static final Logger cg = LogUtils.getLogger();
   private static final ajv<cmj> ch = ajz.a(cmi.class, ajx.u);
   public static final int cc = 12;
   public static final Map<cuj, Integer> cd = ImmutableMap.of(cur.px, 4, cur.ug, 1, cur.uf, 1, cur.vk, 1);
   private static final int ci = 2;
   private static final Set<cuj> cj = ImmutableSet.of(cur.px, cur.ug, cur.uf, cur.pw, cur.pv, cur.vk, new cuj[]{cur.vl, cur.vi, cur.vj});
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
   private cmv ct;
   private boolean cu;
   private int cv;
   private final ccm cw = new ccm();
   private long cx;
   private long cy;
   private int cz;
   private long cB;
   private int cC;
   private long cD;
   private boolean cE;
   private static final ImmutableList<ccq<?>> cF = ImmutableList.of(
      ccq.b,
      ccq.c,
      ccq.d,
      ccq.e,
      ccq.g,
      ccq.h,
      ccq.i,
      ccq.j,
      ccq.k,
      ccq.l,
      ccq.L,
      ccq.aP,
      new ccq[]{ccq.m, ccq.n, ccq.q, ccq.r, ccq.t, ccq.v, ccq.w, ccq.x, ccq.y, ccq.A, ccq.f, ccq.C, ccq.D, ccq.E, ccq.H, ccq.I, ccq.J, ccq.F}
   );
   private static final ImmutableList<cdx<? extends cdw<? super cmi>>> cG = ImmutableList.of(cdx.c, cdx.d, cdx.b, cdx.e, cdx.f, cdx.g, cdx.h, cdx.i, cdx.j);
   public static final Map<ccq<jl>, BiPredicate<cmi, jm<cet>>> cf = ImmutableMap.of(
      ccq.b,
      (BiPredicate<cmi, jm>)($$0, $$1) -> $$1.a(ceu.n),
      ccq.c,
      (BiPredicate<cmi, jm>)($$0, $$1) -> $$0.gx().b().b().test($$1),
      ccq.d,
      (BiPredicate<cmi, jm>)($$0, $$1) -> cml.a.test($$1),
      ccq.e,
      (BiPredicate<cmi, jm>)($$0, $$1) -> $$1.a(ceu.o)
   );

   public cmi(bsw<? extends cmi> $$0, dcu $$1) {
      this($$0, $$1, cmn.c);
   }

   public cmi(bsw<? extends cmi> $$0, dcu $$1, cmn $$2) {
      super($$0, $$1);
      ((ccx)this.J()).b(true);
      this.J().a(true);
      this.a_(true);
      this.a(this.gx().a($$2).a(cml.b));
   }

   @Override
   public buo<cmi> dU() {
      return (buo<cmi>)super.dU();
   }

   @Override
   protected buo.b<cmi> dV() {
      return buo.a(cF, cG);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      buo<cmi> $$1 = this.dV().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(aqt $$0) {
      buo<cmi> $$1 = this.dU();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.dU());
   }

   private void a(buo<cmi> $$0) {
      cml $$1 = this.gx().b();
      if (this.o_()) {
         $$0.a(com.e);
         $$0.a(cok.d, byl.a(0.5F));
      } else {
         $$0.a(com.f);
         $$0.a(cok.c, byl.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccq.c, ccr.a)));
      }

      $$0.a(cok.a, byl.a($$1, 0.5F));
      $$0.a(cok.f, byl.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccq.e, ccr.a)));
      $$0.a(cok.e, byl.c($$1, 0.5F));
      $$0.a(cok.b, byl.e($$1, 0.5F));
      $$0.a(cok.g, byl.f($$1, 0.5F));
      $$0.a(cok.i, byl.g($$1, 0.5F));
      $$0.a(cok.h, byl.h($$1, 0.5F));
      $$0.a(cok.j, byl.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.a(cok.b);
      $$0.a(this.dQ().aa(), this.dQ().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dQ() instanceof aqt) {
         this.a((aqt)this.dQ());
      }
   }

   public static but.a gv() {
      return btn.A().a(buu.v, 0.5).a(buu.m, 48.0);
   }

   public boolean gw() {
      return this.cE;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("villagerBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      if (this.cE) {
         this.cE = false;
      }

      if (!this.gn() && this.cr > 0) {
         this.cr--;
         if (this.cr <= 0) {
            if (this.cs) {
               this.gT();
               this.cs = false;
            }

            this.b(new bry(bsa.j, 200, 0));
         }
      }

      if (this.ct != null && this.dQ() instanceof aqt) {
         ((aqt)this.dQ()).a(cen.e, this.ct, this);
         this.dQ().a(this, (byte)14);
         this.ct = null;
      }

      if (!this.gb() && this.ah.a(100) == 0) {
         cog $$0 = ((aqt)this.dQ()).d(this.dq());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dQ().a(this, (byte)42);
         }
      }

      if (this.gx().b() == cml.b && this.gn()) {
         this.gs();
      }

      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.s(this.s() - 1);
      }

      this.gV();
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.tJ) || !this.bE() || this.gn() || this.fI()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gI();
         return bqq.a(this.dQ().B);
      } else {
         if (!this.dQ().B) {
            boolean $$3 = this.go().isEmpty();
            if ($$1 == bqp.a) {
               if ($$3) {
                  this.gI();
               }

               $$0.a(avy.S);
            }

            if ($$3) {
               return bqq.c;
            }

            this.h($$0);
         }

         return bqq.a(this.dQ().B);
      }
   }

   private void gI() {
      this.s(40);
      if (!this.dQ().x_()) {
         this.b(avo.AW);
      }
   }

   private void h(cmv $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gx().c());
   }

   @Override
   public void f(@Nullable cmv $$0) {
      boolean $$1 = this.gm() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gs();
      }
   }

   @Override
   protected void gs() {
      super.gs();
      this.gJ();
   }

   private void gJ() {
      if (!this.dQ().x_()) {
         for (dbs $$0 : this.go()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gy() {
      return true;
   }

   @Override
   public boolean gu() {
      return this.dQ().B;
   }

   public void gz() {
      this.gO();

      for (dbs $$0 : this.go()) {
         $$0.j();
      }

      this.gK();
      this.cB = this.dQ().Z();
      this.cC++;
   }

   private void gK() {
      dbt $$0 = this.go();
      cmv $$1 = this.gm();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.j, $$0, this.gx().c(), this.t(), this.gp(), this.gy());
      }
   }

   private boolean gL() {
      for (dbs $$0 : this.go()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gM() {
      return this.cC == 0 || this.cC < 2 && this.dQ().Z() > this.cB + 2400L;
   }

   public boolean gA() {
      long $$0 = this.cB + 12000L;
      long $$1 = this.dQ().Z();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dQ().aa();
      if (this.cD > 0L) {
         long $$4 = this.cD / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cD = $$3;
      if ($$2) {
         this.cB = $$1;
         this.gW();
      }

      return this.gM() && this.gL();
   }

   private void gN() {
      int $$0 = 2 - this.cC;
      if ($$0 > 0) {
         for (dbs $$1 : this.go()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gO();
      }

      this.gK();
   }

   private void gO() {
      for (dbs $$0 : this.go()) {
         $$0.g();
      }
   }

   private void i(cmv $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dbs $$2 : this.go()) {
            $$2.a(-ayn.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bsa.F)) {
         bry $$3 = $$0.c(bsa.F);
         int $$4 = $$3.e();

         for (dbs $$5 : this.go()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().H());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ch, new cmj(cmn.c, cml.b, 1));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cmj.c.encodeStart(uo.a, this.gx()).resultOrPartial(cg::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cv);
      $$0.a("Gossips", this.cw.a(uo.a));
      $$0.a("Xp", this.cz);
      $$0.a("LastRestock", this.cB);
      $$0.a("LastGossipDecay", this.cy);
      $$0.a("RestocksToday", this.cC);
      if (this.cE) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cmj.c.parse(uo.a, $$0.c("VillagerData")).resultOrPartial(cg::error).ifPresent($$0x -> this.ao.a(ch, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cv = $$0.f("FoodLevel");
      }

      ug $$1 = $$0.c("Gossips", 10);
      this.cw.a(new Dynamic(uo.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cz = $$0.h("Xp");
      }

      this.cB = $$0.i("LastRestock");
      this.cy = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dQ() instanceof aqt) {
         this.a((aqt)this.dQ());
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
   protected avn v() {
      if (this.fI()) {
         return null;
      } else {
         return this.gn() ? avo.AX : avo.AS;
      }
   }

   @Override
   protected avn d(brj $$0) {
      return avo.AV;
   }

   @Override
   protected avn n_() {
      return avo.AU;
   }

   public void gB() {
      this.b(this.gx().b().f());
   }

   @Override
   public void a(cmj $$0) {
      cmj $$1 = this.gx();
      if ($$1.b() != $$0.b()) {
         this.cb = null;
      }

      this.ao.a(ch, $$0);
   }

   @Override
   public cmj gx() {
      return this.ao.a(ch);
   }

   @Override
   protected void b(dbs $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cz = this.cz + $$0.q();
      this.ct = this.gm();
      if (this.gS()) {
         this.cr = 40;
         this.cs = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dQ().b(new btb(this.dQ(), this.dv(), this.dx() + 0.5, this.dB(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cu = $$0;
   }

   public boolean gC() {
      return this.cu;
   }

   @Override
   public void a(@Nullable btl $$0) {
      if ($$0 != null && this.dQ() instanceof aqt) {
         ((aqt)this.dQ()).a(cen.c, $$0, this);
         if (this.bE() && $$0 instanceof cmv) {
            this.dQ().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(brj $$0) {
      cg.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bsq $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gP();
      super.a($$0);
   }

   private void gP() {
      this.a(ccq.b);
      this.a(ccq.c);
      this.a(ccq.d);
      this.a(ccq.e);
   }

   private void b(bsq $$0) {
      if (this.dQ() instanceof aqt $$1) {
         Optional<ccs> $$3 = this.bF.c(ccq.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bub.class::isInstance).forEach($$2x -> $$1.a(cen.d, $$0, (bub)$$2x));
         }
      }
   }

   public void a(ccq<jl> $$0) {
      if (this.dQ() instanceof aqt) {
         MinecraftServer $$1 = ((aqt)this.dQ()).o();
         this.bF.c($$0).ifPresent($$2 -> {
            aqt $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               ceq $$4 = $$3.y();
               Optional<jm<cet>> $$5 = $$4.c($$2.b());
               BiPredicate<cmi, jm<cet>> $$6 = cf.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  age.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.cv + this.gU() >= 12 && !this.fI() && this.g() == 0;
   }

   private boolean gQ() {
      return this.cv < 12;
   }

   private void gR() {
      if (this.gQ() && this.gU() != 0) {
         for (int $$0 = 0; $$0 < this.x().b(); $$0++) {
            cuo $$1 = this.x().a($$0);
            if (!$$1.e()) {
               Integer $$2 = cd.get($$1.g());
               if ($$2 != null) {
                  int $$3 = $$1.H();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cv = this.cv + $$2;
                     this.x().a($$0, 1);
                     if (!this.gQ()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cmv $$0) {
      return this.cw.a($$0.cA(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cv -= $$0;
   }

   public void gD() {
      this.gR();
      this.v(12);
   }

   @Override
   public void b(dbt $$0) {
      this.cb = $$0;
   }

   private boolean gS() {
      int $$0 = this.gx().c();
      return cmj.d($$0) && this.cz >= cmj.c($$0);
   }

   private void gT() {
      this.a(this.gx().a(this.gx().c() + 1));
      this.gt();
   }

   @Override
   protected wy cs() {
      return wy.c(this.am().g() + "." + lt.x.b(this.gx().b()).a());
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
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if ($$2 == btp.e) {
         this.a(this.gx().a(cml.b));
      }

      if ($$2 == btp.n || $$2 == btp.m || btp.a($$2) || $$2 == btp.o) {
         this.a(this.gx().a(cmn.a($$0.t(this.dq()))));
      }

      if ($$2 == btp.d) {
         this.cE = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cmi b(aqt $$0, bsk $$1) {
      double $$2 = this.ah.j();
      cmn $$3;
      if ($$2 < 0.5) {
         $$3 = cmn.a($$0.t(this.dq()));
      } else if ($$2 < 0.75) {
         $$3 = this.gx().a();
      } else {
         $$3 = ((cmi)$$1).gx().a();
      }

      cmi $$6 = new cmi(bsw.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dq()), btp.e, null);
      return $$6;
   }

   @Override
   public void a(aqt $$0, btk $$1) {
      if ($$0.al() != bqn.a) {
         cg.info("Villager {} was struck by lightning {}.", this, $$1);
         ckr $$2 = bsw.bo.a((dcu)$$0);
         if ($$2 != null) {
            $$2.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
            $$2.a($$0, $$0.d_($$2.dq()), btp.i, null);
            $$2.c(this.gb());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.p(this.cF());
            }

            $$2.fP();
            $$0.a_($$2);
            this.gP();
            this.aq();
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
   public boolean k(cuo $$0) {
      cuj $$1 = $$0.g();
      return (cj.contains($$1) || this.gx().b().d().contains($$1)) && this.x().c($$0);
   }

   public boolean gE() {
      return this.gU() >= 24;
   }

   public boolean gF() {
      return this.gU() < 12;
   }

   private int gU() {
      bqz $$0 = this.x();
      return cd.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gG() {
      return this.x().a_($$0 -> $$0.a(awm.bw));
   }

   @Override
   protected void gt() {
      cmj $$0 = this.gx();
      Int2ObjectMap<cmm.g[]> $$2;
      if (this.dQ().J().b(cpl.c)) {
         Int2ObjectMap<cmm.g[]> $$1 = cmm.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmm.a.get($$0.b());
      } else {
         $$2 = cmm.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmm.g[] $$4 = (cmm.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dbt $$5 = this.go();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqt $$0, cmi $$1, long $$2) {
      if (($$2 < this.cx || $$2 >= this.cx + 1200L) && ($$2 < $$1.cx || $$2 >= $$1.cx + 1200L)) {
         this.cw.a($$1.cw, this.ah, 10);
         this.cx = $$2;
         $$1.cx = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gV() {
      long $$0 = this.dQ().Z();
      if (this.cy == 0L) {
         this.cy = $$0;
      } else if ($$0 >= this.cy + 24000L) {
         this.cw.b();
         this.cy = $$0;
      }
   }

   public void a(aqt $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ewr $$3 = this.cL().c(10.0, 10.0, 10.0);
         List<cmi> $$4 = $$0.a(cmi.class, $$3);
         List<cmi> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azg.a(bsw.af, btp.f, $$0, this.dq(), 10, 8, 6, azg.a.a).isEmpty()) {
               $$4.forEach(cdi::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dQ().Z()) ? false : !this.bF.a(ccq.F);
   }

   @Override
   public void a(cen $$0, bsq $$1) {
      if ($$0 == cen.a) {
         this.cw.a($$1.cA(), ccn.d, 20);
         this.cw.a($$1.cA(), ccn.c, 25);
      } else if ($$0 == cen.e) {
         this.cw.a($$1.cA(), ccn.e, 2);
      } else if ($$0 == cen.c) {
         this.cw.a($$1.cA(), ccn.b, 25);
      } else if ($$0 == cen.d) {
         this.cw.a($$1.cA(), ccn.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cz;
   }

   public void u(int $$0) {
      this.cz = $$0;
   }

   private void gW() {
      this.gN();
      this.cC = 0;
   }

   public ccm gH() {
      return this.cw;
   }

   public void a(ux $$0) {
      this.cw.a(new Dynamic(uo.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Override
   public void b(jd $$0) {
      super.b($$0);
      this.bF.a(ccq.H, this.dQ().Z());
      this.bF.b(ccq.m);
      this.bF.b(ccq.E);
   }

   @Override
   public void fJ() {
      super.fJ();
      this.bF.a(ccq.I, this.dQ().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(ccq.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
