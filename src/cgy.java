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

public class cgy extends cgt implements bow, cha {
   private static final Logger bZ = LogUtils.getLogger();
   private static final aie<cgz> ca = aih.a(cgy.class, aig.t);
   public static final int bV = 12;
   public static final Map<coy, Integer> bW = ImmutableMap.of(cpg.pw, 4, cpg.uc, 1, cpg.ub, 1, cpg.vg, 1);
   private static final int cb = 2;
   private static final Set<coy> cc = ImmutableSet.of(cpg.pw, cpg.uc, cpg.ub, cpg.pv, cpg.pu, cpg.vg, new coy[]{cpg.vh, cpg.ve, cpg.vf});
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
   private chl cm;
   private boolean cn;
   private int co;
   private final bxh cp = new bxh();
   private long cq;
   private long cr;
   private int cs;
   private long ct;
   private int cu;
   private long cw;
   private boolean cx;
   private static final ImmutableList<bxl<?>> cy = ImmutableList.of(
      bxl.b,
      bxl.c,
      bxl.d,
      bxl.e,
      bxl.g,
      bxl.h,
      bxl.i,
      bxl.j,
      bxl.k,
      bxl.l,
      bxl.L,
      bxl.aP,
      new bxl[]{bxl.m, bxl.n, bxl.q, bxl.r, bxl.t, bxl.v, bxl.w, bxl.x, bxl.y, bxl.A, bxl.f, bxl.C, bxl.D, bxl.E, bxl.H, bxl.I, bxl.J, bxl.F}
   );
   private static final ImmutableList<bys<? extends byr<? super cgy>>> cz = ImmutableList.of(bys.c, bys.d, bys.b, bys.e, bys.f, bys.g, bys.h, bys.i, bys.j);
   public static final Map<bxl<ii>, BiPredicate<cgy, ij<bzo>>> bY = ImmutableMap.of(
      bxl.b,
      (BiPredicate<cgy, ij>)($$0, $$1) -> $$1.a(bzp.n),
      bxl.c,
      (BiPredicate<cgy, ij>)($$0, $$1) -> $$0.gr().b().b().test($$1),
      bxl.d,
      (BiPredicate<cgy, ij>)($$0, $$1) -> chb.a.test($$1),
      bxl.e,
      (BiPredicate<cgy, ij>)($$0, $$1) -> $$1.a(bzp.o)
   );

   public cgy(bnw<? extends cgy> $$0, cvr $$1) {
      this($$0, $$1, chd.c);
   }

   public cgy(bnw<? extends cgy> $$0, cvr $$1, chd $$2) {
      super($$0, $$1);
      ((bxs)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gr().a($$2).a(chb.b));
   }

   @Override
   public bpj<cgy> dO() {
      return (bpj<cgy>)super.dO();
   }

   @Override
   protected bpj.b<cgy> dP() {
      return bpj.a(cy, cz);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      bpj<cgy> $$1 = this.dP().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(aow $$0) {
      bpj<cgy> $$1 = this.dO();
      $$1.b($$0, this);
      this.bz = $$1.i();
      this.a(this.dO());
   }

   private void a(bpj<cgy> $$0) {
      chb $$1 = this.gr().b();
      if (this.o_()) {
         $$0.a(cja.e);
         $$0.a(ciy.d, btg.a(0.5F));
      } else {
         $$0.a(cja.f);
         $$0.a(ciy.c, btg.b($$1, 0.5F), ImmutableSet.of(Pair.of(bxl.c, bxm.a)));
      }

      $$0.a(ciy.a, btg.a($$1, 0.5F));
      $$0.a(ciy.f, btg.d($$1, 0.5F), ImmutableSet.of(Pair.of(bxl.e, bxm.a)));
      $$0.a(ciy.e, btg.c($$1, 0.5F));
      $$0.a(ciy.b, btg.e($$1, 0.5F));
      $$0.a(ciy.g, btg.f($$1, 0.5F));
      $$0.a(ciy.i, btg.g($$1, 0.5F));
      $$0.a(ciy.h, btg.h($$1, 0.5F));
      $$0.a(ciy.j, btg.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(ciy.a));
      $$0.b(ciy.b);
      $$0.a(ciy.b);
      $$0.a(this.dM().Y(), this.dM().X());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dM() instanceof aow) {
         this.c((aow)this.dM());
      }
   }

