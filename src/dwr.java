import com.mojang.serialization.Codec;

public class dwr implements dwy {
   public static final Codec<dwr> a = dme.b.fieldOf("state").xmap(dwr::new, $$0 -> $$0.b).codec();
   public final dme b;

   public dwr(dme $$0) {
      this.b = $$0;
   }
}
