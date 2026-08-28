import org.joml.Matrix4f;

public class flh {
   private final flf a;
   private final float b;
   private final float c;
   private final float d;
   private final float e;
   private final float f;
   private final float g;
   private final float h;
   private final float i;

   public flh(flf $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
      this.h = $$7;
      this.i = $$8;
   }

   public void a(boolean $$0, float $$1, float $$2, Matrix4f $$3, fbm $$4, float $$5, float $$6, float $$7, float $$8, int $$9) {
      float $$10 = $$1 + this.f;
      float $$11 = $$1 + this.g;
      float $$12 = $$2 + this.h;
      float $$13 = $$2 + this.i;
      float $$14 = $$0 ? 1.0F - 0.25F * this.h : 0.0F;
      float $$15 = $$0 ? 1.0F - 0.25F * this.i : 0.0F;
      $$4.a($$3, $$10 + $$14, $$12, 0.0F).a($$5, $$6, $$7, $$8).a(this.b, this.d).c($$9);
      $$4.a($$3, $$10 + $$15, $$13, 0.0F).a($$5, $$6, $$7, $$8).a(this.b, this.e).c($$9);
      $$4.a($$3, $$11 + $$15, $$13, 0.0F).a($$5, $$6, $$7, $$8).a(this.c, this.e).c($$9);
      $$4.a($$3, $$11 + $$14, $$12, 0.0F).a($$5, $$6, $$7, $$8).a(this.c, this.d).c($$9);
   }

   public void a(flh.a $$0, Matrix4f $$1, fbm $$2, int $$3) {
      $$2.a($$1, $$0.a, $$0.b, $$0.e).a($$0.f, $$0.g, $$0.h, $$0.i).a(this.b, this.d).c($$3);
      $$2.a($$1, $$0.c, $$0.b, $$0.e).a($$0.f, $$0.g, $$0.h, $$0.i).a(this.b, this.e).c($$3);
      $$2.a($$1, $$0.c, $$0.d, $$0.e).a($$0.f, $$0.g, $$0.h, $$0.i).a(this.c, this.e).c($$3);
      $$2.a($$1, $$0.a, $$0.d, $$0.e).a($$0.f, $$0.g, $$0.h, $$0.i).a(this.c, this.d).c($$3);
   }

   public gfh a(fhx.a $$0) {
      return this.a.a($$0);
   }

   public static class a {
      protected final float a;
      protected final float b;
      protected final float c;
      protected final float d;
      protected final float e;
      protected final float f;
      protected final float g;
      protected final float h;
      protected final float i;

      public a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
         this.g = $$6;
         this.h = $$7;
         this.i = $$8;
      }
   }
}
