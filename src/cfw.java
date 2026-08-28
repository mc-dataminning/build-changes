import java.util.List;
import java.util.function.Predicate;

public class cfw extends cfa {
   private static final akj<Integer> e = akn.a(cfw.class, akl.b);
   int bY;
   int bZ;
   private static final Predicate<btn> ca = $$0 -> {
      if ($$0 instanceof cmv $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ak().a(aws.A);
   };
   static final cee cb = cee.b().e().d().a(ca);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cfw(bsy<? extends cfw> $$0, dbw $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void a(akj<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gs());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public cun b() {
      return new cun(cuq.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cfw.a(this));
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && this.db()) {
         if (this.bY > 0) {
            if (this.gs() == 0) {
               this.b(avz.uO);
               this.c(1);
            } else if (this.bY > 40 && this.gs() == 1) {
               this.b(avz.uO);
               this.c(2);
            }

            this.bY++;
         } else if (this.gs() != 0) {
            if (this.bZ > 60 && this.gs() == 2) {
               this.b(avz.uN);
               this.c(1);
            } else if (this.bZ > 100 && this.gs() == 1) {
               this.b(avz.uN);
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
         for (btp $$1 : this.dP().a(btp.class, this.cK().g(0.3), $$0 -> cb.a(this, $$0))) {
            if ($$1.bD()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(btp $$0) {
      int $$1 = this.gs();
      if ($$0.a(this.dQ().b((btn)this), (float)(1 + $$1))) {
         $$0.b(new bsa(bsc.s, 60 * $$1, 0), this);
         this.a(avz.uS, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cmv $$0) {
      int $$1 = this.gs();
      if ($$0 instanceof arf && $$1 > 0 && $$0.a(this.dQ().b((btn)this), (float)(1 + $$1))) {
         if (!this.aW()) {
            ((arf)$$0).c.b(new ado(ado.k, 0.0F));
         }

         $$0.b(new bsa(bsc.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected avy v() {
      return avz.uM;
   }

   @Override
   protected avy o_() {
      return avz.uP;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.uR;
   }

   @Override
   protected avy gr() {
      return avz.uQ;
   }

   @Override
   public bsv e(btz $$0) {
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

   static class a extends cal {
      private final cfw a;

      public a(cfw $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<btn> $$0 = this.a.dP().a(btn.class, this.a.cK().g(2.0), $$0x -> cfw.cb.a(this.a, $$0x));
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
