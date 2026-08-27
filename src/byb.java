import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
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

public class byb extends bxw implements bgo, byd {
   private static final Logger bZ = LogUtils.getLogger();
   private static final aby<byc> ca = acb.a(byb.class, aca.t);
   public static final int bV = 12;
   public static final Map<cfu, Integer> bW = ImmutableMap.of(cgc.oJ, 4, cgc.tm, 1, cgc.tl, 1, cgc.uq, 1);
   private static final int cb = 2;
   private static final Set<cfu> cc = ImmutableSet.of(cgc.oJ, cgc.tm, cgc.tl, cgc.oI, cgc.oH, cgc.uq, new cfu[]{cgc.ur, cgc.uo, cgc.up});
   private static final int cd = 10;
   private static final int ce = 1200;
   private static final int cf = 24000;
   private static final int cg = 25;
   private static final int ch = 10;
   private static final int ci = 5;
   private static final long cj = 24000L;
   @VisibleForTesting
   public static final float bX = 0.5F;
   private int ck;
   private boolean cl;
   @Nullable
   private byo cm;
   private boolean cn;
   private int co;
   private final box cp = new box();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cv;
   private boolean cw;
   private static final ImmutableList<bpb<?>> cx = ImmutableList.of(
      bpb.b,
      bpb.c,
      bpb.d,
      bpb.e,
      bpb.g,
      bpb.h,
      bpb.i,
      bpb.j,
      bpb.k,
      bpb.l,
      bpb.K,
      bpb.aO,
      new bpb[]{bpb.m, bpb.n, bpb.q, bpb.r, bpb.t, bpb.v, bpb.w, bpb.x, bpb.y, bpb.A, bpb.f, bpb.C, bpb.D, bpb.E, bpb.G, bpb.H, bpb.I, bpb.F}
   );
   private static final ImmutableList<bqg<? extends bqf<? super byb>>> cy = ImmutableList.of(bqg.c, bqg.d, bqg.b, bqg.e, bqg.f, bqg.g, bqg.h, bqg.i, bqg.j);
   public static final Map<bpb<hd>, BiPredicate<byb, he<brc>>> bY = ImmutableMap.of(
      bpb.b,
      (BiPredicate<byb, he>)($$0, $$1) -> $$1.a(brd.n),
      bpb.c,
      (BiPredicate<byb, he>)($$0, $$1) -> $$0.gj().b().b().test($$1),
      bpb.d,
      (BiPredicate<byb, he>)($$0, $$1) -> bye.a.test($$1),
      bpb.e,
      (BiPredicate<byb, he>)($$0, $$1) -> $$1.a(brd.o)
   );

   public byb(bfn<? extends byb> $$0, cmm $$1) {
      this($$0, $$1, byg.c);
   }

   public byb(bfn<? extends byb> $$0, cmm $$1, byg $$2) {
      super($$0, $$1);
      ((bpi)this.J()).b(true);
      this.J().a(true);
      this.s(true);
      this.a(this.gj().a($$2).a(bye.b));
   }

   @Override
   public bha<byb> dK() {
      return (bha<byb>)super.dK();
   }

   @Override
   protected bha.b<byb> dL() {
      return bha.a(cx, cy);
   }

   @Override
   protected bha<?> a(Dynamic<?> $$0) {
      bha<byb> $$1 = this.dL().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aif $$0) {
      bha<byb> $$1 = this.dK();
      $$1.b($$0, this);
      this.bA = $$1.i();
      this.a(this.dK());
   }