   public static bpo.a gp() {
      return bok.C().a(bpp.o, 0.5).a(bpp.i, 48.0);
   }

   public boolean gq() {
      return this.cx;
   }

   @Override
   protected void aa() {
      this.dM().ae().a("villagerBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      if (this.cx) {
         this.cx = false;
      }

      if (!this.gh() && this.ck > 0) {
         this.ck--;
         if (this.ck <= 0) {
            if (this.cl) {
               this.gN();
               this.cl = false;
            }

            this.b(new bnd(bnf.j, 200, 0));
         }
      }

      if (this.cm != null && this.dM() instanceof aow) {
         ((aow)this.dM()).a(bzi.e, this.cm, this);
         this.dM().a(this, (byte)14);
         this.cm = null;
      }

      if (!this.fW() && this.af.a(100) == 0) {
         ciu $$0 = ((aow)this.dM()).d(this.dm());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dM().a(this, (byte)42);
         }
      }

      if (this.gr().b() == chb.b && this.gh()) {
         this.gm();
      }

      super.aa();
   }

   @Override
   public void l() {
      super.l();
      if (this.u() > 0) {
         this.t(this.u() - 1);
      }

      this.gP();
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.tH) || !this.bx() || this.gh() || this.fD()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gC();
         return blw.a(this.dM().B);
      } else {
         boolean $$3 = this.gi().isEmpty();
         if ($$1 == blv.a) {
            if ($$3 && !this.dM().B) {
               this.gC();
            }

            $$0.a(atv.S);
         }

         if ($$3) {
            return blw.a(this.dM().B);
         } else {
            if (!this.dM().B && !this.bU.isEmpty()) {
               this.h($$0);
            }

            return blw.a(this.dM().B);
         }
      }
   }

   private void gC() {
      this.t(40);
      if (!this.dM().y_()) {
         this.b(atl.Ab);
      }
   }

   private void h(chl $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.Q_(), this.gr().c());
   }

   @Override
   public void f(@Nullable chl $$0) {
      boolean $$1 = this.gg() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gm();
      }
   }

   @Override
   protected void gm() {
      super.gm();
      this.gD();
   }

   private void gD() {
      for (cup $$0 : this.gi()) {
         $$0.m();
      }
   }

   @Override
   public boolean gs() {
      return true;
   }

   @Override
   public boolean go() {
      return this.dM().B;
   }

   public void gt() {
      this.gI();

      for (cup $$0 : this.gi()) {
         $$0.h();
      }

      this.gE();
      this.ct = this.dM().X();
      this.cu++;
   }

   private void gE() {
      cuq $$0 = this.gi();
      chl $$1 = this.gg();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bW.j, $$0, this.gr().c(), this.w(), this.gj(), this.gs());
      }
   }

   private boolean gF() {
      for (cup $$0 : this.gi()) {
         if ($$0.s()) {
            return true;
         }
      }

      return false;
   }

   private boolean gG() {
      return this.cu == 0 || this.cu < 2 && this.dM().X() > this.ct + 2400L;
   }

   public boolean gu() {
      long $$0 = this.ct + 12000L;
      long $$1 = this.dM().X();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dM().Y();
      if (this.cw > 0L) {
         long $$4 = this.cw / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cw = $$3;
      if ($$2) {
         this.ct = $$1;
         this.gQ();
      }

      return this.gG() && this.gF();
   }

   private void gH() {
      int $$0 = 2 - this.cu;
      if ($$0 > 0) {
         for (cup $$1 : this.gi()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gI();
      }

      this.gE();
   }

   private void gI() {
      for (cup $$0 : this.gi()) {
         $$0.e();
      }
   }

   private void i(chl $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cup $$2 : this.gi()) {
            $$2.a(-awi.d((float)$$1 * $$2.o()));
         }
      }

      if ($$0.a(bnf.F)) {
         bnd $$3 = $$0.c(bnf.F);
         int $$4 = $$3.d();

         for (cup $$5 : this.gi()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, new cgz(chd.c, chb.b, 1));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cgz.c.encodeStart(tk.a, this.gr()).resultOrPartial(bZ::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.co);
      $$0.a("Gossips", this.cp.a(tk.a));
      $$0.a("Xp", this.cs);
      $$0.a("LastRestock", this.ct);
      $$0.a("LastGossipDecay", this.cr);
      $$0.a("RestocksToday", this.cu);
      if (this.cx) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cgz> $$1 = cgz.c.parse(new Dynamic(tk.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(bZ::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.bU = new cuq($$0.p("Offers"));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.co = $$0.f("FoodLevel");
      }

      tc $$2 = $$0.c("Gossips", 10);
      this.cp.a(new Dynamic(tk.a, $$2));
      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }

      this.ct = $$0.i("LastRestock");
      this.cr = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dM() instanceof aow) {
         this.c((aow)this.dM());
      }

      this.cu = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cx = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected atk y() {
      if (this.fD()) {
         return null;
      } else {
         return this.gh() ? atl.Ac : atl.zX;
      }
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.Aa;
   }

   @Override
   protected atk n_() {
      return atl.zZ;
   }

   public void gv() {
      this.b(this.gr().b().f());
   }

   @Override
   public void a(cgz $$0) {
      cgz $$1 = this.gr();
      if ($$1.b() != $$0.b()) {
         this.bU = null;
      }

      this.am.b(ca, $$0);
   }

   @Override
   public cgz gr() {
      return this.am.b(ca);
   }

   @Override
   protected void b(cup $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cs = this.cs + $$0.p();
      this.cm = this.gg();
      if (this.gM()) {
         this.ck = 40;
         this.cl = true;
         $$1 += 5;
      }

      if ($$0.t()) {
         this.dM().b(new bny(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cn = $$0;
   }

   public boolean gw() {
      return this.cn;
   }

   @Override
   public void a(@Nullable boi $$0) {
      if ($$0 != null && this.dM() instanceof aow) {
         ((aow)this.dM()).a(bzi.c, $$0, this);
         if (this.bx() && $$0 instanceof chl) {
            this.dM().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bmp $$0) {
      bZ.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bnq $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gJ();
      super.a($$0);
   }

   private void gJ() {
      this.a(bxl.b);
      this.a(bxl.c);
      this.a(bxl.d);
      this.a(bxl.e);
   }

   private void a(bnq $$0) {
      if (this.dM() instanceof aow $$1) {
         Optional<bxn> $$3 = this.bz.c(bxl.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bow.class::isInstance).forEach($$2x -> $$1.a(bzi.d, $$0, (bow)$$2x));
         }
      }
   }

   public void a(bxl<ii> $$0) {
      if (this.dM() instanceof aow) {
         MinecraftServer $$1 = ((aow)this.dM()).o();
         this.bz.c($$0).ifPresent($$2 -> {
            aow $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               bzl $$4 = $$3.y();
               Optional<ij<bzo>> $$5 = $$4.c($$2.b());
               BiPredicate<cgy, ij<bzo>> $$6 = bY.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aep.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.co + this.gO() >= 12 && !this.fD() && this.h() == 0;
   }

   private boolean gK() {
      return this.co < 12;
   }

   private void gL() {
      if (this.gK() && this.gO() != 0) {
         for (int $$0 = 0; $$0 < this.A().b(); $$0++) {
            cpd $$1 = this.A().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bW.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.co = this.co + $$2;
                     this.A().a($$0, 1);
                     if (!this.gK()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(chl $$0) {
      return this.cp.a($$0.cw(), $$0x -> true);
   }

   private void w(int $$0) {
      this.co -= $$0;
   }

   public void gx() {
      this.gL();
      this.w(12);
   }

   public void b(cuq $$0) {
      this.bU = $$0;
   }

   private boolean gM() {
      int $$0 = this.gr().c();
      return cgz.d($$0) && this.cs >= cgz.c($$0);
   }

   private void gN() {
      this.a(this.gr().a(this.gr().c() + 1));
      this.gn();
   }

   @Override
   protected vq co() {
      return vq.c(this.ai().g() + "." + kf.z.b(this.gr().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(jz.O);
      } else if ($$0 == 13) {
         this.a(jz.b);
      } else if ($$0 == 14) {
         this.a(jz.M);
      } else if ($$0 == 42) {
         this.a(jz.aj);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      if ($$2 == bom.e) {
         this.a(this.gr().a(chb.b));
      }

      if ($$2 == bom.n || $$2 == bom.m || bom.a($$2) || $$2 == bom.o) {
         this.a(this.gr().a(chd.a($$0.t(this.dm()))));
      }

      if ($$2 == bom.d) {
         this.cx = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Nullable
   public cgy b(aow $$0, bnl $$1) {
      double $$2 = this.af.j();
      chd $$3;
      if ($$2 < 0.5) {
         $$3 = chd.a($$0.t(this.dm()));
      } else if ($$2 < 0.75) {
         $$3 = this.gr().a();
      } else {
         $$3 = ((cgy)$$1).gr().a();
      }

      cgy $$6 = new cgy(bnw.bh, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dm()), bom.e, null, null);
      return $$6;
   }

   @Override
   public void a(aow $$0, boh $$1) {
      if ($$0.aj() != blt.a) {
         bZ.info("Villager {} was struck by lightning {}.", this, $$1);
         cfh $$2 = bnw.bm.a((cvr)$$0);
         if ($$2 != null) {
            $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$2.a($$0, $$0.d_($$2.dm()), bom.i, null, null);
            $$2.t(this.fW());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cB());
            }

            $$2.fL();
            $$0.a_($$2);
            this.gJ();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cdw $$0) {
      cgw.a(this, this, $$0);
   }

   @Override
   public boolean k(cpd $$0) {
      coy $$1 = $$0.d();
      return (cc.contains($$1) || this.gr().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gy() {
      return this.gO() >= 24;
   }

   public boolean gz() {
      return this.gO() < 12;
   }

   private int gO() {
      bmf $$0 = this.A();
      return bW.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gA() {
      return this.A().a_($$0 -> $$0.a(aui.aZ));
   }

   @Override
   protected void gn() {
      cgz $$0 = this.gr();
      Int2ObjectMap<chc.g[]> $$2;
      if (this.dM().I().b(cjy.d)) {
         Int2ObjectMap<chc.g[]> $$1 = chc.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : chc.a.get($$0.b());
      } else {
         $$2 = chc.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         chc.g[] $$4 = (chc.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cuq $$5 = this.gi();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(aow $$0, cgy $$1, long $$2) {
      if (($$2 < this.cq || $$2 >= this.cq + 1200L) && ($$2 < $$1.cq || $$2 >= $$1.cq + 1200L)) {
         this.cp.a($$1.cp, this.af, 10);
         this.cq = $$2;
         $$1.cq = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gP() {
      long $$0 = this.dM().X();
      if (this.cr == 0L) {
         this.cr = $$0;
      } else if ($$0 >= this.cr + 24000L) {
         this.cp.b();
         this.cr = $$0;
      }
   }

   public void a(aow $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         enu $$3 = this.cH().c(10.0, 10.0, 10.0);
         List<cgy> $$4 = $$0.a(cgy.class, $$3);
         List<cgy> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!axa.a(bnw.ae, bom.f, $$0, this.dm(), 10, 8, 6, axa.a.a).isEmpty()) {
               $$4.forEach(byd::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dM().X()) ? false : !this.bz.a(bxl.F);
   }

   @Override
   public void a(bzi $$0, bnq $$1) {
      if ($$0 == bzi.a) {
         this.cp.a($$1.cw(), bxi.d, 20);
         this.cp.a($$1.cw(), bxi.c, 25);
      } else if ($$0 == bzi.e) {
         this.cp.a($$1.cw(), bxi.e, 2);
      } else if ($$0 == bzi.c) {
         this.cp.a($$1.cw(), bxi.b, 25);
      } else if ($$0 == bzi.d) {
         this.cp.a($$1.cw(), bxi.a, 25);
      }
   }

   @Override
   public int w() {
      return this.cs;
   }

   public void v(int $$0) {
      this.cs = $$0;
   }

   private void gQ() {
      this.gH();
      this.cu = 0;
   }

   public bxh gB() {
      return this.cp;
   }

   public void a(tt $$0) {
      this.cp.a(new Dynamic(tk.a, $$0));
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public void b(hz $$0) {
      super.b($$0);
      this.bz.a(bxl.H, this.dM().X());
      this.bz.b(bxl.m);
      this.bz.b(bxl.E);
   }

   @Override
   public void fE() {
      super.fE();
      this.bz.a(bxl.I, this.dM().X());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bz.c(bxl.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
