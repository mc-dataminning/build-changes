import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class aus {
   private static final Codec<aus> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azm.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, aus::new)
   );
   public static final att<aus> a = att.a("filter", b);
   private final List<azm> c;

   public aus(List<azm> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
