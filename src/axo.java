import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axo(List<axn> b, boolean c) {
   public static final Codec<axo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axn.a.listOf().fieldOf("values").forGetter(axo::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axo::b)).apply($$0, axo::new)
   );

   public List<axn> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
