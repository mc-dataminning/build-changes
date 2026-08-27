import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class aqg {
   private static final Codec<aqg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(auv.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, aqg::new)
   );
   public static final api<aqg> a = api.a("filter", b);
   private final List<auv> c;

   public aqg(List<auv> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
