import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzs extends bxx {
   public static final blv bT = blv.b(0.9F, 1.3F).a(0.7F);
   private static final int ca = 2;
   private static final int cb = 1;
   protected static final ImmutableList<bws<? extends bwr<? super bzs>>> bU = ImmutableList.of(bws.c, bws.d, bws.b, bws.n, bws.f, bws.q);
   protected static final ImmutableList<bvm<?>> bW = ImmutableList.of(
      bvm.n, bvm.h, bvm.m, bvm.E, bvm.t, bvm.au, bvm.r, bvm.R, bvm.S, bvm.N, bvm.J, bvm.O, new bvm[]{bvm.Q, bvm.U, bvm.V, bvm.Y}
   );
   public static final int bX = 10;
   public static final double bY = 0.02;
   public static final double bZ = 0.1F;
   private static final agm<Boolean> cc = agp.a(bzs.class, ago.k);
   private static final agm<Boolean> cd = agp.a(bzs.class, ago.k);
   private static final agm<Boolean> ce = agp.a(bzs.class, ago.k);
   private boolean cf;
   private int cg;

   public bzs(bly<? extends bzs> $$0, cto $$1) {
      super($$0, $$1);
      this.N().a(true);
      this.a(efb.f, -1.0F);
      this.a(efb.g, -1.0F);
   }

   public cmx u() {
      auu $$0 = auu.a((long)this.cw().hashCode());
      asv<cmp> $$1 = this.go() ? asn.b : asn.a;
      il<cmp> $$2 = kd.an.a($$1);
      return cmq.a(cna.vV, $$2.a($$0).get());
   }

   @Override
   protected bnk.b<bzs> dP() {
      return bnk.a(bW, bU);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return bzt.a(this.dP().a($$0));
   }

   public static bnp.a w() {
      return bmm.C().a(bnq.l, 10.0).a(bnq.m, 0.2F).a(bnq.c, 2.0);
   }

   @Override
   protected void m() {
      if (this.o_()) {
         this.a(bnq.c).a(1.0);
         this.gn();
      } else {
         this.a(bnq.c).a(2.0);
         this.gm();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected arq y() {
      return this.go() ? arr.kq : arr.kg;
   }

   @Override
   protected arq d(bks $$0) {
      return this.go() ? arr.kt : arr.kj;
   }

   @Override
   protected arq n_() {
      return this.go() ? arr.kr : arr.kh;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.kz, 0.15F, 1.0F);
   }

   protected arq A() {
      return this.go() ? arr.kv : arr.kl;
   }

   @Nullable
   public bzs b(and $$0, blp $$1) {
      bzs $$2 = bly.V.a((cto)$$0);
      if ($$2 != null) {
         bzt.a($$2, $$0.F_());
         blp $$3 = (blp)($$0.F_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof bzs $$4 && $$4.go() || $$0.F_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bnk<bzs> dO() {
      return (bnk<bzs>)super.dO();
   }

   @Override
   protected void Z() {
      this.dM().af().a("goatBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("goatActivityUpdate");
      bzt.a(this);
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
      float $$2 = aun.c(this.aU, $$0);
      float $$3 = aun.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aU + $$3);
   }

   @Override
   public arq d(cmx $$0) {
      return this.go() ? arr.ks : arr.ki;
   }

   @Override
   public bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if ($$2.a(cna.qv) && !this.o_()) {
         $$0.a(this.A(), 1.0F, 1.0F);
         cmx $$3 = cmz.a($$2, $$0, cna.qB.am_());
         $$0.a($$1, $$3);
         return bka.a(this.dM().B);
      } else {
         bka $$4 = super.b($$0, $$1);
         if ($$4.a() && this.m($$2)) {
            this.dM().a(null, this, this.d($$2), ars.g, 1.0F, aun.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      auu $$5 = $$0.F_();
      bzt.a(this, $$5);
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
   public blv a(bmw $$0) {
      return $$0 == bmw.g ? bT.a(this.dZ()) : super.a($$0);
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

      this.cg = aun.a(this.cg, 0, 20);
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
         els $$5 = this.dk();
         cmx $$6 = this.u();
         double $$7 = (double)aun.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)aun.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)aun.b(this.ag, -0.2F, 0.2F);
         cbt $$10 = new cbt(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
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

   public static boolean c(bly<? extends bxx> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.a_($$3.d()).a(asg.bR) && a($$1, $$3);
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.1875F * $$2, 0.0F);
   }
}
