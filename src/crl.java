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

public class crl extends crg implements byl, crn {
   private static final Logger bO = LogUtils.getLogger();
   private static final akn<crm> bP = akr.a(crl.class, akp.u);
   public static final int bK = 12;
   public static final Map<czw, Integer> bL = ImmutableMap.of(dae.ql, 4, dae.vq, 1, dae.vp, 1, dae.wv, 1);
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
   private crz cf;
   private boolean cg;
   private int ch = 0;
   private final cgu ci = new cgu();
   private long cj;
   private long ck = 0L;
   private int cl = 0;
   private long cm = 0L;
   private int cn = 0;
   private long cq;
   private boolean cr = false;
   private static final ImmutableList<cgy<?>> cs = ImmutableList.of(
      cgy.b,
      cgy.c,
      cgy.d,
      cgy.e,
      cgy.g,
      cgy.h,
      cgy.i,
      cgy.j,
      cgy.k,
      cgy.l,
      cgy.M,
      cgy.aQ,
      new cgy[]{cgy.n, cgy.o, cgy.r, cgy.s, cgy.u, cgy.w, cgy.x, cgy.y, cgy.z, cgy.B, cgy.f, cgy.D, cgy.E, cgy.F, cgy.I, cgy.J, cgy.K, cgy.G}
   );
   private static final ImmutableList<cif<? extends cie<? super crl>>> ct = ImmutableList.of(cif.c, cif.d, cif.b, cif.e, cif.f, cif.g, cif.h, cif.i, cif.j);
   public static final Map<cgy<jf>, BiPredicate<crl, jg<cjb>>> bN = ImmutableMap.of(
      cgy.b,
      (BiPredicate<crl, jg>)($$0, $$1) -> $$1.a(cjc.n),
      cgy.c,
      (BiPredicate<crl, jg>)($$0, $$1) -> $$0.gC().b().a().b().test($$1),
      cgy.d,
      (BiPredicate<crl, jg>)($$0, $$1) -> cro.a.test($$1),
      cgy.e,
      (BiPredicate<crl, jg>)($$0, $$1) -> $$1.a(cjc.o)
   );

   public crl(bxe<? extends crl> $$0, djz $$1) {
      this($$0, $$1, crq.c);
   }

   public crl(bxe<? extends crl> $$0, djz $$1, alj<crq> $$2) {
      this($$0, $$1, $$1.J_().d($$2));
   }

   public crl(bxe<? extends crl> $$0, djz $$1, jg<crq> $$2) {
      super($$0, $$1);
      ((chf)this.O()).b(true);
      this.O().a(true);
      this.O().a(48.0F);
      this.a_(true);
      this.a(this.gC().a($$2).b($$1.J_(), cro.b));
   }

   @Override
   public byw<crl> ec() {
      return (byw<crl>)super.ec();
   }

   @Override
   protected byw.b<crl> ed() {
      return byw.a(cs, ct);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      byw<crl> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(aru $$0) {
      byw<crl> $$1 = this.ec();
      $$1.b($$0, this);
      this.bs = $$1.i();
      this.a(this.ec());
   }

   private void a(byw<crl> $$0) {
      jg<cro> $$1 = this.gC().b();
      if (this.n_()) {
         $$0.a(ctv.e);
         $$0.a(ctt.d, cct.a(0.5F));
      } else {
         $$0.a(ctv.f);
         $$0.a(ctt.c, cct.b($$1, 0.5F), ImmutableSet.of(Pair.of(cgy.c, cgz.a)));
      }

      $$0.a(ctt.a, cct.a($$1, 0.5F));
      $$0.a(ctt.f, cct.d($$1, 0.5F), ImmutableSet.of(Pair.of(cgy.e, cgz.a)));
      $$0.a(ctt.e, cct.c($$1, 0.5F));
      $$0.a(ctt.b, cct.e($$1, 0.5F));
      $$0.a(ctt.g, cct.f($$1, 0.5F));
      $$0.a(ctt.i, cct.g($$1, 0.5F));
      $$0.a(ctt.h, cct.h($$1, 0.5F));
      $$0.a(ctt.j, cct.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ctt.a));
      $$0.b(ctt.b);
      $$0.a(ctt.b);
      $$0.a(this.dV().af(), this.dV().ae());
   }

   @Override
   protected void j() {
      super.j();
      if (this.dV() instanceof aru) {
         this.g((aru)this.dV());
      }
   }

   public static bzb.a gD() {
      return bxy.E().a(bzc.v, 0.5);
   }

