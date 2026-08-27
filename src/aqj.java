import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aqj(List<aqi> b, boolean c) {
   public static final Codec<aqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqi.a.listOf().fieldOf("values").forGetter(aqj::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aqj::b)).apply($$0, aqj::new)
   );

   public List<aqi> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
