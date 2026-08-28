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

public class cnh extends cnc implements buy, cnj {
   private static final Logger ce = LogUtils.getLogger();
   private static final akg<cni> cf = akk.a(cnh.class, aki.u);
   public static final int ca = 12;
   public static final Map<cvk, Integer> cb = ImmutableMap.of(cvt.py, 4, cvt.ui, 1, cvt.uh, 1, cvt.vm, 1);
   private static final int cg = 2;
   private static final int ch = 10;
   private static final int ci = 1200;
   private static final int cj = 24000;
   private static final int ck = 25;
   private static final int cl = 10;
   private static final int cm = 5;
   private static final long cn = 24000L;
   @VisibleForTesting
   public static final float cc = 0.5F;
   private int co;
   private boolean cp;
   @Nullable
   private cnu cq;
   private boolean cr;
   private int cs;
   private final cdj ct = new cdj();
   private long cu;
   private long cv;
   private int cw;
   private long cx;
   private int cy;
   private long cA;
   private boolean cB;
   private static final ImmutableList<cdn<?>> cC = ImmutableList.of(
      cdn.b,
      cdn.c,
      cdn.d,
      cdn.e,
      cdn.g,
      cdn.h,
      cdn.i,
      cdn.j,
      cdn.k,
      cdn.l,
      cdn.L,
      cdn.aP,
      new cdn[]{cdn.m, cdn.n, cdn.q, cdn.r, cdn.t, cdn.v, cdn.w, cdn.x, cdn.y, cdn.A, cdn.f, cdn.C, cdn.D, cdn.E, cdn.H, cdn.I, cdn.J, cdn.F}
   );
   private static final ImmutableList<ceu<? extends cet<? super cnh>>> cD = ImmutableList.of(ceu.c, ceu.d, ceu.b, ceu.e, ceu.f, ceu.g, ceu.h, ceu.i, ceu.j);
   public static final Map<cdn<jm>, BiPredicate<cnh, jn<cfq>>> cd = ImmutableMap.of(
      cdn.b,
      (BiPredicate<cnh, jn>)($$0, $$1) -> $$1.a(cfr.n),
      cdn.c,
      (BiPredicate<cnh, jn>)($$0, $$1) -> $$0.gz().b().b().test($$1),
      cdn.d,
      (BiPredicate<cnh, jn>)($$0, $$1) -> cnk.a.test($$1),
      cdn.e,
      (BiPredicate<cnh, jn>)($$0, $$1) -> $$1.a(cfr.o)
   );

   public cnh(btv<? extends cnh> $$0, deg $$1) {
      this($$0, $$1, cnm.c);
   }

   public cnh(btv<? extends cnh> $$0, deg $$1, cnm $$2) {
      super($$0, $$1);
      ((cdu)this.P()).b(true);
      this.P().a(true);
      this.P().a(48.0F);
      this.a_(true);
      this.a(this.gz().a($$2).a(cnk.b));
   }

   @Override
   public bvl<cnh> dX() {
      return (bvl<cnh>)super.dX();
   }

