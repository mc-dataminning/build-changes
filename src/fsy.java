import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class fsy extends ftg<ccd> {
   private static final aew a = new aew("textures/entity/enderdragon/dragon_fireball.png");
   private static final fom f = fom.e(a);

   public fsy(fth.a $$0) {
      super($$0);
   }

   protected int a(ccd $$0, gw $$1) {
      return 15;
   }

   public void a(ccd $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(this.c.b());
      $$3.a(a.d.rotationDegrees(180.0F));
      elp.a $$6 = $$3.c();
      Matrix4f $$7 = $$6.a();
      Matrix3f $$8 = $$6.b();
      elt $$9 = $$4.getBuffer(f);
      a($$9, $$7, $$8, $$5, 0.0F, 0, 0, 1);
      a($$9, $$7, $$8, $$5, 1.0F, 0, 1, 1);
      a($$9, $$7, $$8, $$5, 1.0F, 1, 1, 0);
      a($$9, $$7, $$8, $$5, 0.0F, 1, 0, 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(elt $$0, Matrix4f $$1, Matrix3f $$2, int $$3, float $$4, int $$5, int $$6, int $$7) {
      $$0.a($$1, $$4 - 0.5F, (float)$$5 - 0.25F, 0.0F).a(255, 255, 255, 255).a((float)$$6, (float)$$7).c(fyv.d).b($$3).a($$2, 0.0F, 1.0F, 0.0F).e();
   }

   public aew a(ccd $$0) {
      return a;
   }
}
