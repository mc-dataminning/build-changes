import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record dan(List<asp<String>> g) implements czj<String, dan> {
   public static final dan a = new dan(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asp<String>> h = asp.a(Codec.string(0, 1024));
   public static final Codec<List<asp<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<dan> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(dan::a)).apply($$0, dan::new));
   public static final zi<ByteBuf, dan> f = asp.a(zg.b(1024)).a(zg.c(100)).a(dan::new, dan::a);

   public dan(List<asp<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public dan b(List<asp<String>> $$0) {
      return new dan($$0);
   }

   @Override
   public List<asp<String>> a() {
      return this.g;
   }
}
