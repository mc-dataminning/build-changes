import com.mojang.serialization.Codec;

public class egb implements egj {
   public static final Codec<egb> a = eik.a.fieldOf("state_provider").xmap(egb::new, $$0 -> $$0.b).codec();
   public final eik b;

   public egb(eik $$0) {
      this.b = $$0;
   }
}
