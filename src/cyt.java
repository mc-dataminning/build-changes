import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cyt(List<arx<String>> g) implements cxx<String, cyt> {
   public static final cyt a = new cyt(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<arx<String>> h = arx.a(Codec.string(0, 1024));
   public static final Codec<List<arx<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cyt> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cyt::a)).apply($$0, cyt::new));
   public static final zb<ByteBuf, cyt> f = arx.a(yz.b(1024)).a(yz.c(100)).a(cyt::new, cyt::a);

   public cyt(List<arx<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cyt b(List<arx<String>> $$0) {
      return new cyt($$0);
   }

   @Override
   public List<arx<String>> a() {
      return this.g;
   }
}
