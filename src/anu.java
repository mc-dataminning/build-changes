import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class anu {
   private static final Codec<anu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(asf.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, anu::new)
   );
   public static final amw<anu> a = amw.a("filter", b);
   private final List<asf> c;

   public anu(List<asf> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
