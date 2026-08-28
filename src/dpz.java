import com.mojang.serialization.MapCodec;

public class dpz extends dqn {
   public static final MapCodec<dpz> a = b(dpz::new);

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   public dpz(ean.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(e);
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
