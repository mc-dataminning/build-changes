import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class auk {
   private static final Codec<auk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azd.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, auk::new)
   );
   public static final atl<auk> a = atl.a("filter", b);
   private final List<azd> c;

   public auk(List<azd> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
