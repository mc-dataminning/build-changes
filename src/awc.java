import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record awc(List<awb> b, boolean c) {
   public static final Codec<awc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awb.a.listOf().fieldOf("values").forGetter(awc::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(awc::b)).apply($$0, awc::new)
   );

   public List<awb> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
