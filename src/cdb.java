import java.util.List;
import java.util.function.Predicate;

public class cdb extends ccf {
   private static final aja<Integer> e = aje.a(cdb.class, ajc.b);
   int bX;
   int bY;
   private static final Predicate<bqt> bZ = $$0 -> {
      if ($$0 instanceof cka $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ai().a(avh.A);
   };
   static final cbj ca = cbj.b().e().d().a(bZ);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public cdb(bqg<? extends cdb> $$0, czg $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(e, 0);
   }

   public int gp() {
      return this.an.a(e);
   }

   public void c(int $$0) {
      this.an.a(e, $$0);
   }

   @Override
   public void a(aja<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gp());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public crs b() {
      return new crs(crv.qE);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(1, new cdb.a(this));
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bA() && this.cY()) {
         if (this.bX > 0) {
            if (this.gp() == 0) {
               this.b(auo.uv);
               this.c(1);
            } else if (this.bX > 40 && this.gp() == 1) {
               this.b(auo.uv);
               this.c(2);
            }

            this.bX++;
         } else if (this.gp() != 0) {
            if (this.bY > 60 && this.gp() == 2) {
               this.b(auo.uu);
               this.c(1);
            } else if (this.bY > 100 && this.gp() == 1) {
               this.b(auo.uu);
               this.c(0);
            }

            this.bY++;
         }
      }

      super.l();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.bA() && this.gp() > 0) {
         for (bqv $$1 : this.dM().a(bqv.class, this.cH().g(0.3), $$0 -> ca.a(this, $$0))) {
            if ($$1.bA()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bqv $$0) {
      int $$1 = this.gp();
      if ($$0.a(this.dN().b((bqt)this), (float)(1 + $$1))) {
         $$0.b(new bpm(bpo.s, 60 * $$1, 0), this);
         this.a(auo.uz, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cka $$0) {
      int $$1 = this.gp();
      if ($$0 instanceof apv && $$1 > 0 && $$0.a(this.dN().b((bqt)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((apv)$$0).d.b(new ach(ach.k, 0.0F));
         }

         $$0.b(new bpm(bpo.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aun v() {
      return auo.ut;
   }

   @Override
   protected aun o_() {
      return auo.uw;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.uy;
   }

   @Override
   protected aun go() {
      return auo.ux;
   }

   @Override
   public bqd e(bre $$0) {
      return super.e($$0).a(t(this.gp()));
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

   static class a extends bxq {
      private final cdb a;

      public a(cdb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bqt> $$0 = this.a.dM().a(bqt.class, this.a.cH().g(2.0), $$0x -> cdb.ca.a(this.a, $$0x));
         return !$$0.isEmpty();
      }

      @Override
      public void c() {
         this.a.bX = 1;
         this.a.bY = 0;
      }

      @Override
      public void d() {
         this.a.bX = 0;
      }
   }
}
