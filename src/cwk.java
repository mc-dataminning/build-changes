import com.mojang.serialization.MapCodec;

public class cwk extends cww {
   public static final MapCodec<cwk> a = b(cwk::new);

   @Override
   public MapCodec<cwk> a() {
      return a;
   }

   public cwk(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(aE);
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
