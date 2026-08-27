import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record arq(List<arp> b, boolean c) {
   public static final Codec<arq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arp.a.listOf().fieldOf("values").forGetter(arq::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(arq::b)).apply($$0, arq::new)
   );

   public List<arp> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
