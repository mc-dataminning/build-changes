import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record dcb(List<asg<String>> g) implements dau<String, dcb> {
   public static final dcb a = new dcb(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<asg<String>> h = asg.a(Codec.string(0, 1024));
   public static final Codec<List<asg<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<dcb> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(dcb::a)).apply($$0, dcb::new));
   public static final yu<ByteBuf, dcb> f = asg.a(ys.b(1024)).a(ys.c(100)).a(dcb::new, dcb::a);

   public dcb(List<asg<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public dcb b(List<asg<String>> $$0) {
      return new dcb($$0);
   }

   @Override
   public List<asg<String>> a() {
      return this.g;
   }
}
