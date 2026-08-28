import com.mojang.serialization.MapCodec;

public class dtl extends dlh {
   public static final MapCodec<dtl> b = b(dtl::new);

   @Override
   public MapCodec<dtl> a() {
      return b;
   }

   public dtl(dzn.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dlw.a.m();
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dzo $$0) {
      return $$0.a(axa.aV);
   }

   @Override
   protected boolean g(dzo $$0) {
      return true;
   }
}
