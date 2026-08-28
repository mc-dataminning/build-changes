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

public class cly extends clt implements btr, cma {
   private static final Logger cg = LogUtils.getLogger();
   private static final ajp<clz> ch = ajt.a(cly.class, ajr.u);
   public static final int cc = 12;
   public static final Map<cty, Integer> cd = ImmutableMap.of(cug.px, 4, cug.ug, 1, cug.uf, 1, cug.vk, 1);
   private static final int ci = 2;
   private static final Set<cty> cj = ImmutableSet.of(cug.px, cug.ug, cug.uf, cug.pw, cug.pv, cug.vk, new cty[]{cug.vl, cug.vi, cug.vj});
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
   private cml ct;
   private boolean cu;
   private int cv;
   private final ccc cw = new ccc();
   private long cx;
   private long cy;
   private int cz;
   private long cA;
   private int cC;
   private long cD;
   private boolean cE;
   private static final ImmutableList<ccg<?>> cF = ImmutableList.of(
      ccg.b,
      ccg.c,
      ccg.d,
      ccg.e,
      ccg.g,
      ccg.h,
      ccg.i,
      ccg.j,
      ccg.k,
      ccg.l,
      ccg.L,
      ccg.aP,
      new ccg[]{ccg.m, ccg.n, ccg.q, ccg.r, ccg.t, ccg.v, ccg.w, ccg.x, ccg.y, ccg.A, ccg.f, ccg.C, ccg.D, ccg.E, ccg.H, ccg.I, ccg.J, ccg.F}
   );
   private static final ImmutableList<cdn<? extends cdm<? super cly>>> cG = ImmutableList.of(cdn.c, cdn.d, cdn.b, cdn.e, cdn.f, cdn.g, cdn.h, cdn.i, cdn.j);
   public static final Map<ccg<ji>, BiPredicate<cly, jj<cej>>> cf = ImmutableMap.of(
      ccg.b,
      (BiPredicate<cly, jj>)($$0, $$1) -> $$1.a(cek.n),
      ccg.c,
      (BiPredicate<cly, jj>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      ccg.d,
      (BiPredicate<cly, jj>)($$0, $$1) -> cmb.a.test($$1),
      ccg.e,
      (BiPredicate<cly, jj>)($$0, $$1) -> $$1.a(cek.o)
   );

   public cly(bsn<? extends cly> $$0, dcg $$1) {
      this($$0, $$1, cmd.c);
   }

   public cly(bsn<? extends cly> $$0, dcg $$1, cmd $$2) {
      super($$0, $$1);
      ((ccn)this.J()).b(true);
      this.J().a(true);
      this.a_(true);
      this.a(this.gy().a($$2).a(cmb.b));
   }

   @Override
   public bue<cly> dV() {
      return (bue<cly>)super.dV();
   }

   @Override
   protected bue.b<cly> dW() {
      return bue.a(cF, cG);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      bue<cly> $$1 = this.dW().a($$0);
      this.a($$1);
      return $$1;
   }

   public void b(aqm $$0) {
      bue<cly> $$1 = this.dV();
      $$1.b($$0, this);
      this.bG = $$1.i();
      this.a(this.dV());
   }

   private void a(bue<cly> $$0) {
      cmb $$1 = this.gy().b();
      if (this.o_()) {
         $$0.a(coc.e);
         $$0.a(coa.d, byb.a(0.5F));
      } else {
         $$0.a(coc.f);
         $$0.a(coa.c, byb.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccg.c, cch.a)));
      }

