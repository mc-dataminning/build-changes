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

public class cpa extends cov implements bwm, cpc {
   private static final Logger cf = LogUtils.getLogger();
   private static final aks<cpb> cg = akw.a(cpa.class, aku.u);
   public static final int cb = 12;
   public static final Map<cxc, Integer> cc = ImmutableMap.of(cxk.qc, 4, cxk.vf, 1, cxk.ve, 1, cxk.wk, 1);
   private static final int ch = 2;
   private static final int ci = 10;
   private static final int cj = 1200;
   private static final int ck = 24000;
   private static final int cl = 10;
   private static final int cm = 5;
   private static final long cn = 24000L;
   @VisibleForTesting
   public static final float cd = 0.5F;
   private int co;
   private boolean cp;
   @Nullable
   private cpo cq;
   private boolean cr;
   private int cs;
   private final cex ct = new cex();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cy;
   private long cz;
   private boolean cC;
   private static final ImmutableList<cfb<?>> cD = ImmutableList.of(
      cfb.b,
      cfb.c,
      cfb.d,
      cfb.e,
      cfb.g,
      cfb.h,
      cfb.i,
      cfb.j,
      cfb.k,
      cfb.l,
      cfb.L,
      cfb.aP,
      new cfb[]{cfb.m, cfb.n, cfb.q, cfb.r, cfb.t, cfb.v, cfb.w, cfb.x, cfb.y, cfb.A, cfb.f, cfb.C, cfb.D, cfb.E, cfb.H, cfb.I, cfb.J, cfb.F}
   );
   private static final ImmutableList<cgi<? extends cgh<? super cpa>>> cE = ImmutableList.of(cgi.c, cgi.d, cgi.b, cgi.e, cgi.f, cgi.g, cgi.h, cgi.i, cgi.j);
   public static final Map<cfb<jp>, BiPredicate<cpa, jq<che>>> ce = ImmutableMap.of(
      cfb.b,
      (BiPredicate<cpa, jq>)($$0, $$1) -> $$1.a(chf.n),
      cfb.c,
      (BiPredicate<cpa, jq>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      cfb.d,
      (BiPredicate<cpa, jq>)($$0, $$1) -> cpd.a.test($$1),
      cfb.e,
      (BiPredicate<cpa, jq>)($$0, $$1) -> $$1.a(chf.o)
   );

   public cpa(bvi<? extends cpa> $$0, dgz $$1) {
      this($$0, $$1, cpf.c);
   }

   public cpa(bvi<? extends cpa> $$0, dgz $$1, cpf $$2) {
      super($$0, $$1);
      ((cfi)this.L()).b(true);
      this.L().a(true);
      this.L().a(48.0F);
      this.a_(true);
      this.a(this.gy().a($$2).a(cpd.b));
   }

   @Override
   public bwz<cpa> ec() {
      return (bwz<cpa>)super.ec();
   }

   @Override
   protected bwz.b<cpa> ed() {
      return bwz.a(cD, cE);
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      bwz<cpa> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(arx $$0) {
      bwz<cpa> $$1 = this.ec();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.ec());
   }

   private void a(bwz<cpa> $$0) {
      cpd $$1 = this.gy().b();
      if (this.e_()) {
         $$0.a(crh.e);
         $$0.a(crf.d, caw.a(0.5F));
      } else {
         $$0.a(crh.f);
         $$0.a(crf.c, caw.b($$1, 0.5F), ImmutableSet.of(Pair.of(cfb.c, cfc.a)));
      }

      $$0.a(crf.a, caw.a($$1, 0.5F));
      $$0.a(crf.f, caw.d($$1, 0.5F), ImmutableSet.of(Pair.of(cfb.e, cfc.a)));
      $$0.a(crf.e, caw.c($$1, 0.5F));
      $$0.a(crf.b, caw.e($$1, 0.5F));
      $$0.a(crf.g, caw.f($$1, 0.5F));
      $$0.a(crf.i, caw.g($$1, 0.5F));
      $$0.a(crf.h, caw.h($$1, 0.5F));
      $$0.a(crf.j, caw.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.a(crf.b);
      $$0.a(this.dW().ae(), this.dW().ad());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dW() instanceof arx) {
         this.g((arx)this.dW());
      }
   }

   public static bxe.a gx() {
      return bvz.C().a(bxf.v, 0.5);
   }

   public boolean gz() {
      return this.cC;
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("villagerBrain");
      this.ec().a($$0, this);
      $$1.c();
      if (this.cC) {
         this.cC = false;
      }

      if (!this.gp() && this.co > 0) {
         this.co--;
         if (this.co <= 0) {
            if (this.cp) {
               this.gU();
               this.cp = false;
            }

            this.a(new bug(bui.j, 200, 0));
         }
      }

      if (this.cq != null) {
         $$0.a(cgy.e, this.cq, this);
         $$0.a(this, (byte)14);
         this.cq = null;
      }

      if (!this.gb() && this.ae.a(100) == 0) {
         crb $$2 = $$0.d(this.dw());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gy().b() == cpd.b && this.gp()) {
         this.gu();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.p() > 0) {
         this.r(this.p() - 1);
      }

      this.gW();
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.a(cxk.uG) || !this.bL() || this.gp() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gJ();
         return bta.a;
      } else {
         if (!this.dW().C) {
            boolean $$3 = this.gq().isEmpty();
            if ($$1 == bsz.a) {
               if ($$3) {
                  this.gJ();
               }

               $$0.a(axf.S);
            }

            if ($$3) {
               return bta.c;
            }

            this.h($$0);
         }

         return bta.a;
      }
   }

