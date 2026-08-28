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

public class cny extends cnt implements bvp, coa {
   private static final Logger ce = LogUtils.getLogger();
   private static final akl<cnz> cf = akp.a(cny.class, akn.u);
   public static final int ca = 12;
   public static final Map<cvx, Integer> cb = ImmutableMap.of(cwf.py, 4, cwf.ui, 1, cwf.uh, 1, cwf.vm, 1);
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
   private com cp;
   private boolean cq;
   private int cr;
   private final cea cs = new cea();
   private long ct;
   private long cu;
   private int cv;
   private long cw;
   private int cx;
   private long cy;
   private boolean cA;
   private static final ImmutableList<cee<?>> cB = ImmutableList.of(
      cee.b,
      cee.c,
      cee.d,
      cee.e,
      cee.g,
      cee.h,
      cee.i,
      cee.j,
      cee.k,
      cee.l,
      cee.L,
      cee.aP,
      new cee[]{cee.m, cee.n, cee.q, cee.r, cee.t, cee.v, cee.w, cee.x, cee.y, cee.A, cee.f, cee.C, cee.D, cee.E, cee.H, cee.I, cee.J, cee.F}
   );
   private static final ImmutableList<cfl<? extends cfk<? super cny>>> cC = ImmutableList.of(cfl.c, cfl.d, cfl.b, cfl.e, cfl.f, cfl.g, cfl.h, cfl.i, cfl.j);
   public static final Map<cee<jp>, BiPredicate<cny, jq<cgh>>> cd = ImmutableMap.of(
      cee.b,
      (BiPredicate<cny, jq>)($$0, $$1) -> $$1.a(cgi.n),
      cee.c,
      (BiPredicate<cny, jq>)($$0, $$1) -> $$0.gE().b().b().test($$1),
      cee.d,
      (BiPredicate<cny, jq>)($$0, $$1) -> cob.a.test($$1),
      cee.e,
      (BiPredicate<cny, jq>)($$0, $$1) -> $$1.a(cgi.o)
   );

   public cny(bul<? extends cny> $$0, dfb $$1) {
      this($$0, $$1, cod.c);
   }

   public cny(bul<? extends cny> $$0, dfb $$1, cod $$2) {
      super($$0, $$1);
      ((cel)this.P()).b(true);
      this.P().a(true);
      this.P().a(48.0F);
      this.a_(true);
      this.a(this.gE().a($$2).a(cob.b));
   }

   @Override
   public bwc<cny> ed() {
      return (bwc<cny>)super.ed();
   }

   @Override
   protected bwc.b<cny> ee() {
      return bwc.a(cB, cC);
   }

   @Override
   protected bwc<?> a(Dynamic<?> $$0) {
      bwc<cny> $$1 = this.ee().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(arn $$0) {
      bwc<cny> $$1 = this.ed();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.ed());
   }

