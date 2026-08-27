import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class asa {
   private static final Codec<asa> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(awq.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, asa::new)
   );
   public static final arc<asa> a = arc.a("filter", b);
   private final List<awq> c;

   public asa(List<awq> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
