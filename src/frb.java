import org.joml.Matrix4f;

public class frb {
   private final fqz a;
   private final float b;
   private final float c;
   private final float d;
   private final float e;
   private final float f;
   private final float g;
   private final float h;
   private final float i;

   public frb(fqz $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
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

   public void a(frb.b $$0, Matrix4f $$1, fgv $$2, int $$3) {
      ys $$4 = $$0.e();
      boolean $$5 = $$4.c();
      float $$6 = $$0.a();
      float $$7 = $$0.b();
      int $$8 = $$0.c();
      this.a($$5, $$6, $$7, $$1, $$2, $$8, $$3);
      if ($$4.b()) {
         this.a($$5, $$6 + $$0.f(), $$7, $$1, $$2, $$8, $$3);
      }
   }

   private void a(boolean $$0, float $$1, float $$2, Matrix4f $$3, fgv $$4, int $$5, int $$6) {
      float $$7 = $$1 + this.f;
      float $$8 = $$1 + this.g;
      float $$9 = $$2 + this.h;
      float $$10 = $$2 + this.i;
      float $$11 = $$0 ? 1.0F - 0.25F * this.h : 0.0F;
      float $$12 = $$0 ? 1.0F - 0.25F * this.i : 0.0F;
      $$4.a($$3, $$7 + $$11, $$9, 0.0F).a($$5).a(this.b, this.d).c($$6);
      $$4.a($$3, $$7 + $$12, $$10, 0.0F).a($$5).a(this.b, this.e).c($$6);
      $$4.a($$3, $$8 + $$12, $$10, 0.0F).a($$5).a(this.c, this.e).c($$6);
      $$4.a($$3, $$8 + $$11, $$9, 0.0F).a($$5).a(this.c, this.d).c($$6);
   }

   public void a(frb.a $$0, Matrix4f $$1, fgv $$2, int $$3) {
      $$2.a($$1, $$0.a, $$0.b, $$0.e).a($$0.f).a(this.b, this.d).c($$3);
      $$2.a($$1, $$0.c, $$0.b, $$0.e).a($$0.f).a(this.b, this.e).c($$3);
      $$2.a($$1, $$0.c, $$0.d, $$0.e).a($$0.f).a(this.c, this.e).c($$3);
      $$2.a($$1, $$0.a, $$0.d, $$0.e).a($$0.f).a(this.c, this.d).c($$3);
   }

   public glu a(fnp.a $$0) {
      return this.a.a($$0);
   }

   public static record a(float a, float b, float c, float d, float e, int f) {
   }

   public static record b(float a, float b, int c, frb d, ys e, float f) {
   }
}
