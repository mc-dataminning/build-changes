import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class avu {
   private static final Codec<avu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ban.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, avu::new)
   );
   public static final auu<avu> a = auu.a("filter", b);
   private final List<ban> c;

   public avu(List<ban> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
