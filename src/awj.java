import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record awj(List<awi> b, boolean c) {
   public static final Codec<awj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awi.a.listOf().fieldOf("values").forGetter(awj::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(awj::b)).apply($$0, awj::new)
   );

   public List<awi> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
