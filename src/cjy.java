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

public class cjy extends cjt implements brs, cka {
   private static final Logger ce = LogUtils.getLogger();
   private static final ajk<cjz> cf = ajo.a(cjy.class, ajm.u);
   public static final int ca = 12;
   public static final Map<cry, Integer> cb = ImmutableMap.of(csg.px, 4, csg.ug, 1, csg.uf, 1, csg.vk, 1);
   private static final int cg = 2;
   private static final Set<cry> ch = ImmutableSet.of(csg.px, csg.ug, csg.uf, csg.pw, csg.pv, csg.vk, new cry[]{csg.vl, csg.vi, csg.vj});
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
   private ckl cr;
   private boolean cs;
   private int ct;
   private final cad cu = new cad();
   private long cv;
   private long cw;
   private int cx;
   private long cy;
   private int cA;
   private long cB;
   private boolean cC;
   private static final ImmutableList<cah<?>> cD = ImmutableList.of(
      cah.b,
      cah.c,
      cah.d,
      cah.e,
      cah.g,
      cah.h,
      cah.i,
      cah.j,
      cah.k,
      cah.l,
      cah.L,
      cah.aP,
      new cah[]{cah.m, cah.n, cah.q, cah.r, cah.t, cah.v, cah.w, cah.x, cah.y, cah.A, cah.f, cah.C, cah.D, cah.E, cah.H, cah.I, cah.J, cah.F}
   );
   private static final ImmutableList<cbo<? extends cbn<? super cjy>>> cE = ImmutableList.of(cbo.c, cbo.d, cbo.b, cbo.e, cbo.f, cbo.g, cbo.h, cbo.i, cbo.j);
   public static final Map<cah<iu>, BiPredicate<cjy, iv<cck>>> cd = ImmutableMap.of(
      cah.b,
      (BiPredicate<cjy, iv>)($$0, $$1) -> $$1.a(ccl.n),
      cah.c,
      (BiPredicate<cjy, iv>)($$0, $$1) -> $$0.gA().b().b().test($$1),
      cah.d,
      (BiPredicate<cjy, iv>)($$0, $$1) -> ckb.a.test($$1),
      cah.e,
      (BiPredicate<cjy, iv>)($$0, $$1) -> $$1.a(ccl.o)
   );

   public cjy(bqr<? extends cjy> $$0, czu $$1) {
      this($$0, $$1, ckd.c);
   }

   public cjy(bqr<? extends cjy> $$0, czu $$1, ckd $$2) {
      super($$0, $$1);
      ((cao)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gA().a($$2).a(ckb.b));
   }

   @Override
   public bsf<cjy> dQ() {
      return (bsf<cjy>)super.dQ();
   }

   @Override
   protected bsf.b<cjy> dR() {
      return bsf.a(cD, cE);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      bsf<cjy> $$1 = this.dR().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aqe $$0) {
      bsf<cjy> $$1 = this.dQ();
      $$1.b($$0, this);
      this.bE = $$1.i();
      this.a(this.dQ());
   }

