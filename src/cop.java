import java.util.UUID;
import javax.annotation.Nullable;

public class cop extends com implements bxe {
   private static final bwd c = bwj.bR.n().a(0.5F).b(0.97F);
   private static final ale bI = ale.b("attacking");
   private static final byd bJ = new byd(bI, 0.05, byd.a.a);
   private static final btj bK = bao.a(0, 1);
   private int bL;
   private static final btj bM = bao.a(20, 39);
   private int bN;
   @Nullable
   private UUID bO;
   private static final int bP = 10;
   private static final btj bQ = bao.a(4, 6);
   private int bR;

   public cop(bwj<? extends cop> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bO = $$0;
   }

   @Override
   protected void m() {
      this.bC.a(2, new cfk(this, 1.0, false));
      this.bC.a(7, new cfi(this, 1.0));
      this.bD.a(1, new cfn(this).a());
      this.bD.a(2, new cfo<>(this, cqs.class, 10, true, false, this::a));
      this.bD.a(3, new cfu<>(this, true));
   }

   public static bye.a gx() {
      return com.gr().a(byf.A, 0.0).a(byf.v, 0.23F).a(byf.c, 5.0);
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(aro $$0) {
      byb $$1 = this.g(byf.v);
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
      double $$0 = this.h(byf.m);
      fdr $$1 = fdr.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cop.class, $$1, bwh.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.g(this.f()));
   }

   private void gB() {
      this.a(awl.EE, this.fd() * 2.0F, this.fe() * 1.8F);
   }

   @Override
   public void g(@Nullable bwz $$0) {
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

   public static boolean b(bwj<cop> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.an() != btv.a && !$$1.a_($$3.e()).a(dlw.lm);
   }

   @Override
   public boolean a(dis $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(tx $$0) {
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
   protected awk u() {
      return this.W_() ? awl.EE : awl.ED;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.EG;
   }

   @Override
   protected awk l_() {
      return awl.EF;
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      this.a(bwk.a, new cys(cyw.pF));
   }

   @Override
   protected cys t() {
      return cys.k;
   }

   @Override
   protected void gw() {
      this.g(byf.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bO;
   }

   @Override
   public boolean a(aro $$0, cqs $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(aro $$0, cys $$1) {
      return this.h($$1);
   }
}
