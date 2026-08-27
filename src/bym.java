import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bym extends bwr {
   public static final bkr bT = bkr.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bvm<? extends bvl<? super bym>>> bU = ImmutableList.of(bvm.c, bvm.d, bvm.b, bvm.n, bvm.f, bvm.q);
   protected static final ImmutableList<buh<?>> bW = ImmutableList.of(
      buh.n, buh.h, buh.m, buh.E, buh.t, buh.au, buh.r, buh.R, buh.S, buh.N, buh.J, buh.O, new buh[]{buh.Q, buh.U, buh.V, buh.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final afo<Boolean> cc = afr.a(bym.class, afq.k);
   private static final afo<Boolean> cd = afr.a(bym.class, afq.k);
   private static final afo<Boolean> ce = afr.a(bym.class, afq.k);
   private boolean cf;
   private int cg;

   public bym(bku<? extends bym> $$0, csa $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(edd.f, -1.0F);
      this.a(edd.g, -1.0F);
   }

   public clj u() {
      ats $$0 = ats.a((long)this.cw().hashCode());
      arv<clb> $$1 = this.gp() ? arn.b : arn.a;
      ig<clb> $$2 = jy.ao.a($$1);
      return clc.a(clm.vU, $$2.a($$0).get());
   }

   @Override
   protected bmg.b<bym> dQ() {
      return bmg.a(bW, bU);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return byn.a(this.dQ().a($$0));
   }

   public static bml.a w() {
      return bli.C().a(bmm.l, 10.0).a(bmm.m, 0.2F).a(bmm.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.n_()) {
         this.a(bmm.c).a(1.0);
         this.go();
      } else {
         this.a(bmm.c).a(2.0);
         this.gn();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aqq y() {
      return this.gp() ? aqr.kh : aqr.jX;
   }

   @Override
   protected aqq d(bjo $$0) {
      return this.gp() ? aqr.kk : aqr.ka;
   }

   @Override
   protected aqq m_() {
      return this.gp() ? aqr.ki : aqr.jY;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.kq, 0.15F, 1.0F);
   }

   protected aqq A() {
      return this.gp() ? aqr.km : aqr.kc;
   }

   @Nullable
   public bym b(ame $$0, bkl $$1) {
      bym $$2 = bku.U.a((csa)$$0);
      if ($$2 != null) {
         byn.a($$2, $$0.E_());
         bkl $$3 = (bkl)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bym $$4 && $$4.gp() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bmg<bym> dP() {
      return (bmg<bym>)super.dP();
   }

   @Override
   protected void Z() {
      this.dN().ae().a("goatBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("goatActivityUpdate");
      byn.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.ab();
      float $$2 = atm.c(this.aU, $$0);
      float $$3 = atm.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public aqq d(clj $$0) {
      return this.gp() ? aqr.kj : aqr.jZ;
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ($$2.a(clm.qv) && !this.n_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         clj $$3 = cll.a($$2, $$0, clm.qB.al_());
         $$0.a($$1, $$3);
         return bix.a(this.dN().B);
      } else {
         bix $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dN().a(null, this, this.d($$2), aqs.g, 1.0F, atm.b(this.dN().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      byn.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.n_() && (double)$$5.i() < 0.1F) {
         afo<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   @Override
   public bkr a(bls $$0) {
      return $$0 == bls.g ? bT.a(this.ea()) : super.a($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gp());
      $$0.a("HasLeftHorn", this.gf());
      $$0.a("HasRightHorn", this.gl());
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

      this.cg = atm.a(this.cg, 0, 20);
      super.c_();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cc, false);
      this.an.a(cd, true);
      this.an.a(ce, true);
   }

   public boolean gf() {
      return this.an.b(cd);
   }

   public boolean gl() {
      return this.an.b(ce);
   }

   public boolean gm() {
      boolean $$0 = this.gf();
      boolean $$1 = this.gl();
      if (!$$0 && !$$1) {
         return false;
      } else {
         afo<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         eju $$5 = this.dl();
         clj $$6 = this.u();
         double $$7 = (double)atm.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)atm.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)atm.b(this.ag, -0.2F, 0.2F);
         can $$10 = new can(this.dN(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dN().b($$10);
         return true;
      }
   }

   public void gn() {
      this.an.b(cd, true);
      this.an.b(ce, true);
   }

   public void go() {
      this.an.b(cd, false);
      this.an.b(ce, false);
   }

   public boolean gp() {
      return this.an.b(cc);
   }

   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public float gq() {
      return (float)this.cg / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bku<? extends bwr> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.a_($$3.d()).a(arg.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
