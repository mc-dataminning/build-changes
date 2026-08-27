import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record auo(List<aun> b, boolean c) {
   public static final Codec<auo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aun.a.listOf().fieldOf("values").forGetter(auo::a), Codec.BOOL.optionalFieldOf("replace", false).forGetter(auo::b)).apply($$0, auo::new)
   );

   public List<aun> a() {
      return this.b;
   }

   public boolean b() {
      return this.c;
   }
}
