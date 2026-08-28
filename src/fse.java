import java.util.UUID;

public class fse extends bto {
   private static final long j = 100L;
   protected float h;
   protected long i;

   public fse(UUID $$0, ww $$1, float $$2, bto.a $$3, bto.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      super($$0, $$1, $$3, $$4);
      this.h = $$2;
      this.b = $$2;
      this.i = af.c();
      this.a($$5);
      this.b($$6);
      this.c($$7);
   }

   @Override
   public void a(float $$0) {
      this.b = this.j();
      this.h = $$0;
      this.i = af.c();
   }

   @Override
   public float j() {
      long $$0 = af.c() - this.i;
      float $$1 = azk.a((float)$$0 / 100.0F, 0.0F, 1.0F);
      return azk.h($$1, this.b, this.h);
   }
}
