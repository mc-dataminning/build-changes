import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwh extends bum {
   public static final bim bT = bim.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bth<? extends btg<? super bwh>>> bU = ImmutableList.of(bth.c, bth.d, bth.b, bth.n, bth.f, bth.q);
   protected static final ImmutableList<bsc<?>> bW = ImmutableList.of(
      bsc.n, bsc.h, bsc.m, bsc.E, bsc.t, bsc.au, bsc.r, bsc.R, bsc.S, bsc.N, bsc.J, bsc.O, new bsc[]{bsc.Q, bsc.U, bsc.V, bsc.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final aec<Boolean> cc = aef.a(bwh.class, aee.k);
   private static final aec<Boolean> cd = aef.a(bwh.class, aee.k);
   private static final aec<Boolean> ce = aef.a(bwh.class, aee.k);
   private boolean cf;
   private int cg;

   public bwh(bip<? extends bwh> $$0, cpq $$1) {
      super($$0, $$1);
      this.H().a(true);
      this.a(eas.f, -1.0F);
      this.a(eas.g, -1.0F);
   }

   public cja p() {
      arx $$0 = arx.a((long)this.cv().hashCode());
      aqd<cis> $$1 = this.gk() ? apv.b : apv.a;
      hk<cis> $$2 = jd.am.a($$1);
      return cit.a(cjd.vi, $$2.a($$0).get());
   }

   @Override
   protected bkb.b<bwh> dN() {
      return bkb.a(bW, bU);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return bwi.a(this.dN().a($$0));
   }

   public static bkg.a q() {
      return bjd.x().a(bkh.a, 10.0).a(bkh.d, 0.2F).a(bkh.f, 2.0);
   }

   @Override
   protected void m() {
      if (this.i_()) {
         this.a(bkh.f).a(1.0);
         this.gj();
      } else {
         this.a(bkh.f).a(2.0);
         this.gi();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aoy r() {
      return this.gk() ? aoz.jN : aoz.jD;
   }

   @Override
   protected aoy d(bhj $$0) {
      return this.gk() ? aoz.jQ : aoz.jG;
   }

   @Override
   protected aoy h_() {
      return this.gk() ? aoz.jO : aoz.jE;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.jW, 0.15F, 1.0F);
   }

   protected aoy t() {
      return this.gk() ? aoz.jS : aoz.jI;
   }

   @Nullable
   public bwh b(akn $$0, big $$1) {
      bwh $$2 = bip.U.a((cpq)$$0);
      if ($$2 != null) {
         bwi.a($$2, $$0.y_());
         big $$3 = (big)($$0.y_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bwh $$4 && $$4.gk() || $$0.y_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bkb<bwh> dM() {
      return (bkb<bwh>)super.dM();
   }

   @Override
   protected void V() {
      this.dK().ad().a("goatBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("goatActivityUpdate");
      bwi.a(this);
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
      float $$2 = ars.c(this.aU, $$0);
      float $$3 = ars.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public aoy d(cja $$0) {
      return this.gk() ? aoz.jP : aoz.jF;
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(cjd.pK) && !this.i_()) {
         $$0.a(this.t(), 1.0F, 1.0F);
         cja $$3 = cjc.a($$2, $$0, cjd.pQ.ad_());
         $$0.a($$1, $$3);
         return bgt.a(this.dK().B);
      } else {
         bgt $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dK().a(null, this, this.d($$2), apa.g, 1.0F, ars.b(this.dK().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      bwi.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.i_() && (double)$$5.i() < 0.1F) {
         aec<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   @Override
   public bim a(bjn $$0) {
      return $$0 == bjn.g ? bT.a(this.dX()) : super.a($$0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gk());
      $$0.a("HasLeftHorn", this.ga());
      $$0.a("HasRightHorn", this.gg());
   }

   @Override
   public void a(qu $$0) {
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

      this.cg = ars.a(this.cg, 0, 20);
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
         aec<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         ehi $$5 = this.di();
         cja $$6 = this.p();
         double $$7 = (double)ars.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)ars.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)ars.b(this.ag, -0.2F, 0.2F);
         byi $$10 = new byi(this.dK(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bip<? extends bum> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
