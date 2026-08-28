import it.unimi.dsi.fastutil.floats.FloatUnaryOperator;

public interface fkx {
   fkx a = new fkx.a(0.0F);
   fkx b = new fkx.a(1.0F);

   float a();

   float a(boolean var1);

   float b();

   public static class a implements fkx {
      private final float c;

      a(float $$0) {
         this.c = $$0;
      }

      @Override
      public float a() {
         return this.c;
      }

      @Override
      public float a(boolean $$0) {
         return this.c;
      }

      @Override
      public float b() {
         return this.c;
      }
   }

   public static class b implements fkx {
      private float c;
      private float d;
      private float e;
      private float f;
      private long g;
      private long h;
      private final float i;
      private final FloatUnaryOperator j;
      private boolean k;
      private boolean l;

      public b(float $$0, long $$1, FloatUnaryOperator $$2) {
         this.i = 1000.0F / $$0;
         this.h = this.g = $$1;
         this.j = $$2;
      }

      public int a(long $$0, boolean $$1) {
         this.b($$0);
         return $$1 ? this.a($$0) : 0;
      }

      private int a(long $$0) {
         this.c = (float)($$0 - this.g) / this.j.apply(this.i);
         this.g = $$0;
         this.d = this.d + this.c;
         int $$1 = (int)this.d;
         this.d -= (float)$$1;
         return $$1;
      }

      private void b(long $$0) {
         this.e = (float)($$0 - this.h) / this.i;
         this.h = $$0;
      }

      public void b(boolean $$0) {
         if ($$0) {
            this.c();
         } else {
            this.d();
         }
      }

      private void c() {
         if (!this.k) {
            this.f = this.d;
         }

         this.k = true;
      }

      private void d() {
         if (this.k) {
            this.d = this.f;
         }

         this.k = false;
      }

      public void c(boolean $$0) {
         this.l = $$0;
      }

      @Override
      public float a() {
         return this.c;
      }

      @Override
      public float a(boolean $$0) {
         if (!$$0 && this.l) {
            return 1.0F;
         } else {
            return this.k ? this.f : this.d;
         }
      }

      @Override
      public float b() {
         return this.e > 7.0F ? 0.5F : this.e;
      }
   }
}