   public boolean gE() {
      return this.cr;
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
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

            this.a(new bvz(bwb.j, 200, 0));
         }
      }

      if (this.cf != null) {
         $$0.a(civ.e, this.cf, this);
         $$0.a(this, (byte)14);
         this.cf = null;
      }

      if (!this.gj() && this.ae.a(100) == 0) {
         ctp $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.r() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gC().b().a(cro.b) && this.gu()) {
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
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.uR) || !this.bJ() || this.gu() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.n_()) {
         this.gP();
         return but.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gv().isEmpty();
            if ($$1 == bus.a) {
               if ($$3) {
                  this.gP();
               }

               $$0.a(axb.S);
            }

            if ($$3) {
               return but.c;
            }

            this.g($$0);
         }

         return but.a;
      }
   }

   private void gP() {
      this.r(40);
      if (!this.dV().A_()) {
         this.b(awr.Ca);
      }
   }

   private void g(crz $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.m_(), this.gC().c());
   }

   @Override
   public void a(@Nullable crz $$0) {
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
         for (div $$0 : this.gv()) {
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

      for (div $$0 : this.gv()) {
         $$0.j();
      }

      this.gR();
      this.cm = this.dV().ae();
      this.cn++;
   }

   private void gR() {
      diw $$0 = this.gv();
      crz $$1 = this.x();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bR.l, $$0, this.gC().c(), this.t(), this.gw(), this.gF());
      }
   }

   private boolean gS() {
      for (div $$0 : this.gv()) {
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
         for (div $$1 : this.gv()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gV();
      }

      this.gR();
   }

   private void gV() {
      for (div $$0 : this.gv()) {
         $$0.g();
      }
   }

   private void h(crz $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (div $$2 : this.gv()) {
            $$2.a(-azq.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bwb.F)) {
         bvz $$3 = $$0.c(bwb.F);
         int $$4 = $$3.e();

         for (div $$5 : this.gv()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bP, gI());
   }

   public static crm gI() {
      return new crm(mh.w.b(crq.c), mh.x.b(cro.b), 1);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("VillagerData", crm.c, this.gC());
      $$0.a("FoodLevel", (byte)this.ch);
      $$0.a("Gossips", cgu.a, this.ci);
      $$0.a("Xp", this.cl);
      $$0.a("LastRestock", this.cm);
      $$0.a("LastGossipDecay", this.ck);
      $$0.a("RestocksToday", this.cn);
      if (this.cr) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.al.a(bP, $$0.<crm>a("VillagerData", crm.c).orElseGet(crl::gI));
      this.ch = $$0.b("FoodLevel", (byte)0);
      this.ci.c();
      $$0.<cgu>a("Gossips", cgu.a).ifPresent(this.ci::a);
      this.cl = $$0.b("Xp", 0);
      this.cm = $$0.b("LastRestock", 0L);
      this.ck = $$0.b("LastGossipDecay", 0L);
      if (this.dV() instanceof aru) {
         this.g((aru)this.dV());
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
   protected awq u() {
      if (this.fR()) {
         return null;
      } else {
         return this.gu() ? awr.Cb : awr.BW;
      }
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.BZ;
   }

   @Override
   protected awq l_() {
      return awr.BY;
   }

   public void gJ() {
      this.b(this.gC().b().a().f());
   }

   @Override
   public void a(crm $$0) {
      crm $$1 = this.gC();
      if (!$$1.b().equals($$0.b())) {
         this.bJ = null;
      }

      this.al.a(bP, $$0);
   }

   @Override
   public crm gC() {
      return this.al.a(bP);
   }

   @Override
   protected void b(div $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cl = this.cl + $$0.q();
      this.cf = this.x();
      if (this.gZ()) {
         this.cd = 40;
         this.ce = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bxj(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bxw $$0) {
      if ($$0 != null && this.dV() instanceof aru) {
         ((aru)this.dV()).a(civ.c, $$0, this);
         if (this.bJ() && $$0 instanceof crz) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bvk $$0) {
      bO.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bwv $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gW();
      super.a($$0);
   }

   private void gW() {
      this.a(cgy.b);
      this.a(cgy.c);
      this.a(cgy.d);
      this.a(cgy.e);
   }

   private void b(bwv $$0) {
      if (this.dV() instanceof aru $$1) {
         Optional<cha> $$3 = this.bs.c(cgy.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(byl.class::isInstance).forEach($$2x -> $$1.a(civ.d, $$0, (byl)$$2x));
         }
      }
   }

   public void a(cgy<jf> $$0) {
      if (this.dV() instanceof aru) {
         MinecraftServer $$1 = ((aru)this.dV()).p();
         this.bs.c($$0).ifPresent($$2 -> {
            aru $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               ciy $$4 = $$3.A();
               Optional<jg<cjb>> $$5 = $$4.c($$2.b());
               BiPredicate<crl, jg<cjb>> $$6 = bN.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agq.c($$3, $$2.b());
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
            daa $$1 = this.n().a($$0);
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

   public int f(crz $$0) {
      return this.ci.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.ch -= $$0;
   }

   public void gK() {
      this.gY();
      this.u(12);
   }

   public void b(diw $$0) {
      this.bJ = $$0;
   }

   private boolean gZ() {
      int $$0 = this.gC().c();
      return crm.d($$0) && this.cl >= crm.c($$0);
   }

   private void ha() {
      this.a(this.gC().a(this.gC().c() + 1));
      this.gA();
   }

   @Override
   protected xc cz() {
      return this.gC().b().a().a();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lz.S);
      } else if ($$0 == 13) {
         this.a(lz.a);
      } else if ($$0 == 14) {
         this.a(lz.Q);
      } else if ($$0 == 42) {
         this.a(lz.ap);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      if ($$2 == bxd.e) {
         this.a(this.gC().b($$0.J_(), cro.b));
      }

      if ($$2 == bxd.n || $$2 == bxd.m || bxd.a($$2) || $$2 == bxd.o) {
         this.a(this.gC().a($$0.J_(), crq.a($$0.u(this.dv()))));
      }

      if ($$2 == bxd.d) {
         this.cr = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public crl b(aru $$0, bwl $$1) {
      double $$2 = this.ae.j();
      jg<crq> $$3;
      if ($$2 < 0.5) {
         $$3 = $$0.J_().d(crq.a($$0.u(this.dv())));
      } else if ($$2 < 0.75) {
         $$3 = this.gC().a();
      } else {
         $$3 = ((crl)$$1).gC().a();
      }

      crl $$6 = new crl(bxe.bE, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bxd.e, null);
      return $$6;
   }

   @Override
   public void a(aru $$0, bxv $$1) {
      if ($$0.an() != buq.a) {
         bO.info("Villager {} was struck by lightning {}.", this, $$1);
         cpr $$2 = this.a(bxe.bJ, bwp.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bxd.i, null);
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
   protected void a(aru $$0, coe $$1) {
      crj.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(aru $$0, daa $$1) {
      czw $$2 = $$1.h();
      return ($$1.a(axo.bP) || this.gC().b().a().d().contains($$2)) && this.n().c($$1);
   }

   public boolean gL() {
      return this.hb() >= 24;
   }

   public boolean gM() {
      return this.hb() < 12;
   }

   private int hb() {
      bva $$0 = this.n();
      return bL.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gN() {
      return this.n().a_($$0 -> $$0.a(axo.bO));
   }

   @Override
   protected void gA() {
      crm $$0 = this.gC();
      alj<cro> $$1 = $$0.b().e().orElse(null);
      if ($$1 != null) {
         Int2ObjectMap<crp.g[]> $$3;
         if (this.dV().K().b(cvl.b)) {
            Int2ObjectMap<crp.g[]> $$2 = crp.c.get($$1);
            $$3 = $$2 != null ? $$2 : crp.a.get($$1);
         } else {
            $$3 = crp.a.get($$1);
         }

         if ($$3 != null && !$$3.isEmpty()) {
            crp.g[] $$5 = (crp.g[])$$3.get($$0.c());
            if ($$5 != null) {
               diw $$6 = this.gv();
               this.a($$6, $$5, 2);
            }
         }
      }
   }

   public void a(aru $$0, crl $$1, long $$2) {
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

   public void a(aru $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ffn $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<crl> $$4 = $$0.a(crl.class, $$3);
         List<crl> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bal.a(bxe.aq, bxd.f, $$0, this.dv(), 10, 8, 6, bal.a.a, false).isEmpty()) {
               $$4.forEach(chq::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ae()) ? false : !this.bs.a(cgy.G);
   }

   @Override
   public void a(civ $$0, bwv $$1) {
      if ($$0 == civ.a) {
         this.ci.a($$1.cG(), cgv.d, 20);
         this.ci.a($$1.cG(), cgv.c, 25);
      } else if ($$0 == civ.e) {
         this.ci.a($$1.cG(), cgv.e, 2);
      } else if ($$0 == civ.c) {
         this.ci.a($$1.cG(), cgv.b, 25);
      } else if ($$0 == civ.d) {
         this.ci.a($$1.cG(), cgv.a, 25);
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

   public cgu gO() {
      return this.ci;
   }

   public void a(cgu $$0) {
      this.ci.a($$0);
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Override
   public void b(iw $$0) {
      super.b($$0);
      this.bs.a(cgy.I, this.dV().ae());
      this.bs.b(cgy.n);
      this.bs.b(cgy.F);
   }

   @Override
   public void fS() {
      super.fS();
      this.bs.a(cgy.J, this.dV().ae());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bs.c(cgy.I);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.av ? c((kk<T>)$$0, this.gC().a()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.av) {
         jg<crq> $$2 = c(kl.av, $$1);
         this.a(this.gC().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
