import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class atd {
   private static final Codec<atd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(axu.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, atd::new)
   );
   public static final ase<atd> a = ase.a("filter", b);
   private final List<axu> c;

   public atd(List<axu> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
