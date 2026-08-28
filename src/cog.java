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

public class cog extends cob implements bvu, coi {
   private static final Logger ce = LogUtils.getLogger();
   private static final ajx<coh> cf = akb.a(cog.class, ajz.u);
   public static final int ca = 12;
   public static final Map<cwj, Integer> cb = ImmutableMap.of(cwr.qc, 4, cwr.vf, 1, cwr.ve, 1, cwr.wk, 1);
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
   private cov cp;
   private boolean cq;
   private int cr;
   private final cef cs = new cef();
   private long ct;
   private long cu;
   private int cv;
   private long cw;
   private int cx;
   private long cy;
   private boolean cz;
   private static final ImmutableList<cej<?>> cC = ImmutableList.of(
      cej.b,
      cej.c,
      cej.d,
      cej.e,
      cej.g,
      cej.h,
      cej.i,
      cej.j,
      cej.k,
      cej.l,
      cej.L,
      cej.aP,
      new cej[]{cej.m, cej.n, cej.q, cej.r, cej.t, cej.v, cej.w, cej.x, cej.y, cej.A, cej.f, cej.C, cej.D, cej.E, cej.H, cej.I, cej.J, cej.F}
   );
   private static final ImmutableList<cfq<? extends cfp<? super cog>>> cD = ImmutableList.of(cfq.c, cfq.d, cfq.b, cfq.e, cfq.f, cfq.g, cfq.h, cfq.i, cfq.j);
   public static final Map<cej<jq>, BiPredicate<cog, jr<cgm>>> cd = ImmutableMap.of(
      cej.b,
      (BiPredicate<cog, jr>)($$0, $$1) -> $$1.a(cgn.n),
      cej.c,
      (BiPredicate<cog, jr>)($$0, $$1) -> $$0.gz().b().b().test($$1),
      cej.d,
      (BiPredicate<cog, jr>)($$0, $$1) -> coj.a.test($$1),
      cej.e,
      (BiPredicate<cog, jr>)($$0, $$1) -> $$1.a(cgn.o)
   );

   public cog(buq<? extends cog> $$0, dgg $$1) {
      this($$0, $$1, col.c);
   }

   public cog(buq<? extends cog> $$0, dgg $$1, col $$2) {
      super($$0, $$1);
      ((ceq)this.L()).b(true);
      this.L().a(true);
      this.L().a(48.0F);
      this.a_(true);
      this.a(this.gz().a($$2).a(coj.b));
   }

   @Override
   public bwh<cog> ec() {
      return (bwh<cog>)super.ec();
   }

