import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record czw(List<aru<String>> g) implements cys<String, czw> {
   public static final czw a = new czw(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<aru<String>> h = aru.a(Codec.string(0, 1024));
   public static final Codec<List<aru<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<czw> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(czw::a)).apply($$0, czw::new));
   public static final ym<ByteBuf, czw> f = aru.a(yk.b(1024)).a(yk.c(100)).a(czw::new, czw::a);

   public czw(List<aru<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public czw b(List<aru<String>> $$0) {
      return new czw($$0);
   }

   @Override
   public List<aru<String>> a() {
      return this.g;
   }
}
