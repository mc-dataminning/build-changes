import com.mojang.serialization.MapCodec;

public class dfz extends dip implements dfe, dfx {
   public static final MapCodec<dfz> c = b(dfz::new);

   @Override
   public MapCodec<dfz> a() {
      return c;
   }

   public dfz(dsd.d $$0) {
      super($$0, je.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected diq c() {
      return (diq)dfd.sv;
   }

   @Override
   protected dse a(dse $$0, dse $$1) {
      return $$1.a(r_, $$0.c(r_));
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
