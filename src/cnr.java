import java.util.UUID;
import javax.annotation.Nullable;

public class cnr extends cnp implements bwk {
   private static final bvm c = bvq.bR.n().a(0.5F).b(0.97F);
   private static final alz cc = alz.b("attacking");
   private static final bxl cd = new bxl(cc, 0.05, bxl.a.a);
   private static final bst ce = bbg.a(0, 1);
   private int cf;
   private static final bst cg = bbg.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;
   private static final int cj = 10;
   private static final bst ck = bbg.a(4, 6);
   private int cl;

   public cnr(bvq<? extends cnr> $$0, dhh $$1) {
      super($$0, $$1);
      this.a(eun.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   protected void p() {
      this.bT.a(2, new ces(this, 1.0, false));
      this.bT.a(7, new ceq(this, 1.0));
      this.bU.a(1, new cev(this).a());
      this.bU.a(2, new cew<>(this, cpw.class, 10, true, false, this::a));
      this.bU.a(3, new cfc<>(this, true));
   }

   public static bxm.a gx() {
      return cnp.gr().a(bxn.A, 0.0).a(bxn.v, 0.23F).a(bxn.c, 5.0);
   }

   @Override
   public bvm e(bwr $$0) {
      return this.e_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void a(ash $$0) {
      bxj $$1 = this.g(bxn.v);
      if (this.ad_()) {
         if (!this.e_() && !$$1.b(cc)) {
            $$1.b(cd);
         }

         this.gy();
      } else if ($$1.b(cc)) {
         $$1.c(cc);
      }

      this.a($$0, true);
      if (this.O_() != null) {
         this.gz();
      }

      if (this.ad_()) {
         this.bd = this.af;
      }

      super.a($$0);
   }

   private void gy() {
      if (this.cf > 0) {
         this.cf--;
         if (this.cf == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.cl > 0) {
         this.cl--;
      } else {
         if (this.N().a(this.O_())) {
            this.gA();
         }

         this.cl = ck.a(this.ae);
      }
   }

   private void gA() {
      double $$0 = this.h(bxn.m);
      fbs $$1 = fbs.a(this.du()).c($$0, 10.0, $$0);
      this.dW()
         .a(cnr.class, $$1, bvo.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.O_() == null)
         .filter($$0x -> !$$0x.s(this.O_()))
         .forEach($$0x -> $$0x.h(this.O_()));
   }

   private void gB() {
      this.a(axf.Ef, this.fg() * 2.0F, this.fh() * 1.8F);
   }

   @Override
   public void h(@Nullable bwf $$0) {
      if (this.O_() == null && $$0 != null) {
         this.cf = ce.a(this.ae);
         this.cl = ck.a(this.ae);
      }

      if ($$0 instanceof cpw) {
         this.c((cpw)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ae));
   }

   public static boolean b(bvq<cnr> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.al() != btf.a && !$$1.a_($$3.e()).a(dkn.lf);
   }

   @Override
   public boolean a(dhk $$0) {
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
      this.a(this.dW(), $$0);
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
      return this.ad_() ? axf.Ef : axf.Ee;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.Eh;
   }

   @Override
   protected axe o_() {
      return axf.Eg;
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      this.a(bvr.a, new cxo(cxs.ps));
   }

   @Override
   protected cxo go() {
      return cxo.j;
   }

   @Override
   protected void gw() {
      this.g(bxn.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public boolean a(ash $$0, cpw $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(ash $$0, cxo $$1) {
      return this.g($$1);
   }
}
