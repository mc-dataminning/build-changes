import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fpk extends fob {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f d = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gga.a r;

   public fpk(dqp $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.r = gga.a(this.m.aR(), this.a);
   }

   @Override
   protected void b(fgp $$0, dsa $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dms;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fgp $$0, dsa $$1) {
      if (this.r != null) {
         boolean $$2 = $$1.b() instanceof dms;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         grb $$3 = geb.a(this.a);
         faa $$4 = $$3.a($$0.d(), this.r::a);
         this.r.b.k = $$2;
         this.r.a.a($$0.c(), $$4, 15728880, goo.d);
      }
   }

   @Override
   protected Vector3f m() {
      return d;
   }
}
