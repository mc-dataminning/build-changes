import com.mojang.serialization.Codec;

public class dvn extends dwb {
   private static final dvn c = new dvn();
   public static Codec<dvn> a = Codec.unit(() -> c);

   private dvn() {
   }

   public static dvn a() {
      return c;
   }

   @Override
   protected boolean a(dwa $$0, ato $$1, ht $$2) {
      dvz $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      ib<csq> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public dwd<?> b() {
      return dwd.e;
   }
}
