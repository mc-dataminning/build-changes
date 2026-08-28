import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fpd extends fnu {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f q = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private ggl.a r;

   public fpd(dqx $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.r = ggl.a(this.l.aR(), this.a);
   }

   @Override
   protected void b(fgz $$0, dsh $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dna;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fgz $$0, dsh $$1) {
      if (this.r != null) {
         boolean $$2 = $$1.b() instanceof dna;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         grm $$3 = gem.a(this.a);
         fak $$4 = $$3.a($$0.d(), this.r::a);
         this.r.b.k = $$2;
         this.r.a.a($$0.c(), $$4, 15728880, goz.d);
      }
   }

   @Override
   protected Vector3f m() {
      return q;
   }
}
