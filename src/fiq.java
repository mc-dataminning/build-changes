import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fiq extends fhi {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f k = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private fze.a l;

   public fiq(dku $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.l = fze.a(this.f.aQ(), this.a);
   }

   @Override
   protected void b(ezx $$0, dme $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dgz;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(ezx $$0, dme $$1) {
      if (this.l != null) {
         boolean $$2 = $$1.b() instanceof dgz;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gkc $$3 = fxf.a(this.a);
         eth $$4 = $$3.a($$0.d(), this.l::a);
         this.l.b.k = $$2;
         this.l.a.a($$0.c(), $$4, 15728880, ghq.d);
      }
   }

   @Override
   protected Vector3f o() {
      return k;
   }
}
