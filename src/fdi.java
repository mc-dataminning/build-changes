import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fdi extends fca {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private ftn.a l;

   public fdi(dgr $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.l = ftn.a(this.f.aO(), this.a);
   }

   @Override
   protected void b(eut $$0, dhn $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dcz;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(eut $$0, dhn $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof dcz;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         ged $$3 = fro.a(this.a);
         eof $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, gbq.d);
      }
   }

   @Override
   protected Vector3f l() {
      return k;
   }
}
