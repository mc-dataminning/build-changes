import java.util.UUID;

public class fko extends bra {
   private static final long j = 100L;
   protected float h;
   protected long i;

   public fko(UUID $$0, xd $$1, float $$2, bra.a $$3, bra.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      super($$0, $$1, $$3, $$4);
      this.h = $$2;
      this.b = $$2;
      this.i = ad.c();
      this.a($$5);
      this.b($$6);
      this.c($$7);
   }

   @Override
   public void a(float $$0) {
      this.b = this.j();
      this.h = $$0;
      this.i = ad.c();
   }

   @Override
   public float j() {
      long $$0 = ad.c() - this.i;
      float $$1 = azc.a((float)$$0 / 100.0F, 0.0F, 1.0F);
      return azc.h($$1, this.b, this.h);
   }
}
