import java.util.List;
import java.util.function.Predicate;

public class cfz extends cfd {
   private static final akk<Integer> e = ako.a(cfz.class, akm.b);
   int bY;
   int bZ;
   private static final Predicate<btq> ca = $$0 -> {
      if ($$0 instanceof cmy $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ak().a(awt.A);
   };
   static final ceh cb = ceh.b().e().d().a(ca);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cfz(btb<? extends cfz> $$0, dbz $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gs() {
      return this.ao.a(e);
   }

   public void c(int $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public void a(akk<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gs());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cuq b() {
      return new cuq(cut.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cfz.a(this));
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && this.db()) {
         if (this.bY > 0) {
            if (this.gs() == 0) {
               this.b(awa.uO);
               this.c(1);
            } else if (this.bY > 40 && this.gs() == 1) {
               this.b(awa.uO);
               this.c(2);
            }

            this.bY++;
         } else if (this.gs() != 0) {
            if (this.bZ > 60 && this.gs() == 2) {
               this.b(awa.uN);
               this.c(1);
            } else if (this.bZ > 100 && this.gs() == 1) {
               this.b(awa.uN);
               this.c(0);
            }

            this.bZ++;
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bD() && this.gs() > 0) {
         for (bts $$1 : this.dP().a(bts.class, this.cK().g(0.3), $$0 -> cb.a(this, $$0))) {
            if ($$1.bD()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bts $$0) {
      int $$1 = this.gs();
      if ($$0.a(this.dQ().b((btq)this), (float)(1 + $$1))) {
         $$0.b(new bsd(bsf.s, 60 * $$1, 0), this);
         this.a(awa.uS, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cmy $$0) {
      int $$1 = this.gs();
      if ($$0 instanceof arg && $$1 > 0 && $$0.a(this.dQ().b((btq)this), (float)(1 + $$1))) {
         if (!this.aW()) {
            ((arg)$$0).c.b(new adp(adp.k, 0.0F));
         }

         $$0.b(new bsd(bsf.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avz v() {
      return awa.uM;
   }

   @Override
   protected avz o_() {
      return awa.uP;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.uR;
   }

   @Override
   protected avz gr() {
      return awa.uQ;
   }

   @Override
   public bsy e(buc $$0) {
      return super.e($$0).a(t(this.gs()));
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

   static class a extends cao {
      private final cfz a;

      public a(cfz $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<btq> $$0 = this.a.dP().a(btq.class, this.a.cK().g(2.0), $$0x -> cfz.cb.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bY = 1;
         this.a.bZ = 0;
      }

      @Override
      public void d() {
         this.a.bY = 0;
      }
   }
}
