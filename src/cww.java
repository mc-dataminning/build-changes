import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cww(List<ard<String>> f) implements cwa<String, cww> {
   public static final cww a = new cww(List.of());
   public static final int b = 1024;
   private static final Codec<ard<String>> g = ard.a(Codec.string(0, 1024));
   public static final Codec<List<ard<String>>> c = g.sizeLimitedListOf(100);
   public static final Codec<cww> d = RecordCodecBuilder.create($$0 -> $$0.group(c.optionalFieldOf("pages", List.of()).forGetter(cww::a)).apply($$0, cww::new));
   public static final yv<ByteBuf, cww> e = ard.a(yt.b(1024)).a(yt.c(100)).a(cww::new, cww::a);

   public Stream<String> a(boolean $$0) {
      return this.f.stream().map($$1 -> $$1.a($$0));
   }

   public cww b(List<ard<String>> $$0) {
      return new cww($$0);
   }

   @Override
   public List<ard<String>> a() {
      return this.f;
   }
}
