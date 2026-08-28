import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class aur {
   private static final Codec<aur> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azl.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, aur::new)
   );
   public static final ats<aur> a = ats.a("filter", b);
   private final List<azl> c;

   public aur(List<azl> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
