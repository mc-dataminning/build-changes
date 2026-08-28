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

public class coi extends cod implements bvv, cok {
   private static final Logger ce = LogUtils.getLogger();
   private static final ajx<coj> cf = akb.a(coi.class, ajz.u);
   public static final int ca = 12;
   public static final Map<cwl, Integer> cb = ImmutableMap.of(cwt.qc, 4, cwt.vf, 1, cwt.ve, 1, cwt.wk, 1);
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
   private cox cp;
   private boolean cq;
   private int cr;
   private final ceg cs = new ceg();
   private long ct;
   private long cu;
   private int cv;
   private long cw;
   private int cx;
   private long cy;
   private boolean cz;
   private static final ImmutableList<cek<?>> cC = ImmutableList.of(
      cek.b,
      cek.c,
      cek.d,
      cek.e,
      cek.g,
      cek.h,
      cek.i,
      cek.j,
      cek.k,
      cek.l,
      cek.L,
      cek.aP,
      new cek[]{cek.m, cek.n, cek.q, cek.r, cek.t, cek.v, cek.w, cek.x, cek.y, cek.A, cek.f, cek.C, cek.D, cek.E, cek.H, cek.I, cek.J, cek.F}
   );
   private static final ImmutableList<cfr<? extends cfq<? super coi>>> cD = ImmutableList.of(cfr.c, cfr.d, cfr.b, cfr.e, cfr.f, cfr.g, cfr.h, cfr.i, cfr.j);
   public static final Map<cek<jq>, BiPredicate<coi, jr<cgn>>> cd = ImmutableMap.of(
      cek.b,
      (BiPredicate<coi, jr>)($$0, $$1) -> $$1.a(cgo.n),
      cek.c,
      (BiPredicate<coi, jr>)($$0, $$1) -> $$0.gz().b().b().test($$1),
      cek.d,
      (BiPredicate<coi, jr>)($$0, $$1) -> col.a.test($$1),
      cek.e,
      (BiPredicate<coi, jr>)($$0, $$1) -> $$1.a(cgo.o)
   );

   public coi(bur<? extends coi> $$0, dgi $$1) {
      this($$0, $$1, coo.c);
   }

   public coi(bur<? extends coi> $$0, dgi $$1, coo $$2) {
      super($$0, $$1);
      ((cer)this.L()).b(true);
      this.L().a(true);
      this.L().a(48.0F);
      this.a_(true);
      this.a(this.gz().a($$2).a(col.b));
   }

   @Override
   public bwi<coi> ec() {
      return (bwi<coi>)super.ec();
   }

