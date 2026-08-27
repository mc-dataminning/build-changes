import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class akw {
   private static final Codec<akw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(apg.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, akw::new)
   );
   public static final ajy<akw> a = ajy.a("filter", b);
   private final List<apg> c;

   public akw(List<apg> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
