import javax.annotation.Nullable;
import org.joml.Vector3f;

public interface can extends cbe {
   void b(boolean var1);

   void a(bky var1, clb var2, cee var3, float var4);

   @Nullable
   bky q();

   void a();

   default void b(bky $$0, float $$1) {
      bip $$2 = cef.a($$0, cle.va);
      clb $$3 = $$0.b($$2);
      if ($$0.b(cle.va)) {
         cjj.a($$0.dL(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dL().ai().a() * 4));
      }

      this.a();
   }

   default void a(bky $$0, bky $$1, cee $$2, float $$3, float $$4) {
      double $$5 = $$1.dq() - $$0.dq();
      double $$6 = $$1.dw() - $$0.dw();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = $$1.e(0.3333333333333333) - $$2.ds() + $$7 * 0.2F;
      Vector3f $$9 = this.a($$0, new eji($$5, $$8, $$6), $$3);
      $$2.c((double)$$9.x(), (double)$$9.y(), (double)$$9.z(), $$4, (float)(14 - $$0.dL().ai().a() * 4));
      $$0.a(aqn.fs, 1.0F, 1.0F / ($$0.ef().i() * 0.4F + 0.8F));
   }

   default Vector3f a(bky $$0, eji $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         eji $$5 = $$0.i(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }
}
