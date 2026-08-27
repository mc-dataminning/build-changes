import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record awf(List<awe> b, boolean c) {
   public static final Codec<awf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awe.a.listOf().fieldOf("values").forGetter(awf::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(awf::b)).apply($$0, awf::new)
   );

   public List<awe> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
