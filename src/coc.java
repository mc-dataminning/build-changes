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

public class coc extends cnx implements bvt, coe {
   private static final Logger ce = LogUtils.getLogger();
   private static final ako<cod> cf = aks.a(coc.class, akq.u);
   public static final int ca = 12;
   public static final Map<cwb, Integer> cb = ImmutableMap.of(cwj.py, 4, cwj.uy, 1, cwj.ux, 1, cwj.vC, 1);
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
   private cor cp;
   private boolean cq;
   private int cr;
   private final cee cs = new cee();
   private long ct;
   private long cu;
   private int cv;
   private long cw;
   private int cx;
   private long cy;
   private boolean cA;
   private static final ImmutableList<cei<?>> cB = ImmutableList.of(
      cei.b,
      cei.c,
      cei.d,
      cei.e,
      cei.g,
      cei.h,
      cei.i,
      cei.j,
      cei.k,
      cei.l,
      cei.L,
      cei.aP,
      new cei[]{cei.m, cei.n, cei.q, cei.r, cei.t, cei.v, cei.w, cei.x, cei.y, cei.A, cei.f, cei.C, cei.D, cei.E, cei.H, cei.I, cei.J, cei.F}
   );
   private static final ImmutableList<cfp<? extends cfo<? super coc>>> cC = ImmutableList.of(cfp.c, cfp.d, cfp.b, cfp.e, cfp.f, cfp.g, cfp.h, cfp.i, cfp.j);
   public static final Map<cei<jp>, BiPredicate<coc, jq<cgl>>> cd = ImmutableMap.of(
      cei.b,
      (BiPredicate<coc, jq>)($$0, $$1) -> $$1.a(cgm.n),
      cei.c,
      (BiPredicate<coc, jq>)($$0, $$1) -> $$0.gF().b().b().test($$1),
      cei.d,
      (BiPredicate<coc, jq>)($$0, $$1) -> cof.a.test($$1),
      cei.e,
      (BiPredicate<coc, jq>)($$0, $$1) -> $$1.a(cgm.o)
   );

   public coc(bup<? extends coc> $$0, dff $$1) {
      this($$0, $$1, coh.c);
   }

   public coc(bup<? extends coc> $$0, dff $$1, coh $$2) {
      super($$0, $$1);
      ((cep)this.P()).b(true);
      this.P().a(true);
      this.P().a(48.0F);
      this.a_(true);
      this.a(this.gF().a($$2).a(cof.b));
   }

   @Override
   public bwg<coc> ee() {
      return (bwg<coc>)super.ee();
   }

   @Override
   protected bwg.b<coc> ef() {
      return bwg.a(cB, cC);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      bwg<coc> $$1 = this.ef().a($$0);
      this.a($$1);
      return $$1;
   }

   public void a(arq $$0) {
      bwg<coc> $$1 = this.ee();
      $$1.b($$0, this);
      this.bF = $$1.i();
      this.a(this.ee());
   }

