import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cxh(List<arb<String>> g) implements cwl<String, cxh> {
   public static final cxh a = new cxh(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<arb<String>> h = arb.a(Codec.string(0, 1024));
   public static final Codec<List<arb<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cxh> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cxh::a)).apply($$0, cxh::new));
   public static final ys<ByteBuf, cxh> f = arb.a(yq.b(1024)).a(yq.c(100)).a(cxh::new, cxh::a);

   public cxh(List<arb<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cxh b(List<arb<String>> $$0) {
      return new cxh($$0);
   }

   @Override
   public List<arb<String>> a() {
      return this.g;
   }
}
