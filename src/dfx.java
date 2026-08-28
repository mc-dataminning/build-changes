import com.mojang.serialization.MapCodec;

public class dfx extends din implements dfc, dfv {
   public static final MapCodec<dfx> c = b(dfx::new);

   @Override
   public MapCodec<dfx> a() {
      return c;
   }

   public dfx(dsb.d $$0) {
      super($$0, je.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected dio c() {
      return (dio)dfb.sv;
   }

   @Override
   protected dsc a(dsc $$0, dsc $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(cus.ws);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      return dfv.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
