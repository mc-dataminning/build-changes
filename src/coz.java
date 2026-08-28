import java.util.UUID;
import javax.annotation.Nullable;

public class coz extends cox implements bxj {
   private static final bwi c = bwo.bR.n().a(0.5F).b(0.97F);
   private static final alg bJ = alg.b("attacking");
   private static final byi bK = new byi(bJ, 0.05, byi.a.a);
   private static final bto bL = baq.a(0, 1);
   private int bM;
   private static final bto bN = baq.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;
   private static final int bQ = 10;
   private static final bto bR = baq.a(4, 6);
   private int bS;

   public coz(bwo<? extends coz> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bP = $$0;
   }

   @Override
   protected void m() {
      this.bD.a(2, new cfp(this, 1.0, false));
      this.bD.a(7, new cfn(this, 1.0));
      this.bE.a(1, new cfs(this).a());
      this.bE.a(2, new cft<>(this, crc.class, 10, true, false, this::a));
      this.bE.a(3, new cfz<>(this, true));
   }

   public static byj.a gy() {
      return cox.gs().a(byk.A, 0.0).a(byk.v, 0.23F).a(byk.c, 5.0);
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(arq $$0) {
      byg $$1 = this.g(byk.v);
      if (this.X_()) {
         if (!this.n_() && !$$1.b(bJ)) {
            $$1.b(bK);
         }

         this.gz();
      } else if ($$1.b(bJ)) {
         $$1.c(bJ);
      }

      this.a($$0, true);
      if (this.f() != null) {
         this.gA();
      }

      super.a($$0);
   }

   private void gz() {
      if (this.bM > 0) {
         this.bM--;
         if (this.bM == 0) {
            this.gC();
         }
      }
   }

   private void gA() {
      if (this.bS > 0) {
         this.bS--;
      } else {
         if (this.P().a(this.f())) {
            this.gB();
         }

         this.bS = bR.a(this.ae);
      }
   }

   private void gB() {
      double $$0 = this.h(byk.m);
      fel $$1 = fel.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(coz.class, $$1, bwm.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.g(this.f()));
   }

   private void gC() {
      this.a(awn.EK, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void g(@Nullable bxe $$0) {
      if (this.f() == null && $$0 != null) {
         this.bM = bL.a(this.ae);
         this.bS = bR.a(this.ae);
      }

      super.g($$0);
   }

   @Override
   public void c() {
      this.a(bN.a(this.ae));
   }

   public static boolean b(bwo<coz> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.an() != bua.a && !$$1.a_($$3.e()).a(dmh.lq);
   }

   @Override
   public boolean a(djd $$0) {
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
      this.bO = $$0;
   }

   @Override
   public int a() {
      return this.bO;
   }

   @Override
   protected awm u() {
      return this.X_() ? awn.EK : awn.EJ;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.EM;
   }

   @Override
   protected awm l_() {
      return awn.EL;
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      this.a(bwp.a, new czd(czh.pK));
   }

   @Override
   protected czd t() {
      return czd.k;
   }

   @Override
   protected void gx() {
      this.g(byk.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bP;
   }

   @Override
   public boolean a(arq $$0, crc $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(arq $$0, czd $$1) {
      return this.g($$1);
   }
}
