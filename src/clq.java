import java.util.UUID;
import javax.annotation.Nullable;

public class clq extends clo implements buk {
   private static final btm c = btq.bx.n().a(0.5F).b(0.97F);
   private static final alb d = alb.b("attacking");
   private static final bvk cc = new bvk(d, 0.05, bvk.a.a);
   private static final bqv cd = bad.a(0, 1);
   private int ce;
   private static final bqv cf = bad.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;
   private static final int ci = 10;
   private static final bqv cj = bad.a(4, 6);
   private int ck;

   public clq(btq<? extends clq> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Override
   protected void t() {
      this.bT.a(2, new ccr(this, 1.0, false));
      this.bT.a(7, new ccp(this, 1.0));
      this.bU.a(1, new ccu(this).a());
      this.bU.a(2, new ccv<>(this, cnp.class, 10, true, false, this::a_));
      this.bU.a(3, new cdb<>(this, true));
   }

   public static bvl.a gx() {
      return clo.gr().a(bvm.A, 0.0).a(bvm.v, 0.23F).a(bvm.c, 5.0);
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void ad() {
      bvi $$0 = this.g(bvm.v);
      if (this.ac_()) {
         if (!this.o_() && !$$0.b(d)) {
            $$0.b(cc);
         }

         this.gy();
      } else if ($$0.b(d)) {
         $$0.c(d);
      }

      this.a((arg)this.dS(), true);
      if (this.m() != null) {
         this.gz();
      }

      if (this.ac_()) {
         this.ba = this.ag;
      }

      super.ad();
   }

   private void gy() {
      if (this.ce > 0) {
         this.ce--;
         if (this.ce == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.ck > 0) {
         this.ck--;
      } else {
         if (this.Q().a(this.m())) {
            this.gA();
         }

         this.ck = cj.a(this.af);
      }
   }

   private void gA() {
      double $$0 = this.h(bvm.m);
      exz $$1 = exz.a(this.dq()).c($$0, 10.0, $$0);
      this.dS()
         .a(clq.class, $$1, bto.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.m() == null)
         .filter($$0x -> !$$0x.s(this.m()))
         .forEach($$0x -> $$0x.h(this.m()));
   }

   private void gB() {
      this.a(awd.DM, this.fd() * 2.0F, this.fe() * 1.8F);
   }

   @Override
   public void h(@Nullable buf $$0) {
      if (this.m() == null && $$0 != null) {
         this.ce = cd.a(this.af);
         this.ck = cj.a(this.af);
      }

      if ($$0 instanceof cnp) {
         this.c((cnp)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cf.a(this.af));
   }

   public static boolean b(btq<clq> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.am() != brh.a && !$$1.a_($$3.e()).a(dgx.kK);
   }

   @Override
   public boolean a(ddv $$0) {
      return $$0.f(this) && !$$0.d(this.cO());
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(this.dS(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   protected awc w() {
      return this.ac_() ? awd.DM : awd.DL;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.DO;
   }

   @Override
   protected awc n_() {
      return awd.DN;
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      this.a(btr.a, new cvl(cvo.oX));
   }

   @Override
   protected cvl go() {
      return cvl.k;
   }

   @Override
   protected void gw() {
      this.g(bvm.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   public boolean a(cnp $$0) {
      return this.a_((buf)$$0);
   }

   @Override
   public boolean l(cvl $$0) {
      return this.k($$0);
   }
}
