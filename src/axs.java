import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axs(List<axr> b, boolean c) {
   public static final Codec<axs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axr.a.listOf().fieldOf("values").forGetter(axs::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axs::b)).apply($$0, axs::new)
   );

   public List<axr> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
