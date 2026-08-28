import com.mojang.serialization.MapCodec;

public class dua extends dls {
   public static final MapCodec<dua> b = b(dua::new);

   @Override
   public MapCodec<dua> a() {
      return b;
   }

   public dua(eag.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dmh.a.m();
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(eah $$0) {
      return $$0.a(axc.aV);
   }

   @Override
   protected boolean g(eah $$0) {
      return true;
   }
}
