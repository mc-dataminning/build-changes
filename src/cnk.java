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

public class cnk extends cnf implements bvb, cnm {
   private static final Logger ce = LogUtils.getLogger();
   private static final akh<cnl> cf = akl.a(cnk.class, akj.u);
   public static final int ca = 12;
   public static final Map<cvn, Integer> cb = ImmutableMap.of(cvw.py, 4, cvw.ui, 1, cvw.uh, 1, cvw.vm, 1);
   private static final int cg = 2;
   private static final int ch = 10;
   private static final int ci = 1200;
   private static final int cj = 24000;
   private static final int ck = 10;
   private static final int cl = 5;
   private static final long cm = 24000L;
   @VisibleForTesting
   public static final float cc = 0.5F;
   private int cn;
   private boolean co;
   @Nullable
   private cnx cp;
   private boolean cq;
   private int cr;
   private final cdm cs = new cdm();
   private long ct;
   private long cu;
   private int cv;
   private long cw;
   private int cx;
   private long cy;
   private boolean cA;
   private static final ImmutableList<cdq<?>> cB = ImmutableList.of(
      cdq.b,
      cdq.c,
      cdq.d,
      cdq.e,
      cdq.g,
      cdq.h,
      cdq.i,
      cdq.j,
      cdq.k,
      cdq.l,
      cdq.L,
      cdq.aP,
      new cdq[]{cdq.m, cdq.n, cdq.q, cdq.r, cdq.t, cdq.v, cdq.w, cdq.x, cdq.y, cdq.A, cdq.f, cdq.C, cdq.D, cdq.E, cdq.H, cdq.I, cdq.J, cdq.F}
   );
   private static final ImmutableList<cex<? extends cew<? super cnk>>> cC = ImmutableList.of(cex.c, cex.d, cex.b, cex.e, cex.f, cex.g, cex.h, cex.i, cex.j);
   public static final Map<cdq<jn>, BiPredicate<cnk, jo<cft>>> cd = ImmutableMap.of(
      cdq.b,
      (BiPredicate<cnk, jo>)($$0, $$1) -> $$1.a(cfu.n),
      cdq.c,
      (BiPredicate<cnk, jo>)($$0, $$1) -> $$0.gy().b().b().test($$1),
      cdq.d,
      (BiPredicate<cnk, jo>)($$0, $$1) -> cnn.a.test($$1),
      cdq.e,
      (BiPredicate<cnk, jo>)($$0, $$1) -> $$1.a(cfu.o)
   );

   public cnk(bty<? extends cnk> $$0, dej $$1) {
      this($$0, $$1, cnp.c);
   }

   public cnk(bty<? extends cnk> $$0, dej $$1, cnp $$2) {
      super($$0, $$1);
      ((cdx)this.P()).b(true);
      this.P().a(true);
      this.P().a(48.0F);
      this.a_(true);
      this.a(this.gy().a($$2).a(cnn.b));
   }

   @Override
   public bvo<cnk> dY() {
      return (bvo<cnk>)super.dY();
   }

