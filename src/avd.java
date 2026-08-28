import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class avd {
   private static final Codec<avd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azw.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, avd::new)
   );
   public static final aud<avd> a = aud.a("filter", b);
   private final List<azw> c;

   public avd(List<azw> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
