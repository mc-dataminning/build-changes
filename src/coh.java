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

public class coh extends coc implements bvv, coj {
   private static final Logger ce = LogUtils.getLogger();
   private static final ajy<coi> cf = akc.a(coh.class, aka.u);
   public static final int ca = 12;
   public static final Map<cwk, Integer> cb = ImmutableMap.of(cws.qc, 4, cws.vf, 1, cws.ve, 1, cws.wk, 1);
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
   private cow cp;
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
   private static final ImmutableList<cfr<? extends cfq<? super coh>>> cD = ImmutableList.of(cfr.c, cfr.d, cfr.b, cfr.e, cfr.f, cfr.g, cfr.h, cfr.i, cfr.j);
   public static final Map<cek<jq>, BiPredicate<coh, jr<cgn>>> cd = ImmutableMap.of(
      cek.b,
      (BiPredicate<coh, jr>)($$0, $$1) -> $$1.a(cgo.n),
      cek.c,
      (BiPredicate<coh, jr>)($$0, $$1) -> $$0.gC().b().b().test($$1),
      cek.d,
      (BiPredicate<coh, jr>)($$0, $$1) -> cok.a.test($$1),
      cek.e,
      (BiPredicate<coh, jr>)($$0, $$1) -> $$1.a(cgo.o)
   );

   public coh(bur<? extends coh> $$0, dgh $$1) {
      this($$0, $$1, com.c);
   }

   public coh(bur<? extends coh> $$0, dgh $$1, com $$2) {
      super($$0, $$1);
      ((cer)this.P()).b(true);
      this.P().a(true);
      this.P().a(48.0F);
      this.a_(true);
      this.a(this.gC().a($$2).a(cok.b));
   }

   @Override
   public bwi<coh> eb() {
      return (bwi<coh>)super.eb();
   }

   @Override
   protected bwi.b<coh> ec() {
      return bwi.a(cC, cD);
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      bwi<coh> $$1 = this.ec().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(ard $$0) {
      bwi<coh> $$1 = this.eb();
      $$1.b($$0, this);
      this.bE = $$1.i();
      this.a(this.eb());
   }

   private void a(bwi<coh> $$0) {
      cok $$1 = this.gC().b();
      if (this.e_()) {
         $$0.a(cqp.e);
         $$0.a(cqn.d, caf.a(0.5F));
      } else {
         $$0.a(cqp.f);
         $$0.a(cqn.c, caf.b($$1, 0.5F), ImmutableSet.of(Pair.of(cek.c, cel.a)));
      }

      $$0.a(cqn.a, caf.a($$1, 0.5F));
      $$0.a(cqn.f, caf.d($$1, 0.5F), ImmutableSet.of(Pair.of(cek.e, cel.a)));
      $$0.a(cqn.e, caf.c($$1, 0.5F));
      $$0.a(cqn.b, caf.e($$1, 0.5F));
      $$0.a(cqn.g, caf.f($$1, 0.5F));
      $$0.a(cqn.i, caf.g($$1, 0.5F));
      $$0.a(cqn.h, caf.h($$1, 0.5F));
      $$0.a(cqn.j, caf.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.a(cqn.b);
      $$0.a(this.dV().ae(), this.dV().ad());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dV() instanceof ard) {
         this.g((ard)this.dV());
      }
   }

   public static bwn.a gB() {
      return bvi.F().a(bwo.v, 0.5);
   }

   public boolean gD() {
      return this.cz;
   }

   @Override
   protected void a(ard $$0) {
      bos $$1 = bor.a();
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

            this.a(new btp(btr.j, 200, 0));
         }
      }

      if (this.cp != null) {
         $$0.a(cgh.e, this.cp, this);
         $$0.a(this, (byte)14);
         this.cp = null;
      }

