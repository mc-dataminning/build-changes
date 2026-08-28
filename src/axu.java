import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record axu(List<axt> b, boolean c) {
   public static final Codec<axu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axt.a.listOf().fieldOf("values").forGetter(axu::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(axu::b)).apply($$0, axu::new)
   );

   public List<axt> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
