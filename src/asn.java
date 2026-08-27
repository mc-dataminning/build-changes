import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class asn {
   private static final Codec<asn> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(axe.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, asn::new)
   );
   public static final aro<asn> a = aro.a("filter", b);
   private final List<axe> c;

   public asn(List<axe> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
