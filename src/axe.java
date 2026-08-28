import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axe(List<axd> b, boolean c) {
   public static final Codec<axe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axd.a.listOf().fieldOf("values").forGetter(axe::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axe::b)).apply($$0, axe::new)
   );

   public List<axd> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
