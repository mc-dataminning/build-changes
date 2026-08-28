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
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class cnc extends cmx implements but, cne {
   private static final Logger cf = LogUtils.getLogger();
   private static final akg<cnd> cg = akk.a(cnc.class, aki.u);
   public static final int cb = 12;
   public static final Map<cvg, Integer> cc = ImmutableMap.of(cvo.py, 4, cvo.ui, 1, cvo.uh, 1, cvo.vm, 1);
   private static final int ch = 2;
   private static final int ci = 10;
   private static final int cj = 1200;
   private static final int ck = 24000;
   private static final int cl = 25;
   private static final int cm = 10;
   private static final int cn = 5;
   private static final long co = 24000L;
   @VisibleForTesting
   public static final float cd = 0.5F;
   private int cp;
   private boolean cq;
   @Nullable
   private cnp cr;
   private boolean cs;
   private int ct;
   private final cde cu = new cde();
   private long cv;
   private long cw;
   private int cx;
   private long cy;
   private int cz;
   private long cB;
   private boolean cC;
   private static final ImmutableList<cdi<?>> cD = ImmutableList.of(
      cdi.b,
      cdi.c,
      cdi.d,
      cdi.e,
      cdi.g,
      cdi.h,
      cdi.i,
      cdi.j,
      cdi.k,
      cdi.l,
      cdi.L,
      cdi.aP,
      new cdi[]{cdi.m, cdi.n, cdi.q, cdi.r, cdi.t, cdi.v, cdi.w, cdi.x, cdi.y, cdi.A, cdi.f, cdi.C, cdi.D, cdi.E, cdi.H, cdi.I, cdi.J, cdi.F}
   );
   private static final ImmutableList<cep<? extends ceo<? super cnc>>> cE = ImmutableList.of(cep.c, cep.d, cep.b, cep.e, cep.f, cep.g, cep.h, cep.i, cep.j);
   public static final Map<cdi<jm>, BiPredicate<cnc, jn<cfl>>> ce = ImmutableMap.of(
      cdi.b,
      (BiPredicate<cnc, jn>)($$0, $$1) -> $$1.a(cfm.n),
      cdi.c,
      (BiPredicate<cnc, jn>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      cdi.d,
      (BiPredicate<cnc, jn>)($$0, $$1) -> cnf.a.test($$1),
      cdi.e,
      (BiPredicate<cnc, jn>)($$0, $$1) -> $$1.a(cfm.o)
   );

   public cnc(btq<? extends cnc> $$0, dds $$1) {
      this($$0, $$1, cnh.c);
   }

   public cnc(btq<? extends cnc> $$0, dds $$1, cnh $$2) {
      super($$0, $$1);
      ((cdp)this.P()).b(true);
      this.P().a(true);
      this.P().a(48.0F);
      this.a_(true);
      this.a(this.gy().a($$2).a(cnf.b));
   }

   @Override
   public bvg<cnc> dX() {
      return (bvg<cnc>)super.dX();
   }

   @Override
   protected bvg.b<cnc> dY() {
      return bvg.a(cD, cE);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      bvg<cnc> $$1 = this.dY().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(arg $$0) {
      bvg<cnc> $$1 = this.dX();
      $$1.b($$0, this);
      this.bC = $$1.i();
      this.a(this.dX());
   }

   private void a(bvg<cnc> $$0) {
      cnf $$1 = this.gy().b();
      if (this.o_()) {
         $$0.a(cpi.e);
         $$0.a(cpg.d, bzd.a(0.5F));
      } else {
         $$0.a(cpi.f);
         $$0.a(cpg.c, bzd.b($$1, 0.5F), ImmutableSet.of(Pair.of(cdi.c, cdj.a)));
      }

      $$0.a(cpg.a, bzd.a($$1, 0.5F));
      $$0.a(cpg.f, bzd.d($$1, 0.5F), ImmutableSet.of(Pair.of(cdi.e, cdj.a)));
      $$0.a(cpg.e, bzd.c($$1, 0.5F));
      $$0.a(cpg.b, bzd.e($$1, 0.5F));
      $$0.a(cpg.g, bzd.f($$1, 0.5F));
      $$0.a(cpg.i, bzd.g($$1, 0.5F));
      $$0.a(cpg.h, bzd.h($$1, 0.5F));
      $$0.a(cpg.j, bzd.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cpg.a));
      $$0.b(cpg.b);
      $$0.a(cpg.b);
      $$0.a(this.dS().ab(), this.dS().aa());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dS() instanceof arg) {
         this.a((arg)this.dS());
      }
   }

   public static bvl.a gx() {
      return buh.E().a(bvm.v, 0.5);
   }

   public boolean gz() {
      return this.cC;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("villagerBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      if (this.cC) {
         this.cC = false;
      }

      if (!this.gp() && this.cp > 0) {
         this.cp--;
         if (this.cp <= 0) {
            if (this.cq) {
               this.gV();
               this.cq = false;
            }

            this.b(new bsq(bss.j, 200, 0));
         }
      }

      if (this.cr != null && this.dS() instanceof arg) {
         ((arg)this.dS()).a(cff.e, this.cr, this);
         this.dS().a(this, (byte)14);
         this.cr = null;
      }

      if (!this.gd() && this.af.a(100) == 0) {
         cpc $$0 = ((arg)this.dS()).d(this.ds());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dS().a(this, (byte)42);
         }
      }

      if (this.gy().b() == cnf.b && this.gp()) {
         this.gu();
      }

      super.ad();
   }

   @Override
   public void l() {
      super.l();
      if (this.q() > 0) {
         this.s(this.q() - 1);
      }

      this.gX();
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.tK) || !this.bI() || this.gp() || this.fL()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gK();
         return brk.a;
      } else {
         if (!this.dS().B) {
            boolean $$3 = this.gq().isEmpty();
            if ($$1 == brj.a) {
               if ($$3) {
                  this.gK();
               }

               $$0.a(awn.S);
            }

            if ($$3) {
               return brk.c;
            }

            this.g($$0);
         }

         return brk.a;
      }
   }

   private void gK() {
      this.s(40);
      if (!this.dS().w_()) {
         this.b(awd.Bc);
      }
   }

   private void g(cnp $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.Q_(), this.gy().c());
   }

   @Override
   public void a(@Nullable cnp $$0) {
      boolean $$1 = this.go() != null && $$0 == null;
      super.a($$0);
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
      if (!this.dS().w_()) {
         for (dcp $$0 : this.gq()) {
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
      return this.dS().B;
   }

   public void gB() {
      this.gQ();

      for (dcp $$0 : this.gq()) {
         $$0.j();
      }

      this.gM();
      this.cy = this.dS().aa();
      this.cz++;
   }

   private void gM() {
      dcq $$0 = this.gq();
      cnp $$1 = this.go();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.ca.l, $$0, this.gy().c(), this.t(), this.gr(), this.gA());
      }
   }

   private boolean gN() {
      for (dcp $$0 : this.gq()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gO() {
      return this.cz == 0 || this.cz < 2 && this.dS().aa() > this.cy + 2400L;
   }

   public boolean gC() {
      long $$0 = this.cy + 12000L;
      long $$1 = this.dS().aa();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dS().ab();
      if (this.cB > 0L) {
         long $$4 = this.cB / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cB = $$3;
      if ($$2) {
         this.cy = $$1;
         this.gY();
      }

      return this.gO() && this.gN();
   }

   private void gP() {
      int $$0 = 2 - this.cz;
      if ($$0 > 0) {
         for (dcp $$1 : this.gq()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gQ();
      }

      this.gM();
   }

   private void gQ() {
      for (dcp $$0 : this.gq()) {
         $$0.g();
      }
   }

   private void h(cnp $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dcp $$2 : this.gq()) {
            $$2.a(-azc.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bss.F)) {
         bsq $$3 = $$0.c(bss.F);
         int $$4 = $$3.e();

         for (dcp $$5 : this.gq()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().J());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cg, new cnd(cnh.c, cnf.b, 1));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      cnd.c.encodeStart(ut.a, this.gy()).resultOrPartial(cf::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.ct);
      $$0.a("Gossips", this.cu.a(ut.a));
      $$0.a("Xp", this.cx);
      $$0.a("LastRestock", this.cy);
      $$0.a("LastGossipDecay", this.cw);
      $$0.a("RestocksToday", this.cz);
      if (this.cC) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cnd.c.parse(ut.a, $$0.c("VillagerData")).resultOrPartial(cf::error).ifPresent($$0x -> this.am.a(cg, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.ct = $$0.f("FoodLevel");
      }

      ul $$1 = $$0.c("Gossips", 10);
      this.cu.a(new Dynamic(ut.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cx = $$0.h("Xp");
      }

      this.cy = $$0.i("LastRestock");
      this.cw = $$0.i("LastGossipDecay");
      this.a_(true);
      if (this.dS() instanceof arg) {
         this.a((arg)this.dS());
      }

      this.cz = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cC = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected awc w() {
      if (this.fL()) {
         return null;
      } else {
         return this.gp() ? awd.Bd : awd.AY;
      }
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.Bb;
   }

   @Override
   protected awc n_() {
      return awd.Ba;
   }

   public void gD() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(cnd $$0) {
      cnd $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ca = null;
      }

      this.am.a(cg, $$0);
   }

   @Override
   public cnd gy() {
      return this.am.a(cg);
   }

   @Override
   protected void b(dcp $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cx = this.cx + $$0.q();
      this.cr = this.go();
      if (this.gU()) {
         this.cp = 40;
         this.cq = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dS().b(new btv(this.dS(), this.dx(), this.dz() + 0.5, this.dD(), $$1));
      }
   }

   public void y(boolean $$0) {
      this.cs = $$0;
   }

   public boolean gE() {
      return this.cs;
   }

   @Override
   public void a(@Nullable buf $$0) {
      if ($$0 != null && this.dS() instanceof arg) {
         ((arg)this.dS()).a(cff.c, $$0, this);
         if (this.bI() && $$0 instanceof cnp) {
            this.dS().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bsb $$0) {
      cf.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      btj $$1 = $$0.d();
      if ($$1 != null) {
         this.c($$1);
      }

      this.gR();
      super.a($$0);
   }

   private void gR() {
      this.a(cdi.b);
      this.a(cdi.c);
      this.a(cdi.d);
      this.a(cdi.e);
   }

   private void c(btj $$0) {
      if (this.dS() instanceof arg $$1) {
         Optional<cdk> $$3 = this.bC.c(cdi.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(but.class::isInstance).forEach($$2x -> $$1.a(cff.d, $$0, (but)$$2x));
         }
      }
   }

   public void a(cdi<jm> $$0) {
      if (this.dS() instanceof arg) {
         MinecraftServer $$1 = ((arg)this.dS()).o();
         this.bC.c($$0).ifPresent($$2 -> {
            arg $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cfi $$4 = $$3.y();
               Optional<jn<cfl>> $$5 = $$4.c($$2.b());
               BiPredicate<cnc, jn<cfl>> $$6 = ce.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agn.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean aa_() {
      return this.ct + this.gW() >= 12 && !this.fL() && this.g() == 0;
   }

   private boolean gS() {
      return this.ct < 12;
   }

   private void gT() {
      if (this.gS() && this.gW() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cvl $$1 = this.y().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cc.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.J();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.ct = this.ct + $$2;
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

   public int f(cnp $$0) {
      return this.cu.a($$0.cD(), $$0x -> true);
   }

   private void v(int $$0) {
      this.ct -= $$0;
   }

   public void gF() {
      this.gT();
      this.v(12);
   }

   @Override
   public void b(dcq $$0) {
      this.ca = $$0;
   }

   private boolean gU() {
      int $$0 = this.gy().c();
      return cnd.d($$0) && this.cx >= cnd.c($$0);
   }

   private void gV() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gv();
   }

   @Override
   protected xd cw() {
      return xd.c(this.ao().g() + "." + lu.x.b(this.gy().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(ln.Q);
      } else if ($$0 == 13) {
         this.a(ln.a);
      } else if ($$0 == 14) {
         this.a(ln.O);
      } else if ($$0 == 42) {
         this.a(ln.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$2 == btp.e) {
         this.a(this.gy().a(cnf.b));
      }

      if ($$2 == btp.n || $$2 == btp.m || btp.a($$2) || $$2 == btp.o) {
         this.a(this.gy().a(cnh.a($$0.t(this.ds()))));
      }

      if ($$2 == btp.d) {
         this.cC = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cnc b(arg $$0, btc $$1) {
      double $$2 = this.af.j();
      cnh $$3;
      if ($$2 < 0.5) {
         $$3 = cnh.a($$0.t(this.ds()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cnc)$$1).gy().a();
      }

      cnc $$6 = new cnc(btq.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.ds()), btp.e, null);
      return $$6;
   }

   @Override
   public void a(arg $$0, bue $$1) {
      if ($$0.am() != brh.a) {
         cf.info("Villager {} was struck by lightning {}.", this, $$1);
         cll $$2 = btq.bo.a($$0, btp.i);
         if ($$2 != null) {
            $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$2.a($$0, $$0.d_($$2.ds()), btp.i, null);
            $$2.u(this.gd());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            $$2.fV();
            $$0.a_($$2);
            this.gR();
            this.as();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cjz $$0) {
      cna.a(this, this, $$0);
   }

   @Override
   public boolean l(cvl $$0) {
      cvg $$1 = $$0.h();
      return ($$0.a(axb.bC) || this.gy().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gG() {
      return this.gW() >= 24;
   }

   public boolean gH() {
      return this.gW() < 12;
   }

   private int gW() {
      brr $$0 = this.y();
      return cc.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gI() {
      return this.y().a_($$0 -> $$0.a(axb.bB));
   }

   @Override
   protected void gv() {
      cnd $$0 = this.gy();
      Int2ObjectMap<cng.g[]> $$2;
      if (this.dS().J().b(cqj.c)) {
         Int2ObjectMap<cng.g[]> $$1 = cng.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cng.a.get($$0.b());
      } else {
         $$2 = cng.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cng.g[] $$4 = (cng.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dcq $$5 = this.gq();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arg $$0, cnc $$1, long $$2) {
      if (($$2 < this.cv || $$2 >= this.cv + 1200L) && ($$2 < $$1.cv || $$2 >= $$1.cv + 1200L)) {
         this.cu.a($$1.cu, this.af, 10);
         this.cv = $$2;
         $$1.cv = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gX() {
      long $$0 = this.dS().aa();
      if (this.cw == 0L) {
         this.cw = $$0;
      } else if ($$0 >= this.cw + 24000L) {
         this.cu.b();
         this.cw = $$0;
      }
   }

   public void a(arg $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         exz $$3 = this.cO().c(10.0, 10.0, 10.0);
         List<cnc> $$4 = $$0.a(cnc.class, $$3);
         List<cnc> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azv.a(btq.af, btp.f, $$0, this.ds(), 10, 8, 6, azv.a.a).isEmpty()) {
               $$4.forEach(cea::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dS().aa()) ? false : !this.bC.a(cdi.F);
   }

   @Override
   public void a(cff $$0, btj $$1) {
      if ($$0 == cff.a) {
         this.cu.a($$1.cD(), cdf.d, 20);
         this.cu.a($$1.cD(), cdf.c, 25);
      } else if ($$0 == cff.e) {
         this.cu.a($$1.cD(), cdf.e, 2);
      } else if ($$0 == cff.c) {
         this.cu.a($$1.cD(), cdf.b, 25);
      } else if ($$0 == cff.d) {
         this.cu.a($$1.cD(), cdf.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cx;
   }

   public void u(int $$0) {
      this.cx = $$0;
   }

   private void gY() {
      this.gP();
      this.cz = 0;
   }

   public cde gJ() {
      return this.cu;
   }

   public void a(vc $$0) {
      this.cu.a(new Dynamic(ut.a, $$0));
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public void b(je $$0) {
      super.b($$0);
      this.bC.a(cdi.H, this.dS().aa());
      this.bC.b(cdi.m);
      this.bC.b(cdi.E);
   }

   @Override
   public void fM() {
      super.fM();
      this.bC.a(cdi.I, this.dS().aa());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bC.c(cdi.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
