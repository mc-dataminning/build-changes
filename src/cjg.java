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

public class cjg extends cjb implements brc, cji {
   private static final Logger cd = LogUtils.getLogger();
   private static final aiy<cjh> ce = ajc.a(cjg.class, aja.t);
   public static final int bZ = 12;
   public static final Map<cre, Integer> ca = ImmutableMap.of(crm.pw, 4, crm.ue, 1, crm.ud, 1, crm.vi, 1);
   private static final int cf = 2;
   private static final Set<cre> cg = ImmutableSet.of(crm.pw, crm.ue, crm.ud, crm.pv, crm.pu, crm.vi, new cre[]{crm.vj, crm.vg, crm.vh});
   private static final int ch = 10;
   private static final int ci = 1200;
   private static final int cj = 24000;
   private static final int ck = 25;
   private static final int cl = 10;
   private static final int cm = 5;
   private static final long cn = 24000L;
   @VisibleForTesting
   public static final float cb = 0.5F;
   private int co;
   private boolean cp;
   @Nullable
   private cjt cq;
   private boolean cr;
   private int cs;
   private final bzn ct = new bzn();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cz;
   private long cA;
   private boolean cB;
   private static final ImmutableList<bzr<?>> cC = ImmutableList.of(
      bzr.b,
      bzr.c,
      bzr.d,
      bzr.e,
      bzr.g,
      bzr.h,
      bzr.i,
      bzr.j,
      bzr.k,
      bzr.l,
      bzr.L,
      bzr.aP,
      new bzr[]{bzr.m, bzr.n, bzr.q, bzr.r, bzr.t, bzr.v, bzr.w, bzr.x, bzr.y, bzr.A, bzr.f, bzr.C, bzr.D, bzr.E, bzr.H, bzr.I, bzr.J, bzr.F}
   );
   private static final ImmutableList<cay<? extends cax<? super cjg>>> cD = ImmutableList.of(cay.c, cay.d, cay.b, cay.e, cay.f, cay.g, cay.h, cay.i, cay.j);
   public static final Map<bzr<ik>, BiPredicate<cjg, il<cbu>>> cc = ImmutableMap.of(
      bzr.b,
      (BiPredicate<cjg, il>)($$0, $$1) -> $$1.a(cbv.n),
      bzr.c,
      (BiPredicate<cjg, il>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      bzr.d,
      (BiPredicate<cjg, il>)($$0, $$1) -> cjj.a.test($$1),
      bzr.e,
      (BiPredicate<cjg, il>)($$0, $$1) -> $$1.a(cbv.o)
   );

   public cjg(bqb<? extends cjg> $$0, cyx $$1) {
      this($$0, $$1, cjl.c);
   }

   public cjg(bqb<? extends cjg> $$0, cyx $$1, cjl $$2) {
      super($$0, $$1);
      ((bzy)this.K()).b(true);
      this.K().a(true);
      this.s(true);
      this.a(this.gy().a($$2).a(cjj.b));
   }

   @Override
   public brp<cjg> dP() {
      return (brp<cjg>)super.dP();
   }

   @Override
   protected brp.b<cjg> dQ() {
      return brp.a(cC, cD);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      brp<cjg> $$1 = this.dQ().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aps $$0) {
      brp<cjg> $$1 = this.dP();
      $$1.b($$0, this);
      this.bC = $$1.i();
      this.a(this.dP());
   }

   private void a(brp<cjg> $$0) {
      cjj $$1 = this.gy().b();
      if (this.p_()) {
         $$0.a(clk.e);
         $$0.a(cli.d, bvm.a(0.5F));
      } else {
         $$0.a(clk.f);
         $$0.a(cli.c, bvm.b($$1, 0.5F), ImmutableSet.of(Pair.of(bzr.c, bzs.a)));
      }

      $$0.a(cli.a, bvm.a($$1, 0.5F));
      $$0.a(cli.f, bvm.d($$1, 0.5F), ImmutableSet.of(Pair.of(bzr.e, bzs.a)));
      $$0.a(cli.e, bvm.c($$1, 0.5F));
      $$0.a(cli.b, bvm.e($$1, 0.5F));
      $$0.a(cli.g, bvm.f($$1, 0.5F));
      $$0.a(cli.i, bvm.g($$1, 0.5F));
      $$0.a(cli.h, bvm.h($$1, 0.5F));
      $$0.a(cli.j, bvm.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cli.a));
      $$0.b(cli.b);
      $$0.a(cli.b);
      $$0.a(this.dM().Z(), this.dM().Y());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dM() instanceof aps) {
         this.c((aps)this.dM());
      }
   }

   public static bru.a gw() {
      return bqq.A().a(brv.r, 0.5).a(brv.k, 48.0);
   }

   public boolean gx() {
      return this.cB;
   }

   @Override
   protected void Y() {
      this.dM().af().a("villagerBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      if (this.cB) {
         this.cB = false;
      }

      if (!this.go() && this.co > 0) {
         this.co--;
         if (this.co <= 0) {
            if (this.cp) {
               this.gU();
               this.cp = false;
            }

            this.b(new bph(bpj.j, 200, 0));
         }
      }

      if (this.cq != null && this.dM() instanceof aps) {
         ((aps)this.dM()).a(cbo.e, this.cq, this);
         this.dM().a(this, (byte)14);
         this.cq = null;
      }

      if (!this.gd() && this.ag.a(100) == 0) {
         cle $$0 = ((aps)this.dM()).d(this.dm());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gy().b() == cjj.b && this.go()) {
         this.gt();
      }

      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.r() > 0) {
         this.t(this.r() - 1);
      }

      this.gW();
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.tI) || !this.bA() || this.go() || this.fI()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gJ();
         return boa.a(this.dM().B);
      } else {
         boolean $$3 = this.gp().isEmpty();
         if ($$1 == bnz.a) {
            if ($$3 && !this.dM().B) {
               this.gJ();
            }

            $$0.a(auw.S);
         }

         if ($$3) {
            return boa.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bY.isEmpty()) {
               this.h($$0);
            }

            return boa.a(this.dM().B);
         }
      }
   }

   private void gJ() {
      this.t(40);
      if (!this.dM().x_()) {
         this.b(aum.Az);
      }
   }

   private void h(cjt $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gy().c());
   }

   @Override
   public void f(@Nullable cjt $$0) {
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
      for (cxv $$0 : this.gp()) {
         $$0.n();
      }
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Override
   public boolean gv() {
      return this.dM().B;
   }

   public void gA() {
      this.gP();

      for (cxv $$0 : this.gp()) {
         $$0.j();
      }

      this.gL();
      this.cx = this.dM().Y();
      this.cz++;
   }

   private void gL() {
      cxw $$0 = this.gp();
      cjt $$1 = this.gn();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bY.j, $$0, this.gy().c(), this.u(), this.gq(), this.gz());
      }
   }

   private boolean gM() {
      for (cxv $$0 : this.gp()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gN() {
      return this.cz == 0 || this.cz < 2 && this.dM().Y() > this.cx + 2400L;
   }

   public boolean gB() {
      long $$0 = this.cx + 12000L;
      long $$1 = this.dM().Y();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dM().Z();
      if (this.cA > 0L) {
         long $$4 = this.cA / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cA = $$3;
      if ($$2) {
         this.cx = $$1;
         this.gX();
      }

      return this.gN() && this.gM();
   }

   private void gO() {
      int $$0 = 2 - this.cz;
      if ($$0 > 0) {
         for (cxv $$1 : this.gp()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (cxv $$0 : this.gp()) {
         $$0.g();
      }
   }

   private void i(cjt $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cxv $$2 : this.gp()) {
            $$2.a(-axk.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bpj.F)) {
         bph $$3 = $$0.c(bpj.F);
         int $$4 = $$3.d();

         for (cxv $$5 : this.gp()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().G());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(ce, new cjh(cjl.c, cjj.b, 1));
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      cjh.c.encodeStart(ua.a, this.gy()).resultOrPartial(cd::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cs);
      $$0.a("Gossips", this.ct.a(ua.a));
      $$0.a("Xp", this.cw);
      $$0.a("LastRestock", this.cx);
      $$0.a("LastGossipDecay", this.cv);
      $$0.a("RestocksToday", this.cz);
      if (this.cB) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cjh.c.parse(ua.a, $$0.c("VillagerData")).resultOrPartial(cd::error).ifPresent($$0x -> this.an.a(ce, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cs = $$0.f("FoodLevel");
      }

      ts $$1 = $$0.c("Gossips", 10);
      this.ct.a(new Dynamic(ua.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cw = $$0.h("Xp");
      }

      this.cx = $$0.i("LastRestock");
      this.cv = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dM() instanceof aps) {
         this.c((aps)this.dM());
      }

      this.cz = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cB = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected aul v() {
      if (this.fI()) {
         return null;
      } else {
         return this.go() ? aum.AA : aum.Av;
      }
   }

   @Override
   protected aul d(bot $$0) {
      return aum.Ay;
   }

   @Override
   protected aul o_() {
      return aum.Ax;
   }

   public void gC() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(cjh $$0) {
      cjh $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.bY = null;
      }

      this.an.a(ce, $$0);
   }

   @Override
   public cjh gy() {
      return this.an.a(ce);
   }

   @Override
   protected void b(cxv $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cw = this.cw + $$0.q();
      this.cq = this.gn();
      if (this.gT()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dM().b(new bqe(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cr = $$0;
   }

   public boolean gD() {
      return this.cr;
   }

   @Override
   public void a(@Nullable bqo $$0) {
      if ($$0 != null && this.dM() instanceof aps) {
         ((aps)this.dM()).a(cbo.c, $$0, this);
         if (this.bA() && $$0 instanceof cjt) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bot $$0) {
      cd.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bpv $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(bzr.b);
      this.a(bzr.c);
      this.a(bzr.d);
      this.a(bzr.e);
   }

   private void b(bpv $$0) {
      if (this.dM() instanceof aps $$1) {
         Optional<bzt> $$3 = this.bC.c(bzr.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(brc.class::isInstance).forEach($$2x -> $$1.a(cbo.d, $$0, (brc)$$2x));
         }
      }
   }

   public void a(bzr<ik> $$0) {
      if (this.dM() instanceof aps) {
         MinecraftServer $$1 = ((aps)this.dM()).o();
         this.bC.c($$0).ifPresent($$2 -> {
            aps $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cbr $$4 = $$3.y();
               Optional<il<cbu>> $$5 = $$4.c($$2.b());
               BiPredicate<cjg, il<cbu>> $$6 = cc.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  afi.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean W_() {
      return this.cs + this.gV() >= 12 && !this.fI() && this.g() == 0;
   }

   private boolean gR() {
      return this.cs < 12;
   }

   private void gS() {
      if (this.gR() && this.gV() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            crj $$1 = this.y().a($$0);
            if (!$$1.d()) {
               Integer $$2 = ca.get($$1.f());
               if ($$2 != null) {
                  int $$3 = $$1.G();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cs = this.cs + $$2;
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

   public int g(cjt $$0) {
      return this.ct.a($$0.cw(), $$0x -> true);
   }

   private void w(int $$0) {
      this.cs -= $$0;
   }

   public void gE() {
      this.gS();
      this.w(12);
   }

   @Override
   public void b(cxw $$0) {
      this.bY = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return cjh.d($$0) && this.cw >= cjh.c($$0);
   }

   private void gU() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gu();
   }

   @Override
   protected wg co() {
      return wg.c(this.ai().g() + "." + kr.z.b(this.gy().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(kl.P);
      } else if ($$0 == 13) {
         this.a(kl.b);
      } else if ($$0 == 14) {
         this.a(kl.N);
      } else if ($$0 == 42) {
         this.a(kl.ak);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if ($$2 == bqs.e) {
         this.a(this.gy().a(cjj.b));
      }

      if ($$2 == bqs.n || $$2 == bqs.m || bqs.a($$2) || $$2 == bqs.o) {
         this.a(this.gy().a(cjl.a($$0.t(this.dm()))));
      }

      if ($$2 == bqs.d) {
         this.cB = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cjg b(aps $$0, bpp $$1) {
      double $$2 = this.ag.j();
      cjl $$3;
      if ($$2 < 0.5) {
         $$3 = cjl.a($$0.t(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cjg)$$1).gy().a();
      }

      cjg $$6 = new cjg(bqb.bi, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), bqs.e, null);
      return $$6;
   }

   @Override
   public void a(aps $$0, bqn $$1) {
      if ($$0.ak() != bnx.a) {
         cd.info("Villager {} was struck by lightning {}.", this, $$1);
         chp $$2 = bqb.bn.a((cyx)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), bqs.i, null);
            $$2.t(this.gd());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fS();
            $$0.a_($$2);
            this.gQ();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cgd $$0) {
      cje.a(this, this, $$0);
   }

   @Override
   public boolean k(crj $$0) {
      cre $$1 = $$0.f();
      return (cg.contains($$1) || this.gy().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      boj $$0 = this.y();
      return ca.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.y().a_($$0 -> $$0.a(avk.aZ));
   }

   @Override
   protected void gu() {
      cjh $$0 = this.gy();
      Int2ObjectMap<cjk.g[]> $$2;
      if (this.dM().J().b(cmi.d)) {
         Int2ObjectMap<cjk.g[]> $$1 = cjk.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cjk.a.get($$0.b());
      } else {
         $$2 = cjk.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cjk.g[] $$4 = (cjk.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cxw $$5 = this.gp();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aps $$0, cjg $$1, long $$2) {
      if (($$2 < this.cu || $$2 >= this.cu + 1200L) && ($$2 < $$1.cu || $$2 >= $$1.cu + 1200L)) {
         this.ct.a($$1.ct, this.ag, 10);
         this.cu = $$2;
         $$1.cu = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gW() {
      long $$0 = this.dM().Y();
      if (this.cv == 0L) {
         this.cv = $$0;
      } else if ($$0 >= this.cv + 24000L) {
         this.ct.b();
         this.cv = $$0;
      }
   }

   public void a(aps $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         erv $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cjg> $$4 = $$0.a(cjg.class, $$3);
         List<cjg> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ayc.a(bqb.af, bqs.f, $$0, this.dm(), 10, 8, 6, ayc.a.a).isEmpty()) {
               $$4.forEach(caj::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().Y()) ? false : !this.bC.a(bzr.F);
   }

   @Override
   public void a(cbo $$0, bpv $$1) {
      if ($$0 == cbo.a) {
         this.ct.a($$1.cw(), bzo.d, 20);
         this.ct.a($$1.cw(), bzo.c, 25);
      } else if ($$0 == cbo.e) {
         this.ct.a($$1.cw(), bzo.e, 2);
      } else if ($$0 == cbo.c) {
         this.ct.a($$1.cw(), bzo.b, 25);
      } else if ($$0 == cbo.d) {
         this.ct.a($$1.cw(), bzo.a, 25);
      }
   }

   @Override
   public int u() {
      return this.cw;
   }

   public void v(int $$0) {
      this.cw = $$0;
   }

   private void gX() {
      this.gO();
      this.cz = 0;
   }

   public bzn gI() {
      return this.ct;
   }

   public void a(uj $$0) {
      this.ct.a(new Dynamic(ua.a, $$0));
   }

   @Override
   protected void X() {
      super.X();
      afi.a(this);
   }

   @Override
   public void b(ib $$0) {
      super.b($$0);
      this.bC.a(bzr.H, this.dM().Y());
      this.bC.b(bzr.m);
      this.bC.b(bzr.E);
   }

   @Override
   public void fJ() {
      super.fJ();
      this.bC.a(bzr.I, this.dM().Y());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bC.c(bzr.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