   private void a(bwg<coc> $$0) {
      cof $$1 = this.gF().b();
      if (this.p_()) {
         $$0.a(cqk.e);
         $$0.a(cqi.d, cad.a(0.5F));
      } else {
         $$0.a(cqk.f);
         $$0.a(cqi.c, cad.b($$1, 0.5F), ImmutableSet.of(Pair.of(cei.c, cej.a)));
      }

      $$0.a(cqi.a, cad.a($$1, 0.5F));
      $$0.a(cqi.f, cad.d($$1, 0.5F), ImmutableSet.of(Pair.of(cei.e, cej.a)));
      $$0.a(cqi.e, cad.c($$1, 0.5F));
      $$0.a(cqi.b, cad.e($$1, 0.5F));
      $$0.a(cqi.g, cad.f($$1, 0.5F));
      $$0.a(cqi.i, cad.g($$1, 0.5F));
      $$0.a(cqi.h, cad.h($$1, 0.5F));
      $$0.a(cqi.j, cad.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cqi.a));
      $$0.b(cqi.b);
      $$0.a(cqi.b);
      $$0.a(this.dY().ab(), this.dY().aa());
   }

   @Override
   protected void k() {
      super.k();
      if (this.dY() instanceof arq) {
         this.a((arq)this.dY());
      }
   }

   public static bwl.a gE() {
      return bvg.E().a(bwm.v, 0.5);
   }

   public boolean gG() {
      return this.cA;
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("villagerBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
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

            this.a(new btn(btp.j, 200, 0));
         }
      }

      if (this.cp != null && this.dY() instanceof arq) {
         ((arq)this.dY()).a(cgf.e, this.cp, this);
         this.dY().a(this, (byte)14);
         this.cp = null;
      }

      if (!this.gi() && this.af.a(100) == 0) {
         cqe $$1 = ((arq)this.dY()).d(this.dy());
         if ($$1 != null && $$1.u() && !$$1.a()) {
            this.dY().a(this, (byte)42);
         }
      }

      if (this.gF().b() == cof.b && this.gw()) {
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
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.ua) || !this.bN() || this.gw() || this.fU()) {
         return super.b($$0, $$1);
      } else if (this.p_()) {
         this.gQ();
         return bsh.a;
      } else {
         if (!this.dY().C) {
            boolean $$3 = this.gx().isEmpty();
            if ($$1 == bsg.a) {
               if ($$3) {
                  this.gQ();
               }

               $$0.a(awy.S);
            }

            if ($$3) {
               return bsh.c;
            }

            this.g($$0);
         }

         return bsh.a;
      }
   }

   private void gQ() {
      this.s(40);
      if (!this.dY().y_()) {
         this.b(awo.Ba);
      }
   }

   private void g(cor $$0) {
      this.h($$0);
      this.a($$0);
      this.a($$0, this.S_(), this.gF().c());
   }

   @Override
   public void a(@Nullable cor $$0) {
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
      if (!this.dY().y_()) {
         for (dec $$0 : this.gx()) {
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

      for (dec $$0 : this.gx()) {
         $$0.j();
      }

      this.gS();
      this.cw = this.dY().aa();
      this.cx++;
   }

   private void gS() {
      ded $$0 = this.gx();
      cor $$1 = this.gv();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.cd.l, $$0, this.gF().c(), this.t(), this.gy(), this.gH());
      }
   }

   private boolean gT() {
      for (dec $$0 : this.gx()) {
         if ($$0.t()) {
            return true;
         }
      }

      return false;
   }

   private boolean gU() {
      return this.cx == 0 || this.cx < 2 && this.dY().aa() > this.cw + 2400L;
   }

   public boolean gJ() {
      long $$0 = this.cw + 12000L;
      long $$1 = this.dY().aa();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dY().ab();
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
         for (dec $$1 : this.gx()) {
            $$1.j();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gW();
      }

      this.gS();
   }

   private void gW() {
      for (dec $$0 : this.gx()) {
         $$0.g();
      }
   }

   private void h(cor $$0) {
      int $$1 = this.f($$0);
      if ($$1 != 0) {
         for (dec $$2 : this.gx()) {
            $$2.a(-azn.d((float)$$1 * $$2.p()));
         }
      }

      if ($$0.b(btp.F)) {
         btn $$3 = $$0.c(btp.F);
         int $$4 = $$3.e();

         for (dec $$5 : this.gx()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().L());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(cf, new cod(coh.c, cof.b, 1));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      cod.c.encodeStart(vb.a, this.gF()).resultOrPartial(ce::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cr);
      $$0.a("Gossips", this.cs.a(vb.a));
      $$0.a("Xp", this.cv);
      $$0.a("LastRestock", this.cw);
      $$0.a("LastGossipDecay", this.cu);
      $$0.a("RestocksToday", this.cx);
      if (this.cA) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cod.c.parse(vb.a, $$0.c("VillagerData")).resultOrPartial(ce::error).ifPresent($$0x -> this.am.a(cf, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cr = $$0.f("FoodLevel");
      }

      ut $$1 = $$0.c("Gossips", 10);
      this.cs.a(new Dynamic(vb.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cv = $$0.h("Xp");
      }

      this.cw = $$0.i("LastRestock");
      this.cu = $$0.i("LastGossipDecay");
      if (this.dY() instanceof arq) {
         this.a((arq)this.dY());
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
   protected awn w() {
      if (this.fU()) {
         return null;
      } else {
         return this.gw() ? awo.Bb : awo.AW;
      }
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.AZ;
   }

   @Override
   protected awn o_() {
      return awo.AY;
   }

   public void gK() {
      this.b(this.gF().b().f());
   }

   @Override
   public void a(cod $$0) {
      cod $$1 = this.gF();
      if ($$1.b() != $$0.b()) {
         this.bZ = null;
      }

      this.am.a(cf, $$0);
   }

   @Override
   public cod gF() {
      return this.am.a(cf);
   }

   @Override
   protected void b(dec $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cv = this.cv + $$0.q();
      this.cp = this.gv();
      if (this.ha()) {
         this.cn = 40;
         this.co = true;
         $$1 += 5;
      }

      if ($$0.u()) {
         this.dY().b(new buu(this.dY(), this.dD(), this.dF() + 0.5, this.dJ(), $$1));
      }
   }

   @Override
   public void a(@Nullable bve $$0) {
      if ($$0 != null && this.dY() instanceof arq) {
         ((arq)this.dY()).a(cgf.c, $$0, this);
         if (this.bN() && $$0 instanceof cor) {
            this.dY().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bsy $$0) {
      ce.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bui $$1 = $$0.d();
      if ($$1 != null) {
         this.c($$1);
      }

      this.gX();
      super.a($$0);
   }

   private void gX() {
      this.a(cei.b);
      this.a(cei.c);
      this.a(cei.d);
      this.a(cei.e);
   }

   private void c(bui $$0) {
      if (this.dY() instanceof arq $$1) {
         Optional<cek> $$3 = this.bF.c(cei.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bvt.class::isInstance).forEach($$2x -> $$1.a(cgf.d, $$0, (bvt)$$2x));
         }
      }
   }

   public void a(cei<jp> $$0) {
      if (this.dY() instanceof arq) {
         MinecraftServer $$1 = ((arq)this.dY()).o();
         this.bF.c($$0).ifPresent($$2 -> {
            arq $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               cgi $$4 = $$3.y();
               Optional<jq<cgl>> $$5 = $$4.c($$2.b());
               BiPredicate<coc, jq<cgl>> $$6 = cd.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  agv.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean ac_() {
      return this.cr + this.hc() >= 12 && !this.fU() && this.g() == 0;
   }

   private boolean gY() {
      return this.cr < 12;
   }

   private void gZ() {
      if (this.gY() && this.hc() != 0) {
         for (int $$0 = 0; $$0 < this.y().b(); $$0++) {
            cwf $$1 = this.y().a($$0);
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

   public int f(cor $$0) {
      return this.cs.a($$0.cI(), $$0x -> true);
   }

   private void v(int $$0) {
      this.cr -= $$0;
   }

   public void gL() {
      this.gZ();
      this.v(12);
   }

   @Override
   public void b(ded $$0) {
      this.bZ = $$0;
   }

   private boolean ha() {
      int $$0 = this.gF().c();
      return cod.d($$0) && this.cv >= cod.c($$0);
   }

   private void hb() {
      this.a(this.gF().a(this.gF().c() + 1));
      this.gC();
   }

   @Override
   protected xl cB() {
      return xl.c(this.ar().g() + "." + lz.x.b(this.gF().b()).a());
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
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if ($$2 == buo.e) {
         this.a(this.gF().a(cof.b));
      }

      if ($$2 == buo.n || $$2 == buo.m || buo.a($$2) || $$2 == buo.o) {
         this.a(this.gF().a(coh.a($$0.t(this.dy()))));
      }

      if ($$2 == buo.d) {
         this.cA = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public coc b(arq $$0, btz $$1) {
      double $$2 = this.af.j();
      coh $$3;
      if ($$2 < 0.5) {
         $$3 = coh.a($$0.t(this.dy()));
      } else if ($$2 < 0.75) {
         $$3 = this.gF().a();
      } else {
         $$3 = ((coc)$$1).gF().a();
      }

      coc $$6 = new coc(bup.bj, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dy()), buo.e, null);
      return $$6;
   }

   @Override
   public void a(arq $$0, bvd $$1) {
      if ($$0.ak() != bse.a) {
         ce.info("Villager {} was struck by lightning {}.", this, $$1);
         cml $$2 = this.a(bup.bo, bud.a(this, false, false), $$1x -> {
            $$1x.a($$0, $$0.d_($$1x.dy()), buo.i, null);
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
   protected void b(ckz $$0) {
      coa.a(this, this, $$0);
   }

   @Override
   public boolean i(cwf $$0) {
      cwb $$1 = $$0.h();
      return ($$0.a(axm.bP) || this.gF().b().d().contains($$1)) && this.y().c($$0);
   }

   public boolean gM() {
      return this.hc() >= 24;
   }

   public boolean gN() {
      return this.hc() < 12;
   }

   private int hc() {
      bso $$0 = this.y();
      return cb.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gO() {
      return this.y().a_($$0 -> $$0.a(axm.bO));
   }

   @Override
   protected void gC() {
      cod $$0 = this.gF();
      Int2ObjectMap<cog.g[]> $$2;
      if (this.dY().J().b(crl.c)) {
         Int2ObjectMap<cog.g[]> $$1 = cog.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : cog.a.get($$0.b());
      } else {
         $$2 = cog.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         cog.g[] $$4 = (cog.g[])$$2.get($$0.c());
         if ($$4 != null) {
            ded $$5 = this.gx();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(arq $$0, coc $$1, long $$2) {
      if (($$2 < this.ct || $$2 >= this.ct + 1200L) && ($$2 < $$1.ct || $$2 >= $$1.ct + 1200L)) {
         this.cs.a($$1.cs, this.af, 10);
         this.ct = $$2;
         $$1.ct = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void hd() {
      long $$0 = this.dY().aa();
      if (this.cu == 0L) {
         this.cu = $$0;
      } else if ($$0 >= this.cu + 24000L) {
         this.cs.b();
         this.cu = $$0;
      }
   }

   public void a(arq $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         ezm $$3 = this.cT().c(10.0, 10.0, 10.0);
         List<coc> $$4 = $$0.a(coc.class, $$3);
         List<coc> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).toList();
         if ($$5.size() >= $$2) {
            if (!bag.a(bup.af, buo.f, $$0, this.dy(), 10, 8, 6, bag.a.a).isEmpty()) {
               $$4.forEach(cfa::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dY().aa()) ? false : !this.bF.a(cei.F);
   }

   @Override
   public void a(cgf $$0, bui $$1) {
      if ($$0 == cgf.a) {
         this.cs.a($$1.cI(), cef.d, 20);
         this.cs.a($$1.cI(), cef.c, 25);
      } else if ($$0 == cgf.e) {
         this.cs.a($$1.cI(), cef.e, 2);
      } else if ($$0 == cgf.c) {
         this.cs.a($$1.cI(), cef.b, 25);
      } else if ($$0 == cgf.d) {
         this.cs.a($$1.cI(), cef.a, 25);
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

   public cee gP() {
      return this.cs;
   }

   public void a(vk $$0) {
      this.cs.a(new Dynamic(vb.a, $$0));
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Override
   public void b(jh $$0) {
      super.b($$0);
      this.bF.a(cei.H, this.dY().aa());
      this.bF.b(cei.m);
      this.bF.b(cei.E);
   }

   @Override
   public void fV() {
      super.fV();
      this.bF.a(cei.I, this.dY().aa());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bF.c(cei.H);
      return $$1.filter($$1x -> $$0 - $$1x < 24000L).isPresent();
   }
}
