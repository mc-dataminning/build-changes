import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ava {
   private static final Codec<ava> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azt.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, ava::new)
   );
   public static final aua<ava> a = aua.a("filter", b);
   private final List<azt> c;

   public ava(List<azt> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
