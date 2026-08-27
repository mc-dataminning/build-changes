import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class atv {
   private static final Codec<atv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(ayl.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, atv::new)
   );
   public static final asw<atv> a = asw.a("filter", b);
   private final List<ayl> c;

   public atv(List<ayl> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
