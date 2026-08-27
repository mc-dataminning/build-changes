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

public class cif extends cia implements bqc, cih {
   private static final Logger cd = LogUtils.getLogger();
   private static final aim<cig> ce = aiq.a(cif.class, aio.t);
   public static final int bZ = 12;
   public static final Map<cqf, Integer> ca = ImmutableMap.of(cqn.pw, 4, cqn.ud, 1, cqn.uc, 1, cqn.vh, 1);
   private static final int cf = 2;
   private static final Set<cqf> cg = ImmutableSet.of(cqn.pw, cqn.ud, cqn.uc, cqn.pv, cqn.pu, cqn.vh, new cqf[]{cqn.vi, cqn.vf, cqn.vg});
   private static final int ch = 10;
   private static final int ci = 1200;
   private static final int cj = 24000;
   private static final int ck = 25;
   private static final int cl = 10;
   private static final int cm = 5;
   private static final long cn = 24000L;
   @VisibleForTesting
   public static final float cb = 0.5F;
   private int co;
   private boolean cp;
   @Nullable
   private cis cq;
   private boolean cr;
   private int cs;
   private final byn ct = new byn();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cz;
   private long cA;
   private boolean cB;
   private static final ImmutableList<byr<?>> cC = ImmutableList.of(
      byr.b,
      byr.c,
      byr.d,
      byr.e,
      byr.g,
      byr.h,
      byr.i,
      byr.j,
      byr.k,
      byr.l,
      byr.L,
      byr.aP,
      new byr[]{byr.m, byr.n, byr.q, byr.r, byr.t, byr.v, byr.w, byr.x, byr.y, byr.A, byr.f, byr.C, byr.D, byr.E, byr.H, byr.I, byr.J, byr.F}
   );
   private static final ImmutableList<bzy<? extends bzx<? super cif>>> cD = ImmutableList.of(bzy.c, bzy.d, bzy.b, bzy.e, bzy.f, bzy.g, bzy.h, bzy.i, bzy.j);
   public static final Map<byr<ik>, BiPredicate<cif, il<cau>>> cc = ImmutableMap.of(
      byr.b,
      (BiPredicate<cif, il>)($$0, $$1) -> $$1.a(cav.n),
      byr.c,
      (BiPredicate<cif, il>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      byr.d,
      (BiPredicate<cif, il>)($$0, $$1) -> cii.a.test($$1),
      byr.e,
      (BiPredicate<cif, il>)($$0, $$1) -> $$1.a(cav.o)
   );

   public cif(bpc<? extends cif> $$0, cwz $$1) {
      this($$0, $$1, cik.c);
   }

   public cif(bpc<? extends cif> $$0, cwz $$1, cik $$2) {
      super($$0, $$1);
      ((byy)this.K()).b(true);
      this.K().a(true);
      this.s(true);
      this.a(this.gy().a($$2).a(cii.b));
   }

   @Override
   public bqp<cif> dP() {
      return (bqp<cif>)super.dP();
   }

   @Override
   protected bqp.b<cif> dQ() {
      return bqp.a(cC, cD);
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      bqp<cif> $$1 = this.dQ().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(apf $$0) {
      bqp<cif> $$1 = this.dP();
      $$1.b($$0, this);
      this.bC = $$1.i();
      this.a(this.dP());
   }

   private void a(bqp<cif> $$0) {
      cii $$1 = this.gy().b();
      if (this.o_()) {
         $$0.a(ckj.e);
         $$0.a(ckh.d, bum.a(0.5F));
      } else {
         $$0.a(ckj.f);
         $$0.a(ckh.c, bum.b($$1, 0.5F), ImmutableSet.of(Pair.of(byr.c, bys.a)));
      }

      $$0.a(ckh.a, bum.a($$1, 0.5F));
      $$0.a(ckh.f, bum.d($$1, 0.5F), ImmutableSet.of(Pair.of(byr.e, bys.a)));
      $$0.a(ckh.e, bum.c($$1, 0.5F));
      $$0.a(ckh.b, bum.e($$1, 0.5F));
      $$0.a(ckh.g, bum.f($$1, 0.5F));
      $$0.a(ckh.i, bum.g($$1, 0.5F));
      $$0.a(ckh.h, bum.h($$1, 0.5F));
      $$0.a(ckh.j, bum.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ckh.a));
      $$0.b(ckh.b);
      $$0.a(ckh.b);
      $$0.a(this.dM().Y(), this.dM().X());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dM() instanceof apf) {
         this.c((apf)this.dM());
      }
   }

