import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;

public class cnw extends cly implements eba {
   private static final Logger ca = LogUtils.getLogger();
   private static final int cb = 40;
   private static final int cc = 200;
   private static final int cd = 500;
   private static final float ce = 0.3F;
   private static final float cf = 1.0F;
   private static final float cg = 1.5F;
   private static final int ch = 30;
   private static final int ci = 24;
   private static final akm<Integer> cj = akq.a(cnw.class, ako.b);
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
   private int cB;
   private int cC;
   private int cD;
   public bud a = new bud();
   public bud b = new bud();
   public bud c = new bud();
   public bud d = new bud();
   public bud bY = new bud();
   public bud bZ = new bud();
   private final eao<eba.b> cE;
   private final eba.d cF;
   private eba.a cG;
   cnv cH = new cnv(this::b, Collections.emptyList());

   public cnw(bus<? extends cly> $$0, dfm $$1) {
      super($$0, $$1);
      this.cF = new cnw.a();
      this.cG = new eba.a();
      this.cE = new eao<>(new eba.b(this));
      this.bN = 5;
      this.L().a(true);
      this.a(esm.m, 0.0F);
      this.a(esm.q, 8.0F);
      this.a(esm.f, 8.0F);
      this.a(esm.i, 8.0F);
      this.a(esm.o, 0.0F);
      this.a(esm.n, 0.0F);
   }

   @Override
   public zq<acf> a(arn $$0) {
      return new acg(this, $$0, this.c(bvt.n) ? 1 : 0);
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      if ($$0.p() == 1) {
         this.b(bvt.n);
      }
   }

   @Override
   public boolean a(dfp $$0) {
      return super.a($$0) && $$0.a(this, this.aq().n().a(this.dt()));
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(arp $$0, btb $$1) {
      return this.gq() && !$$1.a(axe.d) ? true : super.a($$0, $$1);
   }

   boolean gq() {
      return this.c(bvt.o) || this.c(bvt.n);
   }

   @Override
   protected boolean o(bul $$0) {
      return false;
   }

   @Override
   public boolean fS() {
      return true;
   }

   @Override
   protected float aU() {
      return this.X + 0.55F;
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.s, 500.0).a(bwp.v, 0.3F).a(bwp.p, 1.0).a(bwp.d, 1.5).a(bwp.c, 30.0).a(bwp.m, 24.0);
   }

   @Override
   public boolean bh() {
      return true;
   }

   @Override
   protected float fe() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected awm t() {
      return !this.c(bvt.l) && !this.gq() ? this.v().b() : null;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.BS;
   }

