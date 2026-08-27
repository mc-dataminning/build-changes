import java.util.List;
import java.util.function.Predicate;

public class caq extends bzu {
   private static final aie<Integer> e = aih.a(caq.class, aig.b);
   int bT;
   int bU;
   private static final Predicate<boi> bV = $$0 -> {
      if ($$0 instanceof chl $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ai().a(aud.A);
   };
   static final byy bW = byy.b().e().d().a(bV);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public caq(bnw<? extends caq> $$0, cvr $$1) {
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
   public cpd b() {
      return new cpd(cpg.qE);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(1, new caq.a(this));
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && this.cY()) {
         if (this.bT > 0) {
            if (this.gi() == 0) {
               this.b(atl.uk);
               this.c(1);
            } else if (this.bT > 40 && this.gi() == 1) {
               this.b(atl.uk);
               this.c(2);
            }

            this.bT++;
         } else if (this.gi() != 0) {
            if (this.bU > 60 && this.gi() == 2) {
               this.b(atl.uj);
               this.c(1);
            } else if (this.bU > 100 && this.gi() == 1) {
               this.b(atl.uj);
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
         for (bok $$1 : this.dM().a(bok.class, this.cH().g(0.3), $$0 -> bW.a(this, $$0))) {
            if ($$1.bx()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bok $$0) {
      int $$1 = this.gi();
      if ($$0.a(this.dN().b((boi)this), (float)(1 + $$1))) {
         $$0.b(new bnd(bnf.s, 60 * $$1, 0), this);
         this.a(atl.uo, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(chl $$0) {
      int $$1 = this.gi();
      if ($$0 instanceof aox && $$1 > 0 && $$0.a(this.dN().b((boi)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((aox)$$0).d.b(new abm(abm.k, 0.0F));
         }

         $$0.b(new bnd(bnf.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected atk y() {
      return atl.ui;
   }

   @Override
   protected atk n_() {
      return atl.ul;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.un;
   }

   @Override
   protected atk gh() {
      return atl.um;
   }

   @Override
   public bnt e(bot $$0) {
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

   static class a extends bvf {
      private final caq a;

      public a(caq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<boi> $$0 = this.a.dM().a(boi.class, this.a.cH().g(2.0), $$0x -> caq.bW.a(this.a, $$0x));
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
