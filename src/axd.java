import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axd(List<axc> b, boolean c) {
   public static final Codec<axd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axc.a.listOf().fieldOf("values").forGetter(axd::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axd::b)).apply($$0, axd::new)
   );

   public List<axc> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
