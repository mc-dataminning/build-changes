import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cmt extends ckv implements dzg {
   private static final Logger cb = LogUtils.getLogger();
   private static final int cc = 40;
   private static final int cd = 200;
   private static final int ce = 500;
   private static final float cf = 0.3F;
   private static final float cg = 1.0F;
   private static final float ch = 1.5F;
   private static final int ci = 30;
   private static final int cj = 24;
   private static final akg<Integer> ck = akk.a(cmt.class, aki.b);
   private static final int cl = 200;
   private static final int cm = 260;
   private static final int cn = 20;
   private static final int co = 120;
   private static final int cp = 20;
   private static final int cq = 35;
   private static final int cr = 10;
   private static final int cs = 20;
   private static final int ct = 100;
   private static final int cu = 20;
   private static final int cv = 30;
   private static final float cw = 4.5F;
   private static final float cx = 0.7F;
   private static final int cy = 30;
   private int cz;
   private int cB;
   private int cC;
   private int cD;
   public btd b = new btd();
   public btd c = new btd();
   public btd d = new btd();
   public btd e = new btd();
   public btd bZ = new btd();
   public btd ca = new btd();
   private final dyu<dzg.b> cE;
   private final dzg.d cF;
   private dzg.a cG;
   cms cH = new cms(this::c, Collections.emptyList());

   public cmt(btq<? extends ckv> $$0, dds $$1) {
      super($$0, $$1);
      this.cF = new cmt.a();
      this.cG = new dzg.a();
      this.cE = new dyu<>(new dzg.b(this));
      this.bO = 5;
      this.P().a(true);
      this.a(eqs.m, 0.0F);
      this.a(eqs.q, 8.0F);
      this.a(eqs.f, 8.0F);
      this.a(eqs.i, 8.0F);
      this.a(eqs.o, 0.0F);
      this.a(eqs.n, 0.0F);
   }

   @Override
   public zk<abz> a(arf $$0) {
      return new aca(this, $$0, this.c(bur.n) ? 1 : 0);
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bur.n);
      }
   }

   @Override
   public boolean a(ddv $$0) {
      return super.a($$0) && $$0.a(this, this.ao().n().a(this.dq()));
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bsb $$0) {
      return this.gs() && !$$0.a(awu.d) ? true : super.b($$0);
   }

   boolean gs() {
      return this.c(bur.o) || this.c(bur.n);
   }

   @Override
   protected boolean o(btj $$0) {
      return false;
   }

   @Override
   public boolean fO() {
      return true;
   }

   @Override
   protected float aS() {
      return this.Y + 0.55F;
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.s, 500.0).a(bvm.v, 0.3F).a(bvm.p, 1.0).a(bvm.d, 1.5).a(bvm.c, 30.0).a(bvm.m, 24.0);
   }

   @Override
   public boolean bg() {
      return true;
   }

   @Override
   protected float fd() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awc w() {
      return !this.c(bur.l) && !this.gs() ? this.y().b() : null;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.BU;
   }

   @Override
   protected awc n_() {
      return awd.BQ;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.Ce, 10.0F, 1.0F);
   }

   @Override
   public boolean E(btj $$0) {
      this.dS().a(this, (byte)4);
      this.a(awd.BP, 10.0F, this.fe());
      bzx.a(this, 40);
      return super.E($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
   }

   public int t() {
      return this.am.a(ck);
   }

   private void gv() {
      this.am.a(ck, this.gy());
   }

   @Override
   public void l() {
      if (this.dS() instanceof arg $$0) {
         dzg.c.a($$0, this.cG, this.cF);
         if (this.fX() || this.aa()) {
            cmu.a((buf)this);
         }
      }

      super.l();
      if (this.dS().w_()) {
         if (this.ag % this.gw() == 0) {
            this.cC = 10;
            if (!this.ba()) {
               this.dS().a(this.dx(), this.dz(), this.dD(), awd.BT, this.di(), 5.0F, this.fe(), false);
            }
         }

         this.cB = this.cz;
         if (this.cz > 0) {
            this.cz--;
         }

         this.cD = this.cC;
         if (this.cC > 0) {
            this.cC--;
         }

         switch (this.av()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void ad() {
      arg $$0 = (arg)this.dS();
      $$0.ah().a("wardenBrain");
      this.dX().a($$0, this);
      this.dS().ah().c();
      super.ad();
      if ((this.ag + this.ap()) % 120 == 0) {
         a($$0, this.dq(), this, 20);
      }

      if (this.ag % 20 == 0) {
         this.cH.a($$0, this::c);
         this.gv();
      }

      cmu.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bZ.a(this.ag);
      } else if ($$0 == 61) {
         this.cz = 10;
      } else if ($$0 == 62) {
         this.ca.a(this.ag);
      } else {
         super.b($$0);
      }
   }

   private int gw() {
      float $$0 = (float)this.t() / (float)cmr.c.a();
      return 40 - azc.d(azc.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azc.h($$0, (float)this.cB, (float)this.cz) / 10.0F;
   }

   public float K(float $$0) {
      return azc.h($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(btd $$0) {
      if ((float)$$0.a((float)this.ag) < 4500.0F) {
         azk $$1 = this.dV();
         dua $$2 = this.bt();
         if ($$2.o() != dnc.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dx() + (double)azc.b($$1, -0.7F, 0.7F);
               double $$5 = this.dz();
               double $$6 = this.dD() + (double)azc.b($$1, -0.7F, 0.7F);
               this.dS().a(new lf(ln.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akg<?> $$0) {
      if (ar.equals($$0)) {
         switch (this.av()) {
            case n:
               this.d.a(this.ag);
               break;
            case o:
               this.e.a(this.ag);
               break;
            case l:
               this.b.a(this.ag);
               break;
            case m:
               this.c.a(this.ag);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean a(ddk $$0) {
      return this.gs();
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return cmu.a(this, $$0);
   }

   @Override
   public bvg<cmt> dX() {
      return (bvg<cmt>)super.dX();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public void a(BiConsumer<dyu<?>, arg> $$0) {
      if (this.dS() instanceof arg $$1) {
         $$0.accept(this.cE, $$1);
      }
   }

   @Contract("null->false")
   public boolean c(@Nullable btj $$0) {
      if ($$0 instanceof buf $$1
         && this.dS() == $$0.dS()
         && bto.e.test($$0)
         && !this.s($$0)
         && $$1.ao() != btq.d
         && $$1.ao() != btq.bm
         && !$$1.cz()
         && !$$1.eB()
         && this.dS().A_().a($$1.cO())) {
         return true;
      }

      return false;
   }

   public static void a(arg $$0, eye $$1, @Nullable btj $$2, int $$3) {
      bsq $$4 = new bsq(bss.G, 260, 0, false, false);
      bsr.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      akz<vc> $$1 = this.dU().a(ut.a);
      cms.a(this::c)
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> cb.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      dzg.a.a
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> cb.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      akz<vc> $$1 = this.dU().a(ut.a);
      if ($$0.e("anger")) {
         cms.a(this::c)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> cb.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
         this.gv();
      }

      if ($$0.b("listener", 10)) {
         dzg.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> cb.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gx() {
      if (!this.c(bur.l)) {
         this.a(this.y().c(), 10.0F, this.fe());
      }
   }

   public cmr y() {
      return cmr.a(this.gy());
   }

   private int gy() {
      return this.cH.b(this.m());
   }

   @Override
   public void d(btj $$0) {
      this.cH.a($$0);
   }

   public void e(@Nullable btj $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable btj $$0, int $$1, boolean $$2) {
      if (!this.gd() && this.c($$0)) {
         cmu.a((buf)this);
         boolean $$3 = !(this.m() instanceof cnp);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof cnp && $$3 && cmr.a($$4).d()) {
            this.dX().b(cdi.o);
         }

         if ($$2) {
            this.gx();
         }
      }
   }

   public Optional<buf> go() {
      return this.y().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public buf m() {
      return this.R();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.dX().a(cdi.aE, bah.a, 1200L);
      if ($$2 == btp.k) {
         this.b(bur.n);
         this.dX().a(cdi.aC, bah.a, (long)cmu.a);
         this.a(awd.BM, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dS().B && !this.gd() && !this.gs()) {
         btj $$3 = $$0.d();
         this.a($$3, cmr.c.a() + 20, false);
         if (this.bC.c(cdi.o).isEmpty() && $$3 instanceof buf $$4 && ($$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(buf $$0) {
      this.dX().b(cdi.ay);
      this.dX().a(cdi.o, $$0);
      this.dX().b(cdi.E);
      bzx.a(this, 200);
   }

   @Override
   public btm e(bur $$0) {
      btm $$1 = super.e($$0);
      return this.gs() ? btm.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bF() {
      return !this.gs() && super.bF();
   }

   @Override
   protected void F(btj $$0) {
      if (!this.gd() && !this.dX().a(cdi.aH)) {
         this.dX().a(cdi.aH, bah.a, 20L);
         this.e($$0);
         cmu.a(this, $$0.ds());
      }

      super.F($$0);
   }

   @VisibleForTesting
   public cms gp() {
      return this.cH;
   }

   @Override
   protected cdq b(dds $$0) {
      return new cdp(this, $$0) {
         @Override
         protected eqr a(int $$0) {
            this.o = new eqx();
            this.o.a(true);
            return new eqr(this.o, $$0) {
               @Override
               protected float a(eqn $$0, eqn $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public dzg.a gq() {
      return this.cG;
   }

   @Override
   public dzg.d gr() {
      return this.cF;
   }

   class a implements dzg.d {
      private static final int b = 16;
      private final dzb c = new dyv(cmt.this, cmt.this.cP());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public dzb b() {
         return this.c;
      }

      @Override
      public axi<dyx> c() {
         return awz.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arg $$0, je $$1, jn<dyx> $$2, dyx.a $$3) {
         if (!cmt.this.gd() && !cmt.this.eB() && !cmt.this.dX().a(cdi.aI) && !cmt.this.gs() && $$0.A_().a($$1)) {
            if ($$3.a() instanceof buf $$4 && !cmt.this.c($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arg $$0, je $$1, jn<dyx> $$2, @Nullable btj $$3, @Nullable btj $$4, float $$5) {
         if (!cmt.this.eB()) {
            cmt.this.bC.a(cdi.aI, bah.a, 40L);
            $$0.a(cmt.this, (byte)61);
            cmt.this.a(awd.Cf, 5.0F, cmt.this.fe());
            je $$6 = $$1;
            if ($$4 != null) {
               if (cmt.this.a($$4, 30.0)) {
                  if (cmt.this.dX().a(cdi.aA)) {
                     if (cmt.this.c($$4)) {
                        $$6 = $$4.ds();
                     }

                     cmt.this.e($$4);
                  } else {
                     cmt.this.a($$4, 10, true);
                  }
               }

               cmt.this.dX().a(cdi.aA, bah.a, 100L);
            } else {
               cmt.this.e($$3);
            }

            if (!cmt.this.y().d()) {
               Optional<buf> $$7 = cmt.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cmu.a(cmt.this, $$6);
               }
            }
         }
      }
   }
}
