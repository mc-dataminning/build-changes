import com.mojang.serialization.MapCodec;

public abstract class djr extends dgv implements djq {
   public djr(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djr> a();

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         cjy $$4 = cjy.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cjy $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dua $$0) {
      return $$0.l() || $$0.a(aws.aL) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$3.a(16) == 0) {
         je $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azg.a($$1, $$2, $$3, new lf(ln.C, $$0));
         }
      }
   }

   public int b(dua $$0, dcx $$1, je $$2) {
      return -16777216;
   }
}
