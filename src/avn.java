import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class avn {
   private static final Codec<avn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(bak.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, avn::new)
   );
   public static final aun<avn> a = new aun<>("filter", b);
   private final List<bak> c;

   public avn(List<bak> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
