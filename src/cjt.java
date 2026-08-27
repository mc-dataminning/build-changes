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

public abstract class cjt extends bqo {
   private static final Logger b = LogUtils.getLogger();
   public static final bqi bE = bqi.b;
   public static final int bF = 0;
   public static final int bG = 20;
   public static final int bH = 100;
   public static final int bI = 10;
   public static final int bJ = 200;
   public static final float bK = 4.5F;
   public static final float bL = 3.0F;
   public static final float bM = 1.5F;
   public static final float bN = 0.6F;
   public static final float bO = 0.6F;
   public static final float bP = 1.62F;
   public static final esa bQ = new esa(0.0, 0.6, 0.0);
   public static final bpy bR = bpy.b(0.6F, 1.8F).b(1.62F).a(bpx.a().a(bpw.b, bQ));
   private static final Map<bqz, bpy> c = ImmutableMap.builder()
      .put(bqz.a, bR)
      .put(bqz.c, aF)
      .put(bqz.b, bpy.b(0.6F, 0.6F).b(0.4F))
      .put(bqz.d, bpy.b(0.6F, 0.6F).b(0.4F))
      .put(bqz.e, bpy.b(0.6F, 0.6F).b(0.4F))
      .put(bqz.f, bpy.b(0.6F, 1.5F).b(1.27F).a(bpx.a().a(bpw.b, bQ)))
      .put(bqz.h, bpy.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final aiy<Float> d = ajc.a(cjt.class, aja.d);
   private static final aiy<Integer> e = ajc.a(cjt.class, aja.b);
   protected static final aiy<Byte> bS = ajc.a(cjt.class, aja.a);
   protected static final aiy<Byte> bT = ajc.a(cjt.class, aja.a);
   protected static final aiy<tm> bU = ajc.a(cjt.class, aja.s);
   protected static final aiy<tm> bV = ajc.a(cjt.class, aja.s);
   private long f;
   private final cjs g = new cjs(this);
   protected cob bW = new cob();
   public final cnq bX;
   public cmp bY;
   protected cml bZ = new cml();
   protected int ca;
   public float cb;
   public float cc;
   public int cd;
   public double ce;
   public double cf;
   public double cg;
   public double ch;
   public double ci;
   public double cj;
   private int ct;
   protected boolean ck;
   private final cjq cu = new cjq();
   public int cl;
   public int cm;
   public float cn;
   protected int co;
   protected final float cp = 0.02F;
   private int cv;
   private final GameProfile cw;
   private boolean cx;
   private crj cz = crj.i;
   private final crf cA = this.k();
   private Optional<ik> cB = Optional.empty();
   @Nullable
   public ckh cq;
   protected float cr;
   @Nullable
   public Double cs;

   public cjt(cyx $$0, ib $$1, float $$2, GameProfile $$3) {
      super(bqb.bx, $$0);
      this.a_($$3.getId());
      this.cw = $$3;
      this.bX = new cnq(this.g, !$$0.B, this);
      this.bY = this.bX;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bj = 180.0F;
   }

   public boolean a(cyx $$0, ib $$1, cyu $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cyu.d) {
         return true;
      } else if (this.gl()) {
         return false;
      } else {
         crj $$3 = this.eU();
         return $$3.d() || !$$3.b(new dpd($$0, $$1, false));
      }
   }

   public static bru.a fN() {
      return bqo.dR().a(brv.c, 1.0).a(brv.r, 0.1F).a(brv.e).a(brv.o).a(brv.g, 4.5).a(brv.h, 3.0).a(brv.f);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(d, 0.0F);
      $$0.a(e, 0);
      $$0.a(bS, (byte)0);
      $$0.a(bT, (byte)bE.a());
      $$0.a(bU, new tm());
      $$0.a(bV, new tm());
   }

