import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fpx extends foo {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f q = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private ghh.a r;

   public fpx(drq $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.r = ghh.a(this.l.aP(), this.a);
   }

   @Override
   protected void b(fht $$0, dta $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dns;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fht $$0, dta $$1) {
      if (this.r != null) {
         boolean $$2 = $$1.b() instanceof dns;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gsj $$3 = gfi.a(this.a);
         fbg $$4 = $$3.a($$0.d(), this.r::a);
         this.r.b.k = $$2;
         this.r.a.a($$0.c(), $$4, 15728880, gpw.d);
      }
   }

   @Override
   protected Vector3f m() {
      return q;
   }
}
