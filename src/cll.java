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

public class cll extends clg implements btf, cln {
   private static final Logger ce = LogUtils.getLogger();
   private static final ajs<clm> cf = ajw.a(cll.class, aju.u);
   public static final int ca = 12;
   public static final Map<ctl, Integer> cb = ImmutableMap.of(ctt.px, 4, ctt.ug, 1, ctt.uf, 1, ctt.vk, 1);
   private static final int cg = 2;
   private static final Set<ctl> ch = ImmutableSet.of(ctt.px, ctt.ug, ctt.uf, ctt.pw, ctt.pv, ctt.vk, new ctl[]{ctt.vl, ctt.vi, ctt.vj});
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
   private cly cr;
   private boolean cs;
   private int ct;
   private final cbq cu = new cbq();
   private long cv;
   private long cw;
   private int cx;
   private long cz;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<cbu<?>> cD = ImmutableList.of(
      cbu.b,
      cbu.c,
      cbu.d,
      cbu.e,
      cbu.g,
      cbu.h,
      cbu.i,
      cbu.j,
      cbu.k,
      cbu.l,
      cbu.L,
      cbu.aP,
      new cbu[]{cbu.m, cbu.n, cbu.q, cbu.r, cbu.t, cbu.v, cbu.w, cbu.x, cbu.y, cbu.A, cbu.f, cbu.C, cbu.D, cbu.E, cbu.H, cbu.I, cbu.J, cbu.F}
   );
   private static final ImmutableList<cdb<? extends cda<? super cll>>> cE = ImmutableList.of(cdb.c, cdb.d, cdb.b, cdb.e, cdb.f, cdb.g, cdb.h, cdb.i, cdb.j);
   public static final Map<cbu<iw>, BiPredicate<cll, ix<cdx>>> cd = ImmutableMap.of(
      cbu.b,
      (BiPredicate<cll, ix>)($$0, $$1) -> $$1.a(cdy.n),
      cbu.c,
      (BiPredicate<cll, ix>)($$0, $$1) -> $$0.gA().b().b().test($$1),
      cbu.d,
      (BiPredicate<cll, ix>)($$0, $$1) -> clo.a.test($$1),
      cbu.e,
      (BiPredicate<cll, ix>)($$0, $$1) -> $$1.a(cdy.o)
   );

   public cll(bsc<? extends cll> $$0, daz $$1) {
      this($$0, $$1, clq.c);
   }

   public cll(bsc<? extends cll> $$0, daz $$1, clq $$2) {
      super($$0, $$1);
      ((ccb)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gA().a($$2).a(clo.b));
   }

   @Override
   public bts<cll> dS() {
      return (bts<cll>)super.dS();
   }

   @Override
   protected bts.b<cll> dT() {
      return bts.a(cD, cE);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      bts<cll> $$1 = this.dT().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aqn $$0) {
      bts<cll> $$1 = this.dS();
      $$1.b($$0, this);
      this.bD = $$1.i();
      this.a(this.dS());
   }

