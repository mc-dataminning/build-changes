import java.util.List;
import java.util.function.Predicate;

public class bse extends bri {
   private static final aby<Integer> e = acb.a(bse.class, aca.b);
   int bT;
   int bU;
   private static final Predicate<bfz> bV = $$0 -> $$0 instanceof byo && ((byo)$$0).f() ? false : $$0.ae() == bfn.f || $$0.eN() != bge.e;
   static final bqm bW = bqm.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public bse(bfn<? extends bse> $$0, cmm $$1) {
      super($$0, $$1);
      this.d_();
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(e, 0);
   }

   public int ga() {
      return this.am.b(e);
   }

   public void c(int $$0) {
      this.am.b(e, $$0);
   }

   @Override
   public void a(aby<?> $$0) {
      if (e.equals($$0)) {
         this.d_();
      }

      super.a($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("PuffState", this.ga());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cfz b() {
      return new cfz(cgc.pR);
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(1, new bse.a(this));
   }

   @Override
   public void l() {
      if (!this.dI().B && this.bs() && this.cV()) {
         if (this.bT > 0) {
            if (this.ga() == 0) {
               this.a(amh.te, this.eR(), this.eS());
               this.c(1);
            } else if (this.bT > 40 && this.ga() == 1) {
               this.a(amh.te, this.eR(), this.eS());
               this.c(2);
            }

            this.bT++;
         } else if (this.ga() != 0) {
            if (this.bU > 60 && this.ga() == 2) {
               this.a(amh.td, this.eR(), this.eS());
               this.c(1);
            } else if (this.bU > 100 && this.ga() == 1) {
               this.a(amh.td, this.eR(), this.eS());
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void b_() {
      super.b_();
      if (this.bs() && this.ga() > 0) {
         for (bgb $$1 : this.dI().a(bgb.class, this.cE().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bs()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bgb $$0) {
      int $$1 = this.ga();
      if ($$0.a(this.dJ().b((bfz)this), (float)(1 + $$1))) {
         $$0.b(new bfa(bfc.s, 60 * $$1, 0), this);
         this.a(amh.ti, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(byo $$0) {
      int $$1 = this.ga();
      if ($$0 instanceof aig && $$1 > 0 && $$0.a(this.dJ().b((bfz)this), (float)(1 + $$1))) {
         if (!this.aQ()) {
            ((aig)$$0).c.a(new vx(vx.j, 0.0F));
         }

         $$0.b(new bfa(bfc.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected amg s() {
      return amh.tc;
   }

   @Override
   protected amg g_() {
      return amh.tf;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.th;
   }

   @Override
   protected amg fZ() {
      return amh.tg;
   }

   @Override
   public bfk a(bgl $$0) {
      return super.a($$0).a(s(this.ga()));
   }

   private static float s(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends bmv {
      private final bse a;

      public a(bse $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bfz> $$0 = this.a.dI().a(bfz.class, this.a.cE().g(2.0), $$0x -> bse.bW.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bT = 1;
         this.a.bU = 0;
      }

      @Override
      public void d() {
         this.a.bT = 0;
      }
   }
}
