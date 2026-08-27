import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
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

public class cdm extends cdh implements bma, cdo {
   private static final Logger bZ = LogUtils.getLogger();
   private static final afs<cdn> ca = afv.a(cdm.class, afu.t);
   public static final int bV = 12;
   public static final Map<clj, Integer> bW = ImmutableMap.of(clr.pu, 4, clr.tY, 1, clr.tX, 1, clr.vc, 1);
   private static final int cb = 2;
   private static final Set<clj> cc = ImmutableSet.of(clr.pu, clr.tY, clr.tX, clr.pt, clr.ps, clr.vc, new clj[]{clr.vd, clr.va, clr.vb});
   private static final int cd = 10;
   private static final int ce = 1200;
   private static final int cf = 24000;
   private static final int cg = 25;
   private static final int ch = 10;
   private static final int ci = 5;
   private static final long cj = 24000L;
   @VisibleForTesting
   public static final float bX = 0.5F;
   private int ck;
   private boolean cl;
   @Nullable
   private cdz cm;
   private boolean cn;
   private int co;
   private final bui cp = new bui();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<bum<?>> cx = ImmutableList.of(
      bum.b,
      bum.c,
      bum.d,
      bum.e,
      bum.g,
      bum.h,
      bum.i,
      bum.j,
      bum.k,
      bum.l,
      bum.K,
      bum.aO,
      new bum[]{bum.m, bum.n, bum.q, bum.r, bum.t, bum.v, bum.w, bum.x, bum.y, bum.A, bum.f, bum.C, bum.D, bum.E, bum.G, bum.H, bum.I, bum.F}
   );
   private static final ImmutableList<bvr<? extends bvq<? super cdm>>> cy = ImmutableList.of(bvr.c, bvr.d, bvr.b, bvr.e, bvr.f, bvr.g, bvr.h, bvr.i, bvr.j);
   public static final Map<bum<ie>, BiPredicate<cdm, ig<bwn>>> bY = ImmutableMap.of(
      bum.b,
      (BiPredicate<cdm, ig>)($$0, $$1) -> $$1.a(bwo.n),
      bum.c,
      (BiPredicate<cdm, ig>)($$0, $$1) -> $$0.gq().b().b().test($$1),
      bum.d,
      (BiPredicate<cdm, ig>)($$0, $$1) -> cdp.a.test($$1),
      bum.e,
      (BiPredicate<cdm, ig>)($$0, $$1) -> $$1.a(bwo.o)
   );

   public cdm(bkz<? extends cdm> $$0, csf $$1) {
      this($$0, $$1, cdr.c);
   }

   public cdm(bkz<? extends cdm> $$0, csf $$1, cdr $$2) {
      super($$0, $$1);
      ((but)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gq().a($$2).a(cdp.b));
   }

   @Override
   public bml<cdm> dP() {
      return (bml<cdm>)super.dP();
   }

   @Override
   protected bml.b<cdm> dQ() {
      return bml.a(cx, cy);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      bml<cdm> $$1 = this.dQ().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(ami $$0) {
      bml<cdm> $$1 = this.dP();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dP());
   }

