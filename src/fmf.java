import javax.annotation.Nullable;
import org.joml.Vector3f;

public class fmf extends fkx {
   public static final float b = 62.500004F;
   public static final float c = 0.9765628F;
   private static final Vector3f d = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private gcw.a o;

   public fmf(dny $$0, boolean $$1, boolean $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.o = gcw.a(this.j.aR(), this.a);
   }

   @Override
   protected void b(fdl $$0, dpi $$1) {
      super.b($$0, $$1);
      boolean $$2 = $$1.b() instanceof dkb;
      if (!$$2) {
         $$0.c().a(0.0F, 35.0F, 0.0F);
      }
   }

   @Override
   protected void a(fdl $$0, dpi $$1) {
      if (this.o != null) {
         boolean $$2 = $$1.b() instanceof dkb;
         $$0.c().a(0.0F, 31.0F, 0.0F);
         $$0.c().b(62.500004F, 62.500004F, -62.500004F);
         gnv $$3 = gax.a(this.a);
         ewv $$4 = $$3.a($$0.d(), this.o::a);
         this.o.b.k = $$2;
         this.o.a.a($$0.c(), $$4, 15728880, glj.d);
      }
   }

   @Override
   protected Vector3f m() {
      return d;
   }
}
