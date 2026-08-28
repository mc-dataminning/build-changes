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

public abstract class cml extends btc {
   private static final Logger b = LogUtils.getLogger();
   public static final bsw bI = bsw.b;
   public static final int bJ = 0;
   public static final int bK = 20;
   public static final int bL = 100;
   public static final int bM = 10;
   public static final int bN = 200;
   public static final int bO = 499;
   public static final int bP = 500;
   public static final float bQ = 4.5F;
   public static final float bR = 3.0F;
   public static final float bS = 1.5F;
   public static final float bT = 0.6F;
   public static final float bU = 0.6F;
   public static final float bV = 1.62F;
   public static final ewh bW = new ewh(0.0, 0.6, 0.0);
   public static final bsk bX = bsk.b(0.6F, 1.8F).b(1.62F).a(bsj.a().a(bsi.b, bW));
   private static final Map<bto, bsk> c = ImmutableMap.builder()
      .put(bto.a, bX)
      .put(bto.c, aH)
      .put(bto.b, bsk.b(0.6F, 0.6F).b(0.4F))
      .put(bto.d, bsk.b(0.6F, 0.6F).b(0.4F))
      .put(bto.e, bsk.b(0.6F, 0.6F).b(0.4F))
      .put(bto.f, bsk.b(0.6F, 1.5F).b(1.27F).a(bsj.a().a(bsi.b, bW)))
      .put(bto.h, bsk.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajp<Float> d = ajt.a(cml.class, ajr.d);
   private static final ajp<Integer> e = ajt.a(cml.class, ajr.b);
   protected static final ajp<Byte> bY = ajt.a(cml.class, ajr.a);
   protected static final ajp<Byte> bZ = ajt.a(cml.class, ajr.a);
   protected static final ajp<tx> ca = ajt.a(cml.class, ajr.t);
   protected static final ajp<tx> cb = ajt.a(cml.class, ajr.t);
   private long f;
   final cmk g = new cmk(this);
   protected cqv cc = new cqv();
   public final cqk cd;
   public cpi ce;
   protected cpe cf = new cpe();
   protected int cg;
   public float ch;
   public float ci;
   public int cj;
   public double ck;
   public double cl;
   public double cm;
   public double cn;
   public double co;
   public double cp;
   private int h;
   protected boolean cq;
   private final cmi cC = new cmi();
   public int cr;
   public int cs;
   public float ct;
   protected int cu;
   protected final float cv = 0.02F;
   private int cD;
   private final GameProfile cE;
   private boolean cF;
   private cud cG = cud.l;
   private final ctz cH = this.k();
   private Optional<ji> cI = Optional.empty();
   @Nullable
   public cmz cw;
   protected float cx;
   @Nullable
   public ewh cy;
   @Nullable
   public bsh cz;
   public boolean cA;

   public cml(dcg $$0, ja $$1, float $$2, GameProfile $$3) {
      super(bsn.by, $$0);
      this.a_($$3.getId());
      this.cE = $$3;
      this.cd = new cqk(this.g, !$$0.B, this);
      this.ce = this.cd;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bl = 180.0F;
   }

   public boolean a(dcg $$0, ja $$1, dcd $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dcd.d) {
         return true;
      } else if (this.gm()) {
         return false;
      } else {
         cud $$3 = this.eV();
         return $$3.e() || !$$3.b(new dsp($$0, $$1, false));
      }
   }

