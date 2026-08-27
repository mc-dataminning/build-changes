import com.mojang.serialization.Codec;

public class dpj implements dpr {
   public static final Codec<dpj> a = drs.a.fieldOf("state_provider").xmap(dpj::new, $$0 -> $$0.b).codec();
   public final drs b;

   public dpj(drs $$0) {
      this.b = $$0;
   }
}
