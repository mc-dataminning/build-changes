import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record apz(List<apy> b, boolean c) {
   public static final Codec<apz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(apy.a.listOf().fieldOf("values").forGetter(apz::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(apz::b)).apply($$0, apz::new)
   );

   public List<apy> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
