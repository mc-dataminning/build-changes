import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.stream.Stream;

public record czc(List<ase<String>> g) implements cya<String, czc> {
   public static final czc a = new czc(List.of());
   public static final int b = 1024;
   public static final int c = 100;
   private static final Codec<ase<String>> h = ase.a(Codec.string(0, 1024));
   public static final Codec<List<ase<String>>> d = h.sizeLimitedListOf(100);
   public static final Codec<czc> e = RecordCodecBuilder.create($$0 -> $$0.group(d.optionalFieldOf("pages", List.of()).forGetter(czc::a)).apply($$0, czc::new));
   public static final zf<ByteBuf, czc> f = ase.a(zd.b(1024)).a(zd.c(100)).a(czc::new, czc::a);

   public czc(List<ase<String>> g) {
      if (g.size() > 100) {
         throw new IllegalArgumentException("Got " + g.size() + " pages, but maximum is 100");
      } else {
         this.g = g;
      }
   }

   public Stream<String> a(boolean $$0) {
      return this.g.stream().map($$1 -> $$1.a($$0));
   }

   public czc b(List<ase<String>> $$0) {
      return new czc($$0);
   }

   @Override
   public List<ase<String>> a() {
      return this.g;
   }
}