   private void a(bha<byb> $$0) {
      bye $$1 = this.gj().b();
      if (this.h_()) {
         $$0.a(cab.e);
         $$0.a(bzz.d, bkw.a(0.5F));
      } else {
         $$0.a(cab.f);
         $$0.a(bzz.c, bkw.b($$1, 0.5F), ImmutableSet.of(Pair.of(bpb.c, bpc.a)));
      }

      $$0.a(bzz.a, bkw.a($$1, 0.5F));
      $$0.a(bzz.f, bkw.d($$1, 0.5F), ImmutableSet.of(Pair.of(bpb.e, bpc.a)));
      $$0.a(bzz.e, bkw.c($$1, 0.5F));
      $$0.a(bzz.b, bkw.e($$1, 0.5F));
      $$0.a(bzz.g, bkw.f($$1, 0.5F));
      $$0.a(bzz.i, bkw.g($$1, 0.5F));
      $$0.a(bzz.h, bkw.h($$1, 0.5F));
      $$0.a(bzz.j, bkw.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(bzz.a));
      $$0.b(bzz.b);
      $$0.a(bzz.b);
      $$0.a(this.dI().W(), this.dI().V());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dI() instanceof aif) {
         this.c((aif)this.dI());
      }
   }

   public static bhf.a gh() {
      return bgb.y().a(bhg.d, 0.5).a(bhg.b, 48.0);
   }

   public boolean gi() {
      return this.cw;
   }

   @Override
   protected void W() {
      this.dI().ad().a("villagerBrain");
      this.dK().a((aif)this.dI(), this);
      this.dI().ad().c();
      if (this.cw) {
         this.cw = false;
      }

      if (!this.fZ() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gF();
               this.cl = false;
            }

            this.b(new bfa(bfc.j, 200, 0));
         }
      }

      if (this.cm != null && this.dI() instanceof aif) {
         ((aif)this.dI()).a(bqw.e, this.cm, this);
         this.dI().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fQ() && this.af.a(100) == 0) {
         bzv $$0 = ((aif)this.dI()).c(this.di());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dI().a(this, (byte)42);
         }
      }

      if (this.gj().b() == bye.b && this.fZ()) {
         this.ge();
      }

      super.W();
   }

   @Override
   public void l() {
      super.l();
      if (this.q() > 0) {
         this.s(this.q() - 1);
      }

      this.gH();
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if ($$2.a(cgc.sR) || !this.bs() || this.fZ() || this.fy()) {
         return super.b($$0, $$1);
      } else if (this.h_()) {
         this.gu();
         return bdx.a(this.dI().B);
      } else {
         boolean $$3 = this.ga().isEmpty();
         if ($$1 == bdw.a) {
            if ($$3 && !this.dI().B) {
               this.gu();
            }

            $$0.a(amr.S);
         }

         if ($$3) {
            return bdx.a(this.dI().B);
         } else {
            if (!this.dI().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return bdx.a(this.dI().B);
         }
      }
   }

   private void gu() {
      this.s(40);
      if (!this.dI().r_()) {
         this.a(amh.yF, this.eR(), this.eS());
      }
   }

   private void h(byo $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.H_(), this.gj().c());
   }

   @Override
   public void f(@Nullable byo $$0) {
      boolean $$1 = this.fY() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.ge();
      }
   }

   @Override
   protected void ge() {
      super.ge();
      this.gv();
   }

   private void gv() {
      for (clk $$0 : this.ga()) {
         $$0.l();
      }
   }

   @Override
   public boolean gk() {
      return true;
   }

   @Override
   public boolean gg() {
      return this.dI().B;
   }

   public void gl() {
      this.gA();

      for (clk $$0 : this.ga()) {
         $$0.h();
      }

      this.gw();
      this.ct = this.dI().V();
      this.cu++;
   }

   private void gw() {
      cll $$0 = this.ga();
      byo $$1 = this.fY();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bR.j, $$0, this.gj().c(), this.r(), this.gb(), this.gk());
      }
   }

   private boolean gx() {
      for (clk $$0 : this.ga()) {
         if ($$0.r()) {
            return true;
         }
      }

      return false;
   }

   private boolean gy() {
      return this.cu == 0 || this.cu < 2 && this.dI().V() > this.ct + 2400L;
   }

   public boolean gm() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dI().V();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dI().W();
      if (this.cv > 0L) {
         long $$4 = this.cv / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cv = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gI();
      }

      return this.gy() && this.gx();
   }

   private void gz() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (clk $$1 : this.ga()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gA();
      }

      this.gw();
   }

   private void gA() {
      for (clk $$0 : this.ga()) {
         $$0.e();
      }
   }

   private void i(byo $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (clk $$2 : this.ga()) {
            $$2.a(-apa.d((float)$$1 * $$2.n()));
         }
      }

      if ($$0.a(bfc.F)) {
         bfa $$3 = $$0.b(bfc.F);
         int $$4 = $$3.e();

         for (clk $$5 : this.ga()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(ca, new byc(byg.c, bye.b, 1));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      byc.c.encodeStart(rc.a, this.gj()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(rc.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cw) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<byc> $$1 = byc.c.parse(new Dynamic(rc.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cll($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      qx $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(rc.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dI() instanceof aif) {
         this.c((aif)this.dI());
      }

      this.cu = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cw = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected amg s() {
      if (this.fy()) {
         return null;
      } else {
         return this.fZ() ? amh.yG : amh.yB;
      }
   }

   @Override
   protected amg d(ben $$0) {
      return amh.yE;
   }

   @Override
   protected amg g_() {
      return amh.yD;
   }

   public void gn() {
      amg $$0 = this.gj().b().f();
      if ($$0 != null) {
         this.a($$0, this.eR(), this.eS());
      }
   }

   @Override
   public void a(byc $$0) {
      byc $$1 = this.gj();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.am.b(ca, $$0);
   }

   @Override
   public byc gj() {
      return this.am.b(ca);
   }

   @Override
   protected void b(clk $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cs = this.cs + $$0.o();
      this.cm = this.fY();
      if (this.gE()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.s()) {
         this.dI().b(new bfp(this.dI(), this.dn(), this.dp() + 0.5, this.dt(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean go() {
      return this.cn;
   }

   @Override
   public void a(@Nullable bfz $$0) {
      if ($$0 != null && this.dI() instanceof aif) {
         ((aif)this.dI()).a(bqw.c, $$0, this);
         if (this.bs() && $$0 instanceof byo) {
            this.dI().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(ben $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bfj $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gB();
      super.a($$0);
   }

   private void gB() {
      this.a(bpb.b);
      this.a(bpb.c);
      this.a(bpb.d);
      this.a(bpb.e);
   }

   private void a(bfj $$0) {
      if (this.dI() instanceof aif $$1) {
         Optional<bpd> $$3 = this.bA.c(bpb.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bgo.class::isInstance).forEach($$2x -> $$1.a(bqw.d, $$0, (bgo)$$2x));
         }
      }
   }

   public void a(bpb<hd> $$0) {
      if (this.dI() instanceof aif) {
         MinecraftServer $$1 = ((aif)this.dI()).n();
         this.bA.c($$0).ifPresent($$2 -> {
            aif $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bqz $$4 = $$3.w();
               Optional<he<brc>> $$5 = $$4.c($$2.b());
               BiPredicate<byb, he<brc>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  za.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean P_() {
      return this.co + this.gG() >= 12 && !this.fy() && this.h() == 0;
   }

   private boolean gC() {
      return this.co < 12;
   }

   private void gD() {
      if (this.gC() && this.gG() != 0) {
         for (int $$0 = 0; $$0 < this.w().b(); $$0++) {
            cfz $$1 = this.w().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.w().a($$0, 1);
                     if (!this.gC()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(byo $$0) {
      return this.cp.a($$0.ct(), $$0x -> true);
   }

   private void v(int $$0) {
      this.co -= $$0;
   }

   public void gp() {
      this.gD();
      this.v(12);
   }

   public void b(cll $$0) {
      this.bU = $$0;
   }

   private boolean gE() {
      int $$0 = this.gj().c();
      return byc.d($$0) && this.cs >= byc.c($$0);
   }

   private void gF() {
      this.a(this.gj().a(this.gj().c() + 1));
      this.gf();
   }

   @Override
   protected sw cl() {
      return sw.c(this.ae().g() + "." + jb.A.b(this.gj().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(iv.M);
      } else if ($$0 == 13) {
         this.a(iv.b);
      } else if ($$0 == 14) {
         this.a(iv.K);
      } else if ($$0 == 42) {
         this.a(iv.ag);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      if ($$2 == bgd.e) {
         this.a(this.gj().a(bye.b));
      }

      if ($$2 == bgd.n || $$2 == bgd.m || $$2 == bgd.c || $$2 == bgd.o) {
         this.a(this.gj().a(byg.a($$0.s(this.di()))));
      }

      if ($$2 == bgd.d) {
         this.cw = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public byb b(aif $$0, bfe $$1) {
      double $$2 = this.af.j();
      byg $$3;
      if ($$2 < 0.5) {
         $$3 = byg.a($$0.s(this.di()));
      } else if ($$2 < 0.75) {
         $$3 = this.gj().a();
      } else {
         $$3 = ((byb)$$1).gj().a();
      }

      byb $$6 = new byb(bfn.bf, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.di()), bgd.e, null, null);
      return $$6;
   }

   @Override
   public void a(aif $$0, bfy $$1) {
      if ($$0.ai() != bdu.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         bws $$2 = bfn.bj.a((cmm)$$0);
         if ($$2 != null) {
            $$2.b(this.dn(), this.dp(), this.dt(), this.dy(), this.dA());
            $$2.a($$0, $$0.d_($$2.di()), bgd.i, null, null);
            $$2.t(this.fQ());
            if (this.aa()) {
               $$2.b(this.ab());
               $$2.n(this.cy());
            }

            $$2.fF();
            $$0.a_($$2);
            this.gB();
            this.ai();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(bvh $$0) {
      bxz.a(this, this, $$0);
   }

   @Override
   public boolean k(cfz $$0) {
      cfu $$1 = $$0.d();
      return (cc.contains($$1) || this.gj().b().d().contains($$1)) && this.w().b($$0);
   }

   public boolean gq() {
      return this.gG() >= 24;
   }

   public boolean gr() {
      return this.gG() < 12;
   }

   private int gG() {
      bee $$0 = this.w();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gs() {
      return this.w().a_($$0 -> $$0.a(ane.aU));
   }

   @Override
   protected void gf() {
      byc $$0 = this.gj();
      Int2ObjectMap<byf.f[]> $$1 = byf.a.get($$0.b());
      if ($$1 != null && !$$1.isEmpty()) {
         byf.f[] $$2 = (byf.f[])$$1.get($$0.c());
         if ($$2 != null) {
            cll $$3 = this.ga();
            this.a($$3, $$2, 2);
         }
      }
   }

   public void a(aif $$0, byb $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.af, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gH() {
      long $$0 = this.dI().V();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(aif $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         eed $$3 = this.cE().c(10.0, 10.0, 10.0);
         List<byb> $$4 = $$0.a(byb.class, $$3);
         List<byb> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (app.a(bfn.ac, bgd.f, $$0, this.di(), 10, 8, 6, app.a.a).isPresent()) {
               $$4.forEach(bps::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dI().V()) ? false : !this.bA.a(bpb.F);
   }

   @Override
   public void a(bqw $$0, bfj $$1) {
      if ($$0 == bqw.a) {
         this.cp.a($$1.ct(), boy.d, 20);
         this.cp.a($$1.ct(), boy.c, 25);
      } else if ($$0 == bqw.e) {
         this.cp.a($$1.ct(), boy.e, 2);
      } else if ($$0 == bqw.c) {
         this.cp.a($$1.ct(), boy.b, 25);
      } else if ($$0 == bqw.d) {
         this.cp.a($$1.ct(), boy.a, 25);
      }
   }

   @Override
   public int r() {
      return this.cs;
   }

   public void u(int $$0) {
      this.cs = $$0;
   }

   private void gI() {
      this.gz();
      this.cu = 0;
   }

   public box gt() {
      return this.cp;
   }

   public void a(rk $$0) {
      this.cp.a(new Dynamic(rc.a, $$0));
   }

   @Override
   protected void V() {
      super.V();
      za.a(this);
   }

   @Override
   public void b(gu $$0) {
      super.b($$0);
      this.bA.a(bpb.G, this.dI().V());
      this.bA.b(bpb.m);
      this.bA.b(bpb.E);
   }

   @Override
   public void fz() {
      super.fz();
      this.bA.a(bpb.H, this.dI().V());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bA.c(bpb.G);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
