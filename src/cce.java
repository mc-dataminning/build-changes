import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cce extends bwr implements cba, ccg {
   private static final afo<Boolean> bW = afr.a(cce.class, afq.k);
   private static final float bX = 0.2F;
   private static final int bY = 40;
   private static final float bZ = 0.3F;
   private static final int ca = 1;
   private static final float cb = 0.6F;
   private static final int cc = 6;
   private static final float cd = 0.5F;
   private static final int ce = 300;
   private int cf;
   private int cg;
   private boolean ch;
   protected static final ImmutableList<? extends bvm<? extends bvl<? super cce>>> bT = ImmutableList.of(bvm.c, bvm.d, bvm.n, bvm.m);
   protected static final ImmutableList<? extends buh<?>> bU = ImmutableList.of(
      buh.r,
      buh.g,
      buh.h,
      buh.k,
      buh.l,
      buh.n,
      buh.m,
      buh.E,
      buh.t,
      buh.o,
      buh.p,
      buh.ap,
      new buh[]{buh.z, buh.ar, buh.as, buh.ao, buh.J, buh.av, buh.aw, buh.Y}
   );

   public cce(bku<? extends cce> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public boolean a(cdu $$0) {
      return !this.fT();
   }

   public static bml.a u() {
      return cbi.gl().a(bmm.l, 40.0).a(bmm.m, 0.3F).a(bmm.i, 0.6F).a(bmm.d, 1.0).a(bmm.c, 6.0);
   }

   @Override
   public boolean C(bkq $$0) {
      if (!($$0 instanceof blg)) {
         return false;
      } else {
         this.cf = 10;
         this.dN().a(this, (byte)4);
         this.a(aqr.li, 1.0F, this.eY());
         ccf.a(this, (blg)$$0);
         return ccg.a(this, (blg)$$0);
      }
   }

   @Override
   protected void e(blg $$0) {
      if (this.w()) {
         ccg.b(this, $$0);
      }
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof blg) {
            ccf.b(this, (blg)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bmg.b<cce> dQ() {
      return bmg.a(bU, bT);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return ccf.a(this.dQ().a($$0));
   }

   @Override
   public bmg<cce> dP() {
      return (bmg<cce>)super.dP();
   }

   @Override
   protected void Z() {
      this.dN().ae().a("hoglinBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      ccf.a(this);
      if (this.A()) {
         this.cg++;
         if (this.cg > 300) {
            this.b(aqr.lj);
            this.c((ame)this.dN());
         }
      } else {
         this.cg = 0;
      }
   }

   @Override
   public void c_() {
      if (this.cf > 0) {
         this.cf--;
      }

      super.c_();
   }

   @Override
   protected void m() {
      if (this.n_()) {
         this.bJ = 3;
         this.a(bmm.c).a(0.5);
      } else {
         this.bJ = 5;
         this.a(bmm.c).a(6.0);
      }
   }

   public static boolean c(bku<cce> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return !$$1.a_($$3.d()).a(cvc.kK);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fM();
   }

   @Override
   public float a(ht $$0, csd $$1) {
      if (ccf.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(cvc.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      bix $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fK();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cf = 10;
         this.a(aqr.li, 1.0F, this.eY());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gf() {
      return this.cf;
   }

   @Override
   public boolean ed() {
      return true;
   }

   @Override
   public int ef() {
      return this.bJ;
   }

   private void c(ame $$0) {
      cca $$1 = this.a(bku.bo, true);
      if ($$1 != null) {
         $$1.b(new bkd(bkf.i, 200, 0));
      }
   }

   @Override
   public boolean m(clj $$0) {
      return $$0.a(clm.dB);
   }

   public boolean w() {
      return !this.n_();
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bW, false);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.gm()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cg);
      if (this.ch) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cg = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().b(bW, $$0);
   }

   private boolean gm() {
      return this.an().b(bW);
   }

   public boolean A() {
      return !this.dN().D_().b() && !this.gm() && !this.fV();
   }

   private void x(boolean $$0) {
      this.ch = $$0;
   }

   public boolean gl() {
      return this.w() && !this.ch;
   }

   @Nullable
   @Override
   public bkl a(ame $$0, bkl $$1) {
      cce $$2 = bku.W.a((csa)$$0);
      if ($$2 != null) {
         $$2.fK();
      }

      return $$2;
   }

   @Override
   public boolean gg() {
      return !ccf.c(this) && super.gg();
   }

   @Override
   public aqs dc() {
      return aqs.f;
   }

   @Override
   protected aqq y() {
      return this.dN().B ? null : ccf.b(this).orElse(null);
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.ll;
   }

   @Override
   protected aqq m_() {
      return aqr.lk;
   }

   @Override
   protected aqq aN() {
      return aqr.lQ;
   }

   @Override
   protected aqq aO() {
      return aqr.lP;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.ln, 0.15F, 1.0F);
   }

   protected void b(aqq $$0) {
      this.a($$0, this.eX(), this.eY());
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }
}
