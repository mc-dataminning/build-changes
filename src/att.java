import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class att {
   private static final Codec<att> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ayn.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, att::new)
   );
   public static final asu<att> a = asu.a("filter", b);
   private final List<ayn> c;

   public att(List<ayn> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
