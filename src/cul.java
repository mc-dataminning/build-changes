import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cul(List<aqj<String>> e) {
   public static final cul a = new cul(List.of());
   public static final int b = 1024;
   private static final Codec<aqj<String>> f = aqj.a(aws.b(0, 1024));
   private static final Codec<List<aqj<String>>> g = aws.a(f.listOf(), 100);
   public static final Codec<cul> c = RecordCodecBuilder.create($$0 -> $$0.group(aws.a(g, "pages", List.of()).forGetter(cul::a)).apply($$0, cul::new));
   public static final ye<ByteBuf, cul> d = aqj.a(yc.b(1024)).a(yc.c(100)).a(cul::new, cul::a);

   public Stream<String> a(boolean $$0) {
      return this.e.stream().map($$1 -> $$1.a($$0));
   }

   public List<aqj<String>> a() {
      return this.e;
   }
}
