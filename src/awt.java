import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record awt(List<aws> b, boolean c) {
   public static final Codec<awt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aws.a.listOf().fieldOf("values").forGetter(awt::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(awt::b)).apply($$0, awt::new)
   );

   public List<aws> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
