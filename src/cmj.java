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

public class cmj extends cme implements bud, cml {
   private static final Logger ce = LogUtils.getLogger();
   private static final akj<cmk> cf = akn.a(cmj.class, akl.u);
   public static final int ca = 12;
   public static final Map<cuj, Integer> cb = ImmutableMap.of(cur.px, 4, cur.ug, 1, cur.uf, 1, cur.vk, 1);
   private static final int cg = 2;
   private static final Set<cuj> ch = ImmutableSet.of(cur.px, cur.ug, cur.uf, cur.pw, cur.pv, cur.vk, new cuj[]{cur.vl, cur.vi, cur.vj});
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
   private cmw cr;
   private boolean cs;
   private int ct;
   private final cco cu = new cco();
   private long cv;
   private long cw;
   private int cx;
   private long cz;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<ccs<?>> cD = ImmutableList.of(
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
   private static final ImmutableList<cdz<? extends cdy<? super cmj>>> cE = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.e, cdz.f, cdz.g, cdz.h, cdz.i, cdz.j);
   public static final Map<ccs<jh>, BiPredicate<cmj, ji<cev>>> cd = ImmutableMap.of(
      ccs.b,
      (BiPredicate<cmj, ji>)($$0, $$1) -> $$1.a(cew.n),
      ccs.c,
      (BiPredicate<cmj, ji>)($$0, $$1) -> $$0.gB().b().b().test($$1),
      ccs.d,
      (BiPredicate<cmj, ji>)($$0, $$1) -> cmm.a.test($$1),
      ccs.e,
      (BiPredicate<cmj, ji>)($$0, $$1) -> $$1.a(cew.o)
   );

   public cmj(bsz<? extends cmj> $$0, dbx $$1) {
      this($$0, $$1, cmo.c);
   }

   public cmj(bsz<? extends cmj> $$0, dbx $$1, cmo $$2) {
      super($$0, $$1);
      ((ccz)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gB().a($$2).a(cmm.b));
   }

   @Override
   public buq<cmj> dS() {
      return (buq<cmj>)super.dS();
   }

   @Override
   protected buq.b<cmj> dT() {
      return buq.a(cD, cE);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      buq<cmj> $$1 = this.dT().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(are $$0) {
      buq<cmj> $$1 = this.dS();
      $$1.b($$0, this);
      this.bD = $$1.i();
      this.a(this.dS());
   }

   private void a(buq<cmj> $$0) {
      cmm $$1 = this.gB().b();
      if (this.p_()) {
         $$0.a(coo.e);
         $$0.a(col.d, byn.a(0.5F));
      } else {
         $$0.a(coo.f);
         $$0.a(col.c, byn.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccs.c, cct.a)));
      }

