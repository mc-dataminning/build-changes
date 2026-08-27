import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aus(List<aur> b, boolean c) {
   public static final Codec<aus> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aur.a.listOf().fieldOf("values").forGetter(aus::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aus::b)).apply($$0, aus::new)
   );

   public List<aur> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
