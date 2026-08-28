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

public class cqv extends cqq implements bxy, cqx {
   private static final Logger bM = LogUtils.getLogger();
   private static final akj<cqw> bN = akn.a(cqv.class, akl.u);
   public static final int bI = 12;
   public static final Map<czg, Integer> bJ = ImmutableMap.of(czo.ql, 4, czo.vq, 1, czo.vp, 1, czo.wv, 1);
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
   private crj bX;
   private boolean bY;
   private int bZ;
   private final cgh ca = new cgh();
   private long cb;
   private long cc;
   private int cd;
   private long ce;
   private int cf;
   private long cg;
   private boolean ch;
   private static final ImmutableList<cgl<?>> ci = ImmutableList.of(
      cgl.b,
      cgl.c,
      cgl.d,
      cgl.e,
      cgl.g,
      cgl.h,
      cgl.i,
      cgl.j,
      cgl.k,
      cgl.l,
      cgl.M,
      cgl.aQ,
      new cgl[]{cgl.n, cgl.o, cgl.r, cgl.s, cgl.u, cgl.w, cgl.x, cgl.y, cgl.z, cgl.B, cgl.f, cgl.D, cgl.E, cgl.F, cgl.I, cgl.J, cgl.K, cgl.G}
   );
   private static final ImmutableList<chs<? extends chr<? super cqv>>> cj = ImmutableList.of(chs.c, chs.d, chs.b, chs.e, chs.f, chs.g, chs.h, chs.i, chs.j);
   public static final Map<cgl<je>, BiPredicate<cqv, jf<cio>>> bL = ImmutableMap.of(
      cgl.b,
      (BiPredicate<cqv, jf>)($$0, $$1) -> $$1.a(cip.n),
      cgl.c,
      (BiPredicate<cqv, jf>)($$0, $$1) -> $$0.gB().b().a().b().test($$1),
      cgl.d,
      (BiPredicate<cqv, jf>)($$0, $$1) -> cqy.a.test($$1),
      cgl.e,
      (BiPredicate<cqv, jf>)($$0, $$1) -> $$1.a(cip.o)
   );

   public cqv(bwr<? extends cqv> $$0, djh $$1) {
      this($$0, $$1, cra.c);
   }

   public cqv(bwr<? extends cqv> $$0, djh $$1, alf<cra> $$2) {
      this($$0, $$1, $$1.F_().d($$2));
   }

   public cqv(bwr<? extends cqv> $$0, djh $$1, jf<cra> $$2) {
      super($$0, $$1);
      ((cgs)this.O()).b(true);
      this.O().a(true);
      this.O().a(48.0F);
      this.a_(true);
      this.a(this.gB().a($$2).b($$1.F_(), cqy.b));
   }

   @Override
   public byj<cqv> eb() {
      return (byj<cqv>)super.eb();
   }

   @Override
   protected byj.b<cqv> ec() {
      return byj.a(ci, cj);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      byj<cqv> $$1 = this.ec().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(arq $$0) {
      byj<cqv> $$1 = this.eb();
      $$1.b($$0, this);
      this.bs = $$1.i();
      this.a(this.eb());
   }

   private void a(byj<cqv> $$0) {
      jf<cqy> $$1 = this.gB().b();
      if (this.n_()) {
         $$0.a(ctf.e);
         $$0.a(ctd.d, ccg.a(0.5F));
      } else {
         $$0.a(ctf.f);
         $$0.a(ctd.c, ccg.b($$1, 0.5F), ImmutableSet.of(Pair.of(cgl.c, cgm.a)));
      }

      $$0.a(ctd.a, ccg.a($$1, 0.5F));
      $$0.a(ctd.f, ccg.d($$1, 0.5F), ImmutableSet.of(Pair.of(cgl.e, cgm.a)));
      $$0.a(ctd.e, ccg.c($$1, 0.5F));
      $$0.a(ctd.b, ccg.e($$1, 0.5F));
      $$0.a(ctd.g, ccg.f($$1, 0.5F));
      $$0.a(ctd.i, ccg.g($$1, 0.5F));
      $$0.a(ctd.h, ccg.h($$1, 0.5F));
      $$0.a(ctd.j, ccg.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ctd.a));
      $$0.b(ctd.b);
      $$0.a(ctd.b);
      $$0.a(this.dU().af(), this.dU().ae());
   }