      $$0.a(col.a, byn.a($$1, 0.5F));
      $$0.a(col.f, byn.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccs.e, cct.a)));
      $$0.a(col.e, byn.c($$1, 0.5F));
      $$0.a(col.b, byn.e($$1, 0.5F));
      $$0.a(col.g, byn.f($$1, 0.5F));
      $$0.a(col.i, byn.g($$1, 0.5F));
      $$0.a(col.h, byn.h($$1, 0.5F));
      $$0.a(col.j, byn.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(col.a));
      $$0.b(col.b);
      $$0.a(col.b);
      $$0.a(this.dP().aa(), this.dP().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof are) {
         this.c((are)this.dP());
      }
   }

   public static buv.a gz() {
      return btq.A().a(buw.r, 0.5).a(buw.k, 48.0);
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

            this.b(new bsb(bsd.j, 200, 0));
         }
      }

      if (this.cr != null && this.dP() instanceof are) {
         ((are)this.dP()).a(cep.e, this.cr, this);
         this.dP().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gg() && this.ah.a(100) == 0) {
         coh $$0 = ((are)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gB().b() == cmm.b && this.gr()) {
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
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.tJ) || !this.bD() || this.gr() || this.fL()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gM();
         return bqt.a(this.dP().B);
      } else {
         boolean $$3 = this.gs().isEmpty();
         if ($$1 == bqs.a) {
            if ($$3 && !this.dP().B) {
               this.gM();
            }

            $$0.a(awj.S);
         }

         if ($$3) {
            return bqt.a(this.dP().B);
         } else {
            if (!this.dP().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return bqt.a(this.dP().B);
         }
      }
   }

   private void gM() {
      this.t(40);
      if (!this.dP().x_()) {
         this.b(avz.AS);
      }
   }

   private void h(cmw $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gB().c());
   }

   @Override
   public void f(@Nullable cmw $$0) {
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
      for (dav $$0 : this.gs()) {
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

      for (dav $$0 : this.gs()) {
         $$0.j();
      }

      this.gO();
      this.cz = this.dP().Z();
      this.cA++;
   }

   private void gO() {
      daw $$0 = this.gs();
      cmw $$1 = this.gq();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cb.j, $$0, this.gB().c(), this.u(), this.gt(), this.gC());
      }
   }

   private boolean gP() {
      for (dav $$0 : this.gs()) {
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
         for (dav $$1 : this.gs()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gS();
      }

      this.gO();
   }

   private void gS() {
      for (dav $$0 : this.gs()) {
         $$0.g();
      }
   }

   private void i(cmw $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dav $$2 : this.gs()) {
            $$2.a(-ayy.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bsd.F)) {
         bsb $$3 = $$0.c(bsd.F);
         int $$4 = $$3.e();

         for (dav $$5 : this.gs()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().I());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cf, new cmk(cmo.c, cmm.b, 1));
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      cmk.c.encodeStart(vf.a, this.gB()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         cmk.c.parse(vf.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
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
   protected avy d(brm $$0) {
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
   public void a(cmk $$0) {
      cmk $$1 = this.gB();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public cmk gB() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(dav $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gq();
      if (this.gW()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new bte(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gG() {
      return this.cs;
   }

   @Override
   public void a(@Nullable bto $$0) {
      if ($$0 != null && this.dP() instanceof are) {
         ((are)this.dP()).a(cep.c, $$0, this);
         if (this.bD() && $$0 instanceof cmw) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(brm $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bst $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gT();
      super.a($$0);
   }

   private void gT() {
      this.a(ccs.b);
      this.a(ccs.c);
      this.a(ccs.d);
      this.a(ccs.e);
   }

   private void b(bst $$0) {
      if (this.dP() instanceof are $$1) {
         Optional<ccu> $$3 = this.bD.c(ccs.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bud.class::isInstance).forEach($$2x -> $$1.a(cep.d, $$0, (bud)$$2x));
         }
      }
   }

   public void a(ccs<jh> $$0) {
      if (this.dP() instanceof are) {
         MinecraftServer $$1 = ((are)this.dP()).o();
         this.bD.c($$0).ifPresent($$2 -> {
            are $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               ces $$4 = $$3.y();
               Optional<ji<cev>> $$5 = $$4.c($$2.b());
               BiPredicate<cmj, ji<cev>> $$6 = cd.get($$0);
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
            cuo $$1 = this.y().a($$0);
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

   public int g(cmw $$0) {
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
   public void b(daw $$0) {
      this.bZ = $$0;
   }

   private boolean gW() {
      int $$0 = this.gB().c();
      return cmk.d($$0) && this.cx >= cmk.c($$0);
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
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      if ($$2 == bts.e) {
         this.a(this.gB().a(cmm.b));
      }

      if ($$2 == bts.n || $$2 == bts.m || bts.a($$2) || $$2 == bts.o) {
         this.a(this.gB().a(cmo.a($$0.t(this.dp()))));
      }

      if ($$2 == bts.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cmj b(are $$0, bsn $$1) {
      double $$2 = this.ah.j();
      cmo $$3;
      if ($$2 < 0.5) {
         $$3 = cmo.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gB().a();
      } else {
         $$3 = ((cmj)$$1).gB().a();
      }

      cmj $$6 = new cmj(bsz.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), bts.e, null);
      return $$6;
   }

   @Override
   public void a(are $$0, btn $$1) {
      if ($$0.al() != bqq.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cks $$2 = bsz.bo.a((dbx)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), bts.i, null);
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
   protected void b(cjg $$0) {
      cmh.a(this, this, $$0);
   }

   @Override
   public boolean k(cuo $$0) {
      cuj $$1 = $$0.g();
      return (ch.contains($$1) || this.gB().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gI() {
      return this.gY() >= 24;
   }

   public boolean gJ() {
      return this.gY() < 12;
   }

   private int gY() {
      brc $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gK() {
      return this.y().a_($$0 -> $$0.a(awx.bx));
   }

   @Override
   protected void gx() {
      cmk $$0 = this.gB();
      Int2ObjectMap<cmn.g[]> $$2;
      if (this.dP().J().b(cpm.d)) {
         Int2ObjectMap<cmn.g[]> $$1 = cmn.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmn.a.get($$0.b());
      } else {
         $$2 = cmn.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmn.g[] $$4 = (cmn.g[])$$2.get($$0.c());
         if ($$4 != null) {
            daw $$5 = this.gs();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(are $$0, cmj $$1, long $$2) {
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
         evl $$3 = this.cK().c(10.0, 10.0, 10.0);
         List<cmj> $$4 = $$0.a(cmj.class, $$3);
         List<cmj> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azr.a(bsz.af, bts.f, $$0, this.dp(), 10, 8, 6, azr.a.a).isEmpty()) {
               $$4.forEach(cdk::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Z()) ? false : !this.bD.a(ccs.F);
   }

   @Override
   public void a(cep $$0, bst $$1) {
      if ($$0 == cep.a) {
         this.cu.a($$1.cz(), ccp.d, 20);
         this.cu.a($$1.cz(), ccp.c, 25);
      } else if ($$0 == cep.e) {
         this.cu.a($$1.cz(), ccp.e, 2);
      } else if ($$0 == cep.c) {
         this.cu.a($$1.cz(), ccp.b, 25);
      } else if ($$0 == cep.d) {
         this.cu.a($$1.cz(), ccp.a, 25);
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

   public cco gL() {
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
      this.bD.a(ccs.H, this.dP().Z());
      this.bD.b(ccs.m);
      this.bD.b(ccs.E);
   }

   @Override
   public void fM() {
      super.fM();
      this.bD.a(ccs.I, this.dP().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bD.c(ccs.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
