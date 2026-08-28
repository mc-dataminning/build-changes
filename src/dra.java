import com.mojang.serialization.MapCodec;

public class dra extends dix {
   public static final MapCodec<dra> c = b(dra::new);

   @Override
   public MapCodec<dra> a() {
      return c;
   }

   public dra(dwu.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : djm.a.m();
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dwv $$0) {
      return $$0.a(awo.aV);
   }

   @Override
   protected boolean g(dwv $$0) {
      return true;
   }
}
