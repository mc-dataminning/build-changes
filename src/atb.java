import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class atb {
   private static final Codec<atb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(axs.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, atb::new)
   );
   public static final asc<atb> a = asc.a("filter", b);
   private final List<axs> c;

   public atb(List<axs> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
