import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record dcw(List<asi<String>> g) implements dbp<String, dcw> {
   public static final dcw a = new dcw(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asi<String>> h = asi.a(Codec.string(0, 1024));
   public static final Codec<List<asi<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<dcw> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(dcw::a)).apply($$0, dcw::new));
   public static final yw<ByteBuf, dcw> f = asi.a(yu.b(1024)).a(yu.c(100)).a(dcw::new, dcw::a);

   public dcw(List<asi<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public dcw b(List<asi<String>> $$0) {
      return new dcw($$0);
   }

   @Override
   public List<asi<String>> a() {
      return this.g;
   }
}