   @Override
   protected bwh.b<cog> ed() {
      return bwh.a(cC, cD);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      bwh<cog> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(arc $$0) {
      bwh<cog> $$1 = this.ec();
      $$1.b($$0, this);
      this.bE = $$1.i();
      this.a(this.ec());
   }

   private void a(bwh<cog> $$0) {
      coj $$1 = this.gz().b();
      if (this.e_()) {
         $$0.a(cqo.e);
         $$0.a(cqm.d, cae.a(0.5F));
      } else {
         $$0.a(cqo.f);
         $$0.a(cqm.c, cae.b($$1, 0.5F), ImmutableSet.of(Pair.of(cej.c, cek.a)));
      }

      $$0.a(cqm.a, cae.a($$1, 0.5F));
      $$0.a(cqm.f, cae.d($$1, 0.5F), ImmutableSet.of(Pair.of(cej.e, cek.a)));
      $$0.a(cqm.e, cae.c($$1, 0.5F));
      $$0.a(cqm.b, cae.e($$1, 0.5F));
      $$0.a(cqm.g, cae.f($$1, 0.5F));
      $$0.a(cqm.i, cae.g($$1, 0.5F));
      $$0.a(cqm.h, cae.h($$1, 0.5F));
      $$0.a(cqm.j, cae.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cqm.a));
      $$0.b(cqm.b);
      $$0.a(cqm.b);
      $$0.a(this.dW().ae(), this.dW().ad());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dW() instanceof arc) {
         this.g((arc)this.dW());
      }
   }

   public static bwm.a gy() {
      return bvh.C().a(bwn.v, 0.5);
   }

   public boolean gA() {
      return this.cz;
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("villagerBrain");
      this.ec().a($$0, this);
      $$1.c();
      if (this.cz) {
         this.cz = false;
      }

      if (!this.gq() && this.cn > 0) {
         this.cn--;
         if (this.cn <= 0) {
            if (this.co) {
               this.gV();
               this.co = false;
            }

            this.a(new bto(btq.j, 200, 0));
         }
      }

      if (this.cp != null) {
         $$0.a(cgg.e, this.cp, this);
         $$0.a(this, (byte)14);
         this.cp = null;
      }

      if (!this.gc() && this.ae.a(100) == 0) {
         cqi $$2 = $$0.d(this.dw());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gz().b() == coj.b && this.gq()) {
         this.gv();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.p() > 0) {
         this.r(this.p() - 1);
      }

      this.gX();
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.uG) || !this.bL() || this.gq() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gK();
         return bsi.a;
      } else {
         if (!this.dW().C) {
            boolean $$3 = this.gr().isEmpty();
            if ($$1 == bsh.a) {
               if ($$3) {
                  this.gK();
               }

               $$0.a(awj.S);
            }

            if ($$3) {
               return bsi.c;
            }

            this.h($$0);
         }

         return bsi.a;
      }
   }

   private void gK() {
      this.r(40);
      if (!this.dW().B_()) {
         this.b(avz.BK);
      }
   }

   private void h(cov $$0) {
      this.i($$0);
      this.a($$0);
      this.a($$0, this.p_(), this.gz().c());
   }

   @Override
   public void a(@Nullable cov $$0) {
      boolean $$1 = this.gp() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gv();
      }
   }

   @Override
   protected void gv() {
      super.gv();
      this.gL();
   }

   private void gL() {
      if (!this.dW().B_()) {
         for (dfd $$0 : this.gr()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gB() {
      return true;
   }

   public void gC() {
      this.gQ();

      for (dfd $$0 : this.gr()) {
         $$0.j();
      }

      this.gM();
      this.cw = this.dW().ad();
      this.cx++;
   }

   private void gM() {
      dfe $$0 = this.gr();
      cov $$1 = this.gp();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gz().c(), this.x(), this.gs(), this.gB());
      }
   }

   private boolean gN() {
      for (dfd $$0 : this.gr()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gO() {
      return this.cx == 0 || this.cx < 2 && this.dW().ad() > this.cw + 2400L;
   }

   public boolean gD() {
      long $$0 = this.cw + 12000L;
      long $$1 = this.dW().ad();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dW().ae();
      if (this.cy > 0L) {
         long $$4 = this.cy / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cy = $$3;
      if ($$2) {
         this.cw = $$1;
         this.gY();
      }

      return this.gO() && this.gN();
   }

   private void gP() {
      int $$0 = 2 - this.cx;
      if ($$0 > 0) {
         for (dfd $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gQ();
      }

      this.gM();
   }

   private void gQ() {
      for (dfd $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void i(cov $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dfd $$2 : this.gr()) {
            $$2.a(-ayy.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(btq.F)) {
         bto $$3 = $$0.c(btq.F);
         int $$4 = $$3.e();

         for (dfd $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cf, new coh(col.c, coj.b, 1));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      coh.c.encodeStart(ue.a, this.gz()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cr);
      $$0.a("Gossips", this.cs.a(ue.a));
      $$0.a("Xp", this.cv);
      $$0.a("LastRestock", this.cw);
      $$0.a("LastGossipDecay", this.cu);
      $$0.a("RestocksToday", this.cx);
      if (this.cz) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         coh.c.parse(ue.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.al.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cr = $$0.f("FoodLevel");
      }

      tw $$1 = $$0.c("Gossips", 10);
      this.cs.a(new Dynamic(ue.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cv = $$0.h("Xp");
      }

      this.cw = $$0.i("LastRestock");
      this.cu = $$0.i("LastGossipDecay");
      if (this.dW() instanceof arc) {
         this.g((arc)this.dW());
      }

      this.cx = $$0.h("RestocksToday");
      if ($$0.e("AssignProfessionWhenSpawned")) {
         this.cz = $$0.q("AssignProfessionWhenSpawned");
      }
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   protected avy u() {
      if (this.fR()) {
         return null;
      } else {
         return this.gq() ? avz.BL : avz.BG;
      }
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.BJ;
   }

   @Override
   protected avy o_() {
      return avz.BI;
   }

   public void gE() {
      this.b(this.gz().b().f());
   }

   @Override
   public void a(coh $$0) {
      coh $$1 = this.gz();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.al.a(cf, $$0);
   }

   @Override
   public coh gz() {
      return this.al.a(cf);
   }

   @Override
   protected void b(dfd $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.gp();
      if (this.gU()) {
         this.cn = 40;
         this.co = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dW().b(new buv(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   public void a(@Nullable bvf $$0) {
      if ($$0 != null && this.dW() instanceof arc) {
         ((arc)this.dW()).a(cgg.c, $$0, this);
         if (this.bL() && $$0 instanceof cov) {
            this.dW().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bsz $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      buj $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gR();
      super.a($$0);
   }

   private void gR() {
      this.a(cej.b);
      this.a(cej.c);
      this.a(cej.d);
      this.a(cej.e);
   }

   private void b(buj $$0) {
      if (this.dW() instanceof arc $$1) {
         Optional<cel> $$3 = this.bE.c(cej.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvu.class::isInstance).forEach($$2x -> $$1.a(cgg.d, $$0, (bvu)$$2x));
         }
      }
   }

   public void a(cej<jq> $$0) {
      if (this.dW() instanceof arc) {
         MinecraftServer $$1 = ((arc)this.dW()).p();
         this.bE.c($$0).ifPresent($$2 -> {
            arc $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cgj $$4 = $$3.A();
               Optional<jr<cgm>> $$5 = $$4.c($$2.b());
               BiPredicate<cog, jr<cgm>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agc.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.cr + this.gW() >= 12 && !this.fR() && this.Y_() == 0;
   }

   private boolean gS() {
      return this.cr < 12;
   }

   private void gT() {
      if (this.gS() && this.gW() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            cwn $$1 = this.t().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cb.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cr = this.cr + $$2;
                     this.t().a($$0, 1);
                     if (!this.gS()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cov $$0) {
      return this.cs.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.cr -= $$0;
   }

   public void gF() {
      this.gT();
      this.u(12);
   }

   @Override
   public void b(dfe $$0) {
      this.bZ = $$0;
   }

   private boolean gU() {
      int $$0 = this.gz().c();
      return coh.d($$0) && this.cv >= coh.c($$0);
   }

   private void gV() {
      this.a(this.gz().a(this.gz().c() + 1));
      this.gw();
   }

   @Override
   protected wo cz() {
      return wo.c(this.aq().g() + "." + mb.x.b(this.gz().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lt.R);
      } else if ($$0 == 13) {
         this.a(lt.a);
      } else if ($$0 == 14) {
         this.a(lt.P);
      } else if ($$0 == 42) {
         this.a(lt.ao);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      if ($$2 == bup.e) {
         this.a(this.gz().a(coj.b));
      }

      if ($$2 == bup.n || $$2 == bup.m || bup.a($$2) || $$2 == bup.o) {
         this.a(this.gz().a(col.a($$0.t(this.dw()))));
      }

      if ($$2 == bup.d) {
         this.cz = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cog b(arc $$0, bua $$1) {
      double $$2 = this.ae.j();
      col $$3;
      if ($$2 < 0.5) {
         $$3 = col.a($$0.t(this.dw()));
      } else if ($$2 < 0.75) {
         $$3 = this.gz().a();
      } else {
         $$3 = ((cog)$$1).gz().a();
      }

      cog $$6 = new cog(buq.bC, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dw()), bup.e, null);
      return $$6;
   }

   @Override
   public void a(arc $$0, bve $$1) {
      if ($$0.am() != bsf.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cmm $$2 = this.a(buq.bH, bue.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dw()), bup.i, null);
            $$1x.aj();
            this.gR();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(arc $$0, cla $$1) {
      coe.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(arc $$0, cwn $$1) {
      cwj $$2 = $$1.h();
      return ($$1.a(awx.bN) || this.gz().b().d().contains($$2)) && this.t().c($$1);
   }

   public boolean gG() {
      return this.gW() >= 24;
   }

   public boolean gH() {
      return this.gW() < 12;
   }

   private int gW() {
      bsp $$0 = this.t();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gI() {
      return this.t().a_($$0 -> $$0.a(awx.bM));
   }

   @Override
   protected void gw() {
      coh $$0 = this.gz();
      Int2ObjectMap<cok.g[]> $$2;
      if (this.dW().K().b(crt.b)) {
         Int2ObjectMap<cok.g[]> $$1 = cok.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cok.a.get($$0.b());
      } else {
         $$2 = cok.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cok.g[] $$4 = (cok.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dfe $$5 = this.gr();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arc $$0, cog $$1, long $$2) {
      if (($$2 < this.ct || $$2 >= this.ct + 1200L) && ($$2 < $$1.ct || $$2 >= $$1.ct + 1200L)) {
         this.cs.a($$1.cs, this.ae, 10);
         this.ct = $$2;
         $$1.ct = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gX() {
      long $$0 = this.dW().ad();
      if (this.cu == 0L) {
         this.cu = $$0;
      } else if ($$0 >= this.cu + 24000L) {
         this.cs.b();
         this.cu = $$0;
      }
   }

   public void a(arc $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fat $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cog> $$4 = $$0.a(cog.class, $$3);
         List<cog> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!azr.a(buq.ap, bup.f, $$0, this.dw(), 10, 8, 6, azr.a.a, false).isEmpty()) {
               $$4.forEach(cfb::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dW().ad()) ? false : !this.bE.a(cej.F);
   }

   @Override
   public void a(cgg $$0, buj $$1) {
      if ($$0 == cgg.a) {
         this.cs.a($$1.cG(), ceg.d, 20);
         this.cs.a($$1.cG(), ceg.c, 25);
      } else if ($$0 == cgg.e) {
         this.cs.a($$1.cG(), ceg.e, 2);
      } else if ($$0 == cgg.c) {
         this.cs.a($$1.cG(), ceg.b, 25);
      } else if ($$0 == cgg.d) {
         this.cs.a($$1.cG(), ceg.a, 25);
      }
   }

   @Override
   public int x() {
      return this.cv;
   }

   public void t(int $$0) {
      this.cv = $$0;
   }

   private void gY() {
      this.gP();
      this.cx = 0;
   }

   public cef gJ() {
      return this.cs;
   }

   public void a(un $$0) {
      this.cs.a(new Dynamic(ue.a, $$0));
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public void b(ji $$0) {
      super.b($$0);
      this.bE.a(cej.H, this.dW().ad());
      this.bE.b(cej.m);
      this.bE.b(cej.E);
   }

   @Override
   public void fS() {
      super.fS();
      this.bE.a(cej.I, this.dW().ad());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bE.c(cej.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