      if (!this.gf() && this.ae.a(100) == 0) {
         cqj $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gC().b() == cok.b && this.gt()) {
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
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if ($$2.a(cws.uG) || !this.bL() || this.gt() || this.fR()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gN();
         return bsj.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.gu().isEmpty();
            if ($$1 == bsi.a) {
               if ($$3) {
                  this.gN();
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

   private void gN() {
      this.r(40);
      if (!this.dV().B_()) {
         this.b(awa.BK);
      }
   }

   private void h(cow $$0) {
      this.i($$0);
      this.a($$0);
      this.a($$0, this.p_(), this.gC().c());
   }

   @Override
   public void a(@Nullable cow $$0) {
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
         for (dfe $$0 : this.gu()) {
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

      for (dfe $$0 : this.gu()) {
         $$0.j();
      }

      this.gP();
      this.cw = this.dV().ad();
      this.cx++;
   }

   private void gP() {
      dff $$0 = this.gu();
      cow $$1 = this.gs();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gC().c(), this.x(), this.gv(), this.gE());
      }
   }

   private boolean gQ() {
      for (dfe $$0 : this.gu()) {
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
         for (dfe $$1 : this.gu()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gT();
      }

      this.gP();
   }

   private void gT() {
      for (dfe $$0 : this.gu()) {
         $$0.g();
      }
   }

   private void i(cow $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (dfe $$2 : this.gu()) {
            $$2.a(-ayz.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(btr.F)) {
         btp $$3 = $$0.c(btr.F);
         int $$4 = $$3.e();

         for (dfe $$5 : this.gu()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cf, new coi(com.c, cok.b, 1));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      coi.c.encodeStart(ue.a, this.gC()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         coi.c.parse(ue.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.al.a(cf, $$0x));
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
   protected avz e(bta $$0) {
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
   public void a(coi $$0) {
      coi $$1 = this.gC();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.al.a(cf, $$0);
   }

   @Override
   public coi gC() {
      return this.al.a(cf);
   }

   @Override
   protected void b(dfe $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.gs();
      if (this.gX()) {
         this.cn = 40;
         this.co = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dV().b(new buw(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   public void a(@Nullable bvg $$0) {
      if ($$0 != null && this.dV() instanceof ard) {
         ((ard)this.dV()).a(cgh.c, $$0, this);
         if (this.bL() && $$0 instanceof cow) {
            this.dV().a(this, (byte)13);
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

      this.gU();
      super.a($$0);
   }

   private void gU() {
      this.a(cek.b);
      this.a(cek.c);
      this.a(cek.d);
      this.a(cek.e);
   }

   private void b(buk $$0) {
      if (this.dV() instanceof ard $$1) {
         Optional<cem> $$3 = this.bE.c(cek.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvv.class::isInstance).forEach($$2x -> $$1.a(cgh.d, $$0, (bvv)$$2x));
         }
      }
   }

   public void a(cek<jq> $$0) {
      if (this.dV() instanceof ard) {
         MinecraftServer $$1 = ((ard)this.dV()).p();
         this.bE.c($$0).ifPresent($$2 -> {
            ard $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cgk $$4 = $$3.A();
               Optional<jr<cgn>> $$5 = $$4.c($$2.b());
               BiPredicate<coh, jr<cgn>> $$6 = cd.get($$0);
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
            cwo $$1 = this.t().a($$0);
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

   public int g(cow $$0) {
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
   public void b(dff $$0) {
      this.bZ = $$0;
   }

   private boolean gX() {
      int $$0 = this.gC().c();
      return coi.d($$0) && this.cv >= coi.c($$0);
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
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      if ($$2 == buq.e) {
         this.a(this.gC().a(cok.b));
      }

      if ($$2 == buq.n || $$2 == buq.m || buq.a($$2) || $$2 == buq.o) {
         this.a(this.gC().a(com.a($$0.t(this.dv()))));
      }

      if ($$2 == buq.d) {
         this.cz = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public coh b(ard $$0, bub $$1) {
      double $$2 = this.ae.j();
      com $$3;
      if ($$2 < 0.5) {
         $$3 = com.a($$0.t(this.dv()));
      } else if ($$2 < 0.75) {
         $$3 = this.gC().a();
      } else {
         $$3 = ((coh)$$1).gC().a();
      }

      coh $$6 = new coh(bur.bC, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), buq.e, null);
      return $$6;
   }

   @Override
   public void a(ard $$0, bvf $$1) {
      if ($$0.am() != bsg.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cmn $$2 = this.a(bur.bH, buf.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), buq.i, null);
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
   protected void a(ard $$0, clb $$1) {
      cof.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(ard $$0, cwo $$1) {
      cwk $$2 = $$1.h();
      return ($$1.a(awy.bN) || this.gC().b().d().contains($$2)) && this.t().c($$1);
   }

   public boolean gJ() {
      return this.gZ() >= 24;
   }

   public boolean gK() {
      return this.gZ() < 12;
   }

   private int gZ() {
      bsq $$0 = this.t();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gL() {
      return this.t().a_($$0 -> $$0.a(awy.bM));
   }

   @Override
   protected void gz() {
      coi $$0 = this.gC();
      Int2ObjectMap<col.g[]> $$2;
      if (this.dV().K().b(cru.b)) {
         Int2ObjectMap<col.g[]> $$1 = col.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : col.a.get($$0.b());
      } else {
         $$2 = col.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         col.g[] $$4 = (col.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dff $$5 = this.gu();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(ard $$0, coh $$1, long $$2) {
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
         fau $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<coh> $$4 = $$0.a(coh.class, $$3);
         List<coh> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!azs.a(bur.ap, buq.f, $$0, this.dv(), 10, 8, 6, azs.a.a, false).isEmpty()) {
               $$4.forEach(cfc::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ad()) ? false : !this.bE.a(cek.F);
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

   private void hb() {
      this.gS();
      this.cx = 0;
   }

   public ceg gM() {
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
      this.bE.a(cek.H, this.dV().ad());
      this.bE.b(cek.m);
      this.bE.b(cek.E);
   }

   @Override
   public void fS() {
      super.fS();
      this.bE.a(cek.I, this.dV().ad());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bE.c(cek.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