   @Override
   protected bvl.b<cnh> dY() {
      return bvl.a(cC, cD);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      bvl<cnh> $$1 = this.dY().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(arh $$0) {
      bvl<cnh> $$1 = this.dX();
      $$1.b($$0, this);
      this.bB = $$1.i();
      this.a(this.dX());
   }

   private void a(bvl<cnh> $$0) {
      cnk $$1 = this.gz().b();
      if (this.o_()) {
         $$0.a(cpo.e);
         $$0.a(cpm.d, bzi.a(0.5F));
      } else {
         $$0.a(cpo.f);
         $$0.a(cpm.c, bzi.b($$1, 0.5F), ImmutableSet.of(Pair.of(cdn.c, cdo.a)));
      }

      $$0.a(cpm.a, bzi.a($$1, 0.5F));
      $$0.a(cpm.f, bzi.d($$1, 0.5F), ImmutableSet.of(Pair.of(cdn.e, cdo.a)));
      $$0.a(cpm.e, bzi.c($$1, 0.5F));
      $$0.a(cpm.b, bzi.e($$1, 0.5F));
      $$0.a(cpm.g, bzi.f($$1, 0.5F));
      $$0.a(cpm.i, bzi.g($$1, 0.5F));
      $$0.a(cpm.h, bzi.h($$1, 0.5F));
      $$0.a(cpm.j, bzi.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cpm.a));
      $$0.b(cpm.b);
      $$0.a(cpm.b);
      $$0.a(this.dS().ab(), this.dS().aa());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dS() instanceof arh) {
         this.a((arh)this.dS());
      }
   }

   public static bvq.a gy() {
      return bum.E().a(bvr.v, 0.5);
   }

   public boolean gA() {
      return this.cB;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("villagerBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      if (this.cB) {
         this.cB = false;
      }

      if (!this.gq() && this.co > 0) {
         this.co--;
         if (this.co <= 0) {
            if (this.cp) {
               this.gW();
               this.cp = false;
            }

            this.a(new bsv(bsx.j, 200, 0));
         }
      }

      if (this.cq != null && this.dS() instanceof arh) {
         ((arh)this.dS()).a(cfk.e, this.cq, this);
         this.dS().a(this, (byte)14);
         this.cq = null;
      }

      if (!this.ge() && this.af.a(100) == 0) {
         cpi $$0 = ((arh)this.dS()).d(this.ds());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dS().a(this, (byte)42);
         }
      }

      if (this.gz().b() == cnk.b && this.gq()) {
         this.gv();
      }

      super.ad();
   }

   @Override
   public void l() {
      super.l();
      if (this.q() > 0) {
         this.s(this.q() - 1);
      }

      this.gY();
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if ($$2.a(cvt.tK) || !this.bI() || this.gq() || this.fM()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gL();
         return brp.a;
      } else {
         if (!this.dS().B) {
            boolean $$3 = this.gr().isEmpty();
            if ($$1 == bro.a) {
               if ($$3) {
                  this.gL();
               }

               $$0.a(awo.S);
            }

            if ($$3) {
               return brp.c;
            }

            this.g($$0);
         }

         return brp.a;
      }
   }

   private void gL() {
      this.s(40);
      if (!this.dS().w_()) {
         this.b(awe.Bc);
      }
   }

   private void g(cnu $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.Q_(), this.gz().c());
   }

   @Override
   public void a(@Nullable cnu $$0) {
      boolean $$1 = this.gp() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gv();
      }
   }

   @Override
   protected void gv() {
      super.gv();
      this.gM();
   }

   private void gM() {
      if (!this.dS().w_()) {
         for (ddd $$0 : this.gr()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gB() {
      return true;
   }

   @Override
   public boolean gx() {
      return this.dS().B;
   }

   public void gC() {
      this.gR();

      for (ddd $$0 : this.gr()) {
         $$0.j();
      }

      this.gN();
      this.cx = this.dS().aa();
      this.cy++;
   }

   private void gN() {
      dde $$0 = this.gr();
      cnu $$1 = this.gp();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bZ.l, $$0, this.gz().c(), this.t(), this.gs(), this.gB());
      }
   }

   private boolean gO() {
      for (ddd $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gP() {
      return this.cy == 0 || this.cy < 2 && this.dS().aa() > this.cx + 2400L;
   }

   public boolean gD() {
      long $$0 = this.cx + 12000L;
      long $$1 = this.dS().aa();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dS().ab();
      if (this.cA > 0L) {
         long $$4 = this.cA / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cA = $$3;
      if ($$2) {
         this.cx = $$1;
         this.gZ();
      }

      return this.gP() && this.gO();
   }

   private void gQ() {
      int $$0 = 2 - this.cy;
      if ($$0 > 0) {
         for (ddd $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gR();
      }

      this.gN();
   }

   private void gR() {
      for (ddd $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void h(cnu $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (ddd $$2 : this.gr()) {
            $$2.a(-azd.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bsx.F)) {
         bsv $$3 = $$0.c(bsx.F);
         int $$4 = $$3.e();

         for (ddd $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().J());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, new cni(cnm.c, cnk.b, 1));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      cni.c.encodeStart(ut.a, this.gz()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cs);
      $$0.a("Gossips", this.ct.a(ut.a));
      $$0.a("Xp", this.cw);
      $$0.a("LastRestock", this.cx);
      $$0.a("LastGossipDecay", this.cv);
      $$0.a("RestocksToday", this.cy);
      if (this.cB) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cni.c.parse(ut.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.am.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cs = $$0.f("FoodLevel");
      }

      ul $$1 = $$0.c("Gossips", 10);
      this.ct.a(new Dynamic(ut.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cw = $$0.h("Xp");
      }

      this.cx = $$0.i("LastRestock");
      this.cv = $$0.i("LastGossipDecay");
      if (this.dS() instanceof arh) {
         this.a((arh)this.dS());
      }

      this.cy = $$0.h("RestocksToday");
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
   protected awd w() {
      if (this.fM()) {
         return null;
      } else {
         return this.gq() ? awe.Bd : awe.AY;
      }
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.Bb;
   }

   @Override
   protected awd n_() {
      return awe.Ba;
   }

   public void gE() {
      this.b(this.gz().b().f());
   }

   @Override
   public void a(cni $$0) {
      cni $$1 = this.gz();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.am.a(cf, $$0);
   }

   @Override
   public cni gz() {
      return this.am.a(cf);
   }

   @Override
   protected void b(ddd $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cw = this.cw + $$0.q();
      this.cq = this.gp();
      if (this.gV()) {
         this.co = 40;
         this.cp = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dS().b(new bua(this.dS(), this.dx(), this.dz() + 0.5, this.dD(), $$1));
      }
   }

   public void y(boolean $$0) {
      this.cr = $$0;
   }

   public boolean gF() {
      return this.cr;
   }

   @Override
   public void a(@Nullable buk $$0) {
      if ($$0 != null && this.dS() instanceof arh) {
         ((arh)this.dS()).a(cfk.c, $$0, this);
         if (this.bI() && $$0 instanceof cnu) {
            this.dS().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bsg $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bto $$1 = $$0.d();
      if ($$1 != null) {
         this.c($$1);
      }

      this.gS();
      super.a($$0);
   }

   private void gS() {
      this.a(cdn.b);
      this.a(cdn.c);
      this.a(cdn.d);
      this.a(cdn.e);
   }

   private void c(bto $$0) {
      if (this.dS() instanceof arh $$1) {
         Optional<cdp> $$3 = this.bB.c(cdn.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(buy.class::isInstance).forEach($$2x -> $$1.a(cfk.d, $$0, (buy)$$2x));
         }
      }
   }

   public void a(cdn<jm> $$0) {
      if (this.dS() instanceof arh) {
         MinecraftServer $$1 = ((arh)this.dS()).o();
         this.bB.c($$0).ifPresent($$2 -> {
            arh $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cfn $$4 = $$3.y();
               Optional<jn<cfq>> $$5 = $$4.c($$2.b());
               BiPredicate<cnh, jn<cfq>> $$6 = cd.get($$0);
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
      return this.cs + this.gX() >= 12 && !this.fM() && this.g() == 0;
   }

   private boolean gT() {
      return this.cs < 12;
   }

   private void gU() {
      if (this.gT() && this.gX() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cvp $$1 = this.y().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cb.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.J();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cs = this.cs + $$2;
                     this.y().a($$0, 1);
                     if (!this.gT()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(cnu $$0) {
      return this.ct.a($$0.cD(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cs -= $$0;
   }

   public void gG() {
      this.gU();
      this.v(12);
   }

   @Override
   public void b(dde $$0) {
      this.bZ = $$0;
   }

   private boolean gV() {
      int $$0 = this.gz().c();
      return cni.d($$0) && this.cw >= cni.c($$0);
   }

   private void gW() {
      this.a(this.gz().a(this.gz().c() + 1));
      this.gw();
   }

   @Override
   protected xd cw() {
      return xd.c(this.ao().g() + "." + lu.x.b(this.gz().b()).a());
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
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$2 == btu.e) {
         this.a(this.gz().a(cnk.b));
      }

      if ($$2 == btu.n || $$2 == btu.m || btu.a($$2) || $$2 == btu.o) {
         this.a(this.gz().a(cnm.a($$0.t(this.ds()))));
      }

      if ($$2 == btu.d) {
         this.cB = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cnh b(arh $$0, bth $$1) {
      double $$2 = this.af.j();
      cnm $$3;
      if ($$2 < 0.5) {
         $$3 = cnm.a($$0.t(this.ds()));
      } else if ($$2 < 0.75) {
         $$3 = this.gz().a();
      } else {
         $$3 = ((cnh)$$1).gz().a();
      }

      cnh $$6 = new cnh(btv.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.ds()), btu.e, null);
      return $$6;
   }

   @Override
   public void a(arh $$0, buj $$1) {
      if ($$0.am() != brm.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         clq $$2 = btv.bo.a($$0, btu.i);
         if ($$2 != null) {
            $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$2.a($$0, $$0.d_($$2.ds()), btu.i, null);
            $$2.u(this.ge());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            $$2.fW();
            $$0.a_($$2);
            this.gS();
            this.as();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cke $$0) {
      cnf.a(this, this, $$0);
   }

   @Override
   public boolean j(cvp $$0) {
      cvk $$1 = $$0.h();
      return ($$0.a(axc.bC) || this.gz().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gH() {
      return this.gX() >= 24;
   }

   public boolean gI() {
      return this.gX() < 12;
   }

   private int gX() {
      brw $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gJ() {
      return this.y().a_($$0 -> $$0.a(axc.bB));
   }

   @Override
   protected void gw() {
      cni $$0 = this.gz();
      Int2ObjectMap<cnl.g[]> $$2;
      if (this.dS().J().b(cqp.c)) {
         Int2ObjectMap<cnl.g[]> $$1 = cnl.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cnl.a.get($$0.b());
      } else {
         $$2 = cnl.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cnl.g[] $$4 = (cnl.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dde $$5 = this.gr();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arh $$0, cnh $$1, long $$2) {
      if (($$2 < this.cu || $$2 >= this.cu + 1200L) && ($$2 < $$1.cu || $$2 >= $$1.cu + 1200L)) {
         this.ct.a($$1.ct, this.af, 10);
         this.cu = $$2;
         $$1.cu = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gY() {
      long $$0 = this.dS().aa();
      if (this.cv == 0L) {
         this.cv = $$0;
      } else if ($$0 >= this.cv + 24000L) {
         this.ct.b();
         this.cv = $$0;
      }
   }

   public void a(arh $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         eyn $$3 = this.cO().c(10.0, 10.0, 10.0);
         List<cnh> $$4 = $$0.a(cnh.class, $$3);
         List<cnh> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!azw.a(btv.af, btu.f, $$0, this.ds(), 10, 8, 6, azw.a.a).isEmpty()) {
               $$4.forEach(cef::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dS().aa()) ? false : !this.bB.a(cdn.F);
   }

   @Override
   public void a(cfk $$0, bto $$1) {
      if ($$0 == cfk.a) {
         this.ct.a($$1.cD(), cdk.d, 20);
         this.ct.a($$1.cD(), cdk.c, 25);
      } else if ($$0 == cfk.e) {
         this.ct.a($$1.cD(), cdk.e, 2);
      } else if ($$0 == cfk.c) {
         this.ct.a($$1.cD(), cdk.b, 25);
      } else if ($$0 == cfk.d) {
         this.ct.a($$1.cD(), cdk.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cw;
   }

   public void u(int $$0) {
      this.cw = $$0;
   }

   private void gZ() {
      this.gQ();
      this.cy = 0;
   }

   public cdj gK() {
      return this.ct;
   }

   public void a(vc $$0) {
      this.ct.a(new Dynamic(ut.a, $$0));
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public void b(je $$0) {
      super.b($$0);
      this.bB.a(cdn.H, this.dS().aa());
      this.bB.b(cdn.m);
      this.bB.b(cdn.E);
   }

   @Override
   public void fN() {
      super.fN();
      this.bB.a(cdn.I, this.dS().aa());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bB.c(cdn.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
