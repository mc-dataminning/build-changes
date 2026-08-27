import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aru(List<art> b, boolean c) {
   public static final Codec<aru> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(art.a.listOf().fieldOf("values").forGetter(aru::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aru::b)).apply($$0, aru::new)
   );

   public List<art> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
