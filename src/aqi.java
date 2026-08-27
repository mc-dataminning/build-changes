import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aqi(List<aqh> b, boolean c) {
   public static final Codec<aqi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqh.a.listOf().fieldOf("values").forGetter(aqi::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aqi::b)).apply($$0, aqi::new)
   );

   public List<aqh> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
