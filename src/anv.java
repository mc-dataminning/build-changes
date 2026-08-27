import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class anv {
   private static final Codec<anv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(asi.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, anv::new)
   );
   public static final amx<anv> a = amx.a("filter", b);
   private final List<asi> c;

   public anv(List<asi> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
