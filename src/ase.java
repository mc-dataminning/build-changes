import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ase {
   private static final Codec<ase> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(awu.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, ase::new)
   );
   public static final arg<ase> a = arg.a("filter", b);
   private final List<awu> c;

   public ase(List<awu> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
