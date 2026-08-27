import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record avs(List<avr> b, boolean c) {
   public static final Codec<avs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avr.a.listOf().fieldOf("values").forGetter(avs::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(avs::b)).apply($$0, avs::new)
   );

   public List<avr> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
