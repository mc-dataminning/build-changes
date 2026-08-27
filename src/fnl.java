import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fnl extends fmd {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f d = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gec.a r;

   public fnl(dow $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.r = gec.a(this.m.aS(), this.a);
   }

   @Override
   protected void b(fer $$0, dqh $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dkz;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fer $$0, dqh $$1) {
      if (this.r != null) {
         boolean $$2 = $$1.b() instanceof dkz;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gpc $$3 = gcd.a(this.a);
         eyb $$4 = $$3.a($$0.d(), this.r::a);
         this.r.b.k = $$2;
         this.r.a.a($$0.c(), $$4, 15728880, gmp.d);
      }
   }

   @Override
   protected Vector3f m() {
      return d;
   }
}
