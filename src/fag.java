import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fag extends eyz {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private fpz.a l;

   public fag(ddu $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.l = fpz.a(this.f.aP(), this.a);
   }

   @Override
   protected void b(erw $$0, dfa $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dah;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(erw $$0, dfa $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof dah;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gap $$3 = fnz.a(this.a);
         elk $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, fyc.d);
      }
   }

   @Override
   protected Vector3f l() {
      return k;
   }
}
