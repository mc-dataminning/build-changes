import com.mojang.serialization.Codec;

public class emj implements emr {
   public static final Codec<emj> a = ebg.a.fieldOf("state").xmap(emj::new, $$0 -> $$0.b).codec();
   public final ebg b;

   public emj(ebg $$0) {
      this.b = $$0;
   }
}
