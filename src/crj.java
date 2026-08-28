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

public class crj extends cre implements byj, crl {
   private static final Logger bO = LogUtils.getLogger();
   private static final akl<crk> bP = akp.a(crj.class, akn.u);
   public static final int bK = 12;
   public static final Map<czu, Integer> bL = ImmutableMap.of(dac.ql, 4, dac.vq, 1, dac.vp, 1, dac.wv, 1);
   private static final int bQ = 2;
   private static final int bR = 10;
   private static final int bS = 1200;
   private static final int bT = 24000;
   private static final int bU = 10;
   private static final int bV = 5;
   private static final long bW = 24000L;
   @VisibleForTesting
   public static final float bM = 0.5F;
   private static final int bX = 0;
   private static final byte bY = 0;
   private static final int bZ = 0;
   private static final int ca = 0;
   private static final int cb = 0;
   private static final boolean cc = false;
   private int cd;
   private boolean ce;
   @Nullable
   private crx cf;
   private boolean cg;
   private int ch = 0;
   private final cgs ci = new cgs();
   private long cj;
   private long ck = 0L;
   private int cl = 0;
   private long cm = 0L;
   private int cn = 0;
   private long cq;
   private boolean cr = false;
   private static final ImmutableList<cgw<?>> cs = ImmutableList.of(
      cgw.b,
      cgw.c,
      cgw.d,
      cgw.e,
      cgw.g,
      cgw.h,
      cgw.i,
      cgw.j,
      cgw.k,
      cgw.l,
      cgw.M,
      cgw.aQ,
      new cgw[]{cgw.n, cgw.o, cgw.r, cgw.s, cgw.u, cgw.w, cgw.x, cgw.y, cgw.z, cgw.B, cgw.f, cgw.D, cgw.E, cgw.F, cgw.I, cgw.J, cgw.K, cgw.G}
   );
   private static final ImmutableList<cid<? extends cic<? super crj>>> ct = ImmutableList.of(cid.c, cid.d, cid.b, cid.e, cid.f, cid.g, cid.h, cid.i, cid.j);
   public static final Map<cgw<je>, BiPredicate<crj, jf<ciz>>> bN = ImmutableMap.of(
      cgw.b,
      (BiPredicate<crj, jf>)($$0, $$1) -> $$1.a(cja.n),
      cgw.c,
      (BiPredicate<crj, jf>)($$0, $$1) -> $$0.gC().b().a().b().test($$1),
      cgw.d,
      (BiPredicate<crj, jf>)($$0, $$1) -> crm.a.test($$1),
      cgw.e,
      (BiPredicate<crj, jf>)($$0, $$1) -> $$1.a(cja.o)
   );

   public crj(bxc<? extends crj> $$0, djx $$1) {
      this($$0, $$1, cro.c);
   }

   public crj(bxc<? extends crj> $$0, djx $$1, alh<cro> $$2) {
      this($$0, $$1, $$1.J_().d($$2));
   }

   public crj(bxc<? extends crj> $$0, djx $$1, jf<cro> $$2) {
      super($$0, $$1);
      ((chd)this.O()).b(true);
      this.O().a(true);
      this.O().a(48.0F);
      this.a_(true);
      this.a(this.gC().a($$2).b($$1.J_(), crm.b));
   }

   @Override
   public byu<crj> ec() {
      return (byu<crj>)super.ec();
   }

   @Override
   protected byu.b<crj> ed() {
      return byu.a(cs, ct);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      byu<crj> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(ars $$0) {
      byu<crj> $$1 = this.ec();
      $$1.b($$0, this);
      this.bs = $$1.i();
      this.a(this.ec());
   }

   private void a(byu<crj> $$0) {
      jf<crm> $$1 = this.gC().b();
      if (this.n_()) {
         $$0.a(ctt.e);
         $$0.a(ctr.d, ccr.a(0.5F));
      } else {
         $$0.a(ctt.f);
         $$0.a(ctr.c, ccr.b($$1, 0.5F), ImmutableSet.of(Pair.of(cgw.c, cgx.a)));
      }

      $$0.a(ctr.a, ccr.a($$1, 0.5F));
      $$0.a(ctr.f, ccr.d($$1, 0.5F), ImmutableSet.of(Pair.of(cgw.e, cgx.a)));
      $$0.a(ctr.e, ccr.c($$1, 0.5F));
      $$0.a(ctr.b, ccr.e($$1, 0.5F));
      $$0.a(ctr.g, ccr.f($$1, 0.5F));
      $$0.a(ctr.i, ccr.g($$1, 0.5F));
      $$0.a(ctr.h, ccr.h($$1, 0.5F));
      $$0.a(ctr.j, ccr.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ctr.a));
      $$0.b(ctr.b);
      $$0.a(ctr.b);
      $$0.a(this.dV().af(), this.dV().ae());
   }

