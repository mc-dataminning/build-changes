import com.mojang.serialization.MapCodec;

public class dfv extends din implements dfb, dfu {
   public static final MapCodec<dfv> c = b(dfv::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dfv> a() {
      return c;
   }

   public dfv(dsa.d $$0) {
      super($$0, je.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azg $$0) {
      return 1;
   }

   @Override
   protected boolean g(dsb $$0) {
      return $$0.i();
   }

   @Override
   protected dey b() {
      return dfa.sw;
   }

   @Override
   protected dsb a(dsb $$0, dsb $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dsb a(dsb $$0, azg $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
