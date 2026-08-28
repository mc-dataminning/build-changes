import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cxj(List<ard<String>> g) implements cwn<String, cxj> {
   public static final cxj a = new cxj(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<ard<String>> h = ard.a(Codec.string(0, 1024));
   public static final Codec<List<ard<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cxj> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cxj::a)).apply($$0, cxj::new));
   public static final ys<ByteBuf, cxj> f = ard.a(yq.b(1024)).a(yq.c(100)).a(cxj::new, cxj::a);

   public cxj(List<ard<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cxj b(List<ard<String>> $$0) {
      return new cxj($$0);
   }

   @Override
   public List<ard<String>> a() {
      return this.g;
   }
}
