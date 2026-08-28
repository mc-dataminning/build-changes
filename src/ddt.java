import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record ddt(List<ast<String>> g) implements dcm<String, ddt> {
   public static final ddt a = new ddt(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<ast<String>> h = ast.a(Codec.string(0, 1024));
   public static final Codec<List<ast<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<ddt> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(ddt::a)).apply($$0, ddt::new));
   public static final ze<ByteBuf, ddt> f = ast.a(zc.b(1024)).a(zc.c(100)).a(ddt::new, ddt::a);

   public ddt(List<ast<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public ddt b(List<ast<String>> $$0) {
      return new ddt($$0);
   }

   @Override
   public List<ast<String>> a() {
      return this.g;
   }
}
