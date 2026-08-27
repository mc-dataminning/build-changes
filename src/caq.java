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

public class caq extends bza implements djs {
   private static final Logger bV = LogUtils.getLogger();
   private static final int bW = 40;
   private static final int bX = 200;
   private static final int bY = 500;
   private static final float bZ = 0.3F;
   private static final float ca = 1.0F;
   private static final float cb = 1.5F;
   private static final int cc = 30;
   private static final adz<Integer> cd = aec.a(caq.class, aeb.b);
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
   public bie b = new bie();
   public bie c = new bie();
   public bie d = new bie();
   public bie e = new bie();
   public bie bT = new bie();
   public bie bU = new bie();
   private final djg<djs.b> cw;
   private final djs.d cx;
   private djs.a cy;
   cap cz = new cap(this::a, Collections.emptyList());

   public caq(bim<? extends bza> $$0, cpl $$1) {
      super($$0, $$1);
      this.cx = new caq.a();
      this.cy = new djs.a();
      this.cw = new djg<>(new djs.b(this));
      this.bJ = 5;
      this.H().a(true);
      this.a(ean.m, 0.0F);
      this.a(ean.q, 8.0F);
      this.a(ean.f, 8.0F);
      this.a(ean.i, 8.0F);
      this.a(ean.o, 0.0F);
      this.a(ean.n, 0.0F);
   }

   @Override
   public ux<wp> U() {
      return new wq(this, this.c(bjk.n) ? 1 : 0);
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      if ($$0.o() == 1) {
         this.b(bjk.n);
      }
   }

   @Override
   public boolean a(cpo $$0) {
      return super.a($$0) && $$0.a(this, this.ag().n().a(this.di()));
   }

   @Override
   public float a(gu $$0, cpo $$1) {
      return 0.0F;
   }

   @Override
   public boolean b(bhg $$0) {
      return this.ge() && !$$0.a(apn.d) ? true : super.b($$0);
   }

   boolean ge() {
      return this.c(bjk.o) || this.c(bjk.n);
   }

