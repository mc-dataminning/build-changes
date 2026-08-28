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

public class cpu extends cpp implements bxg, cpw {
   private static final Logger bK = LogUtils.getLogger();
   private static final akg<cpv> bL = akk.a(cpu.class, aki.u);
   public static final int bG = 12;
   public static final Map<cxu, Integer> bH = ImmutableMap.of(cyc.qg, 4, cyc.vj, 1, cyc.vi, 1, cyc.wo, 1);
   private static final int bM = 2;
   private static final int bN = 10;
   private static final int bO = 1200;
   private static final int bP = 24000;
   private static final int bQ = 10;
   private static final int bR = 5;
   private static final long bS = 24000L;
   @VisibleForTesting
   public static final float bI = 0.5F;
   private int bT;
   private boolean bU;
   @Nullable
   private cqi bV;
   private boolean bW;
   private int bX;
   private final cfp bY = new cfp();
   private long bZ;
   private long ca;
   private int cb;
   private long cc;
   private int cd;
   private long ce;
   private boolean cf;
   private static final ImmutableList<cft<?>> cg = ImmutableList.of(
      cft.b,
      cft.c,
      cft.d,
      cft.e,
      cft.g,
      cft.h,
      cft.i,
      cft.j,
      cft.k,
      cft.l,
      cft.M,
      cft.aQ,
      new cft[]{cft.n, cft.o, cft.r, cft.s, cft.u, cft.w, cft.x, cft.y, cft.z, cft.B, cft.f, cft.D, cft.E, cft.F, cft.I, cft.J, cft.K, cft.G}
   );
   private static final ImmutableList<cha<? extends cgz<? super cpu>>> ch = ImmutableList.of(cha.c, cha.d, cha.b, cha.e, cha.f, cha.g, cha.h, cha.i, cha.j);
   public static final Map<cft<jr>, BiPredicate<cpu, js<chw>>> bJ = ImmutableMap.of(
      cft.b,
      (BiPredicate<cpu, js>)($$0, $$1) -> $$1.a(chx.n),
      cft.c,
      (BiPredicate<cpu, js>)($$0, $$1) -> $$0.gy().b().a().b().test($$1),
      cft.d,
      (BiPredicate<cpu, js>)($$0, $$1) -> cpx.a.test($$1),
      cft.e,
      (BiPredicate<cpu, js>)($$0, $$1) -> $$1.a(chx.o)
   );

   public cpu(bwb<? extends cpu> $$0, dhp $$1) {
      this($$0, $$1, cpz.c);
   }

   public cpu(bwb<? extends cpu> $$0, dhp $$1, alc<cpz> $$2) {
      this($$0, $$1, $$1.F_().d($$2));
   }

   public cpu(bwb<? extends cpu> $$0, dhp $$1, js<cpz> $$2) {
      super($$0, $$1);
      ((cga)this.O()).b(true);
      this.O().a(true);
      this.O().a(48.0F);
      this.a_(true);
      this.a(this.gy().a($$2).b($$1.F_(), cpx.b));
   }

   @Override
   public bxr<cpu> eb() {
      return (bxr<cpu>)super.eb();
   }

