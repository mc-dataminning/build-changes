import com.mojang.serialization.Codec;

public class ecc extends ect {
   public static final Codec<ecc> a = kd.e.q().fieldOf("block").xmap(ecc::new, $$0 -> $$0.b).codec();
   private final cwj b;

   public ecc(cwj $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dja $$0, aup $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ecu<?> a() {
      return ecu.b;
   }
}
