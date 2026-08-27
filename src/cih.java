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

public class cih extends cic implements bqd, cij {
   private static final Logger cd = LogUtils.getLogger();
   private static final aim<cii> ce = aiq.a(cih.class, aio.t);
   public static final int bZ = 12;
   public static final Map<cqh, Integer> ca = ImmutableMap.of(cqp.pw, 4, cqp.ue, 1, cqp.ud, 1, cqp.vi, 1);
   private static final int cf = 2;
   private static final Set<cqh> cg = ImmutableSet.of(cqp.pw, cqp.ue, cqp.ud, cqp.pv, cqp.pu, cqp.vi, new cqh[]{cqp.vj, cqp.vg, cqp.vh});
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
   private ciu cq;
   private boolean cr;
   private int cs;
   private final byo ct = new byo();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cz;
   private long cA;
   private boolean cB;
   private static final ImmutableList<bys<?>> cC = ImmutableList.of(
      bys.b,
      bys.c,
      bys.d,
      bys.e,
      bys.g,
      bys.h,
      bys.i,
      bys.j,
      bys.k,
      bys.l,
      bys.L,
      bys.aP,
      new bys[]{bys.m, bys.n, bys.q, bys.r, bys.t, bys.v, bys.w, bys.x, bys.y, bys.A, bys.f, bys.C, bys.D, bys.E, bys.H, bys.I, bys.J, bys.F}
   );
   private static final ImmutableList<bzz<? extends bzy<? super cih>>> cD = ImmutableList.of(bzz.c, bzz.d, bzz.b, bzz.e, bzz.f, bzz.g, bzz.h, bzz.i, bzz.j);
   public static final Map<bys<ik>, BiPredicate<cih, il<cav>>> cc = ImmutableMap.of(
      bys.b,
      (BiPredicate<cih, il>)($$0, $$1) -> $$1.a(caw.n),
      bys.c,
      (BiPredicate<cih, il>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      bys.d,
      (BiPredicate<cih, il>)($$0, $$1) -> cik.a.test($$1),
      bys.e,
      (BiPredicate<cih, il>)($$0, $$1) -> $$1.a(caw.o)
   );

   public cih(bpd<? extends cih> $$0, cxb $$1) {
      this($$0, $$1, cim.c);
   }

   public cih(bpd<? extends cih> $$0, cxb $$1, cim $$2) {
      super($$0, $$1);
      ((byz)this.K()).b(true);
      this.K().a(true);
      this.s(true);
      this.a(this.gy().a($$2).a(cik.b));
   }

   @Override
   public bqq<cih> dP() {
      return (bqq<cih>)super.dP();
   }

   @Override
   protected bqq.b<cih> dQ() {
      return bqq.a(cC, cD);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      bqq<cih> $$1 = this.dQ().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(apf $$0) {
      bqq<cih> $$1 = this.dP();
      $$1.b($$0, this);
      this.bC = $$1.i();
      this.a(this.dP());
   }

   private void a(bqq<cih> $$0) {
      cik $$1 = this.gy().b();
      if (this.o_()) {
         $$0.a(ckl.e);
         $$0.a(ckj.d, bun.a(0.5F));
      } else {
         $$0.a(ckl.f);
         $$0.a(ckj.c, bun.b($$1, 0.5F), ImmutableSet.of(Pair.of(bys.c, byt.a)));
      }

      $$0.a(ckj.a, bun.a($$1, 0.5F));
      $$0.a(ckj.f, bun.d($$1, 0.5F), ImmutableSet.of(Pair.of(bys.e, byt.a)));
      $$0.a(ckj.e, bun.c($$1, 0.5F));
      $$0.a(ckj.b, bun.e($$1, 0.5F));
      $$0.a(ckj.g, bun.f($$1, 0.5F));
      $$0.a(ckj.i, bun.g($$1, 0.5F));
      $$0.a(ckj.h, bun.h($$1, 0.5F));
      $$0.a(ckj.j, bun.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ckj.a));
      $$0.b(ckj.b);
      $$0.a(ckj.b);
      $$0.a(this.dM().Y(), this.dM().X());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dM() instanceof apf) {
         this.c((apf)this.dM());
      }
   }

