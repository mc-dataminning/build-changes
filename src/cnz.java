import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cnz extends cly implements ecc {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final ajy<Integer> cj = akc.a(cnz.class, aka.b);
   private static final int ck = 200;
   private static final int cl = 260;
   private static final int cm = 20;
   private static final int cn = 120;
   private static final int co = 20;
   private static final int cp = 35;
   private static final int cq = 10;
   private static final int cr = 20;
   private static final int cs = 100;
   private static final int ct = 20;
   private static final int cu = 30;
   private static final float cv = 4.5F;
   private static final float cw = 0.7F;
   private static final int cx = 30;
   private int cy;
   private int cz;
   private int cC;
   private int cD;
   public bud a = new bud();
   public bud b = new bud();
   public bud c = new bud();
   public bud d = new bud();
   public bud bY = new bud();
   public bud bZ = new bud();
   private final ebq<ecc.b> cE;
   private final ecc.d cF;
   private ecc.a cG;
   cny cH = new cny(this::b, Collections.emptyList());

   public cnz(bus<? extends cly> $$0, dgi $$1) {
      super($$0, $$1);
      this.cF = new cnz.a();
      this.cG = new ecc.a();
      this.cE = new ebq<>(new ecc.b(this));
      this.bN = 5;
      this.P().a(true);
      this.a(etq.m, 0.0F);
      this.a(etq.q, 8.0F);
      this.a(etq.f, 8.0F);
      this.a(etq.i, 8.0F);
      this.a(etq.o, 0.0F);
      this.a(etq.n, 0.0F);
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, $$0, this.c(bvt.n) ? 1 : 0);
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bvt.n);
      }
   }

   @Override
   public boolean a(dgl $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dt()));
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ard $$0, btb $$1) {
      return this.gv() && !$$1.a(awr.d) ? true : super.a($$0, $$1);
   }

   boolean gv() {
      return this.c(bvt.o) || this.c(bvt.n);
   }

   @Override
   protected boolean o(bul $$0) {
      return false;
   }

   @Override
   public boolean fU() {
      return true;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static bwo.a m() {
      return cly.gx().a(bwp.s, 500.0).a(bwp.v, 0.3F).a(bwp.p, 1.0).a(bwp.d, 1.5).a(bwp.c, 30.0).a(bwp.m, 24.0);
   }

   @Override
   public boolean bh() {
      return true;
   }

   @Override
   protected float fg() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected avz u() {
      return !this.c(bvt.l) && !this.gv() ? this.t().b() : null;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.CC;
   }

   @Override
   protected avz o_() {
      return awa.Cy;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.CM, 10.0F, 1.0F);
   }

   @Override
   public boolean c(ard $$0, bul $$1) {
      $$0.a(this, (byte)4);
      this.a(awa.Cx, 10.0F, this.fh());
      cba.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   public int p() {
      return this.al.a(cj);
   }

   private void gy() {
      this.al.a(cj, this.gB());
   }

   @Override
   public void h() {
      if (this.dV() instanceof ard $$0) {
         ecc.c.a($$0, this.cG, this.cF);
         if (this.fZ() || this.aa()) {
            coa.a((bvh)this);
         }
      }

      super.h();
      if (this.dV().B_()) {
         if (this.af % this.gz() == 0) {
            this.cC = 10;
            if (!this.bb()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awa.CB, this.dm(), 5.0F, this.fh(), false);
            }
         }

         this.cz = this.cy;
         if (this.cy > 0) {
            this.cy--;
         }

         this.cD = this.cC;
         if (this.cC > 0) {
            this.cC--;
         }

         switch (this.aw()) {
            case n:
               this.a(this.c);
               break;
            case o:
               this.a(this.d);
         }
      }
   }

   @Override
   protected void a(ard $$0) {
      bot $$1 = bos.a();
      $$1.a("wardenBrain");
      this.eb().a($$0, this);
      $$1.c();
      super.a($$0);
      if ((this.af + this.ar()) % 120 == 0) {
         a($$0, this.dt(), this, 20);
      }

      if (this.af % 20 == 0) {
         this.cH.a($$0, this::b);
         this.gy();
      }

      coa.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.a.a();
         this.bY.a(this.af);
      } else if ($$0 == 61) {
         this.cy = 10;
      } else if ($$0 == 62) {
         this.bZ.a(this.af);
      } else {
         super.b($$0);
      }
   }

   private int gz() {
      float $$0 = (float)this.p() / (float)cnx.c.a();
      return 40 - ayz.d(ayz.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return ayz.h($$0, (float)this.cz, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return ayz.h($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(bud $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azh $$1 = this.dY();
         dwx $$2 = this.bu();
         if ($$2.o() != dpx.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)ayz.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)ayz.b($$1, -0.7F, 0.7F);
               this.dV().a(new ll(lt.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(ajy<?> $$0) {
      if (aq.equals($$0)) {
         switch (this.aw()) {
            case n:
               this.c.a(this.af);
               break;
            case o:
               this.d.a(this.af);
               break;
            case l:
               this.a.a(this.af);
               break;
            case m:
               this.b.a(this.af);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(dga $$0) {
      return this.gv();
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return coa.a(this, $$0);
   }

   @Override
   public bwj<cnz> eb() {
      return (bwj<cnz>)super.eb();
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public void a(BiConsumer<ebq<?>, ard> $$0) {
      if (this.dV() instanceof ard $$1) {
         $$0.accept(this.cE, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bul $$0) {
      if ($$0 instanceof bvh $$1
         && this.dV() == $$0.dV()
         && buq.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != bus.f
         && $$1.aq() != bus.bF
         && !$$1.cC()
         && !$$1.eE()
         && this.dV().F_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(ard $$0, fba $$1, @Nullable bul $$2, int $$3) {
      btq $$4 = new btq(bts.G, 260, 0, false, false);
      btr.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      akt<un> $$1 = this.dX().a(ue.a);
      cny.a(this::b)
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      ecc.a.a
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      akt<un> $$1 = this.dX().a(ue.a);
      if ($$0.e("anger")) {
         cny.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
         this.gy();
      }

      if ($$0.b("listener", 10)) {
         ecc.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gA() {
      if (!this.c(bvt.l)) {
         this.a(this.t().c(), 10.0F, this.fh());
      }
   }

   public cnx t() {
      return cnx.a(this.gB());
   }

   private int gB() {
      return this.cH.b(this.O_());
   }

   @Override
   public void c(bul $$0) {
      this.cH.a($$0);
   }

   public void d(@Nullable bul $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bul $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         coa.a((bvh)this);
         boolean $$3 = !(this.O_() instanceof cox);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof cox && $$3 && cnx.a($$4).d()) {
            this.eb().b(cel.o);
         }

         if ($$2) {
            this.gA();
         }
      }
   }

   public Optional<bvh> x() {
      return this.t().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bvh O_() {
      return this.R();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.eb().a(cel.aE, baf.a, 1200L);
      if ($$2 == bur.k) {
         this.b(bvt.n);
         this.eb().a(cel.aC, baf.a, (long)coa.a);
         this.a(awa.Cu, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(ard $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gf() && !this.gv()) {
         bul $$4 = $$1.d();
         this.a($$4, cnx.c.a() + 20, false);
         if (this.bE.c(cel.o).isEmpty() && $$4 instanceof bvh $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bvh $$0) {
      this.eb().b(cel.ay);
      this.eb().a(cel.o, $$0);
      this.eb().b(cel.E);
      cba.a(this, 200);
   }

   @Override
   public buo e(bvt $$0) {
      buo $$1 = super.e($$0);
      return this.gv() ? buo.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bI() {
      return !this.gv() && super.bI();
   }

   @Override
   protected void D(bul $$0) {
      if (!this.gf() && !this.eb().a(cel.aH)) {
         this.eb().a(cel.aH, baf.a, 20L);
         this.d($$0);
         coa.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cny gs() {
      return this.cH;
   }

   @Override
   protected cet b(dgi $$0) {
      return new ces(this, $$0) {
         @Override
         protected etp a(int $$0) {
            this.o = new etv();
            return new etp(this.o, $$0) {
               @Override
               protected float a(etl $$0, etl $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public ecc.a gt() {
      return this.cG;
   }

   @Override
   public ecc.d gu() {
      return this.cF;
   }

   class a implements ecc.d {
      private static final int b = 16;
      private final ebx c = new ebr(cnz.this, cnz.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public ebx b() {
         return this.c;
      }

      @Override
      public axf<ebt> c() {
         return aww.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebt> $$2, ebt.a $$3) {
         if (!cnz.this.gf() && !cnz.this.eE() && !cnz.this.eb().a(cel.aI) && !cnz.this.gv() && $$0.F_().a($$1)) {
            if ($$3.a() instanceof bvh $$4 && !cnz.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ebt> $$2, @Nullable bul $$3, @Nullable bul $$4, float $$5) {
         if (!cnz.this.eE()) {
            cnz.this.bE.a(cel.aI, baf.a, 40L);
            $$0.a(cnz.this, (byte)61);
            cnz.this.a(awa.CN, 5.0F, cnz.this.fh());
            ji $$6 = $$1;
            if ($$4 != null) {
               if (cnz.this.a($$4, 30.0)) {
                  if (cnz.this.eb().a(cel.aA)) {
                     if (cnz.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     cnz.this.d($$4);
                  } else {
                     cnz.this.a($$4, 10, true);
                  }
               }

               cnz.this.eb().a(cel.aA, baf.a, 100L);
            } else {
               cnz.this.d($$3);
            }

            if (!cnz.this.t().d()) {
               Optional<bvh> $$7 = cnz.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  coa.a(cnz.this, $$6);
               }
            }
         }
      }
   }
}