   private void a(bml<cdm> $$0) {
      cdp $$1 = this.gq().b();
      if (this.o_()) {
         $$0.a(cfm.e);
         $$0.a(cfk.d, bqh.a(0.5F));
      } else {
         $$0.a(cfm.f);
         $$0.a(cfk.c, bqh.b($$1, 0.5F), ImmutableSet.of(Pair.of(bum.c, bun.a)));
      }

      $$0.a(cfk.a, bqh.a($$1, 0.5F));
      $$0.a(cfk.f, bqh.d($$1, 0.5F), ImmutableSet.of(Pair.of(bum.e, bun.a)));
      $$0.a(cfk.e, bqh.c($$1, 0.5F));
      $$0.a(cfk.b, bqh.e($$1, 0.5F));
      $$0.a(cfk.g, bqh.f($$1, 0.5F));
      $$0.a(cfk.i, bqh.g($$1, 0.5F));
      $$0.a(cfk.h, bqh.h($$1, 0.5F));
      $$0.a(cfk.j, bqh.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cfk.a));
      $$0.b(cfk.b);
      $$0.a(cfk.b);
      $$0.a(this.dN().X(), this.dN().W());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dN() instanceof ami) {
         this.c((ami)this.dN());
      }
   }

   public static bmq.a go() {
      return bln.C().a(bmr.m, 0.5).a(bmr.g, 48.0);
   }

   public boolean gp() {
      return this.cw;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("villagerBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.gg() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gM();
               this.cl = false;
            }

            this.b(new bki(bkk.j, 200, 0));
         }
      }

      if (this.cm != null && this.dN() instanceof ami) {
         ((ami)this.dN()).a(bwh.e, this.cm, this);
         this.dN().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fV() && this.ag.a(100) == 0) {
         cfg $$0 = ((ami)this.dN()).c(this.dn());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dN().a(this, (byte)42);
         }
      }

      if (this.gq().b() == cdp.b && this.gg()) {
         this.gl();
      }

      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.u() > 0) {
         this.s(this.u() - 1);
      }

      this.gO();
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$2.a(clr.tD) || !this.bx() || this.gg() || this.fE()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gB();
         return bjb.a(this.dN().B);
      } else {
         boolean $$3 = this.gh().isEmpty();
         if ($$1 == bja.a) {
            if ($$3 && !this.dN().B) {
               this.gB();
            }

            $$0.a(arf.S);
         }

         if ($$3) {
            return bjb.a(this.dN().B);
         } else {
            if (!this.dN().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bjb.a(this.dN().B);
         }
      }
   }

   private void gB() {
      this.s(40);
      if (!this.dN().y_()) {
         this.a(aqv.zq, this.eX(), this.eY());
      }
   }

   private void h(cdz $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.Q_(), this.gq().c());
   }

   @Override
   public void f(@Nullable cdz $$0) {
      boolean $$1 = this.gf() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gl();
      }
   }

   @Override
   protected void gl() {
      super.gl();
      this.gC();
   }

   private void gC() {
      for (crd $$0 : this.gh()) {
         $$0.l();
      }
   }

   @Override
   public boolean gr() {
      return true;
   }

   @Override
   public boolean gn() {
      return this.dN().B;
   }

   public void gs() {
      this.gH();

      for (crd $$0 : this.gh()) {
         $$0.h();
      }

      this.gD();
      this.ct = this.dN().W();
      this.cu++;
   }

   private void gD() {
      cre $$0 = this.gh();
      cdz $$1 = this.gf();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.gq().c(), this.w(), this.gi(), this.gr());
      }
   }

   private boolean gE() {
      for (crd $$0 : this.gh()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gF() {
      return this.cu == 0 || this.cu < 2 && this.dN().W() > this.ct + 2400L;
   }

   public boolean gt() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dN().W();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dN().X();
      if (this.cv > 0L) {
         long $$4 = this.cv / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cv = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gP();
      }

      return this.gF() && this.gE();
   }

   private void gG() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (crd $$1 : this.gh()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gH();
      }

      this.gD();
   }

   private void gH() {
      for (crd $$0 : this.gh()) {
         $$0.e();
      }
   }

   private void i(cdz $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (crd $$2 : this.gh()) {
            $$2.a(-atq.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bkk.F)) {
         bki $$3 = $$0.b(bkk.F);
         int $$4 = $$3.e();

         for (crd $$5 : this.gh()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, new cdn(cdr.c, cdp.b, 1));
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      cdn.c.encodeStart(sr.a, this.gq()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(sr.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cdn> $$1 = cdn.c.parse(new Dynamic(sr.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cre($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      sj $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(sr.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dN() instanceof ami) {
         this.c((ami)this.dN());
      }

      this.cu = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cw = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected aqu y() {
      if (this.fE()) {
         return null;
      } else {
         return this.gg() ? aqv.zr : aqv.zm;
      }
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.zp;
   }

   @Override
   protected aqu n_() {
      return aqv.zo;
   }

   public void gu() {
      aqu $$0 = this.gq().b().f();
      if ($$0 != null) {
         this.a($$0, this.eX(), this.eY());
      }
   }

   @Override
   public void a(cdn $$0) {
      cdn $$1 = this.gq();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cdn gq() {
      return this.an.b(ca);
   }

   @Override
   protected void b(crd $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.gf();
      if (this.gL()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dN().b(new blb(this.dN(), this.ds(), this.du() + 0.5, this.dy(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gv() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bll $$0) {
      if ($$0 != null && this.dN() instanceof ami) {
         ((ami)this.dN()).a(bwh.c, $$0, this);
         if (this.bx() && $$0 instanceof cdz) {
            this.dN().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bjt $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bkv $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gI();
      super.a($$0);
   }

   private void gI() {
      this.a(bum.b);
      this.a(bum.c);
      this.a(bum.d);
      this.a(bum.e);
   }

   private void a(bkv $$0) {
      if (this.dN() instanceof ami $$1) {
         Optional<buo> $$3 = this.bz.c(bum.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bma.class::isInstance).forEach($$2x -> $$1.a(bwh.d, $$0, (bma)$$2x));
         }
      }
   }

   public void a(bum<ie> $$0) {
      if (this.dN() instanceof ami) {
         MinecraftServer $$1 = ((ami)this.dN()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            ami $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bwk $$4 = $$3.x();
               Optional<ig<bwn>> $$5 = $$4.c($$2.b());
               BiPredicate<cdm, ig<bwn>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aco.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.co + this.gN() >= 12 && !this.fE() && this.h() == 0;
   }

   private boolean gJ() {
      return this.co < 12;
   }

   private void gK() {
      if (this.gJ() && this.gN() != 0) {
         for (int $$0 = 0; $$0 < this.A().b(); $$0++) {
            clo $$1 = this.A().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.A().a($$0, 1);
                     if (!this.gJ()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cdz $$0) {
      return this.cp.a($$0.cw(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gw() {
      this.gK();
      this.v(12);
   }

   public void b(cre $$0) {
      this.bU = $$0;
   }

   private boolean gL() {
      int $$0 = this.gq().c();
      return cdn.d($$0) && this.cs >= cdn.c($$0);
   }

   private void gM() {
      this.a(this.gq().a(this.gq().c() + 1));
      this.gm();
   }

   @Override
   protected uv co() {
      return uv.c(this.ai().g() + "." + kc.A.b(this.gq().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(jw.M);
      } else if ($$0 == 13) {
         this.a(jw.b);
      } else if ($$0 == 14) {
         this.a(jw.K);
      } else if ($$0 == 42) {
         this.a(jw.ah);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if ($$2 == blp.e) {
         this.a(this.gq().a(cdp.b));
      }

      if ($$2 == blp.n || $$2 == blp.m || $$2 == blp.c || $$2 == blp.o) {
         this.a(this.gq().a(cdr.a($$0.s(this.dn()))));
      }

      if ($$2 == blp.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cdm b(ami $$0, bkq $$1) {
      double $$2 = this.ag.j();
      cdr $$3;
      if ($$2 < 0.5) {
         $$3 = cdr.a($$0.s(this.dn()));
      } else if ($$2 < 0.75) {
         $$3 = this.gq().a();
      } else {
         $$3 = ((cdm)$$1).gq().a();
      }

      cdm $$6 = new cdm(bkz.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dn()), blp.e, null, null);
      return $$6;
   }

   @Override
   public void a(ami $$0, blk $$1) {
      if ($$0.aj() != biy.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         ccd $$2 = bkz.bj.a((csf)$$0);
         if ($$2 != null) {
            $$2.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$2.a($$0, $$0.d_($$2.dn()), blp.i, null, null);
            $$2.t(this.fV());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fK();
            $$0.a_($$2);
            this.gI();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cas $$0) {
      cdk.a(this, this, $$0);
   }

   @Override
   public boolean k(clo $$0) {
      clj $$1 = $$0.d();
      return (cc.contains($$1) || this.gq().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gx() {
      return this.gN() >= 24;
   }

   public boolean gy() {
      return this.gN() < 12;
   }

   private int gN() {
      bjj $$0 = this.A();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gz() {
      return this.A().a_($$0 -> $$0.a(ars.aU));
   }

   @Override
   protected void gm() {
      cdn $$0 = this.gq();
      Int2ObjectMap<cdq.g[]> $$2;
      if (this.dN().H().b(cgk.d)) {
         Int2ObjectMap<cdq.g[]> $$1 = cdq.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cdq.a.get($$0.b());
      } else {
         $$2 = cdq.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cdq.g[] $$4 = (cdq.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cre $$5 = this.gh();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ami $$0, cdm $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gO() {
      long $$0 = this.dN().W();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(ami $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         eju $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cdm> $$4 = $$0.a(cdm.class, $$3);
         List<cdm> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!aui.a(bkz.ac, blp.f, $$0, this.dn(), 10, 8, 6, aui.a.a).isEmpty()) {
               $$4.forEach(bvd::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dN().W()) ? false : !this.bz.a(bum.F);
   }

   @Override
   public void a(bwh $$0, bkv $$1) {
      if ($$0 == bwh.a) {
         this.cp.a($$1.cw(), buj.d, 20);
         this.cp.a($$1.cw(), buj.c, 25);
      } else if ($$0 == bwh.e) {
         this.cp.a($$1.cw(), buj.e, 2);
      } else if ($$0 == bwh.c) {
         this.cp.a($$1.cw(), buj.b, 25);
      } else if ($$0 == bwh.d) {
         this.cp.a($$1.cw(), buj.a, 25);
      }
   }

   @Override
   public int w() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gP() {
      this.gG();
      this.cu = 0;
   }

   public bui gA() {
      return this.cp;
   }

   public void a(ta $$0) {
      this.cp.a(new Dynamic(sr.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   @Override
   public void b(hx $$0) {
      super.b($$0);
      this.bz.a(bum.G, this.dN().W());
      this.bz.b(bum.m);
      this.bz.b(bum.E);
   }

   @Override
   public void fF() {
      super.fF();
      this.bz.a(bum.H, this.dN().W());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bum.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
