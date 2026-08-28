import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axi(List<axh> b, boolean c) {
   public static final Codec<axi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a.listOf().fieldOf("values").forGetter(axi::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axi::b)).apply($$0, axi::new)
   );

   public List<axh> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
