import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwm extends bur {
   public static final bir bT = bir.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<btm<? extends btl<? super bwm>>> bU = ImmutableList.of(btm.c, btm.d, btm.b, btm.n, btm.f, btm.q);
   protected static final ImmutableList<bsh<?>> bW = ImmutableList.of(
      bsh.n, bsh.h, bsh.m, bsh.E, bsh.t, bsh.au, bsh.r, bsh.R, bsh.S, bsh.N, bsh.J, bsh.O, new bsh[]{bsh.Q, bsh.U, bsh.V, bsh.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final aef<Boolean> cc = aei.a(bwm.class, aeh.k);
   private static final aef<Boolean> cd = aei.a(bwm.class, aeh.k);
   private static final aef<Boolean> ce = aei.a(bwm.class, aeh.k);
   private boolean cf;
   private int cg;

   public bwm(biu<? extends bwm> $$0, cpv $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(eax.f, -1.0F);
      this.a(eax.g, -1.0F);
   }

   public cjf s() {
      asc $$0 = asc.a((long)this.cw().hashCode());
      aqi<cix> $$1 = this.gn() ? aqa.b : aqa.a;
      hk<cix> $$2 = jd.am.a($$1);
      return ciy.a(cji.vi, $$2.a($$0).get());
   }

   @Override
   protected bkg.b<bwm> dO() {
      return bkg.a(bW, bU);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return bwn.a(this.dO().a($$0));
   }

   public static bkl.a t() {
      return bji.A().a(bkm.a, 10.0).a(bkm.d, 0.2F).a(bkm.f, 2.0);
   }

   @Override
   protected void m() {
      if (this.m_()) {
         this.a(bkm.f).a(1.0);
         this.gm();
      } else {
         this.a(bkm.f).a(2.0);
         this.gl();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected apd w() {
      return this.gn() ? ape.jN : ape.jD;
   }

   @Override
   protected apd d(bho $$0) {
      return this.gn() ? ape.jQ : ape.jG;
   }

   @Override
   protected apd l_() {
      return this.gn() ? ape.jO : ape.jE;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.jW, 0.15F, 1.0F);
   }

   protected apd y() {
      return this.gn() ? ape.jS : ape.jI;
   }

   @Nullable
   public bwm b(akr $$0, bil $$1) {
      bwm $$2 = biu.U.a((cpv)$$0);
      if ($$2 != null) {
         bwn.a($$2, $$0.D_());
         bil $$3 = (bil)($$0.D_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bwm $$4 && $$4.gn() || $$0.D_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bkg<bwm> dN() {
      return (bkg<bwm>)super.dN();
   }

   @Override
   protected void Y() {
      this.dL().ad().a("goatBrain");
      this.dN().a((akr)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("goatActivityUpdate");
      bwn.a(this);
      this.dL().ad().c();
      super.Y();
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.aa();
      float $$2 = arx.c(this.aU, $$0);
      float $$3 = arx.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public apd d(cjf $$0) {
      return this.gn() ? ape.jP : ape.jF;
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.a(cji.pK) && !this.m_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cjf $$3 = cjh.a($$2, $$0, cji.pQ.ai_());
         $$0.a($$1, $$3);
         return bgy.a(this.dL().B);
      } else {
         bgy $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dL().a(null, this, this.d($$2), apf.g, 1.0F, arx.b(this.dL().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      asc $$5 = $$0.D_();
      bwn.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.m_() && (double)$$5.i() < 0.1F) {
         aef<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void X() {
      super.X();
      abc.a(this);
   }

   @Override
   public bir a(bjs $$0) {
      return $$0 == bjs.g ? bT.a(this.dY()) : super.a($$0);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gn());
      $$0.a("HasLeftHorn", this.gd());
      $$0.a("HasRightHorn", this.gj());
   }

   @Override
   public void a(qx $$0) {
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

      this.cg = arx.a(this.cg, 0, 20);
      super.b_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, false);
      this.an.a(cd, true);
      this.an.a(ce, true);
   }

   public boolean gd() {
      return this.an.b(cd);
   }

   public boolean gj() {
      return this.an.b(ce);
   }

   public boolean gk() {
      boolean $$0 = this.gd();
      boolean $$1 = this.gj();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aef<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         ehn $$5 = this.dj();
         cjf $$6 = this.s();
         double $$7 = (double)arx.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)arx.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)arx.b(this.ag, -0.2F, 0.2F);
         byn $$10 = new byn(this.dL(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dL().b($$10);
         return true;
      }
   }

   public void gl() {
      this.an.b(cd, true);
      this.an.b(ce, true);
   }

   public void gm() {
      this.an.b(cd, false);
      this.an.b(ce, false);
   }

   public boolean gn() {
      return this.an.b(cc);
   }

   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public float go() {
      return (float)this.cg / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(biu<? extends bur> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a_($$3.d()).a(apt.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
