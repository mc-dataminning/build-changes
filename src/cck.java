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

public class cck extends ccf implements bky, ccm {
   private static final Logger bZ = LogUtils.getLogger();
   private static final afc<ccl> ca = aff.a(cck.class, afe.t);
   public static final int bV = 12;
   public static final Map<cke, Integer> bW = ImmutableMap.of(ckm.oJ, 4, ckm.tm, 1, ckm.tl, 1, ckm.uq, 1);
   private static final int cb = 2;
   private static final Set<cke> cc = ImmutableSet.of(ckm.oJ, ckm.tm, ckm.tl, ckm.oI, ckm.oH, ckm.uq, new cke[]{ckm.ur, ckm.uo, ckm.up});
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
   private ccx cm;
   private boolean cn;
   private int co;
   private final btg cp = new btg();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<btk<?>> cx = ImmutableList.of(
      btk.b,
      btk.c,
      btk.d,
      btk.e,
      btk.g,
      btk.h,
      btk.i,
      btk.j,
      btk.k,
      btk.l,
      btk.K,
      btk.aO,
      new btk[]{btk.m, btk.n, btk.q, btk.r, btk.t, btk.v, btk.w, btk.x, btk.y, btk.A, btk.f, btk.C, btk.D, btk.E, btk.G, btk.H, btk.I, btk.F}
   );
   private static final ImmutableList<bup<? extends buo<? super cck>>> cy = ImmutableList.of(bup.c, bup.d, bup.b, bup.e, bup.f, bup.g, bup.h, bup.i, bup.j);
   public static final Map<btk<ia>, BiPredicate<cck, ib<bvl>>> bY = ImmutableMap.of(
      btk.b,
      (BiPredicate<cck, ib>)($$0, $$1) -> $$1.a(bvm.n),
      btk.c,
      (BiPredicate<cck, ib>)($$0, $$1) -> $$0.gp().b().b().test($$1),
      btk.d,
      (BiPredicate<cck, ib>)($$0, $$1) -> ccn.a.test($$1),
      btk.e,
      (BiPredicate<cck, ib>)($$0, $$1) -> $$1.a(bvm.o)
   );

   public cck(bjx<? extends cck> $$0, cqz $$1) {
      this($$0, $$1, ccp.c);
   }

   public cck(bjx<? extends cck> $$0, cqz $$1, ccp $$2) {
      super($$0, $$1);
      ((btr)this.L()).b(true);
      this.L().a(true);
      this.s(true);
      this.a(this.gp().a($$2).a(ccn.b));
   }

   @Override
   public blj<cck> dN() {
      return (blj<cck>)super.dN();
   }

   @Override
   protected blj.b<cck> dO() {
      return blj.a(cx, cy);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      blj<cck> $$1 = this.dO().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(alq $$0) {
      blj<cck> $$1 = this.dN();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dN());
   }

