import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class coa extends clz implements ecd {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final ajy<Integer> cj = akc.a(coa.class, aka.b);
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
   public bue a = new bue();
   public bue b = new bue();
   public bue c = new bue();
   public bue d = new bue();
   public bue bY = new bue();
   public bue bZ = new bue();
   private final ebr<ecd.b> cE;
   private final ecd.d cF;
   private ecd.a cG;
   cnz cH = new cnz(this::b, Collections.emptyList());

   public coa(but<? extends clz> $$0, dgj $$1) {
      super($$0, $$1);
      this.cF = new coa.a();
      this.cG = new ecd.a();
      this.cE = new ebr<>(new ecd.b(this));
      this.bN = 5;
      this.P().a(true);
      this.a(etr.m, 0.0F);
      this.a(etr.q, 8.0F);
      this.a(etr.f, 8.0F);
      this.a(etr.i, 8.0F);
      this.a(etr.o, 0.0F);
      this.a(etr.n, 0.0F);
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, $$0, this.c(bvu.n) ? 1 : 0);
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bvu.n);
      }
   }

   @Override
   public boolean a(dgm $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dt()));
   }

   @Override
   public float a(ji $$0, dgm $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ard $$0, btc $$1) {
      return this.gv() && !$$1.a(awr.d) ? true : super.a($$0, $$1);
   }

   boolean gv() {
      return this.c(bvu.o) || this.c(bvu.n);
   }

   @Override
   protected boolean o(bum $$0) {
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

   public static bwp.a m() {
      return clz.gx().a(bwq.s, 500.0).a(bwq.v, 0.3F).a(bwq.p, 1.0).a(bwq.d, 1.5).a(bwq.c, 30.0).a(bwq.m, 24.0);
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
      return !this.c(bvu.l) && !this.gv() ? this.t().b() : null;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.CC;
   }

   @Override
   protected avz o_() {
      return awa.Cy;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.CM, 10.0F, 1.0F);
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      $$0.a(this, (byte)4);
      this.a(awa.Cx, 10.0F, this.fh());
      cbb.a(this, 40);
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
         ecd.c.a($$0, this.cG, this.cF);
         if (this.fZ() || this.aa()) {
            cob.a((bvi)this);
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
      bou $$1 = bot.a();
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

      cob.a(this);
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
      float $$0 = (float)this.p() / (float)cny.c.a();
      return 40 - ayz.d(ayz.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return ayz.h($$0, (float)this.cz, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return ayz.h($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(bue $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azh $$1 = this.dY();
         dwy $$2 = this.bu();
         if ($$2.o() != dpy.a) {
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
   public boolean a(dgb $$0) {
      return this.gv();
   }

   @Override
   protected bwk<?> a(Dynamic<?> $$0) {
      return cob.a(this, $$0);
   }

   @Override
   public bwk<coa> eb() {
      return (bwk<coa>)super.eb();
   }

   @Override
   protected void ac() {
      super.ac();
      agd.a(this);
   }

   @Override
   public void a(BiConsumer<ebr<?>, ard> $$0) {
      if (this.dV() instanceof ard $$1) {
         $$0.accept(this.cE, $$1);
      }
   }

   @Contract("null->false")
   public boolean b(@Nullable bum $$0) {
      if ($$0 instanceof bvi $$1
         && this.dV() == $$0.dV()
         && bur.e.test($$0)
         && !this.s($$0)
         && $$1.aq() != but.f
         && $$1.aq() != but.bF
         && !$$1.cC()
         && !$$1.eE()
         && this.dV().F_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(ard $$0, fbb $$1, @Nullable bum $$2, int $$3) {
      btr $$4 = new btr(btt.G, 260, 0, false, false);
      bts.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      akt<un> $$1 = this.dX().a(ue.a);
      cnz.a(this::b)
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      ecd.a.a
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      akt<un> $$1 = this.dX().a(ue.a);
      if ($$0.e("anger")) {
         cnz.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
         this.gy();
      }

      if ($$0.b("listener", 10)) {
         ecd.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gA() {
      if (!this.c(bvu.l)) {
         this.a(this.t().c(), 10.0F, this.fh());
      }
   }

   public cny t() {
      return cny.a(this.gB());
   }

   private int gB() {
      return this.cH.b(this.O_());
   }

   @Override
   public void c(bum $$0) {
      this.cH.a($$0);
   }

   public void d(@Nullable bum $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bum $$0, int $$1, boolean $$2) {
      if (!this.gf() && this.b($$0)) {
         cob.a((bvi)this);
         boolean $$3 = !(this.O_() instanceof coy);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof coy && $$3 && cny.a($$4).d()) {
            this.eb().b(cem.o);
         }

         if ($$2) {
            this.gA();
         }
      }
   }

   public Optional<bvi> x() {
      return this.t().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bvi O_() {
      return this.R();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      this.eb().a(cem.aE, baf.a, 1200L);
      if ($$2 == bus.k) {
         this.b(bvu.n);
         this.eb().a(cem.aC, baf.a, (long)cob.a);
         this.a(awa.Cu, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.gf() && !this.gv()) {
         bum $$4 = $$1.d();
         this.a($$4, cny.c.a() + 20, false);
         if (this.bE.c(cem.o).isEmpty() && $$4 instanceof bvi $$5 && ($$1.b() || this.a($$5, 5.0))) {
            this.j($$5);
         }
      }

      return $$3;
   }

   public void j(bvi $$0) {
      this.eb().b(cem.ay);
      this.eb().a(cem.o, $$0);
      this.eb().b(cem.E);
      cbb.a(this, 200);
   }

   @Override
   public bup e(bvu $$0) {
      bup $$1 = super.e($$0);
      return this.gv() ? bup.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bI() {
      return !this.gv() && super.bI();
   }

   @Override
   protected void D(bum $$0) {
      if (!this.gf() && !this.eb().a(cem.aH)) {
         this.eb().a(cem.aH, baf.a, 20L);
         this.d($$0);
         cob.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cnz gs() {
      return this.cH;
   }

   @Override
   protected ceu b(dgj $$0) {
      return new cet(this, $$0) {
         @Override
         protected etq a(int $$0) {
            this.o = new etw();
            return new etq(this.o, $$0) {
               @Override
               protected float a(etm $$0, etm $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public ecd.a gt() {
      return this.cG;
   }

   @Override
   public ecd.d gu() {
      return this.cF;
   }

   class a implements ecd.d {
      private static final int b = 16;
      private final eby c = new ebs(coa.this, coa.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eby b() {
         return this.c;
      }

      @Override
      public axf<ebu> c() {
         return aww.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ebu> $$2, ebu.a $$3) {
         if (!coa.this.gf() && !coa.this.eE() && !coa.this.eb().a(cem.aI) && !coa.this.gv() && $$0.F_().a($$1)) {
            if ($$3.a() instanceof bvi $$4 && !coa.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(ard $$0, ji $$1, jr<ebu> $$2, @Nullable bum $$3, @Nullable bum $$4, float $$5) {
         if (!coa.this.eE()) {
            coa.this.bE.a(cem.aI, baf.a, 40L);
            $$0.a(coa.this, (byte)61);
            coa.this.a(awa.CN, 5.0F, coa.this.fh());
            ji $$6 = $$1;
            if ($$4 != null) {
               if (coa.this.a($$4, 30.0)) {
                  if (coa.this.eb().a(cem.aA)) {
                     if (coa.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     coa.this.d($$4);
                  } else {
                     coa.this.a($$4, 10, true);
                  }
               }

               coa.this.eb().a(cem.aA, baf.a, 100L);
            } else {
               coa.this.d($$3);
            }

            if (!coa.this.t().d()) {
               Optional<bvi> $$7 = coa.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cob.a(coa.this, $$6);
               }
            }
         }
      }
   }
}
