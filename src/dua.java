import com.mojang.serialization.Codec;

public class dua extends duo {
   private static final dua c = new dua();
   public static Codec<dua> a = Codec.unit(() -> c);

   private dua() {
   }

   public static dua a() {
      return c;
   }

   @Override
   protected boolean a(dun $$0, asc $$1, gw $$2) {
      dum $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      hg<cqt> $$4 = $$0.d().s($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public duq<?> b() {
      return duq.e;
   }
}