   @Override
   protected awm n_() {
      return awn.BO;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.Cc, 10.0F, 1.0F);
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      $$0.a(this, (byte)4);
      this.a(awn.BN, 10.0F, this.ff());
      cba.a(this, 40);
      return super.c($$0, $$1);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cj, 0);
   }

   public int q() {
      return this.al.a(cj);
   }

   private void gt() {
      this.al.a(cj, this.gw());
   }

   @Override
   public void h() {
      if (this.dV() instanceof arp $$0) {
         eba.c.a($$0, this.cG, this.cF);
         if (this.aj() || this.W()) {
            cnx.a((bvh)this);
         }
      }

      super.h();
      if (this.dV().A_()) {
         if (this.af % this.gu() == 0) {
            this.cC = 10;
            if (!this.bb()) {
               this.dV().a(this.dA(), this.dC(), this.dG(), awn.BR, this.dm(), 5.0F, this.ff(), false);
            }
         }

         this.cB = this.cy;
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
   protected void a(arp $$0) {
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
         this.gt();
      }

      cnx.a(this);
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

   private int gu() {
      float $$0 = (float)this.q() / (float)cnu.c.a();
      return 40 - azm.d(azm.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float J(float $$0) {
      return azm.h($$0, (float)this.cB, (float)this.cy) / 10.0F;
   }

   public float K(float $$0) {
      return azm.h($$0, (float)this.cD, (float)this.cC) / 10.0F;
   }

   private void a(bud $$0) {
      if ((float)$$0.a((float)this.af) < 4500.0F) {
         azu $$1 = this.dY();
         dvv $$2 = this.bu();
         if ($$2.o() != dow.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dA() + (double)azm.b($$1, -0.7F, 0.7F);
               double $$5 = this.dC();
               double $$6 = this.dG() + (double)azm.b($$1, -0.7F, 0.7F);
               this.dV().a(new lk(ls.b, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(akm<?> $$0) {
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
   public boolean a(dfe $$0) {
      return this.gq();
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cnx.a(this, $$0);
   }

   @Override
   public bwj<cnw> eb() {
      return (bwj<cnw>)super.eb();
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public void a(BiConsumer<eao<?>, arp> $$0) {
      if (this.dV() instanceof arp $$1) {
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
         && $$1.aq() != bus.bC
         && !$$1.cC()
         && !$$1.eE()
         && this.dV().E_().a($$1.cR())) {
         return true;
      }

      return false;
   }

   public static void a(arp $$0, ezy $$1, @Nullable bul $$2, int $$3) {
      btq $$4 = new btq(bts.G, 260, 0, false, false);
      btr.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      alh<vi> $$1 = this.dX().a(uz.a);
      cnv.a(this::b)
         .encodeStart($$1, this.cH)
         .resultOrPartial($$0x -> ca.error("Failed to encode anger state for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("anger", $$1x));
      eba.a.a
         .encodeStart($$1, this.cG)
         .resultOrPartial($$0x -> ca.error("Failed to encode vibration listener for Warden: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      alh<vi> $$1 = this.dX().a(uz.a);
      if ($$0.e("anger")) {
         cnv.a(this::b)
            .parse($$1, $$0.c("anger"))
            .resultOrPartial($$0x -> ca.error("Failed to parse anger state for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cH = $$0x);
         this.gt();
      }

      if ($$0.b("listener", 10)) {
         eba.a.a
            .parse($$1, $$0.p("listener"))
            .resultOrPartial($$0x -> ca.error("Failed to parse vibration listener for Warden: '{}'", $$0x))
            .ifPresent($$0x -> this.cG = $$0x);
      }
   }

   private void gv() {
      if (!this.c(bvt.l)) {
         this.a(this.v().c(), 10.0F, this.ff());
      }
   }

   public cnu v() {
      return cnu.a(this.gw());
   }

   private int gw() {
      return this.cH.b(this.aa_());
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
      if (!this.fZ() && this.b($$0)) {
         cnx.a((bvh)this);
         boolean $$3 = !(this.aa_() instanceof cou);
         int $$4 = this.cH.a($$0, $$1);
         if ($$0 instanceof cou && $$3 && cnu.a($$4).d()) {
            this.eb().b(cel.o);
         }

         if ($$2) {
            this.gv();
         }
      }
   }

   public Optional<bvh> gm() {
      return this.v().d() ? this.cH.a() : Optional.empty();
   }

   @Nullable
   @Override
   public bvh aa_() {
      return this.O();
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.eb().a(cel.aE, bas.a, 1200L);
      if ($$2 == bur.k) {
         this.b(bvt.n);
         this.eb().a(cel.aC, bas.a, (long)cnx.a);
         this.a(awn.BK, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if (!this.fZ() && !this.gq()) {
         bul $$4 = $$1.d();
         this.a($$4, cnu.c.a() + 20, false);
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
      return this.gq() ? buo.c($$1.a(), 1.0F) : $$1;
   }

   @Override
   public boolean bI() {
      return !this.gq() && super.bI();
   }

   @Override
   protected void D(bul $$0) {
      if (!this.fZ() && !this.eb().a(cel.aH)) {
         this.eb().a(cel.aH, bas.a, 20L);
         this.d($$0);
         cnx.a(this, $$0.dv());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cnv gn() {
      return this.cH;
   }

   @Override
   protected cet b(dfm $$0) {
      return new ces(this, $$0) {
         @Override
         protected esl a(int $$0) {
            this.o = new esr();
            this.o.a(true);
            return new esl(this.o, $$0) {
               @Override
               protected float a(esh $$0, esh $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   public eba.a go() {
      return this.cG;
   }

   @Override
   public eba.d gp() {
      return this.cF;
   }

   class a implements eba.d {
      private static final int b = 16;
      private final eav c = new eap(cnw.this, cnw.this.cS());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public eav b() {
         return this.c;
      }

      @Override
      public axs<ear> c() {
         return axj.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arp $$0, jh $$1, jq<ear> $$2, ear.a $$3) {
         if (!cnw.this.fZ() && !cnw.this.eE() && !cnw.this.eb().a(cel.aI) && !cnw.this.gq() && $$0.E_().a($$1)) {
            if ($$3.a() instanceof bvh $$4 && !cnw.this.b($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(arp $$0, jh $$1, jq<ear> $$2, @Nullable bul $$3, @Nullable bul $$4, float $$5) {
         if (!cnw.this.eE()) {
            cnw.this.bE.a(cel.aI, bas.a, 40L);
            $$0.a(cnw.this, (byte)61);
            cnw.this.a(awn.Cd, 5.0F, cnw.this.ff());
            jh $$6 = $$1;
            if ($$4 != null) {
               if (cnw.this.a($$4, 30.0)) {
                  if (cnw.this.eb().a(cel.aA)) {
                     if (cnw.this.b($$4)) {
                        $$6 = $$4.dv();
                     }

                     cnw.this.d($$4);
                  } else {
                     cnw.this.a($$4, 10, true);
                  }
               }

               cnw.this.eb().a(cel.aA, bas.a, 100L);
            } else {
               cnw.this.d($$3);
            }

            if (!cnw.this.v().d()) {
               Optional<bvh> $$7 = cnw.this.cH.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  cnx.a(cnw.this, $$6);
               }
            }
         }
      }
   }
}