   private void a(bsf<cjy> $$0) {
      ckb $$1 = this.gA().b();
      if (this.p_()) {
         $$0.a(cmc.e);
         $$0.a(cma.d, bwc.a(0.5F));
      } else {
         $$0.a(cmc.f);
         $$0.a(cma.c, bwc.b($$1, 0.5F), ImmutableSet.of(Pair.of(cah.c, cai.a)));
      }

      $$0.a(cma.a, bwc.a($$1, 0.5F));
      $$0.a(cma.f, bwc.d($$1, 0.5F), ImmutableSet.of(Pair.of(cah.e, cai.a)));
      $$0.a(cma.e, bwc.c($$1, 0.5F));
      $$0.a(cma.b, bwc.e($$1, 0.5F));
      $$0.a(cma.g, bwc.f($$1, 0.5F));
      $$0.a(cma.i, bwc.g($$1, 0.5F));
      $$0.a(cma.h, bwc.h($$1, 0.5F));
      $$0.a(cma.j, bwc.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cma.a));
      $$0.b(cma.b);
      $$0.a(cma.b);
      $$0.a(this.dN().Z(), this.dN().Y());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dN() instanceof aqe) {
         this.c((aqe)this.dN());
      }
   }

   public static bsk.a gy() {
      return brg.A().a(bsl.r, 0.5).a(bsl.k, 48.0);
   }

   public boolean gz() {
      return this.cC;
   }

   @Override
   protected void Y() {
      this.dN().af().a("villagerBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
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

            this.b(new bpx(bpz.j, 200, 0));
         }
      }

      if (this.cr != null && this.dN() instanceof aqe) {
         ((aqe)this.dN()).a(cce.e, this.cr, this);
         this.dN().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gf() && this.ah.a(100) == 0) {
         clw $$0 = ((aqe)this.dN()).d(this.dn());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dN().a(this, (byte)42);
         }
      }

      if (this.gA().b() == ckb.b && this.gq()) {
         this.gv();
      }

      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.r() > 0) {
         this.t(this.r() - 1);
      }

      this.gY();
   }

   @Override
   public boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.tJ) || !this.bB() || this.gq() || this.fJ()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gL();
         return boq.a(this.dN().B);
      } else {
         boolean $$3 = this.gr().isEmpty();
         if ($$1 == bop.a) {
            if ($$3 && !this.dN().B) {
               this.gL();
            }

            $$0.a(avj.S);
         }

         if ($$3) {
            return boq.a(this.dN().B);
         } else {
            if (!this.dN().B && !this.bZ.isEmpty()) {
               this.h($$0);
            }

            return boq.a(this.dN().B);
         }
      }
   }

   private void gL() {
      this.t(40);
      if (!this.dN().x_()) {
         this.b(auz.AG);
      }
   }

   private void h(ckl $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gA().c());
   }

   @Override
   public void f(@Nullable ckl $$0) {
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
      for (cys $$0 : this.gr()) {
         $$0.n();
      }
   }

   @Override
   public boolean gB() {
      return true;
   }

   @Override
   public boolean gx() {
      return this.dN().B;
   }

   public void gC() {
      this.gR();

      for (cys $$0 : this.gr()) {
         $$0.j();
      }

      this.gN();
      this.cy = this.dN().Y();
      this.cA++;
   }

   private void gN() {
      cyt $$0 = this.gr();
      ckl $$1 = this.gp();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cc.j, $$0, this.gA().c(), this.u(), this.gs(), this.gB());
      }
   }

   private boolean gO() {
      for (cys $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gP() {
      return this.cA == 0 || this.cA < 2 && this.dN().Y() > this.cy + 2400L;
   }

   public boolean gD() {
      long $$0 = this.cy + 12000L;
      long $$1 = this.dN().Y();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dN().Z();
      if (this.cB > 0L) {
         long $$4 = this.cB / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cB = $$3;
      if ($$2) {
         this.cy = $$1;
         this.gZ();
      }

      return this.gP() && this.gO();
   }

   private void gQ() {
      int $$0 = 2 - this.cA;
      if ($$0 > 0) {
         for (cys $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gR();
      }

      this.gN();
   }

   private void gR() {
      for (cys $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void i(ckl $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cys $$2 : this.gr()) {
            $$2.a(-axw.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bpz.F)) {
         bpx $$3 = $$0.c(bpz.F);
         int $$4 = $$3.e();

         for (cys $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().G());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cf, new cjz(ckd.c, ckb.b, 1));
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      cjz.c.encodeStart(um.a, this.gA()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.ct);
      $$0.a("Gossips", this.cu.a(um.a));
      $$0.a("Xp", this.cx);
      $$0.a("LastRestock", this.cy);
      $$0.a("LastGossipDecay", this.cw);
      $$0.a("RestocksToday", this.cA);
      if (this.cC) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cjz.c.parse(um.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.ao.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.ct = $$0.f("FoodLevel");
      }

      ue $$1 = $$0.c("Gossips", 10);
      this.cu.a(new Dynamic(um.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cx = $$0.h("Xp");
      }

      this.cy = $$0.i("LastRestock");
      this.cw = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dN() instanceof aqe) {
         this.c((aqe)this.dN());
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
   protected auy v() {
      if (this.fJ()) {
         return null;
      } else {
         return this.gq() ? auz.AH : auz.AC;
      }
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.AF;
   }

   @Override
   protected auy o_() {
      return auz.AE;
   }

   public void gE() {
      this.b(this.gA().b().f());
   }

   @Override
   public void a(cjz $$0) {
      cjz $$1 = this.gA();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.ao.a(cf, $$0);
   }

   @Override
   public cjz gA() {
      return this.ao.a(cf);
   }

   @Override
   protected void b(cys $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.gp();
      if (this.gV()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dN().b(new bqu(this.dN(), this.ds(), this.du() + 0.5, this.dy(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gF() {
      return this.cs;
   }

   @Override
   public void a(@Nullable bre $$0) {
      if ($$0 != null && this.dN() instanceof aqe) {
         ((aqe)this.dN()).a(cce.c, $$0, this);
         if (this.bB() && $$0 instanceof ckl) {
            this.dN().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bpj $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bql $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gS();
      super.a($$0);
   }

   private void gS() {
      this.a(cah.b);
      this.a(cah.c);
      this.a(cah.d);
      this.a(cah.e);
   }

   private void b(bql $$0) {
      if (this.dN() instanceof aqe $$1) {
         Optional<caj> $$3 = this.bE.c(cah.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(brs.class::isInstance).forEach($$2x -> $$1.a(cce.d, $$0, (brs)$$2x));
         }
      }
   }

   public void a(cah<iu> $$0) {
      if (this.dN() instanceof aqe) {
         MinecraftServer $$1 = ((aqe)this.dN()).o();
         this.bE.c($$0).ifPresent($$2 -> {
            aqe $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cch $$4 = $$3.y();
               Optional<iv<cck>> $$5 = $$4.c($$2.b());
               BiPredicate<cjy, iv<cck>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  afu.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.ct + this.gX() >= 12 && !this.fJ() && this.g() == 0;
   }

   private boolean gT() {
      return this.ct < 12;
   }

   private void gU() {
      if (this.gT() && this.gX() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            csd $$1 = this.y().a($$0);
            if (!$$1.d()) {
               Integer $$2 = cb.get($$1.f());
               if ($$2 != null) {
                  int $$3 = $$1.G();

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

   public int g(ckl $$0) {
      return this.cu.a($$0.cx(), $$0x -> true);
   }

   private void w(int $$0) {
      this.ct -= $$0;
   }

   public void gG() {
      this.gU();
      this.w(12);
   }

   @Override
   public void b(cyt $$0) {
      this.bZ = $$0;
   }

   private boolean gV() {
      int $$0 = this.gA().c();
      return cjz.d($$0) && this.cx >= cjz.c($$0);
   }

   private void gW() {
      this.a(this.gA().a(this.gA().c() + 1));
      this.gw();
   }

   @Override
   protected ws cp() {
      return ws.c(this.ai().g() + "." + lc.z.b(this.gA().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(kw.O);
      } else if ($$0 == 13) {
         this.a(kw.a);
      } else if ($$0 == 14) {
         this.a(kw.M);
      } else if ($$0 == 42) {
         this.a(kw.aj);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      if ($$2 == bri.e) {
         this.a(this.gA().a(ckb.b));
      }

      if ($$2 == bri.n || $$2 == bri.m || bri.a($$2) || $$2 == bri.o) {
         this.a(this.gA().a(ckd.a($$0.t(this.dn()))));
      }

      if ($$2 == bri.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cjy b(aqe $$0, bqf $$1) {
      double $$2 = this.ah.j();
      ckd $$3;
      if ($$2 < 0.5) {
         $$3 = ckd.a($$0.t(this.dn()));
      } else if ($$2 < 0.75) {
         $$3 = this.gA().a();
      } else {
         $$3 = ((cjy)$$1).gA().a();
      }

      cjy $$6 = new cjy(bqr.bi, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dn()), bri.e, null);
      return $$6;
   }

   @Override
   public void a(aqe $$0, brd $$1) {
      if ($$0.ak() != bon.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cih $$2 = bqr.bn.a((czu)$$0);
         if ($$2 != null) {
            $$2.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$2.a($$0, $$0.d_($$2.dn()), bri.i, null);
            $$2.t(this.gf());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.o(this.cC());
            }

            $$2.fT();
            $$0.a_($$2);
            this.gS();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cgv $$0) {
      cjw.a(this, this, $$0);
   }

   @Override
   public boolean k(csd $$0) {
      cry $$1 = $$0.f();
      return (ch.contains($$1) || this.gA().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gH() {
      return this.gX() >= 24;
   }

   public boolean gI() {
      return this.gX() < 12;
   }

   private int gX() {
      boz $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gJ() {
      return this.y().a_($$0 -> $$0.a(avw.aZ));
   }

   @Override
   protected void gw() {
      cjz $$0 = this.gA();
      Int2ObjectMap<ckc.g[]> $$2;
      if (this.dN().J().b(cna.d)) {
         Int2ObjectMap<ckc.g[]> $$1 = ckc.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : ckc.a.get($$0.b());
      } else {
         $$2 = ckc.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         ckc.g[] $$4 = (ckc.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cyt $$5 = this.gr();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqe $$0, cjy $$1, long $$2) {
      if (($$2 < this.cv || $$2 >= this.cv + 1200L) && ($$2 < $$1.cv || $$2 >= $$1.cv + 1200L)) {
         this.cu.a($$1.cu, this.ah, 10);
         this.cv = $$2;
         $$1.cv = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gY() {
      long $$0 = this.dN().Y();
      if (this.cw == 0L) {
         this.cw = $$0;
      } else if ($$0 >= this.cw + 24000L) {
         this.cu.b();
         this.cw = $$0;
      }
   }

   public void a(aqe $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         eta $$3 = this.cI().c(10.0, 10.0, 10.0);
         List<cjy> $$4 = $$0.a(cjy.class, $$3);
         List<cjy> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ayo.a(bqr.af, bri.f, $$0, this.dn(), 10, 8, 6, ayo.a.a).isEmpty()) {
               $$4.forEach(caz::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dN().Y()) ? false : !this.bE.a(cah.F);
   }

   @Override
   public void a(cce $$0, bql $$1) {
      if ($$0 == cce.a) {
         this.cu.a($$1.cx(), cae.d, 20);
         this.cu.a($$1.cx(), cae.c, 25);
      } else if ($$0 == cce.e) {
         this.cu.a($$1.cx(), cae.e, 2);
      } else if ($$0 == cce.c) {
         this.cu.a($$1.cx(), cae.b, 25);
      } else if ($$0 == cce.d) {
         this.cu.a($$1.cx(), cae.a, 25);
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

   public cad gK() {
      return this.cu;
   }

   public void a(uv $$0) {
      this.cu.a(new Dynamic(um.a, $$0));
   }

   @Override
   protected void X() {
      super.X();
      afu.a(this);
   }

   @Override
   public void b(im $$0) {
      super.b($$0);
      this.bE.a(cah.H, this.dN().Y());
      this.bE.b(cah.m);
      this.bE.b(cah.E);
   }

   @Override
   public void fK() {
      super.fK();
      this.bE.a(cah.I, this.dN().Y());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bE.c(cah.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
