import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cuu(List<aql<String>> e) {
   public static final cuu a = new cuu(List.of());
   public static final int b = 1024;
   private static final Codec<aql<String>> f = aql.a(awu.b(0, 1024));
   private static final Codec<List<aql<String>>> g = awu.a(f.listOf(), 100);
   public static final Codec<cuu> c = RecordCodecBuilder.create($$0 -> $$0.group(awu.a(g, "pages", List.of()).forGetter(cuu::a)).apply($$0, cuu::new));
   public static final yg<ByteBuf, cuu> d = aql.a(ye.b(1024)).a(ye.c(100)).a(cuu::new, cuu::a);

   public Stream<String> a(boolean $$0) {
      return this.e.stream().map($$1 -> $$1.a($$0));
   }

   public List<aql<String>> a() {
      return this.e;
   }
}
