import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fqd extends fov {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f r = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private ghn.a s;

   public fqd(drs $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.s = ghn.a(this.l.aP(), this.a);
   }

   @Override
   protected void b(fhz $$0, dtc $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dnu;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fhz $$0, dtc $$1) {
      if (this.s != null) {
         boolean $$2 = $$1.b() instanceof dnu;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gsq $$3 = gfo.a(this.a);
         fbm $$4 = $$3.a($$0.d(), this.s::a);
         this.s.b.k = $$2;
         this.s.a.a($$0.c(), $$4, 15728880, gqc.d);
      }
   }

   @Override
   protected Vector3f m() {
      return r;
   }
}