   private void a(bts<cll> $$0) {
      clo $$1 = this.gA().b();
      if (this.p_()) {
         $$0.a(cnp.e);
         $$0.a(cnn.d, bxp.a(0.5F));
      } else {
         $$0.a(cnp.f);
         $$0.a(cnn.c, bxp.b($$1, 0.5F), ImmutableSet.of(Pair.of(cbu.c, cbv.a)));
      }

      $$0.a(cnn.a, bxp.a($$1, 0.5F));
      $$0.a(cnn.f, bxp.d($$1, 0.5F), ImmutableSet.of(Pair.of(cbu.e, cbv.a)));
      $$0.a(cnn.e, bxp.c($$1, 0.5F));
      $$0.a(cnn.b, bxp.e($$1, 0.5F));
      $$0.a(cnn.g, bxp.f($$1, 0.5F));
      $$0.a(cnn.i, bxp.g($$1, 0.5F));
      $$0.a(cnn.h, bxp.h($$1, 0.5F));
      $$0.a(cnn.j, bxp.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cnn.a));
      $$0.b(cnn.b);
      $$0.a(cnn.b);
      $$0.a(this.dP().Z(), this.dP().Y());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dP() instanceof aqn) {
         this.c((aqn)this.dP());
      }
   }

   public static btx.a gy() {
      return bss.A().a(bty.r, 0.5).a(bty.k, 48.0);
   }

   public boolean gz() {
      return this.cC;
   }

   @Override
   protected void Y() {
      this.dP().af().a("villagerBrain");
      this.dS().a((aqn)this.dP(), this);
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

            this.b(new bre(brg.j, 200, 0));
         }
      }

      if (this.cr != null && this.dP() instanceof aqn) {
         ((aqn)this.dP()).a(cdr.e, this.cr, this);
         this.dP().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gf() && this.ah.a(100) == 0) {
         cnj $$0 = ((aqn)this.dP()).d(this.dp());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dP().a(this, (byte)42);
         }
      }

      if (this.gA().b() == clo.b && this.gq()) {
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
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.tJ) || !this.bD() || this.gq() || this.fL()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gL();
         return bpw.a(this.dP().B);
      } else {
         boolean $$3 = this.gr().isEmpty();
         if ($$1 == bpv.a) {
            if ($$3 && !this.dP().B) {
               this.gL();
            }

            $$0.a(avs.S);
         }

         if ($$3) {
            return bpw.a(this.dP().B);
         } else {
            if (!this.dP().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return bpw.a(this.dP().B);
         }
      }
   }

   private void gL() {
      this.t(40);
      if (!this.dP().x_()) {
         this.b(avi.AS);
      }
   }

   private void h(cly $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gA().c());
   }

   @Override
   public void f(@Nullable cly $$0) {
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
      for (czx $$0 : this.gr()) {
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

      for (czx $$0 : this.gr()) {
         $$0.j();
      }

      this.gN();
      this.cz = this.dP().Y();
      this.cA++;
   }

   private void gN() {
      czy $$0 = this.gr();
      cly $$1 = this.gp();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cb.j, $$0, this.gA().c(), this.u(), this.gs(), this.gB());
      }
   }

   private boolean gO() {
      for (czx $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gP() {
      return this.cA == 0 || this.cA < 2 && this.dP().Y() > this.cz + 2400L;
   }

   public boolean gD() {
      long $$0 = this.cz + 12000L;
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
         this.cz = $$1;
         this.gZ();
      }

      return this.gP() && this.gO();
   }

   private void gQ() {
      int $$0 = 2 - this.cA;
      if ($$0 > 0) {
         for (czx $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gR();
      }

      this.gN();
   }

   private void gR() {
      for (czx $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void i(cly $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (czx $$2 : this.gr()) {
            $$2.a(-ayf.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(brg.F)) {
         bre $$3 = $$0.c(brg.F);
         int $$4 = $$3.e();

         for (czx $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().I());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cf, new clm(clq.c, clo.b, 1));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      clm.c.encodeStart(ur.a, this.gA()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.ct);
      $$0.a("Gossips", this.cu.a(ur.a));
      $$0.a("Xp", this.cx);
      $$0.a("LastRestock", this.cz);
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
         clm.c.parse(ur.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.ct = $$0.f("FoodLevel");
      }

      uj $$1 = $$0.c("Gossips", 10);
      this.cu.a(new Dynamic(ur.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cx = $$0.h("Xp");
      }

      this.cz = $$0.i("LastRestock");
      this.cw = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dP() instanceof aqn) {
         this.c((aqn)this.dP());
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
   protected avh v() {
      if (this.fL()) {
         return null;
      } else {
         return this.gq() ? avi.AT : avi.AO;
      }
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.AR;
   }

   @Override
   protected avh o_() {
      return avi.AQ;
   }

   public void gE() {
      this.b(this.gA().b().f());
   }

   @Override
   public void a(clm $$0) {
      clm $$1 = this.gA();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public clm gA() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(czx $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gp();
      if (this.gV()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dP().b(new bsg(this.dP(), this.du(), this.dw() + 0.5, this.dA(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gF() {
      return this.cs;
   }

   @Override
   public void a(@Nullable bsq $$0) {
      if ($$0 != null && this.dP() instanceof aqn) {
         ((aqn)this.dP()).a(cdr.c, $$0, this);
         if (this.bD() && $$0 instanceof cly) {
            this.dP().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bqp $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      brw $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gS();
      super.a($$0);
   }

   private void gS() {
      this.a(cbu.b);
      this.a(cbu.c);
      this.a(cbu.d);
      this.a(cbu.e);
   }

   private void b(brw $$0) {
      if (this.dP() instanceof aqn $$1) {
         Optional<cbw> $$3 = this.bD.c(cbu.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(btf.class::isInstance).forEach($$2x -> $$1.a(cdr.d, $$0, (btf)$$2x));
         }
      }
   }

   public void a(cbu<iw> $$0) {
      if (this.dP() instanceof aqn) {
         MinecraftServer $$1 = ((aqn)this.dP()).o();
         this.bD.c($$0).ifPresent($$2 -> {
            aqn $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cdu $$4 = $$3.y();
               Optional<ix<cdx>> $$5 = $$4.c($$2.b());
               BiPredicate<cll, ix<cdx>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agb.c($$3, $$2.b());
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
            ctq $$1 = this.y().a($$0);
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

   public int g(cly $$0) {
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
   public void b(czy $$0) {
      this.bZ = $$0;
   }

   private boolean gV() {
      int $$0 = this.gA().c();
      return clm.d($$0) && this.cx >= clm.c($$0);
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
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      if ($$2 == bsu.e) {
         this.a(this.gA().a(clo.b));
      }

      if ($$2 == bsu.n || $$2 == bsu.m || bsu.a($$2) || $$2 == bsu.o) {
         this.a(this.gA().a(clq.a($$0.t(this.dp()))));
      }

      if ($$2 == bsu.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cll b(aqn $$0, brq $$1) {
      double $$2 = this.ah.j();
      clq $$3;
      if ($$2 < 0.5) {
         $$3 = clq.a($$0.t(this.dp()));
      } else if ($$2 < 0.75) {
         $$3 = this.gA().a();
      } else {
         $$3 = ((cll)$$1).gA().a();
      }

      cll $$6 = new cll(bsc.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dp()), bsu.e, null);
      return $$6;
   }

   @Override
   public void a(aqn $$0, bsp $$1) {
      if ($$0.ak() != bpt.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cju $$2 = bsc.bo.a((daz)$$0);
         if ($$2 != null) {
            $$2.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$2.a($$0, $$0.d_($$2.dp()), bsu.i, null);
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
   protected void b(cii $$0) {
      clj.a(this, this, $$0);
   }

   @Override
   public boolean k(ctq $$0) {
      ctl $$1 = $$0.g();
      return (ch.contains($$1) || this.gA().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gH() {
      return this.gX() >= 24;
   }

   public boolean gI() {
      return this.gX() < 12;
   }

   private int gX() {
      bqf $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gJ() {
      return this.y().a_($$0 -> $$0.a(awf.by));
   }

   @Override
   protected void gw() {
      clm $$0 = this.gA();
      Int2ObjectMap<clp.g[]> $$2;
      if (this.dP().J().b(coo.d)) {
         Int2ObjectMap<clp.g[]> $$1 = clp.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : clp.a.get($$0.b());
      } else {
         $$2 = clp.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         clp.g[] $$4 = (clp.g[])$$2.get($$0.c());
         if ($$4 != null) {
            czy $$5 = this.gr();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqn $$0, cll $$1, long $$2) {
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

   public void a(aqn $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         euh $$3 = this.cK().c(10.0, 10.0, 10.0);
         List<cll> $$4 = $$0.a(cll.class, $$3);
         List<cll> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ayx.a(bsc.af, bsu.f, $$0, this.dp(), 10, 8, 6, ayx.a.a).isEmpty()) {
               $$4.forEach(ccm::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dP().Y()) ? false : !this.bD.a(cbu.F);
   }

   @Override
   public void a(cdr $$0, brw $$1) {
      if ($$0 == cdr.a) {
         this.cu.a($$1.cz(), cbr.d, 20);
         this.cu.a($$1.cz(), cbr.c, 25);
      } else if ($$0 == cdr.e) {
         this.cu.a($$1.cz(), cbr.e, 2);
      } else if ($$0 == cdr.c) {
         this.cu.a($$1.cz(), cbr.b, 25);
      } else if ($$0 == cdr.d) {
         this.cu.a($$1.cz(), cbr.a, 25);
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

   public cbq gK() {
      return this.cu;
   }

   public void a(va $$0) {
      this.cu.a(new Dynamic(ur.a, $$0));
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   @Override
   public void b(io $$0) {
      super.b($$0);
      this.bD.a(cbu.H, this.dP().Y());
      this.bD.b(cbu.m);
      this.bD.b(cbu.E);
   }

   @Override
   public void fM() {
      super.fM();
      this.bD.a(cbu.I, this.dP().Y());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bD.c(cbu.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
