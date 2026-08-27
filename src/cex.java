import java.util.List;
import java.util.function.Predicate;

public class cex extends ceb {
   private static final ajy<Integer> e = akc.a(cex.class, aka.b);
   int ch;
   int ci;
   private static final Predicate<bso> cj = $$0 -> {
      if ($$0 instanceof cly $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ak().a(awh.A);
   };
   static final cde ck = cde.b().e().d().a(cj);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cex(bsb<? extends cex> $$0, dca $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gA() {
      return this.as.a(e);
   }

   public void c(int $$0) {
      this.as.a(e, $$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (e.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gA());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cuh b() {
      return new cuh(cuk.sc);
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(1, new cex.a(this));
   }

   @Override
   public void l() {
      if (!this.dU().C && this.bI() && this.dg()) {
         if (this.ch > 0) {
            if (this.gA() == 0) {
               this.b(avo.vm);
               this.c(1);
            } else if (this.ch > 40 && this.gA() == 1) {
               this.b(avo.vm);
               this.c(2);
            }

            this.ch++;
         } else if (this.gA() != 0) {
            if (this.ci > 60 && this.gA() == 2) {
               this.b(avo.vl);
               this.c(1);
            } else if (this.ci > 100 && this.gA() == 1) {
               this.b(avo.vl);
               this.c(0);
            }

            this.ci++;
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bI() && this.gA() > 0) {
         for (bsq $$1 : this.dU().a(bsq.class, this.cP().g(0.3), $$0 -> ck.a(this, $$0))) {
            if ($$1.bI()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bsq $$0) {
      int $$1 = this.gA();
      if ($$0.a(this.dX().b((bso)this), (float)(1 + $$1))) {
         $$0.b(new brh(brj.s, 60 * $$1, 0), this);
         this.a(avo.vq, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cly $$0) {
      int $$1 = this.gA();
      if ($$0 instanceof aqu && $$1 > 0 && $$0.a(this.dX().b((bso)this), (float)(1 + $$1))) {
         if (!this.ba()) {
            ((aqu)$$0).d.b(new ade(ade.k, 0.0F));
         }

         $$0.b(new brh(brj.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avn u() {
      return avo.vk;
   }

   @Override
   protected avn n_() {
      return avo.vn;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.vp;
   }

   @Override
   protected avn gz() {
      return avo.vo;
   }

   @Override
   public bry e(bsz $$0) {
      return super.e($$0).a(u(this.gA()));
   }

   private static float u(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends bzl {
      private final cex a;

      public a(cex $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bso> $$0 = this.a.dU().a(bso.class, this.a.cP().g(2.0), $$0x -> cex.ck.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.ch = 1;
         this.a.ci = 0;
      }

      @Override
      public void d() {
         this.a.ch = 0;
      }
   }
}
