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

public class cof extends coa implements bvw, coh {
   private static final Logger ce = LogUtils.getLogger();
   private static final akm<cog> cf = akq.a(cof.class, ako.u);
   public static final int ca = 12;
   public static final Map<cwi, Integer> cb = ImmutableMap.of(cwq.py, 4, cwq.uy, 1, cwq.ux, 1, cwq.vC, 1);
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
   private cou cp;
   private boolean cq;
   private int cr;
   private final ceh cs = new ceh();
   private long ct;
   private long cu;
   private int cv;
   private long cw;
   private int cx;
   private long cy;
   private boolean cB;
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
   private static final ImmutableList<cfs<? extends cfr<? super cof>>> cD = ImmutableList.of(cfs.c, cfs.d, cfs.b, cfs.e, cfs.f, cfs.g, cfs.h, cfs.i, cfs.j);
   public static final Map<cel<jp>, BiPredicate<cof, jq<cgo>>> cd = ImmutableMap.of(
      cel.b,
      (BiPredicate<cof, jq>)($$0, $$1) -> $$1.a(cgp.n),
      cel.c,
      (BiPredicate<cof, jq>)($$0, $$1) -> $$0.gx().b().b().test($$1),
      cel.d,
      (BiPredicate<cof, jq>)($$0, $$1) -> coi.a.test($$1),
      cel.e,
      (BiPredicate<cof, jq>)($$0, $$1) -> $$1.a(cgp.o)
   );

   public cof(bus<? extends cof> $$0, dfm $$1) {
      this($$0, $$1, cok.c);
   }

   public cof(bus<? extends cof> $$0, dfm $$1, cok $$2) {
      super($$0, $$1);
      ((ces)this.L()).b(true);
      this.L().a(true);
      this.L().a(48.0F);
      this.a_(true);
      this.a(this.gx().a($$2).a(coi.b));
   }

   @Override
   public bwj<cof> eb() {
      return (bwj<cof>)super.eb();
   }

   @Override
   protected bwj.b<cof> ec() {
      return bwj.a(cC, cD);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      bwj<cof> $$1 = this.ec().a($$0);
      this.a($$1);
      return $$1;
   }

   public void g(arp $$0) {
      bwj<cof> $$1 = this.eb();
      $$1.b($$0, this);
      this.bE = $$1.i();
      this.a(this.eb());
   }