   @Override
   protected bvo.b<cnk> dZ() {
      return bvo.a(cB, cC);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      bvo<cnk> $$1 = this.dZ().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(arj $$0) {
      bvo<cnk> $$1 = this.dY();
      $$1.b($$0, this);
      this.bB = $$1.i();
      this.a(this.dY());
   }

   private void a(bvo<cnk> $$0) {
      cnn $$1 = this.gy().b();
      if (this.p_()) {
         $$0.a(cpr.e);
         $$0.a(cpp.d, bzl.a(0.5F));
      } else {
         $$0.a(cpr.f);
         $$0.a(cpp.c, bzl.b($$1, 0.5F), ImmutableSet.of(Pair.of(cdq.c, cdr.a)));
      }

      $$0.a(cpp.a, bzl.a($$1, 0.5F));
      $$0.a(cpp.f, bzl.d($$1, 0.5F), ImmutableSet.of(Pair.of(cdq.e, cdr.a)));
      $$0.a(cpp.e, bzl.c($$1, 0.5F));
      $$0.a(cpp.b, bzl.e($$1, 0.5F));
      $$0.a(cpp.g, bzl.f($$1, 0.5F));
      $$0.a(cpp.i, bzl.g($$1, 0.5F));
      $$0.a(cpp.h, bzl.h($$1, 0.5F));
      $$0.a(cpp.j, bzl.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cpp.a));
      $$0.b(cpp.b);
      $$0.a(cpp.b);
      $$0.a(this.dS().ab(), this.dS().aa());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dS() instanceof arj) {
         this.a((arj)this.dS());
      }
   }

   public static bvt.a gx() {
      return bup.E().a(bvu.v, 0.5);
   }

   public boolean gz() {
      return this.cA;
   }

   @Override
   protected void ac() {
      this.dS().ah().a("villagerBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      if (this.cA) {
         this.cA = false;
      }

      if (!this.gp() && this.cn > 0) {
         this.cn--;
         if (this.cn <= 0) {
            if (this.co) {
               this.gU();
               this.co = false;
            }

            this.a(new bsy(bta.j, 200, 0));
         }
      }

      if (this.cp != null && this.dS() instanceof arj) {
         ((arj)this.dS()).a(cfn.e, this.cp, this);
         this.dS().a(this, (byte)14);
         this.cp = null;
      }

      if (!this.gd() && this.af.a(100) == 0) {
         cpl $$0 = ((arj)this.dS()).d(this.ds());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dS().a(this, (byte)42);
         }
      }

      if (this.gy().b() == cnn.b && this.gp()) {
         this.gu();
      }

      super.ac();
   }

   @Override
   public void l() {
      super.l();
      if (this.q() > 0) {
         this.s(this.q() - 1);
      }

      this.gW();
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(cvw.tK) || !this.bI() || this.gp() || this.fN()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gJ();
         return brs.a;
      } else {
         if (!this.dS().B) {
            boolean $$3 = this.gq().isEmpty();
            if ($$1 == brr.a) {
               if ($$3) {
                  this.gJ();
               }

               $$0.a(awq.S);
            }

            if ($$3) {
               return brs.c;
            }

            this.g($$0);
         }

         return brs.a;
      }
   }

   private void gJ() {
      this.s(40);
      if (!this.dS().x_()) {
         this.b(awg.Bc);
      }
   }

   private void g(cnx $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.R_(), this.gy().c());
   }

   @Override
   public void a(@Nullable cnx $$0) {
      boolean $$1 = this.go() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gu();
      }
   }

   @Override
   protected void gu() {
      super.gu();
      this.gK();
   }

   private void gK() {
      if (!this.dS().x_()) {
         for (ddg $$0 : this.gq()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gA() {
      return true;
   }

   public void gB() {
      this.gP();

      for (ddg $$0 : this.gq()) {
         $$0.j();
      }

      this.gL();
      this.cw = this.dS().aa();
      this.cx++;
   }

   private void gL() {
      ddh $$0 = this.gq();
      cnx $$1 = this.go();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bZ.l, $$0, this.gy().c(), this.t(), this.gr(), this.gA());
      }
   }

   private boolean gM() {
      for (ddg $$0 : this.gq()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gN() {
      return this.cx == 0 || this.cx < 2 && this.dS().aa() > this.cw + 2400L;
   }

   public boolean gC() {
      long $$0 = this.cw + 12000L;
      long $$1 = this.dS().aa();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dS().ab();
      if (this.cy > 0L) {
         long $$4 = this.cy / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cy = $$3;
      if ($$2) {
         this.cw = $$1;
         this.gX();
      }

      return this.gN() && this.gM();
   }

   private void gO() {
      int $$0 = 2 - this.cx;
      if ($$0 > 0) {
         for (ddg $$1 : this.gq()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gP();
      }

      this.gL();
   }

   private void gP() {
      for (ddg $$0 : this.gq()) {
         $$0.g();
      }
   }

   private void h(cnx $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (ddg $$2 : this.gq()) {
            $$2.a(-azf.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bta.F)) {
         bsy $$3 = $$0.c(bta.F);
         int $$4 = $$3.e();

         for (ddg $$5 : this.gq()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().K());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(cf, new cnl(cnp.c, cnn.b, 1));
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      cnl.c.encodeStart(uu.a, this.gy()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cr);
      $$0.a("Gossips", this.cs.a(uu.a));
      $$0.a("Xp", this.cv);
      $$0.a("LastRestock", this.cw);
      $$0.a("LastGossipDecay", this.cu);
      $$0.a("RestocksToday", this.cx);
      if (this.cA) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cnl.c.parse(uu.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.am.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cr = $$0.f("FoodLevel");
      }

      um $$1 = $$0.c("Gossips", 10);
      this.cs.a(new Dynamic(uu.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cv = $$0.h("Xp");
      }

      this.cw = $$0.i("LastRestock");
      this.cu = $$0.i("LastGossipDecay");
      if (this.dS() instanceof arj) {
         this.a((arj)this.dS());
      }

      this.cx = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cA = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected awf w() {
      if (this.fN()) {
         return null;
      } else {
         return this.gp() ? awg.Bd : awg.AY;
      }
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.Bb;
   }

   @Override
   protected awf o_() {
      return awg.Ba;
   }

   public void gD() {
      this.b(this.gy().b().f());
   }

   @Override
   public void a(cnl $$0) {
      cnl $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.am.a(cf, $$0);
   }

   @Override
   public cnl gy() {
      return this.am.a(cf);
   }

   @Override
   protected void b(ddg $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.go();
      if (this.gT()) {
         this.cn = 40;
         this.co = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dS().b(new bud(this.dS(), this.dx(), this.dz() + 0.5, this.dD(), $$1));
      }
   }

   @Override
   public void a(@Nullable bun $$0) {
      if ($$0 != null && this.dS() instanceof arj) {
         ((arj)this.dS()).a(cfn.c, $$0, this);
         if (this.bI() && $$0 instanceof cnx) {
            this.dS().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bsj $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      btr $$1 = $$0.d();
      if ($$1 != null) {
         this.c($$1);
      }

      this.gQ();
      super.a($$0);
   }

   private void gQ() {
      this.a(cdq.b);
      this.a(cdq.c);
      this.a(cdq.d);
      this.a(cdq.e);
   }

   private void c(btr $$0) {
      if (this.dS() instanceof arj $$1) {
         Optional<cds> $$3 = this.bB.c(cdq.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvb.class::isInstance).forEach($$2x -> $$1.a(cfn.d, $$0, (bvb)$$2x));
         }
      }
   }

   public void a(cdq<jn> $$0) {
      if (this.dS() instanceof arj) {
         MinecraftServer $$1 = ((arj)this.dS()).o();
         this.bB.c($$0).ifPresent($$2 -> {
            arj $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cfq $$4 = $$3.y();
               Optional<jo<cft>> $$5 = $$4.c($$2.b());
               BiPredicate<cnk, jo<cft>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  ago.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean ab_() {
      return this.cr + this.gV() >= 12 && !this.fN() && this.g() == 0;
   }

   private boolean gR() {
      return this.cr < 12;
   }

   private void gS() {
      if (this.gR() && this.gV() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cvs $$1 = this.y().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cb.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.K();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cr = this.cr + $$2;
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

   public int f(cnx $$0) {
      return this.cs.a($$0.cD(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cr -= $$0;
   }

   public void gE() {
      this.gS();
      this.v(12);
   }

   @Override
   public void b(ddh $$0) {
      this.bZ = $$0;
   }

   private boolean gT() {
      int $$0 = this.gy().c();
      return cnl.d($$0) && this.cv >= cnl.c($$0);
   }

   private void gU() {
      this.a(this.gy().a(this.gy().c() + 1));
      this.gv();
   }

   @Override
   protected xe cw() {
      return xe.c(this.ao().g() + "." + lv.x.b(this.gy().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lo.Q);
      } else if ($$0 == 13) {
         this.a(lo.a);
      } else if ($$0 == 14) {
         this.a(lo.O);
      } else if ($$0 == 42) {
         this.a(lo.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$2 == btx.e) {
         this.a(this.gy().a(cnn.b));
      }

      if ($$2 == btx.n || $$2 == btx.m || btx.a($$2) || $$2 == btx.o) {
         this.a(this.gy().a(cnp.a($$0.t(this.ds()))));
      }

      if ($$2 == btx.d) {
         this.cA = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cnk b(arj $$0, btk $$1) {
      double $$2 = this.af.j();
      cnp $$3;
      if ($$2 < 0.5) {
         $$3 = cnp.a($$0.t(this.ds()));
      } else if ($$2 < 0.75) {
         $$3 = this.gy().a();
      } else {
         $$3 = ((cnk)$$1).gy().a();
      }

      cnk $$6 = new cnk(bty.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.ds()), btx.e, null);
      return $$6;
   }

   @Override
   public void a(arj $$0, bum $$1) {
      if ($$0.am() != brp.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         clt $$2 = bty.bo.a($$0, btx.i);
         if ($$2 != null) {
            $$2.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$2.a($$0, $$0.d_($$2.ds()), btx.i, null);
            $$2.u(this.gd());
            if (this.ak()) {
               $$2.b(this.al());
               $$2.p(this.cI());
            }

            $$2.fW();
            $$0.a_($$2);
            this.gQ();
            this.as();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(ckh $$0) {
      cni.a(this, this, $$0);
   }

   @Override
   public boolean j(cvs $$0) {
      cvn $$1 = $$0.h();
      return ($$0.a(axe.bC) || this.gy().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gF() {
      return this.gV() >= 24;
   }

   public boolean gG() {
      return this.gV() < 12;
   }

   private int gV() {
      brz $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gH() {
      return this.y().a_($$0 -> $$0.a(axe.bB));
   }

   @Override
   protected void gv() {
      cnl $$0 = this.gy();
      Int2ObjectMap<cno.g[]> $$2;
      if (this.dS().J().b(cqs.c)) {
         Int2ObjectMap<cno.g[]> $$1 = cno.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cno.a.get($$0.b());
      } else {
         $$2 = cno.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cno.g[] $$4 = (cno.g[])$$2.get($$0.c());
         if ($$4 != null) {
            ddh $$5 = this.gq();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arj $$0, cnk $$1, long $$2) {
      if (($$2 < this.ct || $$2 >= this.ct + 1200L) && ($$2 < $$1.ct || $$2 >= $$1.ct + 1200L)) {
         this.cs.a($$1.cs, this.af, 10);
         this.ct = $$2;
         $$1.ct = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gW() {
      long $$0 = this.dS().aa();
      if (this.cu == 0L) {
         this.cu = $$0;
      } else if ($$0 >= this.cu + 24000L) {
         this.cs.b();
         this.cu = $$0;
      }
   }

   public void a(arj $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         eyr $$3 = this.cO().c(10.0, 10.0, 10.0);
         List<cnk> $$4 = $$0.a(cnk.class, $$3);
         List<cnk> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!azy.a(bty.af, btx.f, $$0, this.ds(), 10, 8, 6, azy.a.a).isEmpty()) {
               $$4.forEach(cei::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dS().aa()) ? false : !this.bB.a(cdq.F);
   }

   @Override
   public void a(cfn $$0, btr $$1) {
      if ($$0 == cfn.a) {
         this.cs.a($$1.cD(), cdn.d, 20);
         this.cs.a($$1.cD(), cdn.c, 25);
      } else if ($$0 == cfn.e) {
         this.cs.a($$1.cD(), cdn.e, 2);
      } else if ($$0 == cfn.c) {
         this.cs.a($$1.cD(), cdn.b, 25);
      } else if ($$0 == cfn.d) {
         this.cs.a($$1.cD(), cdn.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cv;
   }

   public void u(int $$0) {
      this.cv = $$0;
   }

   private void gX() {
      this.gO();
      this.cx = 0;
   }

   public cdm gI() {
      return this.cs;
   }

   public void a(vd $$0) {
      this.cs.a(new Dynamic(uu.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Override
   public void b(jf $$0) {
      super.b($$0);
      this.bB.a(cdq.H, this.dS().aa());
      this.bB.b(cdq.m);
      this.bB.b(cdq.E);
   }

   @Override
   public void fO() {
      super.fO();
      this.bB.a(cdq.I, this.dS().aa());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bB.c(cdq.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
