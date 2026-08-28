import java.util.List;
import java.util.function.Predicate;

public class cfx extends cfb {
   private static final akj<Integer> e = akn.a(cfx.class, akl.b);
   int bY;
   int bZ;
   private static final Predicate<bto> ca = $$0 -> {
      if ($$0 instanceof cmw $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ak().a(aws.A);
   };
   static final cef cb = cef.b().e().d().a(ca);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cfx(bsz<? extends cfx> $$0, dbx $$1) {
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
   public cuo b() {
      return new cuo(cur.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cfx.a(this));
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
         for (btq $$1 : this.dP().a(btq.class, this.cK().g(0.3), $$0 -> cb.a(this, $$0))) {
            if ($$1.bD()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(btq $$0) {
      int $$1 = this.gs();
      if ($$0.a(this.dQ().b((bto)this), (float)(1 + $$1))) {
         $$0.b(new bsb(bsd.s, 60 * $$1, 0), this);
         this.a(avz.uS, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cmw $$0) {
      int $$1 = this.gs();
      if ($$0 instanceof arf && $$1 > 0 && $$0.a(this.dQ().b((bto)this), (float)(1 + $$1))) {
         if (!this.aW()) {
            ((arf)$$0).c.b(new ado(ado.k, 0.0F));
         }

         $$0.b(new bsb(bsd.s, 60 * $$1, 0), this);
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
   protected avy d(brm $$0) {
      return avz.uR;
   }

   @Override
   protected avy gr() {
      return avz.uQ;
   }

   @Override
   public bsw e(bua $$0) {
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

   static class a extends cam {
      private final cfx a;

      public a(cfx $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bto> $$0 = this.a.dP().a(bto.class, this.a.cK().g(2.0), $$0x -> cfx.cb.a(this.a, $$0x));
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
