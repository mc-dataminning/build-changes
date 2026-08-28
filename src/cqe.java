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

public class cqe extends cpz implements bxo, cqg {
   private static final Logger bL = LogUtils.getLogger();
   private static final akh<cqf> bM = akl.a(cqe.class, akj.u);
   public static final int bH = 12;
   public static final Map<cyo, Integer> bI = ImmutableMap.of(cyw.qg, 4, cyw.vj, 1, cyw.vi, 1, cyw.wo, 1);
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
   private cqs bW;
   private boolean bX;
   private int bY;
   private final cfx bZ = new cfx();
   private long ca;
   private long cb;
   private int cc;
   private long cd;
   private int ce;
   private long cf;
   private boolean cg;
   private static final ImmutableList<cgb<?>> ch = ImmutableList.of(
      cgb.b,
      cgb.c,
      cgb.d,
      cgb.e,
      cgb.g,
      cgb.h,
      cgb.i,
      cgb.j,
      cgb.k,
      cgb.l,
      cgb.M,
      cgb.aQ,
      new cgb[]{cgb.n, cgb.o, cgb.r, cgb.s, cgb.u, cgb.w, cgb.x, cgb.y, cgb.z, cgb.B, cgb.f, cgb.D, cgb.E, cgb.F, cgb.I, cgb.J, cgb.K, cgb.G}
   );
   private static final ImmutableList<chi<? extends chh<? super cqe>>> ci = ImmutableList.of(chi.c, chi.d, chi.b, chi.e, chi.f, chi.g, chi.h, chi.i, chi.j);
   public static final Map<cgb<jd>, BiPredicate<cqe, je<cie>>> bK = ImmutableMap.of(
      cgb.b,
      (BiPredicate<cqe, je>)($$0, $$1) -> $$1.a(cif.n),
      cgb.c,
      (BiPredicate<cqe, je>)($$0, $$1) -> $$0.gy().b().a().b().test($$1),
      cgb.d,
      (BiPredicate<cqe, je>)($$0, $$1) -> cqh.a.test($$1),
      cgb.e,
      (BiPredicate<cqe, je>)($$0, $$1) -> $$1.a(cif.o)
   );

   public cqe(bwj<? extends cqe> $$0, dip $$1) {
      this($$0, $$1, cqj.c);
   }

   public cqe(bwj<? extends cqe> $$0, dip $$1, ald<cqj> $$2) {
      this($$0, $$1, $$1.F_().d($$2));
   }

   public cqe(bwj<? extends cqe> $$0, dip $$1, je<cqj> $$2) {
      super($$0, $$1);
      ((cgi)this.O()).b(true);
      this.O().a(true);
      this.O().a(48.0F);
      this.a_(true);
      this.a(this.gy().a($$2).b($$1.F_(), cqh.b));
   }

   @Override
   public bxz<cqe> eb() {
      return (bxz<cqe>)super.eb();
   }

