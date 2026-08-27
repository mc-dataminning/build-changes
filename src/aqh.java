import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aqh(List<aqg> b, boolean c) {
   public static final Codec<aqh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqg.a.listOf().fieldOf("values").forGetter(aqh::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aqh::b)).apply($$0, aqh::new)
   );

   public List<aqg> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
