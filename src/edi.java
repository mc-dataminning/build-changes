import com.mojang.serialization.Codec;

public class edi implements edp {
   public static final Codec<edi> a = dsl.b.fieldOf("state").xmap(edi::new, $$0 -> $$0.b).codec();
   public final dsl b;

   public edi(dsl $$0) {
      this.b = $$0;
   }
}
