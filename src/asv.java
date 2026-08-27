import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record asv(List<asu> b, boolean c) {
   public static final Codec<asv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asu.a.listOf().fieldOf("values").forGetter(asv::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(asv::b)).apply($$0, asv::new)
   );

   public List<asu> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
