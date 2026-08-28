import com.mojang.serialization.Codec;

public class eea implements eeh {
   public static final Codec<eea> a = dtc.b.fieldOf("state").xmap(eea::new, $$0 -> $$0.b).codec();
   public final dtc b;

   public eea(dtc $$0) {
      this.b = $$0;
   }
}
