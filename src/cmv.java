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
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmv extends btl {
   private static final Logger b = LogUtils.getLogger();
   public static final btf bH = btf.b;
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
   public static final eww bV = new eww(0.0, 0.6, 0.0);
   public static final bst bW = bst.b(0.6F, 1.8F).b(1.62F).a(bss.a().a(bsr.b, bV));
   private static final Map<bty, bst> c = ImmutableMap.builder()
      .put(bty.a, bW)
      .put(bty.c, aF)
      .put(bty.b, bst.b(0.6F, 0.6F).b(0.4F))
      .put(bty.d, bst.b(0.6F, 0.6F).b(0.4F))
      .put(bty.e, bst.b(0.6F, 0.6F).b(0.4F))
      .put(bty.f, bst.b(0.6F, 1.5F).b(1.27F).a(bss.a().a(bsr.b, bV)))
      .put(bty.h, bst.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajv<Float> d = ajz.a(cmv.class, ajx.d);
   private static final ajv<Integer> e = ajz.a(cmv.class, ajx.b);
   protected static final ajv<Byte> bX = ajz.a(cmv.class, ajx.a);
   protected static final ajv<Byte> bY = ajz.a(cmv.class, ajx.a);
   protected static final ajv<ua> bZ = ajz.a(cmv.class, ajx.t);
   protected static final ajv<ua> ca = ajz.a(cmv.class, ajx.t);
   private long f;
   final cmu g = new cmu(this);
   protected crf cb = new crf();
   public final cqu cc;
   public cps cd;
   protected cpo ce = new cpo();
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
   private int h;
   protected boolean cp;
   private final cms cB = new cms();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int cC;
   private final GameProfile cD;
   private boolean cE;
   private cuo cF = cuo.l;
   private final cuk cG = this.k();
   private Optional<jl> cH = Optional.empty();
   @Nullable
   public cnj cv;
   protected float cw;
   @Nullable
   public eww cx;
   @Nullable
   public bsq cy;
   public boolean cz;

   public cmv(dcu $$0, jd $$1, float $$2, GameProfile $$3) {
      super(bsw.by, $$0);
      this.a_($$3.getId());
      this.cD = $$3;
      this.cc = new cqu(this.g, !$$0.B, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dcu $$0, jd $$1, dcr $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dcr.d) {
         return true;
      } else if (this.gl()) {
         return false;
      } else {
         cuo $$3 = this.eU();
         return $$3.e() || !$$3.b(new dte($$0, $$1, false));
      }
   }

   public static but.a fN() {
      return btl.dW().a(buu.c, 1.0).a(buu.v, 0.1F).a(buu.e).a(buu.q).a(buu.g, 4.5).a(buu.j, 3.0).a(buu.f).a(buu.C).a(buu.z).a(buu.t).a(buu.D);
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, (byte)bH.a());
      $$0.a(bZ, new ua());
      $$0.a(ca, new ua());
   }

   @Override
   public void l() {
      this.ag = this.N_();
      if (this.N_()) {
         this.e(false);
      }

      if (this.ci > 0) {
         this.ci--;
      }

      if (this.fI()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dQ().B && this.dQ().R()) {
            this.a(false, true);
         }
      } else if (this.h > 0) {
         this.h++;
         if (this.h >= 110) {
            this.h = 0;
         }
      }

      this.fR();
      super.l();
      if (!this.dQ().B && this.cd != null && !this.cd.b(this)) {
         this.s();
         this.cd = this.cc;
      }

      this.x();
      if (!this.dQ().B) {
         this.ce.a(this);
         this.a(avy.k);
         this.a(avy.l);
         if (this.bE()) {
            this.a(avy.m);
         }

         if (this.bZ()) {
            this.a(avy.o);
         }

         if (!this.fI()) {
            this.a(avy.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayn.a(this.dv(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayn.a(this.dB(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dv() || $$2 != this.dB()) {
         this.a_($$1, this.dx(), $$2);
      }

      this.aT++;
      cuo $$3 = this.eU();
      if (!cuo.a(this.cF, $$3)) {
         if (!cuo.b(this.cF, $$3)) {
            this.gt();
         }

         this.cF = $$3.s();
      }

      this.v();
      this.cG.a();
      this.fS();
   }

   @Override
   protected float fl() {
      return this.fz() ? 15.0F : super.fl();
   }

   public boolean fO() {
      return this.bW();
   }

   protected boolean fP() {
      return this.bW();
   }

   protected boolean fQ() {
      return this.bW();
   }

   protected boolean fR() {
      this.cp = this.a(awj.a);
      return this.cp;
   }

   private void v() {
      cuo $$0 = this.a(bsx.f);
      if ($$0.a(cur.oo) && !this.a(awj.a)) {
         this.b(new bry(bsa.m, 200, 0, false, false, true));
      }
   }

   protected cuk k() {
      return new cuk();
   }

   private void x() {
      this.cj = this.cm;
      this.ck = this.cn;
      this.cl = this.co;
      double $$0 = this.dv() - this.cm;
      double $$1 = this.dx() - this.cn;
      double $$2 = this.dB() - this.co;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cm = this.dv();
         this.cj = this.cm;
      }

      if ($$2 > 10.0) {
         this.co = this.dB();
         this.cl = this.co;
      }

      if ($$1 > 10.0) {
         this.cn = this.dx();
         this.ck = this.cn;
      }

      if ($$0 < -10.0) {
         this.cm = this.dv();
         this.cj = this.cm;
      }

      if ($$2 < -10.0) {
         this.co = this.dB();
         this.cl = this.co;
      }

      if ($$1 < -10.0) {
         this.cn = this.dx();
         this.ck = this.cn;
      }

      this.cm += $$0 * 0.25;
      this.co += $$2 * 0.25;
      this.cn += $$1 * 0.25;
   }

   protected void fS() {
      if (this.h(bty.d)) {
         bty $$0;
         if (this.fB()) {
            $$0 = bty.b;
         } else if (this.fI()) {
            $$0 = bty.c;
         } else if (this.cd()) {
            $$0 = bty.d;
         } else if (this.fo()) {
            $$0 = bty.e;
         } else if (this.bW() && !this.cB.b) {
            $$0 = bty.f;
         } else {
            $$0 = bty.a;
         }

         bty $$6;
         if (this.N_() || this.bS() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bty.f)) {
            $$6 = bty.f;
         } else {
            $$6 = bty.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bty $$0) {
      return this.dQ().a(this, this.a($$0).a(this.do()).h(1.0E-7));
   }

   @Override
   protected avn aQ() {
      return avo.uu;
   }

   @Override
   protected avn aR() {
      return avo.us;
   }

   @Override
   protected avn aS() {
      return avo.ut;
   }

   @Override
   public int bQ() {
      return 10;
   }

   @Override
   public void a(avn $$0, float $$1, float $$2) {
      this.dQ().a(this, this.dv(), this.dx(), this.dB(), $$0, this.df(), $$1, $$2);
   }

   public void a(avn $$0, avp $$1, float $$2, float $$3) {
   }

   @Override
   public avp df() {
      return avp.h;
   }

   @Override
   protected int dg() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.y();
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
      if (!this.dQ().B && this.fP() && this.bS()) {
         this.ad();
         this.h(false);
      } else {
         super.u();
         this.cg = this.ch;
         this.ch = 0.0F;
      }
   }

   @Override
   protected void fn() {
      super.fn();
      this.eS();
      this.ba = this.dG();
   }

   @Override
   public void m_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.dQ().al() == bqn.a && this.dQ().ab().b(dcq.k)) {
         if (this.ex() < this.eO() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.ce.e() < 20.0F && this.ai % 20 == 0) {
            this.ce.b(this.ce.e() + 1.0F);
         }

         if (this.ce.c() && this.ai % 10 == 0) {
            this.ce.a(this.ce.a() + 1);
         }
      }

      this.g.j();
      this.cg = this.ch;
      super.m_();
      this.z((float)this.g(buu.v));
      float $$1;
      if (this.aF() && !this.ey() && !this.cd()) {
         $$1 = Math.min(0.1F, (float)this.dt().h());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.ex() > 0.0F && !this.N_()) {
         ewr $$2;
         if (this.bS() && !this.dd().dL()) {
            $$2 = this.cL().b(this.dd().cL()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cL().c(1.0, 0.5, 1.0);
         }

         List<bsq> $$4 = this.dQ().a_(this, $$2);
         List<bsq> $$5 = Lists.newArrayList();

         for (bsq $$6 : $$4) {
            if ($$6.am() == bsw.M) {
               $$5.add($$6);
            } else if (!$$6.dL()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ad.a($$5, this.ah));
         }
      }

      this.c(this.gq());
      this.c(this.gr());
      if (!this.dQ().B && (this.ac > 0.5F || this.bf()) || this.cB.b || this.fI() || this.az) {
         this.gn();
      }
   }

   private void c(@Nullable ua $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dQ().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bsw.a($$1).filter($$0x -> $$0x == bsw.ax).ifPresent($$0x -> {
            if (!cfs.a(this.dQ(), this)) {
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), cfs.a(this.dQ(), this.dQ().z), this.df(), 1.0F, cfs.a(this.dQ().z));
            }
         });
      }
   }

   private void d(bsq $$0) {
      $$0.b_(this);
   }

   public int fT() {
      return this.ao.a(e);
   }

   public void r(int $$0) {
      this.ao.a(e, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fT();
      this.ao.a(e, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cuo $$2) {
      this.bC = $$0;
      this.bD = $$1;
      this.bE = $$2;
      if (!this.dQ().B) {
         this.gn();
         this.c(4, true);
      }
   }

   private cuo A() {
      return this.fo() && this.bE != null ? this.bE : this.eU();
   }

   @Override
   public void a(brj $$0) {
      super.a($$0);
      this.av();
      if (!this.N_() && this.dQ() instanceof aqt $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.n(
            (double)(-ayn.b((this.eF() + this.dG()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayn.a((this.eF() + this.dG()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.n(0.0, 0.1, 0.0);
      }

      this.a(avy.N);
      this.a(avy.i.b(avy.m));
      this.a(avy.i.b(avy.n));
      this.aD();
      this.d(false);
      this.a(Optional.of(jl.a(this.dQ().af(), this.dq())));
   }

   @Override
   protected void eA() {
      super.eA();
      if (!this.dQ().ab().b(dcq.d)) {
         this.fU();
         this.g.k();
      }
   }

   protected void fU() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cuo $$1 = this.g.a($$0);
         if (!$$1.e() && dac.a($$1, dab.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avn d(brj $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avn n_() {
      return avo.uk;
   }

   @Nullable
   public cjf a(cuo $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cjf a(cuo $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dQ().B) {
            this.a(bqp.a);
         }

         double $$3 = this.dz() - 0.3F;
         cjf $$4 = new cjf(this.dQ(), this.dv(), $$3, this.dB(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.n((double)(-ayn.a($$6) * $$5), 0.2F, (double)(ayn.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayn.a(this.dI() * (float) (Math.PI / 180.0));
            float $$9 = ayn.b(this.dI() * (float) (Math.PI / 180.0));
            float $$10 = ayn.a(this.dG() * (float) (Math.PI / 180.0));
            float $$11 = ayn.b(this.dG() * (float) (Math.PI / 180.0));
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

   public float c(dta $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.g(buu.t);
      }

      if (brz.a(this)) {
         $$1 *= 1.0F + (float)(brz.b(this) + 1) * 0.2F;
      }

      if (this.b(bsa.d)) {
         $$1 *= switch (this.c(bsa.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(buu.f);
      if (this.a(awj.a)) {
         $$1 *= (float)this.f(buu.C).f();
      }

      if (!this.aF()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dta $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a_(this.cD.getId());
      ug $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.k = $$0.h("SelectedItemSlot");
      this.h = $$0.g("SleepTimer");
      this.cs = $$0.j("XpP");
      this.cq = $$0.h("XpLevel");
      this.cr = $$0.h("XpTotal");
      this.ct = $$0.h("XpSeed");
      if (this.ct == 0) {
         this.ct = this.ah.f();
      }

      this.r($$0.h("Score"));
      this.ce.a($$0);
      this.cB.b($$0);
      this.f(buu.v).a((double)this.cB.b());
      if ($$0.b("EnderItems", 9)) {
         this.cb.a($$0.c("EnderItems", 10), this.dS());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(jl.b.parse(uo.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         eww.a.parse(uo.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cx = $$0x);
      }

      this.cz = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      up.e($$0);
      $$0.a("Inventory", this.g.a(new ug()));
      $$0.a("SelectedItemSlot", this.g.k);
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.cs);
      $$0.a("XpLevel", this.cq);
      $$0.a("XpTotal", this.cr);
      $$0.a("XpSeed", this.ct);
      $$0.a("Score", this.fT());
      this.ce.b($$0);
      this.cB.a($$0);
      $$0.a("EnderItems", this.cb.a(this.dS()));
      if (!this.gq().g()) {
         $$0.a("ShoulderEntityLeft", this.gq());
      }

      if (!this.gr().g()) {
         $$0.a("ShoulderEntityRight", this.gr());
      }

      this.gy().flatMap($$0x -> jl.b.encodeStart(uo.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (ux)eww.a.encodeStart(uo.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cz);
   }

   @Override
   public boolean b(brj $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awf.n)) {
         return !this.dQ().ab().b(dcq.G);
      } else if ($$0.a(awf.m)) {
         return !this.dQ().ab().b(dcq.H);
      } else if ($$0.a(awf.i)) {
         return !this.dQ().ab().b(dcq.I);
      } else {
         return $$0.a(awf.o) ? !this.dQ().ab().b(dcq.J) : false;
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cB.a && !$$0.a(awf.d)) {
         return false;
      } else {
         this.bf = 0;
         if (this.ey()) {
            return false;
         } else {
            if (!this.dQ().B) {
               this.gn();
            }

            if ($$0.f()) {
               if (this.dQ().al() == bqn.a) {
                  $$1 = 0.0F;
               }

               if (this.dQ().al() == bqn.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dQ().al() == bqn.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(btl $$0) {
      super.d($$0);
      if ($$0.fL()) {
         this.fV();
      }
   }

   @Override
   public boolean eq() {
      return !this.ga().a && super.eq();
   }

   public boolean a(cmv $$0) {
      eyc $$1 = this.ck();
      eyc $$2 = $$0.ck();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(brj $$0, float $$1) {
      this.a($$0, $$1, new bsx[]{bsx.c, bsx.d, bsx.e, bsx.f});
   }

   @Override
   protected void c(brj $$0, float $$1) {
      this.a($$0, $$1, new bsx[]{bsx.f});
   }

   @Override
   protected void w(float $$0) {
      if (this.bz.a(cur.vs)) {
         if (!this.dQ().B) {
            this.b(avy.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayn.d($$0);
            bqp $$2 = this.ft();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqp.a) {
                  this.a(bsx.a, cuo.l);
               } else {
                  this.a(bsx.b, cuo.l);
               }

               this.bz = cuo.l;
               this.a(avo.wE, 0.8F, 0.8F + this.dQ().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(brj $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fp(), 0.0F);
         this.B(this.fp() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avy.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.D($$0.a());
            this.eM().a($$0, var7);
            this.u(this.ex() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avy.J, Math.round(var7 * 10.0F));
            }

            this.a(dxw.o);
         }
      }
   }

   public boolean Z() {
      return false;
   }

   public void a(drq $$0, boolean $$1) {
   }

   public void a(dbv $$0) {
   }

   public void a(dqp $$0) {
   }

   public void a(drv $$0) {
   }

   public void a(drg $$0) {
   }

   public void a(chg $$0, bqj $$1) {
   }

   public OptionalInt a(@Nullable bqu $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dbt $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cuo $$0, bqp $$1) {
   }

   public bqq a(bsq $$0, bqp $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqu) {
            this.a((bqu)$$0);
         }

         return bqq.e;
      } else {
         cuo $$2 = this.b($$1);
         cuo $$3 = $$2.s();
         bqq $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cB.d && $$2 == this.b($$1) && $$2.H() < $$3.H()) {
               $$2.e($$3.H());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof btl) {
               if (this.cB.d) {
                  $$2 = $$3;
               }

               bqq $$5 = $$2.a(this, (btl)$$0, $$1);
               if ($$5.a()) {
                  this.dQ().a(dxw.r, $$0.do(), dxw.a.a(this));
                  if ($$2.e() && !this.cB.d) {
                     this.a($$1, cuo.l);
                  }

                  return $$5;
               }
            }

            return bqq.e;
         }
      }
   }

   @Override
   public void bJ() {
      super.bJ();
      this.K = 0;
   }

   @Override
   protected boolean fd() {
      return super.fd() || this.fI();
   }

   @Override
   public boolean ed() {
      return !this.cB.b;
   }

   @Override
   protected eww a(eww $$0, btq $$1) {
      float $$2 = this.dK();
      if (!this.cB.b && !($$0.d > 0.0) && ($$1 == btq.a || $$1 == btq.b) && this.fQ() && this.F($$2)) {
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

         return new eww($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean F(float $$0) {
      return this.aF() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      ewr $$3 = this.cL();
      return this.dQ().a(this, new ewr($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bsq $$0) {
      if ($$0.cu()) {
         if (!$$0.u(this)) {
            float $$1 = this.fo() ? this.bD : (float)this.g(buu.c);
            cuo $$2 = this.A();
            brj $$3 = this.dR().a(this);
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.E(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gt();
            if ($$0.am().a(awh.H) && $$0 instanceof cnn $$6 && $$6.a(cno.c, this, this, true)) {
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.ud, this.df());
               return;
            }

            if ($$1 > 0.0F || $$4 > 0.0F) {
               boolean $$7 = $$5 > 0.9F;
               boolean $$8;
               if (this.cc() && $$7) {
                  this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.uc, this.df(), 1.0F, 1.0F);
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
                  && !this.b(bsa.o)
                  && !this.bS()
                  && $$0 instanceof btl
                  && !this.cc();
               if ($$10) {
                  $$1 *= 1.5F;
               }

               float $$12 = $$1 + $$4;
               boolean $$13 = false;
               double $$14 = (double)(this.Z - this.Y);
               if ($$7 && !$$10 && !$$8 && this.aF() && $$14 < (double)this.fk()) {
                  cuo $$15 = this.b(bqp.a);
                  if ($$15.g() instanceof cwe) {
                     $$13 = true;
                  }
               }

               float $$16 = 0.0F;
               if ($$0 instanceof btl $$17) {
                  $$16 = $$17.ex();
               }

               eww $$18 = $$0.dt();
               boolean $$19 = $$0.a($$3, $$12);
               if ($$19) {
                  float $$20 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                  if ($$20 > 0.0F) {
                     if ($$0 instanceof btl $$21) {
                        $$21.p(
                           (double)($$20 * 0.5F), (double)ayn.a(this.dG() * (float) (Math.PI / 180.0)), (double)(-ayn.b(this.dG() * (float) (Math.PI / 180.0)))
                        );
                     } else {
                        $$0.j(
                           (double)(-ayn.a(this.dG() * (float) (Math.PI / 180.0)) * $$20 * 0.5F),
                           0.1,
                           (double)(ayn.b(this.dG() * (float) (Math.PI / 180.0)) * $$20 * 0.5F)
                        );
                     }

                     this.i(this.dt().d(0.6, 1.0, 0.6));
                     this.i(false);
                  }

                  if ($$13) {
                     float $$22 = 1.0F + (float)this.g(buu.D) * $$1;

                     for (btl $$24 : this.dQ().a(btl.class, $$0.cL().c(1.0, 0.25, 1.0))) {
                        if ($$24 != this && $$24 != $$0 && !this.s($$24) && (!($$24 instanceof ciu) || !((ciu)$$24).z()) && this.g((bsq)$$24) < 9.0) {
                           float $$25 = this.a($$24, $$22, $$3) * $$5;
                           $$24.p(0.4F, (double)ayn.a(this.dG() * (float) (Math.PI / 180.0)), (double)(-ayn.b(this.dG() * (float) (Math.PI / 180.0))));
                           $$24.a($$3, $$25);
                           if (this.dQ() instanceof aqt $$26) {
                              dac.a($$26, (bsq)$$24, $$3);
                           }
                        }
                     }

                     this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.uf, this.df(), 1.0F, 1.0F);
                     this.fW();
                  }

                  if ($$0 instanceof aqu && $$0.U) {
                     ((aqu)$$0).c.b(new afa($$0));
                     $$0.U = false;
                     $$0.i($$18);
                  }

                  if ($$10) {
                     this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.ub, this.df(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$10 && !$$13) {
                     if ($$7) {
                        this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.ue, this.df(), 1.0F, 1.0F);
                     } else {
                        this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.ug, this.df(), 1.0F, 1.0F);
                     }
                  }

                  if ($$4 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  bsq $$27 = $$0;
                  if ($$0 instanceof chw) {
                     $$27 = ((chw)$$0).b;
                  }

                  boolean $$28 = false;
                  if (this.dQ() instanceof aqt $$29) {
                     if ($$27 instanceof btl $$30) {
                        $$28 = $$2.a($$30, this);
                     }

                     dac.a($$29, $$0, $$3);
                  }

                  if (!this.dQ().B && !$$2.e() && $$27 instanceof btl) {
                     if ($$28) {
                        $$2.b((btl)$$27, this);
                     }

                     if ($$2.e()) {
                        if ($$2 == this.eU()) {
                           this.a(bqp.a, cuo.l);
                        } else {
                           this.a(bqp.b, cuo.l);
                        }
                     }
                  }

                  if ($$0 instanceof btl) {
                     float $$31 = $$16 - ((btl)$$0).ex();
                     this.a(avy.G, Math.round($$31 * 10.0F));
                     if (this.dQ() instanceof aqt && $$31 > 2.0F) {
                        int $$32 = (int)((double)$$31 * 0.5);
                        ((aqt)this.dQ()).a(lm.g, $$0.dv(), $$0.e(0.5), $$0.dB(), $$32, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.D(0.1F);
               } else {
                  this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.ud, this.df(), 1.0F, 1.0F);
               }
            }
         }
      }
   }

   protected float a(bsq $$0, float $$1, brj $$2) {
      return $$1;
   }

   @Override
   protected void g(btl $$0) {
      this.e($$0);
   }

   public void fV() {
      this.gu().a(cur.vs, 100);
      this.fy();
      this.dQ().a(this, (byte)30);
   }

   @Override
   public void b(bsq $$0) {
   }

   public void c(bsq $$0) {
   }

   public void fW() {
      double $$0 = (double)(-ayn.a(this.dG() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayn.b(this.dG() * (float) (Math.PI / 180.0));
      if (this.dQ() instanceof aqt) {
         ((aqt)this.dQ()).a(lm.aj, this.dv() + $$0, this.e(0.5), this.dB() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fX() {
   }

   @Override
   public void a(bsq.c $$0) {
      super.a($$0);
      this.cc.a(this);
      if (this.cd != null && this.gb()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fY() {
      return this.cD;
   }

   public cmu fZ() {
      return this.g;
   }

   public cms ga() {
      return this.cB;
   }

   @Override
   public boolean fM() {
      return this.cB.d;
   }

   public void a(cuo $$0, cuo $$1, cqb $$2) {
   }

   public boolean gb() {
      return this.cd != this.cc;
   }

   public Either<cmv.a, azr> a(jd $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(azr.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fJ();
      if (this.dQ() instanceof aqt && $$1) {
         ((aqt)this.dQ()).e();
      }

      this.h = $$0 ? 0 : 100;
   }

   @Override
   public void fJ() {
      this.a(true, true);
   }

   public boolean gc() {
      return this.fI() && this.h >= 100;
   }

   public int gd() {
      return this.h;
   }

   public void a(wy $$0, boolean $$1) {
   }

   public void a(akq $$0) {
      this.b(avy.i.b($$0));
   }

   public void a(akq $$0, int $$1) {
      this.a(avy.i.b($$0), $$1);
   }

   public void b(avv<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avv<?> $$0, int $$1) {
   }

   public void a(avv<?> $$0) {
   }

   public int a(Collection<cyz<?>> $$0) {
      return 0;
   }

   public void a(cyz<?> $$0, List<cuo> $$1) {
   }

   public void b(List<akq> $$0) {
   }

   public int b(Collection<cyz<?>> $$0) {
      return 0;
   }

   @Override
   public void fg() {
      super.fg();
      this.a(avy.E);
      if (this.cc()) {
         this.D(0.2F);
      } else {
         this.D(0.05F);
      }
   }

   @Override
   public void a(eww $$0) {
      if (this.cd() && !this.bS()) {
         double $$1 = this.bM().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dQ().a_(jd.a(this.dv(), this.dx() + 1.0 - 0.1, this.dB())).u().c()) {
            eww $$3 = this.dt();
            this.i($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cB.b && !this.bS()) {
         double $$4 = this.dt().d;
         super.a($$0);
         eww $$5 = this.dt();
         this.n($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bl() {
      if (this.cB.b) {
         this.j(false);
      } else {
         super.bl();
      }
   }

   protected boolean g(jd $$0) {
      return !this.dQ().a_($$0).o(this.dQ(), $$0);
   }

   @Override
   public float fk() {
      return (float)this.g(buu.v);
   }

   @Override
   public boolean a(float $$0, float $$1, brj $$2) {
      if (this.cB.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avy.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cz && this.cx != null) {
            double $$3 = this.cx.d;
            this.gB();
            return $$3 < this.dx() ? false : super.a((float)($$3 - this.dx()), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean ge() {
      if (!this.aF() && !this.fB() && !this.bf() && !this.b(bsa.y)) {
         cuo $$0 = this.a(bsx.e);
         if ($$0.a(cur.nT) && ctk.i($$0)) {
            this.gf();
            return true;
         }
      }

      return false;
   }

   public void gf() {
      this.b(7, true);
   }

   public void gg() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bo() {
      if (!this.N_()) {
         super.bo();
      }
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      if (this.bf()) {
         this.aU();
         this.b($$1);
      } else {
         jd $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dta $$3 = this.dQ().a_($$2);
            if ($$3.a(awd.bo)) {
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
   public btl.a eI() {
      return new btl.a(avo.ur, avo.uh);
   }

   @Override
   public boolean a(aqt $$0, btl $$1) {
      this.b(avy.g.b($$1.am()));
      return true;
   }

   @Override
   public void a(dta $$0, eww $$1) {
      if (!this.cB.b) {
         super.a($$0, $$1);
      }

      this.gB();
   }

   public void d(int $$0) {
      this.s($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gi();
      this.cr = ayn.a(this.cr + $$0, 0, Integer.MAX_VALUE);

      while (this.cs < 0.0F) {
         float $$1 = this.cs * (float)this.gi();
         if (this.cq > 0) {
            this.c(-1);
            this.cs = 1.0F + $$1 / (float)this.gi();
         } else {
            this.c(-1);
            this.cs = 0.0F;
         }
      }

      while (this.cs >= 1.0F) {
         this.cs = (this.cs - 1.0F) * (float)this.gi();
         this.c(1);
         this.cs = this.cs / (float)this.gi();
      }
   }

   public int gh() {
      return this.ct;
   }

   @Override
   public void a(cuo $$0, int $$1) {
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

      if ($$0 > 0 && this.cq % 5 == 0 && (float)this.cC < (float)this.ai - 100.0F) {
         float $$1 = this.cq > 30 ? 1.0F : (float)this.cq / 30.0F;
         this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.uq, this.df(), $$1 * 0.75F, 1.0F);
         this.cC = this.ai;
      }
   }

   public int gi() {
      if (this.cq >= 30) {
         return 112 + (this.cq - 30) * 9;
      } else {
         return this.cq >= 15 ? 37 + (this.cq - 15) * 5 : 7 + this.cq * 2;
      }
   }

   public void D(float $$0) {
      if (!this.cB.a) {
         if (!this.dQ().B) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<cmb> ab() {
      return Optional.empty();
   }

   public cpo gj() {
      return this.ce;
   }

   public boolean u(boolean $$0) {
      return this.cB.a || $$0 || this.ce.c();
   }

   public boolean gk() {
      return this.ex() > 0.0F && this.ex() < this.eO();
   }

   public boolean gl() {
      return this.cB.e;
   }

   public boolean a(jd $$0, ji $$1, cuo $$2) {
      if (this.cB.e) {
         return true;
      } else {
         jd $$3 = $$0.a($$1.g());
         dte $$4 = new dte(this.dQ(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int eh() {
      if (!this.dQ().ab().b(dcq.d) && !this.N_()) {
         int $$0 = this.cq * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ei() {
      return true;
   }

   @Override
   public boolean cG() {
      return true;
   }

   @Override
   protected bsq.b bc() {
      return this.cB.b || this.aF() && this.bZ() ? bsq.b.a : bsq.b.d;
   }

   @Override
   public void z() {
   }

   @Override
   public wy ah() {
      return wy.b(this.cD.getName());
   }

   public crf gm() {
      return this.cb;
   }

   @Override
   public cuo a(bsx $$0) {
      if ($$0 == bsx.a) {
         return this.g.f();
      } else if ($$0 == bsx.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bsx.a.b ? this.g.i.get($$0.b()) : cuo.l;
      }
   }

   @Override
   protected boolean b(bsx $$0) {
      return $$0.a() == bsx.a.b;
   }

   @Override
   public void a(bsx $$0, cuo $$1) {
      this.e($$1);
      if ($$0 == bsx.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bsx.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsx.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cuo $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cuo> eX() {
      return Lists.newArrayList(new cuo[]{this.eU(), this.eV()});
   }

   @Override
   public Iterable<cuo> eW() {
      return this.g.i;
   }

   @Override
   public boolean d(bsx $$0) {
      return $$0 != bsx.g;
   }

   public boolean h(ua $$0) {
      if (this.bS() || !this.aF() || this.bf() || this.az) {
         return false;
      } else if (this.gq().g()) {
         this.i($$0);
         this.f = this.dQ().Z();
         return true;
      } else if (this.gr().g()) {
         this.j($$0);
         this.f = this.dQ().Z();
         return true;
      } else {
         return false;
      }
   }

   protected void gn() {
      if (this.f + 20L < this.dQ().Z()) {
         this.k(this.gq());
         this.i(new ua());
         this.k(this.gr());
         this.j(new ua());
      }
   }

   private void k(ua $$0) {
      if (!this.dQ().B && !$$0.g()) {
         bsw.a($$0, this.dQ()).ifPresent($$0x -> {
            if ($$0x instanceof buj) {
               ((buj)$$0x).b(this.ax);
            }

            $$0x.a_(this.dv(), this.dx() + 0.7F, this.dB());
            ((aqt)this.dQ()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean N_();

   @Override
   public boolean bz() {
      return !this.N_() && super.bz();
   }

   @Override
   public boolean cd() {
      return !this.cB.b && !this.N_() && super.cd();
   }

   public abstract boolean f();

   @Override
   public boolean cD() {
      return !this.cB.b;
   }

   public eya go() {
      return this.dQ().M();
   }

   @Override
   public wy O_() {
      xm $$0 = exv.a(this.ck(), this.ah());
      return this.a($$0);
   }

   private xm a(xm $$0) {
      String $$1 = this.fY().getName();
      return $$0.a($$1x -> $$1x.a(new ww(ww.a.d, "/tell " + $$1 + " ")).a(this.cK()).a($$1));
   }

   @Override
   public String cC() {
      return this.fY().getName();
   }

   @Override
   protected void C(float $$0) {
      this.ar().a(d, $$0);
   }

   @Override
   public float fp() {
      return this.ar().a(d);
   }

   public boolean a(cmw $$0) {
      return (this.ar().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public bue a_(int $$0) {
      if ($$0 == 499) {
         return new bue() {
            @Override
            public cuo a() {
               return cmv.this.cd.g();
            }

            @Override
            public boolean a(cuo $$0) {
               cmv.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new bue() {
               @Override
               public cuo a() {
                  return cmv.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cuo $$0) {
                  cmv.this.cc.r().a($$1, $$0);
                  cmv.this.cc.a(cmv.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return bue.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? bue.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gp() {
      return this.cE;
   }

   public void v(boolean $$0) {
      this.cE = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cB.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public btf fr() {
      return this.ao.a(bY) == 0 ? btf.a : btf.b;
   }

   public void a(btf $$0) {
      this.ao.a(bY, (byte)($$0 == btf.a ? 0 : 1));
   }

   public ua gq() {
      return this.ao.a(bZ);
   }

   protected void i(ua $$0) {
      this.ao.a(bZ, $$0);
   }

   public ua gr() {
      return this.ao.a(ca);
   }

   protected void j(ua $$0) {
      this.ao.a(ca, $$0);
   }

   public float gs() {
      return (float)(1.0 / this.g(buu.e) * 20.0);
   }

   public float E(float $$0) {
      return ayn.a(((float)this.aT + $$0) / this.gs(), 0.0F, 1.0F);
   }

   public void gt() {
      this.aT = 0;
   }

   public cuk gu() {
      return this.cG;
   }

   @Override
   protected float aO() {
      return !this.cB.b && !this.fB() ? super.aO() : 1.0F;
   }

   public float gv() {
      return (float)this.g(buu.q);
   }

   public boolean gw() {
      return this.cB.d && this.G() >= 2;
   }

   @Override
   public boolean f(cuo $$0) {
      bsx $$1 = this.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bst e(bty $$0) {
      return c.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<bty> fF() {
      return ImmutableList.of(bty.a, bty.f, bty.d);
   }

   @Override
   public cuo g(cuo $$0) {
      if (!($$0.g() instanceof cvl)) {
         return cuo.l;
      } else {
         Predicate<cuo> $$1 = ((cvl)$$0.g()).d();
         cuo $$2 = cvl.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cvl)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cuo $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cB.d ? new cuo(cur.ow) : cuo.l;
         }
      }
   }

   @Override
   public cuo a(dcu $$0, cuo $$1, cpp $$2) {
      this.gj().a($$2);
      this.b(avy.c.b($$1.g()));
      $$0.a(null, this.dv(), this.dx(), this.dB(), avo.uj, avp.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aqu) {
         an.A.a((aqu)this, $$1);
      }

      cuo $$3 = super.a($$0, $$1, $$2);
      Optional<cuo> $$4 = $$2.f();
      if ($$4.isPresent() && !this.fM()) {
         if ($$3.e()) {
            return $$4.get().s();
         }

         this.fZ().f($$4.get().s());
      }

      return $$3;
   }

   @Override
   public eww r(float $$0) {
      double $$1 = 0.22 * (this.fr() == btf.b ? -1.0 : 1.0);
      float $$2 = ayn.i($$0 * 0.5F, this.dI(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayn.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fB() || this.fo()) {
         eww $$4 = this.g($$0);
         eww $$5 = this.dt();
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

         return this.m($$0).e(new eww($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ce()) {
         return this.m($$0).e(new eww($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cL().c() - 1.0;
         double $$13 = this.cb() ? -0.2 : 0.07;
         return this.m($$0).e(new eww($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dP() {
      return true;
   }

   public boolean gx() {
      return this.fs() && this.fu().a(cur.qX);
   }

   @Override
   public boolean dO() {
      return false;
   }

   public Optional<jl> gy() {
      return this.cH;
   }

   public void a(Optional<jl> $$0) {
      this.cH = $$0;
   }

   @Override
   public float eF() {
      return this.cw;
   }

   @Override
   public void n(float $$0) {
      super.n($$0);
      this.cw = $$0;
   }

   @Override
   public boolean dJ() {
      return true;
   }

   @Override
   protected float fj() {
      if (this.cB.b && !this.bS()) {
         return this.cc() ? this.cB.a() * 2.0F : this.cB.a();
      } else {
         return this.cc() ? 0.025999999F : 0.02F;
      }
   }

   public double gz() {
      return this.g(buu.g);
   }

   public double gA() {
      return this.g(buu.j);
   }

   public boolean b(bsq $$0, double $$1) {
      return $$0.dL() ? false : this.a($$0.cL(), $$1);
   }

   public boolean a(ewr $$0, double $$1) {
      double $$2 = this.gA() + $$1;
      return $$0.e(this.by()) < $$2 * $$2;
   }

   public boolean a(jd $$0, double $$1) {
      double $$2 = this.gz() + $$1;
      return new ewr($$0).e(this.by()) < $$2 * $$2;
   }

   public void gB() {
      this.cy = null;
      this.cx = null;
      this.cz = false;
   }

   public static enum a {
      a,
      b(wy.c("block.minecraft.bed.no_sleep")),
      c(wy.c("block.minecraft.bed.too_far_away")),
      d(wy.c("block.minecraft.bed.obstructed")),
      e,
      f(wy.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wy g;

      private a() {
         this.g = null;
      }

      private a(final wy $$0) {
         this.g = $$0;
      }

      @Nullable
      public wy a() {
         return this.g;
      }
   }
}
