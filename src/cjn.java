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

public class cjn extends cji implements brh, cjp {
   private static final Logger cd = LogUtils.getLogger();
   private static final aja<cjo> ce = aje.a(cjn.class, ajc.t);
   public static final int bZ = 12;
   public static final Map<crn, Integer> ca = ImmutableMap.of(crv.pw, 4, crv.ue, 1, crv.ud, 1, crv.vi, 1);
   private static final int cf = 2;
   private static final Set<crn> cg = ImmutableSet.of(crv.pw, crv.ue, crv.ud, crv.pv, crv.pu, crv.vi, new crn[]{crv.vj, crv.vg, crv.vh});
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
   private cka cq;
   private boolean cr;
   private int cs;
   private final bzs ct = new bzs();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cz;
   private long cA;
   private boolean cB;
   private static final ImmutableList<bzw<?>> cC = ImmutableList.of(
      bzw.b,
      bzw.c,
      bzw.d,
      bzw.e,
      bzw.g,
      bzw.h,
      bzw.i,
      bzw.j,
      bzw.k,
      bzw.l,
      bzw.L,
      bzw.aP,
      new bzw[]{bzw.m, bzw.n, bzw.q, bzw.r, bzw.t, bzw.v, bzw.w, bzw.x, bzw.y, bzw.A, bzw.f, bzw.C, bzw.D, bzw.E, bzw.H, bzw.I, bzw.J, bzw.F}
   );
   private static final ImmutableList<cbd<? extends cbc<? super cjn>>> cD = ImmutableList.of(cbd.c, cbd.d, cbd.b, cbd.e, cbd.f, cbd.g, cbd.h, cbd.i, cbd.j);
   public static final Map<bzw<im>, BiPredicate<cjn, in<cbz>>> cc = ImmutableMap.of(
      bzw.b,
      (BiPredicate<cjn, in>)($$0, $$1) -> $$1.a(cca.n),
      bzw.c,
      (BiPredicate<cjn, in>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      bzw.d,
      (BiPredicate<cjn, in>)($$0, $$1) -> cjq.a.test($$1),
      bzw.e,
      (BiPredicate<cjn, in>)($$0, $$1) -> $$1.a(cca.o)
   );

   public cjn(bqg<? extends cjn> $$0, czg $$1) {
      this($$0, $$1, cjs.c);
   }

   public cjn(bqg<? extends cjn> $$0, czg $$1, cjs $$2) {
      super($$0, $$1);
      ((cad)this.K()).b(true);
      this.K().a(true);
      this.s(true);
      this.a(this.gy().a($$2).a(cjq.b));
   }

   @Override
   public bru<cjn> dP() {
      return (bru<cjn>)super.dP();
   }

   @Override
   protected bru.b<cjn> dQ() {
      return bru.a(cC, cD);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      bru<cjn> $$1 = this.dQ().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(apu $$0) {
      bru<cjn> $$1 = this.dP();
      $$1.b($$0, this);
      this.bC = $$1.i();
      this.a(this.dP());
   }

   private void a(bru<cjn> $$0) {
      cjq $$1 = this.gy().b();
      if (this.p_()) {
         $$0.a(clr.e);
         $$0.a(clp.d, bvr.a(0.5F));
      } else {
         $$0.a(clr.f);
         $$0.a(clp.c, bvr.b($$1, 0.5F), ImmutableSet.of(Pair.of(bzw.c, bzx.a)));
      }

      $$0.a(clp.a, bvr.a($$1, 0.5F));
      $$0.a(clp.f, bvr.d($$1, 0.5F), ImmutableSet.of(Pair.of(bzw.e, bzx.a)));
      $$0.a(clp.e, bvr.c($$1, 0.5F));
      $$0.a(clp.b, bvr.e($$1, 0.5F));
      $$0.a(clp.g, bvr.f($$1, 0.5F));
      $$0.a(clp.i, bvr.g($$1, 0.5F));
      $$0.a(clp.h, bvr.h($$1, 0.5F));
      $$0.a(clp.j, bvr.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(clp.a));
      $$0.b(clp.b);
      $$0.a(clp.b);
      $$0.a(this.dM().Z(), this.dM().Y());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dM() instanceof apu) {
         this.c((apu)this.dM());
      }
   }

   public static brz.a gw() {
      return bqv.A().a(bsa.r, 0.5).a(bsa.k, 48.0);
   }

   public boolean gx() {
      return this.cB;
   }

   @Override
   protected void Y() {
      this.dM().af().a("villagerBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
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

            this.b(new bpm(bpo.j, 200, 0));
         }
      }

      if (this.cq != null && this.dM() instanceof apu) {
         ((apu)this.dM()).a(cbt.e, this.cq, this);
         this.dM().a(this, (byte)14);
         this.cq = null;
      }

      if (!this.gd() && this.ag.a(100) == 0) {
         cll $$0 = ((apu)this.dM()).d(this.dm());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gy().b() == cjq.b && this.go()) {
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
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.tI) || !this.bA() || this.go() || this.fI()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gJ();
         return bof.a(this.dM().B);
      } else {
         boolean $$3 = this.gp().isEmpty();
         if ($$1 == boe.a) {
            if ($$3 && !this.dM().B) {
               this.gJ();
            }

            $$0.a(auz.S);
         }

         if ($$3) {
            return bof.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bY.isEmpty()) {
               this.h($$0);
            }

            return bof.a(this.dM().B);
         }
      }
   }

   private void gJ() {
      this.t(40);
      if (!this.dM().x_()) {
         this.b(auo.Az);
      }
   }

   private void h(cka $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.O_(), this.gy().c());
   }

   @Override
   public void f(@Nullable cka $$0) {
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
      for (cye $$0 : this.gp()) {
         $$0.n();
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

      for (cye $$0 : this.gp()) {
         $$0.j();
      }

      this.gL();
      this.cx = this.dM().Y();
      this.cz++;
   }

   private void gL() {
      cyf $$0 = this.gp();
      cka $$1 = this.gn();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.ca.j, $$0, this.gy().c(), this.u(), this.gq(), this.gz());
      }
   }

   private boolean gM() {
      for (cye $$0 : this.gp()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gN() {
      return this.cz == 0 || this.cz < 2 && this.dM().Y() > this.cx + 2400L;
   }

   public boolean gB() {
      long $$0 = this.cx + 12000L;
      long $$1 = this.dM().Y();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dM().Z();
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
         for (cye $$1 : this.gp()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (cye $$0 : this.gp()) {
         $$0.g();
      }
   }

   private void i(cka $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cye $$2 : this.gp()) {
            $$2.a(-axm.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bpo.F)) {
         bpm $$3 = $$0.c(bpo.F);
         int $$4 = $$3.d();

         for (cye $$5 : this.gp()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().G());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ce, new cjo(cjs.c, cjq.b, 1));
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      cjo.c.encodeStart(uc.a, this.gy()).resultOrPartial(cd::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cs);
      $$0.a("Gossips", this.ct.a(uc.a));
      $$0.a("Xp", this.cw);
      $$0.a("LastRestock", this.cx);
      $$0.a("LastGossipDecay", this.cv);
      $$0.a("RestocksToday", this.cz);
      if (this.cB) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cjo.c.parse(uc.a, $$0.c("VillagerData")).resultOrPartial(cd::error).ifPresent($$0x -> this.an.a(ce, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cs = $$0.f("FoodLevel");
      }

      tu $$1 = $$0.c("Gossips", 10);
      this.ct.a(new Dynamic(uc.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cw = $$0.h("Xp");
      }

      this.cx = $$0.i("LastRestock");
      this.cv = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dM() instanceof apu) {
         this.c((apu)this.dM());
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
   protected aun v() {
      if (this.fI()) {
         return null;
      } else {
         return this.go() ? auo.AA : auo.Av;
      }
   }

   @Override
   protected aun d(boy $$0) {
      return auo.Ay;
   }

   @Override
   protected aun o_() {
      return auo.Ax;
   }

   public void gC() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(cjo $$0) {
      cjo $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.bY = null;
      }

      this.an.a(ce, $$0);
   }

   @Override
   public cjo gy() {
      return this.an.a(ce);
   }

   @Override
   protected void b(cye $$0) {
      int $$1 = 3 + this.ag.a(4);
      this.cw = this.cw + $$0.q();
      this.cq = this.gn();
      if (this.gT()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dM().b(new bqj(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cr = $$0;
   }

   public boolean gD() {
      return this.cr;
   }

   @Override
   public void a(@Nullable bqt $$0) {
      if ($$0 != null && this.dM() instanceof apu) {
         ((apu)this.dM()).a(cbt.c, $$0, this);
         if (this.bA() && $$0 instanceof cka) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(boy $$0) {
      cd.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bqa $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(bzw.b);
      this.a(bzw.c);
      this.a(bzw.d);
      this.a(bzw.e);
   }

   private void b(bqa $$0) {
      if (this.dM() instanceof apu $$1) {
         Optional<bzy> $$3 = this.bC.c(bzw.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(brh.class::isInstance).forEach($$2x -> $$1.a(cbt.d, $$0, (brh)$$2x));
         }
      }
   }

   public void a(bzw<im> $$0) {
      if (this.dM() instanceof apu) {
         MinecraftServer $$1 = ((apu)this.dM()).o();
         this.bC.c($$0).ifPresent($$2 -> {
            apu $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cbw $$4 = $$3.y();
               Optional<in<cbz>> $$5 = $$4.c($$2.b());
               BiPredicate<cjn, in<cbz>> $$6 = cc.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  afk.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.cs + this.gV() >= 12 && !this.fI() && this.g() == 0;
   }

   private boolean gR() {
      return this.cs < 12;
   }

   private void gS() {
      if (this.gR() && this.gV() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            crs $$1 = this.y().a($$0);
            if (!$$1.d()) {
               Integer $$2 = ca.get($$1.f());
               if ($$2 != null) {
                  int $$3 = $$1.G();

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

   public int g(cka $$0) {
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
   public void b(cyf $$0) {
      this.bY = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return cjo.d($$0) && this.cw >= cjo.c($$0);
   }

   private void gU() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gu();
   }

   @Override
   protected wi co() {
      return wi.c(this.ai().g() + "." + kt.z.b(this.gy().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(kn.P);
      } else if ($$0 == 13) {
         this.a(kn.b);
      } else if ($$0 == 14) {
         this.a(kn.N);
      } else if ($$0 == 42) {
         this.a(kn.ak);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if ($$2 == bqx.e) {
         this.a(this.gy().a(cjq.b));
      }

      if ($$2 == bqx.n || $$2 == bqx.m || bqx.a($$2) || $$2 == bqx.o) {
         this.a(this.gy().a(cjs.a($$0.t(this.dm()))));
      }

      if ($$2 == bqx.d) {
         this.cB = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cjn b(apu $$0, bpu $$1) {
      double $$2 = this.ag.j();
      cjs $$3;
      if ($$2 < 0.5) {
         $$3 = cjs.a($$0.t(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cjn)$$1).gy().a();
      }

      cjn $$6 = new cjn(bqg.bi, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), bqx.e, null);
      return $$6;
   }

   @Override
   public void a(apu $$0, bqs $$1) {
      if ($$0.ak() != boc.a) {
         cd.info("Villager {} was struck by lightning {}.", this, $$1);
         chw $$2 = bqg.bn.a((czg)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), bqx.i, null);
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
   protected void b(cgk $$0) {
      cjl.a(this, this, $$0);
   }

   @Override
   public boolean k(crs $$0) {
      crn $$1 = $$0.f();
      return (cg.contains($$1) || this.gy().b().d().contains($$1)) && this.y().b($$0);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      boo $$0 = this.y();
      return ca.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.y().a_($$0 -> $$0.a(avm.aZ));
   }

   @Override
   protected void gu() {
      cjo $$0 = this.gy();
      Int2ObjectMap<cjr.g[]> $$2;
      if (this.dM().J().b(cmp.d)) {
         Int2ObjectMap<cjr.g[]> $$1 = cjr.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cjr.a.get($$0.b());
      } else {
         $$2 = cjr.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cjr.g[] $$4 = (cjr.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cyf $$5 = this.gp();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(apu $$0, cjn $$1, long $$2) {
      if (($$2 < this.cu || $$2 >= this.cu + 1200L) && ($$2 < $$1.cu || $$2 >= $$1.cu + 1200L)) {
         this.ct.a($$1.ct, this.ag, 10);
         this.cu = $$2;
         $$1.cu = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gW() {
      long $$0 = this.dM().Y();
      if (this.cv == 0L) {
         this.cv = $$0;
      } else if ($$0 >= this.cv + 24000L) {
         this.ct.b();
         this.cv = $$0;
      }
   }

   public void a(apu $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ese $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cjn> $$4 = $$0.a(cjn.class, $$3);
         List<cjn> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!aye.a(bqg.af, bqx.f, $$0, this.dm(), 10, 8, 6, aye.a.a).isEmpty()) {
               $$4.forEach(cao::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().Y()) ? false : !this.bC.a(bzw.F);
   }

   @Override
   public void a(cbt $$0, bqa $$1) {
      if ($$0 == cbt.a) {
         this.ct.a($$1.cw(), bzt.d, 20);
         this.ct.a($$1.cw(), bzt.c, 25);
      } else if ($$0 == cbt.e) {
         this.ct.a($$1.cw(), bzt.e, 2);
      } else if ($$0 == cbt.c) {
         this.ct.a($$1.cw(), bzt.b, 25);
      } else if ($$0 == cbt.d) {
         this.ct.a($$1.cw(), bzt.a, 25);
      }
   }

   @Override
   public int u() {
      return this.cw;
   }

   public void v(int $$0) {
      this.cw = $$0;
   }

   private void gX() {
      this.gO();
      this.cz = 0;
   }

   public bzs gI() {
      return this.ct;
   }

   public void a(ul $$0) {
      this.ct.a(new Dynamic(uc.a, $$0));
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   @Override
   public void b(id $$0) {
      super.b($$0);
      this.bC.a(bzw.H, this.dM().Y());
      this.bC.b(bzw.m);
      this.bC.b(bzw.E);
   }

   @Override
   public void fJ() {
      super.fJ();
      this.bC.a(bzw.I, this.dM().Y());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bC.c(bzw.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
