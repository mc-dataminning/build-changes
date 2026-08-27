import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwe extends buj {
   public static final bij bT = bij.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bte<? extends btd<? super bwe>>> bU = ImmutableList.of(bte.c, bte.d, bte.b, bte.n, bte.f, bte.q);
   protected static final ImmutableList<brz<?>> bW = ImmutableList.of(
      brz.n, brz.h, brz.m, brz.E, brz.t, brz.au, brz.r, brz.R, brz.S, brz.N, brz.J, brz.O, new brz[]{brz.Q, brz.U, brz.V, brz.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final adz<Boolean> cc = aec.a(bwe.class, aeb.k);
   private static final adz<Boolean> cd = aec.a(bwe.class, aeb.k);
   private static final adz<Boolean> ce = aec.a(bwe.class, aeb.k);
   private boolean cf;
   private int cg;

   public bwe(bim<? extends bwe> $$0, cpl $$1) {
      super($$0, $$1);
      this.H().a(true);
      this.a(ean.f, -1.0F);
      this.a(ean.g, -1.0F);
   }

   public cix p() {
      aru $$0 = aru.a((long)this.cv().hashCode());
      aqa<cip> $$1 = this.gk() ? aps.b : aps.a;
      hi<cip> $$2 = jb.am.a($$1);
      return ciq.a(cja.vi, $$2.a($$0).get());
   }

   @Override
   protected bjy.b<bwe> dN() {
      return bjy.a(bW, bU);
   }

   @Override
   protected bjy<?> a(Dynamic<?> $$0) {
      return bwf.a(this.dN().a($$0));
   }

   public static bkd.a q() {
      return bja.x().a(bke.a, 10.0).a(bke.d, 0.2F).a(bke.f, 2.0);
   }

   @Override
   protected void m() {
      if (this.i_()) {
         this.a(bke.f).a(1.0);
         this.gj();
      } else {
         this.a(bke.f).a(2.0);
         this.gi();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aov r() {
      return this.gk() ? aow.jN : aow.jD;
   }

   @Override
   protected aov d(bhg $$0) {
      return this.gk() ? aow.jQ : aow.jG;
   }

   @Override
   protected aov h_() {
      return this.gk() ? aow.jO : aow.jE;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.jW, 0.15F, 1.0F);
   }

   protected aov t() {
      return this.gk() ? aow.jS : aow.jI;
   }

   @Nullable
   public bwe b(akk $$0, bid $$1) {
      bwe $$2 = bim.U.a((cpl)$$0);
      if ($$2 != null) {
         bwf.a($$2, $$0.y_());
         bid $$3 = (bid)($$0.y_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bwe $$4 && $$4.gk() || $$0.y_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bjy<bwe> dM() {
      return (bjy<bwe>)super.dM();
   }

   @Override
   protected void V() {
      this.dK().ad().a("goatBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("goatActivityUpdate");
      bwf.a(this);
      this.dK().ad().c();
      super.V();
   }

   @Override
   public int X() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.X();
      float $$2 = arp.c(this.aU, $$0);
      float $$3 = arp.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public aov d(cix $$0) {
      return this.gk() ? aow.jP : aow.jF;
   }

   @Override
   public bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if ($$2.a(cja.pK) && !this.i_()) {
         $$0.a(this.t(), 1.0F, 1.0F);
         cix $$3 = ciz.a($$2, $$0, cja.pQ.ad_());
         $$0.a($$1, $$3);
         return bgq.a(this.dK().B);
      } else {
         bgq $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dK().a(null, this, this.d($$2), aox.g, 1.0F, arp.b(this.dK().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      bwf.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.i_() && (double)$$5.i() < 0.1F) {
         adz<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public bij a(bjk $$0) {
      return $$0 == bjk.g ? bT.a(this.dX()) : super.a($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gk());
      $$0.a("HasLeftHorn", this.ga());
      $$0.a("HasRightHorn", this.gg());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.an.b(cd, $$0.q("HasLeftHorn"));
      this.an.b(ce, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cf = true;
      } else if ($$0 == 59) {
         this.cf = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void b_() {
      if (this.cf) {
         this.cg++;
      } else {
         this.cg -= 2;
      }

      this.cg = arp.a(this.cg, 0, 20);
      super.b_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, false);
      this.an.a(cd, true);
      this.an.a(ce, true);
   }

   public boolean ga() {
      return this.an.b(cd);
   }

   public boolean gg() {
      return this.an.b(ce);
   }

   public boolean gh() {
      boolean $$0 = this.ga();
      boolean $$1 = this.gg();
      if (!$$0 && !$$1) {
         return false;
      } else {
         adz<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         ehd $$5 = this.di();
         cix $$6 = this.p();
         double $$7 = (double)arp.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)arp.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)arp.b(this.ag, -0.2F, 0.2F);
         byf $$10 = new byf(this.dK(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dK().b($$10);
         return true;
      }
   }

   public void gi() {
      this.an.b(cd, true);
      this.an.b(ce, true);
   }

   public void gj() {
      this.an.b(cd, false);
      this.an.b(ce, false);
   }

   public boolean gk() {
      return this.an.b(cc);
   }

   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public float gl() {
      return (float)this.cg / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bim<? extends buj> $$0, cpm $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
