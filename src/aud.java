import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class aud {
   private static final Codec<aud> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ayx.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, aud::new)
   );
   public static final ate<aud> a = ate.a("filter", b);
   private final List<ayx> c;

   public aud(List<ayx> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
