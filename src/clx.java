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

public class clx extends cls implements btq, clz {
   private static final Logger cg = LogUtils.getLogger();
   private static final ajp<cly> ch = ajt.a(clx.class, ajr.u);
   public static final int cc = 12;
   public static final Map<ctx, Integer> cd = ImmutableMap.of(cuf.px, 4, cuf.ug, 1, cuf.uf, 1, cuf.vk, 1);
   private static final int ci = 2;
   private static final Set<ctx> cj = ImmutableSet.of(cuf.px, cuf.ug, cuf.uf, cuf.pw, cuf.pv, cuf.vk, new ctx[]{cuf.vl, cuf.vi, cuf.vj});
   private static final int ck = 10;
   private static final int cl = 1200;
   private static final int cm = 24000;
   private static final int cn = 25;
   private static final int co = 10;
   private static final int cp = 5;
   private static final long cq = 24000L;
   @VisibleForTesting
   public static final float ce = 0.5F;
   private int cr;
   private boolean cs;
   @Nullable
   private cmk ct;
   private boolean cu;
   private int cv;
   private final ccb cw = new ccb();
   private long cx;
   private long cy;
   private int cz;
   private long cB;
   private int cC;
   private long cD;
   private boolean cE;
   private static final ImmutableList<ccf<?>> cF = ImmutableList.of(
      ccf.b,
      ccf.c,
      ccf.d,
      ccf.e,
      ccf.g,
      ccf.h,
      ccf.i,
      ccf.j,
      ccf.k,
      ccf.l,
      ccf.L,
      ccf.aP,
      new ccf[]{ccf.m, ccf.n, ccf.q, ccf.r, ccf.t, ccf.v, ccf.w, ccf.x, ccf.y, ccf.A, ccf.f, ccf.C, ccf.D, ccf.E, ccf.H, ccf.I, ccf.J, ccf.F}
   );
   private static final ImmutableList<cdm<? extends cdl<? super clx>>> cG = ImmutableList.of(cdm.c, cdm.d, cdm.b, cdm.e, cdm.f, cdm.g, cdm.h, cdm.i, cdm.j);
   public static final Map<ccf<ji>, BiPredicate<clx, jj<cei>>> cf = ImmutableMap.of(
      ccf.b,
      (BiPredicate<clx, jj>)($$0, $$1) -> $$1.a(cej.n),
      ccf.c,
      (BiPredicate<clx, jj>)($$0, $$1) -> $$0.gz().b().b().test($$1),
      ccf.d,
      (BiPredicate<clx, jj>)($$0, $$1) -> cma.a.test($$1),
      ccf.e,
      (BiPredicate<clx, jj>)($$0, $$1) -> $$1.a(cej.o)
   );

   public clx(bsm<? extends clx> $$0, dcf $$1) {
      this($$0, $$1, cmc.c);
   }

   public clx(bsm<? extends clx> $$0, dcf $$1, cmc $$2) {
      super($$0, $$1);
      ((ccm)this.K()).b(true);
      this.K().a(true);
      this.a_(true);
      this.a(this.gz().a($$2).a(cma.b));
   }

   @Override
   public bud<clx> dU() {
      return (bud<clx>)super.dU();
   }

