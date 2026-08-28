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

public class cnt extends cno implements bvk, cnv {
   private static final Logger ce = LogUtils.getLogger();
   private static final akk<cnu> cf = ako.a(cnt.class, akm.u);
   public static final int ca = 12;
   public static final Map<cvt, Integer> cb = ImmutableMap.of(cwb.py, 4, cwb.ui, 1, cwb.uh, 1, cwb.vm, 1);
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
   private coh cp;
   private boolean cq;
   private int cr;
   private final cdv cs = new cdv();
   private long ct;
   private long cu;
   private int cv;
   private long cw;
   private int cx;
   private long cy;
   private boolean cA;
   private static final ImmutableList<cdz<?>> cB = ImmutableList.of(
      cdz.b,
      cdz.c,
      cdz.d,
      cdz.e,
      cdz.g,
      cdz.h,
      cdz.i,
      cdz.j,
      cdz.k,
      cdz.l,
      cdz.L,
      cdz.aP,
      new cdz[]{cdz.m, cdz.n, cdz.q, cdz.r, cdz.t, cdz.v, cdz.w, cdz.x, cdz.y, cdz.A, cdz.f, cdz.C, cdz.D, cdz.E, cdz.H, cdz.I, cdz.J, cdz.F}
   );
   private static final ImmutableList<cfg<? extends cff<? super cnt>>> cC = ImmutableList.of(cfg.c, cfg.d, cfg.b, cfg.e, cfg.f, cfg.g, cfg.h, cfg.i, cfg.j);
   public static final Map<cdz<jo>, BiPredicate<cnt, jp<cgc>>> cd = ImmutableMap.of(
      cdz.b,
      (BiPredicate<cnt, jp>)($$0, $$1) -> $$1.a(cgd.n),
      cdz.c,
      (BiPredicate<cnt, jp>)($$0, $$1) -> $$0.gF().b().b().test($$1),
      cdz.d,
      (BiPredicate<cnt, jp>)($$0, $$1) -> cnw.a.test($$1),
      cdz.e,
      (BiPredicate<cnt, jp>)($$0, $$1) -> $$1.a(cgd.o)
   );

   public cnt(bug<? extends cnt> $$0, dev $$1) {
      this($$0, $$1, cny.c);
   }

   public cnt(bug<? extends cnt> $$0, dev $$1, cny $$2) {
      super($$0, $$1);
      ((ceg)this.P()).b(true);
      this.P().a(true);
      this.P().a(48.0F);
      this.a_(true);
      this.a(this.gF().a($$2).a(cnw.b));
   }

   @Override
   public bvx<cnt> ed() {
      return (bvx<cnt>)super.ed();
   }

