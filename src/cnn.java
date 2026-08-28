import java.util.UUID;
import javax.annotation.Nullable;

public class cnn extends cnl implements bwd {
   private static final bvd c = bvi.bQ.n().a(0.5F).b(0.97F);
   private static final aku bI = aku.b("attacking");
   private static final bxe bJ = new bxe(bI, 0.05, bxe.a.a);
   private static final bsj bK = bab.a(0, 1);
   private int bL;
   private static final bsj bM = bab.a(20, 39);
   private int bN;
   @Nullable
   private UUID bO;
   private static final int bP = 10;
   private static final bsj bQ = bab.a(4, 6);
   private int bR;

   public cnn(bvi<? extends cnn> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bO = $$0;
   }

   @Override
   protected void m() {
      this.bC.a(2, new cel(this, 1.0, false));
      this.bC.a(7, new cej(this, 1.0));
      this.bD.a(1, new ceo(this).a());
      this.bD.a(2, new cep<>(this, cpr.class, 10, true, false, this::a));
      this.bD.a(3, new cev<>(this, true));
   }

   public static bxf.a gz() {
      return cnl.gt().a(bxg.A, 0.0).a(bxg.v, 0.23F).a(bxg.c, 5.0);
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(ard $$0) {
      bxc $$1 = this.g(bxg.v);
      if (this.Z_()) {
         if (!this.n_() && !$$1.b(bI)) {
            $$1.b(bJ);
         }

         this.gA();
      } else if ($$1.b(bI)) {
         $$1.c(bI);
      }

      this.a($$0, true);
      if (this.f() != null) {
         this.gB();
      }

      super.a($$0);
   }

   private void gA() {
      if (this.bL > 0) {
         this.bL--;
         if (this.bL == 0) {
            this.gD();
         }
      }
   }

   private void gB() {
      if (this.bR > 0) {
         this.bR--;
      } else {
         if (this.P().a(this.f())) {
            this.gC();
         }

         this.bR = bQ.a(this.ae);
      }
   }

   private void gC() {
      double $$0 = this.h(bxg.m);
      fbs $$1 = fbs.a(this.ds()).c($$0, 10.0, $$0);
      this.dU()
         .a(cnn.class, $$1, bvg.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.h(this.f()));
   }

   private void gD() {
      this.a(awa.EE, this.fg() * 2.0F, this.fh() * 1.8F);
   }

   @Override
   public void h(@Nullable bvy $$0) {
      if (this.f() == null && $$0 != null) {
         this.bL = bK.a(this.ae);
         this.bR = bQ.a(this.ae);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bM.a(this.ae));
   }

   public static boolean b(bvi<cnn> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.an() != bsv.a && !$$1.a_($$3.e()).a(dkg.lm);
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this) && !$$0.d(this.cQ());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(this.dU(), $$0);
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
   protected avz u() {
      return this.Z_() ? awa.EE : awa.ED;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.EG;
   }

   @Override
   protected avz l_() {
      return awa.EF;
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      this.a(bvj.a, new cxh(cxl.pD));
   }

   @Override
   protected cxh t() {
      return cxh.k;
   }

   @Override
   protected void gy() {
      this.g(bxg.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bO;
   }

   @Override
   public boolean a(ard $$0, cpr $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(ard $$0, cxh $$1) {
      return this.g($$1);
   }
}
