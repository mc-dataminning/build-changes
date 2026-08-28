import com.mojang.serialization.MapCodec;

public class ekp extends eld {
   private static final ekp c = new ekp();
   public static MapCodec<ekp> a = MapCodec.unit(() -> c);

   private ekp() {
   }

   public static ekp a() {
      return c;
   }

   @Override
   protected boolean a(elc $$0, azs $$1, jh $$2) {
      elb $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jq<dgc> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public elf<?> b() {
      return elf.e;
   }
}
