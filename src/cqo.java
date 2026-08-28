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

public class cqo extends cqj implements bxt, cqq {
   private static final Logger bM = LogUtils.getLogger();
   private static final akj<cqp> bN = akn.a(cqo.class, akl.u);
   public static final int bI = 12;
   public static final Map<cyz, Integer> bJ = ImmutableMap.of(czh.ql, 4, czh.vq, 1, czh.vp, 1, czh.wv, 1);
   private static final int bO = 2;
   private static final int bP = 10;
   private static final int bQ = 1200;
   private static final int bR = 24000;
   private static final int bS = 10;
   private static final int bT = 5;
   private static final long bU = 24000L;
   @VisibleForTesting
   public static final float bK = 0.5F;
   private int bV;
   private boolean bW;
   @Nullable
   private crc bX;
   private boolean bY;
   private int bZ;
   private final cgc ca = new cgc();
   private long cb;
   private long cc;
   private int cd;
   private long ce;
   private int cf;
   private long cg;
   private boolean ch;
   private static final ImmutableList<cgg<?>> ci = ImmutableList.of(
      cgg.b,
      cgg.c,
      cgg.d,
      cgg.e,
      cgg.g,
      cgg.h,
      cgg.i,
      cgg.j,
      cgg.k,
      cgg.l,
      cgg.M,
      cgg.aQ,
      new cgg[]{cgg.n, cgg.o, cgg.r, cgg.s, cgg.u, cgg.w, cgg.x, cgg.y, cgg.z, cgg.B, cgg.f, cgg.D, cgg.E, cgg.F, cgg.I, cgg.J, cgg.K, cgg.G}
   );
   private static final ImmutableList<chn<? extends chm<? super cqo>>> cj = ImmutableList.of(chn.c, chn.d, chn.b, chn.e, chn.f, chn.g, chn.h, chn.i, chn.j);
   public static final Map<cgg<jd>, BiPredicate<cqo, je<cij>>> bL = ImmutableMap.of(
      cgg.b,
      (BiPredicate<cqo, je>)($$0, $$1) -> $$1.a(cik.n),
      cgg.c,
      (BiPredicate<cqo, je>)($$0, $$1) -> $$0.gz().b().a().b().test($$1),
      cgg.d,
      (BiPredicate<cqo, je>)($$0, $$1) -> cqr.a.test($$1),
      cgg.e,
      (BiPredicate<cqo, je>)($$0, $$1) -> $$1.a(cik.o)
   );

   public cqo(bwo<? extends cqo> $$0, dja $$1) {
      this($$0, $$1, cqt.c);
   }

   public cqo(bwo<? extends cqo> $$0, dja $$1, alf<cqt> $$2) {
      this($$0, $$1, $$1.F_().d($$2));
   }

   public cqo(bwo<? extends cqo> $$0, dja $$1, je<cqt> $$2) {
      super($$0, $$1);
      ((cgn)this.O()).b(true);
      this.O().a(true);
      this.O().a(48.0F);
      this.a_(true);
      this.a(this.gz().a($$2).b($$1.F_(), cqr.b));
   }

   @Override
   public bye<cqo> ec() {
      return (bye<cqo>)super.ec();
   }