   @Override
   protected void j() {
      super.j();
      if (this.dV() instanceof ars) {
         this.g((ars)this.dV());
      }
   }

   public static byz.a gD() {
      return bxw.E().a(bza.v, 0.5);
   }

   public boolean gE() {
      return this.cr;
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("villagerBrain");
      this.ec().a($$0, this);
      $$1.c();
      if (this.cr) {
         this.cr = false;
      }

      if (!this.gu() && this.cd > 0) {
         this.cd--;
         if (this.cd <= 0) {
            if (this.ce) {
               this.ha();
               this.ce = false;
            }

            this.a(new bvx(bvz.j, 200, 0));
         }
      }

      if (this.cf != null) {
         $$0.a(cit.e, this.cf, this);
         $$0.a(this, (byte)14);
         this.cf = null;
      }

      if (!this.gj() && this.ae.a(100) == 0) {
         ctn $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.r() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gC().b().a(crm.b) && this.gu()) {
         this.gz();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.q() > 0) {
         this.r(this.q() - 1);
      }

      this.hc();
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.uR) || !this.bJ() || this.gu() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gP();
         return bur.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gv().isEmpty();
            if ($$1 == buq.a) {
               if ($$3) {
                  this.gP();
               }

               $$0.a(awz.S);
            }

            if ($$3) {
               return bur.c;
            }

