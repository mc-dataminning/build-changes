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
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class chn extends chi implements bpl, chp {
   private static final Logger cb = LogUtils.getLogger();
   private static final aii<cho> cc = ail.a(chn.class, aik.t);
   public static final int bX = 12;
   public static final Map<cpl, Integer> bY = ImmutableMap.of(cpt.pw, 4, cpt.uc, 1, cpt.ub, 1, cpt.vg, 1);
   private static final int cd = 2;
   private static final Set<cpl> ce = ImmutableSet.of(cpt.pw, cpt.uc, cpt.ub, cpt.pv, cpt.pu, cpt.vg, new cpl[]{cpt.vh, cpt.ve, cpt.vf});
   private static final int cf = 10;
   private static final int cg = 1200;
   private static final int ch = 24000;
   private static final int ci = 25;
   private static final int cj = 10;
   private static final int ck = 5;
   private static final long cl = 24000L;
   @VisibleForTesting
   public static final float bZ = 0.5F;
   private int cm;
   private boolean cn;
   @Nullable
   private cia co;
   private boolean cp;
   private int cq;
   private final bxw cr = new bxw();
   private long cs;
   private long ct;
   private int cu;
   private long cv;
   private int cx;
   private long cy;
   private boolean cz;
   private static final ImmutableList<bya<?>> cA = ImmutableList.of(
      bya.b,
      bya.c,
      bya.d,
      bya.e,
      bya.g,
      bya.h,
      bya.i,
      bya.j,
      bya.k,
      bya.l,
      bya.L,
      bya.aP,
      new bya[]{bya.m, bya.n, bya.q, bya.r, bya.t, bya.v, bya.w, bya.x, bya.y, bya.A, bya.f, bya.C, bya.D, bya.E, bya.H, bya.I, bya.J, bya.F}
   );
   private static final ImmutableList<bzh<? extends bzg<? super chn>>> cB = ImmutableList.of(bzh.c, bzh.d, bzh.b, bzh.e, bzh.f, bzh.g, bzh.h, bzh.i, bzh.j);
   public static final Map<bya<ik>, BiPredicate<chn, il<cad>>> ca = ImmutableMap.of(
      bya.b,
      (BiPredicate<chn, il>)($$0, $$1) -> $$1.a(cae.n),
      bya.c,
      (BiPredicate<chn, il>)($$0, $$1) -> $$0.gw().b().b().test($$1),
      bya.d,
      (BiPredicate<chn, il>)($$0, $$1) -> chq.a.test($$1),
      bya.e,
      (BiPredicate<chn, il>)($$0, $$1) -> $$1.a(cae.o)
   );

   public chn(bol<? extends chn> $$0, cwe $$1) {
      this($$0, $$1, chs.c);
   }

   public chn(bol<? extends chn> $$0, cwe $$1, chs $$2) {
      super($$0, $$1);
      ((byh)this.N()).b(true);
      this.N().a(true);
      this.s(true);
      this.a(this.gw().a($$2).a(chq.b));
   }

   @Override
   public bpy<chn> dM() {
      return (bpy<chn>)super.dM();
   }

   @Override
   protected bpy.b<chn> dN() {
      return bpy.a(cA, cB);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      bpy<chn> $$1 = this.dN().a($$0);
      this.a($$1);
      return $$1;
   }

   public void c(apa $$0) {
      bpy<chn> $$1 = this.dM();
      $$1.b($$0, this);
      this.bA = $$1.i();
      this.a(this.dM());
   }

   private void a(bpy<chn> $$0) {
      chq $$1 = this.gw().b();
      if (this.o_()) {
         $$0.a(cjp.e);
         $$0.a(cjn.d, btv.a(0.5F));
      } else {
         $$0.a(cjp.f);
         $$0.a(cjn.c, btv.b($$1, 0.5F), ImmutableSet.of(Pair.of(bya.c, byb.a)));
      }

      $$0.a(cjn.a, btv.a($$1, 0.5F));
      $$0.a(cjn.f, btv.d($$1, 0.5F), ImmutableSet.of(Pair.of(bya.e, byb.a)));
      $$0.a(cjn.e, btv.c($$1, 0.5F));
      $$0.a(cjn.b, btv.e($$1, 0.5F));
      $$0.a(cjn.g, btv.f($$1, 0.5F));
      $$0.a(cjn.i, btv.g($$1, 0.5F));
      $$0.a(cjn.h, btv.h($$1, 0.5F));
      $$0.a(cjn.j, btv.i($$1, 0.5F));
      $$0.a(ImmutableSet.of(cjn.a));
      $$0.b(cjn.b);
      $$0.a(cjn.b);
      $$0.a(this.dJ().Y(), this.dJ().X());
   }

   @Override
   protected void m() {
      super.m();
      if (this.dJ() instanceof apa) {
         this.c((apa)this.dJ());
      }
   }

   public static bqd.a gu() {
      return boz.C().a(bqe.o, 0.5).a(bqe.i, 48.0);
   }

   public boolean gv() {
      return this.cz;
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("villagerBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().c();
      if (this.cz) {
         this.cz = false;
      }

      if (!this.gm() && this.cm > 0) {
         this.cm--;
         if (this.cm <= 0) {
            if (this.cn) {
               this.gS();
               this.cn = false;
            }

            this.b(new bns(bnu.j, 200, 0));
         }
      }

      if (this.co != null && this.dJ() instanceof apa) {
         ((apa)this.dJ()).a(bzx.e, this.co, this);
         this.dJ().a(this, (byte)14);
         this.co = null;
      }

      if (!this.gb() && this.af.a(100) == 0) {
         cjj $$0 = ((apa)this.dJ()).d(this.dj());
         if ($$0 != null && $$0.v() && !$$0.a()) {
            this.dJ().a(this, (byte)42);
         }
      }

      if (this.gw().b() == chq.b && this.gm()) {
         this.gr();
      }

      super.aa();
   }

   @Override
   public void l() {
      super.l();
      if (this.u() > 0) {
         this.t(this.u() - 1);
      }

      this.gU();
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.tH) || !this.bx() || this.gm() || this.fF()) {
         return super.b($$0, $$1);
      } else if (this.o_()) {
         this.gH();
         return bml.a(this.dJ().B);
      } else {
         boolean $$3 = this.gn().isEmpty();
         if ($$1 == bmk.a) {
            if ($$3 && !this.dJ().B) {
               this.gH();
            }

            $$0.a(atz.S);
         }

         if ($$3) {
            return bml.a(this.dJ().B);
         } else {
            if (!this.dJ().B && !this.bW.isEmpty()) {
               this.h($$0);
            }

            return bml.a(this.dJ().B);
         }
      }
   }

   private void gH() {
      this.t(40);
      if (!this.dJ().y_()) {
         this.b(atp.Ao);
      }
   }

   private void h(cia $$0) {
      this.i($$0);
      this.f($$0);
      this.a($$0, this.Q_(), this.gw().c());
   }

   @Override
   public void f(@Nullable cia $$0) {
      boolean $$1 = this.gl() != null && $$0 == null;
      super.f($$0);
      if ($$1) {
         this.gr();
      }
   }

   @Override
   protected void gr() {
      super.gr();
      this.gI();
   }

   private void gI() {
      for (cvc $$0 : this.gn()) {
         $$0.m();
      }
   }

   @Override
   public boolean gx() {
      return true;
   }

   @Override
   public boolean gt() {
      return this.dJ().B;
   }

   public void gy() {
      this.gN();

      for (cvc $$0 : this.gn()) {
         $$0.h();
      }

      this.gJ();
      this.cv = this.dJ().X();
      this.cx++;
   }

   private void gJ() {
      cvd $$0 = this.gn();
      cia $$1 = this.gl();
      if ($$1 != null && !$$0.isEmpty()) {
         $$1.a($$1.bX.j, $$0, this.gw().c(), this.w(), this.go(), this.gx());
      }
   }

   private boolean gK() {
      for (cvc $$0 : this.gn()) {
         if ($$0.s()) {
            return true;
         }
      }

      return false;
   }

   private boolean gL() {
      return this.cx == 0 || this.cx < 2 && this.dJ().X() > this.cv + 2400L;
   }

   public boolean gz() {
      long $$0 = this.cv + 12000L;
      long $$1 = this.dJ().X();
      boolean $$2 = $$1 > $$0;
      long $$3 = this.dJ().Y();
      if (this.cy > 0L) {
         long $$4 = this.cy / 24000L;
         long $$5 = $$3 / 24000L;
         $$2 |= $$5 > $$4;
      }

      this.cy = $$3;
      if ($$2) {
         this.cv = $$1;
         this.gV();
      }

      return this.gL() && this.gK();
   }

   private void gM() {
      int $$0 = 2 - this.cx;
      if ($$0 > 0) {
         for (cvc $$1 : this.gn()) {
            $$1.h();
         }
      }

      for (int $$2 = 0; $$2 < $$0; $$2++) {
         this.gN();
      }

      this.gJ();
   }

   private void gN() {
      for (cvc $$0 : this.gn()) {
         $$0.e();
      }
   }

   private void i(cia $$0) {
      int $$1 = this.g($$0);
      if ($$1 != 0) {
         for (cvc $$2 : this.gn()) {
            $$2.a(-awm.d((float)$$1 * $$2.o()));
         }
      }

      if ($$0.a(bnu.F)) {
         bns $$3 = $$0.c(bnu.F);
         int $$4 = $$3.d();

         for (cvc $$5 : this.gn()) {
            double $$6 = 0.3 + 0.0625 * (double)$$4;
            int $$7 = (int)Math.floor($$6 * (double)$$5.a().M());
            $$5.a(-Math.max($$7, 1));
         }
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, new cho(chs.c, chq.b, 1));
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      cho.c.encodeStart(tm.a, this.gw()).resultOrPartial(cb::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      $$0.a("FoodLevel", (byte)this.cq);
      $$0.a("Gossips", this.cr.a(tm.a));
      $$0.a("Xp", this.cu);
      $$0.a("LastRestock", this.cv);
      $$0.a("LastGossipDecay", this.ct);
      $$0.a("RestocksToday", this.cx);
      if (this.cz) {
         $$0.a("AssignProfessionWhenSpawned", true);
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         cho.c.parse(tm.a, $$0.c("VillagerData")).resultOrPartial(cb::error).ifPresent($$0x -> this.am.b(cc, $$0x));
      }

      if ($$0.b("FoodLevel", 1)) {
         this.cq = $$0.f("FoodLevel");
      }

      te $$1 = $$0.c("Gossips", 10);
      this.cr.a(new Dynamic(tm.a, $$1));
      if ($$0.b("Xp", 3)) {
         this.cu = $$0.h("Xp");
      }

      this.cv = $$0.i("LastRestock");
      this.ct = $$0.i("LastGossipDecay");
      this.s(true);
      if (this.dJ() instanceof apa) {
         this.c((apa)this.dJ());
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
   protected ato y() {
      if (this.fF()) {
         return null;
      } else {
         return this.gm() ? atp.Ap : atp.Ak;
      }
   }

   @Override
   protected ato d(bne $$0) {
      return atp.An;
   }

   @Override
   protected ato n_() {
      return atp.Am;
   }

   public void gA() {
      this.b(this.gw().b().f());
   }

   @Override
   public void a(cho $$0) {
      cho $$1 = this.gw();
      if ($$1.b() != $$0.b()) {
         this.bW = null;
      }

      this.am.b(cc, $$0);
   }

   @Override
   public cho gw() {
      return this.am.b(cc);
   }

   @Override
   protected void b(cvc $$0) {
      int $$1 = 3 + this.af.a(4);
      this.cu = this.cu + $$0.p();
      this.co = this.gl();
      if (this.gR()) {
         this.cm = 40;
         this.cn = true;
         $$1 += 5;
      }

      if ($$0.t()) {
         this.dJ().b(new bon(this.dJ(), this.do(), this.dq() + 0.5, this.du(), $$1));
      }
   }

   public void x(boolean $$0) {
      this.cp = $$0;
   }

   public boolean gB() {
      return this.cp;
   }

   @Override
   public void a(@Nullable box $$0) {
      if ($$0 != null && this.dJ() instanceof apa) {
         ((apa)this.dJ()).a(bzx.c, $$0, this);
         if (this.bx() && $$0 instanceof cia) {
            this.dJ().a(this, (byte)13);
         }
      }

      super.a($$0);
   }

   @Override
   public void a(bne $$0) {
      cb.info("Villager {} died, message: '{}'", this, $$0.a(this).getString());
      bof $$1 = $$0.d();
      if ($$1 != null) {
         this.a($$1);
      }

      this.gO();
      super.a($$0);
   }

   private void gO() {
      this.a(bya.b);
      this.a(bya.c);
      this.a(bya.d);
      this.a(bya.e);
   }

   private void a(bof $$0) {
      if (this.dJ() instanceof apa $$1) {
         Optional<byc> $$3 = this.bA.c(bya.h);
         if (!$$3.isEmpty()) {
            $$3.get().b(bpl.class::isInstance).forEach($$2x -> $$1.a(bzx.d, $$0, (bpl)$$2x));
         }
      }
   }

   public void a(bya<ik> $$0) {
      if (this.dJ() instanceof apa) {
         MinecraftServer $$1 = ((apa)this.dJ()).o();
         this.bA.c($$0).ifPresent($$2 -> {
            apa $$3 = $$1.a($$2.a());
            if ($$3 != null) {
               caa $$4 = $$3.y();
               Optional<il<cad>> $$5 = $$4.c($$2.b());
               BiPredicate<chn, il<cad>> $$6 = ca.get($$0);
               if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                  $$4.b($$2.b());
                  aes.c($$3, $$2.b());
               }
            }
         });
      }
   }

   @Override
   public boolean Y_() {
      return this.cq + this.gT() >= 12 && !this.fF() && this.h() == 0;
   }

   private boolean gP() {
      return this.cq < 12;
   }

   private void gQ() {
      if (this.gP() && this.gT() != 0) {
         for (int $$0 = 0; $$0 < this.A().b(); $$0++) {
            cpq $$1 = this.A().a($$0);
            if (!$$1.b()) {
               Integer $$2 = bY.get($$1.d());
               if ($$2 != null) {
                  int $$3 = $$1.M();

                  for (int $$4 = $$3; $$4 > 0; $$4--) {
                     this.cq = this.cq + $$2;
                     this.A().a($$0, 1);
                     if (!this.gP()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   public int g(cia $$0) {
      return this.cr.a($$0.ct(), $$0x -> true);
   }

   private void w(int $$0) {
      this.cq -= $$0;
   }

   public void gC() {
      this.gQ();
      this.w(12);
   }

   @Override
   public void b(cvd $$0) {
      this.bW = $$0;
   }

   private boolean gR() {
      int $$0 = this.gw().c();
      return cho.d($$0) && this.cu >= cho.c($$0);
   }

   private void gS() {
      this.a(this.gw().a(this.gw().c() + 1));
      this.gs();
   }

   @Override
   protected vs cl() {
      return vs.c(this.ai().g() + "." + kh.z.b(this.gw().b()).a());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 12) {
         this.a(kb.O);
      } else if ($$0 == 13) {
         this.a(kb.b);
      } else if ($$0 == 14) {
         this.a(kb.M);
      } else if ($$0 == 42) {
         this.a(kb.aj);
      } else {
         super.b($$0);
      }
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if ($$2 == bpb.e) {
         this.a(this.gw().a(chq.b));
      }

      if ($$2 == bpb.n || $$2 == bpb.m || bpb.a($$2) || $$2 == bpb.o) {
         this.a(this.gw().a(chs.a($$0.t(this.dj()))));
      }

      if ($$2 == bpb.d) {
         this.cz = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   public chn b(apa $$0, boa $$1) {
      double $$2 = this.af.j();
      chs $$3;
      if ($$2 < 0.5) {
         $$3 = chs.a($$0.t(this.dj()));
      } else if ($$2 < 0.75) {
         $$3 = this.gw().a();
      } else {
         $$3 = ((chn)$$1).gw().a();
      }

      chn $$6 = new chn(bol.bh, $$0, $$3);
      $$6.a($$0, $$0.d_($$6.dj()), bpb.e, null);
      return $$6;
   }

   @Override
   public void a(apa $$0, bow $$1) {
      if ($$0.aj() != bmi.a) {
         cb.info("Villager {} was struck by lightning {}.", this, $$1);
         cfw $$2 = bol.bm.a((cwe)$$0);
         if ($$2 != null) {
            $$2.b(this.do(), this.dq(), this.du(), this.dz(), this.dB());
            $$2.a($$0, $$0.d_($$2.dj()), bpb.i, null);
            $$2.t(this.gb());
            if (this.ae()) {
               $$2.b(this.af());
               $$2.n(this.cy());
            }

            $$2.fQ();
            $$0.a_($$2);
            this.gO();
            this.am();
         } else {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void b(cel $$0) {
      chl.a(this, this, $$0);
   }

   @Override
   public boolean k(cpq $$0) {
      cpl $$1 = $$0.d();
      return (ce.contains($$1) || this.gw().b().d().contains($$1)) && this.A().b($$0);
   }

   public boolean gD() {
      return this.gT() >= 24;
   }

   public boolean gE() {
      return this.gT() < 12;
   }

   private int gT() {
      bmu $$0 = this.A();
      return bY.entrySet().stream().mapToInt($$1 -> $$0.a_($$1.getKey()) * $$1.getValue()).sum();
   }

   public boolean gF() {
      return this.A().a_($$0 -> $$0.a(aum.aZ));
   }

   @Override
   protected void gs() {
      cho $$0 = this.gw();
      Int2ObjectMap<chr.g[]> $$2;
      if (this.dJ().I().b(ckn.d)) {
         Int2ObjectMap<chr.g[]> $$1 = chr.c.get($$0.b());
         $$2 = $$1 != null ? $$1 : chr.a.get($$0.b());
      } else {
         $$2 = chr.a.get($$0.b());
      }

      if ($$2 != null && !$$2.isEmpty()) {
         chr.g[] $$4 = (chr.g[])$$2.get($$0.c());
         if ($$4 != null) {
            cvd $$5 = this.gn();
            this.a($$5, $$4, 2);
         }
      }
   }

   public void a(apa $$0, chn $$1, long $$2) {
      if (($$2 < this.cs || $$2 >= this.cs + 1200L) && ($$2 < $$1.cs || $$2 >= $$1.cs + 1200L)) {
         this.cr.a($$1.cr, this.af, 10);
         this.cs = $$2;
         $$1.cs = $$2;
         this.a($$0, $$2, 5);
      }
   }

   private void gU() {
      long $$0 = this.dJ().X();
      if (this.ct == 0L) {
         this.ct = $$0;
      } else if ($$0 >= this.ct + 24000L) {
         this.cr.b();
         this.ct = $$0;
      }
   }

   public void a(apa $$0, long $$1, int $$2) {
      if (this.a($$1)) {
         eoq $$3 = this.cE().c(10.0, 10.0, 10.0);
         List<chn> $$4 = $$0.a(chn.class, $$3);
         List<chn> $$5 = $$4.stream().filter($$1x -> $$1x.a($$1)).limit(5L).collect(Collectors.toList());
         if ($$5.size() >= $$2) {
            if (!axe.a(bol.ae, bpb.f, $$0, this.dj(), 10, 8, 6, axe.a.a).isEmpty()) {
               $$4.forEach(bys::b);
            }
         }
      }
   }

   public boolean a(long $$0) {
      return !this.b(this.dJ().X()) ? false : !this.bA.a(bya.F);
   }

   @Override
   public void a(bzx $$0, bof $$1) {
      if ($$0 == bzx.a) {
         this.cr.a($$1.ct(), bxx.d, 20);
         this.cr.a($$1.ct(), bxx.c, 25);
      } else if ($$0 == bzx.e) {
         this.cr.a($$1.ct(), bxx.e, 2);
      } else if ($$0 == bzx.c) {
         this.cr.a($$1.ct(), bxx.b, 25);
      } else if ($$0 == bzx.d) {
         this.cr.a($$1.ct(), bxx.a, 25);
      }
   }

   @Override
   public int w() {
      return this.cu;
   }

   public void v(int $$0) {
      this.cu = $$0;
   }

   private void gV() {
      this.gM();
      this.cx = 0;
   }

   public bxw gG() {
      return this.cr;
   }

   public void a(tv $$0) {
      this.cr.a(new Dynamic(tm.a, $$0));
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   @Override
   public void b(ib $$0) {
      super.b($$0);
      this.bA.a(bya.H, this.dJ().X());
      this.bA.b(bya.m);
      this.bA.b(bya.E);
   }

   @Override
   public void fG() {
      super.fG();
      this.bA.a(bya.I, this.dJ().X());
   }

   private boolean b(long $$0) {
      Optional<Long> $$1 = this.bA.c(bya.H);
      return $$1.isPresent() ? $$0 - $$1.get() < 24000L : false;
   }
}
