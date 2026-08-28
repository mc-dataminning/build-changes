import com.mojang.serialization.MapCodec;

public class dsl extends dkh {
   public static final MapCodec<dsl> b = b(dsl::new);

   @Override
   public MapCodec<dsl> a() {
      return b;
   }

   public dsl(dyl.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dkw.a.m();
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dym $$0) {
      return $$0.a(awz.aV);
   }

   @Override
   protected boolean g(dym $$0) {
      return true;
   }
}