   @Override
   protected bxr.b<cpu> ec() {
      return bxr.a(cg, ch);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      bxr<cpu> $$1 = this.ec().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(arn $$0) {
      bxr<cpu> $$1 = this.eb();
      $$1.b($$0, this);
      this.br = $$1.i();
      this.a(this.eb());
   }

   private void a(bxr<cpu> $$0) {
      js<cpx> $$1 = this.gy().b();
      if (this.n_()) {
         $$0.a(csb.e);
         $$0.a(crz.d, cbo.a(0.5F));
      } else {
         $$0.a(csb.f);
         $$0.a(crz.c, cbo.b($$1, 0.5F), ImmutableSet.of(Pair.of(cft.c, cfu.a)));
      }

      $$0.a(crz.a, cbo.a($$1, 0.5F));
      $$0.a(crz.f, cbo.d($$1, 0.5F), ImmutableSet.of(Pair.of(cft.e, cfu.a)));
      $$0.a(crz.e, cbo.c($$1, 0.5F));
      $$0.a(crz.b, cbo.e($$1, 0.5F));
      $$0.a(crz.g, cbo.f($$1, 0.5F));
      $$0.a(crz.i, cbo.g($$1, 0.5F));
      $$0.a(crz.h, cbo.h($$1, 0.5F));
      $$0.a(crz.j, cbo.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(crz.a));
      $$0.b(crz.b);
      $$0.a(crz.b);
      $$0.a(this.dV().af(), this.dV().ae());
   }

   @Override
   protected void j() {
      super.j();
      if (this.dV() instanceof arn) {
         this.g((arn)this.dV());
      }
   }

   public static bxw.a gz() {
      return bwt.E().a(bxx.v, 0.5);
   }

   public boolean gA() {
      return this.cf;
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("villagerBrain");
      this.eb().a($$0, this);
      $$1.c();
      if (this.cf) {
         this.cf = false;
      }

      if (!this.gq() && this.bT > 0) {
         this.bT--;
         if (this.bT <= 0) {
            if (this.bU) {
               this.gV();
               this.bU = false;
            }

            this.a(new buw(buy.j, 200, 0));
         }
      }

      if (this.bV != null) {
         $$0.a(chq.e, this.bV, this);
         $$0.a(this, (byte)14);
         this.bV = null;
      }

      if (!this.gf() && this.ae.a(100) == 0) {
         crv $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gy().b().a(cpx.b) && this.gq()) {
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
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.uK) || !this.bK() || this.gq() || this.fQ()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gK();
         return btq.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gr().isEmpty();
            if ($$1 == btp.a) {
               if ($$3) {
                  this.gK();
               }

               $$0.a(awu.S);
            }

            if ($$3) {
               return btq.c;
            }

            this.g($$0);
         }

         return btq.a;
      }
   }

   private void gK() {
      this.r(40);
      if (!this.dV().w_()) {
         this.b(awk.BU);
      }
   }

   private void g(cqi $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.m_(), this.gy().c());
   }

   @Override
   public void a(@Nullable cqi $$0) {
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
         for (dgn $$0 : this.gr()) {
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

      for (dgn $$0 : this.gr()) {
         $$0.j();
      }

      this.gM();
      this.cc = this.dV().ae();
      this.cd++;
   }

   private void gM() {
      dgo $$0 = this.gr();
      cqi $$1 = this.x();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bP.l, $$0, this.gy().c(), this.t(), this.gs(), this.gB());
      }
   }

   private boolean gN() {
      for (dgn $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gO() {
      return this.cd == 0 || this.cd < 2 && this.dV().ae() > this.cc + 2400L;
   }

   public boolean gD() {
      long $$0 = this.cc + 12000L;
      long $$1 = this.dV().ae();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dV().af();
      if (this.ce > 0L) {
         long $$4 = this.ce / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.ce = $$3;
      if ($$2) {
         this.cc = $$1;
         this.gY();
      }

      return this.gO() && this.gN();
   }

   private void gP() {
      int $$0 = 2 - this.cd;
      if ($$0 > 0) {
         for (dgn $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gQ();
      }

      this.gM();
   }

   private void gQ() {
      for (dgn $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void h(cqi $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dgn $$2 : this.gr()) {
            $$2.a(-azk.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(buy.F)) {
         buw $$3 = $$0.c(buy.F);
         int $$4 = $$3.e();

         for (dgn $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bL, new cpv(md.w.b(cpz.c), md.x.b(cpx.b), 1));
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      cpv.c.encodeStart(uk.a, this.gy()).resultOrPartial(bK::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.bX);
      $$0.a("Gossips", this.bY.a(uk.a));
      $$0.a("Xp", this.cb);
      $$0.a("LastRestock", this.cc);
      $$0.a("LastGossipDecay", this.ca);
      $$0.a("RestocksToday", this.cd);
      if (this.cf) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cpv.c.parse(uk.a, $$0.c("VillagerData")).resultOrPartial(bK::error).ifPresent($$0x -> this.al.a(bL, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.bX = $$0.f("FoodLevel");
      }

      uc $$1 = $$0.c("Gossips", 10);
      this.bY.a(new Dynamic(uk.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cb = $$0.h("Xp");
      }

      this.cc = $$0.i("LastRestock");
      this.ca = $$0.i("LastGossipDecay");
      if (this.dV() instanceof arn) {
         this.g((arn)this.dV());
      }

      this.cd = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cf = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected awj u() {
      if (this.fQ()) {
         return null;
      } else {
         return this.gq() ? awk.BV : awk.BQ;
      }
   }

   @Override
   protected awj e(buh $$0) {
      return awk.BT;
   }

   @Override
   protected awj l_() {
      return awk.BS;
   }

   public void gE() {
      this.b(this.gy().b().a().f());
   }

   @Override
   public void a(cpv $$0) {
      cpv $$1 = this.gy();
      if (!$$1.b().equals($$0.b())) {
         this.bF = null;
      }

      this.al.a(bL, $$0);
   }

   @Override
   public cpv gy() {
      return this.al.a(bL);
   }

   @Override
   protected void b(dgn $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cb = this.cb + $$0.q();
      this.bV = this.x();
      if (this.gU()) {
         this.bT = 40;
         this.bU = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bwg(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bwr $$0) {
      if ($$0 != null && this.dV() instanceof arn) {
         ((arn)this.dV()).a(chq.c, $$0, this);
         if (this.bK() && $$0 instanceof cqi) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(buh $$0) {
      bK.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bvs $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gR();
      super.a($$0);
   }

   private void gR() {
      this.a(cft.b);
      this.a(cft.c);
      this.a(cft.d);
      this.a(cft.e);
   }

   private void b(bvs $$0) {
      if (this.dV() instanceof arn $$1) {
         Optional<cfv> $$3 = this.br.c(cft.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bxg.class::isInstance).forEach($$2x -> $$1.a(chq.d, $$0, (bxg)$$2x));
         }
      }
   }

   public void a(cft<jr> $$0) {
      if (this.dV() instanceof arn) {
         MinecraftServer $$1 = ((arn)this.dV()).p();
         this.br.c($$0).ifPresent($$2 -> {
            arn $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cht $$4 = $$3.A();
               Optional<js<chw>> $$5 = $$4.c($$2.b());
               BiPredicate<cpu, js<chw>> $$6 = bJ.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agj.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean S_() {
      return this.bX + this.gW() >= 12 && !this.fQ() && this.g() == 0;
   }

   private boolean gS() {
      return this.bX < 12;
   }

   private void gT() {
      if (this.gS() && this.gW() != 0) {
         for (int $$0 = 0; $$0 < this.n().b(); $$0++) {
            cxy $$1 = this.n().a($$0);
            if (!$$1.f()) {
               Integer $$2 = bH.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.bX = this.bX + $$2;
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

   public int f(cqi $$0) {
      return this.bY.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.bX -= $$0;
   }

   public void gF() {
      this.gT();
      this.u(12);
   }

   @Override
   public void b(dgo $$0) {
      this.bF = $$0;
   }

   private boolean gU() {
      int $$0 = this.gy().c();
      return cpv.d($$0) && this.cb >= cpv.c($$0);
   }

   private void gV() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gw();
   }

   @Override
   protected wv cz() {
      return this.gy().b().a().a();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lv.S);
      } else if ($$0 == 13) {
         this.a(lv.a);
      } else if ($$0 == 14) {
         this.a(lv.Q);
      } else if ($$0 == 42) {
         this.a(lv.ap);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$2 == bwa.e) {
         this.a(this.gy().b($$0.F_(), cpx.b));
      }

      if ($$2 == bwa.n || $$2 == bwa.m || bwa.a($$2) || $$2 == bwa.o) {
         this.a(this.gy().a($$0.F_(), cpz.a($$0.t(this.dv()))));
      }

      if ($$2 == bwa.d) {
         this.cf = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cpu b(arn $$0, bvi $$1) {
      double $$2 = this.ae.j();
      js<cpz> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.F_().d(cpz.a($$0.t(this.dv())));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cpu)$$1).gy().a();
      }

      cpu $$6 = new cpu(bwb.bC, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bwa.e, null);
      return $$6;
   }

   @Override
   public void a(arn $$0, bwq $$1) {
      if ($$0.an() != btn.a) {
         bK.info("Villager {} was struck by lightning {}.", this, $$1);
         cnz $$2 = this.a(bwb.bH, bvm.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bwa.i, null);
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
   protected void a(arn $$0, cmn $$1) {
      cps.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(arn $$0, cxy $$1) {
      cxu $$2 = $$1.h();
      return ($$1.a(axi.bN) || this.gy().b().a().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gG() {
      return this.gW() >= 24;
   }

   public boolean gH() {
      return this.gW() < 12;
   }

   private int gW() {
      btx $$0 = this.n();
      return bH.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gI() {
      return this.n().a_($$0 -> $$0.a(axi.bM));
   }

   @Override
   protected void gw() {
      cpv $$0 = this.gy();
      alc<cpx> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<cpy.g[]> $$3;
         if (this.dV().K().b(ctg.b)) {
            Int2ObjectMap<cpy.g[]> $$2 = cpy.c.get($$1);
            $$3 = $$2 != null ? $$2 : cpy.a.get($$1);
         } else {
            $$3 = cpy.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            cpy.g[] $$5 = (cpy.g[])$$3.get($$0.c());
            if ($$5 != null) {
               dgo $$6 = this.gr();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(arn $$0, cpu $$1, long $$2) {
      if (($$2 < this.bZ || $$2 >= this.bZ + 1200L) && ($$2 < $$1.bZ || $$2 >= $$1.bZ + 1200L)) {
         this.bY.a($$1.bY, this.ae, 10);
         this.bZ = $$2;
         $$1.bZ = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gX() {
      long $$0 = this.dV().ae();
      if (this.ca == 0L) {
         this.ca = $$0;
      } else if ($$0 >= this.ca + 24000L) {
         this.bY.b();
         this.ca = $$0;
      }
   }

   public void a(arn $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fcp $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cpu> $$4 = $$0.a(cpu.class, $$3);
         List<cpu> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bad.a(bwb.ap, bwa.f, $$0, this.dv(), 10, 8, 6, bad.a.a, false).isEmpty()) {
               $$4.forEach(cgl::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ae()) ? false : !this.br.a(cft.G);
   }

   @Override
   public void a(chq $$0, bvs $$1) {
      if ($$0 == chq.a) {
         this.bY.a($$1.cG(), cfq.d, 20);
         this.bY.a($$1.cG(), cfq.c, 25);
      } else if ($$0 == chq.e) {
         this.bY.a($$1.cG(), cfq.e, 2);
      } else if ($$0 == chq.c) {
         this.bY.a($$1.cG(), cfq.b, 25);
      } else if ($$0 == chq.d) {
         this.bY.a($$1.cG(), cfq.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cb;
   }

   public void t(int $$0) {
      this.cb = $$0;
   }

   private void gY() {
      this.gP();
      this.cd = 0;
   }

   public cfp gJ() {
      return this.bY;
   }

   public void a(ut $$0) {
      this.bY.a(new Dynamic(uk.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   public void b(jj $$0) {
      super.b($$0);
      this.br.a(cft.I, this.dV().ae());
      this.br.b(cft.n);
      this.br.b(cft.F);
   }

   @Override
   public void fR() {
      super.fR();
      this.br.a(cft.J, this.dV().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.br.c(cft.I);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.as ? b((kw<T>)$$0, this.gy().a()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.as);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.as) {
         js<cpz> $$2 = b(kx.as, $$1);
         this.a(this.gy().a($$2));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }
}
