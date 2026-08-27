import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cly extends bso {
   private static final Logger b = LogUtils.getLogger();
   public static final bsi bQ = bsi.b;
   public static final int bR = 0;
   public static final int bS = 20;
   public static final int bT = 100;
   public static final int bU = 10;
   public static final int bV = 200;
   public static final int bW = 499;
   public static final int bX = 500;
   public static final float bY = 4.5F;
   public static final float bZ = 3.0F;
   public static final float ca = 1.5F;
   public static final float cb = 0.6F;
   public static final float cc = 0.6F;
   public static final float cd = 1.62F;
   private static final String c = "potato.quest.intro.jump.0";
   public static final ewu ce = new ewu(0.0, 0.6, 0.0);
   public static final bry cf = bry.b(0.6F, 1.8F).b(1.62F).a(brx.a().a(brw.b, ce));
   private static final Map<bsz, bry> d = ImmutableMap.builder()
      .put(bsz.a, cf)
      .put(bsz.c, aQ)
      .put(bsz.b, bry.b(0.6F, 0.6F).b(0.4F))
      .put(bsz.d, bry.b(0.6F, 0.6F).b(0.4F))
      .put(bsz.e, bry.b(0.6F, 0.6F).b(0.4F))
      .put(bsz.f, bry.b(0.6F, 1.5F).b(1.27F).a(brx.a().a(brw.b, ce)))
      .put(bsz.h, bry.c(0.2F, 0.2F).b(1.62F))
      .build();
   private static final ajy<Float> e = akc.a(cly.class, aka.d);
   private static final ajy<Integer> f = akc.a(cly.class, aka.b);
   protected static final ajy<Byte> cg = akc.a(cly.class, aka.a);
   protected static final ajy<Byte> ch = akc.a(cly.class, aka.a);
   protected static final ajy<uk> ci = akc.a(cly.class, aka.t);
   protected static final ajy<uk> cj = akc.a(cly.class, aka.t);
   private long g;
   protected static final ajy<String> ck = akc.a(cly.class, aka.e);
   protected static final ajy<Optional<ir>> cl = akc.a(cly.class, aka.p);
   protected static final ajy<Optional<ir>> cm = akc.a(cly.class, aka.p);
   public static final ajy<Boolean> cn = akc.a(cly.class, aka.k);
   final clx h = new clx(this);
   protected cqt co = new cqt();
   public final cqi cp;
   public cpg cq;
   protected cou cr = new cou();
   protected int cs;
   public float ct;
   public float cu;
   public int cv;
   public int cw;
   public double cx;
   public double cy;
   public double cz;
   public double cA;
   public double cB;
   public double cC;
   private int i;
   protected boolean cD;
   private final clv cQ = new clv();
   public int cE;
   public int cF;
   public float cG;
   protected int cH;
   protected final float cI = 0.02F;
   private int cR;
   private final GameProfile cS;
   private boolean cT;
   private cuh cU = cuh.i;
   private final cud cV = this.k();
   private Optional<iz> cW = Optional.empty();
   @Nullable
   public cmn cJ;
   @Nullable
   public cmq cK;
   protected float cL;
   @Nullable
   public ewu cM;
   @Nullable
   public brv cN;
   public boolean cO;
   private static final Object2IntMap<String> cX = ad.a(() -> {
      Object2IntMap<String> $$0 = new Object2IntArrayMap();
      $$0.defaultReturnValue(Integer.MAX_VALUE);
      $$0.put("intro", 0);
      $$0.put("leaving_village", 1);
      $$0.put("in_village", 2);
      $$0.put("took_bed", 3);
      $$0.put("slept_in_bed", 3);
      $$0.put("meta_one", 4);
      $$0.put("got_paper", 5);
      $$0.put("anvil_dropped", 6);
      $$0.put("wrote_thoughts", 7);
      $$0.put("crafted_eyes", 8);
      $$0.put("thrown_eye", 9);
      $$0.put("got_book", 10);
      $$0.put("found_portal", 11);
      $$0.put("portal_opened", 12);
      $$0.put("dimension", 13);
      $$0.put("potato_village", 14);
      $$0.put("thrown_eye_part_two", 15);
      $$0.put("found_colosseum", 16);
      $$0.put("inside_colosseum", 17);
      $$0.put("got_sword", 18);
      $$0.put("got_staff", 21);
      $$0.put("composted_staff", 22);
      return $$0;
   });

   public cly(dca $$0, ir $$1, float $$2, GameProfile $$3) {
      super(bsb.bE, $$0);
      this.a_($$3.getId());
      this.cS = $$3;
      this.cp = new cqi(this.h, !$$0.C, this);
      this.cq = this.cp;
      this.b((double)$$1.u() + 0.5, (double)($$1.v() + 1), (double)$$1.w() + 0.5, $$2, 0.0F);
      this.bv = 180.0F;
   }

   public boolean a(dca $$0, ir $$1, dbx $$2) {
      if (!$$2.f()) {
         return false;
      } else if ($$2 == dbx.d) {
         return true;
      } else if (this.gz()) {
         return false;
      } else {
         cuh $$3 = this.fg();
         return $$3.d() || !$$3.b(new dtg($$0, $$1, false));
      }
   }

   public static btu.a fZ() {
      return bso.eb().a(btv.c, 1.0).a(btv.r, 0.1F).a(btv.e).a(btv.o).a(btv.g, 4.5).a(btv.h, 3.0).a(btv.f);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(e, 0.0F);
      $$0.a(f, 0);
      $$0.a(cg, (byte)0);
      $$0.a(ch, (byte)bQ.a());
      $$0.a(ci, new uk());
      $$0.a(cj, new uk());
      $$0.a(ck, "potato.quest.intro.jump.0");
      $$0.a(cl, Optional.empty());
      $$0.a(cm, Optional.empty());
      $$0.a(cn, false);
   }

   @Override
   public void l() {
      this.ah = this.O_();
      if (this.O_()) {
         this.d(false);
      }

      if (this.cv > 0) {
         this.cv--;
      }

      if (this.cw > 0) {
         this.cw--;
      }

      if (this.fU()) {
         this.i++;
         if (this.i > 100) {
            this.i = 100;
         }

         if (!this.dU().C && this.dU().R()) {
            this.a(false, true);
         }
      } else if (this.i > 0) {
         this.i++;
         if (this.i >= 110) {
            this.i = 0;
         }
      }

      this.gd();
      super.l();
      if (!this.dU().C && this.cq != null && !this.cq.a(this)) {
         this.t();
         this.cq = this.cp;
      }

      this.x();
      if (!this.dU().C) {
         this.cr.a(this);
         this.a(avz.k);
         this.a(avz.l);
         if (this.bI()) {
            this.a(avz.m);
         }

         if (this.cd()) {
            this.a(avz.o);
         }

         if (!this.fU()) {
            this.a(avz.n);
         }
      }

      int $$0 = 29999999;
      double $$1 = aym.a(this.dz(), -2.9999999E7, 2.9999999E7);
      double $$2 = aym.a(this.dF(), -2.9999999E7, 2.9999999E7);
      if ($$1 != this.dz() || $$2 != this.dF()) {
         this.a_($$1, this.dB(), $$2);
      }

      this.be++;
      cuh $$3 = this.fg();
      if (!cuh.a(this.cU, $$3)) {
         if (!cuh.b(this.cU, $$3)) {
            this.gH();
         }

         this.cU = $$3.r();
      }

      this.r();
      this.cV.a();
      this.ge();
   }

   public boolean a(String $$0, int $$1) {
      if (this.gq()) {
         Pair<String, Integer> $$2 = this.gr();
         if ($$0.equals($$2.getFirst()) && (Integer)$$2.getSecond() == $$1) {
            return true;
         }
      }

      return false;
   }

   public boolean b(String $$0, int $$1) {
      if (this.gq()) {
         Pair<String, Integer> $$2 = this.gr();
         if ($$0.equals($$2.getFirst()) && (Integer)$$2.getSecond() >= $$1) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected float fx() {
      return this.fL() ? 15.0F : super.fx();
   }

   public boolean ga() {
      return this.ca();
   }

   protected boolean gb() {
      return this.ca();
   }

   protected boolean gc() {
      return this.ca();
   }

   protected boolean gd() {
      this.cD = this.a(awj.a);
      return this.cD;
   }

   private void r() {
      cuh $$0 = this.d(bsc.f);
      if ($$0.a(cuk.pE) && !this.a(awj.a)) {
         this.b(new brh(brj.m, 200, 0, false, false, true));
      }
   }

   protected cud k() {
      return new cud();
   }

   private void x() {
      this.cx = this.cA;
      this.cy = this.cB;
      this.cz = this.cC;
      double $$0 = this.dz() - this.cA;
      double $$1 = this.dB() - this.cB;
      double $$2 = this.dF() - this.cC;
      double $$3 = 10.0;
      if ($$0 > 10.0) {
         this.cA = this.dz();
         this.cx = this.cA;
      }

      if ($$2 > 10.0) {
         this.cC = this.dF();
         this.cz = this.cC;
      }

      if ($$1 > 10.0) {
         this.cB = this.dB();
         this.cy = this.cB;
      }

      if ($$0 < -10.0) {
         this.cA = this.dz();
         this.cx = this.cA;
      }

      if ($$2 < -10.0) {
         this.cC = this.dF();
         this.cz = this.cC;
      }

      if ($$1 < -10.0) {
         this.cB = this.dB();
         this.cy = this.cB;
      }

      this.cA += $$0 * 0.25;
      this.cC += $$2 * 0.25;
      this.cB += $$1 * 0.25;
   }

   protected void ge() {
      if (this.h(bsz.d)) {
         bsz $$0;
         if (this.fN()) {
            $$0 = bsz.b;
         } else if (this.fU()) {
            $$0 = bsz.c;
         } else if (this.ch()) {
            $$0 = bsz.d;
         } else if (this.fA()) {
            $$0 = bsz.e;
         } else if (this.ca() && !this.cQ.b) {
            $$0 = bsz.f;
         } else {
            $$0 = bsz.a;
         }

         bsz $$6;
         if (this.O_() || this.bW() || this.h($$0)) {
            $$6 = $$0;
         } else if (this.h(bsz.f)) {
            $$6 = bsz.f;
         } else {
            $$6 = bsz.d;
         }

         this.b($$6);
      }
   }

   protected boolean h(bsz $$0) {
      return this.dU().a(this, this.a($$0).a(this.ds()).h(1.0E-7), true);
   }

   @Override
   public int az() {
      return Math.max(1, this.dU().ab().c(this.cQ.a ? dbw.G : dbw.F));
   }

   @Override
   protected avn aT() {
      return avo.uP;
   }

   @Override
   protected avn aU() {
      return avo.uN;
   }

   @Override
   protected avn aV() {
      return avo.uO;
   }

   @Override
   public int bU() {
      return 10;
   }

   @Override
   public void a(avn $$0, float $$1, float $$2) {
      this.dU().a(this, this.dz(), this.dB(), this.dF(), $$0, this.dj(), $$1, $$2);
   }

   public void a(avn $$0, avq $$1, float $$2, float $$3) {
   }

   @Override
   public avq dj() {
      return avq.h;
   }

   @Override
   protected int dk() {
      return 20;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 9) {
         this.z();
      } else if ($$0 == 23) {
         this.cT = false;
      } else if ($$0 == 22) {
         this.cT = true;
      } else if ($$0 == 43) {
         this.a(lb.e);
      } else {
         super.b($$0);
      }
   }

   private void a(kz $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.al.k() * 0.02;
         double $$3 = this.al.k() * 0.02;
         double $$4 = this.al.k() * 0.02;
         this.dU().a($$0, this.d(1.0), this.dC() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   protected void t() {
      this.cq = this.cp;
   }

   @Override
   protected void u() {
   }

   @Override
   public void v() {
      if (!this.dU().C && this.gb() && this.bW()) {
         this.ae();
         this.g(false);
      } else {
         super.v();
         this.ct = this.cu;
         this.cu = 0.0F;
      }
   }

   @Override
   protected void fz() {
      super.fz();
      this.fe();
      this.bl = this.dK();
   }

   @Override
   public void m_() {
      if (this.cs > 0) {
         this.cs--;
      }

      if (this.dU().al() == bpx.a && this.dU().ab().b(dbw.k)) {
         if (this.eI() < this.eZ() && this.am % 20 == 0) {
            this.c(1.0F);
         }

         if (this.cr.c() && this.am % 10 == 0) {
            this.cr.a(this.cr.a() + 1);
         }
      }

      this.h.j();
      this.ct = this.cu;
      super.m_();
      this.y((float)this.g(btv.r));
      float $$1;
      if (this.aE() && !this.eJ() && !this.ch()) {
         $$1 = Math.min(0.1F, (float)this.dx().h());
      } else {
         $$1 = 0.0F;
      }

      this.cu = this.cu + ($$1 - this.cu) * 0.4F;
      if (this.eI() > 0.0F && !this.O_()) {
         ewp $$2;
         if (this.bW() && !this.dh().dP()) {
            $$2 = this.cP().b(this.dh().cP()).c(1.0, 0.0, 1.0);
         } else {
            $$2 = this.cP().c(1.0, 0.5, 1.0);
         }

         List<brv> $$4 = this.dU().a_(this, $$2);
         List<brv> $$5 = Lists.newArrayList();

         for (brv $$6 : $$4) {
            if ($$6.ak() == bsb.O) {
               $$5.add($$6);
            } else if (!$$6.dP()) {
               this.d($$6);
            }
         }

         if (!$$5.isEmpty()) {
            this.d(ad.a($$5, this.al));
         }
      }

      this.c(this.gE());
      this.c(this.gF());
      if (!this.dU().C && (this.ad > 0.5F || this.bi()) || this.cQ.b || this.fU() || this.aF) {
         this.gB();
      }

      if (this.cK != null && this.cK.p()) {
         this.n();
         if (this.df()) {
            ewu $$7 = this.cK.ds().d(this.bC());
            float $$8 = this.cK.r();
            double $$9 = $$7.f();
            if ($$9 > (double)$$8) {
               double $$10 = $$9 / (double)$$8 * 0.1;
               this.h($$7.a(1.0 / $$9).d($$10, $$10 * 1.1, $$10));
            }
         }
      }
   }

   @Override
   protected void a(ewu $$0, double $$1, float $$2) {
      if (this.cK != null && this.cK.p() && !this.aE()) {
         float $$3 = 0.99F;
         float $$4 = 0.995F;
         this.o($$0.c * 0.99F, $$1 * 0.995F, $$0.e * 0.99F);
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   private void c(@Nullable uk $$0) {
      if ($$0 != null && (!$$0.e("Silent") || !$$0.q("Silent")) && this.dU().A.a(200) == 0) {
         String $$1 = $$0.l("id");
         bsb.a($$1).filter($$0x -> $$0x == bsb.ay).ifPresent($$0x -> {
            if (!ceu.a(this.dU(), this)) {
               this.dU().a(null, this.dz(), this.dB(), this.dF(), ceu.a(this.dU(), this.dU().A), this.dj(), 1.0F, ceu.a(this.dU().A));
            }
         });
      }
   }

   private void d(brv $$0) {
      $$0.b_(this);
   }

   public int gf() {
      return this.as.a(f);
   }

   public void t(int $$0) {
      this.as.a(f, $$0);
   }

   public void u(int $$0) {
      int $$1 = this.gf();
      this.as.a(f, $$1 + $$0);
   }

   public void v(int $$0) {
      this.bN = $$0;
      if (!this.dU().C) {
         this.gB();
         this.c(4, true);
      }
   }

   @Override
   public void a(bqt $$0) {
      super.a($$0);
      this.at();
      if (!this.O_()) {
         this.g($$0);
      }

      if ($$0 != null) {
         this.o(
            (double)(-aym.b((this.eQ() + this.dK()) * (float) (Math.PI / 180.0)) * 0.1F),
            0.1F,
            (double)(-aym.a((this.eQ() + this.dK()) * (float) (Math.PI / 180.0)) * 0.1F)
         );
      } else {
         this.o(0.0, 0.1, 0.0);
      }

      this.a(avz.N);
      this.a(avz.i.b(avz.m));
      this.a(avz.i.b(avz.n));
      this.aC();
      this.c(false);
      this.a(Optional.of(iz.a(this.dU().af(), this.du())));
   }

   @Override
   protected void eL() {
      super.eL();
      if (!this.dU().ab().b(dbw.d)) {
         this.gg();
         this.h.k();
      }
   }

   protected void gg() {
      for (int $$0 = 0; $$0 < this.h.b(); $$0++) {
         cuh $$1 = this.h.a($$0);
         if (!$$1.d() && dae.g($$1)) {
            this.h.b($$0);
         }
      }
   }

   @Override
   protected avn d(bqt $$0) {
      return $$0.j().d().a();
   }

   @Override
   protected avn n_() {
      return avo.uF;
   }

   public float d(dtc $$0) {
      float $$1 = this.h.a($$0);
      if ($$1 > 1.0F) {
         int $$2 = dae.g(this);
         cuh $$3 = this.fg();
         if ($$2 > 0 && !$$3.d()) {
            $$1 += (float)($$2 * $$2 + 1);
         }
      }

      if (bri.a(this)) {
         $$1 *= 1.0F + (float)(bri.b(this) + 1) * 0.2F;
      }

      if (this.b(brj.d)) {
         $$1 *= switch (this.c(brj.d).e()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
      }

      $$1 *= (float)this.g(btv.f);
      if (this.a(awj.a) && !dae.i(this)) {
         $$1 /= 5.0F;
      }

      if (!this.aE()) {
         $$1 /= 5.0F;
      }

      return $$1;
   }

   public boolean e(dtc $$0) {
      return !$$0.y() || this.h.f().b($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a_(this.cS.getId());
      uq $$1 = $$0.c("Inventory", 10);
      this.h.b($$1);
      this.h.k = $$0.h("SelectedItemSlot");
      this.i = $$0.g("SleepTimer");
      this.cG = $$0.j("XpP");
      this.cE = $$0.h("XpLevel");
      this.cF = $$0.h("XpTotal");
      this.cH = $$0.h("XpSeed");
      if (this.cH == 0) {
         this.cH = this.al.f();
      }

      this.t($$0.h("Score"));
      this.cr.a($$0);
      this.cQ.b($$0);
      this.f(btv.r).a((double)this.cQ.b());
      if ($$0.b("EnderItems", 9)) {
         this.co.a($$0.c("EnderItems", 10), this.dY());
      }

      if ($$0.b("ShoulderEntityLeft", 10)) {
         this.i($$0.p("ShoulderEntityLeft"));
      }

      if ($$0.b("ShoulderEntityRight", 10)) {
         this.j($$0.p("ShoulderEntityRight"));
      }

      if ($$0.b("LastDeathLocation", 10)) {
         this.a(iz.b.parse(uy.a, $$0.c("LastDeathLocation")).resultOrPartial(b::error));
      }

      if ($$0.b("current_explosion_impact_pos", 9)) {
         ewu.a.parse(uy.a, $$0.c("current_explosion_impact_pos")).resultOrPartial(b::error).ifPresent($$0x -> this.cM = $$0x);
      }

      this.cO = $$0.q("ignore_fall_damage_from_current_explosion");
      if ($$0.e("PotatoQuest")) {
         this.as.a(ck, $$0.l("PotatoQuest"));
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      uz.e($$0);
      $$0.a("Inventory", this.h.a(new uq()));
      $$0.a("SelectedItemSlot", this.h.k);
      $$0.a("SleepTimer", (short)this.i);
      $$0.a("XpP", this.cG);
      $$0.a("XpLevel", this.cE);
      $$0.a("XpTotal", this.cF);
      $$0.a("XpSeed", this.cH);
      $$0.a("Score", this.gf());
      this.cr.b($$0);
      this.cQ.a($$0);
      $$0.a("EnderItems", this.co.a(this.dY()));
      if (!this.gE().g()) {
         $$0.a("ShoulderEntityLeft", this.gE());
      }

      if (!this.gF().g()) {
         $$0.a("ShoulderEntityRight", this.gF());
      }

      this.gM().flatMap($$0x -> iz.b.encodeStart(uy.a, $$0x).resultOrPartial(b::error)).ifPresent($$1 -> $$0.a("LastDeathLocation", $$1));
      if (this.cM != null) {
         $$0.a("current_explosion_impact_pos", ad.a(ewu.a.encodeStart(uy.a, this.cM), IllegalStateException::new));
      }

      $$0.a("ignore_fall_damage_from_current_explosion", this.cO);
      $$0.a("PotatoQuest", this.as.a(ck));
   }

   @Override
   public boolean b(bqt $$0) {
      if (super.b($$0)) {
         return true;
      } else if ($$0.a(awg.o)) {
         return !this.dU().ab().b(dbw.H);
      } else if ($$0.a(awg.n)) {
         return !this.dU().ab().b(dbw.I);
      } else if ($$0.a(awg.j)) {
         return !this.dU().ab().b(dbw.J);
      } else {
         return $$0.a(awg.p) ? !this.dU().ab().b(dbw.K) : false;
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (this.cQ.a && !$$0.a(awg.e)) {
         return false;
      } else {
         this.bq = 0;
         if (this.eJ()) {
            return false;
         } else {
            if (!this.dU().C) {
               this.gB();
            }

            if ($$0.f()) {
               if (this.dU().al() == bpx.a) {
                  $$1 = 0.0F;
               }

               if (this.dU().al() == bpx.b) {
                  $$1 = Math.min($$1 / 2.0F + 1.0F, $$1);
               }

               if (this.dU().al() == bpx.d) {
                  $$1 = $$1 * 3.0F / 2.0F;
               }
            }

            return $$1 == 0.0F ? false : super.a($$0, $$1);
         }
      }
   }

   @Override
   protected void d(bso $$0) {
      super.d($$0);
      if ($$0.fX()) {
         this.gh();
      }
   }

   @Override
   public boolean eB() {
      return !this.gm().a && super.eB();
   }

   public boolean a(cly $$0) {
      eya $$1 = this.co();
      eya $$2 = $$0.co();
      if ($$1 == null) {
         return true;
      } else {
         return !$$1.a($$2) ? true : $$1.h();
      }
   }

   @Override
   protected void b(bqt $$0, float $$1) {
      this.a($$0, $$1, new bsc[]{bsc.c, bsc.d, bsc.e, bsc.f});
   }

   @Override
   protected void c(bqt $$0, float $$1) {
      this.a($$0, $$1, new bsc[]{bsc.f});
   }

   @Override
   protected void v(float $$0) {
      if (this.bK.a(cuk.xd)) {
         if (!this.dU().C) {
            this.b(avz.c.b(this.bK.f()));
         }

         if ($$0 >= 3.0F) {
            int $$1 = 1 + aym.d($$0);
            bpz $$2 = this.fF();
            this.bK.a($$1, this, d($$2));
            if (this.bK.d()) {
               if ($$2 == bpz.a) {
                  this.a(bsc.a, cuh.i);
               } else {
                  this.a(bsc.b, cuh.i);
               }

               this.bK = cuh.i;
               this.a(avo.wZ, 0.8F, 0.8F + this.dU().A.i() * 0.4F);
            }
         }
      }
   }

   @Override
   protected void f(bqt $$0, float $$1) {
      if (!this.b($$0)) {
         $$1 = this.d($$0, $$1);
         $$1 = this.e($$0, $$1);
         float var7 = Math.max($$1 - this.fB(), 0.0F);
         this.A(this.fB() - ($$1 - var7));
         float $$3 = $$1 - var7;
         if ($$3 > 0.0F && $$3 < 3.4028235E37F) {
            this.a(avz.L, Math.round($$3 * 10.0F));
         }

         if (var7 != 0.0F) {
            this.C($$0.a());
            this.eX().a($$0, var7);
            this.t(this.eI() - var7);
            if (var7 < 3.4028235E37F) {
               this.a(avz.J, Math.round(var7 * 10.0F));
            }

            this.a(dxv.o);
         }
      }
   }

   @Override
   protected boolean eg() {
      return !this.cQ.b && super.eg();
   }

   public boolean aa() {
      return false;
   }

   public void a(drr $$0, boolean $$1) {
   }

   public void a(dbb $$0) {
   }

   public void a(dqm $$0) {
   }

   public void a(drw $$0) {
   }

   public void a(dre $$0) {
   }

   public void a(cgi $$0, bpt $$1) {
   }

   public OptionalInt a(@Nullable bqe $$0) {
      return OptionalInt.empty();
   }

   public void a(int $$0, daz $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
   }

   public void a(cuh $$0, bpz $$1) {
   }

   public bqa a(brv $$0, bpz $$1) {
      if (this.O_()) {
         if ($$0 instanceof bqe) {
            this.a((bqe)$$0);
         }

         return bqa.d;
      } else {
         cuh $$2 = this.b($$1);
         cuh $$3 = $$2.r();
         bqa $$4 = $$0.a(this, $$1);
         if ($$4.a()) {
            if (this.cQ.d && $$2 == this.b($$1) && $$2.G() < $$3.G()) {
               $$2.e($$3.G());
            }

            return $$4;
         } else {
            if (!$$2.d() && $$0 instanceof bso) {
               if (this.cQ.d) {
                  $$2 = $$3;
               }

               bqa $$5 = $$2.a(this, (bso)$$0, $$1);
               if ($$5.a()) {
                  this.dU().a(dxv.r, $$0.ds(), dxv.a.a(this));
                  if ($$2.d() && !this.cQ.d) {
                     this.a($$1, cuh.i);
                  }

                  return $$5;
               }
            }

            return bqa.d;
         }
      }
   }

   @Override
   public void bN() {
      super.bN();
      this.L = 0;
   }

   @Override
   protected boolean fp() {
      return super.fp() || this.fU();
   }

   @Override
   public boolean en() {
      return !this.cQ.b;
   }

   @Override
   protected boolean aF() {
      return !this.cQ.b;
   }

   @Override
   protected ewu a(ewu $$0, bst $$1) {
      if (!this.cQ.b && $$0.d <= 0.0 && ($$1 == bst.a || $$1 == bst.b) && this.gc() && this.y()) {
         double $$2 = $$0.c;
         double $$3 = $$0.e;
         double $$4 = 0.05;

         while ($$2 != 0.0 && this.dU().b(this, this.cP().d($$2, (double)(-this.dO()), 0.0))) {
            if ($$2 < 0.05 && $$2 >= -0.05) {
               $$2 = 0.0;
            } else if ($$2 > 0.0) {
               $$2 -= 0.05;
            } else {
               $$2 += 0.05;
            }
         }

         while ($$3 != 0.0 && this.dU().b(this, this.cP().d(0.0, (double)(-this.dO()), $$3))) {
            if ($$3 < 0.05 && $$3 >= -0.05) {
               $$3 = 0.0;
            } else if ($$3 > 0.0) {
               $$3 -= 0.05;
            } else {
               $$3 += 0.05;
            }
         }

         while ($$2 != 0.0 && $$3 != 0.0 && this.dU().b(this, this.cP().d($$2, (double)(-this.dO()), $$3))) {
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

         $$0 = new ewu($$2, $$0.d, $$3);
      }

      return $$0;
   }

   private boolean y() {
      return this.aE() || this.ad < this.dO() && !this.dU().b(this, this.cP().d(0.0, (double)(this.ad - this.dO()), 0.0));
   }

   public void e(brv $$0) {
      if ($$0.cy()) {
         if (!$$0.u(this)) {
            float $$1 = (float)this.g(btv.c);
            $$1 += this.a(this.fg(), $$0);
            float $$2 = dae.a(this.fg(), $$0.ak());
            float $$3 = this.D(0.5F);
            $$1 *= 0.2F + $$3 * $$3 * 0.8F;
            $$2 *= $$3;
            this.gH();
            if ($$1 > 0.0F || $$2 > 0.0F) {
               boolean $$4 = $$3 > 0.9F;
               boolean $$5 = false;
               int $$6 = 0;
               $$6 += dae.c(this);
               if (this.cg() && $$4) {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.ux, this.dj(), 1.0F, 1.0F);
                  $$6++;
                  $$5 = true;
               }

               $$1 += this.b(bpz.a).f().a(this, $$1);
               boolean $$7 = $$4
                  && this.ad > 0.0F
                  && !this.aE()
                  && !this.p_()
                  && !this.bi()
                  && !this.b(brj.o)
                  && !this.bW()
                  && $$0 instanceof bso
                  && !this.cg();
               if ($$7) {
                  $$1 *= 1.5F;
               }

               $$1 += $$2;
               boolean $$8 = false;
               double $$9 = (double)(this.aa - this.Z);
               if ($$4 && !$$7 && !$$5 && this.aE() && $$9 < (double)this.fw()) {
                  cuh $$10 = this.b(bpz.a);
                  if ($$10.f() instanceof cwc) {
                     $$8 = true;
                  }
               }

               float $$11 = 0.0F;
               boolean $$12 = false;
               int $$13 = dae.d(this);
               if ($$0 instanceof bso) {
                  $$11 = ((bso)$$0).eI();
                  if ($$13 > 0 && !$$0.bV()) {
                     $$12 = true;
                     $$0.g(1);
                  }
               }

               ewu $$14 = $$0.dx();
               boolean $$15 = $$0.a(this.dX().a(this), $$1);
               if ($$15) {
                  if ($$6 > 0) {
                     if ($$0 instanceof bso) {
                        ((bso)$$0)
                           .q(
                              (double)((float)$$6 * 0.5F),
                              (double)aym.a(this.dK() * (float) (Math.PI / 180.0)),
                              (double)(-aym.b(this.dK() * (float) (Math.PI / 180.0)))
                           );
                     } else {
                        $$0.j(
                           (double)(-aym.a(this.dK() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F),
                           0.1,
                           (double)(aym.b(this.dK() * (float) (Math.PI / 180.0)) * (float)$$6 * 0.5F)
                        );
                     }

                     this.g(this.dx().d(0.6, 1.0, 0.6));
                     this.h(false);
                  }

                  if ($$8) {
                     float $$16 = 1.0F + dae.a(this) * $$1;

                     for (bso $$18 : this.dU().a(bso.class, $$0.cP().c(1.0, 0.25, 1.0))) {
                        if ($$18 != this && $$18 != $$0 && !this.s($$18) && (!($$18 instanceof chw) || !((chw)$$18).y()) && this.g((brv)$$18) < 9.0) {
                           $$18.q(0.4F, (double)aym.a(this.dK() * (float) (Math.PI / 180.0)), (double)(-aym.b(this.dK() * (float) (Math.PI / 180.0))));
                           $$18.a(this.dX().a(this), $$16);
                        }
                     }

                     this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.uA, this.dj(), 1.0F, 1.0F);
                     this.gi();
                  }

                  if ($$0 instanceof aqu && $$0.V) {
                     ((aqu)$$0).d.b(new afd($$0));
                     $$0.V = false;
                     $$0.g($$14);
                  }

                  if ($$7) {
                     this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.uw, this.dj(), 1.0F, 1.0F);
                     this.b($$0);
                  }

                  if (!$$7 && !$$8) {
                     if ($$4) {
                        this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.uz, this.dj(), 1.0F, 1.0F);
                     } else {
                        this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.uB, this.dj(), 1.0F, 1.0F);
                     }
                  }

                  if ($$2 > 0.0F) {
                     this.c($$0);
                  }

                  this.A($$0);
                  if ($$0 instanceof bso) {
                     dae.a((bso)$$0, this);
                  }

                  dae.b(this, $$0);
                  cuh $$19 = this.fg();
                  brv $$20 = $$0;
                  if ($$0 instanceof cgy) {
                     $$20 = ((cgy)$$0).b;
                  }

                  if (!this.dU().C && !$$19.d() && $$20 instanceof bso) {
                     $$19.a((bso)$$20, this);
                     if ($$19.d()) {
                        this.a(bpz.a, cuh.i);
                     }
                  }

                  if ($$0 instanceof bso) {
                     float $$21 = $$11 - ((bso)$$0).eI();
                     this.a(avz.G, Math.round($$21 * 10.0F));
                     if ($$13 > 0) {
                        $$0.g($$13 * 4);
                     }

                     if (this.dU() instanceof aqt && $$21 > 2.0F) {
                        int $$22 = (int)((double)$$21 * 0.5);
                        ((aqt)this.dU()).a(lb.g, $$0.dz(), $$0.e(0.5), $$0.dF(), $$22, 0.1, 0.0, 0.1, 0.2);
                     }
                  }

                  this.C(0.1F);
               } else {
                  this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.uy, this.dj(), 1.0F, 1.0F);
                  if ($$12) {
                     $$0.aC();
                  }
               }
            }
         }
      }
   }

   private float a(cuh $$0, brv $$1) {
      return drk.a($$0, $$1);
   }

   @Override
   protected void g(bso $$0) {
      this.e($$0);
   }

   public void gh() {
      this.gI().a(cuk.xd, 100);
      this.fK();
      this.dU().a(this, (byte)30);
   }

   @Override
   public void b(brv $$0) {
   }

   public void c(brv $$0) {
   }

   public void gi() {
      double $$0 = (double)(-aym.a(this.dK() * (float) (Math.PI / 180.0)));
      double $$1 = (double)aym.b(this.dK() * (float) (Math.PI / 180.0));
      if (this.dU() instanceof aqt) {
         ((aqt)this.dU()).a(lb.ah, this.dz() + $$0, this.e(0.5), this.dF() + $$1, 0, $$0, 0.0, $$1, 0.0);
      }
   }

   public void gj() {
   }

   @Override
   public void a(brv.d $$0) {
      super.a($$0);
      this.cp.b(this);
      if (this.cq != null && this.gn()) {
         this.u();
      }
   }

   public boolean g() {
      return false;
   }

   public GameProfile gk() {
      return this.cS;
   }

   public clx gl() {
      return this.h;
   }

   public clv gm() {
      return this.cQ;
   }

   @Override
   public boolean fY() {
      return this.cQ.d;
   }

   public void a(cuh $$0, cuh $$1, cpo $$2) {
   }

   public boolean gn() {
      return this.cq != this.cp;
   }

   public Either<cly.a, azo> a(ir $$0) {
      this.b($$0);
      this.i = 0;
      return Either.right(azo.a);
   }

   public void a(boolean $$0, boolean $$1) {
      super.fV();
      if (this.dU() instanceof aqt && $$1) {
         ((aqt)this.dU()).e();
      }

      this.i = $$0 ? 0 : 100;
   }

   @Override
   public void fV() {
      this.a(true, true);
   }

   public static Optional<ewu> a(aqt $$0, ir $$1, float $$2, boolean $$3, boolean $$4) {
      dtc $$5 = $$0.a_($$1);
      dfc $$6 = $$5.b();
      if ($$6 instanceof dly && ($$3 || $$5.c(dly.d) > 0) && dly.a($$0)) {
         Optional<ewu> $$7 = dly.a(bsb.bE, $$0, $$1);
         if (!$$3 && !$$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.a(dly.d, Integer.valueOf($$5.c(dly.d) - 1)), 3);
         }

         return $$7;
      } else if ($$6 instanceof deu && deu.a($$0)) {
         return deu.a(bsb.bE, $$0, $$1, $$5.c(deu.aE), $$2);
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dtc $$9 = $$0.a_($$1.c());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new ewu((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5)) : Optional.empty();
      }
   }

   public boolean go() {
      return this.fU() && this.i >= 100;
   }

   public int gp() {
      return this.i;
   }

   public void a(xe $$0, boolean $$1) {
   }

   public void a(akt $$0) {
      this.b(avz.i.b($$0));
   }

   public void a(akt $$0, int $$1) {
      this.a(avz.i.b($$0), $$1);
   }

   public void b(avw<?> $$0) {
      this.a($$0, 1);
   }

   public void a(avw<?> $$0, int $$1) {
   }

   public void a(avw<?> $$0) {
   }

   public int a(Collection<czc<?>> $$0) {
      return 0;
   }

   public void a(czc<?> $$0, List<cuh> $$1) {
   }

   public void b(List<akt> $$0) {
   }

   public int b(Collection<czc<?>> $$0) {
      return 0;
   }

   @Override
   public void fs() {
      super.fs();
      this.a(avz.E);
      if (this.cg()) {
         this.C(0.2F);
      } else {
         this.C(0.05F);
      }

      if (this.cw == 0 && this.gq()) {
         this.cw = 40;
         String $$0 = this.as.a(ck);
         if ($$0.contains(".jump.")) {
            int $$1 = $$0.length();

            while ($$1 > 0 && Character.isDigit($$0.charAt($$1 - 1))) {
               $$1--;
            }

            int $$2 = Integer.parseInt($$0.substring($$1)) + 1;
            String $$3 = $$0.substring(0, $$1);
            if (uf.a().b($$3 + $$2)) {
               this.as.a(ck, $$3 + $$2);
            }
         }
      }
   }

   public boolean gq() {
      return this.gl().e(3).a(cuk.AH);
   }

   public void c(String $$0) {
      this.c($$0, 0);
   }

   public void c(String $$0, int $$1) {
      String $$2 = "potato.quest." + $$0 + "." + $$1;
      if (uf.a().b($$2)) {
         this.as.a(ck, $$2);
      } else {
         this.as.a(ck, "potato.quest." + $$0 + ".jump." + $$1);
      }
   }

   public boolean d(String $$0) {
      if (!this.gq()) {
         return false;
      } else {
         Pair<String, Integer> $$1 = this.gr();
         int $$2 = cX.getInt($$1.getFirst());
         return $$2 > cX.getInt($$0);
      }
   }

   public Pair<String, Integer> gr() {
      String $$0 = this.as.a(ck);
      int $$1 = $$0.length();

      while ($$1 > 0 && Character.isDigit($$0.charAt($$1 - 1))) {
         $$1--;
      }

      int $$2 = Integer.parseInt($$0.substring($$1));
      String $$3 = $$0.substring(0, $$1).substring("potato.quest.".length());
      int $$4 = $$3.indexOf(".jump.");
      if ($$4 >= 0) {
         return Pair.of($$3.substring(0, $$4), $$2);
      } else {
         int $$5 = $$3.length();

         while ($$5 > 0 && $$3.charAt($$5 - 1) == '.') {
            $$5--;
         }

         return Pair.of($$3.substring(0, $$5), $$2);
      }
   }

   @Override
   public void a(ewu $$0) {
      if (this.ch() && !this.bW()) {
         double $$1 = this.bQ().d;
         double $$2 = $$1 < -0.2 ? 0.085 : 0.06;
         if ($$1 <= 0.0 || this.by || !this.dU().a_(ir.a(this.dz(), this.dB() + 1.0 - 0.1, this.dF())).u().c()) {
            ewu $$3 = this.dx();
            this.g($$3.b(0.0, ($$1 - $$3.d) * $$2, 0.0));
         }
      }

      if (this.cQ.b && !this.bW()) {
         double $$4 = this.dx().d;
         super.a($$0);
         ewu $$5 = this.dx();
         this.o($$5.c, $$4 * 0.6, $$5.e);
         this.n();
         this.b(7, false);
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bo() {
      if (this.cQ.b) {
         this.i(false);
      } else {
         super.bo();
      }
   }

   protected boolean j(ir $$0) {
      return !this.dU().a_($$0).o(this.dU(), $$0);
   }

   @Override
   public float fw() {
      return (float)this.g(btv.r);
   }

   @Override
   public boolean a(float $$0, float $$1, bqt $$2) {
      if (this.cQ.c) {
         return false;
      } else {
         if ($$0 >= 2.0F) {
            this.a(avz.t, (int)Math.round((double)$$0 * 100.0));
         }

         if (this.cO && this.cM != null) {
            double $$3 = this.cM.d;
            this.gP();
            return $$3 < this.dB() ? false : super.a((float)($$3 - this.dB()), $$1, $$2);
         } else {
            return super.a($$0, $$1, $$2);
         }
      }
   }

   public boolean gs() {
      if (!this.aE() && !this.fN() && !this.bi() && !this.b(brj.y)) {
         cuh $$0 = this.d(bsc.e);
         if (($$0.a(cuk.pj) || $$0.a(cuk.At)) && ctb.j($$0)) {
            this.gt();
            return true;
         }
      }

      return false;
   }

   public void gt() {
      this.b(7, true);
   }

   public void gu() {
      this.b(7, true);
      this.b(7, false);
   }

   @Override
   protected void br() {
      if (!this.O_()) {
         super.br();
      }
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      if (this.bi()) {
         this.aX();
         this.b($$1);
      } else {
         ir $$2 = this.g($$0);
         if (!$$0.equals($$2)) {
            dtc $$3 = this.dU().a_($$2);
            if ($$3.a(awe.bq)) {
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
   public bso.a eT() {
      return new bso.a(avo.uM, avo.uC);
   }

   @Override
   public boolean a(aqt $$0, bso $$1) {
      this.b(avz.g.b($$1.ak()));
      return true;
   }

   @Override
   public void a(dtc $$0, ewu $$1) {
      if (!this.cQ.b) {
         super.a($$0, $$1);
      }

      this.gP();
   }

   public void d(int $$0) {
      this.u($$0);
      this.cG = this.cG + (float)$$0 / (float)this.gw();
      this.cF = aym.a(this.cF + $$0, 0, Integer.MAX_VALUE);

      while (this.cG < 0.0F) {
         float $$1 = this.cG * (float)this.gw();
         if (this.cE > 0) {
            this.c(-1);
            this.cG = 1.0F + $$1 / (float)this.gw();
         } else {
            this.c(-1);
            this.cG = 0.0F;
         }
      }

      while (this.cG >= 1.0F) {
         this.cG = (this.cG - 1.0F) * (float)this.gw();
         this.c(1);
         this.cG = this.cG / (float)this.gw();
      }
   }

   public int gv() {
      return this.cH;
   }

   @Override
   public void a(cuh $$0, int $$1) {
      this.cE -= $$1;
      if (this.cE < 0) {
         this.cE = 0;
         this.cG = 0.0F;
         this.cF = 0;
      }

      this.cH = this.al.f();
   }

   public void c(int $$0) {
      this.cE += $$0;
      if (this.cE < 0) {
         this.cE = 0;
         this.cG = 0.0F;
         this.cF = 0;
      }

      if ($$0 > 0 && this.cE % 5 == 0 && (float)this.cR < (float)this.am - 100.0F) {
         float $$1 = this.cE > 30 ? 1.0F : (float)this.cE / 30.0F;
         this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.uL, this.dj(), $$1 * 0.75F, 1.0F);
         this.cR = this.am;
      }
   }

   public int gw() {
      if (this.cE >= 30) {
         return 112 + (this.cE - 30) * 9;
      } else {
         return this.cE >= 15 ? 37 + (this.cE - 15) * 5 : 7 + this.cE * 2;
      }
   }

   public void C(float $$0) {
      if (!this.cQ.a) {
         if (!this.dU().C) {
            this.cr.a($$0);
         }
      }
   }

   public Optional<cle> ac() {
      return Optional.empty();
   }

   public cou gx() {
      return this.cr;
   }

   public boolean t(boolean $$0) {
      return this.cQ.a || $$0 || this.cr.c();
   }

   public boolean gy() {
      return this.eI() > 0.0F && this.eI() < this.eZ();
   }

   public boolean gz() {
      return this.cQ.e;
   }

   public boolean a(ir $$0, iw $$1, cuh $$2) {
      if (this.cQ.e) {
         return true;
      } else {
         ir $$3 = $$0.a($$1.g());
         dtg $$4 = new dtg(this.dU(), $$3, false);
         return $$2.a($$4);
      }
   }

   @Override
   public int er() {
      if (!this.dU().ab().b(dbw.d) && !this.O_()) {
         int $$0 = this.cE * 7;
         return $$0 > 100 ? 100 : $$0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean es() {
      return true;
   }

   @Override
   public boolean cK() {
      return true;
   }

   @Override
   protected brv.c bf() {
      return this.cQ.b || this.aE() && this.cd() ? brv.c.a : brv.c.d;
   }

   public void A() {
   }

   @Override
   public xe af() {
      return xe.b(this.cS.getName());
   }

   public cqt gA() {
      return this.co;
   }

   @Override
   public cuh d(bsc $$0) {
      if ($$0 == bsc.a) {
         return this.h.f();
      } else if ($$0 == bsc.b) {
         return this.h.j.get(0);
      } else {
         return $$0.a() == bsc.a.b ? this.h.i.get($$0.b()) : cuh.i;
      }
   }

   @Override
   protected boolean a(bsc $$0) {
      return $$0.a() == bsc.a.b;
   }

   @Override
   public void a(bsc $$0, cuh $$1) {
      this.e($$1);
      if ($$0 == bsc.a) {
         this.a($$0, this.h.h.set(this.h.k, $$1), $$1);
      } else if ($$0 == bsc.b) {
         this.a($$0, this.h.j.set(0, $$1), $$1);
      } else if ($$0.a() == bsc.a.b) {
         this.a($$0, this.h.i.set($$0.b(), $$1), $$1);
      }
   }

   public boolean i(cuh $$0) {
      return this.h.f($$0);
   }

   @Override
   public Iterable<cuh> fj() {
      return Lists.newArrayList(new cuh[]{this.fg(), this.fh()});
   }

   @Override
   public Iterable<cuh> fi() {
      return this.h.i;
   }

   @Override
   public boolean c(bsc $$0) {
      return $$0 != bsc.g;
   }

   public boolean h(uk $$0) {
      if (this.bW() || !this.aE() || this.bi() || this.aF) {
         return false;
      } else if (this.gE().g()) {
         this.i($$0);
         this.g = this.dU().Z();
         return true;
      } else if (this.gF().g()) {
         this.j($$0);
         this.g = this.dU().Z();
         return true;
      } else {
         return false;
      }
   }

   protected void gB() {
      if (this.g + 20L < this.dU().Z()) {
         this.k(this.gE());
         this.i(new uk());
         this.k(this.gF());
         this.j(new uk());
      }
   }

   private void k(uk $$0) {
      if (!this.dU().C && !$$0.g()) {
         bsb.a($$0, this.dU()).ifPresent($$0x -> {
            if ($$0x instanceof btk) {
               ((btk)$$0x).b(this.aD);
            }

            $$0x.a_(this.dz(), this.dB() + 0.7F, this.dF());
            ((aqt)this.dU()).c($$0x);
         });
      }
   }

   @Override
   public abstract boolean O_();

   @Override
   public boolean bD() {
      return !this.O_() && super.bD();
   }

   @Override
   public boolean ch() {
      return !this.cQ.b && !this.O_() && super.ch();
   }

   public abstract boolean f();

   @Override
   public boolean cH() {
      return !this.cQ.b;
   }

   public exy gC() {
      return this.dU().M();
   }

   @Override
   public xe P_() {
      xs $$0 = ext.a(this.co(), this.af());
      return this.a($$0);
   }

   private xs a(xs $$0) {
      String $$1 = this.gk().getName();
      return $$0.a($$1x -> $$1x.a(new xc(xc.a.d, "/tell " + $$1 + " ")).a(this.cO()).a($$1));
   }

   @Override
   public String cG() {
      return this.gk().getName();
   }

   @Override
   protected void B(float $$0) {
      this.ap().a(e, $$0);
   }

   @Override
   public float fB() {
      return this.ap().a(e);
   }

   public boolean a(clz $$0) {
      return (this.ap().a(cg) & $$0.a()) == $$0.a();
   }

   @Override
   public btf a_(int $$0) {
      if ($$0 == 499) {
         return new btf() {
            @Override
            public cuh a() {
               return cly.this.cq.g();
            }

            @Override
            public boolean a(cuh $$0) {
               cly.this.cq.b($$0);
               return true;
            }
         };
      } else {
         final int $$1 = $$0 - 500;
         if ($$1 >= 0 && $$1 < 4) {
            return new btf() {
               @Override
               public cuh a() {
                  return cly.this.cp.q().a($$1);
               }

               @Override
               public boolean a(cuh $$0) {
                  cly.this.cp.q().a($$1, $$0);
                  cly.this.cp.a(cly.this.h);
                  return true;
               }
            };
         } else if ($$0 >= 0 && $$0 < this.h.h.size()) {
            return btf.a(this.h, $$0);
         } else {
            int $$2 = $$0 - 200;
            return $$2 >= 0 && $$2 < this.co.b() ? btf.a(this.co, $$2) : super.a_($$0);
         }
      }
   }

   public boolean gD() {
      return this.cT;
   }

   public void u(boolean $$0) {
      this.cT = $$0;
   }

   @Override
   public void i(int $$0) {
      super.i(this.cQ.a ? Math.min($$0, 1) : $$0);
   }

   @Override
   public bsi fD() {
      return this.as.a(ch) == 0 ? bsi.a : bsi.b;
   }

   public void a(bsi $$0) {
      this.as.a(ch, (byte)($$0 == bsi.a ? 0 : 1));
   }

   public uk gE() {
      return this.as.a(ci);
   }

   protected void i(uk $$0) {
      this.as.a(ci, $$0);
   }

   public uk gF() {
      return this.as.a(cj);
   }

   protected void j(uk $$0) {
      this.as.a(cj, $$0);
   }

   public float gG() {
      return (float)(1.0 / this.g(btv.e) * 20.0);
   }

   public float D(float $$0) {
      return aym.a(((float)this.be + $$0) / this.gG(), 0.0F, 1.0F);
   }

   public void gH() {
      this.be = 0;
   }

   public cud gI() {
      return this.cV;
   }

   @Override
   protected float aQ() {
      return !this.cQ.b && !this.fN() ? super.aQ() : 1.0F;
   }

   public float gJ() {
      return (float)this.g(btv.o);
   }

   public boolean gK() {
      return this.cQ.d && this.H() >= 2;
   }

   @Override
   public boolean f(cuh $$0) {
      bsc $$1 = bsq.h($$0);
      return this.d($$1).d();
   }

   @Override
   public bry e(bsz $$0) {
      return d.getOrDefault($$0, cf);
   }

   @Override
   public ImmutableList<bsz> fR() {
      return ImmutableList.of(bsz.a, bsz.f, bsz.d);
   }

   @Override
   public cuh g(cuh $$0) {
      if (!($$0.f() instanceof cvi)) {
         return cuh.i;
      } else {
         Predicate<cuh> $$1 = ((cvi)$$0.f()).d();
         cuh $$2 = cvi.a(this, $$1);
         if (!$$2.d()) {
            return $$2;
         } else {
            $$1 = ((cvi)$$0.f()).b();

            for (int $$3 = 0; $$3 < this.h.b(); $$3++) {
               cuh $$4 = this.h.a($$3);
               if ($$1.test($$4)) {
                  return $$4;
               }
            }

            return this.cQ.d ? new cuh(cuk.pL) : cuh.i;
         }
      }
   }

   @Override
   public cuh a(dca $$0, cuh $$1) {
      this.gx().a($$1);
      this.b(avz.c.b($$1.f()));
      $$0.a(null, this.dz(), this.dB(), this.dF(), avo.uE, avq.h, 0.5F, $$0.A.i() * 0.1F + 0.9F);
      if (this instanceof aqu) {
         an.A.a((aqu)this, $$1);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected boolean c(dtc $$0) {
      return this.cQ.b || super.c($$0);
   }

   @Override
   public ewu q(float $$0) {
      double $$1 = 0.22 * (this.fD() == bsi.b ? -1.0 : 1.0);
      float $$2 = aym.i($$0 * 0.5F, this.dM(), this.Q) * (float) (Math.PI / 180.0);
      float $$3 = aym.i($$0, this.bk, this.bj) * (float) (Math.PI / 180.0);
      if (this.fN() || this.fA()) {
         ewu $$4 = this.f($$0);
         ewu $$5 = this.dx();
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

         return this.l($$0).e(new ewu($$1, -0.11, 0.85).c(-$$10).a(-$$2).b(-$$3));
      } else if (this.ci()) {
         return this.l($$0).e(new ewu($$1, 0.2, -0.15).a(-$$2).b(-$$3));
      } else {
         double $$12 = this.cP().c() - 1.0;
         double $$13 = this.cf() ? -0.2 : 0.07;
         return this.l($$0).e(new ewu($$1, $$12, $$13).b(-$$3));
      }
   }

   @Override
   public boolean dT() {
      return true;
   }

   public boolean gL() {
      return this.fE() && this.fG().a(cuk.su);
   }

   @Override
   public boolean dS() {
      return false;
   }

   public Optional<iz> gM() {
      return this.cW;
   }

   public void a(Optional<iz> $$0) {
      this.cW = $$0;
   }

   @Override
   public float eQ() {
      return this.cL;
   }

   @Override
   public void m(float $$0) {
      super.m($$0);
      this.cL = $$0;
   }

   @Override
   public boolean dN() {
      return true;
   }

   @Override
   protected float fv() {
      if (this.cQ.b && !this.bW()) {
         return this.cg() ? this.cQ.a() * 2.0F : this.cQ.a();
      } else {
         return this.cg() ? 0.025999999F : 0.02F;
      }
   }

   public double gN() {
      return this.g(btv.g);
   }

   public double gO() {
      return this.g(btv.h);
   }

   public boolean b(brv $$0, double $$1) {
      return $$0.dP() ? false : this.a($$0.cP(), $$1);
   }

   public boolean a(ewp $$0, double $$1) {
      double $$2 = this.gO() + $$1;
      return $$0.e(this.bC()) < $$2 * $$2;
   }

   public boolean a(ir $$0, double $$1) {
      double $$2 = this.gN() + $$1;
      return new ewp($$0).e(this.bC()) < $$2 * $$2;
   }

   public void gP() {
      this.cN = null;
      this.cM = null;
      this.cO = false;
   }

   public static enum a {
      a,
      b(xe.c("block.minecraft.bed.no_sleep")),
      c(xe.c("block.minecraft.bed.too_far_away")),
      d(xe.c("block.minecraft.bed.obstructed")),
      e,
      f(xe.c("block.minecraft.bed.not_safe"));

      @Nullable
      private final xe g;

      private a() {
         this.g = null;
      }

      private a(xe $$0) {
         this.g = $$0;
      }

      @Nullable
      public xe a() {
         return this.g;
      }
   }
}
