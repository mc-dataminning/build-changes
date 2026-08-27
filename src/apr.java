import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class apr {
   private static final Codec<apr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(aug.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, apr::new)
   );
   public static final aot<apr> a = aot.a("filter", b);
   private final List<aug> c;

   public apr(List<aug> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