   private void a(bwc<cny> $$0) {
      cob $$1 = this.gE().b();
      if (this.p_()) {
         $$0.a(cqg.e);
         $$0.a(cqe.d, bzz.a(0.5F));
      } else {
         $$0.a(cqg.f);
         $$0.a(cqe.c, bzz.b($$1, 0.5F), ImmutableSet.of(Pair.of(cee.c, cef.a)));
      }

      $$0.a(cqe.a, bzz.a($$1, 0.5F));
      $$0.a(cqe.f, bzz.d($$1, 0.5F), ImmutableSet.of(Pair.of(cee.e, cef.a)));
      $$0.a(cqe.e, bzz.c($$1, 0.5F));
      $$0.a(cqe.b, bzz.e($$1, 0.5F));
      $$0.a(cqe.g, bzz.f($$1, 0.5F));
      $$0.a(cqe.i, bzz.g($$1, 0.5F));
      $$0.a(cqe.h, bzz.h($$1, 0.5F));
      $$0.a(cqe.j, bzz.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cqe.a));
      $$0.b(cqe.b);
      $$0.a(cqe.b);
      $$0.a(this.dX().ab(), this.dX().aa());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dX() instanceof arn) {
         this.a((arn)this.dX());
      }
   }

   public static bwh.a gD() {
      return bvc.E().a(bwi.v, 0.5);
   }

   public boolean gF() {
      return this.cA;
   }

   @Override
   protected void ac() {
      bon $$0 = bom.a();
      $$0.a("villagerBrain");
      this.ed().a((arn)this.dX(), this);
      $$0.c();
      if (this.cA) {
         this.cA = false;
      }

      if (!this.gv() && this.cn > 0) {
         this.cn--;
         if (this.cn <= 0) {
            if (this.co) {
               this.ha();
               this.co = false;
            }

            this.a(new btj(btl.j, 200, 0));
         }
      }

      if (this.cp != null && this.dX() instanceof arn) {
         ((arn)this.dX()).a(cgb.e, this.cp, this);
         this.dX().a(this, (byte)14);
         this.cp = null;
      }

      if (!this.gh() && this.af.a(100) == 0) {
         cqa $$1 = ((arn)this.dX()).d(this.dx());
         if ($$1 != null && $$1.u() && !$$1.a()) {
            this.dX().a(this, (byte)42);
         }
      }

      if (this.gE().b() == cob.b && this.gv()) {
         this.gA();
      }

      super.ac();
   }

   @Override
   public void l() {
      super.l();
      if (this.q() > 0) {
         this.s(this.q() - 1);
      }

      this.hc();
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.tK) || !this.bM() || this.gv() || this.fT()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gP();
         return bsd.a;
      } else {
         if (!this.dX().C) {
            boolean $$3 = this.gw().isEmpty();
            if ($$1 == bsc.a) {
               if ($$3) {
                  this.gP();
               }

               $$0.a(awv.S);
            }

            if ($$3) {
               return bsd.c;
            }

            this.g($$0);
         }

         return bsd.a;
      }
   }

   private void gP() {
      this.s(40);
      if (!this.dX().y_()) {
         this.b(awl.Ba);
      }
   }

   private void g(com $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.S_(), this.gE().c());
   }

   @Override
   public void a(@Nullable com $$0) {
      boolean $$1 = this.gu() != null && $$0 == null;
      super.a($$0);
      if ($$1) {
         this.gA();
      }
   }

   @Override
   protected void gA() {
      super.gA();
      this.gQ();
   }

   private void gQ() {
      if (!this.dX().y_()) {
         for (ddy $$0 : this.gw()) {
            $$0.n();
         }
      }
   }

   @Override
   public boolean gG() {
      return true;
   }

   public void gH() {
      this.gV();

      for (ddy $$0 : this.gw()) {
         $$0.j();
      }

      this.gR();
      this.cw = this.dX().aa();
      this.cx++;
   }

   private void gR() {
      ddz $$0 = this.gw();
      com $$1 = this.gu();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gE().c(), this.t(), this.gx(), this.gG());
      }
   }

   private boolean gS() {
      for (ddy $$0 : this.gw()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gT() {
      return this.cx == 0 || this.cx < 2 && this.dX().aa() > this.cw + 2400L;
   }

   public boolean gI() {
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
         this.hd();
      }

      return this.gT() && this.gS();
   }

   private void gU() {
      int $$0 = 2 - this.cx;
      if ($$0 > 0) {
         for (ddy $$1 : this.gw()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gV();
      }

      this.gR();
   }

   private void gV() {
      for (ddy $$0 : this.gw()) {
         $$0.g();
      }
   }

   private void h(com $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (ddy $$2 : this.gw()) {
            $$2.a(-azk.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(btl.F)) {
         btj $$3 = $$0.c(btl.F);
         int $$4 = $$3.e();

         for (ddy $$5 : this.gw()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(cf, new cnz(cod.c, cob.b, 1));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      cnz.c.encodeStart(uy.a, this.gE()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cr);
      $$0.a("Gossips", this.cs.a(uy.a));
      $$0.a("Xp", this.cv);
      $$0.a("LastRestock", this.cw);
      $$0.a("LastGossipDecay", this.cu);
      $$0.a("RestocksToday", this.cx);
      if (this.cA) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cnz.c.parse(uy.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.am.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cr = $$0.f("FoodLevel");
      }

      uq $$1 = $$0.c("Gossips", 10);
      this.cs.a(new Dynamic(uy.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cv = $$0.h("Xp");
      }

      this.cw = $$0.i("LastRestock");
      this.cu = $$0.i("LastGossipDecay");
      if (this.dX() instanceof arn) {
         this.a((arn)this.dX());
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
   protected awk w() {
      if (this.fT()) {
         return null;
      } else {
         return this.gv() ? awl.Bb : awl.AW;
      }
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.AZ;
   }

   @Override
   protected awk o_() {
      return awl.AY;
   }

   public void gJ() {
      this.b(this.gE().b().f());
   }

   @Override
   public void a(cnz $$0) {
      cnz $$1 = this.gE();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.am.a(cf, $$0);
   }

   @Override
   public cnz gE() {
      return this.am.a(cf);
   }

   @Override
   protected void b(ddy $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.gu();
      if (this.gZ()) {
         this.cn = 40;
         this.co = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dX().b(new buq(this.dX(), this.dC(), this.dE() + 0.5, this.dI(), $$1));
      }
   }

   @Override
   public void a(@Nullable bva $$0) {
      if ($$0 != null && this.dX() instanceof arn) {
         ((arn)this.dX()).a(cgb.c, $$0, this);
         if (this.bM() && $$0 instanceof com) {
            this.dX().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bsu $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bue $$1 = $$0.d();
      if ($$1 != null) {
         this.c($$1);
      }

      this.gW();
      super.a($$0);
   }

   private void gW() {
      this.a(cee.b);
      this.a(cee.c);
      this.a(cee.d);
      this.a(cee.e);
   }

   private void c(bue $$0) {
      if (this.dX() instanceof arn $$1) {
         Optional<ceg> $$3 = this.bF.c(cee.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvp.class::isInstance).forEach($$2x -> $$1.a(cgb.d, $$0, (bvp)$$2x));
         }
      }
   }

   public void a(cee<jp> $$0) {
      if (this.dX() instanceof arn) {
         MinecraftServer $$1 = ((arn)this.dX()).o();
         this.bF.c($$0).ifPresent($$2 -> {
            arn $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cge $$4 = $$3.y();
               Optional<jq<cgh>> $$5 = $$4.c($$2.b());
               BiPredicate<cny, jq<cgh>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  ags.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean ac_() {
      return this.cr + this.hb() >= 12 && !this.fT() && this.g() == 0;
   }

   private boolean gX() {
      return this.cr < 12;
   }

   private void gY() {
      if (this.gX() && this.hb() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cwb $$1 = this.y().a($$0);
            if (!$$1.f()) {
               Integer $$2 = cb.get($$1.h());
               if ($$2 != null) {
                  int $$3 = $$1.L();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cr = this.cr + $$2;
                     this.y().a($$0, 1);
                     if (!this.gX()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int f(com $$0) {
      return this.cs.a($$0.cH(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cr -= $$0;
   }

   public void gK() {
      this.gY();
      this.v(12);
   }

   @Override
   public void b(ddz $$0) {
      this.bZ = $$0;
   }

   private boolean gZ() {
      int $$0 = this.gE().c();
      return cnz.d($$0) && this.cv >= cnz.c($$0);
   }

   private void ha() {
      this.a(this.gE().a(this.gE().c() + 1));
      this.gB();
   }

   @Override
   protected xi cA() {
      return xi.c(this.ar().g() + "." + ly.x.b(this.gE().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(lr.Q);
      } else if ($$0 == 13) {
         this.a(lr.a);
      } else if ($$0 == 14) {
         this.a(lr.O);
      } else if ($$0 == 42) {
         this.a(lr.am);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$2 == buk.e) {
         this.a(this.gE().a(cob.b));
      }

      if ($$2 == buk.n || $$2 == buk.m || buk.a($$2) || $$2 == buk.o) {
         this.a(this.gE().a(cod.a($$0.t(this.dx()))));
      }

      if ($$2 == buk.d) {
         this.cA = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public cny b(arn $$0, btv $$1) {
      double $$2 = this.af.j();
      cod $$3;
      if ($$2 < 0.5) {
         $$3 = cod.a($$0.t(this.dx()));
      } else if ($$2 < 0.75) {
         $$3 = this.gE().a();
      } else {
         $$3 = ((cny)$$1).gE().a();
      }

      cny $$6 = new cny(bul.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dx()), buk.e, null);
      return $$6;
   }

   @Override
   public void a(arn $$0, buz $$1) {
      if ($$0.ak() != bsa.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cmh $$2 = this.a(bul.bo, btz.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dx()), buk.i, null);
            $$1x.ga();
            this.gW();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(ckv $$0) {
      cnw.a(this, this, $$0);
   }

   @Override
   public boolean i(cwb $$0) {
      cvx $$1 = $$0.h();
      return ($$0.a(axj.bO) || this.gE().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gL() {
      return this.hb() >= 24;
   }

   public boolean gM() {
      return this.hb() < 12;
   }

   private int hb() {
      bsk $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gN() {
      return this.y().a_($$0 -> $$0.a(axj.bN));
   }

   @Override
   protected void gB() {
      cnz $$0 = this.gE();
      Int2ObjectMap<coc.g[]> $$2;
      if (this.dX().J().b(crh.c)) {
         Int2ObjectMap<coc.g[]> $$1 = coc.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : coc.a.get($$0.b());
      } else {
         $$2 = coc.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         coc.g[] $$4 = (coc.g[])$$2.get($$0.c());
         if ($$4 != null) {
            ddz $$5 = this.gw();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arn $$0, cny $$1, long $$2) {
      if (($$2 < this.ct || $$2 >= this.ct + 1200L) && ($$2 < $$1.ct || $$2 >= $$1.ct + 1200L)) {
         this.cs.a($$1.cs, this.af, 10);
         this.ct = $$2;
         $$1.ct = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void hc() {
      long $$0 = this.dX().aa();
      if (this.cu == 0L) {
         this.cu = $$0;
      } else if ($$0 >= this.cu + 24000L) {
         this.cs.b();
         this.cu = $$0;
      }
   }

   public void a(arn $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ezi $$3 = this.cS().c(10.0, 10.0, 10.0);
         List<cny> $$4 = $$0.a(cny.class, $$3);
         List<cny> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bad.a(bul.af, buk.f, $$0, this.dx(), 10, 8, 6, bad.a.a).isEmpty()) {
               $$4.forEach(cew::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dX().aa()) ? false : !this.bF.a(cee.F);
   }

   @Override
   public void a(cgb $$0, bue $$1) {
      if ($$0 == cgb.a) {
         this.cs.a($$1.cH(), ceb.d, 20);
         this.cs.a($$1.cH(), ceb.c, 25);
      } else if ($$0 == cgb.e) {
         this.cs.a($$1.cH(), ceb.e, 2);
      } else if ($$0 == cgb.c) {
         this.cs.a($$1.cH(), ceb.b, 25);
      } else if ($$0 == cgb.d) {
         this.cs.a($$1.cH(), ceb.a, 25);
      }
   }

   @Override
   public int t() {
      return this.cv;
   }

   public void u(int $$0) {
      this.cv = $$0;
   }

   private void hd() {
      this.gU();
      this.cx = 0;
   }

   public cea gO() {
      return this.cs;
   }

   public void a(vh $$0) {
      this.cs.a(new Dynamic(uy.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      ags.a(this);
   }

   @Override
   public void b(jh $$0) {
      super.b($$0);
      this.bF.a(cee.H, this.dX().aa());
      this.bF.b(cee.m);
      this.bF.b(cee.E);
   }

   @Override
   public void fU() {
      super.fU();
      this.bF.a(cee.I, this.dX().aa());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(cee.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