      $$0.a(coa.a, byb.a($$1, 0.5F));
      $$0.a(coa.f, byb.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccg.e, cch.a)));
      $$0.a(coa.e, byb.c($$1, 0.5F));
      $$0.a(coa.b, byb.e($$1, 0.5F));
      $$0.a(coa.g, byb.f($$1, 0.5F));
      $$0.a(coa.i, byb.g($$1, 0.5F));
      $$0.a(coa.h, byb.h($$1, 0.5F));
      $$0.a(coa.j, byb.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(coa.a));
      $$0.b(coa.b);
      $$0.a(coa.b);
      $$0.a(this.dR().aa(), this.dR().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dR() instanceof aqm) {
         this.b((aqm)this.dR());
      }
   }

   public static buj.a gw() {
      return bte.A().a(buk.v, 0.5).a(buk.m, 48.0);
   }

   public boolean gx() {
      return this.cE;
   }

   @Override
   protected void Z() {
      this.dR().ag().a("villagerBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
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

            this.b(new brp(brr.j, 200, 0));
         }
      }

      if (this.ct != null && this.dR() instanceof aqm) {
         ((aqm)this.dR()).a(ced.e, this.ct, this);
         this.dR().a(this, (byte)14);
         this.ct = null;
      }

      if (!this.gc() && this.ah.a(100) == 0) {
         cnw $$0 = ((aqm)this.dR()).d(this.dr());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dR().a(this, (byte)42);
         }
      }

      if (this.gy().b() == cmb.b && this.go()) {
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
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.tJ) || !this.bF() || this.go() || this.fJ()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gJ();
         return bqh.a(this.dR().B);
      } else {
         if (!this.dR().B) {
            boolean $$3 = this.gp().isEmpty();
            if ($$1 == bqg.a) {
               if ($$3) {
                  this.gJ();
               }

               $$0.a(avr.S);
            }

            if ($$3) {
               return bqh.c;
            }

            this.h($$0);
         }

         return bqh.a(this.dR().B);
      }
   }

   private void gJ() {
      this.s(40);
      if (!this.dR().x_()) {
         this.b(avh.AV);
      }
   }

   private void h(cml $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gy().c());
   }

   @Override
   public void f(@Nullable cml $$0) {
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
      if (!this.dR().x_()) {
         for (dbe $$0 : this.gp()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Override
   public boolean gv() {
      return this.dR().B;
   }

   public void gA() {
      this.gP();

      for (dbe $$0 : this.gp()) {
         $$0.j();
      }

      this.gL();
      this.cA = this.dR().Z();
      this.cC++;
   }

   private void gL() {
      dbf $$0 = this.gp();
      cml $$1 = this.gn();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.ce.j, $$0, this.gy().c(), this.t(), this.gq(), this.gz());
      }
   }

   private boolean gM() {
      for (dbe $$0 : this.gp()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gN() {
      return this.cC == 0 || this.cC < 2 && this.dR().Z() > this.cA + 2400L;
   }

   public boolean gB() {
      long $$0 = this.cA + 12000L;
      long $$1 = this.dR().Z();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dR().aa();
      if (this.cD > 0L) {
         long $$4 = this.cD / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cD = $$3;
      if ($$2) {
         this.cA = $$1;
         this.gX();
      }

      return this.gN() && this.gM();
   }

   private void gO() {
      int $$0 = 2 - this.cC;
      if ($$0 > 0) {
         for (dbe $$1 : this.gp()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (dbe $$0 : this.gp()) {
         $$0.g();
      }
   }

   private void i(cml $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dbe $$2 : this.gp()) {
            $$2.a(-ayg.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(brr.F)) {
         brp $$3 = $$0.c(brr.F);
         int $$4 = $$3.e();

         for (dbe $$5 : this.gp()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().H());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ch, new clz(cmd.c, cmb.b, 1));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      clz.c.encodeStart(ul.a, this.gy()).resultOrPartial(cg::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cv);
      $$0.a("Gossips", this.cw.a(ul.a));
      $$0.a("Xp", this.cz);
      $$0.a("LastRestock", this.cA);
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
         clz.c.parse(ul.a, $$0.c("VillagerData")).resultOrPartial(cg::error).ifPresent($$0x -> this.ao.a(ch, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cv = $$0.f("FoodLevel");
      }

      ud $$1 = $$0.c("Gossips", 10);
      this.cw.a(new Dynamic(ul.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cz = $$0.h("Xp");
      }

      this.cA = $$0.i("LastRestock");
      this.cy = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dR() instanceof aqm) {
         this.b((aqm)this.dR());
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
   protected avg v() {
      if (this.fJ()) {
         return null;
      } else {
         return this.go() ? avh.AW : avh.AR;
      }
   }

   @Override
   protected avg d(bra $$0) {
      return avh.AU;
   }

   @Override
   protected avg n_() {
      return avh.AT;
   }

   public void gC() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(clz $$0) {
      clz $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.cb = null;
      }

      this.ao.a(ch, $$0);
   }

   @Override
   public clz gy() {
      return this.ao.a(ch);
   }

   @Override
   protected void b(dbe $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cz = this.cz + $$0.q();
      this.ct = this.gn();
      if (this.gT()) {
         this.cr = 40;
         this.cs = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dR().b(new bss(this.dR(), this.dw(), this.dy() + 0.5, this.dC(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cu = $$0;
   }

   public boolean gD() {
      return this.cu;
   }

   @Override
   public void a(@Nullable btc $$0) {
      if ($$0 != null && this.dR() instanceof aqm) {
         ((aqm)this.dR()).a(ced.c, $$0, this);
         if (this.bF() && $$0 instanceof cml) {
            this.dR().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bra $$0) {
      cg.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bsh $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(ccg.b);
      this.a(ccg.c);
      this.a(ccg.d);
      this.a(ccg.e);
   }

   private void b(bsh $$0) {
      if (this.dR() instanceof aqm $$1) {
         Optional<cci> $$3 = this.bG.c(ccg.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(btr.class::isInstance).forEach($$2x -> $$1.a(ced.d, $$0, (btr)$$2x));
         }
      }
   }

   public void a(ccg<ji> $$0) {
      if (this.dR() instanceof aqm) {
         MinecraftServer $$1 = ((aqm)this.dR()).o();
         this.bG.c($$0).ifPresent($$2 -> {
            aqm $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               ceg $$4 = $$3.y();
               Optional<jj<cej>> $$5 = $$4.c($$2.b());
               BiPredicate<cly, jj<cej>> $$6 = cf.get($$0);
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
      return this.cv + this.gV() >= 12 && !this.fJ() && this.g() == 0;
   }

   private boolean gR() {
      return this.cv < 12;
   }

   private void gS() {
      if (this.gR() && this.gV() != 0) {
         for (int $$0 = 0; $$0 < this.x().b(); $$0++) {
            cud $$1 = this.x().a($$0);
            if (!$$1.e()) {
               Integer $$2 = cd.get($$1.g());
               if ($$2 != null) {
                  int $$3 = $$1.H();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cv = this.cv + $$2;
                     this.x().a($$0, 1);
                     if (!this.gR()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cml $$0) {
      return this.cw.a($$0.cB(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cv -= $$0;
   }

   public void gE() {
      this.gS();
      this.v(12);
   }

   @Override
   public void b(dbf $$0) {
      this.cb = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return clz.d($$0) && this.cz >= clz.c($$0);
   }

   private void gU() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gu();
   }

   @Override
   protected wu ct() {
      return wu.c(this.am().g() + "." + lq.x.b(this.gy().b()).a());
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
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if ($$2 == btg.e) {
         this.a(this.gy().a(cmb.b));
      }

      if ($$2 == btg.n || $$2 == btg.m || btg.a($$2) || $$2 == btg.o) {
         this.a(this.gy().a(cmd.a($$0.t(this.dr()))));
      }

      if ($$2 == btg.d) {
         this.cE = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cly b(aqm $$0, bsb $$1) {
      double $$2 = this.ah.j();
      cmd $$3;
      if ($$2 < 0.5) {
         $$3 = cmd.a($$0.t(this.dr()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cly)$$1).gy().a();
      }

      cly $$6 = new cly(bsn.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dr()), btg.e, null);
      return $$6;
   }

   @Override
   public void a(aqm $$0, btb $$1) {
      if ($$0.al() != bqe.a) {
         cg.info("Villager {} was struck by lightning {}.", this, $$1);
         ckh $$2 = bsn.bo.a((dcg)$$0);
         if ($$2 != null) {
            $$2.b(this.dw(), this.dy(), this.dC(), this.dH(), this.dJ());
            $$2.a($$0, $$0.d_($$2.dr()), btg.i, null);
            $$2.c(this.gc());
            if (this.ai()) {
               $$2.b(this.aj());
               $$2.p(this.cG());
            }

            $$2.fQ();
            $$0.a_($$2);
            this.gQ();
            this.aq();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(civ $$0) {
      clw.a(this, this, $$0);
   }

   @Override
   public boolean k(cud $$0) {
      cty $$1 = $$0.g();
      return (cj.contains($$1) || this.gy().b().d().contains($$1)) && this.x().c($$0);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      bqq $$0 = this.x();
      return cd.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.x().a_($$0 -> $$0.a(awf.bx));
   }

   @Override
   protected void gu() {
      clz $$0 = this.gy();
      Int2ObjectMap<cmc.g[]> $$2;
      if (this.dR().J().b(cpb.c)) {
         Int2ObjectMap<cmc.g[]> $$1 = cmc.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmc.a.get($$0.b());
      } else {
         $$2 = cmc.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmc.g[] $$4 = (cmc.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dbf $$5 = this.gp();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqm $$0, cly $$1, long $$2) {
      if (($$2 < this.cx || $$2 >= this.cx + 1200L) && ($$2 < $$1.cx || $$2 >= $$1.cx + 1200L)) {
         this.cw.a($$1.cw, this.ah, 10);
         this.cx = $$2;
         $$1.cx = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gW() {
      long $$0 = this.dR().Z();
      if (this.cy == 0L) {
         this.cy = $$0;
      } else if ($$0 >= this.cy + 24000L) {
         this.cw.b();
         this.cy = $$0;
      }
   }

   public void a(aqm $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ewc $$3 = this.cM().c(10.0, 10.0, 10.0);
         List<cly> $$4 = $$0.a(cly.class, $$3);
         List<cly> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ayz.a(bsn.af, btg.f, $$0, this.dr(), 10, 8, 6, ayz.a.a).isEmpty()) {
               $$4.forEach(ccy::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dR().Z()) ? false : !this.bG.a(ccg.F);
   }

   @Override
   public void a(ced $$0, bsh $$1) {
      if ($$0 == ced.a) {
         this.cw.a($$1.cB(), ccd.d, 20);
         this.cw.a($$1.cB(), ccd.c, 25);
      } else if ($$0 == ced.e) {
         this.cw.a($$1.cB(), ccd.e, 2);
      } else if ($$0 == ced.c) {
         this.cw.a($$1.cB(), ccd.b, 25);
      } else if ($$0 == ced.d) {
         this.cw.a($$1.cB(), ccd.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cz;
   }

   public void u(int $$0) {
      this.cz = $$0;
   }

   private void gX() {
      this.gO();
      this.cC = 0;
   }

   public ccc gI() {
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
      this.bG.a(ccg.H, this.dR().Z());
      this.bG.b(ccg.m);
      this.bG.b(ccg.E);
   }

   @Override
   public void fK() {
      super.fK();
      this.bG.a(ccg.I, this.dR().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bG.c(ccg.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
