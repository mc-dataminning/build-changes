import java.util.List;
import java.util.function.Predicate;

public class cbf extends caj {
   private static final aii<Integer> e = ail.a(cbf.class, aik.b);
   int bV;
   int bW;
   private static final Predicate<box> bX = $$0 -> {
      if ($$0 instanceof cia $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ai().a(auh.A);
   };
   static final bzn bY = bzn.b().e().d().a(bX);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cbf(bol<? extends cbf> $$0, cwe $$1) {
      super($$0, $$1);
      this.k_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(e, 0);
   }

   public int gn() {
      return this.am.b(e);
   }

   public void c(int $$0) {
      this.am.b(e, $$0);
   }

   @Override
   public void a(aii<?> $$0) {
      if (e.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gn());
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cpq b() {
      return new cpq(cpt.qE);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(1, new cbf.a(this));
   }

   @Override
   public void l() {
      if (!this.dJ().B && this.bx() && this.cV()) {
         if (this.bV > 0) {
            if (this.gn() == 0) {
               this.b(atp.uk);
               this.c(1);
            } else if (this.bV > 40 && this.gn() == 1) {
               this.b(atp.uk);
               this.c(2);
            }

            this.bV++;
         } else if (this.gn() != 0) {
            if (this.bW > 60 && this.gn() == 2) {
               this.b(atp.uj);
               this.c(1);
            } else if (this.bW > 100 && this.gn() == 1) {
               this.b(atp.uj);
               this.c(0);
            }

            this.bW++;
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.gn() > 0) {
         for (boz $$1 : this.dJ().a(boz.class, this.cE().g(0.3), $$0 -> bY.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(boz $$0) {
      int $$1 = this.gn();
      if ($$0.a(this.dK().b((box)this), (float)(1 + $$1))) {
         $$0.b(new bns(bnu.s, 60 * $$1, 0), this);
         this.a(atp.uo, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cia $$0) {
      int $$1 = this.gn();
      if ($$0 instanceof apb && $$1 > 0 && $$0.a(this.dK().b((box)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((apb)$$0).d.b(new abp(abp.k, 0.0F));
         }

         $$0.b(new bns(bnu.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected ato y() {
      return atp.ui;
   }

   @Override
   protected ato n_() {
      return atp.ul;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.un;
   }

   @Override
   protected ato gm() {
      return atp.um;
   }

   @Override
   public boi e(bpi $$0) {
      return super.e($$0).a(t(this.gn()));
   }

   private static float t(int $$0) {
      switch ($$0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   static class a extends bvu {
      private final cbf a;

      public a(cbf $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<box> $$0 = this.a.dJ().a(box.class, this.a.cE().g(2.0), $$0x -> cbf.bY.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bV = 1;
         this.a.bW = 0;
      }

      @Override
      public void d() {
         this.a.bV = 0;
      }
   }
}
