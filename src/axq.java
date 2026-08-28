import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axq(List<axp> b, boolean c) {
   public static final Codec<axq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axp.a.listOf().fieldOf("values").forGetter(axq::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axq::b)).apply($$0, axq::new)
   );

   public List<axp> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
