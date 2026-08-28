import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record dct(List<asi<String>> g) implements dbm<String, dct> {
   public static final dct a = new dct(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asi<String>> h = asi.a(Codec.string(0, 1024));
   public static final Codec<List<asi<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<dct> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(dct::a)).apply($$0, dct::new));
   public static final yw<ByteBuf, dct> f = asi.a(yu.b(1024)).a(yu.c(100)).a(dct::new, dct::a);

   public dct(List<asi<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public dct b(List<asi<String>> $$0) {
      return new dct($$0);
   }

   @Override
   public List<asi<String>> a() {
      return this.g;
   }
}
