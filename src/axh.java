import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axh(List<axg> b, boolean c) {
   public static final Codec<axh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axg.a.listOf().fieldOf("values").forGetter(axh::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axh::b)).apply($$0, axh::new)
   );

   public List<axg> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
