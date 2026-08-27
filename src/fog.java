import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fog extends fmy {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f d = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gey.a r;

   public fog(dpq $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.r = gey.a(this.m.aS(), this.a);
   }

   @Override
   protected void b(ffm $$0, drb $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dlt;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(ffm $$0, drb $$1) {
      if (this.r != null) {
         boolean $$2 = $$1.b() instanceof dlt;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gpz $$3 = gcz.a(this.a);
         eyw $$4 = $$3.a($$0.d(), this.r::a);
         this.r.b.k = $$2;
         this.r.a.a($$0.c(), $$4, 15728880, gnm.d);
      }
   }

   @Override
   protected Vector3f m() {
      return d;
   }
}
