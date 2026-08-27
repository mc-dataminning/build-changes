import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aws(List<awr> b, boolean c) {
   public static final Codec<aws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awr.a.listOf().fieldOf("values").forGetter(aws::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aws::b)).apply($$0, aws::new)
   );

   public List<awr> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
