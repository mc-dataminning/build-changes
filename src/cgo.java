import java.util.List;
import java.util.function.Predicate;

public class cgo extends cfr {
   private static final akg<Integer> bZ = akk.a(cgo.class, aki.b);
   int ca;
   int cb;
   private static final Predicate<buf> cc = $$0 -> {
      if ($$0 instanceof cnp $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ao().a(aww.A);
   };
   static final cev cd = cev.b().e().d().a(cc);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cgo(btq<? extends cgo> $$0, dds $$1) {
      super($$0, $$1);
      this.i_();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
   }

   public int gq() {
      return this.am.a(bZ);
   }

   public void b(int $$0) {
      this.am.a(bZ, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (bZ.equals($$0)) {
         this.i_();
      }

      super.a($$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gq());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.b(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cvl V_() {
      return new cvl(cvo.qG);
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(1, new cgo.a(this));
   }

   @Override
   public void l() {
      if (!this.dS().B && this.bI() && this.df()) {
         if (this.ca > 0) {
            if (this.gq() == 0) {
               this.b(awd.uS);
               this.b(1);
            } else if (this.ca > 40 && this.gq() == 1) {
               this.b(awd.uS);
               this.b(2);
            }

            this.ca++;
         } else if (this.gq() != 0) {
            if (this.cb > 60 && this.gq() == 2) {
               this.b(awd.uR);
               this.b(1);
            } else if (this.cb > 100 && this.gq() == 1) {
               this.b(awd.uR);
               this.b(0);
            }

            this.cb++;
         }
      }

      super.l();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bI() && this.gq() > 0) {
         for (buh $$1 : this.dS().a(buh.class, this.cO().g(0.3), $$0 -> cd.a(this, $$0))) {
            if ($$1.bI()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(buh $$0) {
      int $$1 = this.gq();
      if ($$0.a(this.dT().b((buf)this), (float)(1 + $$1))) {
         $$0.b(new bsq(bss.s, 60 * $$1, 0), this);
         this.a(awd.uW, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cnp $$0) {
      int $$1 = this.gq();
      if ($$0 instanceof arh && $$1 > 0 && $$0.a(this.dT().b((buf)this), (float)(1 + $$1))) {
         if (!this.ba()) {
            ((arh)$$0).c.b(new adg(adg.k, 0.0F));
         }

         $$0.b(new bsq(bss.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected awc w() {
      return awd.uQ;
   }

   @Override
   protected awc n_() {
      return awd.uT;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.uV;
   }

   @Override
   protected awc gp() {
      return awd.uU;
   }

   @Override
   public btm e(bur $$0) {
      return super.e($$0).a(c(this.gq()));
   }

   private static float c(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends cbc {
      private final cgo a;

      public a(cgo $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         List<buf> $$0 = this.a.dS().a(buf.class, this.a.cO().g(2.0), $$0x -> cgo.cd.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void d() {
         this.a.ca = 1;
         this.a.cb = 0;
      }

      @Override
      public void e() {
         this.a.ca = 0;
      }
   }
}
