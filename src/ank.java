import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ank(List<anj> b, boolean c) {
   public static final Codec<ank> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(anj.a.listOf().fieldOf("values").forGetter(ank::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(ank::b)).apply($$0, ank::new)
   );

   public List<anj> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
