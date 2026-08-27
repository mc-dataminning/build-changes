import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record awk(List<awj> b, boolean c) {
   public static final Codec<awk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awj.a.listOf().fieldOf("values").forGetter(awk::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(awk::b)).apply($$0, awk::new)
   );

   public List<awj> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
