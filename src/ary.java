import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ary(List<arx> b, boolean c) {
   public static final Codec<ary> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arx.a.listOf().fieldOf("values").forGetter(ary::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(ary::b)).apply($$0, ary::new)
   );

   public List<arx> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
