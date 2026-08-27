import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class aqb {
   private static final Codec<aqb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(auq.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, aqb::new)
   );
   public static final apd<aqb> a = apd.a("filter", b);
   private final List<auq> c;

   public aqb(List<auq> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
