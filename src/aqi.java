import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class aqi {
   private static final Codec<aqi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(auy.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, aqi::new)
   );
   public static final apk<aqi> a = apk.a("filter", b);
   private final List<auy> c;

   public aqi(List<auy> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
