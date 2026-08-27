import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzt extends bxy {
   public static final blw bT = blw.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bwt<? extends bws<? super bzt>>> bU = ImmutableList.of(bwt.c, bwt.d, bwt.b, bwt.n, bwt.f, bwt.q);
   protected static final ImmutableList<bvn<?>> bW = ImmutableList.of(
      bvn.n, bvn.h, bvn.m, bvn.E, bvn.t, bvn.au, bvn.r, bvn.R, bvn.S, bvn.N, bvn.J, bvn.O, new bvn[]{bvn.Q, bvn.U, bvn.V, bvn.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final agm<Boolean> cc = agp.a(bzt.class, ago.k);
   private static final agm<Boolean> cd = agp.a(bzt.class, ago.k);
   private static final agm<Boolean> ce = agp.a(bzt.class, ago.k);
   private boolean cf;
   private int cg;

   public bzt(blz<? extends bzt> $$0, ctp $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(efc.f, -1.0F);
      this.a(efc.g, -1.0F);
   }

   public cmy u() {
      auv $$0 = auv.a((long)this.cw().hashCode());
      asw<cmq> $$1 = this.go() ? aso.b : aso.a;
      il<cmq> $$2 = kd.an.a($$1);
      return cmr.a(cnb.vV, $$2.a($$0).get());
   }

   @Override
   protected bnl.b<bzt> dP() {
      return bnl.a(bW, bU);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return bzu.a(this.dP().a($$0));
   }

   public static bnq.a w() {
      return bmn.C().a(bnr.l, 10.0).a(bnr.m, 0.2F).a(bnr.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.a(bnr.c).a(1.0);
         this.gn();
      } else {
         this.a(bnr.c).a(2.0);
         this.gm();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected arr y() {
      return this.go() ? ars.kq : ars.kg;
   }

   @Override
   protected arr d(bkt $$0) {
      return this.go() ? ars.kt : ars.kj;
   }

   @Override
   protected arr n_() {
      return this.go() ? ars.kr : ars.kh;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.kz, 0.15F, 1.0F);
   }

   protected arr A() {
      return this.go() ? ars.kv : ars.kl;
   }

   @Nullable
   public bzt b(and $$0, blq $$1) {
      bzt $$2 = blz.V.a((ctp)$$0);
      if ($$2 != null) {
         bzu.a($$2, $$0.F_());
         blq $$3 = (blq)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bzt $$4 && $$4.go() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bnl<bzt> dO() {
      return (bnl<bzt>)super.dO();
   }

   @Override
   protected void Z() {
      this.dM().af().a("goatBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("goatActivityUpdate");
      bzu.a(this);
      this.dM().af().c();
      super.Z();
   }

   @Override
   public int ab() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.ab();
      float $$2 = auo.c(this.aU, $$0);
      float $$3 = auo.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public arr d(cmy $$0) {
      return this.go() ? ars.ks : ars.ki;
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.a(cnb.qv) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         cmy $$3 = cna.a($$2, $$0, cnb.qB.am_());
         $$0.a($$1, $$3);
         return bkb.a(this.dM().B);
      } else {
         bkb $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dM().a(null, this, this.d($$2), art.g, 1.0F, auo.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      auv $$5 = $$0.F_();
      bzu.a(this, $$5);
      this.w($$5.j() < 0.02);
      this.m();
      if (!this.o_() && (double)$$5.i() < 0.1F) {
         agm<Boolean> $$6 = $$5.h() ? cd : ce;
         this.an.b($$6, false);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public blw a(bmx $$0) {
      return $$0 == bmx.g ? bT.a(this.dZ()) : super.a($$0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.go());
      $$0.a("HasLeftHorn", this.ge());
      $$0.a("HasRightHorn", this.gk());
   }

   @Override
   public void a(sn $$0) {
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

      this.cg = auo.a(this.cg, 0, 20);
      super.d_();
   }

   @Override
   protected void c_() {
      super.c_();
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
         agm<Boolean> $$2;
         if (!$$0) {
            $$2 = ce;
         } else if (!$$1) {
            $$2 = cd;
         } else {
            $$2 = this.ag.h() ? cd : ce;
         }

         this.an.b($$2, false);
         elt $$5 = this.dk();
         cmy $$6 = this.u();
         double $$7 = (double)auo.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)auo.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)auo.b(this.ag, -0.2F, 0.2F);
         cbu $$10 = new cbu(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dM().b($$10);
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

   public static boolean c(blz<? extends bxy> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.a_($$3.d()).a(ash.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
