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

public abstract class cia extends box {
   private static final Logger b = LogUtils.getLogger();
   public static final int bC = 16;
   public static final bor bD = bor.b;
   public static final int bE = 0;
   public static final int bF = 20;
   public static final int bG = 100;
   public static final int bH = 10;
   public static final int bI = 200;
   public static final float bJ = 4.5F;
   public static final float bK = 3.0F;
   public static final float bL = 1.5F;
   public static final float bM = 0.6F;
   public static final float bN = 0.6F;
   public static final float bO = 1.62F;
   public static final eov bP = new eov(0.0, 0.6, 0.0);
   public static final boi bQ = boi.b(0.6F, 1.8F).b(1.62F).a(boh.a().a(bog.b, bP));
   private static final Map<bpi, boi> c = ImmutableMap.builder()
      .put(bpi.a, bQ)
      .put(bpi.c, aD)
      .put(bpi.b, boi.b(0.6F, 0.6F).b(0.4F))
      .put(bpi.d, boi.b(0.6F, 0.6F).b(0.4F))
      .put(bpi.e, boi.b(0.6F, 0.6F).b(0.4F))
      .put(bpi.f, boi.b(0.6F, 1.5F).b(1.27F).a(boh.a().a(bog.b, bP)))
      .put(bpi.h, boi.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final aii<Float> d = ail.a(cia.class, aik.d);
   private static final aii<Integer> e = ail.a(cia.class, aik.b);
   protected static final aii<Byte> bR = ail.a(cia.class, aik.a);
   protected static final aii<Byte> bS = ail.a(cia.class, aik.a);
   protected static final aii<sy> bT = ail.a(cia.class, aik.s);
   protected static final aii<sy> bU = ail.a(cia.class, aik.s);
   private long f;
   private final chz g = new chz(this);
   protected cmg bV = new cmg();
   public final clv bW;
   public cku bX;
   protected ckq bY = new ckq();
   protected int bZ;
   public float ca;
   public float cb;
   public int cc;
   public double cd;
   public double ce;
   public double cf;
   public double cg;
   public double ch;
   public double ci;
   private int cr;
   protected boolean cj;
   private final chx cs = new chx();
   public int ck;
   public int cl;
   public float cm;
   protected int cn;
   protected final float co = 0.02F;
   private int ct;
   private final GameProfile cu;
   private boolean cv;
   private cpq cx = cpq.h;
   private final cpm cy = this.k();
   private Optional<ik> cz = Optional.empty();
   @Nullable
   public cio cp;
   protected float cq;

   public cia(cwe $$0, ib $$1, float $$2, GameProfile $$3) {
      super(bol.bw, $$0);
      this.a_($$3.getId());
      this.cu = $$3;
      this.bW = new clv(this.g, !$$0.B, this);
      this.bX = this.bW;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bh = 180.0F;
   }

   public boolean a(cwe $$0, ib $$1, cwb $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == cwb.d) {
         return true;
      } else if (this.gh()) {
         return false;
      } else {
         cpq $$3 = this.eR();
         return $$3.b() || !$$3.b($$0.I_().d(ki.f), new dmi($$0, $$1, false));
      }
   }

   public static bqd.a fJ() {
      return box.dO().a(bqe.c, 1.0).a(bqe.o, 0.1F).a(bqe.e).a(bqe.l).a(bqe.f, 4.5).a(bqe.g, 3.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, 0.0F);
      this.am.a(e, 0);
      this.am.a(bR, (byte)0);
      this.am.a(bS, (byte)bD.a());
      this.am.a(bT, new sy());
      this.am.a(bU, new sy());
   }

