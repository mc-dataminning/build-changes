import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class bwt extends bwr implements bwf, bwp, bxo {
   private static final Logger a = LogUtils.getLogger();
   private static final akg<Byte> b = akk.a(bwt.class, aki.a);
   private static final int c = 1;
   private static final int d = 2;
   private static final int bD = 4;
   protected static final int h = 1;
   private static final kn bE = new kn(1, 0, 1);
   private static final List<bwc> bF = List.of(bwc.f, bwc.e, bwc.d, bwc.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bs = 0.25F;
   public static final int bt = 2;
   private static final double bG = Math.sqrt(2.04F) - 0.6F;
   protected static final ald bu = ald.b("random_spawn_bonus");
   public int bv;
   protected int bw;
   protected ccp bx;
   protected ccq by;
   protected cco bz;
   private final ccl bH;
   protected cgb bA;
   protected final cdo bB;
   protected final cdo bC;
   @Nullable
   private bwr bI;
   private final cgy bJ;
   private bvw bK = new bvw();
   private bvq bL = bvq.d;
   private boolean bM;
   private boolean bN;
   private final Map<evk, Float> bO = Maps.newEnumMap(evk.class);
   private Optional<alc<exq>> bP = Optional.empty();
   private long bQ;
   @Nullable
   private bwp.a bR;
   private jj bS = jj.c;
   private float bT = -1.0F;

   protected bwt(bwb<? extends bwt> $$0, dhp $$1) {
      super($$0, $$1);
      this.bB = new cdo();
      this.bC = new cdo();
      this.bx = new ccp(this);
      this.by = new ccq(this);
      this.bz = new cco(this);
      this.bH = this.I();
      this.bA = this.b($$1);
      this.bJ = new cgy(this);
      if ($$1 instanceof arn) {
         this.D();
      }
   }

   protected void D() {
   }

   public static bxw.a E() {
      return bwr.ed().a(bxx.m, 16.0);
   }

   protected cgb b(dhp $$0) {
      return new cga(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(evk $$0) {
      bwt $$2;
      label17: {
         if (this.dl() instanceof bwt $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bO.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(evk $$0, float $$1) {
      this.bO.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   public void H() {
   }

   protected ccl I() {
      return new ccl(this);
   }

   public ccp J() {
      return this.bx;
   }

   public ccq L() {
      return this.dl() instanceof bwt $$0 ? $$0.L() : this.by;
   }

   public cco N() {
      return this.bz;
   }

   public cgb O() {
      return this.dl() instanceof bwt $$0 ? $$0.O() : this.bA;
   }

   @Nullable
   @Override
   public bwr cW() {
      bvs $$0 = this.cZ();
      if (!this.gf() && $$0 instanceof bwt $$1 && $$0.cc()) {
         return $$1;
      }

      return null;
   }

   public cgy P() {
      return this.bJ;
   }

   @Nullable
   @Override
   public bwr f() {
      return this.bI;
   }

   @Nullable
   protected final bwr Q() {
      return this.eb().c(cft.p).orElse(null);
   }

   public void h(@Nullable bwr $$0) {
      this.bI = $$0;
   }

   @Override
   public boolean a(bwb<?> $$0) {
      return $$0 != bwb.ad;
   }

   public boolean a(cyt $$0) {
      return false;
   }

   public void R() {
      this.a(edm.m);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   public int S() {
      return 80;
   }

   public void T() {
      this.b(this.u());
   }

   @Override
   public void az() {
      super.az();
      bqb $$0 = bqa.a();
      $$0.a("mobBaseTick");
      if (this.bK() && this.ae.a(1000) < this.bv++) {
         this.j();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(buh $$0) {
      this.j();
      super.h($$0);
   }

   private void j() {
      this.bv = -this.S();
   }

   @Override
   protected int e(arn $$0) {
      if (this.bw > 0) {
         int $$1 = this.bw;

         for (bwc $$2 : bwc.j) {
            if ($$2.g()) {
               cxy $$3 = this.a($$2);
               if (!$$3.f() && this.bL.b($$2) <= 1.0F) {
                  $$1 += 1 + this.ae.a(3);
               }
            }
         }

         return $$1;
      } else {
         return this.bw;
      }
   }

   public void U() {
      if (this.dV().C) {
         this.eX();
      } else {
         this.dV().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.U();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C && this.af % 5 == 0) {
         this.V();
      }
   }

   protected void V() {
      boolean $$0 = !(this.cW() instanceof bwt);
      boolean $$1 = !(this.dk() instanceof csf);
      this.bB.a(cdn.a.a, $$0);
      this.bB.a(cdn.a.c, $$0 && $$1);
      this.bB.a(cdn.a.b, $$0);
   }

   @Override
   protected void D(float $$0) {
      this.bH.a();
   }

   @Nullable
   protected awj u() {
      return null;
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fM());
      $$0.a("PersistenceRequired", this.bN);
      if (!this.bK.a()) {
         alb<ut> $$1 = this.dX().a(uk.a);
         $$0.a("equipment", (ut)bvw.a.encodeStart($$1, this.bK).getOrThrow());
      }

      if (!this.bL.equals(bvq.d)) {
         $$0.a("drop_chances", (ut)bvq.e.encodeStart(uk.a, this.bL).getOrThrow());
      }

      this.a($$0, this.bR);
      $$0.a("LeftHanded", this.gg());
      if (this.bP.isPresent()) {
         $$0.a("DeathLootTable", this.bP.get().a().toString());
      }

      if (this.bQ != 0L) {
         $$0.a("DeathLootTableSeed", this.bQ);
      }

      if (this.gf()) {
         $$0.a("NoAI", this.gf());
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a_($$0.q("CanPickUpLoot"));
      this.bN = $$0.q("PersistenceRequired");
      if ($$0.e("equipment")) {
         alb<ut> $$1 = this.dX().a(uk.a);
         bvw.a.parse($$1, $$0.c("equipment")).resultOrPartial($$0x -> a.warn("Failed to parse equipment: {}", $$0x)).ifPresent($$0x -> this.bK = $$0x);
      } else {
         this.bK = new bvw();
      }

      if ($$0.e("drop_chances")) {
         bvq.e
            .parse(uk.a, $$0.c("drop_chances"))
            .resultOrPartial($$0x -> a.warn("Failed to parse mob drop chances: {}", $$0x))
            .ifPresent($$0x -> this.bL = $$0x);
      } else {
         this.bL = bvq.d;
      }

      this.c($$0);
      this.u($$0.q("LeftHanded"));
      if ($$0.b("DeathLootTable", 8)) {
         this.bP = Optional.of(alc.a(me.bn, ald.a($$0.l("DeathLootTable"))));
      } else {
         this.bP = Optional.empty();
      }

      this.bQ = $$0.i("DeathLootTableSeed");
      this.t($$0.q("NoAI"));
   }

   @Override
   protected void b(arn $$0, buh $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bP = Optional.empty();
   }

   @Override
   public final Optional<alc<exq>> ea() {
      return this.bP.isPresent() ? this.bP : super.ea();
   }

   @Override
   public long eI() {
      return this.bQ;
   }

   public void H(float $$0) {
      this.bh = $$0;
   }

   public void I(float $$0) {
      this.bg = $$0;
   }

   public void J(float $$0) {
      this.bf = $$0;
   }

   @Override
   public void C(float $$0) {
      super.C($$0);
      this.H($$0);
   }

   public void W() {
      this.O().m();
      this.J(0.0F);
      this.I(0.0F);
      this.C(0.0F);
   }

   @Override
   public void k_() {
      super.k_();
      bqb $$0 = bqa.a();
      $$0.a("looting");
      if (this.dV() instanceof arn $$1 && this.fM() && this.bK() && !this.bb && $$1.O().c(dhl.c)) {
         kn $$2 = this.X();

         for (cmn $$4 : this.dV().a(cmn.class, this.cR().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dQ() && !$$4.f().f() && !$$4.o() && this.c($$1, $$4.f())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected kn X() {
      return bE;
   }

   protected void a(arn $$0, cmn $$1) {
      cxy $$2 = $$1.f();
      cxy $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.at();
         }
      }
   }

   public cxy b(arn $$0, cxy $$1) {
      bwc $$2 = this.g($$1);
      if (!this.a($$1, $$2)) {
         return cxy.k;
      } else {
         cxy $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bwc.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.h($$1)) {
            double $$5 = (double)this.bL.b($$2);
            if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            cxy $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return cxy.k;
         }
      }
   }

   protected void b(bwc $$0, cxy $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bN = true;
   }

   public void g(bwc $$0) {
      this.bL = this.bL.a($$0);
   }

   protected boolean a(cxy $$0, cxy $$1, bwc $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bwc.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(cxy $$0, cxy $$1, bwc $$2) {
      if (dej.a($$1, dei.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, bxx.a, $$2);
         double $$4 = this.a($$1, bxx.a, $$2);
         double $$5 = this.a($$0, bxx.b, $$2);
         double $$6 = this.a($$1, bxx.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(cxy $$0, cxy $$1, bwc $$2) {
      axp<cxu> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, bxx.c, $$2);
      double $$5 = this.a($$1, bxx.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(cxy $$0, js<bxs> $$1, bwc $$2) {
      double $$3 = this.eZ().b($$1) ? this.i($$1) : 0.0;
      dam $$4 = $$0.a(kx.o, dam.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(cxy $$0, cxy $$1) {
      Set<Entry<js<deh>>> $$2 = $$1.a(kx.l, den.a).b();
      Set<Entry<js<deh>>> $$3 = $$0.a(kx.l, den.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kx.g) && !$$1.c(kx.g);
      }
   }

   public boolean h(cxy $$0) {
      return true;
   }

   public boolean c(arn $$0, cxy $$1) {
      return this.h($$1);
   }

   @Nullable
   public axp<cxu> Y() {
      return null;
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Z() {
      return this.bZ();
   }

   protected boolean aa() {
      return false;
   }

   @Override
   public void dH() {
      if (this.dV().an() == btn.a && this.aa()) {
         this.at();
      } else if (!this.fZ() && !this.Z()) {
         bvs $$0 = this.dV().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.aq().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.at();
            }

            int $$4 = this.aq().f().g();
            int $$5 = $$4 * $$4;
            if (this.bc > 600 && this.ae.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.at();
            } else if ($$1 < (double)$$5) {
               this.bc = 0;
            }
         }
      } else {
         this.bc = 0;
      }
   }

   @Override
   protected final void ft() {
      this.bc++;
      bqb $$0 = bqa.a();
      $$0.a("sensing");
      this.bJ.a();
      $$0.c();
      int $$1 = this.af + this.ar();
      if ($$1 % 2 != 0 && this.af > 1) {
         $$0.a("targetSelector");
         this.bC.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bB.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bC.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bB.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bA.c();
      $$0.c();
      $$0.a("mob tick");
      this.a((arn)this.dV());
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.by.a();
      $$0.b("look");
      this.bx.a();
      $$0.b("jump");
      this.bz.b();
      $$0.c();
      $$0.c();
      this.ab();
   }

   protected void ab() {
      agj.a(this.dV(), this, this.bB);
   }

   protected void a(arn $$0) {
   }

   public int ac() {
      return 40;
   }

   public int ad() {
      return 75;
   }

   protected void af() {
      float $$0 = (float)this.ad();
      float $$1 = this.cA();
      float $$2 = azk.h(this.aU - $$1);
      float $$3 = azk.a(azk.h(this.aU - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int ag() {
      return 10;
   }

   public void a(bvs $$0, float $$1, float $$2) {
      double $$3 = $$0.dA() - this.dA();
      double $$4 = $$0.dG() - this.dG();
      double $$6;
      if ($$0 instanceof bwr $$5) {
         $$6 = $$5.dE() - this.dE();
      } else {
         $$6 = ($$0.cR().b + $$0.cR().e) / 2.0 - this.dE();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azk.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azk.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.x(this.a(this.dN(), $$10, $$2));
      this.w(this.a(this.dL(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azk.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bwb<? extends bwt> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      jj $$5 = $$3.e();
      return bwa.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(dhq $$0, bwa $$1) {
      return true;
   }

   public boolean a(dhs $$0) {
      return !$$0.d(this.cR()) && $$0.f(this);
   }

   public int ai() {
      return 4;
   }

   public boolean q(int $$0) {
      return false;
   }

   @Override
   public int cE() {
      if (this.f() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eF() - this.eT() * 0.33F);
         $$0 -= (3 - this.dV().an().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   public cxy aj() {
      return this.a(bwc.g);
   }

   public boolean ak() {
      return this.d(bwc.h);
   }

   public boolean fW() {
      return this.d(bwc.g);
   }

   public void i(cxy $$0) {
      this.b(bwc.g, $$0);
   }

   @Override
   public cxy a(bwc $$0) {
      return this.bK.a($$0);
   }

   @Override
   public void a(bwc $$0, cxy $$1) {
      this.d($$1);
      cxy $$2 = this.bK.a($$0, $$1);
      this.a($$0, $$2, $$1);
   }

   public btj h(final bwc $$0) {
      return new feg() {
         @Override
         public cxy f() {
            return bwt.this.a($$0);
         }

         @Override
         public void b(cxy $$0x) {
            bwt.this.a($$0, $$0);
            if (!$$0.f()) {
               bwt.this.g($$0);
               bwt.this.fY();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(cqi $$0x) {
            return $$0.dk() == bwt.this || $$0.b(bwt.this, 4.0);
         }
      };
   }

   @Override
   protected void a(arn $$0, buh $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bwc $$3 : bwc.j) {
         cxy $$4 = this.a($$3);
         float $$5 = this.bL.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bL.c($$3);
            bvs var11 = $$1.d();
            if (var11 instanceof bwr) {
               bwr $$7 = (bwr)var11;
               if (this.dV() instanceof arn $$8) {
                  $$5 = dej.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dej.a($$4, dei.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, cxy.k);
            }
         }
      }
   }

   public bvq fX() {
      return this.bL;
   }

   public void b(arn $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bwc> a(arn $$0, Predicate<cxy> $$1) {
      Set<bwc> $$2 = new HashSet<>();

      for (bwc $$3 : bwc.j) {
         cxy $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bL.c($$3)) {
               this.a($$3, cxy.k);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private exo g(arn $$0) {
      return new exo.a($$0).a(faf.f, this.dt()).a(faf.a, this).a(fae.h);
   }

   public void a(bwe $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alc<exq> $$0, Map<bwc, Float> $$1) {
      if (this.dV() instanceof arn $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azs $$0, bto $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dV().an() == btn.d ? 0.1F : 0.25F;
         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         boolean $$4 = true;

         for (bwc $$5 : bF) {
            cxy $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               cxu $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new cxy($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static cxu a(bwc $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return cyc.qh;
            } else if ($$1 == 1) {
               return cyc.qx;
            } else if ($$1 == 2) {
               return cyc.ql;
            } else if ($$1 == 3) {
               return cyc.qp;
            } else if ($$1 == 4) {
               return cyc.qt;
            }
         case e:
            if ($$1 == 0) {
               return cyc.qi;
            } else if ($$1 == 1) {
               return cyc.qy;
            } else if ($$1 == 2) {
               return cyc.qm;
            } else if ($$1 == 3) {
               return cyc.qq;
            } else if ($$1 == 4) {
               return cyc.qu;
            }
         case d:
            if ($$1 == 0) {
               return cyc.qj;
            } else if ($$1 == 1) {
               return cyc.qz;
            } else if ($$1 == 2) {
               return cyc.qn;
            } else if ($$1 == 3) {
               return cyc.qr;
            } else if ($$1 == 4) {
               return cyc.qv;
            }
         case c:
            if ($$1 == 0) {
               return cyc.qk;
            } else if ($$1 == 1) {
               return cyc.qA;
            } else if ($$1 == 2) {
               return cyc.qo;
            } else if ($$1 == 3) {
               return cyc.qs;
            } else if ($$1 == 4) {
               return cyc.qw;
            }
         default:
            return null;
      }
   }

   protected void a(dig $$0, azs $$1, bto $$2) {
      this.b($$0, $$1, $$2);

      for (bwc $$3 : bwc.j) {
         if ($$3.a() == bwc.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dig $$0, azs $$1, bto $$2) {
      this.a($$0, bwc.a, $$1, 0.25F, $$2);
   }

   protected void a(dig $$0, azs $$1, bwc $$2, bto $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dig $$0, bwc $$1, azs $$2, float $$3, bto $$4) {
      cxy $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dej.a($$5, $$0.F_(), dfv.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      bxt $$5 = Objects.requireNonNull(this.g(bxx.m));
      if (!$$5.b(bu)) {
         $$5.d(new bxv(bu, $$4.a(0.0, 0.11485000000000001), bxv.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void fY() {
      this.bN = true;
   }

   @Override
   public void a(bwc $$0, float $$1) {
      this.bL = this.bL.a($$0, $$1);
   }

   @Override
   public boolean fM() {
      return this.bM;
   }

   public void a_(boolean $$0) {
      this.bM = $$0;
   }

   @Override
   protected boolean f(bwc $$0) {
      return this.fM();
   }

   public boolean fZ() {
      return this.bN;
   }

   @Override
   public final btq a(cqi $$0, btp $$1) {
      if (!this.bK()) {
         return btq.e;
      } else {
         btq $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(edm.r, $$0);
            return $$2;
         } else {
            btq $$3 = super.a($$0, $$1);
            if ($$3 != btq.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(edm.r, $$0);
                  return $$2;
               } else {
                  return btq.e;
               }
            }
         }
      }
   }

   private btq c(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.vP)) {
         btq $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof czf) {
         if (this.dV() instanceof arn) {
            czf $$4 = (czf)$$2.h();
            Optional<bwt> $$5 = $$4.a($$0, this, (bwb<? extends bwt>)this.aq(), (arn)this.dV(), this.dt(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return btq.e;
            }
         }

         return btq.b;
      } else {
         return btq.e;
      }
   }

   protected void a(cqi $$0, bwt $$1) {
   }

   protected btq b(cqi $$0, btp $$1) {
      return btq.e;
   }

   public boolean ga() {
      return this.a(this.dv());
   }

   public boolean a(jj $$0) {
      return this.bT == -1.0F ? true : this.bS.j($$0) < (double)(this.bT * this.bT);
   }

   public void a(jj $$0, int $$1) {
      this.bS = $$0;
      this.bT = (float)$$1;
   }

   public jj gb() {
      return this.bS;
   }

   public float gc() {
      return this.bT;
   }

   public void gd() {
      this.bT = -1.0F;
   }

   public boolean ge() {
      return this.bT != -1.0F;
   }

   @Nullable
   public <T extends bwt> T a(bwb<T> $$0, bvm $$1, bwa $$2, bvm.a<T> $$3) {
      if (this.dQ()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dV(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dV() instanceof arn $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.at();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bwt> T a(bwb<T> $$0, bvm $$1, bvm.a<T> $$2) {
      return this.a($$0, $$1, bwa.i, $$2);
   }

   @Nullable
   @Override
   public bwp.a T_() {
      return this.bR;
   }

   @Override
   public void a(@Nullable bwp.a $$0) {
      this.bR = $$0;
   }

   @Override
   public void A() {
      if (this.T_() == null) {
         this.gd();
      }
   }

   @Override
   public void B() {
      bwp.super.B();
      this.bB.a(cdn.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cnb);
   }

   @Override
   public boolean a(bvs $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.O_()) {
         this.y();
      }

      return $$2;
   }

   @Override
   public boolean di() {
      return super.di() && !this.gf();
   }

   @Override
   public boolean dj() {
      return super.dj() && !this.gf();
   }

   public void t(boolean $$0) {
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.al.a(b);
      this.al.a(b, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gf() {
      return (this.al.a(b) & 1) != 0;
   }

   public boolean gg() {
      return (this.al.a(b) & 2) != 0;
   }

   public boolean gh() {
      return (this.al.a(b) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bwk fx() {
      return this.gg() ? bwk.a : bwk.b;
   }

   public boolean i(bwr $$0) {
      return this.gi().c($$0.eM());
   }

   protected fcp gi() {
      bvs $$0 = this.dk();
      fcp $$3;
      if ($$0 != null) {
         fcp $$1 = $$0.cR();
         fcp $$2 = this.cR();
         $$3 = new fcp(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cR();
      }

      return $$3.c(bG, 0.0, bG);
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      float $$2 = (float)this.h(bxx.c);
      cxy $$3 = this.dZ();
      buh $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dW().b((bwr)this));
      $$2 = dej.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bwr $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azk.a(this.dL() * (float) (Math.PI / 180.0)), (double)(-azk.b(this.dL() * (float) (Math.PI / 180.0))));
            this.i(this.dy().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bwr $$8) {
            $$3.a($$8, this);
         }

         dej.a($$0, $$1, $$4);
         this.B($$1);
         this.gj();
      }

      return $$5;
   }

   protected void gj() {
   }

   protected boolean gk() {
      if (this.dV().V() && !this.dV().C) {
         float $$0 = this.bx();
         jj $$1 = jj.a(this.dA(), this.dE(), this.dG());
         boolean $$2 = this.bl() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dV().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axp<eus> $$0) {
      if (this.O().o()) {
         super.c($$0);
      } else {
         this.i(this.dy().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void gl() {
      this.c($$0 -> true);
      this.eb().h();
   }

   public void c(Predicate<cdn> $$0) {
      this.bB.a($$0);
   }

   @Override
   protected void cD() {
      super.cD();

      for (bwc $$0 : bwc.j) {
         cxy $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public cxy dI() {
      czf $$0 = czf.a(this.aq());
      return $$0 == null ? null : new cxy($$0);
   }

   @Override
   protected void f(js<bxs> $$0) {
      super.f($$0);
      if ($$0.a(bxx.m) || $$0.a(bxx.E)) {
         this.O().e();
      }
   }
}
