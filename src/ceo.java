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

public class ceo extends cej implements bmu, ceq {
   private static final Logger bZ = LogUtils.getLogger();
   private static final agj<cep> ca = agm.a(ceo.class, agl.t);
   public static final int bV = 12;
   public static final Map<cmm, Integer> bW = ImmutableMap.of(cmu.pu, 4, cmu.tZ, 1, cmu.tY, 1, cmu.vd, 1);
   private static final int cb = 2;
   private static final Set<cmm> cc = ImmutableSet.of(cmu.pu, cmu.tZ, cmu.tY, cmu.pt, cmu.ps, cmu.vd, new cmm[]{cmu.ve, cmu.vb, cmu.vc});
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
   private cfb cm;
   private boolean cn;
   private int co;
   private final bvd cp = new bvd();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cw;
   private boolean cx;
   private static final ImmutableList<bvh<?>> cy = ImmutableList.of(
      bvh.b,
      bvh.c,
      bvh.d,
      bvh.e,
      bvh.g,
      bvh.h,
      bvh.i,
      bvh.j,
      bvh.k,
      bvh.l,
      bvh.K,
      bvh.aO,
      new bvh[]{bvh.m, bvh.n, bvh.q, bvh.r, bvh.t, bvh.v, bvh.w, bvh.x, bvh.y, bvh.A, bvh.f, bvh.C, bvh.D, bvh.E, bvh.G, bvh.H, bvh.I, bvh.F}
   );
   private static final ImmutableList<bwn<? extends bwm<? super ceo>>> cz = ImmutableList.of(bwn.c, bwn.d, bwn.b, bwn.e, bwn.f, bwn.g, bwn.h, bwn.i, bwn.j);
   public static final Map<bvh<ig>, BiPredicate<ceo, ih<bxj>>> bY = ImmutableMap.of(
      bvh.b,
      (BiPredicate<ceo, ih>)($$0, $$1) -> $$1.a(bxk.n),
      bvh.c,
      (BiPredicate<ceo, ih>)($$0, $$1) -> $$0.gp().b().b().test($$1),
      bvh.d,
      (BiPredicate<ceo, ih>)($$0, $$1) -> cer.a.test($$1),
      bvh.e,
      (BiPredicate<ceo, ih>)($$0, $$1) -> $$1.a(bxk.o)
   );

   public ceo(blt<? extends ceo> $$0, cti $$1) {
      this($$0, $$1, cet.c);
   }

   public ceo(blt<? extends ceo> $$0, cti $$1, cet $$2) {
      super($$0, $$1);
      ((bvo)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gp().a($$2).a(cer.b));
   }

   @Override
   public bnf<ceo> dO() {
      return (bnf<ceo>)super.dO();
   }

   @Override
   protected bnf.b<ceo> dP() {
      return bnf.a(cy, cz);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      bnf<ceo> $$1 = this.dP().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(amz $$0) {
      bnf<ceo> $$1 = this.dO();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dO());
   }

