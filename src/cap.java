import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Collections;
import java.util.Optional;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import org.jetbrains.annotations.Contract;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cap extends byz implements djr {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final adx<Integer> cd = aea.a(cap.class, adz.b);
   private static final int ce = 200;
   private static final int cf = 260;
   private static final int cg = 20;
   private static final int ch = 120;
   private static final int ci = 20;
   private static final int cj = 35;
   private static final int ck = 10;
   private static final int cl = 20;
   private static final int cm = 100;
   private static final int cn = 20;
   private static final int co = 30;
   private static final float cp = 4.5F;
   private static final float cq = 0.7F;
   private static final int cr = 30;
   private int cs;
   private int ct;
   private int cu;
   private int cv;
   public bic b = new bic();
   public bic c = new bic();
   public bic d = new bic();
   public bic e = new bic();
   public bic bT = new bic();
   public bic bU = new bic();
   private final djf<djr.b> cw;
   private final djr.d cx;
   private djr.a cy;
   cao cz = new cao(this::a, Collections.emptyList());

   public cap(bik<? extends byz> $$0, cpk $$1) {
      super($$0, $$1);
      this.cx = new cap.a();
      this.cy = new djr.a();
      this.cw = new djf<>(new djr.b(this));
      this.bJ = 5;
      this.H().a(true);
      this.a(eam.m, 0.0F);
      this.a(eam.q, 8.0F);
      this.a(eam.f, 8.0F);
      this.a(eam.i, 8.0F);
      this.a(eam.o, 0.0F);
      this.a(eam.n, 0.0F);
   }

   @Override
   public uw<wo> U() {
      return new wp(this, this.c(bji.n) ? 1 : 0);
   }

   @Override
   public void a(wp $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bji.n);
      }
   }

   @Override
   public boolean a(cpn $$0) {
      return super.a($$0) && $$0.a(this, this.ag().n().a(this.di()));
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bhe $$0) {
      return this.gd() && !$$0.a(apl.d) ? true : super.b($$0);
   }

   boolean gd() {
      return this.c(bji.o) || this.c(bji.n);
   }

   @Override
   protected boolean o(big $$0) {
      return false;
   }

   @Override
   public boolean fE() {
      return true;
   }

   @Override
   protected float aK() {
      return this.Z + 0.55F;
   }

   public static bkc.a p() {
      return byz.gf().a(bkd.a, 500.0).a(bkd.d, 0.3F).a(bkd.c, 1.0).a(bkd.g, 1.5).a(bkd.f, 30.0);
   }

   @Override
   public boolean aV() {
      return true;
   }

   @Override
   protected float eU() {
      return 4.0F;
   }

   @Nullable
   @Override
   protected aot r() {
      return !this.c(bji.l) && !this.gd() ? this.t().b() : null;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.zy;
   }

   @Override
   protected aot h_() {
      return aou.zu;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.zI, 10.0F, 1.0F);
   }

   @Override
   public boolean C(big $$0) {
      this.dK().a(this, (byte)4);
      this.a(aou.zt, 10.0F, this.eV());
      bon.a(this, 40);
      return super.C($$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cd, 0);
   }

   public int q() {
      return this.an.b(cd);
   }

   private void gg() {
      this.an.b(cd, this.gj());
   }

   @Override
   public void l() {
      if (this.dK() instanceof aki $$0) {
         djr.c.a($$0, this.cy, this.cx);
         if (this.fH() || this.R()) {
            caq.a((biw)this);
         }
      }

      super.l();
      if (this.dK().r_()) {
         if (this.ah % this.gh() == 0) {
            this.cu = 10;
            if (!this.aS()) {
               this.dK().a(this.dp(), this.dr(), this.dv(), aou.zx, this.da(), 5.0F, this.eV(), false);
            }
         }

         this.ct = this.cs;
         if (this.cs > 0) {
            this.cs--;
         }

         this.cv = this.cu;
         if (this.cu > 0) {
            this.cu--;
         }

         switch (this.an()) {
            case n:
               this.a(this.d);
               break;
            case o:
               this.a(this.e);
         }
      }
   }

   @Override
   protected void V() {
      aki $$0 = (aki)this.dK();
      $$0.ad().a("wardenBrain");
      this.dM().a($$0, this);
      this.dK().ad().c();
      super.V();
      if ((this.ah + this.ah()) % 120 == 0) {
         a($$0, this.di(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gg();
      }

      caq.a(this);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.b.a();
         this.bT.a(this.ah);
      } else if ($$0 == 61) {
         this.cs = 10;
      } else if ($$0 == 62) {
         this.bU.a(this.ah);
      } else {
         super.b($$0);
      }
   }

   private int gh() {
      float $$0 = (float)this.q() / (float)can.c.a();
      return 40 - aro.d(aro.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return aro.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return aro.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bic $$0) {
      if ((float)$$0.b() < 4500.0F) {
         art $$1 = this.ee();
         dey $$2 = this.bi();
         if ($$2.l() != cyp.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dp() + (double)aro.b($$1, -0.7F, 0.7F);
               double $$5 = this.dr();
               double $$6 = this.dv() + (double)aro.b($$1, -0.7F, 0.7F);
               this.dK().a(new io(iw.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(adx<?> $$0) {
      if (as.equals($$0)) {
         switch (this.an()) {
            case n:
               this.d.a(this.ah);
               break;
            case o:
               this.e.a(this.ah);
               break;
            case l:
               this.b.a(this.ah);
               break;
            case m:
               this.c.a(this.ah);
         }
      }

      super.a($$0);
   }

   @Override
   public boolean cL() {
      return this.gd();
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return caq.a(this, $$0);
   }

   @Override
   public bjx<cap> dM() {
      return (bjx<cap>)super.dM();
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   @Override
   public void a(BiConsumer<djf<?>, aki> $$0) {
      if (this.dK() instanceof aki $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable big $$0) {
      if ($$0 instanceof biw $$1
         && this.dK() == $$0.dK()
         && bij.e.test($$0)
         && !this.s($$0)
         && $$1.ag() != bik.d
         && $$1.ag() != bik.bi
         && !$$1.cq()
         && !$$1.eu()
         && this.dK().w_().a($$1.cG())) {
         return true;
      }

      return false;
   }

   public static void a(aki $$0, ehf $$1, @Nullable big $$2, int $$3) {
      bht $$4 = new bht(bhv.G, 260, 0, false, false);
      bhu.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      cao.a(this::a).encodeStart(rd.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      djr.a.a.encodeStart(rd.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cao.a(this::a).parse(new Dynamic(rd.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gg();
      }

      if ($$0.b("listener", 10)) {
         djr.a.a.parse(new Dynamic(rd.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gi() {
      if (!this.c(bji.l)) {
         this.a(this.t().c(), 10.0F, this.eV());
      }
   }

   public can t() {
      return can.a(this.gj());
   }

   private int gj() {
      return this.cz.b(this.j());
   }

   public void b(big $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable big $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable big $$0, int $$1, boolean $$2) {
      if (!this.fQ() && this.a($$0)) {
         caq.a((biw)this);
         boolean $$3 = !(this.dM().c(bry.o).orElse(null) instanceof cbl);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cbl && $$3 && can.a($$4).d()) {
            this.dM().b(bry.o);
         }

         if ($$2) {
            this.gi();
         }
      }
   }

   public Optional<biw> fZ() {
      return this.t().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public biw j() {
      return this.dM().c(bry.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      this.dM().a(bry.aD, asn.a, 1200L);
      if ($$2 == bja.k) {
         this.b(bji.n);
         this.dM().a(bry.aB, asn.a, (long)caq.a);
         this.a(aou.zq, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dK().B && !this.fQ() && !this.gd()) {
         big $$3 = $$0.d();
         this.a($$3, can.c.a() + 20, false);
         if (this.bz.c(bry.o).isEmpty() && $$3 instanceof biw $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.l($$4);
         }
      }

      return $$2;
   }

   public void l(biw $$0) {
      this.dM().b(bry.ax);
      this.dM().a(bry.o, $$0);
      this.dM().b(bry.E);
      bon.a(this, 200);
   }

   @Override
   public bih a(bji $$0) {
      bih $$1 = super.a($$0);
      return this.gd() ? bih.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bs() {
      return !this.gd() && super.bs();
   }

   @Override
   protected void D(big $$0) {
      if (!this.fQ() && !this.dM().a(bry.aG)) {
         this.dM().a(bry.aG, asn.a, 20L);
         this.c($$0);
         caq.a(this, $$0.dk());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cao ga() {
      return this.cz;
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bsf(this, $$0) {
         @Override
         protected eas a(int $$0) {
            this.o = new eav();
            this.o.a(true);
            return new eas(this.o, $$0) {
               @Override
               protected float a(eao $$0, eao $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public djr.a gb() {
      return this.cy;
   }

   @Override
   public djr.d gc() {
      return this.cx;
   }

   class a implements djr.d {
      private static final int b = 16;
      private final djm c = new djg(cap.this, cap.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djm b() {
         return this.c;
      }

      @Override
      public apy<dji> c() {
         return app.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aki $$0, gv $$1, dji $$2, dji.a $$3) {
         if (!cap.this.fQ() && !cap.this.eu() && !cap.this.dM().a(bry.aH) && !cap.this.gd() && $$0.w_().a($$1)) {
            if ($$3.a() instanceof biw $$4 && !cap.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(aki $$0, gv $$1, dji $$2, @Nullable big $$3, @Nullable big $$4, float $$5) {
         if (!cap.this.eu()) {
            cap.this.bz.a(bry.aH, asn.a, 40L);
            $$0.a(cap.this, (byte)61);
            cap.this.a(aou.zJ, 5.0F, cap.this.eV());
            gv $$6 = $$1;
            if ($$4 != null) {
               if (cap.this.a($$4, 30.0)) {
                  if (cap.this.dM().a(bry.az)) {
                     if (cap.this.a($$4)) {
                        $$6 = $$4.dk();
                     }

                     cap.this.c($$4);
                  } else {
                     cap.this.a($$4, 10, true);
                  }
               }

               cap.this.dM().a(bry.az, asn.a, 100L);
            } else {
               cap.this.c($$3);
            }

            if (!cap.this.t().d()) {
               Optional<biw> $$7 = cap.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  caq.a(cap.this, $$6);
               }
            }
         }
      }
   }
}
