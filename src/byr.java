import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byr extends bww {
   public static final bkw bT = bkw.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bvr<? extends bvq<? super byr>>> bU = ImmutableList.of(bvr.c, bvr.d, bvr.b, bvr.n, bvr.f, bvr.q);
   protected static final ImmutableList<bum<?>> bW = ImmutableList.of(
      bum.n, bum.h, bum.m, bum.E, bum.t, bum.au, bum.r, bum.R, bum.S, bum.N, bum.J, bum.O, new bum[]{bum.Q, bum.U, bum.V, bum.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final afs<Boolean> cc = afv.a(byr.class, afu.k);
   private static final afs<Boolean> cd = afv.a(byr.class, afu.k);
   private static final afs<Boolean> ce = afv.a(byr.class, afu.k);
   private boolean cf;
   private int cg;

   public byr(bkz<? extends byr> $$0, csf $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(edi.f, -1.0F);
      this.a(edi.g, -1.0F);
   }

   public clo u() {
      atw $$0 = atw.a((long)this.cw().hashCode());
      arz<clg> $$1 = this.gp() ? arr.b : arr.a;
      ik<clg> $$2 = kc.ao.a($$1);
      return clh.a(clr.vU, $$2.a($$0).get());
   }

   @Override
   protected bml.b<byr> dQ() {
      return bml.a(bW, bU);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return bys.a(this.dQ().a($$0));
   }

   public static bmq.a w() {
      return bln.C().a(bmr.l, 10.0).a(bmr.m, 0.2F).a(bmr.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.a(bmr.c).a(1.0);
         this.go();
      } else {
         this.a(bmr.c).a(2.0);
         this.gn();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aqu y() {
      return this.gp() ? aqv.kh : aqv.jX;
   }

   @Override
   protected aqu d(bjt $$0) {
      return this.gp() ? aqv.kk : aqv.ka;
   }

   @Override
   protected aqu n_() {
      return this.gp() ? aqv.ki : aqv.jY;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.kq, 0.15F, 1.0F);
   }

   protected aqu A() {
      return this.gp() ? aqv.km : aqv.kc;
   }

   @Nullable
   public byr b(ami $$0, bkq $$1) {
      byr $$2 = bkz.U.a((csf)$$0);
      if ($$2 != null) {
         bys.a($$2, $$0.F_());
         bkq $$3 = (bkq)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof byr $$4 && $$4.gp() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bml<byr> dP() {
      return (bml<byr>)super.dP();
   }

   @Override
   protected void Z() {
      this.dN().ae().a("goatBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("goatActivityUpdate");
      bys.a(this);
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
      float $$2 = atq.c(this.aU, $$0);
      float $$3 = atq.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public aqu d(clo $$0) {
      return this.gp() ? aqv.kj : aqv.jZ;
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$2.a(clr.qv) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         clo $$3 = clq.a($$2, $$0, clr.qB.an_());
         $$0.a($$1, $$3);
         return bjb.a(this.dN().B);
      } else {
         bjb $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dN().a(null, this, this.d($$2), aqw.g, 1.0F, atq.b(this.dN().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      atw $$5 = $$0.F_();
      bys.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.o_() && (double)$$5.i() < 0.1F) {
         afs<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   @Override
   public bkw a(blx $$0) {
      return $$0 == blx.g ? bT.a(this.ea()) : super.a($$0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gp());
      $$0.a("HasLeftHorn", this.gf());
      $$0.a("HasRightHorn", this.gl());
   }

   @Override
   public void a(sd $$0) {
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
   public void d_() {
      if (this.cf) {
         this.cg++;
      } else {
         this.cg -= 2;
      }

      this.cg = atq.a(this.cg, 0, 20);
      super.d_();
   }

   @Override
   protected void c_() {
      super.c_();
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
         afs<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         ejz $$5 = this.dl();
         clo $$6 = this.u();
         double $$7 = (double)atq.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)atq.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)atq.b(this.ag, -0.2F, 0.2F);
         cas $$10 = new cas(this.dN(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bkz<? extends bww> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
