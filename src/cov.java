import java.util.UUID;
import javax.annotation.Nullable;

public class cov extends cot implements bxh {
   private static final bwg c = bwm.bR.n().a(0.5F).b(0.97F);
   private static final alg bI = alg.b("attacking");
   private static final byg bJ = new byg(bI, 0.05, byg.a.a);
   private static final btm bK = baq.a(0, 1);
   private int bL;
   private static final btm bM = baq.a(20, 39);
   private int bN;
   @Nullable
   private UUID bO;
   private static final int bP = 10;
   private static final btm bQ = baq.a(4, 6);
   private int bR;

   public cov(bwm<? extends cov> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bO = $$0;
   }

   @Override
   protected void m() {
      this.bC.a(2, new cfn(this, 1.0, false));
      this.bC.a(7, new cfl(this, 1.0));
      this.bD.a(1, new cfq(this).a());
      this.bD.a(2, new cfr<>(this, cqy.class, 10, true, false, this::a));
      this.bD.a(3, new cfx<>(this, true));
   }

   public static byh.a gx() {
      return cot.gr().a(byi.A, 0.0).a(byi.v, 0.23F).a(byi.c, 5.0);
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(arq $$0) {
      bye $$1 = this.g(byi.v);
      if (this.W_()) {
         if (!this.n_() && !$$1.b(bI)) {
            $$1.b(bJ);
         }

         this.gy();
      } else if ($$1.b(bI)) {
         $$1.c(bI);
      }

      this.a($$0, true);
      if (this.f() != null) {
         this.gz();
      }

      super.a($$0);
   }

   private void gy() {
      if (this.bL > 0) {
         this.bL--;
         if (this.bL == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.bR > 0) {
         this.bR--;
      } else {
         if (this.P().a(this.f())) {
            this.gA();
         }

         this.bR = bQ.a(this.ae);
      }
   }

   private void gA() {
      double $$0 = this.h(byi.m);
      fed $$1 = fed.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cov.class, $$1, bwk.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.g(this.f()));
   }

   private void gB() {
      this.a(awn.EH, this.fd() * 2.0F, this.fe() * 1.8F);
   }

   @Override
   public void g(@Nullable bxc $$0) {
      if (this.f() == null && $$0 != null) {
         this.bL = bK.a(this.ae);
         this.bR = bQ.a(this.ae);
      }

      super.g($$0);
   }

   @Override
   public void c() {
      this.a(bM.a(this.ae));
   }

   public static boolean b(bwm<cov> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.an() != bty.a && !$$1.a_($$3.e()).a(dmc.ln);
   }

   @Override
   public boolean a(diy $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.bN = $$0;
   }

   @Override
   public int a() {
      return this.bN;
   }

   @Override
   protected awm u() {
      return this.W_() ? awn.EH : awn.EG;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.EJ;
   }

   @Override
   protected awm l_() {
      return awn.EI;
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      this.a(bwn.a, new cyy(czc.pH));
   }

   @Override
   protected cyy t() {
      return cyy.k;
   }

   @Override
   protected void gw() {
      this.g(byi.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bO;
   }

   @Override
   public boolean a(arq $$0, cqy $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(arq $$0, cyy $$1) {
      return this.h($$1);
   }
}
