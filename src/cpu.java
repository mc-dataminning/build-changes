import java.util.UUID;
import javax.annotation.Nullable;

public class cpu extends cps implements bxz {
   private static final bww c = bxc.bS.n().a(0.5F).b(0.97F);
   private static final ali bJ = ali.b("attacking");
   private static final byy bK = new byy(bJ, 0.05, byy.a.a);
   private static final buc bL = bas.a(0, 1);
   private int bM;
   private static final buc bN = bas.a(20, 39);
   private int bO;
   @Nullable
   private UUID bP;
   private static final int bQ = 10;
   private static final buc bR = bas.a(4, 6);
   private int bS;

   public cpu(bxc<? extends cpu> $$0, djx $$1) {
      super($$0, $$1);
      this.a(eyf.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bP = $$0;
   }

   @Override
   protected void m() {
      this.bF.a(2, new cgf(this, 1.0, false));
      this.bF.a(7, new cgd(this, 1.0));
      this.bG.a(1, new cgi(this).a());
      this.bG.a(2, new cgj<>(this, crx.class, 10, true, false, this::a));
      this.bG.a(3, new cgp<>(this, true));
   }

   public static byz.a gB() {
      return cps.gv().a(bza.A, 0.0).a(bza.v, 0.23F).a(bza.c, 5.0);
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? c : super.e($$0);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   protected void a(ars $$0) {
      byw $$1 = this.g(bza.v);
      if (this.ae_()) {
         if (!this.n_() && !$$1.b(bJ)) {
            $$1.b(bK);
         }

         this.gC();
      } else if ($$1.b(bJ)) {
         $$1.c(bJ);
      }

      this.a($$0, true);
      if (this.f() != null) {
         this.gD();
      }

      super.a($$0);
   }

   private void gC() {
      if (this.bM > 0) {
         this.bM--;
         if (this.bM == 0) {
            this.gF();
         }
      }
   }

   private void gD() {
      if (this.bS > 0) {
         this.bS--;
      } else {
         if (this.P().a(this.f())) {
            this.gE();
         }

         this.bS = bR.a(this.ae);
      }
   }

   private void gE() {
      double $$0 = this.h(bza.m);
      ffl $$1 = ffl.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cpu.class, $$1, bxa.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.f() == null)
         .filter($$0x -> !$$0x.s(this.f()))
         .forEach($$0x -> $$0x.g(this.f()));
   }

   private void gF() {
      this.a(awp.EE, this.fe() * 2.0F, this.ff() * 1.8F);
   }

   @Override
   public void g(@Nullable bxu $$0) {
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

   public static boolean b(bxc<cpu> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.an() != buo.a && !$$1.a_($$3.e()).a(dne.lq);
   }

   @Override
   public boolean a(dka $$0) {
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
   protected awo u() {
      return this.ae_() ? awp.EE : awp.ED;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.EG;
   }

   @Override
   protected awo l_() {
      return awp.EF;
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      this.a(bxd.a, new czy(dac.pK));
   }

   @Override
   protected czy t() {
      return czy.k;
   }

   @Override
   protected void gA() {
      this.g(bza.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bP;
   }

   @Override
   public boolean a(ars $$0, crx $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(ars $$0, czy $$1) {
      return this.g($$1);
   }
}
