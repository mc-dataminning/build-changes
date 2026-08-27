import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ffj extends feb {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private fvu.a l;

   public ffj(did $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.l = fvu.a(this.f.aP(), this.a);
   }

   @Override
   protected void b(ewt $$0, djg $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dej;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(ewt $$0, djg $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof dej;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         ggp $$3 = ftv.a(this.a);
         eqe $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, ged.d);
      }
   }

   @Override
   protected Vector3f n() {
      return k;
   }
}