   @Override
   protected bvx.b<cnt> ee() {
      return bvx.a(cB, cC);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      bvx<cnt> $$1 = this.ee().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(arm $$0) {
      bvx<cnt> $$1 = this.ed();
      $$1.b($$0, this);
      this.bC = $$1.i();
      this.a(this.ed());
   }

   private void a(bvx<cnt> $$0) {
      cnw $$1 = this.gF().b();
      if (this.p_()) {
         $$0.a(cqb.e);
         $$0.a(cpz.d, bzu.a(0.5F));
      } else {
         $$0.a(cqb.f);
         $$0.a(cpz.c, bzu.b($$1, 0.5F), ImmutableSet.of(Pair.of(cdz.c, cea.a)));
      }

      $$0.a(cpz.a, bzu.a($$1, 0.5F));
      $$0.a(cpz.f, bzu.d($$1, 0.5F), ImmutableSet.of(Pair.of(cdz.e, cea.a)));
      $$0.a(cpz.e, bzu.c($$1, 0.5F));
      $$0.a(cpz.b, bzu.e($$1, 0.5F));
      $$0.a(cpz.g, bzu.f($$1, 0.5F));
      $$0.a(cpz.i, bzu.g($$1, 0.5F));
      $$0.a(cpz.h, bzu.h($$1, 0.5F));
      $$0.a(cpz.j, bzu.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cpz.a));
      $$0.b(cpz.b);
      $$0.a(cpz.b);
      $$0.a(this.dX().ab(), this.dX().aa());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dX() instanceof arm) {
         this.a((arm)this.dX());
      }
   }

   public static bwc.a gE() {
      return bux.E().a(bwd.v, 0.5);
   }

   public boolean gG() {
      return this.cA;
   }

   @Override
   protected void ac() {
      this.dX().ah().a("villagerBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      if (this.cA) {
         this.cA = false;
      }

      if (!this.gw() && this.cn > 0) {
         this.cn--;
         if (this.cn <= 0) {
            if (this.co) {
               this.hb();
               this.co = false;
            }

            this.a(new bte(btg.j, 200, 0));
         }
      }

      if (this.cp != null && this.dX() instanceof arm) {
         ((arm)this.dX()).a(cfw.e, this.cp, this);
         this.dX().a(this, (byte)14);
         this.cp = null;
      }

      if (!this.gi() && this.af.a(100) == 0) {
         cpv $$0 = ((arm)this.dX()).d(this.dx());
         if ($$0 != null && $$0.u() && !$$0.a()) {
            this.dX().a(this, (byte)42);
         }
      }

      if (this.gF().b() == cnw.b && this.gw()) {
         this.gB();
      }

      super.ac();
   }

   @Override
   public void l() {
      super.l();
      if (this.q() > 0) {
         this.s(this.q() - 1);
      }

      this.hd();
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.tK) || !this.bM() || this.gw() || this.fT()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gQ();
         return bry.a;
      } else {
         if (!this.dX().C) {
            boolean $$3 = this.gx().isEmpty();
            if ($$1 == brx.a) {
               if ($$3) {
                  this.gQ();
               }

               $$0.a(awu.S);
            }

            if ($$3) {
               return bry.c;
            }

            this.g($$0);
         }

         return bry.a;
      }
   }

   private void gQ() {
      this.s(40);
      if (!this.dX().y_()) {
         this.b(awk.Ba);
      }
   }

   private void g(coh $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.S_(), this.gF().c());
   }

   @Override
   public void a(@Nullable coh $$0) {
      boolean $$1 = this.gv() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gB();
      }
   }

   @Override
   protected void gB() {
      super.gB();
      this.gR();
   }

   private void gR() {
      if (!this.dX().y_()) {
         for (dds $$0 : this.gx()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gH() {
      return true;
   }

   public void gI() {
      this.gW();

      for (dds $$0 : this.gx()) {
         $$0.j();
      }

      this.gS();
      this.cw = this.dX().aa();
      this.cx++;
   }

   private void gS() {
      ddt $$0 = this.gx();
      coh $$1 = this.gv();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.ca.l, $$0, this.gF().c(), this.t(), this.gy(), this.gH());
      }
   }

   private boolean gT() {
      for (dds $$0 : this.gx()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gU() {
      return this.cx == 0 || this.cx < 2 && this.dX().aa() > this.cw + 2400L;
   }

   public boolean gJ() {
      long $$0 = this.cw + 12000L;
      long $$1 = this.dX().aa();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dX().ab();
      if (this.cy > 0L) {
         long $$4 = this.cy / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cy = $$3;
      if ($$2) {
         this.cw = $$1;
         this.he();
      }

      return this.gU() && this.gT();
   }

   private void gV() {
      int $$0 = 2 - this.cx;
      if ($$0 > 0) {
         for (dds $$1 : this.gx()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gW();
      }

      this.gS();
   }

   private void gW() {
      for (dds $$0 : this.gx()) {
         $$0.g();
      }
   }

   private void h(coh $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dds $$2 : this.gx()) {
            $$2.a(-azj.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(btg.F)) {
         bte $$3 = $$0.c(btg.F);
         int $$4 = $$3.e();

         for (dds $$5 : this.gx()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, new cnu(cny.c, cnw.b, 1));
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      cnu.c.encodeStart(ux.a, this.gF()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cr);
      $$0.a("Gossips", this.cs.a(ux.a));
      $$0.a("Xp", this.cv);
      $$0.a("LastRestock", this.cw);
      $$0.a("LastGossipDecay", this.cu);
      $$0.a("RestocksToday", this.cx);
      if (this.cA) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cnu.c.parse(ux.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.am.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cr = $$0.f("FoodLevel");
      }

      up $$1 = $$0.c("Gossips", 10);
      this.cs.a(new Dynamic(ux.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cv = $$0.h("Xp");
      }

      this.cw = $$0.i("LastRestock");
      this.cu = $$0.i("LastGossipDecay");
      if (this.dX() instanceof arm) {
         this.a((arm)this.dX());
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
   protected awj w() {
      if (this.fT()) {
         return null;
      } else {
         return this.gw() ? awk.Bb : awk.AW;
      }
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.AZ;
   }

   @Override
   protected awj o_() {
      return awk.AY;
   }

   public void gK() {
      this.b(this.gF().b().f());
   }

   @Override
   public void a(cnu $$0) {
      cnu $$1 = this.gF();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.am.a(cf, $$0);
   }

   @Override
   public cnu gF() {
      return this.am.a(cf);
   }

   @Override
   protected void b(dds $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.gv();
      if (this.ha()) {
         this.cn = 40;
         this.co = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dX().b(new bul(this.dX(), this.dC(), this.dE() + 0.5, this.dI(), $$1));
      }
   }

   @Override
   public void a(@Nullable buv $$0) {
      if ($$0 != null && this.dX() instanceof arm) {
         ((arm)this.dX()).a(cfw.c, $$0, this);
         if (this.bM() && $$0 instanceof coh) {
            this.dX().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bsp $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      btz $$1 = $$0.d();
      if ($$1 != null) {
         this.c($$1);
      }

      this.gX();
      super.a($$0);
   }

   private void gX() {
      this.a(cdz.b);
      this.a(cdz.c);
      this.a(cdz.d);
      this.a(cdz.e);
   }

   private void c(btz $$0) {
      if (this.dX() instanceof arm $$1) {
         Optional<ceb> $$3 = this.bC.c(cdz.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvk.class::isInstance).forEach($$2x -> $$1.a(cfw.d, $$0, (bvk)$$2x));
         }
      }
   }

   public void a(cdz<jo> $$0) {
      if (this.dX() instanceof arm) {
         MinecraftServer $$1 = ((arm)this.dX()).o();
         this.bC.c($$0).ifPresent($$2 -> {
            arm $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cfz $$4 = $$3.y();
               Optional<jp<cgc>> $$5 = $$4.c($$2.b());
               BiPredicate<cnt, jp<cgc>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agr.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean ac_() {
      return this.cr + this.hc() >= 12 && !this.fT() && this.g() == 0;
   }

   private boolean gY() {
      return this.cr < 12;
   }

   private void gZ() {
      if (this.gY() && this.hc() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cvx $$1 = this.y().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cb.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cr = this.cr + $$2;
                     this.y().a($$0, 1);
                     if (!this.gY()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(coh $$0) {
      return this.cs.a($$0.cH(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cr -= $$0;
   }

   public void gL() {
      this.gZ();
      this.v(12);
   }

   @Override
   public void b(ddt $$0) {
      this.bZ = $$0;
   }

   private boolean ha() {
      int $$0 = this.gF().c();
      return cnu.d($$0) && this.cv >= cnu.c($$0);
   }

   private void hb() {
      this.a(this.gF().a(this.gF().c() + 1));
      this.gC();
   }

   @Override
   protected xh cA() {
      return xh.c(this.aq().g() + "." + lx.x.b(this.gF().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lq.Q);
      } else if ($$0 == 13) {
         this.a(lq.a);
      } else if ($$0 == 14) {
         this.a(lq.O);
      } else if ($$0 == 42) {
         this.a(lq.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$2 == buf.e) {
         this.a(this.gF().a(cnw.b));
      }

      if ($$2 == buf.n || $$2 == buf.m || buf.a($$2) || $$2 == buf.o) {
         this.a(this.gF().a(cny.a($$0.t(this.dx()))));
      }

      if ($$2 == buf.d) {
         this.cA = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cnt b(arm $$0, btq $$1) {
      double $$2 = this.af.j();
      cny $$3;
      if ($$2 < 0.5) {
         $$3 = cny.a($$0.t(this.dx()));
      } else if ($$2 < 0.75) {
         $$3 = this.gF().a();
      } else {
         $$3 = ((cnt)$$1).gF().a();
      }

      cnt $$6 = new cnt(bug.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dx()), buf.e, null);
      return $$6;
   }

   @Override
   public void a(arm $$0, buu $$1) {
      if ($$0.am() != brv.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cmc $$2 = this.a(bug.bo, btu.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dx()), buf.i, null);
            $$1x.gb();
            this.gX();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(ckq $$0) {
      cnr.a(this, this, $$0);
   }

   @Override
   public boolean i(cvx $$0) {
      cvt $$1 = $$0.h();
      return ($$0.a(axi.bL) || this.gF().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gM() {
      return this.hc() >= 24;
   }

   public boolean gN() {
      return this.hc() < 12;
   }

   private int hc() {
      bsf $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gO() {
      return this.y().a_($$0 -> $$0.a(axi.bK));
   }

   @Override
   protected void gC() {
      cnu $$0 = this.gF();
      Int2ObjectMap<cnx.g[]> $$2;
      if (this.dX().J().b(crc.c)) {
         Int2ObjectMap<cnx.g[]> $$1 = cnx.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cnx.a.get($$0.b());
      } else {
         $$2 = cnx.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cnx.g[] $$4 = (cnx.g[])$$2.get($$0.c());
         if ($$4 != null) {
            ddt $$5 = this.gx();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arm $$0, cnt $$1, long $$2) {
      if (($$2 < this.ct || $$2 >= this.ct + 1200L) && ($$2 < $$1.ct || $$2 >= $$1.ct + 1200L)) {
         this.cs.a($$1.cs, this.af, 10);
         this.ct = $$2;
         $$1.ct = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void hd() {
      long $$0 = this.dX().aa();
      if (this.cu == 0L) {
         this.cu = $$0;
      } else if ($$0 >= this.cu + 24000L) {
         this.cs.b();
         this.cu = $$0;
      }
   }

   public void a(arm $$0, long $$1, int $$2) {
      if (this.b($$1)) {
         ezc $$3 = this.cS().c(10.0, 10.0, 10.0);
         List<cnt> $$4 = $$0.a(cnt.class, $$3);
         List<cnt> $$5 = $$4.stream().filter($$1x -> $$1x.b($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bac.a(bug.af, buf.f, $$0, this.dx(), 10, 8, 6, bac.a.a).isEmpty()) {
               $$4.forEach(cer::b);
            }
         }
      }
   }

   public boolean b(long $$0) {
      return !this.c(this.dX().aa()) ? false : !this.bC.a(cdz.F);
   }

   @Override
   public void a(cfw $$0, btz $$1) {
      if ($$0 == cfw.a) {
         this.cs.a($$1.cH(), cdw.d, 20);
         this.cs.a($$1.cH(), cdw.c, 25);
      } else if ($$0 == cfw.e) {
         this.cs.a($$1.cH(), cdw.e, 2);
      } else if ($$0 == cfw.c) {
         this.cs.a($$1.cH(), cdw.b, 25);
      } else if ($$0 == cfw.d) {
         this.cs.a($$1.cH(), cdw.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cv;
   }

   public void u(int $$0) {
      this.cv = $$0;
   }

   private void he() {
      this.gV();
      this.cx = 0;
   }

   public cdv gP() {
      return this.cs;
   }

   public void a(vg $$0) {
      this.cs.a(new Dynamic(ux.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Override
   public void b(jg $$0) {
      super.b($$0);
      this.bC.a(cdz.H, this.dX().aa());
      this.bC.b(cdz.m);
      this.bC.b(cdz.E);
   }

   @Override
   public void fU() {
      super.fU();
      this.bC.a(cdz.I, this.dX().aa());
   }

   private boolean c(long $$0) {
      Optional<Long> $$1 = this.bC.c(cdz.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
