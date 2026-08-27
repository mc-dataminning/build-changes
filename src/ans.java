import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ans {
   private static final Codec<ans> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(asd.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, ans::new)
   );
   public static final amu<ans> a = amu.a("filter", b);
   private final List<asd> c;

   public ans(List<asd> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
