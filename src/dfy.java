import com.mojang.serialization.MapCodec;

public class dfy extends diq implements dfe, dfx {
   public static final MapCodec<dfy> c = b(dfy::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dfy> a() {
      return c;
   }

   public dfy(dsd.d $$0) {
      super($$0, je.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Override
   protected boolean g(dse $$0) {
      return $$0.i();
   }

   @Override
   protected dfb b() {
      return dfd.sw;
   }

   @Override
   protected dse a(dse $$0, dse $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dse a(dse $$0, azh $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(cuu.ws);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      return dfx.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
