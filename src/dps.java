import com.mojang.serialization.MapCodec;

public class dps extends dqg {
   public static final MapCodec<dps> a = b(dps::new);

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   public dps(eag.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e);
   }

   @Override
   public eah a(dcw $$0) {
      return this.m().b(e, $$0.g().g());
   }
}
