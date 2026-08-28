import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmx extends btn {
   private static final Logger b = LogUtils.getLogger();
   public static final btg bH = btg.b;
   public static final int bI = 0;
   public static final int bJ = 20;
   public static final int bK = 100;
   public static final int bL = 10;
   public static final int bM = 200;
   public static final int bN = 499;
   public static final int bO = 500;
   public static final float bP = 4.5F;
   public static final float bQ = 3.0F;
   public static final float bR = 1.5F;
   public static final float bS = 0.6F;
   public static final float bT = 0.6F;
   public static final float bU = 1.62F;
   private static final int c = 40;
   public static final exc bV = new exc(0.0, 0.6, 0.0);
   public static final bsu bW = bsu.b(0.6F, 1.8F).b(1.62F).a(bst.a().a(bss.b, bV));
   private static final Map<bua, bsu> d = ImmutableMap.builder()
      .put(bua.a, bW)
      .put(bua.c, aF)
      .put(bua.b, bsu.b(0.6F, 0.6F).b(0.4F))
      .put(bua.d, bsu.b(0.6F, 0.6F).b(0.4F))
      .put(bua.e, bsu.b(0.6F, 0.6F).b(0.4F))
      .put(bua.f, bsu.b(0.6F, 1.5F).b(1.27F).a(bst.a().a(bss.b, bV)))
      .put(bua.h, bsu.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajw<Float> e = aka.a(cmx.class, ajy.d);
   private static final ajw<Integer> f = aka.a(cmx.class, ajy.b);
   protected static final ajw<Byte> bX = aka.a(cmx.class, ajy.a);
   protected static final ajw<Byte> bY = aka.a(cmx.class, ajy.a);
   protected static final ajw<ub> bZ = aka.a(cmx.class, ajy.t);
   protected static final ajw<ub> ca = aka.a(cmx.class, ajy.t);
   private long g;
   final cmw h = new cmw(this);
   protected crh cb = new crh();
   public final cqw cc;
   public cpu cd;
   protected cpq ce = new cpq();
   protected int cf;
   public float cg;
   public float ch;
   public int ci;
   public double cj;
   public double ck;
   public double cl;
   public double cm;
   public double cn;
   public double co;
   private int cz;
   protected boolean cp;
   private final cmu cA = new cmu();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int cB;
   private final GameProfile cD;
   private boolean cE;
   private cuq cF = cuq.l;
   private final cum cG = this.k();
   private Optional<jl> cH = Optional.empty();
   @Nullable
   public cnl cv;
   protected float cw;
   @Nullable
   public exc cx;
   @Nullable
   public bsr cy;
   private boolean cI;
   private int cJ;

   public cmx(dcw $$0, jd $$1, float $$2, GameProfile $$3) {
      super(bsx.by, $$0);
      this.a_($$3.getId());
      this.cD = $$3;
      this.cc = new cqw(this.h, !$$0.B, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dcw $$0, jd $$1, dct $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dct.d) {
         return true;
      } else if (this.gk()) {
         return false;
      } else {
         cuq $$3 = this.eT();
         return $$3.e() || !$$3.b(new dtg($$0, $$1, false));
      }
   }

   public static buv.a fM() {
      return btn.dV().a(buw.c, 1.0).a(buw.v, 0.1F).a(buw.e).a(buw.q).a(buw.g, 4.5).a(buw.j, 3.0).a(buw.f).a(buw.C).a(buw.z).a(buw.t).a(buw.D);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(e, 0.0F);
      $$0.a(f, 0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, (byte)bH.a());
      $$0.a(bZ, new ub());
      $$0.a(ca, new ub());
   }

   @Override
   public void l() {
      this.ag = this.R_();
      if (this.R_()) {
         this.d(false);
      }

      if (this.ci > 0) {
         this.ci--;
      }

      if (this.fH()) {
         this.cz++;
         if (this.cz > 100) {
            this.cz = 100;
         }

         if (!this.dO().B && this.dO().R()) {
            this.a(false, true);
         }
      } else if (this.cz > 0) {
         this.cz++;
         if (this.cz >= 110) {
            this.cz = 0;
         }
      }

      this.fQ();
      super.l();
      if (!this.dO().B && this.cd != null && !this.cd.b(this)) {
         this.s();
         this.cd = this.cc;
      }

      this.x();
      if (!this.dO().B) {
         this.ce.a(this);
         this.a(avz.k);
         this.a(avz.l);
         if (this.bE()) {
            this.a(avz.m);
         }

         if (this.bZ()) {
            this.a(avz.o);
         }

         if (!this.fH()) {
            this.a(avz.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayo.a(this.dt(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayo.a(this.dz(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dt() || $$2 != this.dz()) {
         this.a_($$1, this.dv(), $$2);
      }

      this.aT++;
      cuq $$3 = this.eT();
      if (!cuq.a(this.cF, $$3)) {
         if (!cuq.b(this.cF, $$3)) {
            this.gs();
         }

         this.cF = $$3.s();
      }

      this.v();
      this.cG.a();
      this.fR();
      if (this.cJ > 0) {
         this.cJ--;
      }
   }

   @Override
   protected float fk() {
      return this.fy() ? 15.0F : super.fk();
   }

   public boolean fN() {
      return this.bW();
   }

   protected boolean fO() {
      return this.bW();
   }

   protected boolean fP() {
      return this.bW();
   }

   protected boolean fQ() {
      this.cp = this.a(awk.a);
      return this.cp;
   }

   private void v() {
      cuq $$0 = this.a(bsy.f);
      if ($$0.a(cut.oo) && !this.a(awk.a)) {
         this.b(new brz(bsb.m, 200, 0, false, false, true));
      }
   }

   protected cum k() {
      return new cum();
   }

   private void x() {
      this.cj = this.cm;
      this.ck = this.cn;
      this.cl = this.co;
      double $$0 = this.dt() - this.cm;
      double $$1 = this.dv() - this.cn;
      double $$2 = this.dz() - this.co;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cm = this.dt();
         this.cj = this.cm;
      }

      if ($$2 > 10.0) {
         this.co = this.dz();
         this.cl = this.co;
      }

      if ($$1 > 10.0) {
         this.cn = this.dv();
         this.ck = this.cn;
      }

      if ($$0 < -10.0) {
         this.cm = this.dt();
         this.cj = this.cm;
      }

      if ($$2 < -10.0) {
         this.co = this.dz();
         this.cl = this.co;
      }

      if ($$1 < -10.0) {
         this.cn = this.dv();
         this.ck = this.cn;
      }

      this.cm += $$0 * 0.25;
      this.co += $$2 * 0.25;
      this.cn += $$1 * 0.25;
   }

   protected void fR() {
      if (this.h(bua.d)) {
         bua $$0;
         if (this.fA()) {
            $$0 = bua.b;
         } else if (this.fH()) {
            $$0 = bua.c;
         } else if (this.cd()) {
            $$0 = bua.d;
         } else if (this.fn()) {
            $$0 = bua.e;
         } else if (this.bW() && !this.cA.b) {
            $$0 = bua.f;
         } else {
            $$0 = bua.a;
         }

         bua $$6;
         if (this.R_() || this.bS() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bua.f)) {
            $$6 = bua.f;
         } else {
            $$6 = bua.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bua $$0) {
      return this.dO().a(this, this.a($$0).a(this.dm()).h(1.0E-7));
   }

   @Override
   protected avo aQ() {
      return avp.uu;
   }

   @Override
   protected avo aR() {
      return avp.us;
   }

   @Override
   protected avo aS() {
      return avp.ut;
   }

   @Override
   public int bQ() {
      return 10;
   }

   @Override
   public void a(avo $$0, float $$1, float $$2) {
      this.dO().a(this, this.dt(), this.dv(), this.dz(), $$0, this.de(), $$1, $$2);
   }

   public void a(avo $$0, avq $$1, float $$2, float $$3) {
   }

   @Override
   public avq de() {
      return avq.h;
   }

   @Override
   protected int df() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.L_();
      } else if ($$0 == 23) {
         this.cE = false;
      } else if ($$0 == 22) {
         this.cE = true;
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void s() {
      this.cd = this.cc;
   }

   protected void t() {
   }

   @Override
   public void u() {
      if (!this.dO().B && this.fO() && this.bS()) {
         this.ad();
         this.g(false);
      } else {
         super.u();
         this.cg = this.ch;
         this.ch = 0.0F;
      }
   }

   @Override
   protected void fm() {
      super.fm();
      this.eR();
      this.ba = this.dE();
   }

   @Override
   public void m_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.dO().al() == bqo.a && this.dO().ab().b(dcs.k)) {
         if (this.ew() < this.eN() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.ce.e() < 20.0F && this.ai % 20 == 0) {
            this.ce.b(this.ce.e() + 1.0F);
         }

         if (this.ce.c() && this.ai % 10 == 0) {
            this.ce.a(this.ce.a() + 1);
         }
      }

      this.h.j();
      this.cg = this.ch;
      super.m_();
      this.A((float)this.g(buw.v));
      float $$1;
      if (this.aF() && !this.ex() && !this.cd()) {
         $$1 = Math.min(0.1F, (float)this.dr().h());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.ew() > 0.0F && !this.R_()) {
         ewx $$2;
         if (this.bS() && !this.dc().dJ()) {
            $$2 = this.cK().b(this.dc().cK()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cK().c(1.0, 0.5, 1.0);
         }

         List<bsr> $$4 = this.dO().a_(this, $$2);
         List<bsr> $$5 = Lists.newArrayList();

         for (bsr $$6 : $$4) {
            if ($$6.am() == bsx.M) {
               $$5.add($$6);
            } else if (!$$6.dJ()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ad.a($$5, this.ah));
         }
      }

      this.c(this.gp());
      this.c(this.gq());
      if (!this.dO().B && (this.ac > 0.5F || this.bf()) || this.cA.b || this.fH() || this.az) {
         this.gm();
      }
   }

   private void c(@Nullable ub $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dO().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bsx.a($$1).filter($$0x -> $$0x == bsx.ax).ifPresent($$0x -> {
            if (!cfu.a(this.dO(), this)) {
               this.dO().a(null, this.dt(), this.dv(), this.dz(), cfu.a(this.dO(), this.dO().z), this.de(), 1.0F, cfu.a(this.dO().z));
            }
         });
      }
   }

   private void d(bsr $$0) {
      $$0.b_(this);
   }

   public int fS() {
      return this.ao.a(f);
   }

   public void r(int $$0) {
      this.ao.a(f, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fS();
      this.ao.a(f, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cuq $$2) {
      this.bC = $$0;
      this.bD = $$1;
      this.bE = $$2;
      if (!this.dO().B) {
         this.gm();
         this.c(4, true);
      }
   }

   @Nonnull
   @Override
   public cuq dS() {
      return this.fn() && this.bE != null ? this.bE : super.dS();
   }

   @Override
   public void a(brk $$0) {
      super.a($$0);
      this.av();
      if (!this.R_() && this.dO() instanceof aqu $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-ayo.b((this.eE() + this.dE()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayo.a((this.eE() + this.dE()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(avz.N);
      this.a(avz.i.b(avz.m));
      this.a(avz.i.b(avz.n));
      this.aD();
      this.c(false);
      this.a(Optional.of(jl.a(this.dO().af(), this.do())));
   }

   @Override
   protected void ez() {
      super.ez();
      if (!this.dO().ab().b(dcs.d)) {
         this.fT();
         this.h.k();
      }
   }

   protected void fT() {
      for (int $$0 = 0; $$0 < this.h.b(); $$0++) {
         cuq $$1 = this.h.a($$0);
         if (!$$1.e() && dae.a($$1, dad.D)) {
            this.h.b($$0);
         }
      }
   }

   @Override
   protected avo d(brk $$0) {
      return $$0.k().d().a();
   }

   @Override
   protected avo n_() {
      return avp.uk;
   }

   @Nullable
   public cjh a(cuq $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cjh a(cuq $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dO().B) {
            this.a(bqq.a);
         }

         double $$3 = this.dx() - 0.3F;
         cjh $$4 = new cjh(this.dO(), this.dt(), $$3, this.dz(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.n((double)(-ayo.a($$6) * $$5), 0.2F, (double)(ayo.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayo.a(this.dG() * (float) (Math.PI / 180.0));
            float $$9 = ayo.b(this.dG() * (float) (Math.PI / 180.0));
            float $$10 = ayo.a(this.dE() * (float) (Math.PI / 180.0));
            float $$11 = ayo.b(this.dE() * (float) (Math.PI / 180.0));
            float $$12 = this.ah.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ah.i();
            $$4.n(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ah.i() - this.ah.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float c(dtc $$0) {
      float $$1 = this.h.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.g(buw.t);
      }

      if (bsa.a(this)) {
         $$1 *= 1.0F + (float)(bsa.b(this) + 1) * 0.2F;
      }

      if (this.b(bsb.d)) {
         $$1 *= switch (this.c(bsb.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(buw.f);
      if (this.a(awk.a)) {
         $$1 *= (float)this.f(buw.C).f();
      }

      if (!this.aF()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dtc $$0) {
      return !$$0.y() || this.h.f().b($$0);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a_(this.cD.getId());
      uh $$1 = $$0.c("Inventory", 10);
      this.h.b($$1);
      this.h.k = $$0.h("SelectedItemSlot");
      this.cz = $$0.g("SleepTimer");
      this.cs = $$0.j("XpP");
      this.cq = $$0.h("XpLevel");
      this.cr = $$0.h("XpTotal");
      this.ct = $$0.h("XpSeed");
      if (this.ct == 0) {
         this.ct = this.ah.f();
      }

      this.r($$0.h("Score"));
      this.ce.a($$0);
      this.cA.b($$0);
      this.f(buw.v).a((double)this.cA.b());
      if ($$0.b("EnderItems", 9)) {
         this.cb.a($$0.c("EnderItems", 10), this.dQ());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(jl.b.parse(up.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         exc.a.parse(up.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cx = $$0x);
      }

      this.cI = $$0.q("ignore_fall_damage_from_current_explosion");
      this.cJ = $$0.h("current_impulse_context_reset_grace_time");
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      uq.e($$0);
      $$0.a("Inventory", this.h.a(new uh()));
      $$0.a("SelectedItemSlot", this.h.k);
      $$0.a("SleepTimer", (short)this.cz);
      $$0.a("XpP", this.cs);
      $$0.a("XpLevel", this.cq);
      $$0.a("XpTotal", this.cr);
      $$0.a("XpSeed", this.ct);
      $$0.a("Score", this.fS());
      this.ce.b($$0);
      this.cA.a($$0);
      $$0.a("EnderItems", this.cb.a(this.dQ()));
      if (!this.gp().g()) {
         $$0.a("ShoulderEntityLeft", this.gp());
      }

      if (!this.gq().g()) {
         $$0.a("ShoulderEntityRight", this.gq());
      }

      this.gx().flatMap($$0x -> jl.b.encodeStart(up.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (uy)exc.a.encodeStart(up.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cI);
      $$0.a("current_impulse_context_reset_grace_time", this.cJ);
   }

   @Override
   public boolean b(brk $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awg.n)) {
         return !this.dO().ab().b(dcs.G);
      } else if ($$0.a(awg.m)) {
         return !this.dO().ab().b(dcs.H);
      } else if ($$0.a(awg.i)) {
         return !this.dO().ab().b(dcs.I);
      } else {
         return $$0.a(awg.o) ? !this.dO().ab().b(dcs.J) : false;
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cA.a && !$$0.a(awg.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.ex()) {
            return false;
         } else {
            if (!this.dO().B) {
               this.gm();
            }

            if ($$0.g()) {
               if (this.dO().al() == bqo.a) {
                  $$1 = 0.0F;
               }

               if (this.dO().al() == bqo.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dO().al() == bqo.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(btn $$0) {
      super.d($$0);
      if ($$0.fK()) {
         this.fU();
      }
   }

   @Override
   public boolean ep() {
      return !this.fZ().a && super.ep();
   }

   public boolean a(cmx $$0) {
      eyi $$1 = this.ck();
      eyi $$2 = $$0.ck();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(brk $$0, float $$1) {
      this.a($$0, $$1, new bsy[]{bsy.c, bsy.d, bsy.e, bsy.f});
   }

   @Override
   protected void c(brk $$0, float $$1) {
      this.a($$0, $$1, new bsy[]{bsy.f});
   }

   @Override
   protected void x(float $$0) {
      if (this.bz.a(cut.vs)) {
         if (!this.dO().B) {
            this.b(avz.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayo.d($$0);
            bqq $$2 = this.fs();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqq.a) {
                  this.a(bsy.a, cuq.l);
               } else {
                  this.a(bsy.b, cuq.l);
               }

               this.bz = cuq.l;
               this.a(avp.wE, 0.8F, 0.8F + this.dO().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(brk $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fo(), 0.0F);
         this.C(this.fo() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avz.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.E($$0.a());
            this.eL().a($$0, var7);
            this.v(this.ew() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avz.J, Math.round(var7 * 10.0F));
            }

            this.a(dxz.o);
         }
      }
   }

   public boolean Z() {
      return false;
   }

   public void a(drs $$0, boolean $$1) {
   }

   public void a(dbx $$0) {
   }

   public void a(dqr $$0) {
   }

   public void a(drx $$0) {
   }

   public void a(dri $$0) {
   }

   public void a(chi $$0, bqk $$1) {
   }

   public OptionalInt a(@Nullable bqv $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dbv $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cuq $$0, bqq $$1) {
   }

   public bqr a(bsr $$0, bqq $$1) {
      if (this.R_()) {
         if ($$0 instanceof bqv) {
            this.a((bqv)$$0);
         }

         return bqr.e;
      } else {
         cuq $$2 = this.b($$1);
         cuq $$3 = $$2.s();
         bqr $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cA.d && $$2 == this.b($$1) && $$2.H() < $$3.H()) {
               $$2.e($$3.H());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof btn) {
               if (this.cA.d) {
                  $$2 = $$3;
               }

               bqr $$5 = $$2.a(this, (btn)$$0, $$1);
               if ($$5.a()) {
                  this.dO().a(dxz.r, $$0.dm(), dxz.a.a(this));
                  if ($$2.e() && !this.cA.d) {
                     this.a($$1, cuq.l);
                  }

                  return $$5;
               }
            }

            return bqr.e;
         }
      }
   }

   @Override
   public void bJ() {
      super.bJ();
      this.K = 0;
   }

   @Override
   protected boolean fc() {
      return super.fc() || this.fH();
   }

   @Override
   public boolean ec() {
      return !this.cA.b;
   }

   @Override
   protected exc a(exc $$0, bts $$1) {
      float $$2 = this.dI();
      if (!this.cA.b && !($$0.d > 0.0) && ($$1 == bts.a || $$1 == bts.b) && this.fP() && this.G($$2)) {
         double $$3 = $$0.c;
         double $$4 = $$0.e;
         double $$5 = 0.05;
         double $$6 = Math.signum($$3) * 0.05;

         double $$7;
         for ($$7 = Math.signum($$4) * 0.05; $$3 != 0.0 && this.b($$3, 0.0, $$2); $$3 -= $$6) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
               break;
            }
         }

         while ($$4 != 0.0 && this.b(0.0, $$4, $$2)) {
            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
               break;
            }

            $$4 -= $$7;
         }

         while ($$3 != 0.0 && $$4 != 0.0 && this.b($$3, $$4, $$2)) {
            if (Math.abs($$3) <= 0.05) {
               $$3 = 0.0;
            } else {
               $$3 -= $$6;
            }

            if (Math.abs($$4) <= 0.05) {
               $$4 = 0.0;
            } else {
               $$4 -= $$7;
            }
         }

         return new exc($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean G(float $$0) {
      return this.aF() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      ewx $$3 = this.cK();
      return this.dO().a(this, new ewx($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bsr $$0) {
      if ($$0.cu()) {
         if (!$$0.u(this)) {
            float $$1 = this.fn() ? this.bD : (float)this.g(buw.c);
            cuq $$2 = this.dS();
            brk $$3 = this.dP().a(this);
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.F(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gs();
            if ($$0.am().a(awi.H) && $$0 instanceof cnp $$6 && $$6.a(cnq.c, this, this, true)) {
               this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.ud, this.de());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cc() && $$7) {
                  this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.uc, this.de(), 1.0F, 1.0F);
                  $$8 = true;
               } else {
                  $$8 = false;
               }

               $$1 += $$2.g().a($$0, $$1, $$3);
               boolean $$10 = $$7
                  && this.ac > 0.0F
                  && !this.aF()
                  && !this.p_()
                  && !this.bf()
                  && !this.b(bsb.o)
                  && !this.bS()
                  && $$0 instanceof btn
                  && !this.cc();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$11 = $$1 + $$4;
               boolean $$12 = false;
               double $$13 = (double)(this.Z - this.Y);
               if ($$7 && !$$10 && !$$8 && this.aF() && $$13 < (double)this.fj()) {
                  cuq $$14 = this.b(bqq.a);
                  if ($$14.g() instanceof cwg) {
                     $$12 = true;
                  }
               }

               float $$15 = 0.0F;
               if ($$0 instanceof btn $$16) {
                  $$15 = $$16.ew();
               }

               exc $$17 = $$0.dr();
               boolean $$18 = $$0.a($$3, $$11);
               if ($$18) {
                  float $$19 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$19 > 0.0F) {
                     if ($$0 instanceof btn $$20) {
                        $$20.p(
                           (double)($$19 * 0.5F), (double)ayo.a(this.dE() * (float) (Math.PI / 180.0)), (double)(-ayo.b(this.dE() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-ayo.a(this.dE() * (float) (Math.PI / 180.0)) * $$19 * 0.5F),
                           0.1,
                           (double)(ayo.b(this.dE() * (float) (Math.PI / 180.0)) * $$19 * 0.5F)
                        );
                     }

                     this.i(this.dr().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$12) {
                     float $$21 = 1.0F + (float)this.g(buw.D) * $$1;

                     for (btn $$23 : this.dO().a(btn.class, $$0.cK().c(1.0, 0.25, 1.0))) {
                        if ($$23 != this && $$23 != $$0 && !this.s($$23) && (!($$23 instanceof ciw) || !((ciw)$$23).z()) && this.g((bsr)$$23) < 9.0) {
                           float $$24 = this.a($$23, $$21, $$3) * $$5;
                           $$23.p(0.4F, (double)ayo.a(this.dE() * (float) (Math.PI / 180.0)), (double)(-ayo.b(this.dE() * (float) (Math.PI / 180.0))));
                           $$23.a($$3, $$24);
                           if (this.dO() instanceof aqu $$25) {
                              dae.a($$25, (bsr)$$23, $$3);
                           }
                        }
                     }

                     this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.uf, this.de(), 1.0F, 1.0F);
                     this.fV();
                  }

                  if ($$0 instanceof aqv && $$0.U) {
                     ((aqv)$$0).c.b(new afb($$0));
                     $$0.U = false;
                     $$0.i($$17);
                  }

                  if ($$10) {
                     this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.ub, this.de(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$12) {
                     if ($$7) {
                        this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.ue, this.de(), 1.0F, 1.0F);
                     } else {
                        this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.ug, this.de(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  bsr $$26 = $$0;
                  if ($$0 instanceof chy) {
                     $$26 = ((chy)$$0).b;
                  }

                  boolean $$27 = false;
                  if (this.dO() instanceof aqu $$28) {
                     if ($$26 instanceof btn $$29) {
                        $$27 = $$2.a($$29, this);
                     }

                     dae.a($$28, $$0, $$3);
                  }

                  if (!this.dO().B && !$$2.e() && $$26 instanceof btn) {
                     if ($$27) {
                        $$2.b((btn)$$26, this);
                     }

                     if ($$2.e()) {
                        if ($$2 == this.eT()) {
                           this.a(bqq.a, cuq.l);
                        } else {
                           this.a(bqq.b, cuq.l);
                        }
                     }
                  }

                  if ($$0 instanceof btn) {
                     float $$30 = $$15 - ((btn)$$0).ew();
                     this.a(avz.G, Math.round($$30 * 10.0F));
                     if (this.dO() instanceof aqu && $$30 > 2.0F) {
                        int $$31 = (int)((double)$$30 * 0.5);
                        ((aqu)this.dO()).a(lm.g, $$0.dt(), $$0.e(0.5), $$0.dz(), $$31, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.E(0.1F);
               } else {
                  this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.ud, this.de(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bsr $$0, float $$1, brk $$2) {
      return $$1;
   }

   @Override
   protected void g(btn $$0) {
      this.e($$0);
   }

   public void fU() {
      this.gt().a(cut.vs, 100);
      this.fx();
      this.dO().a(this, (byte)30);
   }

   public void b(bsr $$0) {
   }

   public void c(bsr $$0) {
   }

   public void fV() {
      double $$0 = (double)(-ayo.a(this.dE() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayo.b(this.dE() * (float) (Math.PI / 180.0));
      if (this.dO() instanceof aqu) {
         ((aqu)this.dO()).a(lm.aj, this.dt() + $$0, this.e(0.5), this.dz() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fW() {
   }

   @Override
   public void a(bsr.c $$0) {
      super.a($$0);
      this.cc.a(this);
      if (this.cd != null && this.ga()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fX() {
      return this.cD;
   }

   public cmw fY() {
      return this.h;
   }

   public cmu fZ() {
      return this.cA;
   }

   @Override
   public boolean fL() {
      return this.cA.d;
   }

   public void a(cuq $$0, cuq $$1, cqd $$2) {
   }

   public boolean ga() {
      return this.cd != this.cc;
   }

   public Either<cmx.a, azs> a(jd $$0) {
      this.b($$0);
      this.cz = 0;
      return Either.right(azs.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fI();
      if (this.dO() instanceof aqu && $$1) {
         ((aqu)this.dO()).e();
      }

      this.cz = $$0 ? 0 : 100;
   }

   @Override
   public void fI() {
      this.a(true, true);
   }

   public boolean gb() {
      return this.fH() && this.cz >= 100;
   }

   public int gc() {
      return this.cz;
   }

   public void a(wz $$0, boolean $$1) {
   }

   public void a(akr $$0) {
      this.b(avz.i.b($$0));
   }

   public void a(akr $$0, int $$1) {
      this.a(avz.i.b($$0), $$1);
   }

   public void b(avw<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avw<?> $$0, int $$1) {
   }

   public void a(avw<?> $$0) {
   }

   public int a(Collection<czb<?>> $$0) {
      return 0;
   }

   public void a(czb<?> $$0, List<cuq> $$1) {
   }

   public void b(List<akr> $$0) {
   }

   public int b(Collection<czb<?>> $$0) {
      return 0;
   }

   @Override
   public void ff() {
      super.ff();
      this.a(avz.E);
      if (this.cc()) {
         this.E(0.2F);
      } else {
         this.E(0.05F);
      }
   }

   @Override
   public void a(exc $$0) {
      if (this.cd() && !this.bS()) {
         double $$1 = this.bM().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dO().a_(jd.a(this.dt(), this.dv() + 1.0 - 0.1, this.dz())).u().c()) {
            exc $$3 = this.dr();
            this.i($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cA.b && !this.bS()) {
         double $$4 = this.dr().d;
         super.a($$0);
         exc $$5 = this.dr();
         this.n($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bl() {
      if (this.cA.b) {
         this.i(false);
      } else {
         super.bl();
      }
   }

   protected boolean h(jd $$0) {
      return !this.dO().a_($$0).o(this.dO(), $$0);
   }

   @Override
   public float fj() {
      return (float)this.g(buw.v);
   }

   @Override
   public boolean a(float $$0, float $$1, brk $$2) {
      if (this.cA.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avz.t, (int)Math.round((double)$$0 * 100.0));
         }

         boolean $$4;
         if (this.cI && this.cx != null) {
            double $$3 = this.cx.d;
            this.gB();
            if ($$3 < this.dv()) {
               return false;
            }

            $$4 = super.a((float)($$3 - this.dv()), $$1, $$2);
         } else {
            $$4 = super.a($$0, $$1, $$2);
         }

         if ($$4) {
            this.gC();
         }

         return $$4;
      }
   }

   public boolean gd() {
      if (!this.aF() && !this.fA() && !this.bf() && !this.b(bsb.y)) {
         cuq $$0 = this.a(bsy.e);
         if ($$0.a(cut.nT) && ctm.i($$0)) {
            this.ge();
            return true;
         }
      }

      return false;
   }

   public void ge() {
      this.b(7, true);
   }

   public void gf() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bo() {
      if (!this.R_()) {
         super.bo();
      }
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      if (this.bf()) {
         this.aU();
         this.b($$1);
      } else {
         jd $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dtc $$3 = this.dO().a_($$2);
            if ($$3.a(awe.bp)) {
               this.a($$3, $$1);
            } else {
               super.b($$2, $$3);
            }
         } else {
            super.b($$0, $$1);
         }
      }
   }

   @Override
   public btn.a eH() {
      return new btn.a(avp.ur, avp.uh);
   }

   @Override
   public boolean a(aqu $$0, btn $$1) {
      this.b(avz.g.b($$1.am()));
      return true;
   }

   @Override
   public void a(dtc $$0, exc $$1) {
      if (!this.cA.b) {
         super.a($$0, $$1);
      }

      this.gB();
   }

   public void d(int $$0) {
      this.s($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gh();
      this.cr = ayo.a(this.cr + $$0, 0, Integer.MAX_VALUE);

      while (this.cs < 0.0F) {
         float $$1 = this.cs * (float)this.gh();
         if (this.cq > 0) {
            this.c(-1);
            this.cs = 1.0F + $$1 / (float)this.gh();
         } else {
            this.c(-1);
            this.cs = 0.0F;
         }
      }

      while (this.cs >= 1.0F) {
         this.cs = (this.cs - 1.0F) * (float)this.gh();
         this.c(1);
         this.cs = this.cs / (float)this.gh();
      }
   }

   public int gg() {
      return this.ct;
   }

   @Override
   public void a(cuq $$0, int $$1) {
      this.cq -= $$1;
      if (this.cq < 0) {
         this.cq = 0;
         this.cs = 0.0F;
         this.cr = 0;
      }

      this.ct = this.ah.f();
   }

   public void c(int $$0) {
      this.cq += $$0;
      if (this.cq < 0) {
         this.cq = 0;
         this.cs = 0.0F;
         this.cr = 0;
      }

      if ($$0 > 0 && this.cq % 5 == 0 && (float)this.cB < (float)this.ai - 100.0F) {
         float $$1 = this.cq > 30 ? 1.0F : (float)this.cq / 30.0F;
         this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.uq, this.de(), $$1 * 0.75F, 1.0F);
         this.cB = this.ai;
      }
   }

   public int gh() {
      if (this.cq >= 30) {
         return 112 + (this.cq - 30) * 9;
      } else {
         return this.cq >= 15 ? 37 + (this.cq - 15) * 5 : 7 + this.cq * 2;
      }
   }

   public void E(float $$0) {
      if (!this.cA.a) {
         if (!this.dO().B) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<cmd> ab() {
      return Optional.empty();
   }

   public cpq gi() {
      return this.ce;
   }

   public boolean u(boolean $$0) {
      return this.cA.a || $$0 || this.ce.c();
   }

   public boolean gj() {
      return this.ew() > 0.0F && this.ew() < this.eN();
   }

   public boolean gk() {
      return this.cA.e;
   }

   public boolean a(jd $$0, ji $$1, cuq $$2) {
      if (this.cA.e) {
         return true;
      } else {
         jd $$3 = $$0.a($$1.g());
         dtg $$4 = new dtg(this.dO(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int eg() {
      if (!this.dO().ab().b(dcs.d) && !this.R_()) {
         int $$0 = this.cq * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean eh() {
      return true;
   }

   @Override
   public boolean cF() {
      return true;
   }

   @Override
   protected bsr.b bc() {
      return this.cA.b || this.aF() && this.bZ() ? bsr.b.a : bsr.b.d;
   }

   public void z() {
   }

   @Override
   public wz ah() {
      return wz.b(this.cD.getName());
   }

   public crh gl() {
      return this.cb;
   }

   @Override
   public cuq a(bsy $$0) {
      if ($$0 == bsy.a) {
         return this.h.f();
      } else if ($$0 == bsy.b) {
         return this.h.j.get(0);
      } else {
         return $$0.a() == bsy.a.b ? this.h.i.get($$0.b()) : cuq.l;
      }
   }

   @Override
   protected boolean b(bsy $$0) {
      return $$0.a() == bsy.a.b;
   }

   @Override
   public void a(bsy $$0, cuq $$1) {
      this.e($$1);
      if ($$0 == bsy.a) {
         this.a($$0, this.h.h.set(this.h.k, $$1), $$1);
      } else if ($$0 == bsy.b) {
         this.a($$0, this.h.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsy.a.b) {
         this.a($$0, this.h.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cuq $$0) {
      return this.h.f($$0);
   }

   @Override
   public Iterable<cuq> eW() {
      return Lists.newArrayList(new cuq[]{this.eT(), this.eU()});
   }

   @Override
   public Iterable<cuq> eV() {
      return this.h.i;
   }

   @Override
   public boolean d(bsy $$0) {
      return $$0 != bsy.g;
   }

   public boolean h(ub $$0) {
      if (this.bS() || !this.aF() || this.bf() || this.az) {
         return false;
      } else if (this.gp().g()) {
         this.i($$0);
         this.g = this.dO().Z();
         return true;
      } else if (this.gq().g()) {
         this.j($$0);
         this.g = this.dO().Z();
         return true;
      } else {
         return false;
      }
   }

   protected void gm() {
      if (this.g + 20L < this.dO().Z()) {
         this.k(this.gp());
         this.i(new ub());
         this.k(this.gq());
         this.j(new ub());
      }
   }

   private void k(ub $$0) {
      if (!this.dO().B && !$$0.g()) {
         bsx.a($$0, this.dO()).ifPresent($$0x -> {
            if ($$0x instanceof bul) {
               ((bul)$$0x).b(this.ax);
            }

            $$0x.a_(this.dt(), this.dv() + 0.7F, this.dz());
            ((aqu)this.dO()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean R_();

   @Override
   public boolean bz() {
      return !this.R_() && super.bz();
   }

   @Override
   public boolean cd() {
      return !this.cA.b && !this.R_() && super.cd();
   }

   public abstract boolean f();

   @Override
   public boolean cC() {
      return !this.cA.b;
   }

   public eyg gn() {
      return this.dO().M();
   }

   @Override
   public wz S_() {
      xn $$0 = eyb.a(this.ck(), this.ah());
      return this.a($$0);
   }

   private xn a(xn $$0) {
      String $$1 = this.fX().getName();
      return $$0.a($$1x -> $$1x.a(new wx(wx.a.d, "/tell " + $$1 + " ")).a(this.cJ()).a($$1));
   }

   @Override
   public String cB() {
      return this.fX().getName();
   }

   @Override
   protected void D(float $$0) {
      this.ar().a(e, $$0);
   }

   @Override
   public float fo() {
      return this.ar().a(e);
   }

   public boolean a(cmy $$0) {
      return (this.ar().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public bug a_(int $$0) {
      if ($$0 == 499) {
         return new bug() {
            @Override
            public cuq a() {
               return cmx.this.cd.g();
            }

            @Override
            public boolean a(cuq $$0) {
               cmx.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bug() {
               @Override
               public cuq a() {
                  return cmx.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cuq $$0) {
                  cmx.this.cc.r().a($$1, $$0);
                  cmx.this.cc.a(cmx.this.h);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.h.h.size()) {
            return bug.a(this.h, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bug.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean go() {
      return this.cE;
   }

   public void v(boolean $$0) {
      this.cE = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cA.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public btg fq() {
      return this.ao.a(bY) == 0 ? btg.a : btg.b;
   }

   public void a(btg $$0) {
      this.ao.a(bY, (byte)($$0 == btg.a ? 0 : 1));
   }

   public ub gp() {
      return this.ao.a(bZ);
   }

   protected void i(ub $$0) {
      this.ao.a(bZ, $$0);
   }

   public ub gq() {
      return this.ao.a(ca);
   }

   protected void j(ub $$0) {
      this.ao.a(ca, $$0);
   }

   public float gr() {
      return (float)(1.0 / this.g(buw.e) * 20.0);
   }

   public float F(float $$0) {
      return ayo.a(((float)this.aT + $$0) / this.gr(), 0.0F, 1.0F);
   }

   public void gs() {
      this.aT = 0;
   }

   public cum gt() {
      return this.cG;
   }

   @Override
   protected float aO() {
      return !this.cA.b && !this.fA() ? super.aO() : 1.0F;
   }

   public float gu() {
      return (float)this.g(buw.q);
   }

   public boolean gv() {
      return this.cA.d && this.G() >= 2;
   }

   @Override
   public boolean f(cuq $$0) {
      bsy $$1 = this.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bsu e(bua $$0) {
      return d.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<bua> fE() {
      return ImmutableList.of(bua.a, bua.f, bua.d);
   }

   @Override
   public cuq g(cuq $$0) {
      if (!($$0.g() instanceof cvn)) {
         return cuq.l;
      } else {
         Predicate<cuq> $$1 = ((cvn)$$0.g()).d();
         cuq $$2 = cvn.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cvn)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.h.b(); $$3++) {
               cuq $$4 = this.h.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cA.d ? new cuq(cut.ow) : cuq.l;
         }
      }
   }

   @Override
   public cuq a(dcw $$0, cuq $$1, cpr $$2) {
      this.gi().a($$2);
      this.b(avz.c.b($$1.g()));
      $$0.a(null, this.dt(), this.dv(), this.dz(), avp.uj, avq.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aqv) {
         an.A.a((aqv)this, $$1);
      }

      cuq $$3 = super.a($$0, $$1, $$2);
      Optional<cuq> $$4 = $$2.f();
      if ($$4.isPresent() && !this.fL()) {
         if ($$3.e()) {
            return $$4.get().s();
         }

         if (!this.dO().x_()) {
            this.fY().f($$4.get().s());
         }
      }

      return $$3;
   }

   @Override
   public exc s(float $$0) {
      double $$1 = 0.22 * (this.fq() == btg.b ? -1.0 : 1.0);
      float $$2 = ayo.i($$0 * 0.5F, this.dG(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayo.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fA() || this.fn()) {
         exc $$4 = this.g($$0);
         exc $$5 = this.dr();
         double $$6 = $$5.i();
         double $$7 = $$4.i();
         float $$10;
         if ($$6 > 0.0 && $$7 > 0.0) {
            double $$8 = ($$5.c * $$4.c + $$5.e * $$4.e) / Math.sqrt($$6 * $$7);
            double $$9 = $$5.c * $$4.e - $$5.e * $$4.c;
            $$10 = (float)(Math.signum($$9) * Math.acos($$8));
         } else {
            $$10 = 0.0F;
         }

         return this.m($$0).e(new exc($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ce()) {
         return this.m($$0).e(new exc($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cK().c() - 1.0;
         double $$13 = this.cb() ? -0.2 : 0.07;
         return this.m($$0).e(new exc($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dN() {
      return true;
   }

   public boolean gw() {
      return this.fr() && this.ft().a(cut.qX);
   }

   @Override
   public boolean dM() {
      return false;
   }

   public Optional<jl> gx() {
      return this.cH;
   }

   public void a(Optional<jl> $$0) {
      this.cH = $$0;
   }

   @Override
   public float eE() {
      return this.cw;
   }

   @Override
   public void n(float $$0) {
      super.n($$0);
      this.cw = $$0;
   }

   @Override
   public boolean dH() {
      return true;
   }

   @Override
   protected float fi() {
      if (this.cA.b && !this.bS()) {
         return this.cc() ? this.cA.a() * 2.0F : this.cA.a();
      } else {
         return this.cc() ? 0.025999999F : 0.02F;
      }
   }

   public double gy() {
      return this.g(buw.g);
   }

   public double gz() {
      return this.g(buw.j);
   }

   public boolean b(bsr $$0, double $$1) {
      return $$0.dJ() ? false : this.a($$0.cK(), $$1);
   }

   public boolean a(ewx $$0, double $$1) {
      double $$2 = this.gz() + $$1;
      return $$0.e(this.by()) < $$2 * $$2;
   }

   public boolean a(jd $$0, double $$1) {
      double $$2 = this.gy() + $$1;
      return new ewx($$0).e(this.by()) < $$2 * $$2;
   }

   public void w(boolean $$0) {
      this.cI = $$0;
      if ($$0) {
         this.cJ = 40;
      } else {
         this.cJ = 0;
      }
   }

   public boolean gA() {
      return this.cI;
   }

   public void gB() {
      if (this.cJ == 0) {
         this.gC();
      }
   }

   public void gC() {
      this.cJ = 0;
      this.cy = null;
      this.cx = null;
      this.cI = false;
   }

   public static enum a {
      a,
      b(wz.c("block.minecraft.bed.no_sleep")),
      c(wz.c("block.minecraft.bed.too_far_away")),
      d(wz.c("block.minecraft.bed.obstructed")),
      e,
      f(wz.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wz g;

      private a() {
         this.g = null;
      }

      private a(final wz $$0) {
         this.g = $$0;
      }

      @Nullable
      public wz a() {
         return this.g;
      }
   }
}
