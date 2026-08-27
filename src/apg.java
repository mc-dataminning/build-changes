import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class apg {
   private static final Codec<apg> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(att.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, apg::new)
   );
   public static final aoi<apg> a = aoi.a("filter", b);
   private final List<att> c;

   public apg(List<att> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
