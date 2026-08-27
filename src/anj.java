import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class anj {
   private static final Codec<anj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(aru.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, anj::new)
   );
   public static final aml<anj> a = aml.a("filter", b);
   private final List<aru> c;

   public anj(List<aru> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
