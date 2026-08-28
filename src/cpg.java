import java.util.UUID;
import javax.annotation.Nullable;

public class cpg extends cpe implements bxo {
   private static final bwl c = bwr.bR.n().a(0.5F).b(0.97F);
   private static final alg bJ = alg.b("attacking");
   private static final byn bK = new byn(bJ, 0.05, byn.a.a);
   private static final btr bL = baq.a(0, 1);
   private int bM;
   private static final btr bN = baq.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;
   private static final int bQ = 10;
   private static final btr bR = baq.a(4, 6);
   private int bS;

   public cpg(bwr<? extends cpg> $$0, djh $$1) {
      super($$0, $$1);
      this.a(exm.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bP = $$0;
   }

   @Override
   protected void m() {
      this.bD.a(2, new cfu(this, 1.0, false));
      this.bD.a(7, new cfs(this, 1.0));
      this.bE.a(1, new cfx(this).a());
      this.bE.a(2, new cfy<>(this, crj.class, 10, true, false, this::a));
      this.bE.a(3, new cge<>(this, true));
   }

   public static byo.a gA() {
      return cpe.gu().a(byp.A, 0.0).a(byp.v, 0.23F).a(byp.c, 5.0);
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(arq $$0) {
      byl $$1 = this.g(byp.v);
      if (this.X_()) {
         if (!this.n_() && !$$1.b(bJ)) {
            $$1.b(bK);
         }

         this.gB();
      } else if ($$1.b(bJ)) {
         $$1.c(bJ);
      }

      this.a($$0, true);
      if (this.f() != null) {
         this.gC();
      }

      super.a($$0);
   }

   private void gB() {
      if (this.bM > 0) {
         this.bM--;
         if (this.bM == 0) {
            this.gE();
         }
      }
   }

   private void gC() {
      if (this.bS > 0) {
         this.bS--;
      } else {
         if (this.P().a(this.f())) {
            this.gD();
         }

         this.bS = bR.a(this.ae);
      }
   }

   private void gD() {
      double $$0 = this.h(byp.m);
      fes $$1 = fes.a(this.ds()).c($$0, 10.0, $$0);
      this.dU()
         .a(cpg.class, $$1, bwp.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.g(this.f()));
   }

   private void gE() {
      this.a(awn.EK, this.fd() * 2.0F, this.fe() * 1.8F);
   }

   @Override
   public void g(@Nullable bxj $$0) {
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

   public static boolean b(bwr<cpg> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.an() != bud.a && !$$1.a_($$3.e()).a(dmo.lq);
   }

   @Override
   public boolean a(djk $$0) {
      return $$0.f(this) && !$$0.d(this.cQ());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(this.dU(), $$0);
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
   protected awm e(bux $$0) {
      return awn.EM;
   }

   @Override
   protected awm l_() {
      return awn.EL;
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      this.a(bws.a, new czk(czo.pK));
   }

   @Override
   protected czk t() {
      return czk.k;
   }

   @Override
   protected void gz() {
      this.g(byp.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bP;
   }

   @Override
   public boolean a(arq $$0, crj $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(arq $$0, czk $$1) {
      return this.g($$1);
   }
}
