import java.util.function.Function;

public abstract class fud<E extends bsr> extends fvi<E> {
   private final boolean a;
   private final float b;
   private final float f;
   private final float g;
   private final float h;
   private final float i;

   protected fud(boolean $$0, float $$1, float $$2) {
      this($$0, $$1, $$2, 2.0F, 2.0F, 24.0F);
   }

   protected fud(boolean $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this(gff::e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected fud(Function<akr, gff> $$0, boolean $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   protected fud() {
      this(false, 5.0F, 2.0F);
   }

   @Override
   public void a(fbg $$0, fbk $$1, int $$2, int $$3, int $$4) {
      if (this.e) {
         $$0.a();
         if (this.a) {
            float $$5 = 1.5F / this.g;
            $$0.b($$5, $$5, $$5);
         }

         $$0.a(0.0F, this.b / 16.0F, this.f / 16.0F);
         this.a().forEach($$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
         $$0.b();
         $$0.a();
         float $$6 = 1.0F / this.h;
         $$0.b($$6, $$6, $$6);
         $$0.a(0.0F, this.i / 16.0F, 0.0F);
         this.b().forEach($$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
         $$0.b();
      } else {
         this.a().forEach($$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
         this.b().forEach($$5 -> $$5.a($$0, $$1, $$2, $$3, $$4));
      }
   }

   protected abstract Iterable<fyi> a();

   protected abstract Iterable<fyi> b();
}
