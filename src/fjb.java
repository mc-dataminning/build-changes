import java.util.UUID;

public class fjb extends bpq {
   private static final long l = 100L;
   protected float j;
   protected long k;

   public fjb(UUID $$0, xe $$1, float $$2, bpq.a $$3, bpq.b $$4, boolean $$5, boolean $$6, boolean $$7, ewu $$8, int $$9) {
      super($$0, $$1, $$3, $$4, $$8, $$9);
      this.j = $$2;
      this.b = $$2;
      this.k = ad.b();
      this.a($$5);
      this.b($$6);
      this.c($$7);
   }

   @Override
   public void a(float $$0) {
      this.b = this.j();
      this.j = $$0;
      this.k = ad.b();
   }

   @Override
   public float j() {
      long $$0 = ad.b() - this.k;
      float $$1 = aym.a((float)$$0 / 100.0F, 0.0F, 1.0F);
      return aym.i($$1, this.b, this.j);
   }

   public boolean a(ewu $$0) {
      return this.f > 0 ? this.e.g($$0) < (double)(this.f * this.f) : this.f >= 0;
   }
}
