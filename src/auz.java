import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class auz {
   private static final Codec<auz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azs.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, auz::new)
   );
   public static final atz<auz> a = atz.a("filter", b);
   private final List<azs> c;

   public auz(List<azs> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