   @Override
   protected void j() {
      super.j();
      if (this.dU() instanceof arq) {
         this.g((arq)this.dU());
      }
   }

   public static byo.a gC() {
      return bxl.E().a(byp.v, 0.5);
   }

   public boolean gD() {
      return this.ch;
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("villagerBrain");
      this.eb().a($$0, this);
      $$1.c();
      if (this.ch) {
         this.ch = false;
      }

      if (!this.gt() && this.bV > 0) {
         this.bV--;
         if (this.bV <= 0) {
            if (this.bW) {
               this.gZ();
               this.bW = false;
            }

            this.a(new bvm(bvo.j, 200, 0));
         }
      }

      if (this.bX != null) {
         $$0.a(cii.e, this.bX, this);
         $$0.a(this, (byte)14);
         this.bX = null;
      }

      if (!this.gi() && this.ae.a(100) == 0) {
         csz $$2 = $$0.d(this.du());
         if ($$2 != null && $$2.r() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gB().b().a(cqy.b) && this.gt()) {
         this.gy();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.q() > 0) {
         this.r(this.q() - 1);
      }

      this.hb();
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if ($$2.a(czo.uR) || !this.bI() || this.gt() || this.fQ()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gO();
         return bug.a;
      } else {
         if (!this.dU().C) {
            boolean $$3 = this.gu().isEmpty();
            if ($$1 == buf.a) {
               if ($$3) {
                  this.gO();
               }

               $$0.a(awx.S);
            }

            if ($$3) {
               return bug.c;
            }

            this.g($$0);
         }

         return bug.a;
      }
   }

   private void gO() {
      this.r(40);
      if (!this.dU().w_()) {
         this.b(awn.Ca);
      }
   }

   private void g(crj $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.m_(), this.gB().c());
   }