   private void a(bnf<ceo> $$0) {
      cer $$1 = this.gp().b();
      if (this.o_()) {
         $$0.a(cgp.e);
         $$0.a(cgn.d, brc.a(0.5F));
      } else {
         $$0.a(cgp.f);
         $$0.a(cgn.c, brc.b($$1, 0.5F), ImmutableSet.of(Pair.of(bvh.c, bvi.a)));
      }

      $$0.a(cgn.a, brc.a($$1, 0.5F));
      $$0.a(cgn.f, brc.d($$1, 0.5F), ImmutableSet.of(Pair.of(bvh.e, bvi.a)));
      $$0.a(cgn.e, brc.c($$1, 0.5F));
      $$0.a(cgn.b, brc.e($$1, 0.5F));
      $$0.a(cgn.g, brc.f($$1, 0.5F));
      $$0.a(cgn.i, brc.g($$1, 0.5F));
      $$0.a(cgn.h, brc.h($$1, 0.5F));
      $$0.a(cgn.j, brc.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cgn.a));
      $$0.b(cgn.b);
      $$0.a(cgn.b);
      $$0.a(this.dM().Y(), this.dM().X());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dM() instanceof amz) {
         this.c((amz)this.dM());
      }
   }

   public static bnk.a gn() {
      return bmh.C().a(bnl.m, 0.5).a(bnl.g, 48.0);
   }

   public boolean go() {
      return this.cx;
   }

   @Override
   protected void Z() {
      this.dM().af().a("villagerBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      if (this.cx) {
         this.cx = false;
      }

      if (!this.gf() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gL();
               this.cl = false;
            }

            this.b(new blc(ble.j, 200, 0));
         }
      }

      if (this.cm != null && this.dM() instanceof amz) {
         ((amz)this.dM()).a(bxd.e, this.cm, this);
         this.dM().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fU() && this.ag.a(100) == 0) {
         cgj $$0 = ((amz)this.dM()).d(this.dm());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gp().b() == cer.b && this.gf()) {
         this.gk();
      }

      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.u() > 0) {
         this.s(this.u() - 1);
      }

      this.gN();
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ($$2.a(cmu.tE) || !this.bx() || this.gf() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gA();
         return bjv.a(this.dM().B);
      } else {
         boolean $$3 = this.gg().isEmpty();
         if ($$1 == bju.a) {
            if ($$3 && !this.dM().B) {
               this.gA();
            }

            $$0.a(arw.S);
         }

         if ($$3) {
            return bjv.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bjv.a(this.dM().B);
         }
      }
   }

   private void gA() {
      this.s(40);
      if (!this.dM().y_()) {
         this.a(arm.zL, this.eW(), this.eX());
      }
   }

   private void h(cfb $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.Q_(), this.gp().c());
   }

   @Override
   public void f(@Nullable cfb $$0) {
      boolean $$1 = this.ge() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gk();
      }
   }

   @Override
   protected void gk() {
      super.gk();
      this.gB();
   }

   private void gB() {
      for (csg $$0 : this.gg()) {
         $$0.l();
      }
   }

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public boolean gm() {
      return this.dM().B;
   }

   public void gr() {
      this.gG();

      for (csg $$0 : this.gg()) {
         $$0.h();
      }

      this.gC();
      this.ct = this.dM().X();
      this.cu++;
   }

   private void gC() {
      csh $$0 = this.gg();
      cfb $$1 = this.ge();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.gp().c(), this.w(), this.gh(), this.gq());
      }
   }

   private boolean gD() {
      for (csg $$0 : this.gg()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gE() {
      return this.cu == 0 || this.cu < 2 && this.dM().X() > this.ct + 2400L;
   }

   public boolean gs() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dM().X();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dM().Y();
      if (this.cw > 0L) {
         long $$4 = this.cw / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cw = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gO();
      }

      return this.gE() && this.gD();
   }

   private void gF() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (csg $$1 : this.gg()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gG();
      }

      this.gC();
   }

   private void gG() {
      for (csg $$0 : this.gg()) {
         $$0.e();
      }
   }

   private void i(cfb $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (csg $$2 : this.gg()) {
            $$2.a(-aui.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(ble.F)) {
         blc $$3 = $$0.b(ble.F);
         int $$4 = $$3.e();

         for (csg $$5 : this.gg()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, new cep(cet.c, cer.b, 1));
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      cep.c.encodeStart(sz.a, this.gp()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(sz.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cx) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cep> $$1 = cep.c.parse(new Dynamic(sz.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new csh($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      sr $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(sz.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dM() instanceof amz) {
         this.c((amz)this.dM());
      }

      this.cu = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cx = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected arl y() {
      if (this.fD()) {
         return null;
      } else {
         return this.gf() ? arm.zM : arm.zH;
      }
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.zK;
   }

   @Override
   protected arl n_() {
      return arm.zJ;
   }

   public void gt() {
      arl $$0 = this.gp().b().f();
      if ($$0 != null) {
         this.a($$0, this.eW(), this.eX());
      }
   }

   @Override
   public void a(cep $$0) {
      cep $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public cep gp() {
      return this.an.b(ca);
   }

   @Override
   protected void b(csg $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.ge();
      if (this.gK()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dM().b(new blv(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gu() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bmf $$0) {
      if ($$0 != null && this.dM() instanceof amz) {
         ((amz)this.dM()).a(bxd.c, $$0, this);
         if (this.bx() && $$0 instanceof cfb) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bkn $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      blp $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gH();
      super.a($$0);
   }

   private void gH() {
      this.a(bvh.b);
      this.a(bvh.c);
      this.a(bvh.d);
      this.a(bvh.e);
   }

   private void a(blp $$0) {
      if (this.dM() instanceof amz $$1) {
         Optional<bvj> $$3 = this.bz.c(bvh.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bmu.class::isInstance).forEach($$2x -> $$1.a(bxd.d, $$0, (bmu)$$2x));
         }
      }
   }

   public void a(bvh<ig> $$0) {
      if (this.dM() instanceof amz) {
         MinecraftServer $$1 = ((amz)this.dM()).o();
         this.bz.c($$0).ifPresent($$2 -> {
            amz $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bxg $$4 = $$3.y();
               Optional<ih<bxj>> $$5 = $$4.c($$2.b());
               BiPredicate<ceo, ih<bxj>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  adf.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.co + this.gM() >= 12 && !this.fD() && this.h() == 0;
   }

   private boolean gI() {
      return this.co < 12;
   }

   private void gJ() {
      if (this.gI() && this.gM() != 0) {
         for (int $$0 = 0; $$0 < this.A().b(); $$0++) {
            cmr $$1 = this.A().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.A().a($$0, 1);
                     if (!this.gI()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cfb $$0) {
      return this.cp.a($$0.cw(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gv() {
      this.gJ();
      this.v(12);
   }

   public void b(csh $$0) {
      this.bU = $$0;
   }

   private boolean gK() {
      int $$0 = this.gp().c();
      return cep.d($$0) && this.cs >= cep.c($$0);
   }

   private void gL() {
      this.a(this.gp().a(this.gp().c() + 1));
      this.gl();
   }

   @Override
   protected vd co() {
      return vd.c(this.ai().g() + "." + kd.z.b(this.gp().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(jx.O);
      } else if ($$0 == 13) {
         this.a(jx.b);
      } else if ($$0 == 14) {
         this.a(jx.M);
      } else if ($$0 == 42) {
         this.a(jx.aj);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      if ($$2 == bmj.e) {
         this.a(this.gp().a(cer.b));
      }

      if ($$2 == bmj.n || $$2 == bmj.m || bmj.a($$2) || $$2 == bmj.o) {
         this.a(this.gp().a(cet.a($$0.t(this.dm()))));
      }

      if ($$2 == bmj.d) {
         this.cx = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public ceo b(amz $$0, blk $$1) {
      double $$2 = this.ag.j();
      cet $$3;
      if ($$2 < 0.5) {
         $$3 = cet.a($$0.t(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gp().a();
      } else {
         $$3 = ((ceo)$$1).gp().a();
      }

      ceo $$6 = new ceo(blt.bg, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), bmj.e, null, null);
      return $$6;
   }

   @Override
   public void a(amz $$0, bme $$1) {
      if ($$0.ak() != bjs.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         ccz $$2 = blt.bl.a((cti)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), bmj.i, null, null);
            $$2.t(this.fU());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fJ();
            $$0.a_($$2);
            this.gH();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cbo $$0) {
      cem.a(this, this, $$0);
   }

   @Override
   public boolean k(cmr $$0) {
      cmm $$1 = $$0.d();
      return (cc.contains($$1) || this.gp().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gw() {
      return this.gM() >= 24;
   }

   public boolean gx() {
      return this.gM() < 12;
   }

   private int gM() {
      bkd $$0 = this.A();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gy() {
      return this.A().a_($$0 -> $$0.a(asj.aU));
   }

   @Override
   protected void gl() {
      cep $$0 = this.gp();
      Int2ObjectMap<ces.g[]> $$2;
      if (this.dM().I().b(chn.d)) {
         Int2ObjectMap<ces.g[]> $$1 = ces.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : ces.a.get($$0.b());
      } else {
         $$2 = ces.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         ces.g[] $$4 = (ces.g[])$$2.get($$0.c());
         if ($$4 != null) {
            csh $$5 = this.gg();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(amz $$0, ceo $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gN() {
      long $$0 = this.dM().X();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(amz $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         elh $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<ceo> $$4 = $$0.a(ceo.class, $$3);
         List<ceo> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!avc.a(blt.ad, bmj.f, $$0, this.dm(), 10, 8, 6, avc.a.a).isEmpty()) {
               $$4.forEach(bvz::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().X()) ? false : !this.bz.a(bvh.F);
   }

   @Override
   public void a(bxd $$0, blp $$1) {
      if ($$0 == bxd.a) {
         this.cp.a($$1.cw(), bve.d, 20);
         this.cp.a($$1.cw(), bve.c, 25);
      } else if ($$0 == bxd.e) {
         this.cp.a($$1.cw(), bve.e, 2);
      } else if ($$0 == bxd.c) {
         this.cp.a($$1.cw(), bve.b, 25);
      } else if ($$0 == bxd.d) {
         this.cp.a($$1.cw(), bve.a, 25);
      }
   }

   @Override
   public int w() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gO() {
      this.gF();
      this.cu = 0;
   }

   public bvd gz() {
      return this.cp;
   }

   public void a(ti $$0) {
      this.cp.a(new Dynamic(sz.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   @Override
   public void b(hx $$0) {
      super.b($$0);
      this.bz.a(bvh.G, this.dM().X());
      this.bz.b(bvh.m);
      this.bz.b(bvh.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(bvh.H, this.dM().X());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bvh.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
