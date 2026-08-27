import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bws extends bux {
   public static final bix bT = bix.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bts<? extends btr<? super bws>>> bU = ImmutableList.of(bts.c, bts.d, bts.b, bts.n, bts.f, bts.q);
   protected static final ImmutableList<bsn<?>> bW = ImmutableList.of(
      bsn.n, bsn.h, bsn.m, bsn.E, bsn.t, bsn.au, bsn.r, bsn.R, bsn.S, bsn.N, bsn.J, bsn.O, new bsn[]{bsn.Q, bsn.U, bsn.V, bsn.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final aef<Boolean> cc = aei.a(bws.class, aeh.k);
   private static final aef<Boolean> cd = aei.a(bws.class, aeh.k);
   private static final aef<Boolean> ce = aei.a(bws.class, aeh.k);
   private boolean cf;
   private int cg;

   public bws(bja<? extends bws> $$0, cqb $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(ear.f, -1.0F);
      this.a(ear.g, -1.0F);
   }

   public cjl s() {
      ash $$0 = ash.a((long)this.cv().hashCode());
      aqk<cjd> $$1 = this.go() ? aqc.b : aqc.a;
      hi<cjd> $$2 = jb.an.a($$1);
      return cje.a(cjo.vi, $$2.a($$0).get());
   }

   @Override
   protected bkm.b<bws> dO() {
      return bkm.a(bW, bU);
   }

   @Override
   protected bkm<?> a(Dynamic<?> $$0) {
      return bwt.a(this.dO().a($$0));
   }

   public static bkr.a t() {
      return bjo.A().a(bks.l, 10.0).a(bks.m, 0.2F).a(bks.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.m_()) {
         this.a(bks.c).a(1.0);
         this.gn();
      } else {
         this.a(bks.c).a(2.0);
         this.gm();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected apf w() {
      return this.go() ? apg.jN : apg.jD;
   }

   @Override
   protected apf d(bhu $$0) {
      return this.go() ? apg.jQ : apg.jG;
   }

   @Override
   protected apf l_() {
      return this.go() ? apg.jO : apg.jE;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.jW, 0.15F, 1.0F);
   }

   protected apf y() {
      return this.go() ? apg.jS : apg.jI;
   }

   @Nullable
   public bws b(akt $$0, bir $$1) {
      bws $$2 = bja.U.a((cqb)$$0);
      if ($$2 != null) {
         bwt.a($$2, $$0.D_());
         bir $$3 = (bir)($$0.D_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bws $$4 && $$4.go() || $$0.D_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bkm<bws> dN() {
      return (bkm<bws>)super.dN();
   }

   @Override
   protected void X() {
      this.dL().ad().a("goatBrain");
      this.dN().a((akt)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("goatActivityUpdate");
      bwt.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   public int Z() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.Z();
      float $$2 = asb.c(this.aU, $$0);
      float $$3 = asb.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public apf d(cjl $$0) {
      return this.go() ? apg.jP : apg.jF;
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if ($$2.a(cjo.pK) && !this.m_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cjl $$3 = cjn.a($$2, $$0, cjo.pQ.ai_());
         $$0.a($$1, $$3);
         return bhe.a(this.dL().B);
      } else {
         bhe $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dL().a(null, this, this.d($$2), aph.g, 1.0F, asb.b(this.dL().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      ash $$5 = $$0.D_();
      bwt.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.m_() && (double)$$5.i() < 0.1F) {
         aef<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void W() {
      super.W();
      abc.a(this);
   }

   @Override
   public bix a(bjy $$0) {
      return $$0 == bjy.g ? bT.a(this.dY()) : super.a($$0);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.go());
      $$0.a("HasLeftHorn", this.ge());
      $$0.a("HasRightHorn", this.gk());
   }

   @Override
   public void a(qw $$0) {
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

      this.cg = asb.a(this.cg, 0, 20);
      super.b_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(cc, false);
      this.an.a(cd, true);
      this.an.a(ce, true);
   }

   public boolean ge() {
      return this.an.b(cd);
   }

   public boolean gk() {
      return this.an.b(ce);
   }

   public boolean gl() {
      boolean $$0 = this.ge();
      boolean $$1 = this.gk();
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
         ehh $$5 = this.dj();
         cjl $$6 = this.s();
         double $$7 = (double)asb.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)asb.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)asb.b(this.ag, -0.2F, 0.2F);
         byt $$10 = new byt(this.dL(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dL().b($$10);
         return true;
      }
   }

   public void gm() {
      this.an.b(cd, true);
      this.an.b(ce, true);
   }

   public void gn() {
      this.an.b(cd, false);
      this.an.b(ce, false);
   }

   public boolean go() {
      return this.an.b(cc);
   }

   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public float gp() {
      return (float)this.cg / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bja<? extends bux> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.a_($$3.d()).a(apv.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