   @Override
   public void l() {
      this.ae = this.P_();
      if (this.P_()) {
         this.c(false);
      }

      if (this.cc > 0) {
         this.cc--;
      }

      if (this.fF()) {
         this.cr++;
         if (this.cr > 100) {
            this.cr = 100;
         }

         if (!this.dJ().B && this.dJ().P()) {
            this.a(false, true);
         }
      } else if (this.cr > 0) {
         this.cr++;
         if (this.cr >= 110) {
            this.cr = 0;
         }
      }

      this.fN();
      super.l();
      if (!this.dJ().B && this.bX != null && !this.bX.a(this)) {
         this.r();
         this.bX = this.bW;
      }

      this.w();
      if (!this.dJ().B) {
         this.bY.a(this);
         this.a(atz.k);
         this.a(atz.l);
         if (this.bx()) {
            this.a(atz.m);
         }

         if (this.bS()) {
            this.a(atz.o);
         }

         if (!this.fF()) {
            this.a(atz.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = awm.a(this.do(), -2.9999999E7, 2.9999999E7);
      double $$2 = awm.a(this.du(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.do() || $$2 != this.du()) {
         this.a_($$1, this.dq(), $$2);
      }

      this.aQ++;
      cpq $$3 = this.eR();
      if (!cpq.a(this.cx, $$3)) {
         if (!cpq.b(this.cx, $$3)) {
            this.gp();
         }

         this.cx = $$3.q();
      }

      this.u();
      this.cy.a();
      this.fO();
   }

   @Override
   protected float fi() {
      return this.fw() ? 15.0F : super.fi();
   }

   public boolean fK() {
      return this.bP();
   }

   protected boolean fL() {
      return this.bP();
   }

   protected boolean fM() {
      return this.bP();
   }

   protected boolean fN() {
      this.cj = this.a(auj.a);
      return this.cj;
   }

   private void u() {
      cpq $$0 = this.c(bom.f);
      if ($$0.a(cpt.on) && !this.a(auj.a)) {
         this.b(new bns(bnu.m, 200, 0, false, false, true));
      }
   }

   protected cpm k() {
      return new cpm();
   }

   private void w() {
      this.cd = this.cg;
      this.ce = this.ch;
      this.cf = this.ci;
      double $$0 = this.do() - this.cg;
      double $$1 = this.dq() - this.ch;
      double $$2 = this.du() - this.ci;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cg = this.do();
         this.cd = this.cg;
      }

      if ($$2 > 10.0) {
         this.ci = this.du();
         this.cf = this.ci;
      }

      if ($$1 > 10.0) {
         this.ch = this.dq();
         this.ce = this.ch;
      }

      if ($$0 < -10.0) {
         this.cg = this.do();
         this.cd = this.cg;
      }

      if ($$2 < -10.0) {
         this.ci = this.du();
         this.cf = this.ci;
      }

      if ($$1 < -10.0) {
         this.ch = this.dq();
         this.ce = this.ch;
      }

      this.cg += $$0 * 0.25;
      this.ci += $$2 * 0.25;
      this.ch += $$1 * 0.25;
   }

   protected void fO() {
      if (this.h(bpi.d)) {
         bpi $$0;
         if (this.fy()) {
            $$0 = bpi.b;
         } else if (this.fF()) {
            $$0 = bpi.c;
         } else if (this.bW()) {
            $$0 = bpi.d;
         } else if (this.fl()) {
            $$0 = bpi.e;
         } else if (this.bP() && !this.cs.b) {
            $$0 = bpi.f;
         } else {
            $$0 = bpi.a;
         }

         bpi $$6;
         if (this.P_() || this.bL() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bpi.f)) {
            $$6 = bpi.f;
         } else {
            $$6 = bpi.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bpi $$0) {
      return this.dJ().a(this, this.a($$0).a(this.dh()).h(1.0E-7));
   }

   @Override
   public int ax() {
      return Math.max(1, this.dJ().Z().c(this.cs.a ? cwa.F : cwa.E));
   }

   @Override
   protected ato aN() {
      return atp.tN;
   }

   @Override
   protected ato aO() {
      return atp.tL;
   }

   @Override
   protected ato aP() {
      return atp.tM;
   }

   @Override
   public int bJ() {
      return 10;
   }

   @Override
   public void a(ato $$0, float $$1, float $$2) {
      this.dJ().a(this, this.do(), this.dq(), this.du(), $$0, this.cY(), $$1, $$2);
   }

   public void a(ato $$0, atq $$1, float $$2, float $$3) {
   }

   @Override
   public atq cY() {
      return atq.h;
   }

   @Override
   protected int cZ() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.x();
      } else if ($$0 == 23) {
         this.cv = false;
      } else if ($$0 == 22) {
         this.cv = true;
      } else if ($$0 == 43) {
         this.a(kb.f);
      } else {
         super.b($$0);
      }
   }

   private void a(jz $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.af.k() * 0.02;
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         this.dJ().a($$0, this.d(1.0), this.dr() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   protected void r() {
      this.bX = this.bW;
   }

   @Override
   protected void s() {
   }

   @Override
   public void t() {
      if (!this.dJ().B && this.fL() && this.bL()) {
         this.ac();
         this.f(false);
      } else {
         super.t();
         this.ca = this.cb;
         this.cb = 0.0F;
      }
   }

   @Override
   protected void fk() {
      super.fk();
      this.eP();
      this.aX = this.dz();
   }

   @Override
   public void d_() {
      if (this.bZ > 0) {
         this.bZ--;
      }

      if (this.dJ().aj() == bmi.a && this.dJ().Z().b(cwa.k)) {
         if (this.eu() < this.eL() && this.ag % 20 == 0) {
            this.c(1.0F);
         }

         if (this.bY.c() && this.ag % 10 == 0) {
            this.bY.a(this.bY.a() + 1);
         }
      }

      this.g.j();
      this.ca = this.cb;
      super.d_();
      this.w((float)this.g(bqe.o));
      float $$1;
      if (this.aC() && !this.ev() && !this.bW()) {
         $$1 = Math.min(0.1F, (float)this.dm().h());
      } else {
         $$1 = 0.0F;
      }

      this.cb = this.cb + ($$1 - this.cb) * 0.4F;
      if (this.eu() > 0.0F && !this.P_()) {
         eoq $$2;
         if (this.bL() && !this.cW().dE()) {
            $$2 = this.cE().b(this.cW().cE()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cE().c(1.0, 0.5, 1.0);
         }

         List<bof> $$4 = this.dJ().a_(this, $$2);
         List<bof> $$5 = Lists.newArrayList();

         for (bof $$6 : $$4) {
            if ($$6.ai() == bol.L) {
               $$5.add($$6);
            } else if (!$$6.dE()) {
               this.c($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.c(ac.a($$5, this.af));
         }
      }

      this.c(this.gm());
      this.c(this.gn());
      if (!this.dJ().B && (this.aa > 0.5F || this.aZ()) || this.cs.b || this.fF() || this.az) {
         this.gj();
      }
   }

   private void c(@Nullable sy $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dJ().z.a(200) == 0) {
         String $$1 = $$0.l("id");
         bol.a($$1).filter($$0x -> $$0x == bol.av).ifPresent($$0x -> {
            if (!cbc.a(this.dJ(), this)) {
               this.dJ().a(null, this.do(), this.dq(), this.du(), cbc.a(this.dJ(), this.dJ().z), this.cY(), 1.0F, cbc.a(this.dJ().z));
            }
         });
      }
   }

   private void c(bof $$0) {
      $$0.b_(this);
   }

   public int fP() {
      return this.am.b(e);
   }

   public void s(int $$0) {
      this.am.b(e, $$0);
   }

   public void t(int $$0) {
      int $$1 = this.fP();
      this.am.b(e, $$1 + $$0);
   }

   public void u(int $$0) {
      this.bz = $$0;
      if (!this.dJ().B) {
         this.gj();
         this.c(4, true);
      }
   }

   @Override
   public void a(bne $$0) {
      super.a($$0);
      this.ar();
      if (!this.P_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-awm.b((this.eD() + this.dz()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-awm.a((this.eD() + this.dz()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(atz.N);
      this.a(atz.i.b(atz.m));
      this.a(atz.i.b(atz.n));
      this.aA();
      this.a_(false);
      this.a(Optional.of(ik.a(this.dJ().ad(), this.dj())));
   }

   @Override
   protected void ex() {
      super.ex();
      if (!this.dJ().Z().b(cwa.d)) {
         this.fQ();
         this.g.k();
      }
   }

   protected void fQ() {
      for (int $$0 = 0; $$0 < this.g.b(); $$0++) {
         cpq $$1 = this.g.a($$0);
         if (!$$1.b() && cua.e($$1)) {
            this.g.b($$0);
         }
      }
   }

   @Override
   protected ato d(bne $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected ato n_() {
      return atp.tD;
   }

   @Nullable
   public cel a(cpq $$0, boolean $$1) {
      return this.a($$0, false, $$1);
   }

   @Nullable
   public cel a(cpq $$0, boolean $$1, boolean $$2) {
      if ($$0.b()) {
         return null;
      } else {
         if (this.dJ().B) {
            this.a(bmk.a);
         }

         double $$3 = this.ds() - 0.3F;
         cel $$4 = new cel(this.dJ(), this.do(), $$3, this.du(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.a(this);
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.o((double)(-awm.a($$6) * $$5), 0.2F, (double)(awm.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = awm.a(this.dB() * (float) (Math.PI / 180.0));
            float $$9 = awm.b(this.dB() * (float) (Math.PI / 180.0));
            float $$10 = awm.a(this.dz() * (float) (Math.PI / 180.0));
            float $$11 = awm.b(this.dz() * (float) (Math.PI / 180.0));
            float $$12 = this.af.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.af.i();
            $$4.o(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.af.i() - this.af.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public float d(dme $$0) {
      float $$1 = this.g.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = cua.g(this);
         cpq $$3 = this.eR();
         if ($$2 > 0 && !$$3.b()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bnt.a(this)) {
         $$1 *= 1.0F + (float)(bnt.b(this) + 1) * 0.2F;
      }

      if (this.a(bnu.d)) {
         $$1 *= switch (this.c(bnu.d).d()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      if (this.a(auj.a) && !cua.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aC()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dme $$0) {
      return !$$0.y() || this.g.f().b($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a_(this.cu.getId());
      te $$1 = $$0.c("Inventory", 10);
      this.g.b($$1);
      this.g.l = $$0.h("SelectedItemSlot");
      this.cr = $$0.g("SleepTimer");
      this.cm = $$0.j("XpP");
      this.ck = $$0.h("XpLevel");
      this.cl = $$0.h("XpTotal");
      this.cn = $$0.h("XpSeed");
      if (this.cn == 0) {
         this.cn = this.af.f();
      }

      this.s($$0.h("Score"));
      this.bY.a($$0);
      this.cs.b($$0);
      this.f(bqe.o).a((double)this.cs.b());
      if ($$0.b("EnderItems", 9)) {
         this.bV.a($$0.c("EnderItems", 10));
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(ik.a.parse(tm.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      tn.g($$0);
      $$0.a("Inventory", this.g.a(new te()));
      $$0.a("SelectedItemSlot", this.g.l);
      $$0.a("SleepTimer", (short)this.cr);
      $$0.a("XpP", this.cm);
      $$0.a("XpLevel", this.ck);
      $$0.a("XpTotal", this.cl);
      $$0.a("XpSeed", this.cn);
      $$0.a("Score", this.fP());
      this.bY.b($$0);
      this.cs.a($$0);
      $$0.a("EnderItems", this.bV.g());
      if (!this.gm().g()) {
         $$0.a("ShoulderEntityLeft", this.gm());
      }

      if (!this.gn().g()) {
         $$0.a("ShoulderEntityRight", this.gn());
      }

      this.gu().flatMap($$0x -> ik.a.encodeStart(tm.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
   }

   @Override
   public boolean b(bne $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(aug.o)) {
         return !this.dJ().Z().b(cwa.G);
      } else if ($$0.a(aug.n)) {
         return !this.dJ().Z().b(cwa.H);
      } else if ($$0.a(aug.j)) {
         return !this.dJ().Z().b(cwa.I);
      } else {
         return $$0.a(aug.p) ? !this.dJ().Z().b(cwa.J) : false;
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cs.a && !$$0.a(aug.e)) {
         return false;
      } else {
         this.bc = 0;
         if (this.ev()) {
            return false;
         } else {
            if (!this.dJ().B) {
               this.gj();
            }

            if ($$0.f()) {
               if (this.dJ().aj() == bmi.a) {
                  $$1 = 0.0F;
               }

               if (this.dJ().aj() == bmi.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dJ().aj() == bmi.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(box $$0) {
      super.d($$0);
      if ($$0.fI()) {
         this.fR();
      }
   }

   @Override
   public boolean en() {
      return !this.fW().a && super.en();
   }

   public boolean a(cia $$0) {
      eqb $$1 = this.cd();
      eqb $$2 = $$0.cd();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bne $$0, float $$1) {
      this.g.a($$0, $$1, chz.g);
   }

   @Override
   protected void c(bne $$0, float $$1) {
      this.g.a($$0, $$1, chz.h);
   }

   @Override
   protected void u(float $$0) {
      if (this.bw.a(cpt.vo)) {
         if (!this.dJ().B) {
            this.b(atz.c.b(this.bw.d()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + awm.d($$0);
            bmk $$2 = this.fq();
            this.bw.a($$1, this, d($$2));
            if (this.bw.b()) {
               if ($$2 == bmk.a) {
                  this.a(bom.a, cpq.h);
               } else {
                  this.a(bom.b, cpq.h);
               }

               this.bw = cpq.h;
               this.a(atp.vX, 0.8F, 0.8F + this.dJ().z.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bne $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fm(), 0.0F);
         this.y(this.fm() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(atz.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.A($$0.a());
            this.eJ().a($$0, var7);
            this.t(this.eu() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(atz.J, Math.round(var7 * 10.0F));
            }

            this.b(dqr.o);
         }
      }
   }

   @Override
   protected boolean dS() {
      return !this.cs.b && super.dS();
   }

   public boolean Y() {
      return false;
   }

   public void a(dku $$0, boolean $$1) {
   }

   public void a(cvf $$0) {
   }

   public void a(djv $$0) {
   }

   public void a(dkz $$0) {
   }

   public void a(dkl $$0) {
   }

   public void a(cco $$0, bme $$1) {
   }

   public OptionalInt a(@Nullable bmp $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, cvd $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cpq $$0, bmk $$1) {
   }

   public bml a(bof $$0, bmk $$1) {
      if (this.P_()) {
         if ($$0 instanceof bmp) {
            this.a((bmp)$$0);
         }

         return bml.d;
      } else {
         cpq $$2 = this.b($$1);
         cpq $$3 = $$2.q();
         bml $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cs.d && $$2 == this.b($$1) && $$2.M() < $$3.M()) {
               $$2.f($$3.M());
            }

            return $$4;
         } else {
            if (!$$2.b() && $$0 instanceof box) {
               if (this.cs.d) {
                  $$2 = $$3;
               }

               bml $$5 = $$2.a(this, (box)$$0, $$1);
               if ($$5.a()) {
                  this.dJ().a(dqr.r, $$0.dh(), dqr.a.a(this));
                  if ($$2.b() && !this.cs.d) {
                     this.a($$1, cpq.h);
                  }

                  return $$5;
               }
            }

            return bml.d;
         }
      }
   }

   @Override
   public void bC() {
      super.bC();
      this.I = 0;
   }

   @Override
   protected boolean fa() {
      return super.fa() || this.fF();
   }

   @Override
   public boolean dZ() {
      return !this.cs.b;
   }

   @Override
   protected eov a(eov $$0, bpc $$1) {
      if (!this.cs.b && $$0.d <= 0.0 && ($$1 == bpc.a || $$1 == bpc.b) && this.fM() && this.A()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dJ().a(this, this.cE().d($$2, (double)(-this.dD()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dJ().a(this, this.cE().d(0.0, (double)(-this.dD()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dJ().a(this, this.cE().d($$2, (double)(-this.dD()), $$3))) {
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

         $$0 = new eov($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean A() {
      return this.aC() || this.aa < this.dD() && !this.dJ().a(this, this.cE().d(0.0, (double)(this.aa - this.dD()), 0.0));
   }

   public void d(bof $$0) {
      if ($$0.cn()) {
         if (!$$0.t(this)) {
            float $$1 = (float)this.g(bqe.c);
            float $$2 = cua.a(this.eR(), $$0.ai());
            float $$3 = this.B(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gp();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += cua.c(this);
               if (this.bV() && $$4) {
                  this.dJ().a(null, this.do(), this.dq(), this.du(), atp.tv, this.cY(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               boolean $$7 = $$4 && this.aa > 0.0F && !this.aC() && !this.e_() && !this.aZ() && !this.a(bnu.o) && !this.bL() && $$0 instanceof box;
               $$7 = $$7 && !this.bV();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.X - this.W);
               if ($$4 && !$$7 && !$$5 && this.aC() && $$9 < (double)this.fh()) {
                  cpq $$10 = this.b(bmk.a);
                  if ($$10.d() instanceof crb) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = cua.d(this);
               if ($$0 instanceof box) {
                  $$11 = ((box)$$0).eu();
                  if ($$13 > 0 && !$$0.bK()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               eov $$14 = $$0.dm();
               boolean $$15 = $$0.a(this.dK().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof box) {
                        ((box)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)awm.a(this.dz() * (float) (Math.PI / 180.0)),
                              (double)(-awm.b(this.dz() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-awm.a(this.dz() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(awm.b(this.dz() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.dm().d(0.6, 1.0, 0.6));
                     this.g(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + cua.a(this) * $$1;

                     for (box $$18 : this.dJ().a(box.class, $$0.cE().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.r($$18) && (!($$18 instanceof ceb) || !((ceb)$$18).B()) && this.f($$18) < 9.0) {
                           $$18.q(0.4F, (double)awm.a(this.dz() * (float) (Math.PI / 180.0)), (double)(-awm.b(this.dz() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dK().a(this), $$16);
                        }
                     }

                     this.dJ().a(null, this.do(), this.dq(), this.du(), atp.ty, this.cY(), 1.0F, 1.0F);
                     this.fS();
                  }

                  if ($$0 instanceof apb && $$0.S) {
                     ((apb)$$0).d.b(new ado($$0));
                     $$0.S = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dJ().a(null, this.do(), this.dq(), this.du(), atp.tu, this.cY(), 1.0F, 1.0F);
                     this.a($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dJ().a(null, this.do(), this.dq(), this.du(), atp.tx, this.cY(), 1.0F, 1.0F);
                     } else {
                        this.dJ().a(null, this.do(), this.dq(), this.du(), atp.tz, this.cY(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.b($$0);
                  }

                  this.z($$0);
                  if ($$0 instanceof box) {
                     cua.a((box)$$0, this);
                  }

                  cua.b(this, $$0);
                  cpq $$19 = this.eR();
                  bof $$20 = $$0;
                  if ($$0 instanceof cdd) {
                     $$20 = ((cdd)$$0).b;
                  }

                  if (!this.dJ().B && !$$19.b() && $$20 instanceof box) {
                     $$19.a((box)$$20, this);
                     if ($$19.b()) {
                        this.a(bmk.a, cpq.h);
                     }
                  }

                  if ($$0 instanceof box) {
                     float $$21 = $$11 - ((box)$$0).eu();
                     this.a(atz.G, Math.round($$21 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dJ() instanceof apa && $$21 > 2.0F) {
                        int $$22 = (int)((double)$$21 * 0.5);
                        ((apa)this.dJ()).a(kb.h, $$0.do(), $$0.e(0.5), $$0.du(), $$22, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.A(0.1F);
               } else {
                  this.dJ().a(null, this.do(), this.dq(), this.du(), atp.tw, this.cY(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aA();
                  }
               }
            }
         }
      }
   }

   @Override
   protected void g(box $$0) {
      this.d((bof)$$0);
   }

   public void fR() {
      this.gq().a(cpt.vo, 100);
      this.fv();
      this.dJ().a(this, (byte)30);
   }

   @Override
   public void a(bof $$0) {
   }

   public void b(bof $$0) {
   }

   public void fS() {
      double $$0 = (double)(-awm.a(this.dz() * (float) (Math.PI / 180.0)));
      double $$1 = (double)awm.b(this.dz() * (float) (Math.PI / 180.0));
      if (this.dJ() instanceof apa) {
         ((apa)this.dJ()).a(kb.ag, this.do() + $$0, this.e(0.5), this.du() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void fT() {
   }

   @Override
   public void a(bof.c $$0) {
      super.a($$0);
      this.bW.b(this);
      if (this.bX != null && this.fX()) {
         this.s();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile fU() {
      return this.cu;
   }

   public chz fV() {
      return this.g;
   }

   public chx fW() {
      return this.cs;
   }

   public void a(cpq $$0, cpq $$1, clc $$2) {
   }

   public boolean fX() {
      return this.bX != this.bW;
   }

   public Either<cia.a, axo> a(ib $$0) {
      this.b($$0);
      this.cr = 0;
      return Either.right(axo.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fG();
      if (this.dJ() instanceof apa && $$1) {
         ((apa)this.dJ()).e();
      }

      this.cr = $$0 ? 0 : 100;
   }

   @Override
   public void fG() {
      this.a(true, true);
   }

   public static Optional<eov> a(apa $$0, ib $$1, float $$2, boolean $$3, boolean $$4) {
      dme $$5 = $$0.a_($$1);
      czf $$6 = $$5.b();
      if ($$6 instanceof dfm && ($$3 || $$5.c(dfm.d) > 0) && dfm.a($$0)) {
         Optional<eov> $$7 = dfm.a(bol.bw, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dfm.d, Integer.valueOf($$5.c(dfm.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof cyy && cyy.a($$0)) {
         return cyy.a(bol.bw, $$0, $$1, $$5.c(cyy.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dme $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new eov((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean fY() {
      return this.fF() && this.cr >= 100;
   }

   public int fZ() {
      return this.cr;
   }

   public void a(vs $$0, boolean $$1) {
   }

   public void a(ajc $$0) {
      this.b(atz.i.b($$0));
   }

   public void a(ajc $$0, int $$1) {
      this.a(atz.i.b($$0), $$1);
   }

   public void b(atw<?> $$0) {
      this.a($$0, 1);
   }

   public void a(atw<?> $$0, int $$1) {
   }

   public void a(atw<?> $$0) {
   }

   public int a(Collection<csu<?>> $$0) {
      return 0;
   }

   public void a(csu<?> $$0, List<cpq> $$1) {
   }

   public void a(List<ajc> $$0) {
   }

   public int b(Collection<csu<?>> $$0) {
      return 0;
   }

   @Override
   public void fd() {
      super.fd();
      this.a(atz.E);
      if (this.bV()) {
         this.A(0.2F);
      } else {
         this.A(0.05F);
      }
   }

   @Override
   public void a(eov $$0) {
      if (this.bW() && !this.bL()) {
         double $$1 = this.bF().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.bk || !this.dJ().a_(ib.a(this.do(), this.dq() + 1.0 - 0.1, this.du())).u().c()) {
            eov $$3 = this.dm();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cs.b && !this.bL()) {
         double $$4 = this.dm().d;
         super.a($$0);
         eov $$5 = this.dm();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (this.cs.b) {
         this.h(false);
      } else {
         super.bf();
      }
   }

   protected boolean h(ib $$0) {
      return !this.dJ().a_($$0).o(this.dJ(), $$0);
   }

   @Override
   public float fh() {
      return (float)this.g(bqe.o);
   }

   @Override
   public boolean a(float $$0, float $$1, bne $$2) {
      if (this.cs.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(atz.t, (int)Math.round((double)$$0 * 100.0));
         }

         return super.a($$0, $$1, $$2);
      }
   }

   public boolean ga() {
      if (!this.aC() && !this.fy() && !this.aZ() && !this.a(bnu.y)) {
         cpq $$0 = this.c(bom.e);
         if ($$0.a(cpt.nS) && cok.d($$0)) {
            this.gb();
            return true;
         }
      }

      return false;
   }

   public void gb() {
      this.b(7, true);
   }

   public void gc() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void bi() {
      if (!this.P_()) {
         super.bi();
      }
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      if (this.aZ()) {
         this.aR();
         this.b($$1);
      } else {
         ib $$2 = this.e($$0);
         if (!$$0.equals($$2)) {
            dme $$3 = this.dJ().a_($$2);
            if ($$3.a(aue.bn)) {
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
   public box.a eF() {
      return new box.a(atp.tK, atp.tA);
   }

   @Override
   public boolean a(apa $$0, box $$1) {
      this.b(atz.g.b($$1.ai()));
      return true;
   }

   @Override
   public void a(dme $$0, eov $$1) {
      if (!this.cs.b) {
         super.a($$0, $$1);
      }
   }

   public void d(int $$0) {
      this.t($$0);
      this.cm = this.cm + (float)$$0 / (float)this.ge();
      this.cl = awm.a(this.cl + $$0, 0, Integer.MAX_VALUE);

      while (this.cm < 0.0F) {
         float $$1 = this.cm * (float)this.ge();
         if (this.ck > 0) {
            this.c(-1);
            this.cm = 1.0F + $$1 / (float)this.ge();
         } else {
            this.c(-1);
            this.cm = 0.0F;
         }
      }

      while (this.cm >= 1.0F) {
         this.cm = (this.cm - 1.0F) * (float)this.ge();
         this.c(1);
         this.cm = this.cm / (float)this.ge();
      }
   }

   public int gd() {
      return this.cn;
   }

   @Override
   public void a(cpq $$0, int $$1) {
      this.ck -= $$1;
      if (this.ck < 0) {
         this.ck = 0;
         this.cm = 0.0F;
         this.cl = 0;
      }

      this.cn = this.af.f();
   }

   public void c(int $$0) {
      this.ck += $$0;
      if (this.ck < 0) {
         this.ck = 0;
         this.cm = 0.0F;
         this.cl = 0;
      }

      if ($$0 > 0 && this.ck % 5 == 0 && (float)this.ct < (float)this.ag - 100.0F) {
         float $$1 = this.ck > 30 ? 1.0F : (float)this.ck / 30.0F;
         this.dJ().a(null, this.do(), this.dq(), this.du(), atp.tJ, this.cY(), $$1 * 0.75F, 1.0F);
         this.ct = this.ag;
      }
   }

   public int ge() {
      if (this.ck >= 30) {
         return 112 + (this.ck - 30) * 9;
      } else {
         return this.ck >= 15 ? 37 + (this.ck - 15) * 5 : 7 + this.ck * 2;
      }
   }

   public void A(float $$0) {
      if (!this.cs.a) {
         if (!this.dJ().B) {
            this.bY.a($$0);
         }
      }
   }

   public Optional<chg> aa() {
      return Optional.empty();
   }

   public ckq gf() {
      return this.bY;
   }

   public boolean s(boolean $$0) {
      return this.cs.a || $$0 || this.bY.c();
   }

   public boolean gg() {
      return this.eu() > 0.0F && this.eu() < this.eL();
   }

   public boolean gh() {
      return this.cs.e;
   }

   public boolean a(ib $$0, ih $$1, cpq $$2) {
      if (this.cs.e) {
         return true;
      } else {
         ib $$3 = $$0.a($$1.g());
         dmi $$4 = new dmi(this.dJ(), $$3, false);
         return $$2.a(this.dJ().I_().d(ki.f), $$4);
      }
   }

   @Override
   public int ed() {
      if (!this.dJ().Z().b(cwa.d) && !this.P_()) {
         int $$0 = this.ck * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean ee() {
      return true;
   }

   @Override
   public boolean cz() {
      return true;
   }

   @Override
   protected bof.b aW() {
      return this.cs.b || this.aC() && this.bS() ? bof.b.a : bof.b.d;
   }

   @Override
   public void y() {
   }

   @Override
   public vs ad() {
      return vs.b(this.cu.getName());
   }

   public cmg gi() {
      return this.bV;
   }

   @Override
   public cpq c(bom $$0) {
      if ($$0 == bom.a) {
         return this.g.f();
      } else if ($$0 == bom.b) {
         return this.g.k.get(0);
      } else {
         return $$0.a() == bom.a.b ? this.g.j.get($$0.b()) : cpq.h;
      }
   }

   @Override
   protected boolean a(bom $$0) {
      return $$0.a() == bom.a.b;
   }

   @Override
   public void a(bom $$0, cpq $$1) {
      this.e($$1);
      if ($$0 == bom.a) {
         this.a($$0, this.g.i.set(this.g.l, $$1), $$1);
      } else if ($$0 == bom.b) {
         this.a($$0, this.g.k.set(0, $$1), $$1);
      } else if ($$0.a() == bom.a.b) {
         this.a($$0, this.g.j.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cpq $$0) {
      return this.g.e($$0);
   }

   @Override
   public Iterable<cpq> eU() {
      return Lists.newArrayList(new cpq[]{this.eR(), this.eS()});
   }

   @Override
   public Iterable<cpq> eT() {
      return this.g.j;
   }

   public boolean h(sy $$0) {
      if (this.bL() || !this.aC() || this.aZ() || this.az) {
         return false;
      } else if (this.gm().g()) {
         this.i($$0);
         this.f = this.dJ().X();
         return true;
      } else if (this.gn().g()) {
         this.j($$0);
         this.f = this.dJ().X();
         return true;
      } else {
         return false;
      }
   }

   protected void gj() {
      if (this.f + 20L < this.dJ().X()) {
         this.k(this.gm());
         this.i(new sy());
         this.k(this.gn());
         this.j(new sy());
      }
   }

   private void k(sy $$0) {
      if (!this.dJ().B && !$$0.g()) {
         bol.a($$0, this.dJ()).ifPresent($$0x -> {
            if ($$0x instanceof bpt) {
               ((bpt)$$0x).b(this.ax);
            }

            $$0x.a_(this.do(), this.dq() + 0.7F, this.du());
            ((apa)this.dJ()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean P_();

   @Override
   public boolean bs() {
      return !this.P_() && super.bs();
   }

   @Override
   public boolean bW() {
      return !this.cs.b && !this.P_() && super.bW();
   }

   public abstract boolean f();

   @Override
   public boolean cw() {
      return !this.cs.b;
   }

   public epz gk() {
      return this.dJ().K();
   }

   @Override
   public vs Q_() {
      wg $$0 = epu.a(this.cd(), this.ad());
      return this.a($$0);
   }

   private wg a(wg $$0) {
      String $$1 = this.fU().getName();
      return $$0.a($$1x -> $$1x.a(new vq(vq.a.d, "/tell " + $$1 + " ")).a(this.cD()).a($$1));
   }

   @Override
   public String cv() {
      return this.fU().getName();
   }

   @Override
   protected void z(float $$0) {
      this.an().b(d, $$0);
   }

   @Override
   public float fm() {
      return this.an().b(d);
   }

   public boolean a(cib $$0) {
      return (this.an().b(bR) & $$0.a()) == $$0.a();
   }

   @Override
   public bpo a_(int $$0) {
      if ($$0 >= 0 && $$0 < this.g.i.size()) {
         return bpo.a(this.g, $$0);
      } else {
         int $$1 = $$0 - 200;
         return $$1 >= 0 && $$1 < this.bV.b() ? bpo.a(this.bV, $$1) : super.a_($$0);
      }
   }

   public boolean gl() {
      return this.cv;
   }

   public void t(boolean $$0) {
      this.cv = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cs.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bor fo() {
      return this.am.b(bS) == 0 ? bor.a : bor.b;
   }

   public void a(bor $$0) {
      this.am.b(bS, (byte)($$0 == bor.a ? 0 : 1));
   }

   public sy gm() {
      return this.am.b(bT);
   }

   protected void i(sy $$0) {
      this.am.b(bT, $$0);
   }

   public sy gn() {
      return this.am.b(bU);
   }

   protected void j(sy $$0) {
      this.am.b(bU, $$0);
   }

   public float go() {
      return (float)(1.0 / this.g(bqe.e) * 20.0);
   }

   public float B(float $$0) {
      return awm.a(((float)this.aQ + $$0) / this.go(), 0.0F, 1.0F);
   }

   public void gp() {
      this.aQ = 0;
   }

   public cpm gq() {
      return this.cy;
   }

   @Override
   protected float aL() {
      return !this.cs.b && !this.fy() ? super.aL() : 1.0F;
   }

   public float gr() {
      return (float)this.g(bqe.l);
   }

   public boolean gs() {
      return this.cs.d && this.F() >= 2;
   }

   @Override
   public boolean f(cpq $$0) {
      bom $$1 = boz.h($$0);
      return this.c($$1).b();
   }

   @Override
   public boi e(bpi $$0) {
      return c.getOrDefault($$0, bQ);
   }

   @Override
   public ImmutableList<bpi> fC() {
      return ImmutableList.of(bpi.a, bpi.f, bpi.d);
   }

   @Override
   public cpq g(cpq $$0) {
      if (!($$0.d() instanceof cqg)) {
         return cpq.h;
      } else {
         Predicate<cpq> $$1 = ((cqg)$$0.d()).d();
         cpq $$2 = cqg.a(this, $$1);
         if (!$$2.b()) {
            return $$2;
         } else {
            $$1 = ((cqg)$$0.d()).b();

            for (int $$3 = 0; $$3 < this.g.b(); $$3++) {
               cpq $$4 = this.g.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cs.d ? new cpq(cpt.ou) : cpq.h;
         }
      }
   }

   @Override
   public cpq a(cwe $$0, cpq $$1) {
      this.gf().a($$1.d(), $$1);
      this.b(atz.c.b($$1.d()));
      $$0.a(null, this.do(), this.dq(), this.du(), atp.tC, atq.h, 0.5F, $$0.z.i() * 0.1F + 0.9F);
      if (this instanceof apb) {
         am.A.a((apb)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dme $$0) {
      return this.cs.b || super.c($$0);
   }

   @Override
   public eov q(float $$0) {
      double $$1 = 0.22 * (this.fo() == bor.b ? -1.0 : 1.0);
      float $$2 = awm.i($$0 * 0.5F, this.dB(), this.N) * (float) (Math.PI / 180.0);
      float $$3 = awm.i($$0, this.aW, this.aV) * (float) (Math.PI / 180.0);
      if (this.fy() || this.fl()) {
         eov $$4 = this.f($$0);
         eov $$5 = this.dm();
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

         return this.l($$0).e(new eov($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.bX()) {
         return this.l($$0).e(new eov($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cE().c() - 1.0;
         double $$13 = this.bU() ? -0.2 : 0.07;
         return this.l($$0).e(new eov($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dI() {
      return true;
   }

   public boolean gt() {
      return this.fp() && this.fr().a(cpt.qW);
   }

   @Override
   public boolean dH() {
      return false;
   }

   public Optional<ik> gu() {
      return this.cz;
   }

   public void a(Optional<ik> $$0) {
      this.cz = $$0;
   }

   @Override
   public float eD() {
      return this.cq;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cq = $$0;
   }

   @Override
   public boolean dC() {
      return true;
   }

   @Override
   protected float fg() {
      if (this.cs.b && !this.bL()) {
         return this.bV() ? this.cs.a() * 2.0F : this.cs.a();
      } else {
         return this.bV() ? 0.025999999F : 0.02F;
      }
   }

   public static boolean c(String $$0) {
      return $$0.length() > 16 ? false : $$0.chars().filter($$0x -> $$0x <= 32 || $$0x >= 127).findAny().isEmpty();
   }

   public double gv() {
      return this.g(bqe.f);
   }

   public double gw() {
      return this.g(bqe.g);
   }

   public boolean b(bof $$0, double $$1) {
      return $$0.dE() ? false : this.a($$0.cE(), $$1);
   }

   public boolean a(eoq $$0, double $$1) {
      double $$2 = this.gw() + $$1;
      return $$0.e(this.br()) < $$2 * $$2;
   }

   public boolean a(ib $$0, double $$1) {
      double $$2 = this.gv() + $$1;
      return new eoq($$0).e(this.br()) < $$2 * $$2;
   }

   public static enum a {
      a,
      b(vs.c("block.minecraft.bed.no_sleep")),
      c(vs.c("block.minecraft.bed.too_far_away")),
      d(vs.c("block.minecraft.bed.obstructed")),
      e,
      f(vs.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final vs g;

      private a() {
         this.g = null;
      }

      private a(vs $$0) {
         this.g = $$0;
      }

      @Nullable
      public vs a() {
         return this.g;
      }
   }
}
