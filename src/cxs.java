import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cxs(List<ars<String>> g) implements cww<String, cxs> {
   public static final cxs a = new cxs(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<ars<String>> h = ars.a(Codec.string(0, 1024));
   public static final Codec<List<ars<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cxs> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cxs::a)).apply($$0, cxs::new));
   public static final zj<ByteBuf, cxs> f = ars.a(zh.b(1024)).a(zh.c(100)).a(cxs::new, cxs::a);

   public cxs(List<ars<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cxs b(List<ars<String>> $$0) {
      return new cxs($$0);
   }

   @Override
   public List<ars<String>> a() {
      return this.g;
   }
}
