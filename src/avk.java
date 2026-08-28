import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class avk {
   private static final Codec<avk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(bad.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, avk::new)
   );
   public static final auk<avk> a = auk.a("filter", b);
   private final List<bad> c;

   public avk(List<bad> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
