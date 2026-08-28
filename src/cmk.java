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

public abstract class cmk extends btb {
   private static final Logger b = LogUtils.getLogger();
   public static final bsv bH = bsv.b;
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
   public static final ewf bV = new ewf(0.0, 0.6, 0.0);
   public static final bsj bW = bsj.b(0.6F, 1.8F).b(1.62F).a(bsi.a().a(bsh.b, bV));
   private static final Map<btn, bsj> c = ImmutableMap.builder()
      .put(btn.a, bW)
      .put(btn.c, aG)
      .put(btn.b, bsj.b(0.6F, 0.6F).b(0.4F))
      .put(btn.d, bsj.b(0.6F, 0.6F).b(0.4F))
      .put(btn.e, bsj.b(0.6F, 0.6F).b(0.4F))
      .put(btn.f, bsj.b(0.6F, 1.5F).b(1.27F).a(bsi.a().a(bsh.b, bV)))
      .put(btn.h, bsj.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajp<Float> d = ajt.a(cmk.class, ajr.d);
   private static final ajp<Integer> e = ajt.a(cmk.class, ajr.b);
   protected static final ajp<Byte> bX = ajt.a(cmk.class, ajr.a);
   protected static final ajp<Byte> bY = ajt.a(cmk.class, ajr.a);
   protected static final ajp<tx> bZ = ajt.a(cmk.class, ajr.t);
   protected static final ajp<tx> ca = ajt.a(cmk.class, ajr.t);
   private long f;
   final cmj g = new cmj(this);
   protected cqu cb = new cqu();
   public final cqj cc;
   public cph cd;
   protected cpd ce = new cpd();
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
   private int cB;
   protected boolean cp;
   private final cmh cC = new cmh();
   public int cq;
   public int cr;
   public float cs;
   protected int ct;
   protected final float cu = 0.02F;
   private int cD;
   private final GameProfile cE;
   private boolean cF;
   private cuc cG = cuc.l;
   private final cty cH = this.k();
   private Optional<ji> cI = Optional.empty();
   @Nullable
   public cmy cv;
   protected float cw;
   @Nullable
   public ewf cx;
   @Nullable
   public bsg cy;
   public boolean cz;

   public cmk(dcf $$0, ja $$1, float $$2, GameProfile $$3) {
      super(bsm.by, $$0);
      this.a_($$3.getId());
      this.cE = $$3;
      this.cc = new cqj(this.g, !$$0.B, this);
      this.cd = this.cc;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bk = 180.0F;
   }

   public boolean a(dcf $$0, ja $$1, dcc $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dcc.d) {
         return true;
      } else if (this.gl()) {
         return false;
      } else {
         cuc $$3 = this.eU();
         return $$3.e() || !$$3.b(new dso($$0, $$1, false));
      }
   }

