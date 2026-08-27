import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cwy(List<are<String>> f) implements cwc<String, cwy> {
   public static final cwy a = new cwy(List.of());
   public static final int b = 1024;
   private static final Codec<are<String>> g = are.a(Codec.string(0, 1024));
   public static final Codec<List<are<String>>> c = g.sizeLimitedListOf(100);
   public static final Codec<cwy> d = RecordCodecBuilder.create($$0 -> $$0.group(c.optionalFieldOf("pages", List.of()).forGetter(cwy::a)).apply($$0, cwy::new));
   public static final yv<ByteBuf, cwy> e = are.a(yt.b(1024)).a(yt.c(100)).a(cwy::new, cwy::a);

   public Stream<String> a(boolean $$0) {
      return this.f.stream().map($$1 -> $$1.a($$0));
   }

   public cwy b(List<are<String>> $$0) {
      return new cwy($$0);
   }

   @Override
   public List<are<String>> a() {
      return this.f;
   }
}
