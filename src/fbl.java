import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fbl extends fae {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private fro.a l;

   public fbl(dff $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.l = fro.a(this.f.aP(), this.a);
   }

   @Override
   protected void b(esy $$0, dgb $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dbt;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(esy $$0, dgb $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof dbt;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gce $$3 = fpp.a(this.a);
         eml $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, fzr.d);
      }
   }

   @Override
   protected Vector3f l() {
      return k;
   }
}
