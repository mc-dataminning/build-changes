import java.util.function.Function;

public abstract class fim<E extends blp> extends fjp<E> {
   private final boolean a;
   private final float b;
   private final float f;
   private final float g;
   private final float h;
   private final float i;

   protected fim(boolean $$0, float $$1, float $$2) {
      this($$0, $$1, $$2, 2.0F, 2.0F, 24.0F);
   }

   protected fim(boolean $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this(fth::e, $$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected fim(Function<ahd, fth> $$0, boolean $$1, float $$2, float $$3, float $$4, float $$5, float $$6) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
   }

   protected fim() {
      this(false, 5.0F, 2.0F);
   }

   @Override
   public void a(ept $$0, epx $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      if (this.e) {
         $$0.a();
         if (this.a) {
            float $$8 = 1.5F / this.g;
            $$0.b($$8, $$8, $$8);
         }

         $$0.a(0.0F, this.b / 16.0F, this.f / 16.0F);
         this.a().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         $$0.b();
         $$0.a();
         float $$9 = 1.0F / this.h;
         $$0.b($$9, $$9, $$9);
         $$0.a(0.0F, this.i / 16.0F, 0.0F);
         this.b().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         $$0.b();
      } else {
         this.a().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         this.b().forEach($$8 -> $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      }
   }

   protected abstract Iterable<fmp> a();

   protected abstract Iterable<fmp> b();
}