   private void a(bwj<cof> $$0) {
      coi $$1 = this.gx().b();
      if (this.e_()) {
         $$0.a(cqn.e);
         $$0.a(cql.d, cag.a(0.5F));
      } else {
         $$0.a(cqn.f);
         $$0.a(cql.c, cag.b($$1, 0.5F), ImmutableSet.of(Pair.of(cel.c, cem.a)));
      }

      $$0.a(cql.a, cag.a($$1, 0.5F));
      $$0.a(cql.f, cag.d($$1, 0.5F), ImmutableSet.of(Pair.of(cel.e, cem.a)));
      $$0.a(cql.e, cag.c($$1, 0.5F));
      $$0.a(cql.b, cag.e($$1, 0.5F));
      $$0.a(cql.g, cag.f($$1, 0.5F));
      $$0.a(cql.i, cag.g($$1, 0.5F));
      $$0.a(cql.h, cag.h($$1, 0.5F));
      $$0.a(cql.j, cag.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cql.a));
      $$0.b(cql.b);
      $$0.a(cql.b);
      $$0.a(this.dV().ac(), this.dV().ab());
   }

   @Override
   protected void i() {
      super.i();
      if (this.dV() instanceof arp) {
         this.g((arp)this.dV());
      }
   }

   public static bwo.a gv() {
      return bvj.C().a(bwp.v, 0.5);
   }

   public boolean gw() {
      return this.cB;
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("villagerBrain");
      this.eb().a($$0, this);
      $$1.c();
      if (this.cB) {
         this.cB = false;
      }

      if (!this.gn() && this.cn > 0) {
         this.cn--;
         if (this.cn <= 0) {
            if (this.co) {
               this.gS();
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

      if (!this.fZ() && this.ae.a(100) == 0) {
         cqh $$2 = $$0.d(this.dv());
         if ($$2 != null && $$2.u() && !$$2.a()) {
            $$0.a(this, (byte)42);
         }
      }

      if (this.gx().b() == coi.b && this.gn()) {
         this.gs();
      }

      super.a($$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.n() > 0) {
         this.r(this.n() - 1);
      }

      this.gU();
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.ua) || !this.bL() || this.gn() || this.fP()) {
         return super.b($$0, $$1);
      } else if (this.e_()) {
         this.gH();
         return bsk.a;
      } else {
         if (!this.dV().C) {
            boolean $$3 = this.go().isEmpty();
            if ($$1 == bsj.a) {
               if ($$3) {
                  this.gH();
               }

               $$0.a(awx.S);
            }

            if ($$3) {
               return bsk.c;
            }

            this.g($$0);
         }

         return bsk.a;
      }
   }

   private void gH() {
      this.r(40);
      if (!this.dV().A_()) {
         this.b(awn.Ba);
      }
   }

   private void g(cou $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.o_(), this.gx().c());
   }

   @Override
   public void a(@Nullable cou $$0) {
      boolean $$1 = this.gm() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gs();
      }
   }

   @Override
   protected void gs() {
      super.gs();
      this.gI();
   }

   private void gI() {
      if (!this.dV().A_()) {
         for (dej $$0 : this.go()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gy() {
      return true;
   }

   public void gz() {
      this.gN();

      for (dej $$0 : this.go()) {
         $$0.j();
      }

      this.gJ();
      this.cw = this.dV().ab();
      this.cx++;
   }

   private void gJ() {
      dek $$0 = this.go();
      cou $$1 = this.gm();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cc.l, $$0, this.gx().c(), this.q(), this.gp(), this.gy());
      }
   }

   private boolean gK() {
      for (dej $$0 : this.go()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gL() {
      return this.cx == 0 || this.cx < 2 && this.dV().ab() > this.cw + 2400L;
   }

   public boolean gA() {
      long $$0 = this.cw + 12000L;
      long $$1 = this.dV().ab();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dV().ac();
      if (this.cy > 0L) {
         long $$4 = this.cy / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cy = $$3;
      if ($$2) {
         this.cw = $$1;
         this.gV();
      }

      return this.gL() && this.gK();
   }

   private void gM() {
      int $$0 = 2 - this.cx;
      if ($$0 > 0) {
         for (dej $$1 : this.go()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gN();
      }

      this.gJ();
   }

   private void gN() {
      for (dej $$0 : this.go()) {
         $$0.g();
      }
   }

   private void h(cou $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dej $$2 : this.go()) {
            $$2.a(-azm.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(bts.F)) {
         btq $$3 = $$0.c(bts.F);
         int $$4 = $$3.e();

         for (dej $$5 : this.go()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cf, new cog(cok.c, coi.b, 1));
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      cog.c.encodeStart(uz.a, this.gx()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cr);
      $$0.a("Gossips", this.cs.a(uz.a));
      $$0.a("Xp", this.cv);
      $$0.a("LastRestock", this.cw);
      $$0.a("LastGossipDecay", this.cu);
      $$0.a("RestocksToday", this.cx);
      if (this.cB) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cog.c.parse(uz.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.al.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cr = $$0.f("FoodLevel");
      }

      ur $$1 = $$0.c("Gossips", 10);
      this.cs.a(new Dynamic(uz.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cv = $$0.h("Xp");
      }

      this.cw = $$0.i("LastRestock");
      this.cu = $$0.i("LastGossipDecay");
      if (this.dV() instanceof arp) {
         this.g((arp)this.dV());
      }

      this.cx = $$0.h("RestocksToday");
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
   protected awm t() {
      if (this.fP()) {
         return null;
      } else {
         return this.gn() ? awn.Bb : awn.AW;
      }
   }

   @Override
   protected awm e(btb $$0) {
      return awn.AZ;
   }

   @Override
   protected awm n_() {
      return awn.AY;
   }

   public void gB() {
      this.b(this.gx().b().f());
   }

   @Override
   public void a(cog $$0) {
      cog $$1 = this.gx();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.al.a(cf, $$0);
   }

   @Override
   public cog gx() {
      return this.al.a(cf);
   }

   @Override
   protected void b(dej $$0) {
      int $$1 = 3 + this.ae.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.gm();
      if (this.gR()) {
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
      if ($$0 != null && this.dV() instanceof arp) {
         ((arp)this.dV()).a(cgi.c, $$0, this);
         if (this.bL() && $$0 instanceof cou) {
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

      this.gO();
      super.a($$0);
   }

   private void gO() {
      this.a(cel.b);
      this.a(cel.c);
      this.a(cel.d);
      this.a(cel.e);
   }

   private void b(bul $$0) {
      if (this.dV() instanceof arp $$1) {
         Optional<cen> $$3 = this.bE.c(cel.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvw.class::isInstance).forEach($$2x -> $$1.a(cgi.d, $$0, (bvw)$$2x));
         }
      }
   }

   public void a(cel<jp> $$0) {
      if (this.dV() instanceof arp) {
         MinecraftServer $$1 = ((arp)this.dV()).p();
         this.bE.c($$0).ifPresent($$2 -> {
            arp $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cgl $$4 = $$3.z();
               Optional<jq<cgo>> $$5 = $$4.c($$2.b());
               BiPredicate<cof, jq<cgo>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agt.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean W_() {
      return this.cr + this.gT() >= 12 && !this.fP() && this.X_() == 0;
   }

   private boolean gP() {
      return this.cr < 12;
   }

   private void gQ() {
      if (this.gP() && this.gT() != 0) {
         for (int $$0 = 0; $$0 < this.v().b(); $$0++) {
            cwm $$1 = this.v().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cb.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cr = this.cr + $$2;
                     this.v().a($$0, 1);
                     if (!this.gP()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(cou $$0) {
      return this.cs.a($$0.cG(), $$0x -> true);
   }

   private void u(int $$0) {
      this.cr -= $$0;
   }

   public void gC() {
      this.gQ();
      this.u(12);
   }

   @Override
   public void b(dek $$0) {
      this.bZ = $$0;
   }

   private boolean gR() {
      int $$0 = this.gx().c();
      return cog.d($$0) && this.cv >= cog.c($$0);
   }

   private void gS() {
      this.a(this.gx().a(this.gx().c() + 1));
      this.gt();
   }

   @Override
   protected xj cz() {
      return xj.c(this.aq().g() + "." + lz.x.b(this.gx().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(ls.Q);
      } else if ($$0 == 13) {
         this.a(ls.a);
      } else if ($$0 == 14) {
         this.a(ls.O);
      } else if ($$0 == 42) {
         this.a(ls.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$2 == bur.e) {
         this.a(this.gx().a(coi.b));
      }

      if ($$2 == bur.n || $$2 == bur.m || bur.a($$2) || $$2 == bur.o) {
         this.a(this.gx().a(cok.a($$0.t(this.dv()))));
      }

      if ($$2 == bur.d) {
         this.cB = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cof b(arp $$0, buc $$1) {
      double $$2 = this.ae.j();
      cok $$3;
      if ($$2 < 0.5) {
         $$3 = cok.a($$0.t(this.dv()));
      } else if ($$2 < 0.75) {
         $$3 = this.gx().a();
      } else {
         $$3 = ((cof)$$1).gx().a();
      }

      cof $$6 = new cof(bus.bz, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dv()), bur.e, null);
      return $$6;
   }

   @Override
   public void a(arp $$0, bvg $$1) {
      if ($$0.ak() != bsh.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cmo $$2 = this.a(bus.bE, bug.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dv()), bur.i, null);
            $$1x.ai();
            this.gO();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(arp $$0, clc $$1) {
      cod.a($$0, this, this, $$1);
   }

   @Override
   public boolean c(arp $$0, cwm $$1) {
      cwi $$2 = $$1.h();
      return ($$1.a(axl.bP) || this.gx().b().d().contains($$2)) && this.v().c($$1);
   }

   public boolean gD() {
      return this.gT() >= 24;
   }

   public boolean gE() {
      return this.gT() < 12;
   }

   private int gT() {
      bsr $$0 = this.v();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gF() {
      return this.v().a_($$0 -> $$0.a(axl.bO));
   }

   @Override
   protected void gt() {
      cog $$0 = this.gx();
      Int2ObjectMap<coj.g[]> $$2;
      if (this.dV().J().b(crs.b)) {
         Int2ObjectMap<coj.g[]> $$1 = coj.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : coj.a.get($$0.b());
      } else {
         $$2 = coj.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         coj.g[] $$4 = (coj.g[])$$2.get($$0.c());
         if ($$4 != null) {
            dek $$5 = this.go();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arp $$0, cof $$1, long $$2) {
      if (($$2 < this.ct || $$2 >= this.ct + 1200L) && ($$2 < $$1.ct || $$2 >= $$1.ct + 1200L)) {
         this.cs.a($$1.cs, this.ae, 10);
         this.ct = $$2;
         $$1.ct = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gU() {
      long $$0 = this.dV().ab();
      if (this.cu == 0L) {
         this.cu = $$0;
      } else if ($$0 >= this.cu + 24000L) {
         this.cs.b();
         this.cu = $$0;
      }
   }

   public void a(arp $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ezt $$3 = this.cR().c(10.0, 10.0, 10.0);
         List<cof> $$4 = $$0.a(cof.class, $$3);
         List<cof> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!baf.a(bus.ao, bur.f, $$0, this.dv(), 10, 8, 6, baf.a.a).isEmpty()) {
               $$4.forEach(cfd::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dV().ab()) ? false : !this.bE.a(cel.F);
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
   public int q() {
      return this.cv;
   }

   public void t(int $$0) {
      this.cv = $$0;
   }

   private void gV() {
      this.gM();
      this.cx = 0;
   }

   public ceh gG() {
      return this.cs;
   }

   public void a(vi $$0) {
      this.cs.a(new Dynamic(uz.a, $$0));
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void b(jh $$0) {
      super.b($$0);
      this.bE.a(cel.H, this.dV().ab());
      this.bE.b(cel.m);
      this.bE.b(cel.E);
   }

   @Override
   public void fQ() {
      super.fQ();
      this.bE.a(cel.I, this.dV().ab());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bE.c(cel.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
