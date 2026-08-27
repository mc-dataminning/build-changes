import org.joml.Matrix4f;

public class fpz<T extends ddz> implements fpg<T> {
   public static final aep a = new aep("textures/environment/end_sky.png");
   public static final aep b = new aep("textures/entity/end_portal.png");

   public fpz(fph.a $$0) {
   }

   public void a(T $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      Matrix4f $$6 = $$2.c().a();
      this.a($$0, $$6, $$3.getBuffer(this.d()));
   }

   private void a(T $$0, Matrix4f $$1, ell $$2) {
      float $$3 = this.c();
      float $$4 = this.b();
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, hb.d);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, hb.c);
      this.a($$0, $$1, $$2, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, hb.f);
      this.a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, hb.e);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$3, $$3, 0.0F, 0.0F, 1.0F, 1.0F, hb.a);
      this.a($$0, $$1, $$2, 0.0F, 1.0F, $$4, $$4, 1.0F, 1.0F, 0.0F, 0.0F, hb.b);
   }

   private void a(T $$0, Matrix4f $$1, ell $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9, float $$10, hb $$11) {
      if ($$0.a($$11)) {
         $$2.a($$1, $$3, $$5, $$7).e();
         $$2.a($$1, $$4, $$5, $$8).e();
         $$2.a($$1, $$4, $$6, $$9).e();
         $$2.a($$1, $$3, $$6, $$10).e();
      }
   }

   protected float b() {
      return 0.75F;
   }

   protected float c() {
      return 0.375F;
   }

   protected fno d() {
      return fno.v();
   }
}
