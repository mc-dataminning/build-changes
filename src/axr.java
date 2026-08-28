import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axr(List<axq> b, boolean c) {
   public static final Codec<axr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axq.a.listOf().fieldOf("values").forGetter(axr::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axr::b)).apply($$0, axr::new)
   );

   public List<axq> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
