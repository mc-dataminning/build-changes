import com.mojang.serialization.MapCodec;

public class emc extends emq {
   private static final emc c = new emc();
   public static MapCodec<emc> a = MapCodec.unit(() -> c);

   private emc() {
   }

   public static emc a() {
      return c;
   }

   @Override
   protected boolean a(emp $$0, azg $$1, ji $$2) {
      emo $$3 = $$0.e()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      jr<dhi> $$4 = $$0.d().t($$2);
      return $$0.f().a($$4).a($$3);
   }

   @Override
   public ems<?> b() {
      return ems.e;
   }
}
