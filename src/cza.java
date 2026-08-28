import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record cza(List<ary<String>> g) implements cxy<String, cza> {
   public static final cza a = new cza(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<ary<String>> h = ary.a(Codec.string(0, 1024));
   public static final Codec<List<ary<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<cza> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(cza::a)).apply($$0, cza::new));
   public static final zb<ByteBuf, cza> f = ary.a(yz.b(1024)).a(yz.c(100)).a(cza::new, cza::a);

   public cza(List<ary<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public cza b(List<ary<String>> $$0) {
      return new cza($$0);
   }

   @Override
   public List<ary<String>> a() {
      return this.g;
   }
}
