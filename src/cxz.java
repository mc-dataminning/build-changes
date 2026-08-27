import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cxz(List<ark<String>> f) implements cxc<String, cxz> {
   public static final cxz a = new cxz(List.of());
   public static final int b = 1024;
   private static final Codec<ark<String>> g = ark.a(axu.b(0, 1024));
   public static final Codec<List<ark<String>>> c = axu.a(g.listOf(), 100);
   public static final Codec<cxz> d = RecordCodecBuilder.create($$0 -> $$0.group(axu.a(c, "pages", List.of()).forGetter(cxz::a)).apply($$0, cxz::new));
   public static final zc<ByteBuf, cxz> e = ark.a(za.b(1024)).a(za.c(100)).a(cxz::new, cxz::a);

   public Stream<String> a(boolean $$0) {
      return this.f.stream().map($$1 -> $$1.a($$0));
   }

   public cxz b(List<ark<String>> $$0) {
      return new cxz($$0);
   }

   @Override
   public List<ark<String>> a() {
      return this.f;
   }
}
