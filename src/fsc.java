import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fsc extends fqu {
   public static final float c = 62.500004F;
   public static final float d = 0.9765628F;
   private static final Vector3f s = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private fyf u;

   public fsc(dte $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aR_() {
      super.aR_();
      boolean $$0 = this.a.m().b() instanceof dpf;
      this.u = gkf.a(this.m.aT(), this.b, $$0);
   }

   @Override
   protected void a(fjx $$0, duo $$1) {
      super.a($$0, $$1);
      boolean $$2 = $$1.b() instanceof dpf;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void c(fjx $$0) {
      if (this.u != null) {
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gzh $$1 = gib.a(this.b);
         fdi $$2 = $$1.a($$0.d(), this.u::a);
         this.u.a($$0.c(), $$2, 15728880, gws.d);
      }
   }

   @Override
   protected Vector3f m() {
      return s;
   }
}
