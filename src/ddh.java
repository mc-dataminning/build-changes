import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record ddh(List<ask<String>> g) implements dca<String, ddh> {
   public static final ddh a = new ddh(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<ask<String>> h = ask.a(Codec.string(0, 1024));
   public static final Codec<List<ask<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<ddh> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(ddh::a)).apply($$0, ddh::new));
   public static final yy<ByteBuf, ddh> f = ask.a(yw.b(1024)).a(yw.c(100)).a(ddh::new, ddh::a);

   public ddh(List<ask<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public ddh b(List<ask<String>> $$0) {
      return new ddh($$0);
   }

   @Override
   public List<ask<String>> a() {
      return this.g;
   }
}
