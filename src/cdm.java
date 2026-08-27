import java.util.List;
import java.util.function.Predicate;

public class cdm extends ccq {
   private static final ajk<Integer> e = ajo.a(cdm.class, ajm.b);
   int bY;
   int bZ;
   private static final Predicate<bre> ca = $$0 -> {
      if ($$0 instanceof ckl $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ai().a(avr.A);
   };
   static final cbu cb = cbu.b().e().d().a(ca);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cdm(bqr<? extends cdm> $$0, czu $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gr() {
      return this.ao.a(e);
   }

   public void c(int $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public void a(ajk<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gr());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public csd b() {
      return new csd(csg.qF);
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(1, new cdm.a(this));
   }

   @Override
   public void l() {
      if (!this.dN().B && this.bB() && this.cZ()) {
         if (this.bY > 0) {
            if (this.gr() == 0) {
               this.b(auz.uC);
               this.c(1);
            } else if (this.bY > 40 && this.gr() == 1) {
               this.b(auz.uC);
               this.c(2);
            }

            this.bY++;
         } else if (this.gr() != 0) {
            if (this.bZ > 60 && this.gr() == 2) {
               this.b(auz.uB);
               this.c(1);
            } else if (this.bZ > 100 && this.gr() == 1) {
               this.b(auz.uB);
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
      if (this.bB() && this.gr() > 0) {
         for (brg $$1 : this.dN().a(brg.class, this.cI().g(0.3), $$0 -> cb.a(this, $$0))) {
            if ($$1.bB()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(brg $$0) {
      int $$1 = this.gr();
      if ($$0.a(this.dO().b((bre)this), (float)(1 + $$1))) {
         $$0.b(new bpx(bpz.s, 60 * $$1, 0), this);
         this.a(auz.uG, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(ckl $$0) {
      int $$1 = this.gr();
      if ($$0 instanceof aqf && $$1 > 0 && $$0.a(this.dO().b((bre)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((aqf)$$0).d.b(new acr(acr.k, 0.0F));
         }

         $$0.b(new bpx(bpz.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected auy v() {
      return auz.uA;
   }

   @Override
   protected auy o_() {
      return auz.uD;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.uF;
   }

   @Override
   protected auy gq() {
      return auz.uE;
   }

   @Override
   public bqo e(brp $$0) {
      return super.e($$0).a(t(this.gr()));
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

   static class a extends byb {
      private final cdm a;

      public a(cdm $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bre> $$0 = this.a.dN().a(bre.class, this.a.cI().g(2.0), $$0x -> cdm.cb.a(this.a, $$0x));
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