   public static bqv.a gw() {
      return bpr.A().a(bqw.r, 0.5).a(bqw.k, 48.0);
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

            this.b(new bok(bom.j, 200, 0));
         }
      }

      if (this.cq != null && this.dM() instanceof apf) {
         ((apf)this.dM()).a(cap.e, this.cq, this);
         this.dM().a(this, (byte)14);
         this.cq = null;
      }

      if (!this.gd() && this.ag.a(100) == 0) {
         ckf $$0 = ((apf)this.dM()).d(this.dm());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gy().b() == cik.b && this.go()) {
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
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(cqp.tI) || !this.bA() || this.go() || this.fI()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gJ();
         return bnd.a(this.dM().B);
      } else {
         boolean $$3 = this.gp().isEmpty();
         if ($$1 == bnc.a) {
            if ($$3 && !this.dM().B) {
               this.gJ();
            }

            $$0.a(aui.S);
         }

         if ($$3) {
            return bnd.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bY.isEmpty()) {
               this.h($$0);
            }

            return bnd.a(this.dM().B);
         }
      }
   }

   private void gJ() {
      this.t(40);
      if (!this.dM().x_()) {
         this.b(aty.Aw);
      }
   }

   private void h(ciu $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gy().c());
   }

   @Override
   public void f(@Nullable ciu $$0) {
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
      for (cvz $$0 : this.gp()) {
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

      for (cvz $$0 : this.gp()) {
         $$0.h();
      }

      this.gL();
      this.cx = this.dM().X();
      this.cz++;
   }

   private void gL() {
      cwa $$0 = this.gp();
      ciu $$1 = this.gn();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bZ.j, $$0, this.gy().c(), this.s(), this.gq(), this.gz());
      }
   }

   private boolean gM() {
      for (cvz $$0 : this.gp()) {
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
         for (cvz $$1 : this.gp()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (cvz $$0 : this.gp()) {
         $$0.e();
      }
   }

   private void i(ciu $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cvz $$2 : this.gp()) {
            $$2.a(-aww.d((float)$$1 * $$2.o()));
         }
      }

      if ($$0.a(bom.F)) {
         bok $$3 = $$0.c(bom.F);
         int $$4 = $$3.d();

         for (cvz $$5 : this.gp()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ce, new cii(cim.c, cik.b, 1));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      cii.c.encodeStart(to.a, this.gy()).resultOrPartial(cd::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         cii.c.parse(to.a, $$0.c("VillagerData")).resultOrPartial(cd::error).ifPresent($$0x -> this.an.a(ce, $$0x));
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
         return this.go() ? aty.Ax : aty.As;
      }
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.Av;
   }

   @Override
   protected atx n_() {
      return aty.Au;
   }

   public void gC() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(cii $$0) {
      cii $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.bY = null;
      }

      this.an.a(ce, $$0);
   }

   @Override
   public cii gy() {
      return this.an.a(ce);
   }

   @Override
   protected void b(cvz $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cw = this.cw + $$0.p();
      this.cq = this.gn();
      if (this.gT()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.t()) {
         this.dM().b(new bpf(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cr = $$0;
   }

   public boolean gD() {
      return this.cr;
   }

   @Override
   public void a(@Nullable bpp $$0) {
      if ($$0 != null && this.dM() instanceof apf) {
         ((apf)this.dM()).a(cap.c, $$0, this);
         if (this.bA() && $$0 instanceof ciu) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bnw $$0) {
      cd.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      box $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(bys.b);
      this.a(bys.c);
      this.a(bys.d);
      this.a(bys.e);
   }

   private void b(box $$0) {
      if (this.dM() instanceof apf $$1) {
         Optional<byu> $$3 = this.bC.c(bys.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bqd.class::isInstance).forEach($$2x -> $$1.a(cap.d, $$0, (bqd)$$2x));
         }
      }
   }

   public void a(bys<ik> $$0) {
      if (this.dM() instanceof apf) {
         MinecraftServer $$1 = ((apf)this.dM()).o();
         this.bC.c($$0).ifPresent($$2 -> {
            apf $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cas $$4 = $$3.y();
               Optional<il<cav>> $$5 = $$4.c($$2.b());
               BiPredicate<cih, il<cav>> $$6 = cc.get($$0);
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
            cqm $$1 = this.y().a($$0);
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

   public int g(ciu $$0) {
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
   public void b(cwa $$0) {
      this.bY = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return cii.d($$0) && this.cw >= cii.c($$0);
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
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      if ($$2 == bpt.e) {
         this.a(this.gy().a(cik.b));
      }

      if ($$2 == bpt.n || $$2 == bpt.m || bpt.a($$2) || $$2 == bpt.o) {
         this.a(this.gy().a(cim.a($$0.t(this.dm()))));
      }

      if ($$2 == bpt.d) {
         this.cB = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cih b(apf $$0, bos $$1) {
      double $$2 = this.ag.j();
      cim $$3;
      if ($$2 < 0.5) {
         $$3 = cim.a($$0.t(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cih)$$1).gy().a();
      }

      cih $$6 = new cih(bpd.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), bpt.e, null);
      return $$6;
   }

   @Override
   public void a(apf $$0, bpo $$1) {
      if ($$0.aj() != bna.a) {
         cd.info("Villager {} was struck by lightning {}.", this, $$1);
         cgq $$2 = bpd.bo.a((cxb)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), bpt.i, null);
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
   protected void b(cfe $$0) {
      cif.a(this, this, $$0);
   }

   @Override
   public boolean k(cqm $$0) {
      cqh $$1 = $$0.d();
      return (cg.contains($$1) || this.gy().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      bnm $$0 = this.y();
      return ca.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.y().a_($$0 -> $$0.a(auv.aZ));
   }

   @Override
   protected void gu() {
      cii $$0 = this.gy();
      Int2ObjectMap<cil.g[]> $$2;
      if (this.dM().I().b(clj.d)) {
         Int2ObjectMap<cil.g[]> $$1 = cil.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cil.a.get($$0.b());
      } else {
         $$2 = cil.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cil.g[] $$4 = (cil.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cwa $$5 = this.gp();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(apf $$0, cih $$1, long $$2) {
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
         epo $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cih> $$4 = $$0.a(cih.class, $$3);
         List<cih> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!axo.a(bpd.ag, bpt.f, $$0, this.dm(), 10, 8, 6, axo.a.a).isEmpty()) {
               $$4.forEach(bzk::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().X()) ? false : !this.bC.a(bys.F);
   }

   @Override
   public void a(cap $$0, box $$1) {
      if ($$0 == cap.a) {
         this.ct.a($$1.cw(), byp.d, 20);
         this.ct.a($$1.cw(), byp.c, 25);
      } else if ($$0 == cap.e) {
         this.ct.a($$1.cw(), byp.e, 2);
      } else if ($$0 == cap.c) {
         this.ct.a($$1.cw(), byp.b, 25);
      } else if ($$0 == cap.d) {
         this.ct.a($$1.cw(), byp.a, 25);
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

   public byo gI() {
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
      this.bC.a(bys.H, this.dM().X());
      this.bC.b(bys.m);
      this.bC.b(bys.E);
   }

   @Override
   public void fJ() {
      super.fJ();
      this.bC.a(bys.I, this.dM().X());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bC.c(bys.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
