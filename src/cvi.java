import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cvi(List<aqv<String>> f) implements cun<String, cvi> {
   public static final cvi a = new cvi(List.of());
   public static final int b = 1024;
   private static final Codec<aqv<String>> g = aqv.a(axe.b(0, 1024));
   public static final Codec<List<aqv<String>>> c = axe.a(g.listOf(), 100);
   public static final Codec<cvi> d = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(c, "pages", List.of()).forGetter(cvi::a)).apply($$0, cvi::new));
   public static final yq<ByteBuf, cvi> e = aqv.a(yo.b(1024)).a(yo.c(100)).a(cvi::new, cvi::a);

   public Stream<String> a(boolean $$0) {
      return this.f.stream().map($$1 -> $$1.a($$0));
   }

   public cvi b(List<aqv<String>> $$0) {
      return new cvi($$0);
   }

   @Override
   public List<aqv<String>> a() {
      return this.f;
   }
}
