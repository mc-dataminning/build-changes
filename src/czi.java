import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record czi(List<asf<String>> g) implements cye<String, czi> {
   public static final czi a = new czi(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asf<String>> h = asf.a(Codec.string(0, 1024));
   public static final Codec<List<asf<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<czi> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(czi::a)).apply($$0, czi::new));
   public static final zg<ByteBuf, czi> f = asf.a(ze.b(1024)).a(ze.c(100)).a(czi::new, czi::a);

   public czi(List<asf<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public czi b(List<asf<String>> $$0) {
      return new czi($$0);
   }

   @Override
   public List<asf<String>> a() {
      return this.g;
   }
}