   public static bqu.a gw() {
      return bpq.A().a(bqv.r, 0.5).a(bqv.k, 48.0);
   }

   public boolean gx() {
      return this.cB;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("villagerBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      if (this.cB) {
         this.cB = false;
      }

      if (!this.go() && this.co > 0) {
         this.co--;
         if (this.co <= 0) {
            if (this.cp) {
               this.gU();
               this.cp = false;
            }

            this.b(new boj(bol.j, 200, 0));
         }
      }

      if (this.cq != null && this.dM() instanceof apf) {
         ((apf)this.dM()).a(cao.e, this.cq, this);
         this.dM().a(this, (byte)14);
         this.cq = null;
      }

      if (!this.gd() && this.ag.a(100) == 0) {
         ckd $$0 = ((apf)this.dM()).d(this.dm());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gy().b() == cii.b && this.go()) {
         this.gt();
      }

      super.Y();
   }

   @Override
   public void l() {
      super.l();
      if (this.r() > 0) {
         this.t(this.r() - 1);
      }

      this.gW();
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if ($$2.a(cqn.tH) || !this.bA() || this.go() || this.fI()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gJ();
         return bnc.a(this.dM().B);
      } else {
         boolean $$3 = this.gp().isEmpty();
         if ($$1 == bnb.a) {
            if ($$3 && !this.dM().B) {
               this.gJ();
            }

            $$0.a(aui.S);
         }

         if ($$3) {
            return bnc.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bY.isEmpty()) {
               this.h($$0);
            }

            return bnc.a(this.dM().B);
         }
      }
   }

   private void gJ() {
      this.t(40);
      if (!this.dM().x_()) {
         this.b(aty.Ar);
      }
   }

   private void h(cis $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gy().c());
   }

   @Override
   public void f(@Nullable cis $$0) {
      boolean $$1 = this.gn() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gt();
      }
   }

   @Override
   protected void gt() {
      super.gt();
      this.gK();
   }

   private void gK() {
      for (cvx $$0 : this.gp()) {
         $$0.m();
      }
   }

   @Override
   public boolean gz() {
      return true;
   }

   @Override
   public boolean gv() {
      return this.dM().B;
   }

   public void gA() {
      this.gP();

      for (cvx $$0 : this.gp()) {
         $$0.h();
      }

      this.gL();
      this.cx = this.dM().X();
      this.cz++;
   }

   private void gL() {
      cvy $$0 = this.gp();
      cis $$1 = this.gn();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bZ.j, $$0, this.gy().c(), this.s(), this.gq(), this.gz());
      }
   }

   private boolean gM() {
      for (cvx $$0 : this.gp()) {
         if ($$0.s()) {
            return true;
         }
      }

      return false;
   }

   private boolean gN() {
      return this.cz == 0 || this.cz < 2 && this.dM().X() > this.cx + 2400L;
   }

   public boolean gB() {
      long $$0 = this.cx + 12000L;
      long $$1 = this.dM().X();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dM().Y();
      if (this.cA > 0L) {
         long $$4 = this.cA / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cA = $$3;
      if ($$2) {
         this.cx = $$1;
         this.gX();
      }

      return this.gN() && this.gM();
   }

   private void gO() {
      int $$0 = 2 - this.cz;
      if ($$0 > 0) {
         for (cvx $$1 : this.gp()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (cvx $$0 : this.gp()) {
         $$0.e();
      }
   }

   private void i(cis $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cvx $$2 : this.gp()) {
            $$2.a(-aww.d((float)$$1 * $$2.o()));
         }
      }

      if ($$0.a(bol.F)) {
         boj $$3 = $$0.c(bol.F);
         int $$4 = $$3.d();

         for (cvx $$5 : this.gp()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ce, new cig(cik.c, cii.b, 1));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      cig.c.encodeStart(to.a, this.gy()).resultOrPartial(cd::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cs);
      $$0.a("Gossips", this.ct.a(to.a));
      $$0.a("Xp", this.cw);
      $$0.a("LastRestock", this.cx);
      $$0.a("LastGossipDecay", this.cv);
      $$0.a("RestocksToday", this.cz);
      if (this.cB) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cig.c.parse(to.a, $$0.c("VillagerData")).resultOrPartial(cd::error).ifPresent($$0x -> this.an.a(ce, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cs = $$0.f("FoodLevel");
      }

      tg $$1 = $$0.c("Gossips", 10);
      this.ct.a(new Dynamic(to.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cw = $$0.h("Xp");
      }

      this.cx = $$0.i("LastRestock");
      this.cv = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dM() instanceof apf) {
         this.c((apf)this.dM());
      }

      this.cz = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cB = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected atx v() {
      if (this.fI()) {
         return null;
      } else {
         return this.go() ? aty.As : aty.An;
      }
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.Aq;
   }

   @Override
   protected atx n_() {
      return aty.Ap;
   }

   public void gC() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(cig $$0) {
      cig $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.bY = null;
      }

      this.an.a(ce, $$0);
   }

   @Override
   public cig gy() {
      return this.an.a(ce);
   }

   @Override
   protected void b(cvx $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cw = this.cw + $$0.p();
      this.cq = this.gn();
      if (this.gT()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.t()) {
         this.dM().b(new bpe(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cr = $$0;
   }

   public boolean gD() {
      return this.cr;
   }

   @Override
   public void a(@Nullable bpo $$0) {
      if ($$0 != null && this.dM() instanceof apf) {
         ((apf)this.dM()).a(cao.c, $$0, this);
         if (this.bA() && $$0 instanceof cis) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bnv $$0) {
      cd.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bow $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(byr.b);
      this.a(byr.c);
      this.a(byr.d);
      this.a(byr.e);
   }

   private void b(bow $$0) {
      if (this.dM() instanceof apf $$1) {
         Optional<byt> $$3 = this.bC.c(byr.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bqc.class::isInstance).forEach($$2x -> $$1.a(cao.d, $$0, (bqc)$$2x));
         }
      }
   }

   public void a(byr<ik> $$0) {
      if (this.dM() instanceof apf) {
         MinecraftServer $$1 = ((apf)this.dM()).o();
         this.bC.c($$0).ifPresent($$2 -> {
            apf $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               car $$4 = $$3.y();
               Optional<il<cau>> $$5 = $$4.c($$2.b());
               BiPredicate<cif, il<cau>> $$6 = cc.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aew.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean W_() {
      return this.cs + this.gV() >= 12 && !this.fI() && this.g() == 0;
   }

   private boolean gR() {
      return this.cs < 12;
   }

   private void gS() {
      if (this.gR() && this.gV() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cqk $$1 = this.y().a($$0);
            if (!$$1.b()) {
               Integer $$2 = ca.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cs = this.cs + $$2;
                     this.y().a($$0, 1);
                     if (!this.gR()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cis $$0) {
      return this.ct.a($$0.cw(), $$0x -> true);
   }

   private void w(int $$0) {
      this.cs -= $$0;
   }

   public void gE() {
      this.gS();
      this.w(12);
   }

   @Override
   public void b(cvy $$0) {
      this.bY = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return cig.d($$0) && this.cw >= cig.c($$0);
   }

   private void gU() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gu();
   }

   @Override
   protected vu co() {
      return vu.c(this.ai().g() + "." + ki.z.b(this.gy().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(kc.P);
      } else if ($$0 == 13) {
         this.a(kc.b);
      } else if ($$0 == 14) {
         this.a(kc.N);
      } else if ($$0 == 42) {
         this.a(kc.ak);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      if ($$2 == bps.e) {
         this.a(this.gy().a(cii.b));
      }

      if ($$2 == bps.n || $$2 == bps.m || bps.a($$2) || $$2 == bps.o) {
         this.a(this.gy().a(cik.a($$0.t(this.dm()))));
      }

      if ($$2 == bps.d) {
         this.cB = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cif b(apf $$0, bor $$1) {
      double $$2 = this.ag.j();
      cik $$3;
      if ($$2 < 0.5) {
         $$3 = cik.a($$0.t(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cif)$$1).gy().a();
      }

      cif $$6 = new cif(bpc.bi, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), bps.e, null);
      return $$6;
   }

   @Override
   public void a(apf $$0, bpn $$1) {
      if ($$0.aj() != bmz.a) {
         cd.info("Villager {} was struck by lightning {}.", this, $$1);
         cgo $$2 = bpc.bn.a((cwz)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), bps.i, null);
            $$2.t(this.gd());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fS();
            $$0.a_($$2);
            this.gQ();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cfd $$0) {
      cid.a(this, this, $$0);
   }

   @Override
   public boolean k(cqk $$0) {
      cqf $$1 = $$0.d();
      return (cg.contains($$1) || this.gy().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      bnl $$0 = this.y();
      return ca.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.y().a_($$0 -> $$0.a(auv.aZ));
   }

   @Override
   protected void gu() {
      cig $$0 = this.gy();
      Int2ObjectMap<cij.g[]> $$2;
      if (this.dM().I().b(clh.d)) {
         Int2ObjectMap<cij.g[]> $$1 = cij.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cij.a.get($$0.b());
      } else {
         $$2 = cij.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cij.g[] $$4 = (cij.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cvy $$5 = this.gp();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(apf $$0, cif $$1, long $$2) {
      if (($$2 < this.cu || $$2 >= this.cu + 1200L) && ($$2 < $$1.cu || $$2 >= $$1.cu + 1200L)) {
         this.ct.a($$1.ct, this.ag, 10);
         this.cu = $$2;
         $$1.cu = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gW() {
      long $$0 = this.dM().X();
      if (this.cv == 0L) {
         this.cv = $$0;
      } else if ($$0 >= this.cv + 24000L) {
         this.ct.b();
         this.cv = $$0;
      }
   }

   public void a(apf $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         epm $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cif> $$4 = $$0.a(cif.class, $$3);
         List<cif> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!axo.a(bpc.af, bps.f, $$0, this.dm(), 10, 8, 6, axo.a.a).isEmpty()) {
               $$4.forEach(bzj::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().X()) ? false : !this.bC.a(byr.F);
   }

   @Override
   public void a(cao $$0, bow $$1) {
      if ($$0 == cao.a) {
         this.ct.a($$1.cw(), byo.d, 20);
         this.ct.a($$1.cw(), byo.c, 25);
      } else if ($$0 == cao.e) {
         this.ct.a($$1.cw(), byo.e, 2);
      } else if ($$0 == cao.c) {
         this.ct.a($$1.cw(), byo.b, 25);
      } else if ($$0 == cao.d) {
         this.ct.a($$1.cw(), byo.a, 25);
      }
   }

   @Override
   public int s() {
      return this.cw;
   }

   public void v(int $$0) {
      this.cw = $$0;
   }

   private void gX() {
      this.gO();
      this.cz = 0;
   }

   public byn gI() {
      return this.ct;
   }

   public void a(tx $$0) {
      this.ct.a(new Dynamic(to.a, $$0));
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public void b(ib $$0) {
      super.b($$0);
      this.bC.a(byr.H, this.dM().X());
      this.bC.b(byr.m);
      this.bC.b(byr.E);
   }

   @Override
   public void fJ() {
      super.fJ();
      this.bC.a(byr.I, this.dM().X());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bC.c(byr.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
