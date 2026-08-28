import com.mojang.serialization.MapCodec;

public class dfw extends dim implements dfb, dfu {
   public static final MapCodec<dfw> c = b(dfw::new);

   @Override
   public MapCodec<dfw> a() {
      return c;
   }

   public dfw(dsa.d $$0) {
      super($$0, je.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected din c() {
      return (din)dfa.sv;
   }

   @Override
   protected dsb a(dsb $$0, dsb $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   public cuo a(dca $$0, iz $$1, dsb $$2) {
      return new cuo(cur.ws);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      return dfu.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(r_);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
