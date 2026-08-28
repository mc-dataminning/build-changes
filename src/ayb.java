import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ayb(List<aya> b, boolean c) {
   public static final Codec<ayb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aya.a.listOf().fieldOf("values").forGetter(ayb::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(ayb::b)).apply($$0, ayb::new)
   );

   public List<aya> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