   private void a(blj<cck> $$0) {
      ccn $$1 = this.gp().b();
      if (this.n_()) {
         $$0.a(cek.e);
         $$0.a(cei.d, bpf.a(0.5F));
      } else {
         $$0.a(cek.f);
         $$0.a(cei.c, bpf.b($$1, 0.5F), ImmutableSet.of(Pair.of(btk.c, btl.a)));
      }

      $$0.a(cei.a, bpf.a($$1, 0.5F));
      $$0.a(cei.f, bpf.d($$1, 0.5F), ImmutableSet.of(Pair.of(btk.e, btl.a)));
      $$0.a(cei.e, bpf.c($$1, 0.5F));
      $$0.a(cei.b, bpf.e($$1, 0.5F));
      $$0.a(cei.g, bpf.f($$1, 0.5F));
      $$0.a(cei.i, bpf.g($$1, 0.5F));
      $$0.a(cei.h, bpf.h($$1, 0.5F));
      $$0.a(cei.j, bpf.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cei.a));
      $$0.b(cei.b);
      $$0.a(cei.b);
      $$0.a(this.dL().W(), this.dL().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dL() instanceof alq) {
         this.c((alq)this.dL());
      }
   }

   public static blo.a gn() {
      return bkl.A().a(blp.m, 0.5).a(blp.g, 48.0);
   }

   public boolean go() {
      return this.cw;
   }

   @Override
   protected void X() {
      this.dL().ad().a("villagerBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.gf() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gL();
               this.cl = false;
            }

            this.b(new bjg(bji.j, 200, 0));
         }
      }

      if (this.cm != null && this.dL() instanceof alq) {
         ((alq)this.dL()).a(bvf.e, this.cm, this);
         this.dL().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fU() && this.ag.a(100) == 0) {
         cee $$0 = ((alq)this.dL()).c(this.dl());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dL().a(this, (byte)42);
         }
      }

      if (this.gp().b() == ccn.b && this.gf()) {
         this.gk();
      }

      super.X();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.s(this.s() - 1);
      }

      this.gN();
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ($$2.a(ckm.sR) || !this.bv() || this.gf() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gA();
         return bib.a(this.dL().B);
      } else {
         boolean $$3 = this.gg().isEmpty();
         if ($$1 == bia.a) {
            if ($$3 && !this.dL().B) {
               this.gA();
            }

            $$0.a(aqn.S);
         }

         if ($$3) {
            return bib.a(this.dL().B);
         } else {
            if (!this.dL().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bib.a(this.dL().B);
         }
      }
   }

   private void gA() {
      this.s(40);
      if (!this.dL().x_()) {
         this.a(aqd.yN, this.eV(), this.eW());
      }
   }

   private void h(ccx $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gp().c());
   }

   @Override
   public void f(@Nullable ccx $$0) {
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
      for (cpx $$0 : this.gg()) {
         $$0.l();
      }
   }

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public boolean gm() {
      return this.dL().B;
   }

   public void gr() {
      this.gG();

      for (cpx $$0 : this.gg()) {
         $$0.h();
      }

      this.gC();
      this.ct = this.dL().V();
      this.cu++;
   }

   private void gC() {
      cpy $$0 = this.gg();
      ccx $$1 = this.ge();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bS.j, $$0, this.gp().c(), this.t(), this.gh(), this.gq());
      }
   }

   private boolean gD() {
      for (cpx $$0 : this.gg()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gE() {
      return this.cu == 0 || this.cu < 2 && this.dL().V() > this.ct + 2400L;
   }

   public boolean gs() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dL().V();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dL().W();
      if (this.cv > 0L) {
         long $$4 = this.cv / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cv = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gO();
      }

      return this.gE() && this.gD();
   }

   private void gF() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (cpx $$1 : this.gg()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gG();
      }

      this.gC();
   }

   private void gG() {
      for (cpx $$0 : this.gg()) {
         $$0.e();
      }
   }

   private void i(ccx $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cpx $$2 : this.gg()) {
            $$2.a(-asy.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bji.F)) {
         bjg $$3 = $$0.b(bji.F);
         int $$4 = $$3.e();

         for (cpx $$5 : this.gg()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, new ccl(ccp.c, ccn.b, 1));
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      ccl.c.encodeStart(sf.a, this.gp()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(sf.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<ccl> $$1 = ccl.c.parse(new Dynamic(sf.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cpy($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      rz $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(sf.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dL() instanceof alq) {
         this.c((alq)this.dL());
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
   protected aqc w() {
      if (this.fD()) {
         return null;
      } else {
         return this.gf() ? aqd.yO : aqd.yJ;
      }
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.yM;
   }

   @Override
   protected aqc m_() {
      return aqd.yL;
   }

   public void gt() {
      aqc $$0 = this.gp().b().f();
      if ($$0 != null) {
         this.a($$0, this.eV(), this.eW());
      }
   }

   @Override
   public void a(ccl $$0) {
      ccl $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.an.b(ca, $$0);
   }

   @Override
   public ccl gp() {
      return this.an.b(ca);
   }

   @Override
   protected void b(cpx $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.ge();
      if (this.gK()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dL().b(new bjz(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gu() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bkj $$0) {
      if ($$0 != null && this.dL() instanceof alq) {
         ((alq)this.dL()).a(bvf.c, $$0, this);
         if (this.bv() && $$0 instanceof ccx) {
            this.dL().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bir $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bjt $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gH();
      super.a($$0);
   }

   private void gH() {
      this.a(btk.b);
      this.a(btk.c);
      this.a(btk.d);
      this.a(btk.e);
   }

   private void a(bjt $$0) {
      if (this.dL() instanceof alq $$1) {
         Optional<btm> $$3 = this.bz.c(btk.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bky.class::isInstance).forEach($$2x -> $$1.a(bvf.d, $$0, (bky)$$2x));
         }
      }
   }

   public void a(btk<ia> $$0) {
      if (this.dL() instanceof alq) {
         MinecraftServer $$1 = ((alq)this.dL()).n();
         this.bz.c($$0).ifPresent($$2 -> {
            alq $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bvi $$4 = $$3.w();
               Optional<ib<bvl>> $$5 = $$4.c($$2.b());
               BiPredicate<cck, ib<bvl>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  abz.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean W_() {
      return this.co + this.gM() >= 12 && !this.fD() && this.h() == 0;
   }

   private boolean gI() {
      return this.co < 12;
   }

   private void gJ() {
      if (this.gI() && this.gM() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            ckj $$1 = this.y().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.y().a($$0, 1);
                     if (!this.gI()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(ccx $$0) {
      return this.cp.a($$0.cv(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gv() {
      this.gJ();
      this.v(12);
   }

   public void b(cpy $$0) {
      this.bU = $$0;
   }

   private boolean gK() {
      int $$0 = this.gp().c();
      return ccl.d($$0) && this.cs >= ccl.c($$0);
   }

   private void gL() {
      this.a(this.gp().a(this.gp().c() + 1));
      this.gl();
   }

   @Override
   protected ui cn() {
      return ui.c(this.ag().g() + "." + jy.A.b(this.gp().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(js.M);
      } else if ($$0 == 13) {
         this.a(js.b);
      } else if ($$0 == 14) {
         this.a(js.K);
      } else if ($$0 == 42) {
         this.a(js.ag);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      if ($$2 == bkn.e) {
         this.a(this.gp().a(ccn.b));
      }

      if ($$2 == bkn.n || $$2 == bkn.m || $$2 == bkn.c || $$2 == bkn.o) {
         this.a(this.gp().a(ccp.a($$0.s(this.dl()))));
      }

      if ($$2 == bkn.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cck b(alq $$0, bjo $$1) {
      double $$2 = this.ag.j();
      ccp $$3;
      if ($$2 < 0.5) {
         $$3 = ccp.a($$0.s(this.dl()));
      } else if ($$2 < 0.75) {
         $$3 = this.gp().a();
      } else {
         $$3 = ((cck)$$1).gp().a();
      }

      cck $$6 = new cck(bjx.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dl()), bkn.e, null, null);
      return $$6;
   }

   @Override
   public void a(alq $$0, bki $$1) {
      if ($$0.ai() != bhy.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         cbb $$2 = bjx.bj.a((cqz)$$0);
         if ($$2 != null) {
            $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$2.a($$0, $$0.d_($$2.dl()), bkn.i, null, null);
            $$2.t(this.fU());
            if (this.ac()) {
               $$2.b(this.ad());
               $$2.n(this.cA());
            }

            $$2.fJ();
            $$0.a_($$2);
            this.gH();
            this.ak();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(bzq $$0) {
      cci.a(this, this, $$0);
   }

   @Override
   public boolean k(ckj $$0) {
      cke $$1 = $$0.d();
      return (cc.contains($$1) || this.gp().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gw() {
      return this.gM() >= 24;
   }

   public boolean gx() {
      return this.gM() < 12;
   }

   private int gM() {
      bii $$0 = this.y();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gy() {
      return this.y().a_($$0 -> $$0.a(ara.aU));
   }

   @Override
   protected void gl() {
      ccl $$0 = this.gp();
      Int2ObjectMap<cco.g[]> $$2;
      if (this.dL().G().b(cfi.c)) {
         Int2ObjectMap<cco.g[]> $$1 = cco.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cco.a.get($$0.b());
      } else {
         $$2 = cco.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cco.g[] $$4 = (cco.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cpy $$5 = this.gg();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(alq $$0, cck $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.ag, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gN() {
      long $$0 = this.dL().V();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(alq $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         eia $$3 = this.cG().c(10.0, 10.0, 10.0);
         List<cck> $$4 = $$0.a(cck.class, $$3);
         List<cck> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!atp.a(bjx.ac, bkn.f, $$0, this.dl(), 10, 8, 6, atp.a.a).isEmpty()) {
               $$4.forEach(bub::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dL().V()) ? false : !this.bz.a(btk.F);
   }

   @Override
   public void a(bvf $$0, bjt $$1) {
      if ($$0 == bvf.a) {
         this.cp.a($$1.cv(), bth.d, 20);
         this.cp.a($$1.cv(), bth.c, 25);
      } else if ($$0 == bvf.e) {
         this.cp.a($$1.cv(), bth.e, 2);
      } else if ($$0 == bvf.c) {
         this.cp.a($$1.cv(), bth.b, 25);
      } else if ($$0 == bvf.d) {
         this.cp.a($$1.cv(), bth.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gO() {
      this.gF();
      this.cu = 0;
   }

   public btg gz() {
      return this.cp;
   }

   public void a(sn $$0) {
      this.cp.a(new Dynamic(sf.a, $$0));
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   @Override
   public void b(ht $$0) {
      super.b($$0);
      this.bz.a(btk.G, this.dL().V());
      this.bz.b(btk.m);
      this.bz.b(btk.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(btk.H, this.dL().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(btk.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
