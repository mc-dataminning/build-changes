import java.util.UUID;
import javax.annotation.Nullable;

public class coe extends coc implements bww {
   private static final bvv c = bwb.bQ.n().a(0.5F).b(0.97F);
   private static final ald bH = ald.b("attacking");
   private static final bxv bI = new bxv(bH, 0.05, bxv.a.a);
   private static final btb bJ = bam.a(0, 1);
   private int bK;
   private static final btb bL = bam.a(20, 39);
   private int bM;
   @Nullable
   private UUID bN;
   private static final int bO = 10;
   private static final btb bP = bam.a(4, 6);
   private int bQ;

   public coe(bwb<? extends coe> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bN = $$0;
   }

   @Override
   protected void m() {
      this.bB.a(2, new cfc(this, 1.0, false));
      this.bB.a(7, new cfa(this, 1.0));
      this.bC.a(1, new cff(this).a());
      this.bC.a(2, new cfg<>(this, cqi.class, 10, true, false, this::a));
      this.bC.a(3, new cfm<>(this, true));
   }

   public static bxw.a gx() {
      return coc.gr().a(bxx.A, 0.0).a(bxx.v, 0.23F).a(bxx.c, 5.0);
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(arn $$0) {
      bxt $$1 = this.g(bxx.v);
      if (this.W_()) {
         if (!this.n_() && !$$1.b(bH)) {
            $$1.b(bI);
         }

         this.gy();
      } else if ($$1.b(bH)) {
         $$1.c(bH);
      }

      this.a($$0, true);
      if (this.f() != null) {
         this.gz();
      }

      super.a($$0);
   }

   private void gy() {
      if (this.bK > 0) {
         this.bK--;
         if (this.bK == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.bQ > 0) {
         this.bQ--;
      } else {
         if (this.P().a(this.f())) {
            this.gA();
         }

         this.bQ = bP.a(this.ae);
      }
   }

   private void gA() {
      double $$0 = this.h(bxx.m);
      fcp $$1 = fcp.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(coe.class, $$1, bvz.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.h(this.f()));
   }

   private void gB() {
      this.a(awk.EE, this.fd() * 2.0F, this.fe() * 1.8F);
   }

   @Override
   public void h(@Nullable bwr $$0) {
      if (this.f() == null && $$0 != null) {
         this.bK = bJ.a(this.ae);
         this.bQ = bP.a(this.ae);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bL.a(this.ae));
   }

   public static boolean b(bwb<coe> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.an() != btn.a && !$$1.a_($$3.e()).a(dkw.lm);
   }

   @Override
   public boolean a(dhs $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.bM = $$0;
   }

   @Override
   public int a() {
      return this.bM;
   }

   @Override
   protected awj u() {
      return this.W_() ? awk.EE : awk.ED;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.EG;
   }

   @Override
   protected awj l_() {
      return awk.EF;
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      this.a(bwc.a, new cxy(cyc.pF));
   }

   @Override
   protected cxy t() {
      return cxy.k;
   }

   @Override
   protected void gw() {
      this.g(bxx.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bN;
   }

   @Override
   public boolean a(arn $$0, cqi $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(arn $$0, cxy $$1) {
      return this.h($$1);
   }
}
