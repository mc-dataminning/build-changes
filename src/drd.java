import com.mojang.serialization.MapCodec;

public class drd extends dja {
   public static final MapCodec<drd> c = b(drd::new);

   @Override
   public MapCodec<drd> a() {
      return c;
   }

   public drd(dwx.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : djp.a.m();
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dwy $$0) {
      return $$0.a(awp.aV);
   }

   @Override
   protected boolean g(dwy $$0) {
      return true;
   }
}
