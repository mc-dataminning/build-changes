import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record aqc(List<aqb> b, boolean c) {
   public static final Codec<aqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqb.a.listOf().fieldOf("values").forGetter(aqc::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(aqc::b)).apply($$0, aqc::new)
   );

   public List<aqb> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
