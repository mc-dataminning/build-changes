import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axk(List<axj> b, boolean c) {
   public static final Codec<axk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axj.a.listOf().fieldOf("values").forGetter(axk::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axk::b)).apply($$0, axk::new)
   );

   public List<axj> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
