import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cxw(List<arv<String>> g) implements cxa<String, cxw> {
   public static final cxw a = new cxw(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<arv<String>> h = arv.a(Codec.string(0, 1024));
   public static final Codec<List<arv<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cxw> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cxw::a)).apply($$0, cxw::new));
   public static final zm<ByteBuf, cxw> f = arv.a(zk.b(1024)).a(zk.c(100)).a(cxw::new, cxw::a);

   public cxw(List<arv<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cxw b(List<arv<String>> $$0) {
      return new cxw($$0);
   }

   @Override
   public List<arv<String>> a() {
      return this.g;
   }
}
