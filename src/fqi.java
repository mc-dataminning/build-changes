import java.util.Optional;

public class fqi implements fqh {
   private final fqh.a a;
   private final fqh.a b = fqh.a(new enf(1536));
   private int c = 255;
   private int d = 255;
   private int e = 255;
   private int f = 255;

   public fqi(fqh.a $$0) {
      this.a = $$0;
   }

   @Override
   public eno getBuffer(fqp $$0) {
      if ($$0.K()) {
         eno $$1 = this.b.getBuffer($$0);
         return new fqi.a($$1, this.c, this.d, this.e, this.f);
      } else {
         eno $$2 = this.a.getBuffer($$0);
         Optional<fqp> $$3 = $$0.J();
         if ($$3.isPresent()) {
            eno $$4 = this.b.getBuffer($$3.get());
            fqi.a $$5 = new fqi.a($$4, this.c, this.d, this.e, this.f);
            return enr.a($$5, $$2);
         } else {
            return $$2;
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public void a() {
      this.b.b();
   }

   static class a extends enj {
      private final eno f;
      private double g;
      private double h;
      private double i;
      private float j;
      private float k;

      a(eno $$0, int $$1, int $$2, int $$3, int $$4) {
         this.f = $$0;
         super.b($$1, $$2, $$3, $$4);
      }

      @Override
      public void b(int $$0, int $$1, int $$2, int $$3) {
      }

      @Override
      public void l() {
      }

      @Override
      public eno a(double $$0, double $$1, double $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
         return this;
      }

      @Override
      public eno a(int $$0, int $$1, int $$2, int $$3) {
         return this;
      }

      @Override
      public eno a(float $$0, float $$1) {
         this.j = $$0;
         this.k = $$1;
         return this;
      }

      @Override
      public eno a(int $$0, int $$1) {
         return this;
      }

      @Override
      public eno b(int $$0, int $$1) {
         return this;
      }

      @Override
      public eno a(float $$0, float $$1, float $$2) {
         return this;
      }

      @Override
      public void a(
         float $$0,
         float $$1,
         float $$2,
         float $$3,
         float $$4,
         float $$5,
         float $$6,
         float $$7,
         float $$8,
         int $$9,
         int $$10,
         float $$11,
         float $$12,
         float $$13
      ) {
         this.f.a((double)$$0, (double)$$1, (double)$$2).a(this.b, this.c, this.d, this.e).a($$7, $$8).e();
      }

      @Override
      public void e() {
         this.f.a(this.g, this.h, this.i).a(this.b, this.c, this.d, this.e).a(this.j, this.k).e();
      }
   }
}
