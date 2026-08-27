import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record asw(List<asv> b, boolean c) {
   public static final Codec<asw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asv.a.listOf().fieldOf("values").forGetter(asw::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(asw::b)).apply($$0, asw::new)
   );

   public List<asv> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
