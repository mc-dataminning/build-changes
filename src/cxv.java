import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cxv(List<arv<String>> g) implements cwz<String, cxv> {
   public static final cxv a = new cxv(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<arv<String>> h = arv.a(Codec.string(0, 1024));
   public static final Codec<List<arv<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cxv> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cxv::a)).apply($$0, cxv::new));
   public static final zm<ByteBuf, cxv> f = arv.a(zk.b(1024)).a(zk.c(100)).a(cxv::new, cxv::a);

   public cxv(List<arv<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cxv b(List<arv<String>> $$0) {
      return new cxv($$0);
   }

   @Override
   public List<arv<String>> a() {
      return this.g;
   }
}