            this.g($$0);
         }

         return bur.a;
      }
   }

   private void gP() {
      this.r(40);
      if (!this.dV().A_()) {
         this.b(awp.Ca);
      }
   }

   private void g(crx $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.m_(), this.gC().c());
   }

   @Override
   public void a(@Nullable crx $$0) {
      boolean $$1 = this.x() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gz();
      }
   }

   @Override
   protected void gz() {
      super.gz();
      this.gQ();
   }

   private void gQ() {
      if (!this.dV().A_()) {
         for (dit $$0 : this.gv()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gF() {
      return true;
   }

   public void gG() {
      this.gV();

      for (dit $$0 : this.gv()) {
         $$0.j();
      }

      this.gR();
      this.cm = this.dV().ae();
      this.cn++;
   }

   private void gR() {
      diu $$0 = this.gv();
      crx $$1 = this.x();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bR.l, $$0, this.gC().c(), this.t(), this.gw(), this.gF());
      }
   }

   private boolean gS() {
      for (dit $$0 : this.gv()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gT() {
      return this.cn == 0 || this.cn < 2 && this.dV().ae() > this.cm + 2400L;
   }

   public boolean gH() {
      long $$0 = this.cm + 12000L;
      long $$1 = this.dV().ae();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dV().af();
      if (this.cq > 0L) {
         long $$4 = this.cq / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cq = $$3;
      if ($$2) {
         this.cm = $$1;
         this.hd();
      }

      return this.gT() && this.gS();
   }

   private void gU() {
      int $$0 = 2 - this.cn;
      if ($$0 > 0) {
         for (dit $$1 : this.gv()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gV();
      }

      this.gR();
   }

   private void gV() {
      for (dit $$0 : this.gv()) {
         $$0.g();
      }
   }

   private void h(crx $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dit $$2 : this.gv()) {
            $$2.a(-azo.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bvz.F)) {
         bvx $$3 = $$0.c(bvz.F);
         int $$4 = $$3.e();

         for (dit $$5 : this.gv()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bP, gI());
   }

   public static crk gI() {
      return new crk(mg.w.b(cro.c), mg.x.b(crm.b), 1);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("VillagerData", crk.c, this.gC());
      $$0.a("FoodLevel", (byte)this.ch);
      $$0.a("Gossips", cgs.a, this.ci);
      $$0.a("Xp", this.cl);
      $$0.a("LastRestock", this.cm);
      $$0.a("LastGossipDecay", this.ck);
      $$0.a("RestocksToday", this.cn);
      if (this.cr) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.al.a(bP, $$0.<crk>a("VillagerData", crk.c).orElseGet(crj::gI));
      this.ch = $$0.b("FoodLevel", (byte)0);
      this.ci.c();
      $$0.<cgs>a("Gossips", cgs.a).ifPresent(this.ci::a);
      this.cl = $$0.b("Xp", 0);
      this.cm = $$0.b("LastRestock", 0L);
      this.ck = $$0.b("LastGossipDecay", 0L);
      if (this.dV() instanceof ars) {
         this.g((ars)this.dV());
      }

      this.cn = $$0.b("RestocksToday", 0);
      this.cr = $$0.b("AssignProfessionWhenSpawned", false);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected awo u() {
      if (this.fR()) {
         return null;
      } else {
         return this.gu() ? awp.Cb : awp.BW;
      }
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.BZ;
   }

   @Override
   protected awo l_() {
      return awp.BY;
   }

   public void gJ() {
      this.b(this.gC().b().a().f());
   }

   @Override
   public void a(crk $$0) {
      crk $$1 = this.gC();
      if (!$$1.b().equals($$0.b())) {
         this.bJ = null;
      }

      this.al.a(bP, $$0);
   }

   @Override
   public crk gC() {
      return this.al.a(bP);
   }

   @Override
   protected void b(dit $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cl = this.cl + $$0.q();
      this.cf = this.x();
      if (this.gZ()) {
         this.cd = 40;
         this.ce = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bxh(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bxu $$0) {
      if ($$0 != null && this.dV() instanceof ars) {
         ((ars)this.dV()).a(cit.c, $$0, this);
         if (this.bJ() && $$0 instanceof crx) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bvi $$0) {
      bO.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bwt $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gW();
      super.a($$0);
   }

   private void gW() {
      this.a(cgw.b);
      this.a(cgw.c);
      this.a(cgw.d);
      this.a(cgw.e);
   }

   private void b(bwt $$0) {
      if (this.dV() instanceof ars $$1) {
         Optional<cgy> $$3 = this.bs.c(cgw.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(byj.class::isInstance).forEach($$2x -> $$1.a(cit.d, $$0, (byj)$$2x));
         }
      }
   }

   public void a(cgw<je> $$0) {
      if (this.dV() instanceof ars) {
         MinecraftServer $$1 = ((ars)this.dV()).p();
         this.bs.c($$0).ifPresent($$2 -> {
            ars $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               ciw $$4 = $$3.A();
               Optional<jf<ciz>> $$5 = $$4.c($$2.b());
               BiPredicate<crj, jf<ciz>> $$6 = bN.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  ago.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.ch + this.hb() >= 12 && !this.fR() && this.g() == 0;
   }

   private boolean gX() {
      return this.ch < 12;
   }

   private void gY() {
      if (this.gX() && this.hb() != 0) {
         for (int $$0 = 0; $$0 < this.n().b(); $$0++) {
            czy $$1 = this.n().a($$0);
            if (!$$1.f()) {
               Integer $$2 = bL.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.ch = this.ch + $$2;
                     this.n().a($$0, 1);
                     if (!this.gX()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(crx $$0) {
      return this.ci.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.ch -= $$0;
   }

   public void gK() {
      this.gY();
      this.u(12);
   }

   public void b(diu $$0) {
      this.bJ = $$0;
   }

   private boolean gZ() {
      int $$0 = this.gC().c();
      return crk.d($$0) && this.cl >= crk.c($$0);
   }

   private void ha() {
      this.a(this.gC().a(this.gC().c() + 1));
      this.gA();
   }

   @Override
   protected xa cz() {
      return this.gC().b().a().a();
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
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$2 == bxb.e) {
         this.a(this.gC().b($$0.J_(), crm.b));
      }

      if ($$2 == bxb.n || $$2 == bxb.m || bxb.a($$2) || $$2 == bxb.o) {
         this.a(this.gC().a($$0.J_(), cro.a($$0.u(this.dv()))));
      }

      if ($$2 == bxb.d) {
         this.cr = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public crj b(ars $$0, bwj $$1) {
      double $$2 = this.ae.j();
      jf<cro> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.J_().d(cro.a($$0.u(this.dv())));
      } else if ($$2 < 0.75) {
         $$3 = this.gC().a();
      } else {
         $$3 = ((crj)$$1).gC().a();
      }

      crj $$6 = new crj(bxc.bE, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bxb.e, null);
      return $$6;
   }

   @Override
   public void a(ars $$0, bxt $$1) {
      if ($$0.an() != buo.a) {
         bO.info("Villager {} was struck by lightning {}.", this, $$1);
         cpp $$2 = this.a(bxc.bJ, bwn.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bxb.i, null);
            $$1x.gc();
            this.gW();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ars $$0, coc $$1) {
      crh.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(ars $$0, czy $$1) {
      czu $$2 = $$1.h();
      return ($$1.a(axm.bO) || this.gC().b().a().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gL() {
      return this.hb() >= 24;
   }

   public boolean gM() {
      return this.hb() < 12;
   }

   private int hb() {
      buy $$0 = this.n();
      return bL.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gN() {
      return this.n().a_($$0 -> $$0.a(axm.bN));
   }

   @Override
   protected void gA() {
      crk $$0 = this.gC();
      alh<crm> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<crn.g[]> $$3;
         if (this.dV().K().b(cvj.b)) {
            Int2ObjectMap<crn.g[]> $$2 = crn.c.get($$1);
            $$3 = $$2 != null ? $$2 : crn.a.get($$1);
         } else {
            $$3 = crn.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            crn.g[] $$5 = (crn.g[])$$3.get($$0.c());
            if ($$5 != null) {
               diu $$6 = this.gv();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(ars $$0, crj $$1, long $$2) {
      if (($$2 < this.cj || $$2 >= this.cj + 1200L) && ($$2 < $$1.cj || $$2 >= $$1.cj + 1200L)) {
         this.ci.a($$1.ci, this.ae, 10);
         this.cj = $$2;
         $$1.cj = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void hc() {
      long $$0 = this.dV().ae();
      if (this.ck == 0L) {
         this.ck = $$0;
      } else if ($$0 >= this.ck + 24000L) {
         this.ci.b();
         this.ck = $$0;
      }
   }

   public void a(ars $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ffl $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<crj> $$4 = $$0.a(crj.class, $$3);
         List<crj> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!baj.a(bxc.aq, bxb.f, $$0, this.dv(), 10, 8, 6, baj.a.a, false).isEmpty()) {
               $$4.forEach(cho::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ae()) ? false : !this.bs.a(cgw.G);
   }

   @Override
   public void a(cit $$0, bwt $$1) {
      if ($$0 == cit.a) {
         this.ci.a($$1.cG(), cgt.d, 20);
         this.ci.a($$1.cG(), cgt.c, 25);
      } else if ($$0 == cit.e) {
         this.ci.a($$1.cG(), cgt.e, 2);
      } else if ($$0 == cit.c) {
         this.ci.a($$1.cG(), cgt.b, 25);
      } else if ($$0 == cit.d) {
         this.ci.a($$1.cG(), cgt.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cl;
   }

   public void t(int $$0) {
      this.cl = $$0;
   }

   private void hd() {
      this.gU();
      this.cn = 0;
   }

   public cgs gO() {
      return this.ci;
   }

   public void a(cgs $$0) {
      this.ci.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   public void b(iv $$0) {
      super.b($$0);
      this.bs.a(cgw.I, this.dV().ae());
      this.bs.b(cgw.n);
      this.bs.b(cgw.F);
   }

   @Override
   public void fS() {
      super.fS();
      this.bs.a(cgw.J, this.dV().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bs.c(cgw.I);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.av ? c((kj<T>)$$0, this.gC().a()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.av) {
         jf<cro> $$2 = c(kk.av, $$1);
         this.a(this.gC().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
