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

public class coi extends cod implements bvw, cok {
   private static final Logger ce = LogUtils.getLogger();
   private static final ajy<coj> cf = akc.a(coi.class, aka.u);
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
   private final ceh cs = new ceh();
   private long ct;
   private long cu;
   private int cv;
   private long cw;
   private int cx;
   private long cy;
   private boolean cz;
   private static final ImmutableList<cel<?>> cC = ImmutableList.of(
      cel.b,
      cel.c,
      cel.d,
      cel.e,
      cel.g,
      cel.h,
      cel.i,
      cel.j,
      cel.k,
      cel.l,
      cel.L,
      cel.aP,
      new cel[]{cel.m, cel.n, cel.q, cel.r, cel.t, cel.v, cel.w, cel.x, cel.y, cel.A, cel.f, cel.C, cel.D, cel.E, cel.H, cel.I, cel.J, cel.F}
   );
   private static final ImmutableList<cfs<? extends cfr<? super coi>>> cD = ImmutableList.of(cfs.c, cfs.d, cfs.b, cfs.e, cfs.f, cfs.g, cfs.h, cfs.i, cfs.j);
   public static final Map<cel<jq>, BiPredicate<coi, jr<cgo>>> cd = ImmutableMap.of(
      cel.b,
      (BiPredicate<coi, jr>)($$0, $$1) -> $$1.a(cgp.n),
      cel.c,
      (BiPredicate<coi, jr>)($$0, $$1) -> $$0.gC().b().b().test($$1),
      cel.d,
      (BiPredicate<coi, jr>)($$0, $$1) -> col.a.test($$1),
      cel.e,
      (BiPredicate<coi, jr>)($$0, $$1) -> $$1.a(cgp.o)
   );

   public coi(bus<? extends coi> $$0, dgi $$1) {
      this($$0, $$1, coo.c);
   }

   public coi(bus<? extends coi> $$0, dgi $$1, coo $$2) {
      super($$0, $$1);
      ((ces)this.P()).b(true);
      this.P().a(true);
      this.P().a(48.0F);
      this.a_(true);
      this.a(this.gC().a($$2).a(col.b));
   }

   @Override
   public bwj<coi> eb() {
      return (bwj<coi>)super.eb();
   }

