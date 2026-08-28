import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record dbd(List<asf<String>> g) implements czy<String, dbd> {
   public static final dbd a = new dbd(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asf<String>> h = asf.a(Codec.string(0, 1024));
   public static final Codec<List<asf<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<dbd> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(dbd::a)).apply($$0, dbd::new));
   public static final yt<ByteBuf, dbd> f = asf.a(yr.b(1024)).a(yr.c(100)).a(dbd::new, dbd::a);

   public dbd(List<asf<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public dbd b(List<asf<String>> $$0) {
      return new dbd($$0);
   }

   @Override
   public List<asf<String>> a() {
      return this.g;
   }
}
