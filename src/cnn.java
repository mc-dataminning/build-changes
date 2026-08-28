import java.util.UUID;
import javax.annotation.Nullable;

public class cnn extends cnl implements bwg {
   private static final bvi c = bvm.bR.n().a(0.5F).b(0.97F);
   private static final alz cc = alz.b("attacking");
   private static final bxh cd = new bxh(cc, 0.05, bxh.a.a);
   private static final bsp ce = bbg.a(0, 1);
   private int cf;
   private static final bsp cg = bbg.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;
   private static final int cj = 10;
   private static final bsp ck = bbg.a(4, 6);
   private int cl;

   public cnn(bvm<? extends cnn> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   protected void p() {
      this.bT.a(2, new ceo(this, 1.0, false));
      this.bT.a(7, new cem(this, 1.0));
      this.bU.a(1, new cer(this).a());
      this.bU.a(2, new ces<>(this, cps.class, 10, true, false, this::a));
      this.bU.a(3, new cey<>(this, true));
   }

   public static bxi.a gv() {
      return cnl.gp().a(bxj.A, 0.0).a(bxj.v, 0.23F).a(bxj.c, 5.0);
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? c : super.e($$0);
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   protected void a(ash $$0) {
      bxf $$1 = this.g(bxj.v);
      if (this.ad_()) {
         if (!this.e_() && !$$1.b(cc)) {
            $$1.b(cd);
         }

         this.gw();
      } else if ($$1.b(cc)) {
         $$1.c(cc);
      }

      this.a($$0, true);
      if (this.O_() != null) {
         this.gx();
      }

      if (this.ad_()) {
         this.bd = this.af;
      }

      super.a($$0);
   }

   private void gw() {
      if (this.cf > 0) {
         this.cf--;
         if (this.cf == 0) {
            this.gz();
         }
      }
   }

   private void gx() {
      if (this.cl > 0) {
         this.cl--;
      } else {
         if (this.N().a(this.O_())) {
            this.gy();
         }

         this.cl = ck.a(this.ae);
      }
   }

   private void gy() {
      double $$0 = this.h(bxj.m);
      fbn $$1 = fbn.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cnn.class, $$1, bvk.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.O_() == null)
         .filter($$0x -> !$$0x.s(this.O_()))
         .forEach($$0x -> $$0x.h(this.O_()));
   }

   private void gz() {
      this.a(axf.Ee, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void h(@Nullable bwb $$0) {
      if (this.O_() == null && $$0 != null) {
         this.cf = ce.a(this.ae);
         this.cl = ck.a(this.ae);
      }

      if ($$0 instanceof cps) {
         this.c((cps)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ae));
   }

   public static boolean b(bvm<cnn> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.al() != btb.a && !$$1.a_($$3.e()).a(dkg.lf);
   }

   @Override
   public boolean a(dhd $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   protected axe u() {
      return this.ad_() ? axf.Ee : axf.Ed;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.Eg;
   }

   @Override
   protected axe o_() {
      return axf.Ef;
   }

   @Override
   protected void a(bam $$0, btc $$1) {
      this.a(bvn.a, new cxk(cxo.ps));
   }

   @Override
   protected cxk gm() {
      return cxk.k;
   }

   @Override
   protected void gu() {
      this.g(bxj.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public boolean a(ash $$0, cps $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(ash $$0, cxk $$1) {
      return this.g($$1);
   }
}
