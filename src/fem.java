import java.util.UUID;

public class fem extends bnv {
   private static final long j = 100L;
   protected float h;
   protected long i;

   public fem(UUID $$0, wi $$1, float $$2, bnv.a $$3, bnv.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      super($$0, $$1, $$3, $$4);
      this.h = $$2;
      this.b = $$2;
      this.i = ac.b();
      this.a($$5);
      this.b($$6);
      this.c($$7);
   }

   @Override
   public void a(float $$0) {
      this.b = this.j();
      this.h = $$0;
      this.i = ac.b();
   }

   @Override
   public float j() {
      long $$0 = ac.b() - this.i;
      float $$1 = axm.a((float)$$0 / 100.0F, 0.0F, 1.0F);
      return axm.i($$1, this.b, this.h);
   }
}
