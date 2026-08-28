import com.mojang.serialization.MapCodec;

public class dfu extends dim implements dfa, dft {
   public static final MapCodec<dfu> c = b(dfu::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dfu> a() {
      return c;
   }

   public dfu(drz.d $$0) {
      super($$0, je.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(azf $$0) {
      return 1;
   }

   @Override
   protected boolean g(dsa $$0) {
      return $$0.i();
   }

   @Override
   protected dex b() {
      return dez.sw;
   }

   @Override
   protected dsa a(dsa $$0, dsa $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dsa a(dsa $$0, azf $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
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
      super.a($$0);
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
