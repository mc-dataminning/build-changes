import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record czt(List<ash<String>> g) implements cyp<String, czt> {
   public static final czt a = new czt(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<ash<String>> h = ash.a(Codec.string(0, 1024));
   public static final Codec<List<ash<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<czt> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(czt::a)).apply($$0, czt::new));
   public static final zh<ByteBuf, czt> f = ash.a(zf.b(1024)).a(zf.c(100)).a(czt::new, czt::a);

   public czt(List<ash<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public czt b(List<ash<String>> $$0) {
      return new czt($$0);
   }

   @Override
   public List<ash<String>> a() {
      return this.g;
   }
}
