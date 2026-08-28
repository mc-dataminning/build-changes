import com.mojang.serialization.Codec;

public class ecu implements edc {
   public static final Codec<ecu> a = efd.a.fieldOf("state_provider").xmap(ecu::new, $$0 -> $$0.b).codec();
   public final efd b;

   public ecu(efd $$0) {
      this.b = $$0;
   }
}
