import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class anl {
   private static final Codec<anl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(arv.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, anl::new)
   );
   public static final amn<anl> a = amn.a("filter", b);
   private final List<arv> c;

   public anl(List<arv> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
