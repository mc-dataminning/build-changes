import com.mojang.serialization.Codec;

public class ems implements enb {
   public static final Codec<ems> a = epc.a.fieldOf("state_provider").xmap(ems::new, $$0 -> $$0.b).codec();
   public final epc b;

   public ems(epc $$0) {
      this.b = $$0;
   }
}