   public static buj.a fO() {
      return btc.dX().a(buk.c, 1.0).a(buk.v, 0.1F).a(buk.e).a(buk.q).a(buk.g, 4.5).a(buk.j, 3.0).a(buk.f).a(buk.C).a(buk.z).a(buk.t).a(buk.D);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bY, (byte)0);
      $$0.a(bZ, (byte)bI.a());
      $$0.a(ca, new tx());
      $$0.a(cb, new tx());
   }

   @Override
   public void l() {
      this.ag = this.N_();
      if (this.N_()) {
         this.e(false);
      }

      if (this.cj > 0) {
         this.cj--;
      }

      if (this.fJ()) {
         this.h++;
         if (this.h > 100) {
            this.h = 100;
         }

         if (!this.dR().B && this.dR().R()) {
            this.a(false, true);
         }
      } else if (this.h > 0) {
         this.h++;
         if (this.h >= 110) {
            this.h = 0;
         }
      }

      this.fS();
      super.l();
      if (!this.dR().B && this.ce != null && !this.ce.b(this)) {
         this.s();
         this.ce = this.cd;
      }

      this.x();
      if (!this.dR().B) {
         this.cf.a(this);
         this.a(avr.k);
         this.a(avr.l);
         if (this.bF()) {
            this.a(avr.m);
         }

         if (this.ca()) {
            this.a(avr.o);
         }

         if (!this.fJ()) {
            this.a(avr.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayg.a(this.dw(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayg.a(this.dC(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dw() || $$2 != this.dC()) {
         this.a_($$1, this.dy(), $$2);
      }

      this.aU++;
      cud $$3 = this.eV();
      if (!cud.a(this.cG, $$3)) {
         if (!cud.b(this.cG, $$3)) {
            this.gu();
         }

         this.cG = $$3.s();
      }

      this.v();
      this.cH.a();
      this.fT();
   }

   @Override
   protected float fm() {
      return this.fA() ? 15.0F : super.fm();
   }

   public boolean fP() {
      return this.bX();
   }

   protected boolean fQ() {
      return this.bX();
   }

   protected boolean fR() {
      return this.bX();
   }

   protected boolean fS() {
      this.cq = this.a(awc.a);
      return this.cq;
   }

   private void v() {
      cud $$0 = this.a(bso.f);
      if ($$0.a(cug.oo) && !this.a(awc.a)) {
         this.b(new brp(brr.m, 200, 0, false, false, true));
      }
   }

   protected ctz k() {
      return new ctz();
   }

   private void x() {
      this.ck = this.cn;
      this.cl = this.co;
      this.cm = this.cp;
      double $$0 = this.dw() - this.cn;
      double $$1 = this.dy() - this.co;
      double $$2 = this.dC() - this.cp;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cn = this.dw();
         this.ck = this.cn;
      }

      if ($$2 > 10.0) {
         this.cp = this.dC();
         this.cm = this.cp;
      }

      if ($$1 > 10.0) {
         this.co = this.dy();
         this.cl = this.co;
      }

      if ($$0 < -10.0) {
         this.cn = this.dw();
         this.ck = this.cn;
      }

      if ($$2 < -10.0) {
         this.cp = this.dC();
         this.cm = this.cp;
      }

      if ($$1 < -10.0) {
         this.co = this.dy();
         this.cl = this.co;
      }

      this.cn += $$0 * 0.25;
      this.cp += $$2 * 0.25;
      this.co += $$1 * 0.25;
   }

   protected void fT() {
      if (this.h(bto.d)) {
         bto $$0;
         if (this.fC()) {
            $$0 = bto.b;
         } else if (this.fJ()) {
            $$0 = bto.c;
         } else if (this.ce()) {
            $$0 = bto.d;
         } else if (this.fp()) {
            $$0 = bto.e;
         } else if (this.bX() && !this.cC.b) {
            $$0 = bto.f;
         } else {
            $$0 = bto.a;
         }

         bto $$6;
         if (this.N_() || this.bT() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bto.f)) {
            $$6 = bto.f;
         } else {
            $$6 = bto.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bto $$0) {
      return this.dR().a(this, this.a($$0).a(this.dp()).h(1.0E-7));
   }

   @Override
   public int aB() {
      return Math.max(1, this.dR().ab().c(this.cC.a ? dcc.F : dcc.E));
   }

   @Override
   protected avg aR() {
      return avh.uu;
   }

   @Override
   protected avg aS() {
      return avh.us;
   }

   @Override
   protected avg aT() {
      return avh.ut;
   }

   @Override
   public int bR() {
      return 10;
   }

   @Override
   public void a(avg $$0, float $$1, float $$2) {
      this.dR().a(this, this.dw(), this.dy(), this.dC(), $$0, this.dg(), $$1, $$2);
   }

   public void a(avg $$0, avi $$1, float $$2, float $$3) {
   }

   @Override
   public avi dg() {
      return avi.h;
   }

   @Override
   protected int dh() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.y();
      } else if ($$0 == 23) {
         this.cF = false;
      } else if ($$0 == 22) {
         this.cF = true;
      } else {
         super.b($$0);
      }
   }

   @Override
   protected void s() {
      this.ce = this.cd;
   }

   protected void t() {
   }

   @Override
   public void u() {
      if (!this.dR().B && this.fQ() && this.bT()) {
         this.ad();
         this.h(false);
      } else {
         super.u();
         this.ch = this.ci;
         this.ci = 0.0F;
      }
   }

   @Override
   protected void fo() {
      super.fo();
      this.eT();
      this.bb = this.dH();
   }

   @Override
   public void m_() {
      if (this.cg > 0) {
         this.cg--;
      }

      if (this.dR().al() == bqe.a && this.dR().ab().b(dcc.k)) {
         if (this.ey() < this.eP() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cf.c() && this.ai % 10 == 0) {
            this.cf.a(this.cf.a() + 1);
         }
      }

      this.g.j();
      this.ch = this.ci;
      super.m_();
      this.z((float)this.g(buk.v));
      float $$1;
      if (this.aG() && !this.ez() && !this.ce()) {
         $$1 = Math.min(0.1F, (float)this.du().h());
      } else {
         $$1 = 0.0F;
      }

      this.ci = this.ci + ($$1 - this.ci) * 0.4F;
      if (this.ey() > 0.0F && !this.N_()) {
         ewc $$2;
         if (this.bT() && !this.de().dM()) {
            $$2 = this.cM().b(this.de().cM()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cM().c(1.0, 0.5, 1.0);
         }

         List<bsh> $$4 = this.dR().a_(this, $$2);
         List<bsh> $$5 = Lists.newArrayList();

         for (bsh $$6 : $$4) {
            if ($$6.am() == bsn.M) {
               $$5.add($$6);
            } else if (!$$6.dM()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ac.a($$5, this.ah));
         }
      }

      this.c(this.gr());
      this.c(this.gs());
      if (!this.dR().B && (this.ac > 0.5F || this.bg()) || this.cC.b || this.fJ() || this.aB) {
         this.go();
      }
   }

   private void c(@Nullable tx $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dR().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bsn.a($$1).filter($$0x -> $$0x == bsn.ax).ifPresent($$0x -> {
            if (!cfi.a(this.dR(), this)) {
               this.dR().a(null, this.dw(), this.dy(), this.dC(), cfi.a(this.dR(), this.dR().z), this.dg(), 1.0F, cfi.a(this.dR().z));
            }
         });
      }
   }

   private void d(bsh $$0) {
      $$0.b_(this);
   }

   public int fU() {
      return this.ao.a(e);
   }

   public void r(int $$0) {
      this.ao.a(e, $$0);
   }

   public void s(int $$0) {
      int $$1 = this.fU();
      this.ao.a(e, $$1 + $$0);
   }

   public void a(int $$0, float $$1, cud $$2) {
      this.bD = $$0;
      this.bE = $$1;
      this.bF = $$2;
      if (!this.dR().B) {
         this.go();
         this.c(4, true);
      }
   }

   private cud A() {
      return this.fp() && this.bF != null ? this.bF : this.eV();
   }

   @Override
   public void a(bra $$0) {
      super.a($$0);
      this.av();
      if (!this.N_() && this.dR() instanceof aqm $$1) {
         this.a($$1, $$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ayg.b((this.eG() + this.dH()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayg.a((this.eG() + this.dH()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(avr.N);
      this.a(avr.i.b(avr.m));
      this.a(avr.i.b(avr.n));
      this.aE();
      this.d(false);
      this.a(Optional.of(ji.a(this.dR().af(), this.dr())));
   }

   @Override
   protected void eB() {
      super.eB();
      if (!this.dR().ab().b(dcc.d)) {
         this.fV();
         this.g.k();
      }
   }

   protected void fV() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cud $$1 = this.g.a($$0);
         if (!$$1.e() && czo.a($$1, czn.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avg d(bra $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avg n_() {
      return avh.uk;
   }

   @Nullable
   public civ a(cud $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public civ a(cud $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dR().B) {
            this.a(bqg.a);
         }

         double $$3 = this.dA() - 0.3F;
         civ $$4 = new civ(this.dR(), this.dw(), $$3, this.dC(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ah.i() * 0.5F;
            float $$6 = this.ah.i() * (float) (Math.PI * 2);
            $$4.o((double)(-ayg.a($$6) * $$5), 0.2F, (double)(ayg.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = ayg.a(this.dJ() * (float) (Math.PI / 180.0));
            float $$9 = ayg.b(this.dJ() * (float) (Math.PI / 180.0));
            float $$10 = ayg.a(this.dH() * (float) (Math.PI / 180.0));
            float $$11 = ayg.b(this.dH() * (float) (Math.PI / 180.0));
            float $$12 = this.ah.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ah.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ah.i() - this.ah.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float c(dsl $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.g(buk.t);
      }

      if (brq.a(this)) {
         $$1 *= 1.0F + (float)(brq.b(this) + 1) * 0.2F;
      }

      if (this.b(brr.d)) {
         $$1 *= switch (this.c(brr.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(buk.f);
      if (this.a(awc.a)) {
         $$1 *= (float)this.f(buk.C).f();
      }

      if (!this.aG()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dsl $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a_(this.cE.getId());
      ud $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.k = $$0.h("SelectedItemSlot");
      this.h = $$0.g("SleepTimer");
      this.ct = $$0.j("XpP");
      this.cr = $$0.h("XpLevel");
      this.cs = $$0.h("XpTotal");
      this.cu = $$0.h("XpSeed");
      if (this.cu == 0) {
         this.cu = this.ah.f();
      }

      this.r($$0.h("Score"));
      this.cf.a($$0);
      this.cC.b($$0);
      this.f(buk.v).a((double)this.cC.b());
      if ($$0.b("EnderItems", 9)) {
         this.cc.a($$0.c("EnderItems", 10), this.dT());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(ji.b.parse(ul.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         ewh.a.parse(ul.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cy = $$0x);
      }

      this.cA = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      um.e($$0);
      $$0.a("Inventory", this.g.a(new ud()));
      $$0.a("SelectedItemSlot", this.g.k);
      $$0.a("SleepTimer", (short)this.h);
      $$0.a("XpP", this.ct);
      $$0.a("XpLevel", this.cr);
      $$0.a("XpTotal", this.cs);
      $$0.a("XpSeed", this.cu);
      $$0.a("Score", this.fU());
      this.cf.b($$0);
      this.cC.a($$0);
      $$0.a("EnderItems", this.cc.a(this.dT()));
      if (!this.gr().g()) {
         $$0.a("ShoulderEntityLeft", this.gr());
      }

      if (!this.gs().g()) {
         $$0.a("ShoulderEntityRight", this.gs());
      }

      this.gz().flatMap($$0x -> ji.b.encodeStart(ul.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cy != null) {
         $$0.a("current_explosion_impact_pos", (uu)ewh.a.encodeStart(ul.a, this.cy).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cA);
   }

   @Override
   public boolean b(bra $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(avy.o)) {
         return !this.dR().ab().b(dcc.G);
      } else if ($$0.a(avy.n)) {
         return !this.dR().ab().b(dcc.H);
      } else if ($$0.a(avy.j)) {
         return !this.dR().ab().b(dcc.I);
      } else {
         return $$0.a(avy.p) ? !this.dR().ab().b(dcc.J) : false;
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cC.a && !$$0.a(avy.e)) {
         return false;
      } else {
         this.bg = 0;
         if (this.ez()) {
            return false;
         } else {
            if (!this.dR().B) {
               this.go();
            }

            if ($$0.f()) {
               if (this.dR().al() == bqe.a) {
                  $$1 = 0.0F;
               }

               if (this.dR().al() == bqe.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dR().al() == bqe.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(btc $$0) {
      super.d($$0);
      if ($$0.fM()) {
         this.fW();
      }
   }

   @Override
   public boolean er() {
      return !this.gb().a && super.er();
   }

   public boolean a(cml $$0) {
      exn $$1 = this.cl();
      exn $$2 = $$0.cl();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bra $$0, float $$1) {
      this.a($$0, $$1, new bso[]{bso.c, bso.d, bso.e, bso.f});
   }

   @Override
   protected void c(bra $$0, float $$1) {
      this.a($$0, $$1, new bso[]{bso.f});
   }

   @Override
   protected void w(float $$0) {
      if (this.bA.a(cug.vs)) {
         if (!this.dR().B) {
            this.b(avr.c.b(this.bA.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayg.d($$0);
            bqg $$2 = this.fu();
            this.bA.a($$1, this, d($$2));
            if (this.bA.e()) {
               if ($$2 == bqg.a) {
                  this.a(bso.a, cud.l);
               } else {
                  this.a(bso.b, cud.l);
               }

               this.bA = cud.l;
               this.a(avh.wE, 0.8F, 0.8F + this.dR().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bra $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fq(), 0.0F);
         this.B(this.fq() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avr.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.D($$0.a());
            this.eN().a($$0, var7);
            this.u(this.ey() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avr.J, Math.round(var7 * 10.0F));
            }

            this.a(dxh.o);
         }
      }
   }

   public boolean Z() {
      return false;
   }

   public void a(drb $$0, boolean $$1) {
   }

   public void a(dbh $$0) {
   }

   public void a(dqa $$0) {
   }

   public void a(drg $$0) {
   }

   public void a(dqr $$0) {
   }

   public void a(cgw $$0, bqa $$1) {
   }

   public OptionalInt a(@Nullable bql $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dbf $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cud $$0, bqg $$1) {
   }

   public bqh a(bsh $$0, bqg $$1) {
      if (this.N_()) {
         if ($$0 instanceof bql) {
            this.a((bql)$$0);
         }

         return bqh.e;
      } else {
         cud $$2 = this.b($$1);
         cud $$3 = $$2.s();
         bqh $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cC.d && $$2 == this.b($$1) && $$2.H() < $$3.H()) {
               $$2.e($$3.H());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof btc) {
               if (this.cC.d) {
                  $$2 = $$3;
               }

               bqh $$5 = $$2.a(this, (btc)$$0, $$1);
               if ($$5.a()) {
                  this.dR().a(dxh.r, $$0.dp(), dxh.a.a(this));
                  if ($$2.e() && !this.cC.d) {
                     this.a($$1, cud.l);
                  }

                  return $$5;
               }
            }

            return bqh.e;
         }
      }
   }

   @Override
   public void bK() {
      super.bK();
      this.K = 0;
   }

   @Override
   protected boolean fe() {
      return super.fe() || this.fJ();
   }

   @Override
   public boolean ee() {
      return !this.cC.b;
   }

   @Override
   protected ewh a(ewh $$0, bth $$1) {
      float $$2 = this.dL();
      if (!this.cC.b && !($$0.d > 0.0) && ($$1 == bth.a || $$1 == bth.b) && this.fR() && this.F($$2)) {
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

         return new ewh($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean F(float $$0) {
      return this.aG() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      ewc $$3 = this.cM();
      return this.dR().a(this, new ewc($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bsh $$0) {
      if ($$0.cv()) {
         if (!$$0.u(this)) {
            float $$1 = this.fp() ? this.bE : (float)this.g(buk.c);
            cud $$2 = this.A();
            bra $$3 = this.dS().a(this);
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.E(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gu();
            if ($$0.am().a(awa.H) && $$0 instanceof cnd $$6) {
               $$6.a(cne.c, this, this, true);
               this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.ud, this.dg());
            } else {
               if ($$1 > 0.0F || $$4 > 0.0F) {
                  boolean $$7 = $$5 > 0.9F;
                  boolean $$8;
                  if (this.cd() && $$7) {
                     this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.uc, this.dg(), 1.0F, 1.0F);
                     $$8 = true;
                  } else {
                     $$8 = false;
                  }

                  $$1 += $$2.g().a($$0, $$1, $$3);
                  boolean $$10 = $$7
                     && this.ac > 0.0F
                     && !this.aG()
                     && !this.p_()
                     && !this.bg()
                     && !this.b(brr.o)
                     && !this.bT()
                     && $$0 instanceof btc
                     && !this.cd();
                  if ($$10) {
                     $$1 *= 1.5F;
                  }

                  float $$12 = $$1 + $$4;
                  boolean $$13 = false;
                  double $$14 = (double)(this.Z - this.Y);
                  if ($$7 && !$$10 && !$$8 && this.aG() && $$14 < (double)this.fl()) {
                     cud $$15 = this.b(bqg.a);
                     if ($$15.g() instanceof cvq) {
                        $$13 = true;
                     }
                  }

                  float $$16 = 0.0F;
                  if ($$0 instanceof btc $$17) {
                     $$16 = $$17.ey();
                  }

                  ewh $$18 = $$0.du();
                  boolean $$19 = $$0.a($$3, $$12);
                  if ($$19) {
                     float $$20 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                     if ($$20 > 0.0F) {
                        if ($$0 instanceof btc $$21) {
                           $$21.q(
                              (double)($$20 * 0.5F),
                              (double)ayg.a(this.dH() * (float) (Math.PI / 180.0)),
                              (double)(-ayg.b(this.dH() * (float) (Math.PI / 180.0)))
                           );
                        } else {
                           $$0.j(
                              (double)(-ayg.a(this.dH() * (float) (Math.PI / 180.0)) * $$20 * 0.5F),
                              0.1,
                              (double)(ayg.b(this.dH() * (float) (Math.PI / 180.0)) * $$20 * 0.5F)
                           );
                        }

                        this.j(this.du().d(0.6, 1.0, 0.6));
                        this.i(false);
                     }

                     if ($$13) {
                        float $$22 = 1.0F + (float)this.g(buk.D) * $$1;

                        for (btc $$24 : this.dR().a(btc.class, $$0.cM().c(1.0, 0.25, 1.0))) {
                           if ($$24 != this && $$24 != $$0 && !this.s($$24) && (!($$24 instanceof cik) || !((cik)$$24).z()) && this.g((bsh)$$24) < 9.0) {
                              float $$25 = this.a($$24, $$22, $$3) * $$5;
                              $$24.q(0.4F, (double)ayg.a(this.dH() * (float) (Math.PI / 180.0)), (double)(-ayg.b(this.dH() * (float) (Math.PI / 180.0))));
                              $$24.a($$3, $$25);
                              if (this.dR() instanceof aqm $$26) {
                                 czo.a($$26, (bsh)$$24, $$3);
                              }
                           }
                        }

                        this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.uf, this.dg(), 1.0F, 1.0F);
                        this.fX();
                     }

                     if ($$0 instanceof aqn && $$0.U) {
                        ((aqn)$$0).c.b(new aeu($$0));
                        $$0.U = false;
                        $$0.j($$18);
                     }

                     if ($$10) {
                        this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.ub, this.dg(), 1.0F, 1.0F);
                        this.b($$0);
                     }

                     if (!$$10 && !$$13) {
                        if ($$7) {
                           this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.ue, this.dg(), 1.0F, 1.0F);
                        } else {
                           this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.ug, this.dg(), 1.0F, 1.0F);
                        }
                     }

                     if ($$4 > 0.0F) {
                        this.c($$0);
                     }

                     this.A($$0);
                     bsh $$27 = $$0;
                     if ($$0 instanceof chm) {
                        $$27 = ((chm)$$0).b;
                     }

                     boolean $$28 = false;
                     if (this.dR() instanceof aqm $$29) {
                        if ($$27 instanceof btc $$30) {
                           $$28 = $$2.a($$30, this);
                        }

                        czo.a($$29, $$0, $$3);
                     }

                     if (!this.dR().B && !$$2.e() && $$27 instanceof btc) {
                        if ($$28) {
                           $$2.b((btc)$$27, this);
                        }

                        if ($$2.e()) {
                           if ($$2 == this.eV()) {
                              this.a(bqg.a, cud.l);
                           } else {
                              this.a(bqg.b, cud.l);
                           }
                        }
                     }

                     if ($$0 instanceof btc) {
                        float $$31 = $$16 - ((btc)$$0).ey();
                        this.a(avr.G, Math.round($$31 * 10.0F));
                        if (this.dR() instanceof aqm && $$31 > 2.0F) {
                           int $$32 = (int)((double)$$31 * 0.5);
                           ((aqm)this.dR()).a(lj.g, $$0.dw(), $$0.e(0.5), $$0.dC(), $$32, 0.1, 0.0, 0.1, 0.2);
                        }
                     }

                     this.D(0.1F);
                  } else {
                     this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.ud, this.dg(), 1.0F, 1.0F);
                  }
               }
            }
         }
      }
   }

   protected float a(bsh $$0, float $$1, bra $$2) {
      return $$1;
   }

   @Override
   protected void g(btc $$0) {
      this.e($$0);
   }

   public void fW() {
      this.gv().a(cug.vs, 100);
      this.fz();
      this.dR().a(this, (byte)30);
   }

   @Override
   public void b(bsh $$0) {
   }

   public void c(bsh $$0) {
   }

   public void fX() {
      double $$0 = (double)(-ayg.a(this.dH() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayg.b(this.dH() * (float) (Math.PI / 180.0));
      if (this.dR() instanceof aqm) {
         ((aqm)this.dR()).a(lj.aj, this.dw() + $$0, this.e(0.5), this.dC() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fY() {
   }

   @Override
   public void a(bsh.d $$0) {
      super.a($$0);
      this.cd.a(this);
      if (this.ce != null && this.gc()) {
         this.t();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fZ() {
      return this.cE;
   }

   public cmk ga() {
      return this.g;
   }

   public cmi gb() {
      return this.cC;
   }

   @Override
   public boolean fN() {
      return this.cC.d;
   }

   public void a(cud $$0, cud $$1, cpr $$2) {
   }

   public boolean gc() {
      return this.ce != this.cd;
   }

   public Either<cml.a, azk> a(ja $$0) {
      this.b($$0);
      this.h = 0;
      return Either.right(azk.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fK();
      if (this.dR() instanceof aqm && $$1) {
         ((aqm)this.dR()).e();
      }

      this.h = $$0 ? 0 : 100;
   }

   @Override
   public void fK() {
      this.a(true, true);
   }

   public boolean gd() {
      return this.fJ() && this.h >= 100;
   }

   public int ge() {
      return this.h;
   }

   public void a(wu $$0, boolean $$1) {
   }

   public void a(akk $$0) {
      this.b(avr.i.b($$0));
   }

   public void a(akk $$0, int $$1) {
      this.a(avr.i.b($$0), $$1);
   }

   public void b(avo<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avo<?> $$0, int $$1) {
   }

   public void a(avo<?> $$0) {
   }

   public int a(Collection<cyl<?>> $$0) {
      return 0;
   }

   public void a(cyl<?> $$0, List<cud> $$1) {
   }

   public void b(List<akk> $$0) {
   }

   public int b(Collection<cyl<?>> $$0) {
      return 0;
   }

   @Override
   public void fh() {
      super.fh();
      this.a(avr.E);
      if (this.cd()) {
         this.D(0.2F);
      } else {
         this.D(0.05F);
      }
   }

   @Override
   public void a(ewh $$0) {
      if (this.ce() && !this.bT()) {
         double $$1 = this.bN().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bo || !this.dR().a_(ja.a(this.dw(), this.dy() + 1.0 - 0.1, this.dC())).u().c()) {
            ewh $$3 = this.du();
            this.j($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cC.b && !this.bT()) {
         double $$4 = this.du().d;
         super.a($$0);
         ewh $$5 = this.du();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bm() {
      if (this.cC.b) {
         this.j(false);
      } else {
         super.bm();
      }
   }

   protected boolean h(ja $$0) {
      return !this.dR().a_($$0).o(this.dR(), $$0);
   }

   @Override
   public float fl() {
      return (float)this.g(buk.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bra $$2) {
      if (this.cC.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avr.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cA && this.cy != null) {
            double $$3 = this.cy.d;
            this.gC();
            return $$3 < this.dy() ? false : super.a((float)($$3 - this.dy()), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean gf() {
      if (!this.aG() && !this.fC() && !this.bg() && !this.b(brr.y)) {
         cud $$0 = this.a(bso.e);
         if ($$0.a(cug.nT) && csz.i($$0)) {
            this.gg();
            return true;
         }
      }

      return false;
   }

   public void gg() {
      this.b(7, true);
   }

   public void gh() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bp() {
      if (!this.N_()) {
         super.bp();
      }
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      if (this.bg()) {
         this.aV();
         this.b($$1);
      } else {
         ja $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dsl $$3 = this.dR().a_($$2);
            if ($$3.a(avw.bo)) {
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
   public btc.a eJ() {
      return new btc.a(avh.ur, avh.uh);
   }

   @Override
   public boolean a(aqm $$0, btc $$1) {
      this.b(avr.g.b($$1.am()));
      return true;
   }

   @Override
   public void a(dsl $$0, ewh $$1) {
      if (!this.cC.b) {
         super.a($$0, $$1);
      }

      this.gC();
   }

   public void d(int $$0) {
      this.s($$0);
      this.ct = this.ct + (float)$$0 / (float)this.gj();
      this.cs = ayg.a(this.cs + $$0, 0, Integer.MAX_VALUE);

      while (this.ct < 0.0F) {
         float $$1 = this.ct * (float)this.gj();
         if (this.cr > 0) {
            this.c(-1);
            this.ct = 1.0F + $$1 / (float)this.gj();
         } else {
            this.c(-1);
            this.ct = 0.0F;
         }
      }

      while (this.ct >= 1.0F) {
         this.ct = (this.ct - 1.0F) * (float)this.gj();
         this.c(1);
         this.ct = this.ct / (float)this.gj();
      }
   }

   public int gi() {
      return this.cu;
   }

   @Override
   public void a(cud $$0, int $$1) {
      this.cr -= $$1;
      if (this.cr < 0) {
         this.cr = 0;
         this.ct = 0.0F;
         this.cs = 0;
      }

      this.cu = this.ah.f();
   }

   public void c(int $$0) {
      this.cr += $$0;
      if (this.cr < 0) {
         this.cr = 0;
         this.ct = 0.0F;
         this.cs = 0;
      }

      if ($$0 > 0 && this.cr % 5 == 0 && (float)this.cD < (float)this.ai - 100.0F) {
         float $$1 = this.cr > 30 ? 1.0F : (float)this.cr / 30.0F;
         this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.uq, this.dg(), $$1 * 0.75F, 1.0F);
         this.cD = this.ai;
      }
   }

   public int gj() {
      if (this.cr >= 30) {
         return 112 + (this.cr - 30) * 9;
      } else {
         return this.cr >= 15 ? 37 + (this.cr - 15) * 5 : 7 + this.cr * 2;
      }
   }

   public void D(float $$0) {
      if (!this.cC.a) {
         if (!this.dR().B) {
            this.cf.a($$0);
         }
      }
   }

   public Optional<clr> ab() {
      return Optional.empty();
   }

   public cpe gk() {
      return this.cf;
   }

   public boolean u(boolean $$0) {
      return this.cC.a || $$0 || this.cf.c();
   }

   public boolean gl() {
      return this.ey() > 0.0F && this.ey() < this.eP();
   }

   public boolean gm() {
      return this.cC.e;
   }

   public boolean a(ja $$0, jf $$1, cud $$2) {
      if (this.cC.e) {
         return true;
      } else {
         ja $$3 = $$0.a($$1.g());
         dsp $$4 = new dsp(this.dR(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int ei() {
      if (!this.dR().ab().b(dcc.d) && !this.N_()) {
         int $$0 = this.cr * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ej() {
      return true;
   }

   @Override
   public boolean cH() {
      return true;
   }

   @Override
   protected bsh.c bd() {
      return this.cC.b || this.aG() && this.ca() ? bsh.c.a : bsh.c.d;
   }

   @Override
   public void z() {
   }

   @Override
   public wu ah() {
      return wu.b(this.cE.getName());
   }

   public cqv gn() {
      return this.cc;
   }

   @Override
   public cud a(bso $$0) {
      if ($$0 == bso.a) {
         return this.g.f();
      } else if ($$0 == bso.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bso.a.b ? this.g.i.get($$0.b()) : cud.l;
      }
   }

   @Override
   protected boolean b(bso $$0) {
      return $$0.a() == bso.a.b;
   }

   @Override
   public void a(bso $$0, cud $$1) {
      this.e($$1);
      if ($$0 == bso.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bso.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bso.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cud $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cud> eY() {
      return Lists.newArrayList(new cud[]{this.eV(), this.eW()});
   }

   @Override
   public Iterable<cud> eX() {
      return this.g.i;
   }

   @Override
   public boolean d(bso $$0) {
      return $$0 != bso.g;
   }

   public boolean h(tx $$0) {
      if (this.bT() || !this.aG() || this.bg() || this.aB) {
         return false;
      } else if (this.gr().g()) {
         this.i($$0);
         this.f = this.dR().Z();
         return true;
      } else if (this.gs().g()) {
         this.j($$0);
         this.f = this.dR().Z();
         return true;
      } else {
         return false;
      }
   }

   protected void go() {
      if (this.f + 20L < this.dR().Z()) {
         this.k(this.gr());
         this.i(new tx());
         this.k(this.gs());
         this.j(new tx());
      }
   }

   private void k(tx $$0) {
      if (!this.dR().B && !$$0.g()) {
         bsn.a($$0, this.dR()).ifPresent($$0x -> {
            if ($$0x instanceof btz) {
               ((btz)$$0x).b(this.az);
            }

            $$0x.a_(this.dw(), this.dy() + 0.7F, this.dC());
            ((aqm)this.dR()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean N_();

   @Override
   public boolean bA() {
      return !this.N_() && super.bA();
   }

   @Override
   public boolean ce() {
      return !this.cC.b && !this.N_() && super.ce();
   }

   public abstract boolean f();

   @Override
   public boolean cE() {
      return !this.cC.b;
   }

   public exl gp() {
      return this.dR().M();
   }

   @Override
   public wu O_() {
      xi $$0 = exg.a(this.cl(), this.ah());
      return this.a($$0);
   }

   private xi a(xi $$0) {
      String $$1 = this.fZ().getName();
      return $$0.a($$1x -> $$1x.a(new ws(ws.a.d, "/tell " + $$1 + " ")).a(this.cL()).a($$1));
   }

   @Override
   public String cD() {
      return this.fZ().getName();
   }

   @Override
   protected void C(float $$0) {
      this.ar().a(d, $$0);
   }

   @Override
   public float fq() {
      return this.ar().a(d);
   }

   public boolean a(cmm $$0) {
      return (this.ar().a(bY) & $$0.a()) == $$0.a();
   }

   @Override
   public btu a_(int $$0) {
      if ($$0 == 499) {
         return new btu() {
            @Override
            public cud a() {
               return cml.this.ce.g();
            }

            @Override
            public boolean a(cud $$0) {
               cml.this.ce.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new btu() {
               @Override
               public cud a() {
                  return cml.this.cd.r().a($$1);
               }

               @Override
               public boolean a(cud $$0) {
                  cml.this.cd.r().a($$1, $$0);
                  cml.this.cd.a(cml.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return btu.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cc.b() ? btu.a(this.cc, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gq() {
      return this.cF;
   }

   public void v(boolean $$0) {
      this.cF = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cC.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bsw fs() {
      return this.ao.a(bZ) == 0 ? bsw.a : bsw.b;
   }

   public void a(bsw $$0) {
      this.ao.a(bZ, (byte)($$0 == bsw.a ? 0 : 1));
   }

   public tx gr() {
      return this.ao.a(ca);
   }

   protected void i(tx $$0) {
      this.ao.a(ca, $$0);
   }

   public tx gs() {
      return this.ao.a(cb);
   }

   protected void j(tx $$0) {
      this.ao.a(cb, $$0);
   }

   public float gt() {
      return (float)(1.0 / this.g(buk.e) * 20.0);
   }

   public float E(float $$0) {
      return ayg.a(((float)this.aU + $$0) / this.gt(), 0.0F, 1.0F);
   }

   public void gu() {
      this.aU = 0;
   }

   public ctz gv() {
      return this.cH;
   }

   @Override
   protected float aP() {
      return !this.cC.b && !this.fC() ? super.aP() : 1.0F;
   }

   public float gw() {
      return (float)this.g(buk.q);
   }

   public boolean gx() {
      return this.cC.d && this.G() >= 2;
   }

   @Override
   public boolean f(cud $$0) {
      bso $$1 = this.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bsk e(bto $$0) {
      return c.getOrDefault($$0, bX);
   }

   @Override
   public ImmutableList<bto> fG() {
      return ImmutableList.of(bto.a, bto.f, bto.d);
   }

   @Override
   public cud g(cud $$0) {
      if (!($$0.g() instanceof cuw)) {
         return cud.l;
      } else {
         Predicate<cud> $$1 = ((cuw)$$0.g()).d();
         cud $$2 = cuw.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cuw)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cud $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cC.d ? new cud(cug.ow) : cud.l;
         }
      }
   }

   @Override
   public cud a(dcg $$0, cud $$1, cpf $$2) {
      this.gk().a($$2);
      this.b(avr.c.b($$1.g()));
      $$0.a(null, this.dw(), this.dy(), this.dC(), avh.uj, avi.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aqn) {
         am.A.a((aqn)this, $$1);
      }

      cud $$3 = super.a($$0, $$1, $$2);
      Optional<cud> $$4 = $$2.f();
      if ($$4.isPresent() && !this.fN()) {
         if ($$3.e()) {
            return $$4.get().s();
         }

         this.ga().f($$4.get().s());
      }

      return $$3;
   }

   @Override
   public ewh r(float $$0) {
      double $$1 = 0.22 * (this.fs() == bsw.b ? -1.0 : 1.0);
      float $$2 = ayg.i($$0 * 0.5F, this.dJ(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayg.i($$0, this.ba, this.aZ) * (float) (Math.PI / 180.0);
      if (this.fC() || this.fp()) {
         ewh $$4 = this.g($$0);
         ewh $$5 = this.du();
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

         return this.m($$0).e(new ewh($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.cf()) {
         return this.m($$0).e(new ewh($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cM().c() - 1.0;
         double $$13 = this.cc() ? -0.2 : 0.07;
         return this.m($$0).e(new ewh($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dQ() {
      return true;
   }

   public boolean gy() {
      return this.ft() && this.fv().a(cug.qX);
   }

   @Override
   public boolean dP() {
      return false;
   }

   public Optional<ji> gz() {
      return this.cI;
   }

   public void a(Optional<ji> $$0) {
      this.cI = $$0;
   }

   @Override
   public float eG() {
      return this.cx;
   }

   @Override
   public void n(float $$0) {
      super.n($$0);
      this.cx = $$0;
   }

   @Override
   public boolean dK() {
      return true;
   }

   @Override
   protected float fk() {
      if (this.cC.b && !this.bT()) {
         return this.cd() ? this.cC.a() * 2.0F : this.cC.a();
      } else {
         return this.cd() ? 0.025999999F : 0.02F;
      }
   }

   public double gA() {
      return this.g(buk.g);
   }

   public double gB() {
      return this.g(buk.j);
   }

   public boolean b(bsh $$0, double $$1) {
      return $$0.dM() ? false : this.a($$0.cM(), $$1);
   }

   public boolean a(ewc $$0, double $$1) {
      double $$2 = this.gB() + $$1;
      return $$0.e(this.bz()) < $$2 * $$2;
   }

   public boolean a(ja $$0, double $$1) {
      double $$2 = this.gA() + $$1;
      return new ewc($$0).e(this.bz()) < $$2 * $$2;
   }

   public void gC() {
      this.cz = null;
      this.cy = null;
      this.cA = false;
   }

   public static enum a {
      a,
      b(wu.c("block.minecraft.bed.no_sleep")),
      c(wu.c("block.minecraft.bed.too_far_away")),
      d(wu.c("block.minecraft.bed.obstructed")),
      e,
      f(wu.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wu g;

      private a() {
         this.g = null;
      }

      private a(final wu $$0) {
         this.g = $$0;
      }

      @Nullable
      public wu a() {
         return this.g;
      }
   }
}