   @Override
   public void a(@Nullable crj $$0) {
      boolean $$1 = this.x() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gy();
      }
   }

   @Override
   protected void gy() {
      super.gy();
      this.gP();
   }

   private void gP() {
      if (!this.dU().w_()) {
         for (dif $$0 : this.gu()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gE() {
      return true;
   }

   public void gF() {
      this.gU();

      for (dif $$0 : this.gu()) {
         $$0.j();
      }

      this.gQ();
      this.ce = this.dU().ae();
      this.cf++;
   }

   private void gQ() {
      dig $$0 = this.gu();
      crj $$1 = this.x();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bR.l, $$0, this.gB().c(), this.t(), this.gv(), this.gE());
      }
   }

   private boolean gR() {
      for (dif $$0 : this.gu()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gS() {
      return this.cf == 0 || this.cf < 2 && this.dU().ae() > this.ce + 2400L;
   }

   public boolean gG() {
      long $$0 = this.ce + 12000L;
      long $$1 = this.dU().ae();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dU().af();
      if (this.cg > 0L) {
         long $$4 = this.cg / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cg = $$3;
      if ($$2) {
         this.ce = $$1;
         this.hc();
      }

      return this.gS() && this.gR();
   }

   private void gT() {
      int $$0 = 2 - this.cf;
      if ($$0 > 0) {
         for (dif $$1 : this.gu()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gU();
      }

      this.gQ();
   }

   private void gU() {
      for (dif $$0 : this.gu()) {
         $$0.g();
      }
   }

   private void h(crj $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dif $$2 : this.gu()) {
            $$2.a(-azm.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bvo.F)) {
         bvm $$3 = $$0.c(bvo.F);
         int $$4 = $$3.e();

         for (dif $$5 : this.gu()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bN, gH());
   }

   public static cqw gH() {
      return new cqw(mg.w.b(cra.c), mg.x.b(cqy.b), 1);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("VillagerData", cqw.c, this.gB());
      $$0.a("FoodLevel", (byte)this.bZ);
      $$0.a("Gossips", cgh.a, this.ca);
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
      this.al.a(bN, $$0.<cqw>a("VillagerData", cqw.c).orElseGet(cqv::gH));
      if ($$0.b("FoodLevel", 1)) {
         this.bZ = $$0.d("FoodLevel");
      }

      this.ca.c();
      $$0.<cgh>a("Gossips", cgh.a).ifPresent(this.ca::a);
      if ($$0.b("Xp", 3)) {
         this.cd = $$0.f("Xp");
      }

      this.ce = $$0.g("LastRestock");
      this.cc = $$0.g("LastGossipDecay");
      if (this.dU() instanceof arq) {
         this.g((arq)this.dU());
      }

      this.cf = $$0.f("RestocksToday");
      if ($$0.c("AssignProfessionWhenSpawned")) {
         this.ch = $$0.o("AssignProfessionWhenSpawned");
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
         return this.gt() ? awn.Cb : awn.BW;
      }
   }

   @Override
   protected awm e(bux $$0) {
      return awn.BZ;
   }

   @Override
   protected awm l_() {
      return awn.BY;
   }

   public void gI() {
      this.b(this.gB().b().a().f());
   }

   @Override
   public void a(cqw $$0) {
      cqw $$1 = this.gB();
      if (!$$1.b().equals($$0.b())) {
         this.bH = null;
      }

      this.al.a(bN, $$0);
   }

   @Override
   public cqw gB() {
      return this.al.a(bN);
   }

   @Override
   protected void b(dif $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cd = this.cd + $$0.q();
      this.bX = this.x();
      if (this.gY()) {
         this.bV = 40;
         this.bW = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dU().b(new bww(this.dU(), this.dz(), this.dB() + 0.5, this.dF(), $$1));
      }
   }

   @Override
   public void a(@Nullable bxj $$0) {
      if ($$0 != null && this.dU() instanceof arq) {
         ((arq)this.dU()).a(cii.c, $$0, this);
         if (this.bI() && $$0 instanceof crj) {
            this.dU().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bux $$0) {
      bM.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bwi $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gV();
      super.a($$0);
   }

   private void gV() {
      this.a(cgl.b);
      this.a(cgl.c);
      this.a(cgl.d);
      this.a(cgl.e);
   }

   private void b(bwi $$0) {
      if (this.dU() instanceof arq $$1) {
         Optional<cgn> $$3 = this.bs.c(cgl.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bxy.class::isInstance).forEach($$2x -> $$1.a(cii.d, $$0, (bxy)$$2x));
         }
      }
   }

   public void a(cgl<je> $$0) {
      if (this.dU() instanceof arq) {
         MinecraftServer $$1 = ((arq)this.dU()).p();
         this.bs.c($$0).ifPresent($$2 -> {
            arq $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cil $$4 = $$3.A();
               Optional<jf<cio>> $$5 = $$4.c($$2.b());
               BiPredicate<cqv, jf<cio>> $$6 = bL.get($$0);
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
      return this.bZ + this.ha() >= 12 && !this.fQ() && this.g() == 0;
   }

   private boolean gW() {
      return this.bZ < 12;
   }

   private void gX() {
      if (this.gW() && this.ha() != 0) {
         for (int $$0 = 0; $$0 < this.n().b(); $$0++) {
            czk $$1 = this.n().a($$0);
            if (!$$1.f()) {
               Integer $$2 = bJ.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.bZ = this.bZ + $$2;
                     this.n().a($$0, 1);
                     if (!this.gW()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(crj $$0) {
      return this.ca.a($$0.cF(), $$0x -> true);
   }

   private void u(int $$0) {
      this.bZ -= $$0;
   }

   public void gJ() {
      this.gX();
      this.u(12);
   }

   public void b(dig $$0) {
      this.bH = $$0;
   }

   private boolean gY() {
      int $$0 = this.gB().c();
      return cqw.d($$0) && this.cd >= cqw.c($$0);
   }

   private void gZ() {
      this.a(this.gB().a(this.gB().c() + 1));
      this.gz();
   }

   @Override
   protected wy cy() {
      return this.gB().b().a().a();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(ly.S);
      } else if ($$0 == 13) {
         this.a(ly.a);
      } else if ($$0 == 14) {
         this.a(ly.Q);
      } else if ($$0 == 42) {
         this.a(ly.ap);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$2 == bwq.e) {
         this.a(this.gB().b($$0.F_(), cqy.b));
      }

      if ($$2 == bwq.n || $$2 == bwq.m || bwq.a($$2) || $$2 == bwq.o) {
         this.a(this.gB().a($$0.F_(), cra.a($$0.u(this.du()))));
      }

      if ($$2 == bwq.d) {
         this.ch = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cqv b(arq $$0, bvy $$1) {
      double $$2 = this.ae.j();
      jf<cra> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.F_().d(cra.a($$0.u(this.du())));
      } else if ($$2 < 0.75) {
         $$3 = this.gB().a();
      } else {
         $$3 = ((cqv)$$1).gB().a();
      }

      cqv $$6 = new cqv(bwr.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.du()), bwq.e, null);
      return $$6;
   }

   @Override
   public void a(arq $$0, bxi $$1) {
      if ($$0.an() != bud.a) {
         bM.info("Villager {} was struck by lightning {}.", this, $$1);
         cpb $$2 = this.a(bwr.bI, bwc.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.du()), bwq.i, null);
            $$1x.gb();
            this.gV();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(arq $$0, cno $$1) {
      cqt.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(arq $$0, czk $$1) {
      czg $$2 = $$1.h();
      return ($$1.a(axk.bO) || this.gB().b().a().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gK() {
      return this.ha() >= 24;
   }

   public boolean gL() {
      return this.ha() < 12;
   }

   private int ha() {
      bun $$0 = this.n();
      return bJ.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gM() {
      return this.n().a_($$0 -> $$0.a(axk.bN));
   }

   @Override
   protected void gz() {
      cqw $$0 = this.gB();
      alf<cqy> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<cqz.g[]> $$3;
         if (this.dU().K().b(cuv.b)) {
            Int2ObjectMap<cqz.g[]> $$2 = cqz.c.get($$1);
            $$3 = $$2 != null ? $$2 : cqz.a.get($$1);
         } else {
            $$3 = cqz.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            cqz.g[] $$5 = (cqz.g[])$$3.get($$0.c());
            if ($$5 != null) {
               dig $$6 = this.gu();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(arq $$0, cqv $$1, long $$2) {
      if (($$2 < this.cb || $$2 >= this.cb + 1200L) && ($$2 < $$1.cb || $$2 >= $$1.cb + 1200L)) {
         this.ca.a($$1.ca, this.ae, 10);
         this.cb = $$2;
         $$1.cb = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void hb() {
      long $$0 = this.dU().ae();
      if (this.cc == 0L) {
         this.cc = $$0;
      } else if ($$0 >= this.cc + 24000L) {
         this.ca.b();
         this.cc = $$0;
      }
   }

   public void a(arq $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fes $$3 = this.cQ().c(10.0, 10.0, 10.0);
         List<cqv> $$4 = $$0.a(cqv.class, $$3);
         List<cqv> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bah.a(bwr.ap, bwq.f, $$0, this.du(), 10, 8, 6, bah.a.a, false).isEmpty()) {
               $$4.forEach(chd::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dU().ae()) ? false : !this.bs.a(cgl.G);
   }

   @Override
   public void a(cii $$0, bwi $$1) {
      if ($$0 == cii.a) {
         this.ca.a($$1.cF(), cgi.d, 20);
         this.ca.a($$1.cF(), cgi.c, 25);
      } else if ($$0 == cii.e) {
         this.ca.a($$1.cF(), cgi.e, 2);
      } else if ($$0 == cii.c) {
         this.ca.a($$1.cF(), cgi.b, 25);
      } else if ($$0 == cii.d) {
         this.ca.a($$1.cF(), cgi.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cd;
   }

   public void t(int $$0) {
      this.cd = $$0;
   }

   private void hc() {
      this.gT();
      this.cf = 0;
   }

   public cgh gN() {
      return this.ca;
   }

   public void a(cgh $$0) {
      this.ca.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Override
   public void b(iv $$0) {
      super.b($$0);
      this.bs.a(cgl.I, this.dU().ae());
      this.bs.b(cgl.n);
      this.bs.b(cgl.F);
   }

   @Override
   public void fR() {
      super.fR();
      this.bs.a(cgl.J, this.dU().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bs.c(cgl.I);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.av ? c((kj<T>)$$0, this.gB().a()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.av) {
         jf<cra> $$2 = c(kk.av, $$1);
         this.a(this.gB().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
