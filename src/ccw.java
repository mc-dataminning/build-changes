import java.util.List;
import java.util.function.Predicate;

public class ccw extends cca {
   private static final aiy<Integer> e = ajc.a(ccw.class, aja.b);
   int bX;
   int bY;
   private static final Predicate<bqo> bZ = $$0 -> {
      if ($$0 instanceof cjt $$1 && $$1.f()) {
         return false;
      }

      return !$$0.ai().a(avf.A);
   };
   static final cbe ca = cbe.b().e().d().a(bZ);
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;

   public ccw(bqb<? extends ccw> $$0, cyx $$1) {
      super($$0, $$1);
      this.j_();
   }

   @Override
   protected void a(ajc.a $$0) {
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
   public void a(aiy<?> $$0) {
      if (e.equals($$0)) {
         this.j_();
      }

      super.a($$0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("PuffState", this.gp());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.c(Math.min($$0.h("PuffState"), 2));
   }

   @Override
   public crj b() {
      return new crj(crm.qE);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(1, new ccw.a(this));
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bA() && this.cY()) {
         if (this.bX > 0) {
            if (this.gp() == 0) {
               this.b(aum.uv);
               this.c(1);
            } else if (this.bX > 40 && this.gp() == 1) {
               this.b(aum.uv);
               this.c(2);
            }

            this.bX++;
         } else if (this.gp() != 0) {
            if (this.bY > 60 && this.gp() == 2) {
               this.b(aum.uu);
               this.c(1);
            } else if (this.bY > 100 && this.gp() == 1) {
               this.b(aum.uu);
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
         for (bqq $$1 : this.dM().a(bqq.class, this.cH().g(0.3), $$0 -> ca.a(this, $$0))) {
            if ($$1.bA()) {
               this.a($$1);
            }
         }
      }
   }

   private void a(bqq $$0) {
      int $$1 = this.gp();
      if ($$0.a(this.dN().b((bqo)this), (float)(1 + $$1))) {
         $$0.b(new bph(bpj.s, 60 * $$1, 0), this);
         this.a(aum.uz, 1.0F, 1.0F);
      }
   }

   @Override
   public void b_(cjt $$0) {
      int $$1 = this.gp();
      if ($$0 instanceof apt && $$1 > 0 && $$0.a(this.dN().b((bqo)this), (float)(1 + $$1))) {
         if (!this.aU()) {
            ((apt)$$0).d.b(new acf(acf.k, 0.0F));
         }

         $$0.b(new bph(bpj.s, 60 * $$1, 0), this);
      }
   }

   @Override
   protected aul v() {
      return aum.ut;
   }

   @Override
   protected aul o_() {
      return aum.uw;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.uy;
   }

   @Override
   protected aul go() {
      return aum.ux;
   }

   @Override
   public bpy e(bqz $$0) {
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

   static class a extends bxl {
      private final ccw a;

      public a(ccw $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         List<bqo> $$0 = this.a.dM().a(bqo.class, this.a.cH().g(2.0), $$0x -> ccw.ca.a(this.a, $$0x));
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
