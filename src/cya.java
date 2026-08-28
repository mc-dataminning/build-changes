import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cya(List<arl<String>> g) implements cxe<String, cya> {
   public static final cya a = new cya(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<arl<String>> h = arl.a(Codec.string(0, 1024));
   public static final Codec<List<arl<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cya> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cya::a)).apply($$0, cya::new));
   public static final yx<ByteBuf, cya> f = arl.a(yv.b(1024)).a(yv.c(100)).a(cya::new, cya::a);

   public cya(List<arl<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cya b(List<arl<String>> $$0) {
      return new cya($$0);
   }

   @Override
   public List<arl<String>> a() {
      return this.g;
   }
}
