import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cwf(List<aqy<String>> f) implements cvj<String, cwf> {
   public static final cwf a = new cwf(List.of());
   public static final int b = 1024;
   private static final Codec<aqy<String>> g = aqy.a(axh.b(0, 1024));
   public static final Codec<List<aqy<String>>> c = axh.a(g.listOf(), 100);
   public static final Codec<cwf> d = RecordCodecBuilder.create($$0 -> $$0.group(axh.a(c, "pages", List.of()).forGetter(cwf::a)).apply($$0, cwf::new));
   public static final ys<ByteBuf, cwf> e = aqy.a(yq.b(1024)).a(yq.c(100)).a(cwf::new, cwf::a);

   public Stream<String> a(boolean $$0) {
      return this.f.stream().map($$1 -> $$1.a($$0));
   }

   public cwf b(List<aqy<String>> $$0) {
      return new cwf($$0);
   }

   @Override
   public List<aqy<String>> a() {
      return this.f;
   }
}