   @Override
   protected bye.b<cqo> ed() {
      return bye.a(ci, cj);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      bye<cqo> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(arq $$0) {
      bye<cqo> $$1 = this.ec();
      $$1.b($$0, this);
      this.bs = $$1.i();
      this.a(this.ec());
   }

   private void a(bye<cqo> $$0) {
      je<cqr> $$1 = this.gz().b();
      if (this.n_()) {
         $$0.a(csy.e);
         $$0.a(csw.d, ccb.a(0.5F));
      } else {
         $$0.a(csy.f);
         $$0.a(csw.c, ccb.b($$1, 0.5F), ImmutableSet.of(Pair.of(cgg.c, cgh.a)));
      }

      $$0.a(csw.a, ccb.a($$1, 0.5F));
      $$0.a(csw.f, ccb.d($$1, 0.5F), ImmutableSet.of(Pair.of(cgg.e, cgh.a)));
      $$0.a(csw.e, ccb.c($$1, 0.5F));
      $$0.a(csw.b, ccb.e($$1, 0.5F));
      $$0.a(csw.g, ccb.f($$1, 0.5F));
      $$0.a(csw.i, ccb.g($$1, 0.5F));
      $$0.a(csw.h, ccb.h($$1, 0.5F));
      $$0.a(csw.j, ccb.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(csw.a));
      $$0.b(csw.b);
      $$0.a(csw.b);
      $$0.a(this.dV().af(), this.dV().ae());
   }

   @Override
   protected void j() {
      super.j();
      if (this.dV() instanceof arq) {
         this.g((arq)this.dV());
      }
   }

   public static byj.a gA() {
      return bxg.E().a(byk.v, 0.5);
   }

   public boolean gB() {
      return this.ch;
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("villagerBrain");
      this.ec().a($$0, this);
      $$1.c();
      if (this.ch) {
         this.ch = false;
      }

      if (!this.gr() && this.bV > 0) {
         this.bV--;
         if (this.bV <= 0) {
            if (this.bW) {
               this.gX();
               this.bW = false;
            }

            this.a(new bvj(bvl.j, 200, 0));
         }
      }

      if (this.bX != null) {
         $$0.a(cid.e, this.bX, this);
         $$0.a(this, (byte)14);
         this.bX = null;
      }

      if (!this.gg() && this.ae.a(100) == 0) {
         css $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.r() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gz().b().a(cqr.b) && this.gr()) {
         this.gw();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.q() > 0) {
         this.r(this.q() - 1);
      }

      this.gZ();
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(czh.uR) || !this.bK() || this.gr() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gM();
         return bud.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gs().isEmpty();
            if ($$1 == buc.a) {
               if ($$3) {
                  this.gM();
               }

               $$0.a(awx.S);
            }

            if ($$3) {
               return bud.c;
            }

            this.g($$0);
         }

         return bud.a;
      }
   }

   private void gM() {
      this.r(40);
      if (!this.dV().w_()) {
         this.b(awn.Ca);
      }
   }

   private void g(crc $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.m_(), this.gz().c());
   }

   @Override
   public void a(@Nullable crc $$0) {
      boolean $$1 = this.x() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gw();
      }
   }

   @Override
   protected void gw() {
      super.gw();
      this.gN();
   }

   private void gN() {
      if (!this.dV().w_()) {
         for (dhy $$0 : this.gs()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gC() {
      return true;
   }

   public void gD() {
      this.gS();

      for (dhy $$0 : this.gs()) {
         $$0.j();
      }

      this.gO();
      this.ce = this.dV().ae();
      this.cf++;
   }

   private void gO() {
      dhz $$0 = this.gs();
      crc $$1 = this.x();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bR.l, $$0, this.gz().c(), this.t(), this.gt(), this.gC());
      }
   }

   private boolean gP() {
      for (dhy $$0 : this.gs()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gQ() {
      return this.cf == 0 || this.cf < 2 && this.dV().ae() > this.ce + 2400L;
   }

   public boolean gE() {
      long $$0 = this.ce + 12000L;
      long $$1 = this.dV().ae();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dV().af();
      if (this.cg > 0L) {
         long $$4 = this.cg / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cg = $$3;
      if ($$2) {
         this.ce = $$1;
         this.ha();
      }

      return this.gQ() && this.gP();
   }

   private void gR() {
      int $$0 = 2 - this.cf;
      if ($$0 > 0) {
         for (dhy $$1 : this.gs()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gS();
      }

      this.gO();
   }

   private void gS() {
      for (dhy $$0 : this.gs()) {
         $$0.g();
      }
   }

   private void h(crc $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dhy $$2 : this.gs()) {
            $$2.a(-azm.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bvl.F)) {
         bvj $$3 = $$0.c(bvl.F);
         int $$4 = $$3.e();

         for (dhy $$5 : this.gs()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bN, gF());
   }

   public static cqp gF() {
      return new cqp(mf.w.b(cqt.c), mf.x.b(cqr.b), 1);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("VillagerData", cqp.c, this.gz());
      $$0.a("FoodLevel", (byte)this.bZ);
      $$0.a("Gossips", this.ca.a(un.a));
      $$0.a("Xp", this.cd);
      $$0.a("LastRestock", this.ce);
      $$0.a("LastGossipDecay", this.cc);
      $$0.a("RestocksToday", this.cf);
      if (this.ch) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(bN, $$0.<cqp>a("VillagerData", cqp.c).orElseGet(cqo::gF));
      if ($$0.b("FoodLevel", 1)) {
         this.bZ = $$0.f("FoodLevel");
      }

      uf $$1 = $$0.c("Gossips", 10);
      this.ca.a(new Dynamic(un.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cd = $$0.h("Xp");
      }

      this.ce = $$0.i("LastRestock");
      this.cc = $$0.i("LastGossipDecay");
      if (this.dV() instanceof arq) {
         this.g((arq)this.dV());
      }

      this.cf = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.ch = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected awm u() {
      if (this.fR()) {
         return null;
      } else {
         return this.gr() ? awn.Cb : awn.BW;
      }
   }

   @Override
   protected awm e(buu $$0) {
      return awn.BZ;
   }

   @Override
   protected awm l_() {
      return awn.BY;
   }

   public void gG() {
      this.b(this.gz().b().a().f());
   }

   @Override
   public void a(cqp $$0) {
      cqp $$1 = this.gz();
      if (!$$1.b().equals($$0.b())) {
         this.bH = null;
      }

      this.al.a(bN, $$0);
   }

   @Override
   public cqp gz() {
      return this.al.a(bN);
   }

   @Override
   protected void b(dhy $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cd = this.cd + $$0.q();
      this.bX = this.x();
      if (this.gW()) {
         this.bV = 40;
         this.bW = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bwt(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bxe $$0) {
      if ($$0 != null && this.dV() instanceof arq) {
         ((arq)this.dV()).a(cid.c, $$0, this);
         if (this.bK() && $$0 instanceof crc) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(buu $$0) {
      bM.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bwf $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gT();
      super.a($$0);
   }

   private void gT() {
      this.a(cgg.b);
      this.a(cgg.c);
      this.a(cgg.d);
      this.a(cgg.e);
   }

   private void b(bwf $$0) {
      if (this.dV() instanceof arq $$1) {
         Optional<cgi> $$3 = this.bs.c(cgg.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bxt.class::isInstance).forEach($$2x -> $$1.a(cid.d, $$0, (bxt)$$2x));
         }
      }
   }

   public void a(cgg<jd> $$0) {
      if (this.dV() instanceof arq) {
         MinecraftServer $$1 = ((arq)this.dV()).p();
         this.bs.c($$0).ifPresent($$2 -> {
            arq $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cig $$4 = $$3.A();
               Optional<je<cij>> $$5 = $$4.c($$2.b());
               BiPredicate<cqo, je<cij>> $$6 = bL.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agm.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean T_() {
      return this.bZ + this.gY() >= 12 && !this.fR() && this.g() == 0;
   }

   private boolean gU() {
      return this.bZ < 12;
   }

   private void gV() {
      if (this.gU() && this.gY() != 0) {
         for (int $$0 = 0; $$0 < this.n().b(); $$0++) {
            czd $$1 = this.n().a($$0);
            if (!$$1.f()) {
               Integer $$2 = bJ.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.bZ = this.bZ + $$2;
                     this.n().a($$0, 1);
                     if (!this.gU()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(crc $$0) {
      return this.ca.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.bZ -= $$0;
   }

   public void gH() {
      this.gV();
      this.u(12);
   }

   public void b(dhz $$0) {
      this.bH = $$0;
   }

   private boolean gW() {
      int $$0 = this.gz().c();
      return cqp.d($$0) && this.cd >= cqp.c($$0);
   }

   private void gX() {
      this.a(this.gz().a(this.gz().c() + 1));
      this.gx();
   }

   @Override
   protected wy cz() {
      return this.gz().b().a().a();
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
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      if ($$2 == bwn.e) {
         this.a(this.gz().b($$0.F_(), cqr.b));
      }

      if ($$2 == bwn.n || $$2 == bwn.m || bwn.a($$2) || $$2 == bwn.o) {
         this.a(this.gz().a($$0.F_(), cqt.a($$0.u(this.dv()))));
      }

      if ($$2 == bwn.d) {
         this.ch = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cqo b(arq $$0, bvv $$1) {
      double $$2 = this.ae.j();
      je<cqt> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.F_().d(cqt.a($$0.u(this.dv())));
      } else if ($$2 < 0.75) {
         $$3 = this.gz().a();
      } else {
         $$3 = ((cqo)$$1).gz().a();
      }

      cqo $$6 = new cqo(bwo.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bwn.e, null);
      return $$6;
   }

   @Override
   public void a(arq $$0, bxd $$1) {
      if ($$0.an() != bua.a) {
         bM.info("Villager {} was struck by lightning {}.", this, $$1);
         cou $$2 = this.a(bwo.bI, bvz.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bwn.i, null);
            $$1x.fZ();
            this.gT();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(arq $$0, cnh $$1) {
      cqm.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(arq $$0, czd $$1) {
      cyz $$2 = $$1.h();
      return ($$1.a(axk.bO) || this.gz().b().a().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gI() {
      return this.gY() >= 24;
   }

   public boolean gJ() {
      return this.gY() < 12;
   }

   private int gY() {
      buk $$0 = this.n();
      return bJ.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gK() {
      return this.n().a_($$0 -> $$0.a(axk.bN));
   }

   @Override
   protected void gx() {
      cqp $$0 = this.gz();
      alf<cqr> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<cqs.g[]> $$3;
         if (this.dV().K().b(cuo.b)) {
            Int2ObjectMap<cqs.g[]> $$2 = cqs.c.get($$1);
            $$3 = $$2 != null ? $$2 : cqs.a.get($$1);
         } else {
            $$3 = cqs.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            cqs.g[] $$5 = (cqs.g[])$$3.get($$0.c());
            if ($$5 != null) {
               dhz $$6 = this.gs();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(arq $$0, cqo $$1, long $$2) {
      if (($$2 < this.cb || $$2 >= this.cb + 1200L) && ($$2 < $$1.cb || $$2 >= $$1.cb + 1200L)) {
         this.ca.a($$1.ca, this.ae, 10);
         this.cb = $$2;
         $$1.cb = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gZ() {
      long $$0 = this.dV().ae();
      if (this.cc == 0L) {
         this.cc = $$0;
      } else if ($$0 >= this.cc + 24000L) {
         this.ca.b();
         this.cc = $$0;
      }
   }

   public void a(arq $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fel $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cqo> $$4 = $$0.a(cqo.class, $$3);
         List<cqo> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bah.a(bwo.ap, bwn.f, $$0, this.dv(), 10, 8, 6, bah.a.a, false).isEmpty()) {
               $$4.forEach(cgy::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ae()) ? false : !this.bs.a(cgg.G);
   }

   @Override
   public void a(cid $$0, bwf $$1) {
      if ($$0 == cid.a) {
         this.ca.a($$1.cG(), cgd.d, 20);
         this.ca.a($$1.cG(), cgd.c, 25);
      } else if ($$0 == cid.e) {
         this.ca.a($$1.cG(), cgd.e, 2);
      } else if ($$0 == cid.c) {
         this.ca.a($$1.cG(), cgd.b, 25);
      } else if ($$0 == cid.d) {
         this.ca.a($$1.cG(), cgd.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cd;
   }

   public void t(int $$0) {
      this.cd = $$0;
   }

   private void ha() {
      this.gR();
      this.cf = 0;
   }

   public cgc gL() {
      return this.ca;
   }

   public void a(uw $$0) {
      this.ca.a(new Dynamic(un.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void b(iu $$0) {
      super.b($$0);
      this.bs.a(cgg.I, this.dV().ae());
      this.bs.b(cgg.n);
      this.bs.b(cgg.F);
   }

   @Override
   public void fS() {
      super.fS();
      this.bs.a(cgg.J, this.dV().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bs.c(cgg.I);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.av ? c((ki<T>)$$0, this.gz().a()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.av) {
         je<cqt> $$2 = c(kj.av, $$1);
         this.a(this.gz().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
