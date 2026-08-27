import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class arz {
   private static final Codec<arz> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(awp.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, arz::new)
   );
   public static final arb<arz> a = arb.a("filter", b);
   private final List<awp> c;

   public arz(List<awp> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