   @Override
   protected bwj.b<coi> ec() {
      return bwj.a(cC, cD);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      bwj<coi> $$1 = this.ec().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(ard $$0) {
      bwj<coi> $$1 = this.eb();
      $$1.b($$0, this);
      this.bE = $$1.i();
      this.a(this.eb());
   }

   private void a(bwj<coi> $$0) {
      col $$1 = this.gC().b();
      if (this.e_()) {
         $$0.a(cqq.e);
         $$0.a(cqo.d, cag.a(0.5F));
      } else {
         $$0.a(cqq.f);
         $$0.a(cqo.c, cag.b($$1, 0.5F), ImmutableSet.of(Pair.of(cel.c, cem.a)));
      }

      $$0.a(cqo.a, cag.a($$1, 0.5F));
      $$0.a(cqo.f, cag.d($$1, 0.5F), ImmutableSet.of(Pair.of(cel.e, cem.a)));
      $$0.a(cqo.e, cag.c($$1, 0.5F));
      $$0.a(cqo.b, cag.e($$1, 0.5F));
      $$0.a(cqo.g, cag.f($$1, 0.5F));
      $$0.a(cqo.i, cag.g($$1, 0.5F));
      $$0.a(cqo.h, cag.h($$1, 0.5F));
      $$0.a(cqo.j, cag.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cqo.a));
      $$0.b(cqo.b);
      $$0.a(cqo.b);
      $$0.a(this.dV().ae(), this.dV().ad());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dV() instanceof ard) {
         this.g((ard)this.dV());
      }
   }

   public static bwo.a gB() {
      return bvj.F().a(bwp.v, 0.5);
   }

   public boolean gD() {
      return this.cz;
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("villagerBrain");
      this.eb().a($$0, this);
      $$1.c();
      if (this.cz) {
         this.cz = false;
      }

      if (!this.gt() && this.cn > 0) {
         this.cn--;
         if (this.cn <= 0) {
            if (this.co) {
               this.gY();
               this.co = false;
            }

            this.a(new btq(bts.j, 200, 0));
         }
      }

      if (this.cp != null) {
         $$0.a(cgi.e, this.cp, this);
         $$0.a(this, (byte)14);
         this.cp = null;
      }

      if (!this.gf() && this.ae.a(100) == 0) {
         cqk $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gC().b() == col.b && this.gt()) {
         this.gy();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.p() > 0) {
         this.r(this.p() - 1);
      }

      this.ha();
   }

   @Override
   public bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.uG) || !this.bL() || this.gt() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gN();
         return bsk.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gu().isEmpty();
            if ($$1 == bsj.a) {
               if ($$3) {
                  this.gN();
               }

               $$0.a(awk.S);
            }

            if ($$3) {
               return bsk.c;
            }

            this.h($$0);
         }

         return bsk.a;
      }
   }

   private void gN() {
      this.r(40);
      if (!this.dV().B_()) {
         this.b(awa.BK);
      }
   }

   private void h(cox $$0) {
      this.i($$0);
      this.a($$0);
      this.a($$0, this.p_(), this.gC().c());
   }

   @Override
   public void a(@Nullable cox $$0) {
      boolean $$1 = this.gs() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gy();
      }
   }

   @Override
   protected void gy() {
      super.gy();
      this.gO();
   }

   private void gO() {
      if (!this.dV().B_()) {
         for (dff $$0 : this.gu()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gE() {
      return true;
   }

   public void gF() {
      this.gT();

      for (dff $$0 : this.gu()) {
         $$0.j();
      }

      this.gP();
      this.cw = this.dV().ad();
      this.cx++;
   }

   private void gP() {
      dfg $$0 = this.gu();
      cox $$1 = this.gs();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gC().c(), this.x(), this.gv(), this.gE());
      }
   }

   private boolean gQ() {
      for (dff $$0 : this.gu()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gR() {
      return this.cx == 0 || this.cx < 2 && this.dV().ad() > this.cw + 2400L;
   }

   public boolean gG() {
      long $$0 = this.cw + 12000L;
      long $$1 = this.dV().ad();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dV().ae();
      if (this.cy > 0L) {
         long $$4 = this.cy / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cy = $$3;
      if ($$2) {
         this.cw = $$1;
         this.hb();
      }

      return this.gR() && this.gQ();
   }

   private void gS() {
      int $$0 = 2 - this.cx;
      if ($$0 > 0) {
         for (dff $$1 : this.gu()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gT();
      }

      this.gP();
   }

   private void gT() {
      for (dff $$0 : this.gu()) {
         $$0.g();
      }
   }

   private void i(cox $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dff $$2 : this.gu()) {
            $$2.a(-ayz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bts.F)) {
         btq $$3 = $$0.c(bts.F);
         int $$4 = $$3.e();

         for (dff $$5 : this.gu()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cf, new coj(coo.c, col.b, 1));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      coj.c.encodeStart(ue.a, this.gC()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
      if (this.dV() instanceof ard) {
         this.g((ard)this.dV());
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
         return this.gt() ? awa.BL : awa.BG;
      }
   }

   @Override
   protected avz e(btb $$0) {
      return awa.BJ;
   }

   @Override
   protected avz o_() {
      return awa.BI;
   }

   public void gH() {
      this.b(this.gC().b().f());
   }

   @Override
   public void a(coj $$0) {
      coj $$1 = this.gC();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.al.a(cf, $$0);
   }

   @Override
   public coj gC() {
      return this.al.a(cf);
   }

   @Override
   protected void b(dff $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.gs();
      if (this.gX()) {
         this.cn = 40;
         this.co = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new bux(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bvh $$0) {
      if ($$0 != null && this.dV() instanceof ard) {
         ((ard)this.dV()).a(cgi.c, $$0, this);
         if (this.bL() && $$0 instanceof cox) {
            this.dV().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(btb $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bul $$1 = $$0.d();
      if ($$1 != null) {
         this.b($$1);
      }

      this.gU();
      super.a($$0);
   }

   private void gU() {
      this.a(cel.b);
      this.a(cel.c);
      this.a(cel.d);
      this.a(cel.e);
   }

   private void b(bul $$0) {
      if (this.dV() instanceof ard $$1) {
         Optional<cen> $$3 = this.bE.c(cel.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvw.class::isInstance).forEach($$2x -> $$1.a(cgi.d, $$0, (bvw)$$2x));
         }
      }
   }

   public void a(cel<jq> $$0) {
      if (this.dV() instanceof ard) {
         MinecraftServer $$1 = ((ard)this.dV()).p();
         this.bE.c($$0).ifPresent($$2 -> {
            ard $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cgl $$4 = $$3.A();
               Optional<jr<cgo>> $$5 = $$4.c($$2.b());
               BiPredicate<coi, jr<cgo>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agd.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean X_() {
      return this.cr + this.gZ() >= 12 && !this.fR() && this.Y_() == 0;
   }

   private boolean gV() {
      return this.cr < 12;
   }

   private void gW() {
      if (this.gV() && this.gZ() != 0) {
         for (int $$0 = 0; $$0 < this.t().b(); $$0++) {
            cwp $$1 = this.t().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cb.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cr = this.cr + $$2;
                     this.t().a($$0, 1);
                     if (!this.gV()) {
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

   public void gI() {
      this.gW();
      this.u(12);
   }

   @Override
   public void b(dfg $$0) {
      this.bZ = $$0;
   }

   private boolean gX() {
      int $$0 = this.gC().c();
      return coj.d($$0) && this.cv >= coj.c($$0);
   }

   private void gY() {
      this.a(this.gC().a(this.gC().c() + 1));
      this.gz();
   }

   @Override
   protected wp cz() {
      return wp.c(this.aq().g() + "." + mb.x.b(this.gC().b()).a());
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
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$2 == bur.e) {
         this.a(this.gC().a(col.b));
      }

      if ($$2 == bur.n || $$2 == bur.m || bur.a($$2) || $$2 == bur.o) {
         this.a(this.gC().a(coo.a($$0.t(this.dv()))));
      }

      if ($$2 == bur.d) {
         this.cz = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public coi b(ard $$0, buc $$1) {
      double $$2 = this.ae.j();
      coo $$3;
      if ($$2 < 0.5) {
         $$3 = coo.a($$0.t(this.dv()));
      } else if ($$2 < 0.75) {
         $$3 = this.gC().a();
      } else {
         $$3 = ((coi)$$1).gC().a();
      }

      coi $$6 = new coi(bus.bC, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bur.e, null);
      return $$6;
   }

   @Override
   public void a(ard $$0, bvg $$1) {
      if ($$0.am() != bsh.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cmo $$2 = this.a(bus.bH, bug.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bur.i, null);
            $$1x.fY();
            this.gU();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(ard $$0, clc $$1) {
      cog.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(ard $$0, cwp $$1) {
      cwl $$2 = $$1.h();
      return ($$1.a(awy.bN) || this.gC().b().d().contains($$2)) && this.t().c($$1);
   }

   public boolean gJ() {
      return this.gZ() >= 24;
   }

   public boolean gK() {
      return this.gZ() < 12;
   }

   private int gZ() {
      bsr $$0 = this.t();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gL() {
      return this.t().a_($$0 -> $$0.a(awy.bM));
   }

   @Override
   protected void gz() {
      coj $$0 = this.gC();
      Int2ObjectMap<com.g[]> $$2;
      if (this.dV().K().b(crv.b)) {
         Int2ObjectMap<com.g[]> $$1 = com.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : com.a.get($$0.b());
      } else {
         $$2 = com.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         com.g[] $$4 = (com.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dfg $$5 = this.gu();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ard $$0, coi $$1, long $$2) {
      if (($$2 < this.ct || $$2 >= this.ct + 1200L) && ($$2 < $$1.ct || $$2 >= $$1.ct + 1200L)) {
         this.cs.a($$1.cs, this.ae, 10);
         this.ct = $$2;
         $$1.ct = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void ha() {
      long $$0 = this.dV().ad();
      if (this.cu == 0L) {
         this.cu = $$0;
      } else if ($$0 >= this.cu + 24000L) {
         this.cs.b();
         this.cu = $$0;
      }
   }

   public void a(ard $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         fav $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<coi> $$4 = $$0.a(coi.class, $$3);
         List<coi> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!azs.a(bus.ap, bur.f, $$0, this.dv(), 10, 8, 6, azs.a.a, false).isEmpty()) {
               $$4.forEach(cfd::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ad()) ? false : !this.bE.a(cel.F);
   }

   @Override
   public void a(cgi $$0, bul $$1) {
      if ($$0 == cgi.a) {
         this.cs.a($$1.cG(), cei.d, 20);
         this.cs.a($$1.cG(), cei.c, 25);
      } else if ($$0 == cgi.e) {
         this.cs.a($$1.cG(), cei.e, 2);
      } else if ($$0 == cgi.c) {
         this.cs.a($$1.cG(), cei.b, 25);
      } else if ($$0 == cgi.d) {
         this.cs.a($$1.cG(), cei.a, 25);
      }
   }

   @Override
   public int x() {
      return this.cv;
   }

   public void t(int $$0) {
      this.cv = $$0;
   }

   private void hb() {
      this.gS();
      this.cx = 0;
   }

   public ceh gM() {
      return this.cs;
   }

   public void a(un $$0) {
      this.cs.a(new Dynamic(ue.a, $$0));
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public void b(ji $$0) {
      super.b($$0);
      this.bE.a(cel.H, this.dV().ad());
      this.bE.b(cel.m);
      this.bE.b(cel.E);
   }

   @Override
   public void fS() {
      super.fS();
      this.bE.a(cel.I, this.dV().ad());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bE.c(cel.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
