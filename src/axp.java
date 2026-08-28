import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axp(List<axo> b, boolean c) {
   public static final Codec<axp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axo.a.listOf().fieldOf("values").forGetter(axp::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axp::b)).apply($$0, axp::new)
   );

   public List<axo> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
