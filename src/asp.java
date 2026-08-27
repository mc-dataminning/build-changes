import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record asp(List<aso> b, boolean c) {
   public static final Codec<asp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aso.a.listOf().fieldOf("values").forGetter(asp::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(asp::b)).apply($$0, asp::new)
   );

   public List<aso> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
