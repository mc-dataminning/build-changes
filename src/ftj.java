import java.util.UUID;

public class ftj extends btw {
   private static final long j = 100L;
   protected float h;
   protected long i;

   public ftj(UUID $$0, wy $$1, float $$2, btw.a $$3, btw.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      super($$0, $$1, $$3, $$4);
      this.h = $$2;
      this.b = $$2;
      this.i = ag.c();
      this.a($$5);
      this.b($$6);
      this.c($$7);
   }

   @Override
   public void a(float $$0) {
      this.b = this.k();
      this.h = $$0;
      this.i = ag.c();
   }

   @Override
   public float k() {
      long $$0 = ag.c() - this.i;
      float $$1 = azm.a((float)$$0 / 100.0F, 0.0F, 1.0F);
      return azm.h($$1, this.b, this.h);
   }
}
