import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axz(List<axy> b, boolean c) {
   public static final Codec<axz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axy.a.listOf().fieldOf("values").forGetter(axz::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axz::b)).apply($$0, axz::new)
   );

   public List<axy> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
