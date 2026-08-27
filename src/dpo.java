import com.mojang.serialization.Codec;

public class dpo implements dpv {
   public static final Codec<dpo> a = dfe.b.fieldOf("state").xmap(dpo::new, $$0 -> $$0.b).codec();
   public final dfe b;

   public dpo(dfe $$0) {
      this.b = $$0;
   }
}