   @Override
   protected boolean o(bii $$0) {
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

   public static bkd.a p() {
      return bza.gg().a(bke.a, 500.0).a(bke.d, 0.3F).a(bke.c, 1.0).a(bke.g, 1.5).a(bke.f, 30.0);
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
   protected aov r() {
      return !this.c(bjk.l) && !this.ge() ? this.t().b() : null;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.zD;
   }

   @Override
   protected aov h_() {
      return aow.zz;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.zN, 10.0F, 1.0F);
   }

   @Override
   public boolean C(bii $$0) {
      this.dK().a(this, (byte)4);
      this.a(aow.zy, 10.0F, this.eV());
      boo.a(this, 40);
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

   private void gh() {
      this.an.b(cd, this.gk());
   }

   @Override
   public void l() {
      if (this.dK() instanceof akk $$0) {
         djs.c.a($$0, this.cy, this.cx);
         if (this.fH() || this.R()) {
            car.a((biy)this);
         }
      }

      super.l();
      if (this.dK().r_()) {
         if (this.ah % this.gi() == 0) {
            this.cu = 10;
            if (!this.aS()) {
               this.dK().a(this.dp(), this.dr(), this.dv(), aow.zC, this.da(), 5.0F, this.eV(), false);
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
      akk $$0 = (akk)this.dK();
      $$0.ad().a("wardenBrain");
      this.dM().a($$0, this);
      this.dK().ad().c();
      super.V();
      if ((this.ah + this.ah()) % 120 == 0) {
         a($$0, this.di(), this, 20);
      }

      if (this.ah % 20 == 0) {
         this.cz.a($$0, this::a);
         this.gh();
      }

      car.a(this);
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

   private int gi() {
      float $$0 = (float)this.q() / (float)cao.c.a();
      return 40 - arp.d(arp.a($$0, 0.0F, 1.0F) * 30.0F);
   }

   public float E(float $$0) {
      return arp.i($$0, (float)this.ct, (float)this.cs) / 10.0F;
   }

   public float F(float $$0) {
      return arp.i($$0, (float)this.cv, (float)this.cu) / 10.0F;
   }

   private void a(bie $$0) {
      if ((float)$$0.b() < 4500.0F) {
         aru $$1 = this.ee();
         dez $$2 = this.bi();
         if ($$2.l() != cyq.a) {
            for (int $$3 = 0; $$3 < 30; $$3++) {
               double $$4 = this.dp() + (double)arp.b($$1, -0.7F, 0.7F);
               double $$5 = this.dr();
               double $$6 = this.dv() + (double)arp.b($$1, -0.7F, 0.7F);
               this.dK().a(new in(iv.c, $$2), $$4, $$5, $$6, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void a(adz<?> $$0) {
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
      return this.ge();
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return car.a(this, $$0);
   }

   @Override
   public bjy<caq> dM() {
      return (bjy<caq>)super.dM();
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public void a(BiConsumer<djg<?>, akk> $$0) {
      if (this.dK() instanceof akk $$1) {
         $$0.accept(this.cw, $$1);
      }
   }

   @Contract("null->false")
   public boolean a(@Nullable bii $$0) {
      if ($$0 instanceof biy $$1
         && this.dK() == $$0.dK()
         && bil.e.test($$0)
         && !this.s($$0)
         && $$1.ag() != bim.d
         && $$1.ag() != bim.bi
         && !$$1.cq()
         && !$$1.eu()
         && this.dK().w_().a($$1.cG())) {
         return true;
      }

      return false;
   }

   public static void a(akk $$0, ehd $$1, @Nullable bii $$2, int $$3) {
      bhv $$4 = new bhv(bhx.G, 260, 0, false, false);
      bhw.a($$0, $$2, $$1, (double)$$3, $$4, 200);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cap.a(this::a).encodeStart(rc.a, this.cz).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("anger", $$1));
      djs.a.a.encodeStart(rc.a, this.cy).resultOrPartial(bV::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("anger")) {
         cap.a(this::a).parse(new Dynamic(rc.a, $$0.c("anger"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cz = $$0x);
         this.gh();
      }

      if ($$0.b("listener", 10)) {
         djs.a.a.parse(new Dynamic(rc.a, $$0.p("listener"))).resultOrPartial(bV::error).ifPresent($$0x -> this.cy = $$0x);
      }
   }

   private void gj() {
      if (!this.c(bjk.l)) {
         this.a(this.t().c(), 10.0F, this.eV());
      }
   }

   public cao t() {
      return cao.a(this.gk());
   }

   private int gk() {
      return this.cz.b(this.j());
   }

   public void b(bii $$0) {
      this.cz.a($$0);
   }

   public void c(@Nullable bii $$0) {
      this.a($$0, 35, true);
   }

   @VisibleForTesting
   public void a(@Nullable bii $$0, int $$1, boolean $$2) {
      if (!this.fQ() && this.a($$0)) {
         car.a((biy)this);
         boolean $$3 = !(this.dM().c(brz.o).orElse(null) instanceof cbm);
         int $$4 = this.cz.a($$0, $$1);
         if ($$0 instanceof cbm && $$3 && cao.a($$4).d()) {
            this.dM().b(brz.o);
         }

         if ($$2) {
            this.gj();
         }
      }
   }

   public Optional<biy> ga() {
      return this.t().d() ? this.cz.a() : Optional.empty();
   }

   @Nullable
   @Override
   public biy j() {
      return this.dM().c(brz.o).orElse(null);
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      this.dM().a(brz.aD, asp.a, 1200L);
      if ($$2 == bjc.k) {
         this.b(bjk.n);
         this.dM().a(brz.aB, asp.a, (long)car.a);
         this.a(aow.zv, 5.0F, 1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (!this.dK().B && !this.fQ() && !this.ge()) {
         bii $$3 = $$0.d();
         this.a($$3, cao.c.a() + 20, false);
         if (this.bz.c(brz.o).isEmpty() && $$3 instanceof biy $$4 && (!$$0.b() || this.a($$4, 5.0))) {
            this.j($$4);
         }
      }

      return $$2;
   }

   public void j(biy $$0) {
      this.dM().b(brz.ax);
      this.dM().a(brz.o, $$0);
      this.dM().b(brz.E);
      boo.a(this, 200);
   }

   @Override
   public bij a(bjk $$0) {
      bij $$1 = super.a($$0);
      return this.ge() ? bij.c($$1.a, 1.0F) : $$1;
   }

   @Override
   public boolean bs() {
      return !this.ge() && super.bs();
   }

   @Override
   protected void D(bii $$0) {
      if (!this.fQ() && !this.dM().a(brz.aG)) {
         this.dM().a(brz.aG, asp.a, 20L);
         this.c($$0);
         car.a(this, $$0.dk());
      }

      super.D($$0);
   }

   @VisibleForTesting
   public cap gb() {
      return this.cz;
   }

   @Override
   protected bsh b(cpl $$0) {
      return new bsg(this, $$0) {
         @Override
         protected eat a(int $$0) {
            this.o = new eaw();
            this.o.a(true);
            return new eat(this.o, $$0) {
               @Override
               protected float a(eap $$0, eap $$1) {
                  return $$0.b($$1);
               }
            };
         }
      };
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.25F * $$2, 0.0F);
   }

   @Override
   public djs.a gc() {
      return this.cy;
   }

   @Override
   public djs.d gd() {
      return this.cx;
   }

   class a implements djs.d {
      private static final int b = 16;
      private final djn c = new djh(caq.this, caq.this.cH());

      @Override
      public int a() {
         return 16;
      }

      @Override
      public djn b() {
         return this.c;
      }

      @Override
      public aqa<djj> c() {
         return apr.b;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akk $$0, gu $$1, djj $$2, djj.a $$3) {
         if (!caq.this.fQ() && !caq.this.eu() && !caq.this.dM().a(brz.aH) && !caq.this.ge() && $$0.w_().a($$1)) {
            if ($$3.a() instanceof biy $$4 && !caq.this.a($$4)) {
               return false;
            }

            return true;
         } else {
            return false;
         }
      }

      @Override
      public void a(akk $$0, gu $$1, djj $$2, @Nullable bii $$3, @Nullable bii $$4, float $$5) {
         if (!caq.this.eu()) {
            caq.this.bz.a(brz.aH, asp.a, 40L);
            $$0.a(caq.this, (byte)61);
            caq.this.a(aow.zO, 5.0F, caq.this.eV());
            gu $$6 = $$1;
            if ($$4 != null) {
               if (caq.this.a($$4, 30.0)) {
                  if (caq.this.dM().a(brz.az)) {
                     if (caq.this.a($$4)) {
                        $$6 = $$4.dk();
                     }

                     caq.this.c($$4);
                  } else {
                     caq.this.a($$4, 10, true);
                  }
               }

               caq.this.dM().a(brz.az, asp.a, 100L);
            } else {
               caq.this.c($$3);
            }

            if (!caq.this.t().d()) {
               Optional<biy> $$7 = caq.this.cz.a();
               if ($$4 != null || $$7.isEmpty() || $$7.get() == $$3) {
                  car.a(caq.this, $$6);
               }
            }
         }
      }
   }
}
