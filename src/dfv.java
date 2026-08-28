import com.mojang.serialization.MapCodec;

public class dfv extends dil implements dfa, dft {
   public static final MapCodec<dfv> c = b(dfv::new);

   @Override
   public MapCodec<dfv> a() {
      return c;
   }

   public dfv(drz.d $$0) {
      super($$0, je.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dim c() {
      return (dim)dez.sv;
   }

   @Override
   protected dsa a(dsa $$0, dsa $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cun a(dbz $$0, iz $$1, dsa $$2) {
      return new cun(cuq.ws);
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      return dft.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
