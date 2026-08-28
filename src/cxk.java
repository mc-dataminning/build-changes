import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cxk(List<ard<String>> g) implements cwo<String, cxk> {
   public static final cxk a = new cxk(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<ard<String>> h = ard.a(Codec.string(0, 1024));
   public static final Codec<List<ard<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cxk> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cxk::a)).apply($$0, cxk::new));
   public static final ys<ByteBuf, cxk> f = ard.a(yq.b(1024)).a(yq.c(100)).a(cxk::new, cxk::a);

   public cxk(List<ard<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cxk b(List<ard<String>> $$0) {
      return new cxk($$0);
   }

   @Override
   public List<ard<String>> a() {
      return this.g;
   }
}
