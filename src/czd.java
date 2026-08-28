import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record czd(List<asa<String>> g) implements cyb<String, czd> {
   public static final czd a = new czd(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asa<String>> h = asa.a(Codec.string(0, 1024));
   public static final Codec<List<asa<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<czd> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(czd::a)).apply($$0, czd::new));
   public static final zc<ByteBuf, czd> f = asa.a(za.b(1024)).a(za.c(100)).a(czd::new, czd::a);

   public czd(List<asa<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public czd b(List<asa<String>> $$0) {
      return new czd($$0);
   }

   @Override
   public List<asa<String>> a() {
      return this.g;
   }
}
