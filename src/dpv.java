import com.mojang.serialization.Codec;

public class dpv implements dqc {
   public static final Codec<dpv> a = dfl.b.fieldOf("state").xmap(dpv::new, $$0 -> $$0.b).codec();
   public final dfl b;

   public dpv(dfl $$0) {
      this.b = $$0;
   }
}
