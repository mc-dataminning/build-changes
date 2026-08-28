import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cxy(List<arw<String>> g) implements cxc<String, cxy> {
   public static final cxy a = new cxy(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<arw<String>> h = arw.a(Codec.string(0, 1024));
   public static final Codec<List<arw<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cxy> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cxy::a)).apply($$0, cxy::new));
   public static final zn<ByteBuf, cxy> f = arw.a(zl.b(1024)).a(zl.c(100)).a(cxy::new, cxy::a);

   public cxy(List<arw<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cxy b(List<arw<String>> $$0) {
      return new cxy($$0);
   }

   @Override
   public List<arw<String>> a() {
      return this.g;
   }
}