   @Override
   public void l() {
      this.af = this.N_();
      if (this.N_()) {
         this.c(false);
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (this.fI()) {
         this.ct++;
         if (this.ct > 100) {
            this.ct = 100;
         }

         if (!this.dM().B && this.dM().Q()) {
            this.a(false, true);
         }
      } else if (this.ct > 0) {
         this.ct++;
         if (this.ct >= 110) {
            this.ct = 0;
         }
      }

      this.fR();
      super.l();
      if (!this.dM().B && this.bY != null && !this.bY.a(this)) {
         this.r();
         this.bY = this.bX;
      }

      this.v();
      if (!this.dM().B) {
         this.bZ.a(this);
         this.a(auw.k);
         this.a(auw.l);
         if (this.bA()) {
            this.a(auw.m);
         }

         if (this.bV()) {
            this.a(auw.o);
         }

         if (!this.fI()) {
            this.a(auw.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = axk.a(this.dr(), -2.9999999E7, 2.9999999E7);
      double $$2 = axk.a(this.dx(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dr() || $$2 != this.dx()) {
         this.a_($$1, this.dt(), $$2);
      }

      this.aS++;
      crj $$3 = this.eU();
      if (!crj.a(this.cz, $$3)) {
         if (!crj.b(this.cz, $$3)) {
            this.gt();
         }

         this.cz = $$3.r();
      }

      this.u();
      this.cA.a();
      this.fS();
   }

   @Override
   protected float fl() {
      return this.fz() ? 15.0F : super.fl();
   }

   public boolean fO() {
      return this.bS();
   }

   protected boolean fP() {
      return this.bS();
   }

   protected boolean fQ() {
      return this.bS();
   }

   protected boolean fR() {
      this.ck = this.a(avh.a);
      return this.ck;
   }

   private void u() {
      crj $$0 = this.d(bqc.f);
      if ($$0.a(crm.on) && !this.a(avh.a)) {
         this.b(new bph(bpj.m, 200, 0, false, false, true));
      }
   }

   protected crf k() {
      return new crf();
   }

   private void v() {
      this.ce = this.ch;
      this.cf = this.ci;
      this.cg = this.cj;
      double $$0 = this.dr() - this.ch;
      double $$1 = this.dt() - this.ci;
      double $$2 = this.dx() - this.cj;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.ch = this.dr();
         this.ce = this.ch;
      }

      if ($$2 > 10.0) {
         this.cj = this.dx();
         this.cg = this.cj;
      }

      if ($$1 > 10.0) {
         this.ci = this.dt();
         this.cf = this.ci;
      }

      if ($$0 < -10.0) {
         this.ch = this.dr();
         this.ce = this.ch;
      }

      if ($$2 < -10.0) {
         this.cj = this.dx();
         this.cg = this.cj;
      }

      if ($$1 < -10.0) {
         this.ci = this.dt();
         this.cf = this.ci;
      }

      this.ch += $$0 * 0.25;
      this.cj += $$2 * 0.25;
      this.ci += $$1 * 0.25;
   }

   protected void fS() {
      if (this.h(bqz.d)) {
         bqz $$0;
         if (this.fB()) {
            $$0 = bqz.b;
         } else if (this.fI()) {
            $$0 = bqz.c;
         } else if (this.bZ()) {
            $$0 = bqz.d;
         } else if (this.fo()) {
            $$0 = bqz.e;
         } else if (this.bS() && !this.cu.b) {
            $$0 = bqz.f;
         } else {
            $$0 = bqz.a;
         }

         bqz $$6;
         if (this.N_() || this.bO() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bqz.f)) {
            $$6 = bqz.f;
         } else {
            $$6 = bqz.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bqz $$0) {
      return this.dM().a(this, this.a($$0).a(this.dk()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dM().aa().c(this.cu.a ? cyt.F : cyt.E));
   }

   @Override
   protected aul aN() {
      return aum.tY;
   }

   @Override
   protected aul aO() {
      return aum.tW;
   }

   @Override
   protected aul aP() {
      return aum.tX;
   }

   @Override
   public int bM() {
      return 10;
   }

   @Override
   public void a(aul $$0, float $$1, float $$2) {
      this.dM().a(this, this.dr(), this.dt(), this.dx(), $$0, this.db(), $$1, $$2);
   }

   public void a(aul $$0, aun $$1, float $$2, float $$3) {
   }

   @Override
   public aun db() {
      return aun.h;
   }

   @Override
   protected int dc() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.x();
      } else if ($$0 == 23) {
         this.cx = false;
      } else if ($$0 == 22) {
         this.cx = true;
      } else if ($$0 == 43) {
         this.a(kl.f);
      } else {
         super.b($$0);
      }
   }

   private void a(kj $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ag.k() * 0.02;
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         this.dM().a($$0, this.d(1.0), this.du() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected void r() {
      this.bY = this.bX;
   }

   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dM().B && this.fP() && this.bO()) {
         this.ac();
         this.f(false);
      } else {
         super.t();
         this.cb = this.cc;
         this.cc = 0.0F;
      }
   }

   @Override
   protected void fn() {
      super.fn();
      this.eS();
      this.aZ = this.dC();
   }

   @Override
   public void n_() {
      if (this.ca > 0) {
         this.ca--;
      }

      if (this.dM().ak() == bnx.a && this.dM().aa().b(cyt.k)) {
         if (this.ex() < this.eO() && this.ah % 20 == 0) {
            this.c(1.0F);
         }

         if (this.bZ.c() && this.ah % 10 == 0) {
            this.bZ.a(this.bZ.a() + 1);
         }
      }

      this.g.j();
      this.cb = this.cc;
      super.n_();
      this.y((float)this.g(brv.r));
      float $$1;
      if (this.aC() && !this.ey() && !this.bZ()) {
         $$1 = Math.min(0.1F, (float)this.dp().h());
      } else {
         $$1 = 0.0F;
      }

      this.cc = this.cc + ($$1 - this.cc) * 0.4F;
      if (this.ex() > 0.0F && !this.N_()) {
         erv $$2;
         if (this.bO() && !this.cZ().dH()) {
            $$2 = this.cH().b(this.cZ().cH()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cH().c(1.0, 0.5, 1.0);
         }

         List<bpv> $$4 = this.dM().a_(this, $$2);
         List<bpv> $$5 = Lists.newArrayList();

         for (bpv $$6 : $$4) {
            if ($$6.ai() == bqb.M) {
               $$5.add($$6);
            } else if (!$$6.dH()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ac.a($$5, this.ag));
         }
      }

      this.c(this.gq());
      this.c(this.gr());
      if (!this.dM().B && (this.ab > 0.5F || this.bc()) || this.cu.b || this.fI() || this.aA) {
         this.gn();
      }
   }

   private void c(@Nullable tm $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dM().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bqb.a($$1).filter($$0x -> $$0x == bqb.aw).ifPresent($$0x -> {
            if (!cct.a(this.dM(), this)) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), cct.a(this.dM(), this.dM().z), this.db(), 1.0F, cct.a(this.dM().z));
            }
         });
      }
   }

   private void d(bpv $$0) {
      $$0.b_(this);
   }

   public int fT() {
      return this.an.a(e);
   }

   public void s(int $$0) {
      this.an.a(e, $$0);
   }

   public void t(int $$0) {
      int $$1 = this.fT();
      this.an.a(e, $$1 + $$0);
   }

   public void u(int $$0) {
      this.bB = $$0;
      if (!this.dM().B) {
         this.gn();
         this.c(4, true);
      }
   }

   @Override
   public void a(bot $$0) {
      super.a($$0);
      this.ar();
      if (!this.N_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-axk.b((this.eG() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-axk.a((this.eG() + this.dC()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(auw.N);
      this.a(auw.i.b(auw.m));
      this.a(auw.i.b(auw.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(ik.a(this.dM().ae(), this.dm())));
   }

   @Override
   protected void eA() {
      super.eA();
      if (!this.dM().aa().b(cyt.d)) {
         this.fU();
         this.g.k();
      }
   }

   protected void fU() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         crj $$1 = this.g.a($$0);
         if (!$$1.d() && cwr.f($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected aul d(bot $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected aul o_() {
      return aum.tO;
   }

   @Nullable
   public cgd a(crj $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cgd a(crj $$0, boolean $$1, boolean $$2) {
      if ($$0.d()) {
         return null;
      } else {
         if (this.dM().B) {
            this.a(bnz.a);
         }

         double $$3 = this.dv() - 0.3F;
         cgd $$4 = new cgd(this.dM(), this.dr(), $$3, this.dx(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.ag.i() * 0.5F;
            float $$6 = this.ag.i() * (float) (Math.PI * 2);
            $$4.o((double)(-axk.a($$6) * $$5), 0.2F, (double)(axk.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = axk.a(this.dE() * (float) (Math.PI / 180.0));
            float $$9 = axk.b(this.dE() * (float) (Math.PI / 180.0));
            float $$10 = axk.a(this.dC() * (float) (Math.PI / 180.0));
            float $$11 = axk.b(this.dC() * (float) (Math.PI / 180.0));
            float $$12 = this.ag.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.ag.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.ag.i() - this.ag.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(doz $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cwr.g(this);
         crj $$3 = this.eU();
         if ($$2 > 0 && !$$3.d()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bpi.a(this)) {
         $$1 *= 1.0F + (float)(bpi.b(this) + 1) * 0.2F;
      }

      if (this.b(bpj.d)) {
         $$1 *= switch (this.c(bpj.d).d()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(brv.f);
      if (this.a(avh.a) && !cwr.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(doz $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a_(this.cw.getId());
      ts $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.l = $$0.h("SelectedItemSlot");
      this.ct = $$0.g("SleepTimer");
      this.cn = $$0.j("XpP");
      this.cl = $$0.h("XpLevel");
      this.cm = $$0.h("XpTotal");
      this.co = $$0.h("XpSeed");
      if (this.co == 0) {
         this.co = this.ag.f();
      }

      this.s($$0.h("Score"));
      this.bZ.a($$0);
      this.cu.b($$0);
      this.f(brv.r).a((double)this.cu.b());
      if ($$0.b("EnderItems", 9)) {
         this.bW.a($$0.c("EnderItems", 10), this.dO());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(ik.b.parse(ua.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("ignore_fall_damage_above_y", 6)) {
         this.cs = $$0.k("ignore_fall_damage_above_y");
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      ub.f($$0);
      $$0.a("Inventory", this.g.a(new ts()));
      $$0.a("SelectedItemSlot", this.g.l);
      $$0.a("SleepTimer", (short)this.ct);
      $$0.a("XpP", this.cn);
      $$0.a("XpLevel", this.cl);
      $$0.a("XpTotal", this.cm);
      $$0.a("XpSeed", this.co);
      $$0.a("Score", this.fT());
      this.bZ.b($$0);
      this.cu.a($$0);
      $$0.a("EnderItems", this.bW.a(this.dO()));
      if (!this.gq().g()) {
         $$0.a("ShoulderEntityLeft", this.gq());
      }

      if (!this.gr().g()) {
         $$0.a("ShoulderEntityRight", this.gr());
      }

      this.gy().flatMap($$0x -> ik.b.encodeStart(ua.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cs != null) {
         $$0.a("ignore_fall_damage_above_y", this.cs);
      }
   }

   @Override
   public boolean b(bot $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(ave.o)) {
         return !this.dM().aa().b(cyt.G);
      } else if ($$0.a(ave.n)) {
         return !this.dM().aa().b(cyt.H);
      } else if ($$0.a(ave.j)) {
         return !this.dM().aa().b(cyt.I);
      } else {
         return $$0.a(ave.p) ? !this.dM().aa().b(cyt.J) : false;
      }
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cu.a && !$$0.a(ave.e)) {
         return false;
      } else {
         this.be = 0;
         if (this.ey()) {
            return false;
         } else {
            if (!this.dM().B) {
               this.gn();
            }

            if ($$0.f()) {
               if (this.dM().ak() == bnx.a) {
                  $$1 = 0.0F;
               }

               if (this.dM().ak() == bnx.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dM().ak() == bnx.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bqo $$0) {
      super.d($$0);
      if ($$0.fL()) {
         this.fV();
      }
   }

   @Override
   public boolean eq() {
      return !this.ga().a && super.eq();
   }

   public boolean a(cjt $$0) {
      etg $$1 = this.cg();
      etg $$2 = $$0.cg();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bot $$0, float $$1) {
      this.a($$0, $$1, new bqc[]{bqc.c, bqc.d, bqc.e, bqc.f});
   }

   @Override
   protected void c(bot $$0, float $$1) {
      this.a($$0, $$1, new bqc[]{bqc.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.by.a(crm.vq)) {
         if (!this.dM().B) {
            this.b(auw.c.b(this.by.f()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + axk.d($$0);
            bnz $$2 = this.ft();
            this.by.a($$1, this, d($$2));
            if (this.by.d()) {
               if ($$2 == bnz.a) {
                  this.a(bqc.a, crj.i);
               } else {
                  this.a(bqc.b, crj.i);
               }

               this.by = crj.i;
               this.a(aum.wi, 0.8F, 0.8F + this.dM().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bot $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fp(), 0.0F);
         this.A(this.fp() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(auw.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eM().a($$0, var7);
            this.t(this.ex() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(auw.J, Math.round(var7 * 10.0F));
            }

            this.a(dts.o);
         }
      }
   }

   @Override
   protected boolean dV() {
      return !this.cu.b && super.dV();
   }

   public boolean Y() {
      return false;
   }

   public void a(dnp $$0, boolean $$1) {
   }

   public void a(cxy $$0) {
   }

   public void a(dmp $$0) {
   }

   public void a(dnu $$0) {
   }

   public void a(dnf $$0) {
   }

   public void a(cef $$0, bnt $$1) {
   }

   public OptionalInt a(@Nullable boe $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cxw $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(crj $$0, bnz $$1) {
   }

   public boa a(bpv $$0, bnz $$1) {
      if (this.N_()) {
         if ($$0 instanceof boe) {
            this.a((boe)$$0);
         }

         return boa.d;
      } else {
         crj $$2 = this.b($$1);
         crj $$3 = $$2.r();
         boa $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cu.d && $$2 == this.b($$1) && $$2.G() < $$3.G()) {
               $$2.e($$3.G());
            }

            return $$4;
         } else {
            if (!$$2.d() && $$0 instanceof bqo) {
               if (this.cu.d) {
                  $$2 = $$3;
               }

               boa $$5 = $$2.a(this, (bqo)$$0, $$1);
               if ($$5.a()) {
                  this.dM().a(dts.r, $$0.dk(), dts.a.a(this));
                  if ($$2.d() && !this.cu.d) {
                     this.a($$1, crj.i);
                  }

                  return $$5;
               }
            }

            return boa.d;
         }
      }
   }

   @Override
   public void bF() {
      super.bF();
      this.J = 0;
   }

   @Override
   protected boolean fd() {
      return super.fd() || this.fI();
   }

   @Override
   public boolean ec() {
      return !this.cu.b;
   }

   @Override
   protected esa a(esa $$0, bqt $$1) {
      if (!this.cu.b && $$0.d <= 0.0 && ($$1 == bqt.a || $$1 == bqt.b) && this.fQ() && this.z()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dM().a(this, this.cH().d($$2, (double)(-this.dG()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dM().a(this, this.cH().d(0.0, (double)(-this.dG()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dM().a(this, this.cH().d($$2, (double)(-this.dG()), $$3))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }

            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         $$0 = new esa($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean z() {
      return this.aC() || this.ab < this.dG() && !this.dM().a(this, this.cH().d(0.0, (double)(this.ab - this.dG()), 0.0));
   }

   public void e(bpv $$0) {
      if ($$0.cq()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(brv.c);
            float $$2 = cwr.a(this.eU(), $$0.ai());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gt();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += cwr.c(this);
               if (this.bY() && $$4) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.tG, this.db(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               boolean $$7 = $$4 && this.ab > 0.0F && !this.aC() && !this.q_() && !this.bc() && !this.b(bpj.o) && !this.bO() && $$0 instanceof bqo;
               $$7 = $$7 && !this.bY();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.Y - this.X);
               if ($$4 && !$$7 && !$$5 && this.aC() && $$9 < (double)this.fk()) {
                  crj $$10 = this.b(bnz.a);
                  if ($$10.f() instanceof cst) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = cwr.d(this);
               if ($$0 instanceof bqo) {
                  $$11 = ((bqo)$$0).ex();
                  if ($$13 > 0 && !$$0.bN()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               esa $$14 = $$0.dp();
               boolean $$15 = $$0.a(this.dN().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof bqo) {
                        ((bqo)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)axk.a(this.dC() * (float) (Math.PI / 180.0)),
                              (double)(-axk.b(this.dC() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-axk.a(this.dC() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(axk.b(this.dC() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.dp().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + cwr.a(this) * $$1;

                     for (bqo $$18 : this.dM().a(bqo.class, $$0.cH().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.s($$18) && (!($$18 instanceof cft) || !((cft)$$18).z()) && this.g((bpv)$$18) < 9.0) {
                           $$18.q(0.4F, (double)axk.a(this.dC() * (float) (Math.PI / 180.0)), (double)(-axk.b(this.dC() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dN().a(this), $$16);
                        }
                     }

                     this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.tJ, this.db(), 1.0F, 1.0F);
                     this.fW();
                  }

                  if ($$0 instanceof apt && $$0.T) {
                     ((apt)$$0).d.b(new aee($$0));
                     $$0.T = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.tF, this.db(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.tI, this.db(), 1.0F, 1.0F);
                     } else {
                        this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.tK, this.db(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bqo) {
                     cwr.a((bqo)$$0, this);
                  }

                  cwr.b(this, $$0);
                  crj $$19 = this.eU();
                  bpv $$20 = $$0;
                  if ($$0 instanceof cev) {
                     $$20 = ((cev)$$0).b;
                  }

                  if (!this.dM().B && !$$19.d() && $$20 instanceof bqo) {
                     $$19.a((bqo)$$20, this);
                     if ($$19.d()) {
                        this.a(bnz.a, crj.i);
                     }
                  }

                  if ($$0 instanceof bqo) {
                     float $$21 = $$11 - ((bqo)$$0).ex();
                     this.a(auw.G, Math.round($$21 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dM() instanceof aps && $$21 > 2.0F) {
                        int $$22 = (int)((double)$$21 * 0.5);
                        ((aps)this.dM()).a(kl.h, $$0.dr(), $$0.e(0.5), $$0.dx(), $$22, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.C(0.1F);
               } else {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.tH, this.db(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(bqo $$0) {
      this.e($$0);
   }

   public void fV() {
      this.gu().a(crm.vq, 100);
      this.fy();
      this.dM().a(this, (byte)30);
   }

   @Override
   public void b(bpv $$0) {
   }

   public void c(bpv $$0) {
   }

   public void fW() {
      double $$0 = (double)(-axk.a(this.dC() * (float) (Math.PI / 180.0)));
      double $$1 = (double)axk.b(this.dC() * (float) (Math.PI / 180.0));
      if (this.dM() instanceof aps) {
         ((aps)this.dM()).a(kl.ah, this.dr() + $$0, this.e(0.5), this.dx() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fX() {
   }

   @Override
   public void a(bpv.c $$0) {
      super.a($$0);
      this.bX.b(this);
      if (this.bY != null && this.gb()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fY() {
      return this.cw;
   }

   public cjs fZ() {
      return this.g;
   }

   public cjq ga() {
      return this.cu;
   }

   @Override
   public boolean fM() {
      return this.cu.d;
   }

   public void a(crj $$0, crj $$1, cmx $$2) {
   }

   public boolean gb() {
      return this.bY != this.bX;
   }

   public Either<cjt.a, aym> a(ib $$0) {
      this.b($$0);
      this.ct = 0;
      return Either.right(aym.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fJ();
      if (this.dM() instanceof aps && $$1) {
         ((aps)this.dM()).e();
      }

      this.ct = $$0 ? 0 : 100;
   }

   @Override
   public void fJ() {
      this.a(true, true);
   }

   public static Optional<esa> a(aps $$0, ib $$1, float $$2, boolean $$3, boolean $$4) {
      doz $$5 = $$0.a_($$1);
      dby $$6 = $$5.b();
      if ($$6 instanceof dif && ($$3 || $$5.c(dif.d) > 0) && dif.a($$0)) {
         Optional<esa> $$7 = dif.a(bqb.bx, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dif.d, Integer.valueOf($$5.c(dif.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof dbr && dbr.a($$0)) {
         return dbr.a(bqb.bx, $$0, $$1, $$5.c(dbr.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         doz $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new esa((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean gc() {
      return this.fI() && this.ct >= 100;
   }

   public int gd() {
      return this.ct;
   }

   public void a(wg $$0, boolean $$1) {
   }

   public void a(ajt $$0) {
      this.b(auw.i.b($$0));
   }

   public void a(ajt $$0, int $$1) {
      this.a(auw.i.b($$0), $$1);
   }

   public void b(aut<?> $$0) {
      this.a($$0, 1);
   }

   public void a(aut<?> $$0, int $$1) {
   }

   public void a(aut<?> $$0) {
   }

   public int a(Collection<cvl<?>> $$0) {
      return 0;
   }

   public void a(cvl<?> $$0, List<crj> $$1) {
   }

   public void b(List<ajt> $$0) {
   }

   public int b(Collection<cvl<?>> $$0) {
      return 0;
   }

   @Override
   public void fg() {
      super.fg();
      this.a(auw.E);
      if (this.bY()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }
   }

   @Override
   public void a(esa $$0) {
      if (this.bZ() && !this.bO()) {
         double $$1 = this.bI().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bm || !this.dM().a_(ib.a(this.dr(), this.dt() + 1.0 - 0.1, this.dx())).u().c()) {
            esa $$3 = this.dp();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cu.b && !this.bO()) {
         double $$4 = this.dp().d;
         super.a($$0);
         esa $$5 = this.dp();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bi() {
      if (this.cu.b) {
         this.h(false);
      } else {
         super.bi();
      }
   }

   protected boolean h(ib $$0) {
      return !this.dM().a_($$0).o(this.dM(), $$0);
   }

   @Override
   public float fk() {
      return (float)this.g(brv.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bot $$2) {
      if (this.cu.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(auw.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cs != null) {
            float $$3 = this.cs.floatValue();
            this.cs = null;
            return (double)$$3 < this.dt() ? false : super.a($$3 - (float)this.dt(), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean ge() {
      if (!this.aC() && !this.fB() && !this.bc() && !this.b(bpj.y)) {
         crj $$0 = this.d(bqc.e);
         if ($$0.a(crm.nS) && cqf.j($$0)) {
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
   protected void bl() {
      if (!this.N_()) {
         super.bl();
      }
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      if (this.bc()) {
         this.aR();
         this.b($$1);
      } else {
         ib $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            doz $$3 = this.dM().a_($$2);
            if ($$3.a(avc.bo)) {
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
   public bqo.a eI() {
      return new bqo.a(aum.tV, aum.tL);
   }

   @Override
   public boolean a(aps $$0, bqo $$1) {
      this.b(auw.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(doz $$0, esa $$1) {
      if (!this.cu.b) {
         super.a($$0, $$1);
      }

      this.cs = null;
   }

   public void d(int $$0) {
      this.t($$0);
      this.cn = this.cn + (float)$$0 / (float)this.gi();
      this.cm = axk.a(this.cm + $$0, 0, Integer.MAX_VALUE);

      while (this.cn < 0.0F) {
         float $$1 = this.cn * (float)this.gi();
         if (this.cl > 0) {
            this.c(-1);
            this.cn = 1.0F + $$1 / (float)this.gi();
         } else {
            this.c(-1);
            this.cn = 0.0F;
         }
      }

      while (this.cn >= 1.0F) {
         this.cn = (this.cn - 1.0F) * (float)this.gi();
         this.c(1);
         this.cn = this.cn / (float)this.gi();
      }
   }

   public int gh() {
      return this.co;
   }

   @Override
   public void a(crj $$0, int $$1) {
      this.cl -= $$1;
      if (this.cl < 0) {
         this.cl = 0;
         this.cn = 0.0F;
         this.cm = 0;
      }

      this.co = this.ag.f();
   }

   public void c(int $$0) {
      this.cl += $$0;
      if (this.cl < 0) {
         this.cl = 0;
         this.cn = 0.0F;
         this.cm = 0;
      }

      if ($$0 > 0 && this.cl % 5 == 0 && (float)this.cv < (float)this.ah - 100.0F) {
         float $$1 = this.cl > 30 ? 1.0F : (float)this.cl / 30.0F;
         this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.tU, this.db(), $$1 * 0.75F, 1.0F);
         this.cv = this.ah;
      }
   }

   public int gi() {
      if (this.cl >= 30) {
         return 112 + (this.cl - 30) * 9;
      } else {
         return this.cl >= 15 ? 37 + (this.cl - 15) * 5 : 7 + this.cl * 2;
      }
   }

   public void C(float $$0) {
      if (!this.cu.a) {
         if (!this.dM().B) {
            this.bZ.a($$0);
         }
      }
   }

   public Optional<ciz> aa() {
      return Optional.empty();
   }

   public cml gj() {
      return this.bZ;
   }

   public boolean s(boolean $$0) {
      return this.cu.a || $$0 || this.bZ.c();
   }

   public boolean gk() {
      return this.ex() > 0.0F && this.ex() < this.eO();
   }

   public boolean gl() {
      return this.cu.e;
   }

   public boolean a(ib $$0, ih $$1, crj $$2) {
      if (this.cu.e) {
         return true;
      } else {
         ib $$3 = $$0.a($$1.g());
         dpd $$4 = new dpd(this.dM(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int eg() {
      if (!this.dM().aa().b(cyt.d) && !this.N_()) {
         int $$0 = this.cl * 7;
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
   public boolean cC() {
      return true;
   }

   @Override
   protected bpv.b aZ() {
      return this.cu.b || this.aC() && this.bV() ? bpv.b.a : bpv.b.d;
   }

   public void y() {
   }

   @Override
   public wg ad() {
      return wg.b(this.cw.getName());
   }

   public cob gm() {
      return this.bW;
   }

   @Override
   public crj d(bqc $$0) {
      if ($$0 == bqc.a) {
         return this.g.f();
      } else if ($$0 == bqc.b) {
         return this.g.k.get(0);
      } else {
         return $$0.a() == bqc.a.b ? this.g.j.get($$0.b()) : crj.i;
      }
   }

   @Override
   protected boolean a(bqc $$0) {
      return $$0.a() == bqc.a.b;
   }

   @Override
   public void a(bqc $$0, crj $$1) {
      this.e($$1);
      if ($$0 == bqc.a) {
         this.a($$0, this.g.i.set(this.g.l, $$1), $$1);
      } else if ($$0 == bqc.b) {
         this.a($$0, this.g.k.set(0, $$1), $$1);
      } else if ($$0.a() == bqc.a.b) {
         this.a($$0, this.g.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(crj $$0) {
      return this.g.e($$0);
   }

   @Override
   public Iterable<crj> eX() {
      return Lists.newArrayList(new crj[]{this.eU(), this.eV()});
   }

   @Override
   public Iterable<crj> eW() {
      return this.g.j;
   }

   @Override
   public boolean c(bqc $$0) {
      return $$0 != bqc.g;
   }

   public boolean h(tm $$0) {
      if (this.bO() || !this.aC() || this.bc() || this.aA) {
         return false;
      } else if (this.gq().g()) {
         this.i($$0);
         this.f = this.dM().Y();
         return true;
      } else if (this.gr().g()) {
         this.j($$0);
         this.f = this.dM().Y();
         return true;
      } else {
         return false;
      }
   }

   protected void gn() {
      if (this.f + 20L < this.dM().Y()) {
         this.k(this.gq());
         this.i(new tm());
         this.k(this.gr());
         this.j(new tm());
      }
   }

   private void k(tm $$0) {
      if (!this.dM().B && !$$0.g()) {
         bqb.a($$0, this.dM()).ifPresent($$0x -> {
            if ($$0x instanceof brk) {
               ((brk)$$0x).b(this.ay);
            }

            $$0x.a_(this.dr(), this.dt() + 0.7F, this.dx());
            ((aps)this.dM()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean N_();

   @Override
   public boolean bv() {
      return !this.N_() && super.bv();
   }

   @Override
   public boolean bZ() {
      return !this.cu.b && !this.N_() && super.bZ();
   }

   public abstract boolean f();

   @Override
   public boolean cz() {
      return !this.cu.b;
   }

   public ete go() {
      return this.dM().L();
   }

   @Override
   public wg O_() {
      wu $$0 = esz.a(this.cg(), this.ad());
      return this.a($$0);
   }

   private wu a(wu $$0) {
      String $$1 = this.fY().getName();
      return $$0.a($$1x -> $$1x.a(new we(we.a.d, "/tell " + $$1 + " ")).a(this.cG()).a($$1));
   }

   @Override
   public String cy() {
      return this.fY().getName();
   }

   @Override
   protected void B(float $$0) {
      this.an().a(d, $$0);
   }

   @Override
   public float fp() {
      return this.an().a(d);
   }

   public boolean a(cju $$0) {
      return (this.an().a(bS) & $$0.a()) == $$0.a();
   }

   @Override
   public brf a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.g.i.size()) {
         return brf.a(this.g, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bW.b() ? brf.a(this.bW, $$1) : super.a_($$0);
      }
   }

   public boolean gp() {
      return this.cx;
   }

   public void t(boolean $$0) {
      this.cx = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cu.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bqi fr() {
      return this.an.a(bT) == 0 ? bqi.a : bqi.b;
   }

   public void a(bqi $$0) {
      this.an.a(bT, (byte)($$0 == bqi.a ? 0 : 1));
   }

   public tm gq() {
      return this.an.a(bU);
   }

   protected void i(tm $$0) {
      this.an.a(bU, $$0);
   }

   public tm gr() {
      return this.an.a(bV);
   }

   protected void j(tm $$0) {
      this.an.a(bV, $$0);
   }

   public float gs() {
      return (float)(1.0 / this.g(brv.e) * 20.0);
   }

   public float D(float $$0) {
      return axk.a(((float)this.aS + $$0) / this.gs(), 0.0F, 1.0F);
   }

   public void gt() {
      this.aS = 0;
   }

   public crf gu() {
      return this.cA;
   }

   @Override
   protected float aL() {
      return !this.cu.b && !this.fB() ? super.aL() : 1.0F;
   }

   public float gv() {
      return (float)this.g(brv.o);
   }

   public boolean gw() {
      return this.cu.d && this.F() >= 2;
   }

   @Override
   public boolean f(crj $$0) {
      bqc $$1 = bqq.h($$0);
      return this.d($$1).d();
   }

   @Override
   public bpy e(bqz $$0) {
      return c.getOrDefault($$0, bR);
   }

   @Override
   public ImmutableList<bqz> fF() {
      return ImmutableList.of(bqz.a, bqz.f, bqz.d);
   }

   @Override
   public crj g(crj $$0) {
      if (!($$0.f() instanceof crz)) {
         return crj.i;
      } else {
         Predicate<crj> $$1 = ((crz)$$0.f()).d();
         crj $$2 = crz.a(this, $$1);
         if (!$$2.d()) {
            return $$2;
         } else {
            $$1 = ((crz)$$0.f()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               crj $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cu.d ? new crj(crm.ou) : crj.i;
         }
      }
   }

   @Override
   public crj a(cyx $$0, crj $$1) {
      this.gj().a($$1.f(), $$1);
      this.b(auw.c.b($$1.f()));
      $$0.a(null, this.dr(), this.dt(), this.dx(), aum.tN, aun.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof apt) {
         am.A.a((apt)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(doz $$0) {
      return this.cu.b || super.c($$0);
   }

   @Override
   public esa q(float $$0) {
      double $$1 = 0.22 * (this.fr() == bqi.b ? -1.0 : 1.0);
      float $$2 = axk.i($$0 * 0.5F, this.dE(), this.O) * (float) (Math.PI / 180.0);
      float $$3 = axk.i($$0, this.aY, this.aX) * (float) (Math.PI / 180.0);
      if (this.fB() || this.fo()) {
         esa $$4 = this.f($$0);
         esa $$5 = this.dp();
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

         return this.l($$0).e(new esa($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ca()) {
         return this.l($$0).e(new esa($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cH().c() - 1.0;
         double $$13 = this.bX() ? -0.2 : 0.07;
         return this.l($$0).e(new esa($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dL() {
      return true;
   }

   public boolean gx() {
      return this.fs() && this.fu().a(crm.qW);
   }

   @Override
   public boolean dK() {
      return false;
   }

   public Optional<ik> gy() {
      return this.cB;
   }

   public void a(Optional<ik> $$0) {
      this.cB = $$0;
   }

   @Override
   public float eG() {
      return this.cr;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cr = $$0;
   }

   @Override
   public boolean dF() {
      return true;
   }

   @Override
   protected float fj() {
      if (this.cu.b && !this.bO()) {
         return this.bY() ? this.cu.a() * 2.0F : this.cu.a();
      } else {
         return this.bY() ? 0.025999999F : 0.02F;
      }
   }

   public double gz() {
      return this.g(brv.g);
   }

   public double gA() {
      return this.g(brv.h);
   }

   public boolean b(bpv $$0, double $$1) {
      return $$0.dH() ? false : this.a($$0.cH(), $$1);
   }

   public boolean a(erv $$0, double $$1) {
      double $$2 = this.gA() + $$1;
      return $$0.e(this.bu()) < $$2 * $$2;
   }

   public boolean a(ib $$0, double $$1) {
      double $$2 = this.gz() + $$1;
      return new erv($$0).e(this.bu()) < $$2 * $$2;
   }

   public static enum a {
      a,
      b(wg.c("block.minecraft.bed.no_sleep")),
      c(wg.c("block.minecraft.bed.too_far_away")),
      d(wg.c("block.minecraft.bed.obstructed")),
      e,
      f(wg.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final wg g;

      private a() {
         this.g = null;
      }

      private a(wg $$0) {
         this.g = $$0;
      }

      @Nullable
      public wg a() {
         return this.g;
      }
   }
}
