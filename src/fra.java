import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fra extends fpp {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f d = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private ghu.a r;

   public fra(drr $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.r = ghu.a(this.m.aS(), this.a);
   }

   @Override
   protected void b(fia $$0, dtc $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dnl;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fia $$0, dtc $$1) {
      if (this.r != null) {
         boolean $$2 = $$1.b() instanceof dnl;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gtc $$3 = gfv.a(this.a);
         fbg $$4 = $$3.a($$0.d(), this.r::a);
         this.r.b.k = $$2;
         this.r.a.a($$0.c(), $$4, 15728880, gqp.d);
      }
   }

   @Override
   protected Vector3f B() {
      return d;
   }
}
