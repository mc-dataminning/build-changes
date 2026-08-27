import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bye extends bwj {
   public static final bkj bT = bkj.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bve<? extends bvd<? super bye>>> bU = ImmutableList.of(bve.c, bve.d, bve.b, bve.n, bve.f, bve.q);
   protected static final ImmutableList<btz<?>> bW = ImmutableList.of(
      btz.n, btz.h, btz.m, btz.E, btz.t, btz.au, btz.r, btz.R, btz.S, btz.N, btz.J, btz.O, new btz[]{btz.Q, btz.U, btz.V, btz.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final afm<Boolean> cc = afp.a(bye.class, afo.k);
   private static final afm<Boolean> cd = afp.a(bye.class, afo.k);
   private static final afm<Boolean> ce = afp.a(bye.class, afo.k);
   private boolean cf;
   private int cg;

   public bye(bkm<? extends bye> $$0, crs $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(ecr.f, -1.0F);
      this.a(ecr.g, -1.0F);
   }

   public clb s() {
      ato $$0 = ato.a((long)this.cv().hashCode());
      arr<ckt> $$1 = this.go() ? arj.b : arj.a;
      ig<ckt> $$2 = jy.ao.a($$1);
      return cku.a(cle.vj, $$2.a($$0).get());
   }

   @Override
   protected bly.b<bye> dO() {
      return bly.a(bW, bU);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return byf.a(this.dO().a($$0));
   }

   public static bmd.a t() {
      return bla.A().a(bme.l, 10.0).a(bme.m, 0.2F).a(bme.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.n_()) {
         this.a(bme.c).a(1.0);
         this.gn();
      } else {
         this.a(bme.c).a(2.0);
         this.gm();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aqm w() {
      return this.go() ? aqn.jR : aqn.jH;
   }

   @Override
   protected aqm d(bjg $$0) {
      return this.go() ? aqn.jU : aqn.jK;
   }

   @Override
   protected aqm m_() {
      return this.go() ? aqn.jS : aqn.jI;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.ka, 0.15F, 1.0F);
   }

   protected aqm y() {
      return this.go() ? aqn.jW : aqn.jM;
   }

   @Nullable
   public bye b(ama $$0, bkd $$1) {
      bye $$2 = bkm.U.a((crs)$$0);
      if ($$2 != null) {
         byf.a($$2, $$0.E_());
         bkd $$3 = (bkd)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bye $$4 && $$4.go() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bly<bye> dN() {
      return (bly<bye>)super.dN();
   }

   @Override
   protected void X() {
      this.dL().ad().a("goatBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("goatActivityUpdate");
      byf.a(this);
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
      float $$2 = ati.c(this.aU, $$0);
      float $$3 = ati.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public aqm d(clb $$0) {
      return this.go() ? aqn.jT : aqn.jJ;
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.a(cle.pK) && !this.n_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         clb $$3 = cld.a($$2, $$0, cle.pQ.al_());
         $$0.a($$1, $$3);
         return biq.a(this.dL().B);
      } else {
         biq $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dL().a(null, this, this.d($$2), aqo.g, 1.0F, ati.b(this.dL().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      byf.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.n_() && (double)$$5.i() < 0.1F) {
         afm<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   @Override
   public bkj a(blk $$0) {
      return $$0 == blk.g ? bT.a(this.dY()) : super.a($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.go());
      $$0.a("HasLeftHorn", this.ge());
      $$0.a("HasRightHorn", this.gk());
   }

   @Override
   public void a(rz $$0) {
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

      this.cg = ati.a(this.cg, 0, 20);
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
         afm<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         eji $$5 = this.dj();
         clb $$6 = this.s();
         double $$7 = (double)ati.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)ati.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)ati.b(this.ag, -0.2F, 0.2F);
         caf $$10 = new caf(this.dL(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bkm<? extends bwj> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
