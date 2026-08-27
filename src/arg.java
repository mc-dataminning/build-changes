import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record arg(List<arf> b, boolean c) {
   public static final Codec<arg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arf.a.listOf().fieldOf("values").forGetter(arg::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(arg::b)).apply($$0, arg::new)
   );

   public List<arf> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
