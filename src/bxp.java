import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxp extends bvu {
   public static final bju bT = bju.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bup<? extends buo<? super bxp>>> bU = ImmutableList.of(bup.c, bup.d, bup.b, bup.n, bup.f, bup.q);
   protected static final ImmutableList<btk<?>> bW = ImmutableList.of(
      btk.n, btk.h, btk.m, btk.E, btk.t, btk.au, btk.r, btk.R, btk.S, btk.N, btk.J, btk.O, new btk[]{btk.Q, btk.U, btk.V, btk.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final afc<Boolean> cc = aff.a(bxp.class, afe.k);
   private static final afc<Boolean> cd = aff.a(bxp.class, afe.k);
   private static final afc<Boolean> ce = aff.a(bxp.class, afe.k);
   private boolean cf;
   private int cg;

   public bxp(bjx<? extends bxp> $$0, cqz $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(ebp.f, -1.0F);
      this.a(ebp.g, -1.0F);
   }

   public ckj s() {
      ate $$0 = ate.a((long)this.cv().hashCode());
      arh<ckb> $$1 = this.go() ? aqz.b : aqz.a;
      ig<ckb> $$2 = jy.an.a($$1);
      return ckc.a(ckm.vi, $$2.a($$0).get());
   }

   @Override
   protected blj.b<bxp> dO() {
      return blj.a(bW, bU);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return bxq.a(this.dO().a($$0));
   }

   public static blo.a t() {
      return bkl.A().a(blp.l, 10.0).a(blp.m, 0.2F).a(blp.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.n_()) {
         this.a(blp.c).a(1.0);
         this.gn();
      } else {
         this.a(blp.c).a(2.0);
         this.gm();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aqc w() {
      return this.go() ? aqd.jP : aqd.jF;
   }

   @Override
   protected aqc d(bir $$0) {
      return this.go() ? aqd.jS : aqd.jI;
   }

   @Override
   protected aqc m_() {
      return this.go() ? aqd.jQ : aqd.jG;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.jY, 0.15F, 1.0F);
   }

   protected aqc y() {
      return this.go() ? aqd.jU : aqd.jK;
   }

   @Nullable
   public bxp b(alq $$0, bjo $$1) {
      bxp $$2 = bjx.U.a((cqz)$$0);
      if ($$2 != null) {
         bxq.a($$2, $$0.E_());
         bjo $$3 = (bjo)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bxp $$4 && $$4.go() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public blj<bxp> dN() {
      return (blj<bxp>)super.dN();
   }

   @Override
   protected void X() {
      this.dL().ad().a("goatBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("goatActivityUpdate");
      bxq.a(this);
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
      float $$2 = asy.c(this.aU, $$0);
      float $$3 = asy.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public aqc d(ckj $$0) {
      return this.go() ? aqd.jR : aqd.jH;
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ($$2.a(ckm.pK) && !this.n_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         ckj $$3 = ckl.a($$2, $$0, ckm.pQ.al_());
         $$0.a($$1, $$3);
         return bib.a(this.dL().B);
      } else {
         bib $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dL().a(null, this, this.d($$2), aqe.g, 1.0F, asy.b(this.dL().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ate $$5 = $$0.E_();
      bxq.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.n_() && (double)$$5.i() < 0.1F) {
         afc<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   @Override
   public bju a(bkv $$0) {
      return $$0 == bkv.g ? bT.a(this.dY()) : super.a($$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.go());
      $$0.a("HasLeftHorn", this.ge());
      $$0.a("HasRightHorn", this.gk());
   }

   @Override
   public void a(rt $$0) {
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
   public void c_() {
      if (this.cf) {
         this.cg++;
      } else {
         this.cg -= 2;
      }

      this.cg = asy.a(this.cg, 0, 20);
      super.c_();
   }

   @Override
   protected void b_() {
      super.b_();
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
         afc<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         eif $$5 = this.dj();
         ckj $$6 = this.s();
         double $$7 = (double)asy.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)asy.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)asy.b(this.ag, -0.2F, 0.2F);
         bzq $$10 = new bzq(this.dL(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bjx<? extends bvu> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
