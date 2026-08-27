import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record avq(List<avp> b, boolean c) {
   public static final Codec<avq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avp.a.listOf().fieldOf("values").forGetter(avq::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(avq::b)).apply($$0, avq::new)
   );

   public List<avp> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
