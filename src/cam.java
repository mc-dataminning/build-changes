import java.util.List;
import java.util.function.Predicate;

public class cam extends bzq {
   private static final aie<Integer> e = aih.a(cam.class, aig.b);
   int bT;
   int bU;
   private static final Predicate<bog> bV = $$0 -> {
      if ($$0 instanceof chh $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ai().a(auc.A);
   };
   static final byu bW = byu.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cam(bnu<? extends cam> $$0, cvn $$1) {
      super($$0, $$1);
      this.k_();
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(e, 0);
   }

   public int gi() {
      return this.am.b(e);
   }

   public void c(int $$0) {
      this.am.b(e, $$0);
   }

   @Override
   public void a(aie<?> $$0) {
      if (e.equals($$0)) {
         this.k_();
      }

      super.a($$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gi());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public coz b() {
      return new coz(cpc.qE);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new cam.a(this));
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && this.cY()) {
         if (this.bT > 0) {
            if (this.gi() == 0) {
               this.b(atk.uj);
               this.c(1);
            } else if (this.bT > 40 && this.gi() == 1) {
               this.b(atk.uj);
               this.c(2);
            }

            this.bT++;
         } else if (this.gi() != 0) {
            if (this.bU > 60 && this.gi() == 2) {
               this.b(atk.ui);
               this.c(1);
            } else if (this.bU > 100 && this.gi() == 1) {
               this.b(atk.ui);
               this.c(0);
            }

            this.bU++;
         }
      }

      super.l();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.bx() && this.gi() > 0) {
         for (boi $$1 : this.dM().a(boi.class, this.cH().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(boi $$0) {
      int $$1 = this.gi();
      if ($$0.a(this.dN().b((bog)this), (float)(1 + $$1))) {
         $$0.b(new bnb(bnd.s, 60 * $$1, 0), this);
         this.a(atk.un, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(chh $$0) {
      int $$1 = this.gi();
      if ($$0 instanceof aow && $$1 > 0 && $$0.a(this.dN().b((bog)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((aow)$$0).d.b(new abm(abm.k, 0.0F));
         }

         $$0.b(new bnb(bnd.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected atj y() {
      return atk.uh;
   }

   @Override
   protected atj n_() {
      return atk.uk;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.um;
   }

   @Override
   protected atj gh() {
      return atk.ul;
   }

   @Override
   public bnr e(bor $$0) {
      return super.e($$0).a(t(this.gi()));
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

   static class a extends bvb {
      private final cam a;

      public a(cam $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bog> $$0 = this.a.dM().a(bog.class, this.a.cH().g(2.0), $$0x -> cam.bW.a(this.a, $$0x));
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