   @Override
   protected bwi.b<coi> ed() {
      return bwi.a(cC, cD);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      bwi<coi> $$1 = this.ed().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(arc $$0) {
      bwi<coi> $$1 = this.ec();
      $$1.b($$0, this);
      this.bE = $$1.i();
      this.a(this.ec());
   }

   private void a(bwi<coi> $$0) {
      col $$1 = this.gz().b();
      if (this.e_()) {
         $$0.a(cqq.e);
         $$0.a(cqo.d, caf.a(0.5F));
      } else {
         $$0.a(cqq.f);
         $$0.a(cqo.c, caf.b($$1, 0.5F), ImmutableSet.of(Pair.of(cek.c, cel.a)));
      }

      $$0.a(cqo.a, caf.a($$1, 0.5F));
      $$0.a(cqo.f, caf.d($$1, 0.5F), ImmutableSet.of(Pair.of(cek.e, cel.a)));
      $$0.a(cqo.e, caf.c($$1, 0.5F));
      $$0.a(cqo.b, caf.e($$1, 0.5F));
      $$0.a(cqo.g, caf.f($$1, 0.5F));
      $$0.a(cqo.i, caf.g($$1, 0.5F));
      $$0.a(cqo.h, caf.h($$1, 0.5F));
      $$0.a(cqo.j, caf.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cqo.a));
      $$0.b(cqo.b);
      $$0.a(cqo.b);
      $$0.a(this.dW().ae(), this.dW().ad());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dW() instanceof arc) {
         this.g((arc)this.dW());
      }
   }

   public static bwn.a gy() {
      return bvi.C().a(bwo.v, 0.5);
   }

   public boolean gA() {
      return this.cz;
   }

   @Override
   protected void a(arc $$0) {
      bos $$1 = bor.a();
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

            this.a(new btp(btr.j, 200, 0));
         }
      }

      if (this.cp != null) {
         $$0.a(cgh.e, this.cp, this);
         $$0.a(this, (byte)14);
         this.cp = null;
      }

      if (!this.gc() && this.ae.a(100) == 0) {
         cqk $$2 = $$0.d(this.dw());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gz().b() == col.b && this.gq()) {
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
   public bsj b(cox $$0, bsi $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.uG) || !this.bL() || this.gq() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gK();
         return bsj.a;
      } else {
         if (!this.dW().C) {
            boolean $$3 = this.gr().isEmpty();
            if ($$1 == bsi.a) {
               if ($$3) {
                  this.gK();
               }

               $$0.a(awk.S);
            }

            if ($$3) {
               return bsj.c;
            }

            this.h($$0);
         }

         return bsj.a;
      }
   }

   private void gK() {
      this.r(40);
      if (!this.dW().B_()) {
         this.b(awa.BL);
      }
   }

   private void h(cox $$0) {
      this.i($$0);
      this.a($$0);
      this.a($$0, this.p_(), this.gz().c());
   }

   @Override
   public void a(@Nullable cox $$0) {
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
         for (dff $$0 : this.gr()) {
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

      for (dff $$0 : this.gr()) {
         $$0.j();
      }

      this.gM();
      this.cw = this.dW().ad();
      this.cx++;
   }

   private void gM() {
      dfg $$0 = this.gr();
      cox $$1 = this.gp();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gz().c(), this.x(), this.gs(), this.gB());
      }
   }

   private boolean gN() {
      for (dff $$0 : this.gr()) {
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
         for (dff $$1 : this.gr()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gQ();
      }

      this.gM();
   }

   private void gQ() {
      for (dff $$0 : this.gr()) {
         $$0.g();
      }
   }

   private void i(cox $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dff $$2 : this.gr()) {
            $$2.a(-ayz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(btr.F)) {
         btp $$3 = $$0.c(btr.F);
         int $$4 = $$3.e();

         for (dff $$5 : this.gr()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cf, new coj(coo.c, col.b, 1));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      coj.c.encodeStart(ue.a, this.gz()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         coj.c.parse(ue.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.al.a(cf, $$0x));
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
   protected avz u() {
      if (this.fR()) {
         return null;
      } else {
         return this.gq() ? awa.BM : awa.BH;
      }
   }

   @Override
   protected avz e(bta $$0) {
      return awa.BK;
   }

   @Override
   protected avz o_() {
      return awa.BJ;
   }

   public void gE() {
      this.b(this.gz().b().f());
   }

   @Override
   public void a(coj $$0) {
      coj $$1 = this.gz();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.al.a(cf, $$0);
   }

   @Override
   public coj gz() {
      return this.al.a(cf);
   }

   @Override
   protected void b(dff $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.gp();
      if (this.gU()) {
         this.cn = 40;
         this.co = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dW().b(new buw(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   public void a(@Nullable bvg $$0) {
      if ($$0 != null && this.dW() instanceof arc) {
         ((arc)this.dW()).a(cgh.c, $$0, this);
         if (this.bL() && $$0 instanceof cox) {
            this.dW().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bta $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      buk $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gR();
      super.a($$0);
   }

   private void gR() {
      this.a(cek.b);
      this.a(cek.c);
      this.a(cek.d);
      this.a(cek.e);
   }

   private void b(buk $$0) {
      if (this.dW() instanceof arc $$1) {
         Optional<cem> $$3 = this.bE.c(cek.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvv.class::isInstance).forEach($$2x -> $$1.a(cgh.d, $$0, (bvv)$$2x));
         }
      }
   }

   public void a(cek<jq> $$0) {
      if (this.dW() instanceof arc) {
         MinecraftServer $$1 = ((arc)this.dW()).p();
         this.bE.c($$0).ifPresent($$2 -> {
            arc $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cgk $$4 = $$3.A();
               Optional<jr<cgn>> $$5 = $$4.c($$2.b());
               BiPredicate<coi, jr<cgn>> $$6 = cd.get($$0);
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
            cwp $$1 = this.t().a($$0);
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

   public int g(cox $$0) {
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
   public void b(dfg $$0) {
      this.bZ = $$0;
   }

   private boolean gU() {
      int $$0 = this.gz().c();
      return coj.d($$0) && this.cv >= coj.c($$0);
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
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      if ($$2 == buq.e) {
         this.a(this.gz().a(col.b));
      }

      if ($$2 == buq.n || $$2 == buq.m || buq.a($$2) || $$2 == buq.o) {
         this.a(this.gz().a(coo.a($$0.t(this.dw()))));
      }

      if ($$2 == buq.d) {
         this.cz = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public coi b(arc $$0, bub $$1) {
      double $$2 = this.ae.j();
      coo $$3;
      if ($$2 < 0.5) {
         $$3 = coo.a($$0.t(this.dw()));
      } else if ($$2 < 0.75) {
         $$3 = this.gz().a();
      } else {
         $$3 = ((coi)$$1).gz().a();
      }

      coi $$6 = new coi(bur.bD, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dw()), buq.e, null);
      return $$6;
   }

   @Override
   public void a(arc $$0, bvf $$1) {
      if ($$0.am() != bsg.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cmn $$2 = this.a(bur.bI, buf.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dw()), buq.i, null);
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
   protected void a(arc $$0, clb $$1) {
      cog.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(arc $$0, cwp $$1) {
      cwl $$2 = $$1.h();
      return ($$1.a(awy.bO) || this.gz().b().d().contains($$2)) && this.t().c($$1);
   }

   public boolean gG() {
      return this.gW() >= 24;
   }

   public boolean gH() {
      return this.gW() < 12;
   }

   private int gW() {
      bsq $$0 = this.t();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gI() {
      return this.t().a_($$0 -> $$0.a(awy.bN));
   }

   @Override
   protected void gw() {
      coj $$0 = this.gz();
      Int2ObjectMap<com.g[]> $$2;
      if (this.dW().K().b(crv.b)) {
         Int2ObjectMap<com.g[]> $$1 = com.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : com.a.get($$0.b());
      } else {
         $$2 = com.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         com.g[] $$4 = (com.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dfg $$5 = this.gr();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arc $$0, coi $$1, long $$2) {
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
         fav $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<coi> $$4 = $$0.a(coi.class, $$3);
         List<coi> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!azs.a(bur.aq, buq.f, $$0, this.dw(), 10, 8, 6, azs.a.a, false).isEmpty()) {
               $$4.forEach(cfc::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dW().ad()) ? false : !this.bE.a(cek.F);
   }

   @Override
   public void a(cgh $$0, buk $$1) {
      if ($$0 == cgh.a) {
         this.cs.a($$1.cG(), ceh.d, 20);
         this.cs.a($$1.cG(), ceh.c, 25);
      } else if ($$0 == cgh.e) {
         this.cs.a($$1.cG(), ceh.e, 2);
      } else if ($$0 == cgh.c) {
         this.cs.a($$1.cG(), ceh.b, 25);
      } else if ($$0 == cgh.d) {
         this.cs.a($$1.cG(), ceh.a, 25);
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

   public ceg gJ() {
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
      this.bE.a(cek.H, this.dW().ad());
      this.bE.b(cek.m);
      this.bE.b(cek.E);
   }

   @Override
   public void fS() {
      super.fS();
      this.bE.a(cek.I, this.dW().ad());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bE.c(cek.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
