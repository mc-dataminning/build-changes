import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aqg(List<aqf> b, boolean c) {
   public static final Codec<aqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqf.a.listOf().fieldOf("values").forGetter(aqg::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aqg::b)).apply($$0, aqg::new)
   );

   public List<aqf> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