   private void gJ() {
      this.r(40);
      if (!this.dW().B_()) {
         this.b(awv.BL);
      }
   }

   private void h(cpo $$0) {
      this.i($$0);
      this.a($$0);
      this.a($$0, this.p_(), this.gy().c());
   }

   @Override
   public void a(@Nullable cpo $$0) {
      boolean $$1 = this.go() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gu();
      }
   }

   @Override
   protected void gu() {
      super.gu();
      this.gK();
   }

   private void gK() {
      if (!this.dW().B_()) {
         for (dfw $$0 : this.gq()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gA() {
      return true;
   }

   public void gB() {
      this.gP();

      for (dfw $$0 : this.gq()) {
         $$0.j();
      }

      this.gL();
      this.cx = this.dW().ad();
      this.cy++;
   }

   private void gL() {
      dfx $$0 = this.gq();
      cpo $$1 = this.go();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gy().c(), this.x(), this.gr(), this.gA());
      }
   }

   private boolean gM() {
      for (dfw $$0 : this.gq()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gN() {
      return this.cy == 0 || this.cy < 2 && this.dW().ad() > this.cx + 2400L;
   }

   public boolean gC() {
      long $$0 = this.cx + 12000L;
      long $$1 = this.dW().ad();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dW().ae();
      if (this.cz > 0L) {
         long $$4 = this.cz / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cz = $$3;
      if ($$2) {
         this.cx = $$1;
         this.gX();
      }

      return this.gN() && this.gM();
   }

   private void gO() {
      int $$0 = 2 - this.cy;
      if ($$0 > 0) {
         for (dfw $$1 : this.gq()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (dfw $$0 : this.gq()) {
         $$0.g();
      }
   }

   private void i(cpo $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dfw $$2 : this.gq()) {
            $$2.a(-azu.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bui.F)) {
         bug $$3 = $$0.c(bui.F);
         int $$4 = $$3.e();

         for (dfw $$5 : this.gq()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cg, new cpb(cpf.c, cpd.b, 1));
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      cpb.c.encodeStart(va.a, this.gy()).resultOrPartial(cf::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cs);
      $$0.a("Gossips", this.ct.a(va.a));
      $$0.a("Xp", this.cw);
      $$0.a("LastRestock", this.cx);
      $$0.a("LastGossipDecay", this.cv);
      $$0.a("RestocksToday", this.cy);
      if (this.cC) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cpb.c.parse(va.a, $$0.c("VillagerData")).resultOrPartial(cf::error).ifPresent($$0x -> this.al.a(cg, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cs = $$0.f("FoodLevel");
      }

      us $$1 = $$0.c("Gossips", 10);
      this.ct.a(new Dynamic(va.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cw = $$0.h("Xp");
      }

      this.cx = $$0.i("LastRestock");
      this.cv = $$0.i("LastGossipDecay");
      if (this.dW() instanceof arx) {
         this.g((arx)this.dW());
      }

      this.cy = $$0.h("RestocksToday");
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
   protected awu u() {
      if (this.fR()) {
         return null;
      } else {
         return this.gp() ? awv.BM : awv.BH;
      }
   }

   @Override
   protected awu e(btr $$0) {
      return awv.BK;
   }

   @Override
   protected awu o_() {
      return awv.BJ;
   }

   public void gD() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(cpb $$0) {
      cpb $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ca = null;
      }

      this.al.a(cg, $$0);
   }

   @Override
   public cpb gy() {
      return this.al.a(cg);
   }

   @Override
   protected void b(dfw $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cw = this.cw + $$0.q();
      this.cq = this.go();
      if (this.gT()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dW().b(new bvn(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   public void a(@Nullable bvx $$0) {
      if ($$0 != null && this.dW() instanceof arx) {
         ((arx)this.dW()).a(cgy.c, $$0, this);
         if (this.bL() && $$0 instanceof cpo) {
            this.dW().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(btr $$0) {
      cf.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bvb $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(cfb.b);
      this.a(cfb.c);
      this.a(cfb.d);
      this.a(cfb.e);
   }

   private void b(bvb $$0) {
      if (this.dW() instanceof arx $$1) {
         Optional<cfd> $$3 = this.bF.c(cfb.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bwm.class::isInstance).forEach($$2x -> $$1.a(cgy.d, $$0, (bwm)$$2x));
         }
      }
   }

   public void a(cfb<jp> $$0) {
      if (this.dW() instanceof arx) {
         MinecraftServer $$1 = ((arx)this.dW()).p();
         this.bF.c($$0).ifPresent($$2 -> {
            arx $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               chb $$4 = $$3.A();
               Optional<jq<che>> $$5 = $$4.c($$2.b());
               BiPredicate<cpa, jq<che>> $$6 = ce.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agy.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.cs + this.gV() >= 12 && !this.fR() && this.Z_() == 0;
   }

   private boolean gR() {
      return this.cs < 12;
   }

   private void gS() {
      if (this.gR() && this.gV() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            cxg $$1 = this.t().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cc.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cs = this.cs + $$2;
                     this.t().a($$0, 1);
                     if (!this.gR()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cpo $$0) {
      return this.ct.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.cs -= $$0;
   }

   public void gE() {
      this.gS();
      this.u(12);
   }

   @Override
   public void b(dfx $$0) {
      this.ca = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return cpb.d($$0) && this.cw >= cpb.c($$0);
   }

   private void gU() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gv();
   }

   @Override
   protected xk cz() {
      return xk.c(this.aq().g() + "." + ma.x.b(this.gy().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(ls.R);
      } else if ($$0 == 13) {
         this.a(ls.a);
      } else if ($$0 == 14) {
         this.a(ls.P);
      } else if ($$0 == 42) {
         this.a(ls.ao);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      if ($$2 == bvh.e) {
         this.a(this.gy().a(cpd.b));
      }

      if ($$2 == bvh.n || $$2 == bvh.m || bvh.a($$2) || $$2 == bvh.o) {
         this.a(this.gy().a(cpf.a($$0.t(this.dw()))));
      }

      if ($$2 == bvh.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cpa b(arx $$0, bus $$1) {
      double $$2 = this.ae.j();
      cpf $$3;
      if ($$2 < 0.5) {
         $$3 = cpf.a($$0.t(this.dw()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cpa)$$1).gy().a();
      }

      cpa $$6 = new cpa(bvi.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dw()), bvh.e, null);
      return $$6;
   }

   @Override
   public void a(arx $$0, bvw $$1) {
      if ($$0.am() != bsx.a) {
         cf.info("Villager {} was struck by lightning {}.", this, $$1);
         cne $$2 = this.a(bvi.bI, buw.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dw()), bvh.i, null);
            $$1x.ai();
            this.gQ();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(arx $$0, cls $$1) {
      coy.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(arx $$0, cxg $$1) {
      cxc $$2 = $$1.h();
      return ($$1.a(axt.bQ) || this.gy().b().d().contains($$2)) && this.t().c($$1);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      bth $$0 = this.t();
      return cc.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.t().a_($$0 -> $$0.a(axt.bP));
   }

   @Override
   protected void gv() {
      cpb $$0 = this.gy();
      Int2ObjectMap<cpe.g[]> $$2;
      if (this.dW().K().b(csm.b)) {
         Int2ObjectMap<cpe.g[]> $$1 = cpe.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cpe.a.get($$0.b());
      } else {
         $$2 = cpe.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cpe.g[] $$4 = (cpe.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dfx $$5 = this.gq();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arx $$0, cpa $$1, long $$2) {
      if (($$2 < this.cu || $$2 >= this.cu + 1200L) && ($$2 < $$1.cu || $$2 >= $$1.cu + 1200L)) {
         this.ct.a($$1.ct, this.ae, 10);
         this.cu = $$2;
         $$1.cu = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gW() {
      long $$0 = this.dW().ad();
      if (this.cv == 0L) {
         this.cv = $$0;
      } else if ($$0 >= this.cv + 24000L) {
         this.ct.b();
         this.cv = $$0;
      }
   }

   public void a(arx $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fbm $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cpa> $$4 = $$0.a(cpa.class, $$3);
         List<cpa> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!ban.a(bvi.aq, bvh.f, $$0, this.dw(), 10, 8, 6, ban.a.a, false).isEmpty()) {
               $$4.forEach(cft::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dW().ad()) ? false : !this.bF.a(cfb.F);
   }

   @Override
   public void a(cgy $$0, bvb $$1) {
      if ($$0 == cgy.a) {
         this.ct.a($$1.cG(), cey.d, 20);
         this.ct.a($$1.cG(), cey.c, 25);
      } else if ($$0 == cgy.e) {
         this.ct.a($$1.cG(), cey.e, 2);
      } else if ($$0 == cgy.c) {
         this.ct.a($$1.cG(), cey.b, 25);
      } else if ($$0 == cgy.d) {
         this.ct.a($$1.cG(), cey.a, 25);
      }
   }

   @Override
   public int x() {
      return this.cw;
   }

   public void t(int $$0) {
      this.cw = $$0;
   }

   private void gX() {
      this.gO();
      this.cy = 0;
   }

   public cex gI() {
      return this.ct;
   }

   public void a(vj $$0) {
      this.ct.a(new Dynamic(va.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   public void b(jh $$0) {
      super.b($$0);
      this.bF.a(cfb.H, this.dW().ad());
      this.bF.b(cfb.m);
      this.bF.b(cfb.E);
   }

   @Override
   public void fS() {
      super.fS();
      this.bF.a(cfb.I, this.dW().ad());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(cfb.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
