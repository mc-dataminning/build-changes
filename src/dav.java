import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record dav(List<asz<String>> g) implements czr<String, dav> {
   public static final dav a = new dav(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asz<String>> h = asz.a(Codec.string(0, 1024));
   public static final Codec<List<asz<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<dav> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(dav::a)).apply($$0, dav::new));
   public static final zt<ByteBuf, dav> f = asz.a(zr.b(1024)).a(zr.c(100)).a(dav::new, dav::a);

   public dav(List<asz<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public dav b(List<asz<String>> $$0) {
      return new dav($$0);
   }

   @Override
   public List<asz<String>> a() {
      return this.g;
   }
}
