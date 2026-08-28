import com.mojang.serialization.MapCodec;

public class dtt extends dln {
   public static final MapCodec<dtt> b = b(dtt::new);

   @Override
   public MapCodec<dtt> a() {
      return b;
   }

   public dtt(dzy.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dmc.a.m();
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dzz $$0) {
      return $$0.a(axc.aV);
   }

   @Override
   protected boolean g(dzz $$0) {
      return true;
   }
}