   @Override
   protected bxz.b<cqe> ec() {
      return bxz.a(ch, ci);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      bxz<cqe> $$1 = this.ec().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(aro $$0) {
      bxz<cqe> $$1 = this.eb();
      $$1.b($$0, this);
      this.bs = $$1.i();
      this.a(this.eb());
   }

   private void a(bxz<cqe> $$0) {
      je<cqh> $$1 = this.gy().b();
      if (this.n_()) {
         $$0.a(csn.e);
         $$0.a(csl.d, cbw.a(0.5F));
      } else {
         $$0.a(csn.f);
         $$0.a(csl.c, cbw.b($$1, 0.5F), ImmutableSet.of(Pair.of(cgb.c, cgc.a)));
      }

      $$0.a(csl.a, cbw.a($$1, 0.5F));
      $$0.a(csl.f, cbw.d($$1, 0.5F), ImmutableSet.of(Pair.of(cgb.e, cgc.a)));
      $$0.a(csl.e, cbw.c($$1, 0.5F));
      $$0.a(csl.b, cbw.e($$1, 0.5F));
      $$0.a(csl.g, cbw.f($$1, 0.5F));
      $$0.a(csl.i, cbw.g($$1, 0.5F));
      $$0.a(csl.h, cbw.h($$1, 0.5F));
      $$0.a(csl.j, cbw.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(csl.a));
      $$0.b(csl.b);
      $$0.a(csl.b);
      $$0.a(this.dV().af(), this.dV().ae());
   }

   @Override
   protected void j() {
      super.j();
      if (this.dV() instanceof aro) {
         this.g((aro)this.dV());
      }
   }

   public static bye.a gz() {
      return bxb.E().a(byf.v, 0.5);
   }

   public boolean gA() {
      return this.cg;
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
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
               this.gV();
               this.bV = false;
            }

            this.a(new bve(bvg.j, 200, 0));
         }
      }

      if (this.bW != null) {
         $$0.a(chy.e, this.bW, this);
         $$0.a(this, (byte)14);
         this.bW = null;
      }

      if (!this.gf() && this.ae.a(100) == 0) {
         csh $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gy().b().a(cqh.b) && this.gq()) {
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

      this.gX();
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.uK) || !this.bK() || this.gq() || this.fQ()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gK();
         return bty.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gr().isEmpty();
            if ($$1 == btx.a) {
               if ($$3) {
                  this.gK();
               }

               $$0.a(awv.S);
            }

            if ($$3) {
               return bty.c;
            }

            this.g($$0);
         }

         return bty.a;
      }
   }

   private void gK() {
      this.r(40);
      if (!this.dV().w_()) {
         this.b(awl.BU);
      }
   }

   private void g(cqs $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.m_(), this.gy().c());
   }

   @Override
   public void a(@Nullable cqs $$0) {
      boolean $$1 = this.x() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gv();
      }
   }

   @Override
   protected void gv() {
      super.gv();
      this.gL();
   }

   private void gL() {
      if (!this.dV().w_()) {
         for (dhn $$0 : this.gr()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gB() {
      return true;
   }

   public void gC() {
      this.gQ();

      for (dhn $$0 : this.gr()) {
         $$0.j();
      }

      this.gM();
      this.cd = this.dV().ae();
      this.ce++;
   }

   private void gM() {
      dho $$0 = this.gr();
      cqs $$1 = this.x();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bQ.l, $$0, this.gy().c(), this.t(), this.gs(), this.gB());
      }
   }

   private boolean gN() {
      for (dhn $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gO() {
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
         this.gY();
      }

      return this.gO() && this.gN();
   }

   private void gP() {
      int $$0 = 2 - this.ce;
      if ($$0 > 0) {
         for (dhn $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gQ();
      }

      this.gM();
   }

   private void gQ() {
      for (dhn $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void h(cqs $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dhn $$2 : this.gr()) {
            $$2.a(-azk.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bvg.F)) {
         bve $$3 = $$0.c(bvg.F);
         int $$4 = $$3.e();

         for (dhn $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bM, new cqf(mf.w.b(cqj.c), mf.x.b(cqh.b), 1));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cqf.c.encodeStart(ul.a, this.gy()).resultOrPartial(bL::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.bY);
      $$0.a("Gossips", this.bZ.a(ul.a));
      $$0.a("Xp", this.cc);
      $$0.a("LastRestock", this.cd);
      $$0.a("LastGossipDecay", this.cb);
      $$0.a("RestocksToday", this.ce);
      if (this.cg) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cqf.c.parse(ul.a, $$0.c("VillagerData")).resultOrPartial(bL::error).ifPresent($$0x -> this.al.a(bM, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.bY = $$0.f("FoodLevel");
      }

      ud $$1 = $$0.c("Gossips", 10);
      this.bZ.a(new Dynamic(ul.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cc = $$0.h("Xp");
      }

      this.cd = $$0.i("LastRestock");
      this.cb = $$0.i("LastGossipDecay");
      if (this.dV() instanceof aro) {
         this.g((aro)this.dV());
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
   protected awk u() {
      if (this.fQ()) {
         return null;
      } else {
         return this.gq() ? awl.BV : awl.BQ;
      }
   }

   @Override
   protected awk e(bup $$0) {
      return awl.BT;
   }

   @Override
   protected awk l_() {
      return awl.BS;
   }

   public void gE() {
      this.b(this.gy().b().a().f());
   }

   @Override
   public void a(cqf $$0) {
      cqf $$1 = this.gy();
      if (!$$1.b().equals($$0.b())) {
         this.bG = null;
      }

      this.al.a(bM, $$0);
   }

   @Override
   public cqf gy() {
      return this.al.a(bM);
   }

   @Override
   protected void b(dhn $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cc = this.cc + $$0.q();
      this.bW = this.x();
      if (this.gU()) {
         this.bU = 40;
         this.bV = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bwo(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bwz $$0) {
      if ($$0 != null && this.dV() instanceof aro) {
         ((aro)this.dV()).a(chy.c, $$0, this);
         if (this.bK() && $$0 instanceof cqs) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bup $$0) {
      bL.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bwa $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gR();
      super.a($$0);
   }

   private void gR() {
      this.a(cgb.b);
      this.a(cgb.c);
      this.a(cgb.d);
      this.a(cgb.e);
   }

   private void b(bwa $$0) {
      if (this.dV() instanceof aro $$1) {
         Optional<cgd> $$3 = this.bs.c(cgb.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bxo.class::isInstance).forEach($$2x -> $$1.a(chy.d, $$0, (bxo)$$2x));
         }
      }
   }

   public void a(cgb<jd> $$0) {
      if (this.dV() instanceof aro) {
         MinecraftServer $$1 = ((aro)this.dV()).p();
         this.bs.c($$0).ifPresent($$2 -> {
            aro $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cib $$4 = $$3.A();
               Optional<je<cie>> $$5 = $$4.c($$2.b());
               BiPredicate<cqe, je<cie>> $$6 = bK.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agk.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean S_() {
      return this.bY + this.gW() >= 12 && !this.fQ() && this.g() == 0;
   }

   private boolean gS() {
      return this.bY < 12;
   }

   private void gT() {
      if (this.gS() && this.gW() != 0) {
         for (int $$0 = 0; $$0 < this.n().b(); $$0++) {
            cys $$1 = this.n().a($$0);
            if (!$$1.f()) {
               Integer $$2 = bI.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.bY = this.bY + $$2;
                     this.n().a($$0, 1);
                     if (!this.gS()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(cqs $$0) {
      return this.bZ.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.bY -= $$0;
   }

   public void gF() {
      this.gT();
      this.u(12);
   }

   @Override
   public void b(dho $$0) {
      this.bG = $$0;
   }

   private boolean gU() {
      int $$0 = this.gy().c();
      return cqf.d($$0) && this.cc >= cqf.c($$0);
   }

   private void gV() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gw();
   }

   @Override
   protected ww cz() {
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
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      if ($$2 == bwi.e) {
         this.a(this.gy().b($$0.F_(), cqh.b));
      }

      if ($$2 == bwi.n || $$2 == bwi.m || bwi.a($$2) || $$2 == bwi.o) {
         this.a(this.gy().a($$0.F_(), cqj.a($$0.u(this.dv()))));
      }

      if ($$2 == bwi.d) {
         this.cg = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cqe b(aro $$0, bvq $$1) {
      double $$2 = this.ae.j();
      je<cqj> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.F_().d(cqj.a($$0.u(this.dv())));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cqe)$$1).gy().a();
      }

      cqe $$6 = new cqe(bwj.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bwi.e, null);
      return $$6;
   }

   @Override
   public void a(aro $$0, bwy $$1) {
      if ($$0.an() != btv.a) {
         bL.info("Villager {} was struck by lightning {}.", this, $$1);
         coj $$2 = this.a(bwj.bI, bvu.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bwi.i, null);
            $$1x.fY();
            this.gR();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(aro $$0, cmx $$1) {
      cqc.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(aro $$0, cys $$1) {
      cyo $$2 = $$1.h();
      return ($$1.a(axi.bN) || this.gy().b().a().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gG() {
      return this.gW() >= 24;
   }

   public boolean gH() {
      return this.gW() < 12;
   }

   private int gW() {
      buf $$0 = this.n();
      return bI.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gI() {
      return this.n().a_($$0 -> $$0.a(axi.bM));
   }

   @Override
   protected void gw() {
      cqf $$0 = this.gy();
      ald<cqh> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<cqi.g[]> $$3;
         if (this.dV().K().b(cud.b)) {
            Int2ObjectMap<cqi.g[]> $$2 = cqi.c.get($$1);
            $$3 = $$2 != null ? $$2 : cqi.a.get($$1);
         } else {
            $$3 = cqi.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            cqi.g[] $$5 = (cqi.g[])$$3.get($$0.c());
            if ($$5 != null) {
               dho $$6 = this.gr();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(aro $$0, cqe $$1, long $$2) {
      if (($$2 < this.ca || $$2 >= this.ca + 1200L) && ($$2 < $$1.ca || $$2 >= $$1.ca + 1200L)) {
         this.bZ.a($$1.bZ, this.ae, 10);
         this.ca = $$2;
         $$1.ca = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gX() {
      long $$0 = this.dV().ae();
      if (this.cb == 0L) {
         this.cb = $$0;
      } else if ($$0 >= this.cb + 24000L) {
         this.bZ.b();
         this.cb = $$0;
      }
   }

   public void a(aro $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fdr $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cqe> $$4 = $$0.a(cqe.class, $$3);
         List<cqe> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!baf.a(bwj.ap, bwi.f, $$0, this.dv(), 10, 8, 6, baf.a.a, false).isEmpty()) {
               $$4.forEach(cgt::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ae()) ? false : !this.bs.a(cgb.G);
   }

   @Override
   public void a(chy $$0, bwa $$1) {
      if ($$0 == chy.a) {
         this.bZ.a($$1.cG(), cfy.d, 20);
         this.bZ.a($$1.cG(), cfy.c, 25);
      } else if ($$0 == chy.e) {
         this.bZ.a($$1.cG(), cfy.e, 2);
      } else if ($$0 == chy.c) {
         this.bZ.a($$1.cG(), cfy.b, 25);
      } else if ($$0 == chy.d) {
         this.bZ.a($$1.cG(), cfy.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cc;
   }

   public void t(int $$0) {
      this.cc = $$0;
   }

   private void gY() {
      this.gP();
      this.ce = 0;
   }

   public cfx gJ() {
      return this.bZ;
   }

   public void a(uu $$0) {
      this.bZ.a(new Dynamic(ul.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   public void b(iu $$0) {
      super.b($$0);
      this.bs.a(cgb.I, this.dV().ae());
      this.bs.b(cgb.n);
      this.bs.b(cgb.F);
   }

   @Override
   public void fR() {
      super.fR();
      this.bs.a(cgb.J, this.dV().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bs.c(cgb.I);
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
         je<cqj> $$2 = c(kj.av, $$1);
         this.a(this.gy().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