   @Override
   protected bud.b<clx> dV() {
      return bud.a(cF, cG);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      bud<clx> $$1 = this.dV().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aqm $$0) {
      bud<clx> $$1 = this.dU();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.dU());
   }

   private void a(bud<clx> $$0) {
      cma $$1 = this.gz().b();
      if (this.p_()) {
         $$0.a(cob.e);
         $$0.a(cnz.d, bya.a(0.5F));
      } else {
         $$0.a(cob.f);
         $$0.a(cnz.c, bya.b($$1, 0.5F), ImmutableSet.of(Pair.of(ccf.c, ccg.a)));
      }

      $$0.a(cnz.a, bya.a($$1, 0.5F));
      $$0.a(cnz.f, bya.d($$1, 0.5F), ImmutableSet.of(Pair.of(ccf.e, ccg.a)));
      $$0.a(cnz.e, bya.c($$1, 0.5F));
      $$0.a(cnz.b, bya.e($$1, 0.5F));
      $$0.a(cnz.g, bya.f($$1, 0.5F));
      $$0.a(cnz.i, bya.g($$1, 0.5F));
      $$0.a(cnz.h, bya.h($$1, 0.5F));
      $$0.a(cnz.j, bya.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cnz.a));
      $$0.b(cnz.b);
      $$0.a(cnz.b);
      $$0.a(this.dQ().aa(), this.dQ().Z());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dQ() instanceof aqm) {
         this.c((aqm)this.dQ());
      }
   }

   public static bui.a gx() {
      return btd.A().a(buj.v, 0.5).a(buj.m, 48.0);
   }

   public boolean gy() {
      return this.cE;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("villagerBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      if (this.cE) {
         this.cE = false;
      }

      if (!this.gp() && this.cr > 0) {
         this.cr--;
         if (this.cr <= 0) {
            if (this.cs) {
               this.gV();
               this.cs = false;
            }

            this.b(new bro(brq.j, 200, 0));
         }
      }

      if (this.ct != null && this.dQ() instanceof aqm) {
         ((aqm)this.dQ()).a(cec.e, this.ct, this);
         this.dQ().a(this, (byte)14);
         this.ct = null;
      }

      if (!this.gd() && this.ah.a(100) == 0) {
         cnv $$0 = ((aqm)this.dQ()).d(this.dq());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dQ().a(this, (byte)42);
         }
      }

      if (this.gz().b() == cma.b && this.gp()) {
         this.gu();
      }

      super.Z();
   }

   @Override
   public void l() {
      super.l();
      if (this.s() > 0) {
         this.s(this.s() - 1);
      }

      this.gX();
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.tJ) || !this.bE() || this.gp() || this.fI()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gK();
         return bqg.a(this.dQ().B);
      } else {
         if (!this.dQ().B) {
            boolean $$3 = this.gq().isEmpty();
            if ($$1 == bqf.a) {
               if ($$3) {
                  this.gK();
               }

               $$0.a(avr.S);
            }

            if ($$3) {
               return bqg.c;
            }

            this.h($$0);
         }

         return bqg.a(this.dQ().B);
      }
   }

   private void gK() {
      this.s(40);
      if (!this.dQ().x_()) {
         this.b(avh.AV);
      }
   }

   private void h(cmk $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gz().c());
   }

   @Override
   public void f(@Nullable cmk $$0) {
      boolean $$1 = this.go() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gu();
      }
   }

   @Override
   protected void gu() {
      super.gu();
      this.gL();
   }

   private void gL() {
      if (!this.dQ().x_()) {
         for (dbd $$0 : this.gq()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gA() {
      return true;
   }

   @Override
   public boolean gw() {
      return this.dQ().B;
   }

   public void gB() {
      this.gQ();

      for (dbd $$0 : this.gq()) {
         $$0.j();
      }

      this.gM();
      this.cB = this.dQ().Z();
      this.cC++;
   }

   private void gM() {
      dbe $$0 = this.gq();
      cmk $$1 = this.go();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.j, $$0, this.gz().c(), this.u(), this.gr(), this.gA());
      }
   }

   private boolean gN() {
      for (dbd $$0 : this.gq()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gO() {
      return this.cC == 0 || this.cC < 2 && this.dQ().Z() > this.cB + 2400L;
   }

   public boolean gC() {
      long $$0 = this.cB + 12000L;
      long $$1 = this.dQ().Z();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dQ().aa();
      if (this.cD > 0L) {
         long $$4 = this.cD / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cD = $$3;
      if ($$2) {
         this.cB = $$1;
         this.gY();
      }

      return this.gO() && this.gN();
   }

   private void gP() {
      int $$0 = 2 - this.cC;
      if ($$0 > 0) {
         for (dbd $$1 : this.gq()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gQ();
      }

      this.gM();
   }

   private void gQ() {
      for (dbd $$0 : this.gq()) {
         $$0.g();
      }
   }

   private void i(cmk $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dbd $$2 : this.gq()) {
            $$2.a(-ayg.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(brq.F)) {
         bro $$3 = $$0.c(brq.F);
         int $$4 = $$3.e();

         for (dbd $$5 : this.gq()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().H());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ch, new cly(cmc.c, cma.b, 1));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cly.c.encodeStart(ul.a, this.gz()).resultOrPartial(cg::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cv);
      $$0.a("Gossips", this.cw.a(ul.a));
      $$0.a("Xp", this.cz);
      $$0.a("LastRestock", this.cB);
      $$0.a("LastGossipDecay", this.cy);
      $$0.a("RestocksToday", this.cC);
      if (this.cE) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cly.c.parse(ul.a, $$0.c("VillagerData")).resultOrPartial(cg::error).ifPresent($$0x -> this.ao.a(ch, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cv = $$0.f("FoodLevel");
      }

      ud $$1 = $$0.c("Gossips", 10);
      this.cw.a(new Dynamic(ul.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cz = $$0.h("Xp");
      }

      this.cB = $$0.i("LastRestock");
      this.cy = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dQ() instanceof aqm) {
         this.c((aqm)this.dQ());
      }

      this.cC = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cE = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected avg v() {
      if (this.fI()) {
         return null;
      } else {
         return this.gp() ? avh.AW : avh.AR;
      }
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.AU;
   }

   @Override
   protected avg o_() {
      return avh.AT;
   }

   public void gD() {
      this.b(this.gz().b().f());
   }

   @Override
   public void a(cly $$0) {
      cly $$1 = this.gz();
      if ($$1.b() != $$0.b()) {
         this.cb = null;
      }

      this.ao.a(ch, $$0);
   }

   @Override
   public cly gz() {
      return this.ao.a(ch);
   }

   @Override
   protected void b(dbd $$0) {
      int $$1 = 3 + this.ah.a(4);
      this.cz = this.cz + $$0.q();
      this.ct = this.go();
      if (this.gU()) {
         this.cr = 40;
         this.cs = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dQ().b(new bsr(this.dQ(), this.dv(), this.dx() + 0.5, this.dB(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cu = $$0;
   }

   public boolean gE() {
      return this.cu;
   }

   @Override
   public void a(@Nullable btb $$0) {
      if ($$0 != null && this.dQ() instanceof aqm) {
         ((aqm)this.dQ()).a(cec.c, $$0, this);
         if (this.bE() && $$0 instanceof cmk) {
            this.dQ().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bqz $$0) {
      cg.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bsg $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gR();
      super.a($$0);
   }

   private void gR() {
      this.a(ccf.b);
      this.a(ccf.c);
      this.a(ccf.d);
      this.a(ccf.e);
   }

   private void b(bsg $$0) {
      if (this.dQ() instanceof aqm $$1) {
         Optional<cch> $$3 = this.bF.c(ccf.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(btq.class::isInstance).forEach($$2x -> $$1.a(cec.d, $$0, (btq)$$2x));
         }
      }
   }

   public void a(ccf<ji> $$0) {
      if (this.dQ() instanceof aqm) {
         MinecraftServer $$1 = ((aqm)this.dQ()).o();
         this.bF.c($$0).ifPresent($$2 -> {
            aqm $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cef $$4 = $$3.y();
               Optional<jj<cei>> $$5 = $$4.c($$2.b());
               BiPredicate<clx, jj<cei>> $$6 = cf.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  afy.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.cv + this.gW() >= 12 && !this.fI() && this.g() == 0;
   }

   private boolean gS() {
      return this.cv < 12;
   }

   private void gT() {
      if (this.gS() && this.gW() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cuc $$1 = this.y().a($$0);
            if (!$$1.e()) {
               Integer $$2 = cd.get($$1.g());
               if ($$2 != null) {
                  int $$3 = $$1.H();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cv = this.cv + $$2;
                     this.y().a($$0, 1);
                     if (!this.gS()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cmk $$0) {
      return this.cw.a($$0.cA(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cv -= $$0;
   }

   public void gF() {
      this.gT();
      this.v(12);
   }

   @Override
   public void b(dbe $$0) {
      this.cb = $$0;
   }

   private boolean gU() {
      int $$0 = this.gz().c();
      return cly.d($$0) && this.cz >= cly.c($$0);
   }

   private void gV() {
      this.a(this.gz().a(this.gz().c() + 1));
      this.gv();
   }

   @Override
   protected wu cs() {
      return wu.c(this.al().g() + "." + lq.x.b(this.gz().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lj.Q);
      } else if ($$0 == 13) {
         this.a(lj.a);
      } else if ($$0 == 14) {
         this.a(lj.O);
      } else if ($$0 == 42) {
         this.a(lj.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if ($$2 == btf.e) {
         this.a(this.gz().a(cma.b));
      }

      if ($$2 == btf.n || $$2 == btf.m || btf.a($$2) || $$2 == btf.o) {
         this.a(this.gz().a(cmc.a($$0.t(this.dq()))));
      }

      if ($$2 == btf.d) {
         this.cE = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public clx b(aqm $$0, bsa $$1) {
      double $$2 = this.ah.j();
      cmc $$3;
      if ($$2 < 0.5) {
         $$3 = cmc.a($$0.t(this.dq()));
      } else if ($$2 < 0.75) {
         $$3 = this.gz().a();
      } else {
         $$3 = ((clx)$$1).gz().a();
      }

      clx $$6 = new clx(bsm.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dq()), btf.e, null);
      return $$6;
   }

   @Override
   public void a(aqm $$0, bta $$1) {
      if ($$0.al() != bqd.a) {
         cg.info("Villager {} was struck by lightning {}.", this, $$1);
         ckg $$2 = bsm.bo.a((dcf)$$0);
         if ($$2 != null) {
            $$2.b(this.dv(), this.dx(), this.dB(), this.dG(), this.dI());
            $$2.a($$0, $$0.d_($$2.dq()), btf.i, null);
            $$2.t(this.gd());
            if (this.ah()) {
               $$2.b(this.ai());
               $$2.o(this.cF());
            }

            $$2.fR();
            $$0.a_($$2);
            this.gR();
            this.ap();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(ciu $$0) {
      clv.a(this, this, $$0);
   }

   @Override
   public boolean k(cuc $$0) {
      ctx $$1 = $$0.g();
      return (cj.contains($$1) || this.gz().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gG() {
      return this.gW() >= 24;
   }

   public boolean gH() {
      return this.gW() < 12;
   }

   private int gW() {
      bqp $$0 = this.y();
      return cd.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gI() {
      return this.y().a_($$0 -> $$0.a(awf.bx));
   }

   @Override
   protected void gv() {
      cly $$0 = this.gz();
      Int2ObjectMap<cmb.g[]> $$2;
      if (this.dQ().J().b(cpa.c)) {
         Int2ObjectMap<cmb.g[]> $$1 = cmb.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cmb.a.get($$0.b());
      } else {
         $$2 = cmb.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cmb.g[] $$4 = (cmb.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dbe $$5 = this.gq();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aqm $$0, clx $$1, long $$2) {
      if (($$2 < this.cx || $$2 >= this.cx + 1200L) && ($$2 < $$1.cx || $$2 >= $$1.cx + 1200L)) {
         this.cw.a($$1.cw, this.ah, 10);
         this.cx = $$2;
         $$1.cx = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gX() {
      long $$0 = this.dQ().Z();
      if (this.cy == 0L) {
         this.cy = $$0;
      } else if ($$0 >= this.cy + 24000L) {
         this.cw.b();
         this.cy = $$0;
      }
   }

   public void a(aqm $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ewa $$3 = this.cL().c(10.0, 10.0, 10.0);
         List<clx> $$4 = $$0.a(clx.class, $$3);
         List<clx> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!ayz.a(bsm.af, btf.f, $$0, this.dq(), 10, 8, 6, ayz.a.a).isEmpty()) {
               $$4.forEach(ccx::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dQ().Z()) ? false : !this.bF.a(ccf.F);
   }

   @Override
   public void a(cec $$0, bsg $$1) {
      if ($$0 == cec.a) {
         this.cw.a($$1.cA(), ccc.d, 20);
         this.cw.a($$1.cA(), ccc.c, 25);
      } else if ($$0 == cec.e) {
         this.cw.a($$1.cA(), ccc.e, 2);
      } else if ($$0 == cec.c) {
         this.cw.a($$1.cA(), ccc.b, 25);
      } else if ($$0 == cec.d) {
         this.cw.a($$1.cA(), ccc.a, 25);
      }
   }

   @Override
   public int u() {
      return this.cz;
   }

   public void u(int $$0) {
      this.cz = $$0;
   }

   private void gY() {
      this.gP();
      this.cC = 0;
   }

   public ccb gJ() {
      return this.cw;
   }

   public void a(uu $$0) {
      this.cw.a(new Dynamic(ul.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   public void b(ja $$0) {
      super.b($$0);
      this.bF.a(ccf.H, this.dQ().Z());
      this.bF.b(ccf.m);
      this.bF.b(ccf.E);
   }

   @Override
   public void fJ() {
      super.fJ();
      this.bF.a(ccf.I, this.dQ().Z());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(ccf.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
