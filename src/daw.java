import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record daw(List<asz<String>> g) implements czs<String, daw> {
   public static final daw a = new daw(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asz<String>> h = asz.a(Codec.string(0, 1024));
   public static final Codec<List<asz<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<daw> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(daw::a)).apply($$0, daw::new));
   public static final zt<ByteBuf, daw> f = asz.a(zr.b(1024)).a(zr.c(100)).a(daw::new, daw::a);

   public daw(List<asz<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public daw b(List<asz<String>> $$0) {
      return new daw($$0);
   }

   @Override
   public List<asz<String>> a() {
      return this.g;
   }
}