   public static bui.a fN() {
      return btb.dW().a(buj.c, 1.0).a(buj.v, 0.1F).a(buj.e).a(buj.q).a(buj.g, 4.5).a(buj.j, 3.0).a(buj.f).a(buj.C).a(buj.z).a(buj.t).a(buj.D);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bX, (byte)0);
      $$0.a(bY, (byte)bH.a());
      $$0.a(bZ, new tx());
      $$0.a(ca, new tx());
   }

   @Override
   public void l() {
      this.ag = this.N_();
      if (this.N_()) {
         this.d(false);
      }

      if (this.ci > 0) {
         this.ci--;
      }

      if (this.fI()) {
         this.cB++;
         if (this.cB > 100) {
            this.cB = 100;
         }

         if (!this.dQ().B && this.dQ().R()) {
            this.a(false, true);
         }
      } else if (this.cB > 0) {
         this.cB++;
         if (this.cB >= 110) {
            this.cB = 0;
         }
      }

      this.fR();
      super.l();
      if (!this.dQ().B && this.cd != null && !this.cd.b(this)) {
         this.r();
         this.cd = this.cc;
      }

      this.v();
      if (!this.dQ().B) {
         this.ce.a(this);
         this.a(avr.k);
         this.a(avr.l);
         if (this.bE()) {
            this.a(avr.m);
         }

         if (this.bZ()) {
            this.a(avr.o);
         }

         if (!this.fI()) {
            this.a(avr.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = ayg.a(this.dv(), -2.9999999E7, 2.9999999E7);
      double $$2 = ayg.a(this.dB(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dv() || $$2 != this.dB()) {
         this.a_($$1, this.dx(), $$2);
      }

      this.aT++;
      cuc $$3 = this.eU();
      if (!cuc.a(this.cG, $$3)) {
         if (!cuc.b(this.cG, $$3)) {
            this.gt();
         }

         this.cG = $$3.s();
      }

      this.u();
      this.cH.a();
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
      this.cp = this.a(awc.a);
      return this.cp;
   }

   private void u() {
      cuc $$0 = this.a(bsn.f);
      if ($$0.a(cuf.oo) && !this.a(awc.a)) {
         this.b(new bro(brq.m, 200, 0, false, false, true));
      }
   }

   protected cty k() {
      return new cty();
   }

   private void v() {
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
      if (this.h(btn.d)) {
         btn $$0;
         if (this.fB()) {
            $$0 = btn.b;
         } else if (this.fI()) {
            $$0 = btn.c;
         } else if (this.cd()) {
            $$0 = btn.d;
         } else if (this.fo()) {
            $$0 = btn.e;
         } else if (this.bW() && !this.cC.b) {
            $$0 = btn.f;
         } else {
            $$0 = btn.a;
         }

         btn $$6;
         if (this.N_() || this.bS() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(btn.f)) {
            $$6 = btn.f;
         } else {
            $$6 = btn.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(btn $$0) {
      return this.dQ().a(this, this.a($$0).a(this.do()).h(1.0E-7));
   }

   @Override
   public int aA() {
      return Math.max(1, this.dQ().ab().c(this.cC.a ? dcb.F : dcb.E));
   }

   @Override
   protected avg aQ() {
      return avh.uu;
   }

   @Override
   protected avg aR() {
      return avh.us;
   }

   @Override
   protected avg aS() {
      return avh.ut;
   }

   @Override
   public int bQ() {
      return 10;
   }

   @Override
   public void a(avg $$0, float $$1, float $$2) {
      this.dQ().a(this, this.dv(), this.dx(), this.dB(), $$0, this.df(), $$1, $$2);
   }

   public void a(avg $$0, avi $$1, float $$2, float $$3) {
   }

   @Override
   public avi df() {
      return avi.h;
   }

   @Override
   protected int dg() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.x();
      } else if ($$0 == 23) {
         this.cF = false;
      } else if ($$0 == 22) {
         this.cF = true;
      } else {
         super.b($$0);
      }
   }

   protected void r() {
      this.cd = this.cc;
   }

   @Override
   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dQ().B && this.fP() && this.bS()) {
         this.ac();
         this.g(false);
      } else {
         super.t();
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
   public void n_() {
      if (this.cf > 0) {
         this.cf--;
      }

      if (this.dQ().al() == bqd.a && this.dQ().ab().b(dcb.k)) {
         if (this.ex() < this.eO() && this.ai % 20 == 0) {
            this.c(1.0F);
         }

         if (this.ce.c() && this.ai % 10 == 0) {
            this.ce.a(this.ce.a() + 1);
         }
      }

      this.g.j();
      this.cg = this.ch;
      super.n_();
      this.z((float)this.g(buj.v));
      float $$1;
      if (this.aF() && !this.ey() && !this.cd()) {
         $$1 = Math.min(0.1F, (float)this.dt().h());
      } else {
         $$1 = 0.0F;
      }

      this.ch = this.ch + ($$1 - this.ch) * 0.4F;
      if (this.ex() > 0.0F && !this.N_()) {
         ewa $$2;
         if (this.bS() && !this.dd().dL()) {
            $$2 = this.cL().b(this.dd().cL()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cL().c(1.0, 0.5, 1.0);
         }

         List<bsg> $$4 = this.dQ().a_(this, $$2);
         List<bsg> $$5 = Lists.newArrayList();

         for (bsg $$6 : $$4) {
            if ($$6.al() == bsm.M) {
               $$5.add($$6);
            } else if (!$$6.dL()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ac.a($$5, this.ah));
         }
      }

      this.c(this.gq());
      this.c(this.gr());
      if (!this.dQ().B && (this.ac > 0.5F || this.bf()) || this.cC.b || this.fI() || this.aB) {
         this.gn();
      }
   }

   private void c(@Nullable tx $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dQ().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bsm.a($$1).filter($$0x -> $$0x == bsm.ax).ifPresent($$0x -> {
            if (!cfh.a(this.dQ(), this)) {
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), cfh.a(this.dQ(), this.dQ().z), this.df(), 1.0F, cfh.a(this.dQ().z));
            }
         });
      }
   }

   private void d(bsg $$0) {
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

   public void a(int $$0, float $$1, cuc $$2) {
      this.bC = $$0;
      this.bD = $$1;
      this.bE = $$2;
      if (!this.dQ().B) {
         this.gn();
         this.c(4, true);
      }
   }

   private cuc z() {
      return this.fo() && this.bE != null ? this.bE : this.eU();
   }

   @Override
   public void a(bqz $$0) {
      super.a($$0);
      this.au();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-ayg.b((this.eF() + this.dG()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-ayg.a((this.eF() + this.dG()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(avr.N);
      this.a(avr.i.b(avr.m));
      this.a(avr.i.b(avr.n));
      this.aD();
      this.c(false);
      this.a(Optional.of(ji.a(this.dQ().af(), this.dq())));
   }

   @Override
   protected void eA() {
      super.eA();
      if (!this.dQ().ab().b(dcb.d)) {
         this.fU();
         this.g.k();
      }
   }

   protected void fU() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cuc $$1 = this.g.a($$0);
         if (!$$1.e() && czn.a($$1, czm.D)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected avg d(bqz $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avg o_() {
      return avh.uk;
   }

   @Nullable
   public ciu a(cuc $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public ciu a(cuc $$0, boolean $$1, boolean $$2) {
      if ($$0.e()) {
         return null;
      } else {
         if (this.dQ().B) {
            this.a(bqf.a);
         }

         double $$3 = this.dz() - 0.3F;
         ciu $$4 = new ciu(this.dQ(), this.dv(), $$3, this.dB(), $$0);
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
            float $$8 = ayg.a(this.dI() * (float) (Math.PI / 180.0));
            float $$9 = ayg.b(this.dI() * (float) (Math.PI / 180.0));
            float $$10 = ayg.a(this.dG() * (float) (Math.PI / 180.0));
            float $$11 = ayg.b(this.dG() * (float) (Math.PI / 180.0));
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

   public float c(dsk $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         $$1 += (float)this.g(buj.t);
      }

      if (brp.a(this)) {
         $$1 *= 1.0F + (float)(brp.b(this) + 1) * 0.2F;
      }

      if (this.b(brq.d)) {
         $$1 *= switch (this.c(brq.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(buj.f);
      if (this.a(awc.a)) {
         $$1 *= (float)this.f(buj.C).f();
      }

      if (!this.aF()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   @Override
   public boolean d(dsk $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a_(this.cE.getId());
      ud $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.k = $$0.h("SelectedItemSlot");
      this.cB = $$0.g("SleepTimer");
      this.cs = $$0.j("XpP");
      this.cq = $$0.h("XpLevel");
      this.cr = $$0.h("XpTotal");
      this.ct = $$0.h("XpSeed");
      if (this.ct == 0) {
         this.ct = this.ah.f();
      }

      this.r($$0.h("Score"));
      this.ce.a($$0);
      this.cC.b($$0);
      this.f(buj.v).a((double)this.cC.b());
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
         this.a(ji.b.parse(ul.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         ewf.a.parse(ul.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cx = $$0x);
      }

      this.cz = $$0.q("ignore_fall_damage_from_current_explosion");
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      um.e($$0);
      $$0.a("Inventory", this.g.a(new ud()));
      $$0.a("SelectedItemSlot", this.g.k);
      $$0.a("SleepTimer", (short)this.cB);
      $$0.a("XpP", this.cs);
      $$0.a("XpLevel", this.cq);
      $$0.a("XpTotal", this.cr);
      $$0.a("XpSeed", this.ct);
      $$0.a("Score", this.fT());
      this.ce.b($$0);
      this.cC.a($$0);
      $$0.a("EnderItems", this.cb.a(this.dS()));
      if (!this.gq().g()) {
         $$0.a("ShoulderEntityLeft", this.gq());
      }

      if (!this.gr().g()) {
         $$0.a("ShoulderEntityRight", this.gr());
      }

      this.gy().flatMap($$0x -> ji.b.encodeStart(ul.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cx != null) {
         $$0.a("current_explosion_impact_pos", (uu)ewf.a.encodeStart(ul.a, this.cx).getOrThrow());
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cz);
   }

   @Override
   public boolean b(bqz $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(avy.o)) {
         return !this.dQ().ab().b(dcb.G);
      } else if ($$0.a(avy.n)) {
         return !this.dQ().ab().b(dcb.H);
      } else if ($$0.a(avy.j)) {
         return !this.dQ().ab().b(dcb.I);
      } else {
         return $$0.a(avy.p) ? !this.dQ().ab().b(dcb.J) : false;
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cC.a && !$$0.a(avy.e)) {
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
               if (this.dQ().al() == bqd.a) {
                  $$1 = 0.0F;
               }

               if (this.dQ().al() == bqd.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dQ().al() == bqd.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(btb $$0) {
      super.d($$0);
      if ($$0.fL()) {
         this.fV();
      }
   }

   @Override
   public boolean eq() {
      return !this.ga().a && super.eq();
   }

   public boolean a(cmk $$0) {
      exl $$1 = this.ck();
      exl $$2 = $$0.ck();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bqz $$0, float $$1) {
      this.a($$0, $$1, new bsn[]{bsn.c, bsn.d, bsn.e, bsn.f});
   }

   @Override
   protected void c(bqz $$0, float $$1) {
      this.a($$0, $$1, new bsn[]{bsn.f});
   }

   @Override
   protected void w(float $$0) {
      if (this.bz.a(cuf.vs)) {
         if (!this.dQ().B) {
            this.b(avr.c.b(this.bz.g()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + ayg.d($$0);
            bqf $$2 = this.ft();
            this.bz.a($$1, this, d($$2));
            if (this.bz.e()) {
               if ($$2 == bqf.a) {
                  this.a(bsn.a, cuc.l);
               } else {
                  this.a(bsn.b, cuc.l);
               }

               this.bz = cuc.l;
               this.a(avh.wE, 0.8F, 0.8F + this.dQ().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bqz $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fp(), 0.0F);
         this.B(this.fp() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avr.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.D($$0.a());
            this.eM().a($$0, var7);
            this.u(this.ex() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avr.J, Math.round(var7 * 10.0F));
            }

            this.a(dxg.o);
         }
      }
   }

   public boolean Y() {
      return false;
   }

   public void a(dra $$0, boolean $$1) {
   }

   public void a(dbg $$0) {
   }

   public void a(dpz $$0) {
   }

   public void a(drf $$0) {
   }

   public void a(dqq $$0) {
   }

   public void a(cgv $$0, bpz $$1) {
   }

   public OptionalInt a(@Nullable bqk $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, dbe $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cuc $$0, bqf $$1) {
   }

   public bqg a(bsg $$0, bqf $$1) {
      if (this.N_()) {
         if ($$0 instanceof bqk) {
            this.a((bqk)$$0);
         }

         return bqg.e;
      } else {
         cuc $$2 = this.b($$1);
         cuc $$3 = $$2.s();
         bqg $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cC.d && $$2 == this.b($$1) && $$2.H() < $$3.H()) {
               $$2.e($$3.H());
            }

            return $$4;
         } else {
            if (!$$2.e() && $$0 instanceof btb) {
               if (this.cC.d) {
                  $$2 = $$3;
               }

               bqg $$5 = $$2.a(this, (btb)$$0, $$1);
               if ($$5.a()) {
                  this.dQ().a(dxg.r, $$0.do(), dxg.a.a(this));
                  if ($$2.e() && !this.cC.d) {
                     this.a($$1, cuc.l);
                  }

                  return $$5;
               }
            }

            return bqg.e;
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
      return !this.cC.b;
   }

   @Override
   protected ewf a(ewf $$0, btg $$1) {
      float $$2 = this.dK();
      if (!this.cC.b && !($$0.d > 0.0) && ($$1 == btg.a || $$1 == btg.b) && this.fQ() && this.F($$2)) {
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

         return new ewf($$3, $$0.d, $$4);
      } else {
         return $$0;
      }
   }

   private boolean F(float $$0) {
      return this.aF() || this.ac < $$0 && !this.b(0.0, 0.0, $$0 - this.ac);
   }

   private boolean b(double $$0, double $$1, float $$2) {
      ewa $$3 = this.cL();
      return this.dQ().a(this, new ewa($$3.a + $$0, $$3.b - (double)$$2 - 1.0E-5F, $$3.c + $$1, $$3.d + $$0, $$3.b, $$3.f + $$1));
   }

   public void e(bsg $$0) {
      if ($$0.cu()) {
         if (!$$0.u(this)) {
            float $$1 = this.fo() ? this.bD : (float)this.g(buj.c);
            cuc $$2 = this.z();
            bqz $$3 = this.dR().a(this);
            float $$4 = this.a($$0, $$1, $$3) - $$1;
            float $$5 = this.E(0.5F);
            $$1 *= 0.2F + $$5 * $$5 * 0.8F;
            $$4 *= $$5;
            this.gt();
            if ($$0.al().a(awa.H) && $$0 instanceof cnc $$6) {
               $$6.a(cnd.c, this, this, true);
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.ud, this.df());
            } else {
               if ($$1 > 0.0F || $$4 > 0.0F) {
                  boolean $$7 = $$5 > 0.9F;
                  boolean $$8;
                  if (this.cc() && $$7) {
                     this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.uc, this.df(), 1.0F, 1.0F);
                     $$8 = true;
                  } else {
                     $$8 = false;
                  }

                  $$1 += $$2.g().a($$0, $$1, $$3);
                  boolean $$10 = $$7
                     && this.ac > 0.0F
                     && !this.aF()
                     && !this.q_()
                     && !this.bf()
                     && !this.b(brq.o)
                     && !this.bS()
                     && $$0 instanceof btb
                     && !this.cc();
                  if ($$10) {
                     $$1 *= 1.5F;
                  }

                  float $$12 = $$1 + $$4;
                  boolean $$13 = false;
                  double $$14 = (double)(this.Z - this.Y);
                  if ($$7 && !$$10 && !$$8 && this.aF() && $$14 < (double)this.fk()) {
                     cuc $$15 = this.b(bqf.a);
                     if ($$15.g() instanceof cvp) {
                        $$13 = true;
                     }
                  }

                  float $$16 = 0.0F;
                  if ($$0 instanceof btb $$17) {
                     $$16 = $$17.ex();
                  }

                  ewf $$18 = $$0.dt();
                  boolean $$19 = $$0.a($$3, $$12);
                  if ($$19) {
                     float $$20 = this.a($$0, $$3) + ($$8 ? 1.0F : 0.0F);
                     if ($$20 > 0.0F) {
                        if ($$0 instanceof btb $$21) {
                           $$21.q(
                              (double)($$20 * 0.5F),
                              (double)ayg.a(this.dG() * (float) (Math.PI / 180.0)),
                              (double)(-ayg.b(this.dG() * (float) (Math.PI / 180.0)))
                           );
                        } else {
                           $$0.j(
                              (double)(-ayg.a(this.dG() * (float) (Math.PI / 180.0)) * $$20 * 0.5F),
                              0.1,
                              (double)(ayg.b(this.dG() * (float) (Math.PI / 180.0)) * $$20 * 0.5F)
                           );
                        }

                        this.i(this.dt().d(0.6, 1.0, 0.6));
                        this.h(false);
                     }

                     if ($$13) {
                        float $$22 = 1.0F + (float)this.g(buj.D) * $$1;

                        for (btb $$24 : this.dQ().a(btb.class, $$0.cL().c(1.0, 0.25, 1.0))) {
                           if ($$24 != this && $$24 != $$0 && !this.s($$24) && (!($$24 instanceof cij) || !((cij)$$24).z()) && this.g((bsg)$$24) < 9.0) {
                              float $$25 = this.a($$24, $$22, $$3) * $$5;
                              $$24.q(0.4F, (double)ayg.a(this.dG() * (float) (Math.PI / 180.0)), (double)(-ayg.b(this.dG() * (float) (Math.PI / 180.0))));
                              $$24.a($$3, $$25);
                              if (this.dQ() instanceof aqm $$26) {
                                 czn.a($$26, (bsg)$$24, $$3);
                              }
                           }
                        }

                        this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.uf, this.df(), 1.0F, 1.0F);
                        this.fW();
                     }

                     if ($$0 instanceof aqn && $$0.U) {
                        ((aqn)$$0).c.b(new aeu($$0));
                        $$0.U = false;
                        $$0.i($$18);
                     }

                     if ($$10) {
                        this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.ub, this.df(), 1.0F, 1.0F);
                        this.b($$0);
                     }

                     if (!$$10 && !$$13) {
                        if ($$7) {
                           this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.ue, this.df(), 1.0F, 1.0F);
                        } else {
                           this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.ug, this.df(), 1.0F, 1.0F);
                        }
                     }

                     if ($$4 > 0.0F) {
                        this.c($$0);
                     }

                     this.A($$0);
                     bsg $$27 = $$0;
                     if ($$0 instanceof chl) {
                        $$27 = ((chl)$$0).b;
                     }

                     boolean $$28 = false;
                     if (this.dQ() instanceof aqm $$29) {
                        if ($$27 instanceof btb $$30) {
                           $$28 = $$2.a($$30, this);
                        }

                        czn.a($$29, $$0, $$3);
                     }

                     if (!this.dQ().B && !$$2.e() && $$27 instanceof btb) {
                        if ($$28) {
                           $$2.b((btb)$$27, this);
                        }

                        if ($$2.e()) {
                           if ($$2 == this.eU()) {
                              this.a(bqf.a, cuc.l);
                           } else {
                              this.a(bqf.b, cuc.l);
                           }
                        }
                     }

                     if ($$0 instanceof btb) {
                        float $$31 = $$16 - ((btb)$$0).ex();
                        this.a(avr.G, Math.round($$31 * 10.0F));
                        if (this.dQ() instanceof aqm && $$31 > 2.0F) {
                           int $$32 = (int)((double)$$31 * 0.5);
                           ((aqm)this.dQ()).a(lj.g, $$0.dv(), $$0.e(0.5), $$0.dB(), $$32, 0.1, 0.0, 0.1, 0.2);
                        }
                     }

                     this.D(0.1F);
                  } else {
                     this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.ud, this.df(), 1.0F, 1.0F);
                  }
               }
            }
         }
      }
   }

   protected float a(bsg $$0, float $$1, bqz $$2) {
      return $$1;
   }

   @Override
   protected void g(btb $$0) {
      this.e($$0);
   }

   public void fV() {
      this.gu().a(cuf.vs, 100);
      this.fy();
      this.dQ().a(this, (byte)30);
   }

   @Override
   public void b(bsg $$0) {
   }

   public void c(bsg $$0) {
   }

   public void fW() {
      double $$0 = (double)(-ayg.a(this.dG() * (float) (Math.PI / 180.0)));
      double $$1 = (double)ayg.b(this.dG() * (float) (Math.PI / 180.0));
      if (this.dQ() instanceof aqm) {
         ((aqm)this.dQ()).a(lj.aj, this.dv() + $$0, this.e(0.5), this.dB() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fX() {
   }

   @Override
   public void a(bsg.c $$0) {
      super.a($$0);
      this.cc.a(this);
      if (this.cd != null && this.gb()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fY() {
      return this.cE;
   }

   public cmj fZ() {
      return this.g;
   }

   public cmh ga() {
      return this.cC;
   }

   @Override
   public boolean fM() {
      return this.cC.d;
   }

   public void a(cuc $$0, cuc $$1, cpq $$2) {
   }

   public boolean gb() {
      return this.cd != this.cc;
   }

   public Either<cmk.a, azk> a(ja $$0) {
      this.b($$0);
      this.cB = 0;
      return Either.right(azk.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fJ();
      if (this.dQ() instanceof aqm && $$1) {
         ((aqm)this.dQ()).e();
      }

      this.cB = $$0 ? 0 : 100;
   }

   @Override
   public void fJ() {
      this.a(true, true);
   }

   public static Optional<ewf> a(aqm $$0, ja $$1, float $$2, boolean $$3, boolean $$4) {
      dsk $$5 = $$0.a_($$1);
      dfh $$6 = $$5.b();
      if ($$6 instanceof dlp && ($$3 || $$5.c(dlp.d) > 0) && dlp.a($$0)) {
         Optional<ewf> $$7 = dlp.a(bsm.by, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dlp.d, Integer.valueOf($$5.c(dlp.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof dfa && dfa.a($$0)) {
         return dfa.a(bsm.by, $$0, $$1, $$5.c(dfa.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dsk $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ewf((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gc() {
      return this.fI() && this.cB >= 100;
   }

   public int gd() {
      return this.cB;
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

   public int a(Collection<cyk<?>> $$0) {
      return 0;
   }

   public void a(cyk<?> $$0, List<cuc> $$1) {
   }

   public void b(List<akk> $$0) {
   }

   public int b(Collection<cyk<?>> $$0) {
      return 0;
   }

   @Override
   public void fg() {
      super.fg();
      this.a(avr.E);
      if (this.cc()) {
         this.D(0.2F);
      } else {
         this.D(0.05F);
      }
   }

   @Override
   public void a(ewf $$0) {
      if (this.cd() && !this.bS()) {
         double $$1 = this.bM().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bn || !this.dQ().a_(ja.a(this.dv(), this.dx() + 1.0 - 0.1, this.dB())).u().c()) {
            ewf $$3 = this.dt();
            this.i($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cC.b && !this.bS()) {
         double $$4 = this.dt().d;
         super.a($$0);
         ewf $$5 = this.dt();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bl() {
      if (this.cC.b) {
         this.i(false);
      } else {
         super.bl();
      }
   }

   protected boolean h(ja $$0) {
      return !this.dQ().a_($$0).o(this.dQ(), $$0);
   }

   @Override
   public float fk() {
      return (float)this.g(buj.v);
   }

   @Override
   public boolean a(float $$0, float $$1, bqz $$2) {
      if (this.cC.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avr.t, (int)Math.round((double)$$0 * 100.0));
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
      if (!this.aF() && !this.fB() && !this.bf() && !this.b(brq.y)) {
         cuc $$0 = this.a(bsn.e);
         if ($$0.a(cuf.nT) && csy.i($$0)) {
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
   protected void b(ja $$0, dsk $$1) {
      if (this.bf()) {
         this.aU();
         this.b($$1);
      } else {
         ja $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dsk $$3 = this.dQ().a_($$2);
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
   public btb.a eI() {
      return new btb.a(avh.ur, avh.uh);
   }

   @Override
   public boolean a(aqm $$0, btb $$1) {
      this.b(avr.g.b($$1.al()));
      return true;
   }

   @Override
   public void a(dsk $$0, ewf $$1) {
      if (!this.cC.b) {
         super.a($$0, $$1);
      }

      this.gB();
   }

   public void d(int $$0) {
      this.s($$0);
      this.cs = this.cs + (float)$$0 / (float)this.gi();
      this.cr = ayg.a(this.cr + $$0, 0, Integer.MAX_VALUE);

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
   public void a(cuc $$0, int $$1) {
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

      if ($$0 > 0 && this.cq % 5 == 0 && (float)this.cD < (float)this.ai - 100.0F) {
         float $$1 = this.cq > 30 ? 1.0F : (float)this.cq / 30.0F;
         this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.uq, this.df(), $$1 * 0.75F, 1.0F);
         this.cD = this.ai;
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
      if (!this.cC.a) {
         if (!this.dQ().B) {
            this.ce.a($$0);
         }
      }
   }

   public Optional<clq> aa() {
      return Optional.empty();
   }

   public cpd gj() {
      return this.ce;
   }

   public boolean t(boolean $$0) {
      return this.cC.a || $$0 || this.ce.c();
   }

   public boolean gk() {
      return this.ex() > 0.0F && this.ex() < this.eO();
   }

   public boolean gl() {
      return this.cC.e;
   }

   public boolean a(ja $$0, jf $$1, cuc $$2) {
      if (this.cC.e) {
         return true;
      } else {
         ja $$3 = $$0.a($$1.g());
         dso $$4 = new dso(this.dQ(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   protected int eh() {
      if (!this.dQ().ab().b(dcb.d) && !this.N_()) {
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
   protected bsg.b bc() {
      return this.cC.b || this.aF() && this.bZ() ? bsg.b.a : bsg.b.d;
   }

   public void y() {
   }

   @Override
   public wu ag() {
      return wu.b(this.cE.getName());
   }

   public cqu gm() {
      return this.cb;
   }

   @Override
   public cuc a(bsn $$0) {
      if ($$0 == bsn.a) {
         return this.g.f();
      } else if ($$0 == bsn.b) {
         return this.g.j.get(0);
      } else {
         return $$0.a() == bsn.a.b ? this.g.i.get($$0.b()) : cuc.l;
      }
   }

   @Override
   protected boolean b(bsn $$0) {
      return $$0.a() == bsn.a.b;
   }

   @Override
   public void a(bsn $$0, cuc $$1) {
      this.e($$1);
      if ($$0 == bsn.a) {
         this.a($$0, this.g.h.set(this.g.k, $$1), $$1);
      } else if ($$0 == bsn.b) {
         this.a($$0, this.g.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsn.a.b) {
         this.a($$0, this.g.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cuc $$0) {
      return this.g.f($$0);
   }

   @Override
   public Iterable<cuc> eX() {
      return Lists.newArrayList(new cuc[]{this.eU(), this.eV()});
   }

   @Override
   public Iterable<cuc> eW() {
      return this.g.i;
   }

   @Override
   public boolean d(bsn $$0) {
      return $$0 != bsn.g;
   }

   public boolean h(tx $$0) {
      if (this.bS() || !this.aF() || this.bf() || this.aB) {
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
         this.i(new tx());
         this.k(this.gr());
         this.j(new tx());
      }
   }

   private void k(tx $$0) {
      if (!this.dQ().B && !$$0.g()) {
         bsm.a($$0, this.dQ()).ifPresent($$0x -> {
            if ($$0x instanceof bty) {
               ((bty)$$0x).b(this.az);
            }

            $$0x.a_(this.dv(), this.dx() + 0.7F, this.dB());
            ((aqm)this.dQ()).c($$0x);
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
      return !this.cC.b && !this.N_() && super.cd();
   }

   public abstract boolean f();

   @Override
   public boolean cD() {
      return !this.cC.b;
   }

   public exj go() {
      return this.dQ().M();
   }

   @Override
   public wu O_() {
      xi $$0 = exe.a(this.ck(), this.ag());
      return this.a($$0);
   }

   private xi a(xi $$0) {
      String $$1 = this.fY().getName();
      return $$0.a($$1x -> $$1x.a(new ws(ws.a.d, "/tell " + $$1 + " ")).a(this.cK()).a($$1));
   }

   @Override
   public String cC() {
      return this.fY().getName();
   }

   @Override
   protected void C(float $$0) {
      this.aq().a(d, $$0);
   }

   @Override
   public float fp() {
      return this.aq().a(d);
   }

   public boolean a(cml $$0) {
      return (this.aq().a(bX) & $$0.a()) == $$0.a();
   }

   @Override
   public btt a_(int $$0) {
      if ($$0 == 499) {
         return new btt() {
            @Override
            public cuc a() {
               return cmk.this.cd.g();
            }

            @Override
            public boolean a(cuc $$0) {
               cmk.this.cd.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new btt() {
               @Override
               public cuc a() {
                  return cmk.this.cc.r().a($$1);
               }

               @Override
               public boolean a(cuc $$0) {
                  cmk.this.cc.r().a($$1, $$0);
                  cmk.this.cc.a(cmk.this.g);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.g.h.size()) {
            return btt.a(this.g, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.cb.b() ? btt.a(this.cb, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gp() {
      return this.cF;
   }

   public void u(boolean $$0) {
      this.cF = $$0;
   }

   @Override
   public void h(int $$0) {
      super.h(this.cC.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bsv fr() {
      return this.ao.a(bY) == 0 ? bsv.a : bsv.b;
   }

   public void a(bsv $$0) {
      this.ao.a(bY, (byte)($$0 == bsv.a ? 0 : 1));
   }

   public tx gq() {
      return this.ao.a(bZ);
   }

   protected void i(tx $$0) {
      this.ao.a(bZ, $$0);
   }

   public tx gr() {
      return this.ao.a(ca);
   }

   protected void j(tx $$0) {
      this.ao.a(ca, $$0);
   }

   public float gs() {
      return (float)(1.0 / this.g(buj.e) * 20.0);
   }

   public float E(float $$0) {
      return ayg.a(((float)this.aT + $$0) / this.gs(), 0.0F, 1.0F);
   }

   public void gt() {
      this.aT = 0;
   }

   public cty gu() {
      return this.cH;
   }

   @Override
   protected float aO() {
      return !this.cC.b && !this.fB() ? super.aO() : 1.0F;
   }

   public float gv() {
      return (float)this.g(buj.q);
   }

   public boolean gw() {
      return this.cC.d && this.F() >= 2;
   }

   @Override
   public boolean f(cuc $$0) {
      bsn $$1 = btd.h($$0);
      return this.a($$1).e();
   }

   @Override
   public bsj e(btn $$0) {
      return c.getOrDefault($$0, bW);
   }

   @Override
   public ImmutableList<btn> fF() {
      return ImmutableList.of(btn.a, btn.f, btn.d);
   }

   @Override
   public cuc g(cuc $$0) {
      if (!($$0.g() instanceof cuv)) {
         return cuc.l;
      } else {
         Predicate<cuc> $$1 = ((cuv)$$0.g()).d();
         cuc $$2 = cuv.a(this, $$1);
         if (!$$2.e()) {
            return $$2;
         } else {
            $$1 = ((cuv)$$0.g()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cuc $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cC.d ? new cuc(cuf.ow) : cuc.l;
         }
      }
   }

   @Override
   public cuc a(dcf $$0, cuc $$1, cpe $$2) {
      this.gj().a($$2);
      this.b(avr.c.b($$1.g()));
      $$0.a(null, this.dv(), this.dx(), this.dB(), avh.uj, avi.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof aqn) {
         am.A.a((aqn)this, $$1);
      }

      cuc $$3 = super.a($$0, $$1, $$2);
      Optional<cuc> $$4 = $$2.f();
      if ($$4.isPresent() && !this.fM()) {
         if ($$3.e()) {
            return $$4.get().s();
         }

         this.fZ().f($$4.get().s());
      }

      return $$3;
   }

   @Override
   public ewf r(float $$0) {
      double $$1 = 0.22 * (this.fr() == bsv.b ? -1.0 : 1.0);
      float $$2 = ayg.i($$0 * 0.5F, this.dI(), this.P) * (float) (Math.PI / 180.0);
      float $$3 = ayg.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      if (this.fB() || this.fo()) {
         ewf $$4 = this.g($$0);
         ewf $$5 = this.dt();
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

         return this.m($$0).e(new ewf($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ce()) {
         return this.m($$0).e(new ewf($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cL().c() - 1.0;
         double $$13 = this.cb() ? -0.2 : 0.07;
         return this.m($$0).e(new ewf($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dP() {
      return true;
   }

   public boolean gx() {
      return this.fs() && this.fu().a(cuf.qX);
   }

   @Override
   public boolean dO() {
      return false;
   }

   public Optional<ji> gy() {
      return this.cI;
   }

   public void a(Optional<ji> $$0) {
      this.cI = $$0;
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
      if (this.cC.b && !this.bS()) {
         return this.cc() ? this.cC.a() * 2.0F : this.cC.a();
      } else {
         return this.cc() ? 0.025999999F : 0.02F;
      }
   }

   public double gz() {
      return this.g(buj.g);
   }

   public double gA() {
      return this.g(buj.j);
   }

   public boolean b(bsg $$0, double $$1) {
      return $$0.dL() ? false : this.a($$0.cL(), $$1);
   }

   public boolean a(ewa $$0, double $$1) {
      double $$2 = this.gA() + $$1;
      return $$0.e(this.by()) < $$2 * $$2;
   }

   public boolean a(ja $$0, double $$1) {
      double $$2 = this.gz() + $$1;
      return new ewa($$0).e(this.by()) < $$2 * $$2;
   }

   public void gB() {
      this.cy = null;
      this.cx = null;
      this.cz = false;
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
