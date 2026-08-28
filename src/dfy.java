import com.mojang.serialization.MapCodec;

public class dfy extends dio implements dfd, dfw {
   public static final MapCodec<dfy> c = b(dfy::new);

   @Override
   public MapCodec<dfy> a() {
      return c;
   }

   public dfy(dsc.d $$0) {
      super($$0, je.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dip c() {
      return (dip)dfc.sv;
   }

   @Override
   protected dsd a(dsd $$0, dsd $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cuq a(dcc $$0, iz $$1, dsd $$2) {
      return new cuq(cut.ws);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      return dfw.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dcc $$0, iz $$1, dsd $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dbz $$0, azh $$1, iz $$2, dsd $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsd $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
