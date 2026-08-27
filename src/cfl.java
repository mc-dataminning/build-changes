import javax.annotation.Nullable;
import org.joml.Vector3f;

public interface cfl extends cgc {
   void b(boolean var1);

   void a(bpo var1, cqk var2, cjk var3, float var4);

   @Nullable
   bpo p();

   void a();

   default void b(bpo $$0, float $$1) {
      bnb $$2 = cjm.a($$0, cqn.vQ);
      cqk $$3 = $$0.b($$2);
      if ($$0.b(cqn.vQ)) {
         cov.a($$0.dM(), $$0, $$2, $$3, $$1, (float)(14 - $$0.dM().aj().a() * 4));
      }

      this.a();
   }

   default void a(bpo $$0, bpo $$1, cjk $$2, float $$3, float $$4) {
      double $$5 = $$1.dr() - $$0.dr();
      double $$6 = $$1.dx() - $$0.dx();
      double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
      double $$8 = $$1.e(0.3333333333333333) - $$2.dt() + $$7 * 0.2F;
      Vector3f $$9 = this.a($$0, new epr($$5, $$8, $$6), $$3);
      $$2.c((double)$$9.x(), (double)$$9.y(), (double)$$9.z(), $$4, (float)(14 - $$0.dM().aj().a() * 4));
      $$0.a(aty.gk, 1.0F, 1.0F / ($$0.ei().i() * 0.4F + 0.8F));
   }

   default Vector3f a(bpo $$0, epr $$1, float $$2) {
      Vector3f $$3 = $$1.j().normalize();
      Vector3f $$4 = new Vector3f($$3).cross(new Vector3f(0.0F, 1.0F, 0.0F));
      if ((double)$$4.lengthSquared() <= 1.0E-7) {
         epr $$5 = $$0.i(1.0F);
         $$4 = new Vector3f($$3).cross($$5.j());
      }

      Vector3f $$6 = new Vector3f($$3).rotateAxis((float) (Math.PI / 2), $$4.x, $$4.y, $$4.z);
      return new Vector3f($$3).rotateAxis($$2 * (float) (Math.PI / 180.0), $$6.x, $$6.y, $$6.z);
   }
}
