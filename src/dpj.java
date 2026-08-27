import com.mojang.serialization.Codec;

public class dpj implements dpq {
   public static final Codec<dpj> a = dez.b.fieldOf("state").xmap(dpj::new, $$0 -> $$0.b).codec();
   public final dez b;

   public dpj(dez $$0) {
      this.b = $$0;
   }
}
