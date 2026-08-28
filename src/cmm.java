import java.util.UUID;
import javax.annotation.Nullable;

public class cmm extends cmk implements bvf {
   private static final buh c = bul.bx.n().a(0.5F).b(0.97F);
   private static final ali d = ali.b("attacking");
   private static final bwg cb = new bwg(d, 0.05, bwg.a.a);
   private static final bro cc = bal.a(0, 1);
   private int cd;
   private static final bro ce = bal.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;
   private static final int ch = 10;
   private static final bro ci = bal.a(4, 6);
   private int cj;

   public cmm(bul<? extends cmm> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Override
   protected void t() {
      this.bS.a(2, new cdn(this, 1.0, false));
      this.bS.a(7, new cdl(this, 1.0));
      this.bT.a(1, new cdq(this).a());
      this.bT.a(2, new cdr<>(this, com.class, 10, true, false, this::a_));
      this.bT.a(3, new cdx<>(this, true));
   }

   public static bwh.a gD() {
      return cmk.gx().a(bwi.A, 0.0).a(bwi.v, 0.23F).a(bwi.c, 5.0);
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected void ac() {
      bwe $$0 = this.g(bwi.v);
      if (this.ae_()) {
         if (!this.p_() && !$$0.b(d)) {
            $$0.b(cb);
         }

         this.gE();
      } else if ($$0.b(d)) {
         $$0.c(d);
      }

      this.a((arn)this.dX(), true);
      if (this.m() != null) {
         this.gF();
      }

      if (this.ae_()) {
         this.bd = this.ag;
      }

      super.ac();
   }

   private void gE() {
      if (this.cd > 0) {
         this.cd--;
         if (this.cd == 0) {
            this.gH();
         }
      }
   }

   private void gF() {
      if (this.cj > 0) {
         this.cj--;
      } else {
         if (this.Q().a(this.m())) {
            this.gG();
         }

         this.cj = ci.a(this.af);
      }
   }

   private void gG() {
      double $$0 = this.h(bwi.m);
      ezi $$1 = ezi.a(this.dv()).c($$0, 10.0, $$0);
      this.dX()
         .a(cmm.class, $$1, buj.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.m() == null)
         .filter($$0x -> !$$0x.s(this.m()))
         .forEach($$0x -> $$0x.h(this.m()));
   }

   private void gH() {
      this.a(awl.DK, this.fi() * 2.0F, this.fj() * 1.8F);
   }

   @Override
   public void h(@Nullable bva $$0) {
      if (this.m() == null && $$0 != null) {
         this.cd = cc.a(this.af);
         this.cj = ci.a(this.af);
      }

      if ($$0 instanceof com) {
         this.c((com)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
   }

   public static boolean b(bul<cmm> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.ak() != bsa.a && !$$1.a_($$3.e()).a(dig.kK);
   }

   @Override
   public boolean a(dfe $$0) {
      return $$0.f(this) && !$$0.d(this.cS());
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(this.dX(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   protected awk w() {
      return this.ae_() ? awl.DK : awl.DJ;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.DM;
   }

   @Override
   protected awk o_() {
      return awl.DL;
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      this.a(bum.a, new cwb(cwf.oX));
   }

   @Override
   protected cwb gu() {
      return cwb.k;
   }

   @Override
   protected void gC() {
      this.g(bwi.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   public boolean a(com $$0) {
      return this.a_((bva)$$0);
   }

   @Override
   public boolean i(cwb $$0) {
      return this.h($$0);
   }
}
