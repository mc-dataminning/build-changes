import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fel extends fdd {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private fuw.a l;

   public fel(dhm $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.l = fuw.a(this.f.aO(), this.a);
   }

   @Override
   protected void b(evw $$0, dip $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof ddt;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(evw $$0, dip $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof ddt;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gfs $$3 = fsx.a(this.a);
         eph $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, gdf.d);
      }
   }

   @Override
   protected Vector3f l() {
      return k;
   }
}
