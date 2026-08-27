import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class aqh {
   private static final Codec<aqh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(auw.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, aqh::new)
   );
   public static final apj<aqh> a = apj.a("filter", b);
   private final List<auw> c;

   public aqh(List<auw> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
