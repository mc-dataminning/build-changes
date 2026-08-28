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
import java.util.function.BiPredicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cqk extends cqf implements bxr, cqm {
   private static final Logger bL = LogUtils.getLogger();
   private static final akj<cql> bM = akn.a(cqk.class, akl.u);
   public static final int bH = 12;
   public static final Map<cyu, Integer> bI = ImmutableMap.of(czc.qi, 4, czc.vl, 1, czc.vk, 1, czc.wq, 1);
   private static final int bN = 2;
   private static final int bO = 10;
   private static final int bP = 1200;
   private static final int bQ = 24000;
   private static final int bR = 10;
   private static final int bS = 5;
   private static final long bT = 24000L;
   @VisibleForTesting
   public static final float bJ = 0.5F;
   private int bU;
   private boolean bV;
   @Nullable
   private cqy bW;
   private boolean bX;
   private int bY;
   private final cga bZ = new cga();
   private long ca;
   private long cb;
   private int cc;
   private long cd;
   private int ce;
   private long cf;
   private boolean cg;
   private static final ImmutableList<cge<?>> ch = ImmutableList.of(
      cge.b,
      cge.c,
      cge.d,
      cge.e,
      cge.g,
      cge.h,
      cge.i,
      cge.j,
      cge.k,
      cge.l,
      cge.M,
      cge.aQ,
      new cge[]{cge.n, cge.o, cge.r, cge.s, cge.u, cge.w, cge.x, cge.y, cge.z, cge.B, cge.f, cge.D, cge.E, cge.F, cge.I, cge.J, cge.K, cge.G}
   );
   private static final ImmutableList<chl<? extends chk<? super cqk>>> ci = ImmutableList.of(chl.c, chl.d, chl.b, chl.e, chl.f, chl.g, chl.h, chl.i, chl.j);
   public static final Map<cge<jd>, BiPredicate<cqk, je<cih>>> bK = ImmutableMap.of(
      cge.b,
      (BiPredicate<cqk, je>)($$0, $$1) -> $$1.a(cii.n),
      cge.c,
      (BiPredicate<cqk, je>)($$0, $$1) -> $$0.gy().b().a().b().test($$1),
      cge.d,
      (BiPredicate<cqk, je>)($$0, $$1) -> cqn.a.test($$1),
      cge.e,
      (BiPredicate<cqk, je>)($$0, $$1) -> $$1.a(cii.o)
   );

   public cqk(bwm<? extends cqk> $$0, div $$1) {
      this($$0, $$1, cqp.c);
   }

   public cqk(bwm<? extends cqk> $$0, div $$1, alf<cqp> $$2) {
      this($$0, $$1, $$1.F_().d($$2));
   }

   public cqk(bwm<? extends cqk> $$0, div $$1, je<cqp> $$2) {
      super($$0, $$1);
      ((cgl)this.O()).b(true);
      this.O().a(true);
      this.O().a(48.0F);
      this.a_(true);
      this.a(this.gy().a($$2).b($$1.F_(), cqn.b));
   }

   @Override
   public byc<cqk> eb() {
      return (byc<cqk>)super.eb();
   }

   @Override
   protected byc.b<cqk> ec() {
      return byc.a(ch, ci);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      byc<cqk> $$1 = this.ec().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(arq $$0) {
      byc<cqk> $$1 = this.eb();
      $$1.b($$0, this);
      this.bs = $$1.i();
      this.a(this.eb());
   }

   private void a(byc<cqk> $$0) {
      je<cqn> $$1 = this.gy().b();
      if (this.n_()) {
         $$0.a(cst.e);
         $$0.a(csr.d, cbz.a(0.5F));
      } else {
         $$0.a(cst.f);
         $$0.a(csr.c, cbz.b($$1, 0.5F), ImmutableSet.of(Pair.of(cge.c, cgf.a)));
      }

      $$0.a(csr.a, cbz.a($$1, 0.5F));
      $$0.a(csr.f, cbz.d($$1, 0.5F), ImmutableSet.of(Pair.of(cge.e, cgf.a)));
      $$0.a(csr.e, cbz.c($$1, 0.5F));
      $$0.a(csr.b, cbz.e($$1, 0.5F));
      $$0.a(csr.g, cbz.f($$1, 0.5F));
      $$0.a(csr.i, cbz.g($$1, 0.5F));
      $$0.a(csr.h, cbz.h($$1, 0.5F));
      $$0.a(csr.j, cbz.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(csr.a));
      $$0.b(csr.b);
      $$0.a(csr.b);
      $$0.a(this.dV().af(), this.dV().ae());
   }

   @Override
   protected void j() {
      super.j();
      if (this.dV() instanceof arq) {
         this.g((arq)this.dV());
      }
   }

   public static byh.a gz() {
      return bxe.E().a(byi.v, 0.5);
   }

   public boolean gA() {
      return this.cg;
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("villagerBrain");
      this.eb().a($$0, this);
      $$1.c();
      if (this.cg) {
         this.cg = false;
      }

      if (!this.gq() && this.bU > 0) {
         this.bU--;
         if (this.bU <= 0) {
            if (this.bV) {
               this.gW();
               this.bV = false;
            }

            this.a(new bvh(bvj.j, 200, 0));
         }
      }

      if (this.bW != null) {
         $$0.a(cib.e, this.bW, this);
         $$0.a(this, (byte)14);
         this.bW = null;
      }

      if (!this.gf() && this.ae.a(100) == 0) {
         csn $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.r() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gy().b().a(cqn.b) && this.gq()) {
         this.gv();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.q() > 0) {
         this.r(this.q() - 1);
      }

      this.gY();
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.uM) || !this.bK() || this.gq() || this.fQ()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gL();
         return bub.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gr().isEmpty();
            if ($$1 == bua.a) {
               if ($$3) {
                  this.gL();
               }

               $$0.a(awx.S);
            }

            if ($$3) {
               return bub.c;
            }

            this.g($$0);
         }

         return bub.a;
      }
   }

   private void gL() {
      this.r(40);
      if (!this.dV().w_()) {
         this.b(awn.BX);
      }
   }

   private void g(cqy $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.m_(), this.gy().c());
   }

   @Override
   public void a(@Nullable cqy $$0) {
      boolean $$1 = this.x() != null && $$0 == null;
      super.a($$0);
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
      if (!this.dV().w_()) {
         for (dht $$0 : this.gr()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gB() {
      return true;
   }

   public void gC() {
      this.gR();

      for (dht $$0 : this.gr()) {
         $$0.j();
      }

      this.gN();
      this.cd = this.dV().ae();
      this.ce++;
   }

   private void gN() {
      dhu $$0 = this.gr();
      cqy $$1 = this.x();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bQ.l, $$0, this.gy().c(), this.t(), this.gs(), this.gB());
      }
   }

   private boolean gO() {
      for (dht $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gP() {
      return this.ce == 0 || this.ce < 2 && this.dV().ae() > this.cd + 2400L;
   }

   public boolean gD() {
      long $$0 = this.cd + 12000L;
      long $$1 = this.dV().ae();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dV().af();
      if (this.cf > 0L) {
         long $$4 = this.cf / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cf = $$3;
      if ($$2) {
         this.cd = $$1;
         this.gZ();
      }

      return this.gP() && this.gO();
   }

   private void gQ() {
      int $$0 = 2 - this.ce;
      if ($$0 > 0) {
         for (dht $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gR();
      }

      this.gN();
   }

   private void gR() {
      for (dht $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void h(cqy $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dht $$2 : this.gr()) {
            $$2.a(-azm.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bvj.F)) {
         bvh $$3 = $$0.c(bvj.F);
         int $$4 = $$3.e();

         for (dht $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bM, gE());
   }

   public static cql gE() {
      return new cql(mf.w.b(cqp.c), mf.x.b(cqn.b), 1);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("VillagerData", cql.c, this.gy());
      $$0.a("FoodLevel", (byte)this.bY);
      $$0.a("Gossips", this.bZ.a(un.a));
      $$0.a("Xp", this.cc);
      $$0.a("LastRestock", this.cd);
      $$0.a("LastGossipDecay", this.cb);
      $$0.a("RestocksToday", this.ce);
      if (this.cg) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(bM, $$0.<cql>a("VillagerData", cql.c).orElseGet(cqk::gE));
      if ($$0.b("FoodLevel", 1)) {
         this.bY = $$0.f("FoodLevel");
      }

      uf $$1 = $$0.c("Gossips", 10);
      this.bZ.a(new Dynamic(un.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cc = $$0.h("Xp");
      }

      this.cd = $$0.i("LastRestock");
      this.cb = $$0.i("LastGossipDecay");
      if (this.dV() instanceof arq) {
         this.g((arq)this.dV());
      }

      this.ce = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cg = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.fQ()) {
         return null;
      } else {
         return this.gq() ? awn.BY : awn.BT;
      }
   }

   @Override
   protected awm e(bus $$0) {
      return awn.BW;
   }

   @Override
   protected awm l_() {
      return awn.BV;
   }

   public void gF() {
      this.b(this.gy().b().a().f());
   }

   @Override
   public void a(cql $$0) {
      cql $$1 = this.gy();
      if (!$$1.b().equals($$0.b())) {
         this.bG = null;
      }

      this.al.a(bM, $$0);
   }

   @Override
   public cql gy() {
      return this.al.a(bM);
   }

   @Override
   protected void b(dht $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cc = this.cc + $$0.q();
      this.bW = this.x();
      if (this.gV()) {
         this.bU = 40;
         this.bV = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bwr(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bxc $$0) {
      if ($$0 != null && this.dV() instanceof arq) {
         ((arq)this.dV()).a(cib.c, $$0, this);
         if (this.bK() && $$0 instanceof cqy) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bus $$0) {
      bL.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bwd $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gS();
      super.a($$0);
   }

   private void gS() {
      this.a(cge.b);
      this.a(cge.c);
      this.a(cge.d);
      this.a(cge.e);
   }

   private void b(bwd $$0) {
      if (this.dV() instanceof arq $$1) {
         Optional<cgg> $$3 = this.bs.c(cge.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bxr.class::isInstance).forEach($$2x -> $$1.a(cib.d, $$0, (bxr)$$2x));
         }
      }
   }

   public void a(cge<jd> $$0) {
      if (this.dV() instanceof arq) {
         MinecraftServer $$1 = ((arq)this.dV()).p();
         this.bs.c($$0).ifPresent($$2 -> {
            arq $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cie $$4 = $$3.A();
               Optional<je<cih>> $$5 = $$4.c($$2.b());
               BiPredicate<cqk, je<cih>> $$6 = bK.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agm.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean S_() {
      return this.bY + this.gX() >= 12 && !this.fQ() && this.g() == 0;
   }

   private boolean gT() {
      return this.bY < 12;
   }

   private void gU() {
      if (this.gT() && this.gX() != 0) {
         for (int $$0 = 0; $$0 < this.n().b(); $$0++) {
            cyy $$1 = this.n().a($$0);
            if (!$$1.f()) {
               Integer $$2 = bI.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.bY = this.bY + $$2;
                     this.n().a($$0, 1);
                     if (!this.gT()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(cqy $$0) {
      return this.bZ.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.bY -= $$0;
   }

   public void gG() {
      this.gU();
      this.u(12);
   }

   public void b(dhu $$0) {
      this.bG = $$0;
   }

   private boolean gV() {
      int $$0 = this.gy().c();
      return cql.d($$0) && this.cc >= cql.c($$0);
   }

   private void gW() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gw();
   }

   @Override
   protected wy cz() {
      return this.gy().b().a().a();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lx.S);
      } else if ($$0 == 13) {
         this.a(lx.a);
      } else if ($$0 == 14) {
         this.a(lx.Q);
      } else if ($$0 == 42) {
         this.a(lx.ap);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$2 == bwl.e) {
         this.a(this.gy().b($$0.F_(), cqn.b));
      }

      if ($$2 == bwl.n || $$2 == bwl.m || bwl.a($$2) || $$2 == bwl.o) {
         this.a(this.gy().a($$0.F_(), cqp.a($$0.u(this.dv()))));
      }

      if ($$2 == bwl.d) {
         this.cg = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cqk b(arq $$0, bvt $$1) {
      double $$2 = this.ae.j();
      je<cqp> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.F_().d(cqp.a($$0.u(this.dv())));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cqk)$$1).gy().a();
      }

      cqk $$6 = new cqk(bwm.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bwl.e, null);
      return $$6;
   }

   @Override
   public void a(arq $$0, bxb $$1) {
      if ($$0.an() != bty.a) {
         bL.info("Villager {} was struck by lightning {}.", this, $$1);
         coq $$2 = this.a(bwm.bI, bvx.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bwl.i, null);
            $$1x.fY();
            this.gS();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(arq $$0, cnd $$1) {
      cqi.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(arq $$0, cyy $$1) {
      cyu $$2 = $$1.h();
      return ($$1.a(axk.bN) || this.gy().b().a().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gH() {
      return this.gX() >= 24;
   }

   public boolean gI() {
      return this.gX() < 12;
   }

   private int gX() {
      bui $$0 = this.n();
      return bI.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gJ() {
      return this.n().a_($$0 -> $$0.a(axk.bM));
   }

   @Override
   protected void gw() {
      cql $$0 = this.gy();
      alf<cqn> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<cqo.g[]> $$3;
         if (this.dV().K().b(cuj.b)) {
            Int2ObjectMap<cqo.g[]> $$2 = cqo.c.get($$1);
            $$3 = $$2 != null ? $$2 : cqo.a.get($$1);
         } else {
            $$3 = cqo.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            cqo.g[] $$5 = (cqo.g[])$$3.get($$0.c());
            if ($$5 != null) {
               dhu $$6 = this.gr();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(arq $$0, cqk $$1, long $$2) {
      if (($$2 < this.ca || $$2 >= this.ca + 1200L) && ($$2 < $$1.ca || $$2 >= $$1.ca + 1200L)) {
         this.bZ.a($$1.bZ, this.ae, 10);
         this.ca = $$2;
         $$1.ca = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gY() {
      long $$0 = this.dV().ae();
      if (this.cb == 0L) {
         this.cb = $$0;
      } else if ($$0 >= this.cb + 24000L) {
         this.bZ.b();
         this.cb = $$0;
      }
   }

   public void a(arq $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fed $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cqk> $$4 = $$0.a(cqk.class, $$3);
         List<cqk> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bah.a(bwm.ap, bwl.f, $$0, this.dv(), 10, 8, 6, bah.a.a, false).isEmpty()) {
               $$4.forEach(cgw::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ae()) ? false : !this.bs.a(cge.G);
   }

   @Override
   public void a(cib $$0, bwd $$1) {
      if ($$0 == cib.a) {
         this.bZ.a($$1.cG(), cgb.d, 20);
         this.bZ.a($$1.cG(), cgb.c, 25);
      } else if ($$0 == cib.e) {
         this.bZ.a($$1.cG(), cgb.e, 2);
      } else if ($$0 == cib.c) {
         this.bZ.a($$1.cG(), cgb.b, 25);
      } else if ($$0 == cib.d) {
         this.bZ.a($$1.cG(), cgb.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cc;
   }

   public void t(int $$0) {
      this.cc = $$0;
   }

   private void gZ() {
      this.gQ();
      this.ce = 0;
   }

   public cga gK() {
      return this.bZ;
   }

   public void a(uw $$0) {
      this.bZ.a(new Dynamic(un.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void b(iu $$0) {
      super.b($$0);
      this.bs.a(cge.I, this.dV().ae());
      this.bs.b(cge.n);
      this.bs.b(cge.F);
   }

   @Override
   public void fR() {
      super.fR();
      this.bs.a(cge.J, this.dV().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bs.c(cge.I);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.av ? c((ki<T>)$$0, this.gy().a()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.av) {
         je<cqp> $$2 = c(kj.av, $$1);
         this.a(this.gy().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
