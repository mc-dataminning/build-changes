import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fpj extends foa {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f q = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private ggr.a r;

   public fpj(dra $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.r = ggr.a(this.l.aR(), this.a);
   }

   @Override
   protected void b(fhf $$0, dsk $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dnc;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fhf $$0, dsk $$1) {
      if (this.r != null) {
         boolean $$2 = $$1.b() instanceof dnc;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         grs $$3 = ges.a(this.a);
         faq $$4 = $$3.a($$0.d(), this.r::a);
         this.r.b.k = $$2;
         this.r.a.a($$0.c(), $$4, 15728880, gpf.d);
      }
   }

   @Override
   protected Vector3f m() {
      return q;
   }
}
