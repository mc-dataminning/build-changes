import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class aos {
   private static final Codec<aos> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(atf.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, aos::new)
   );
   public static final anu<aos> a = anu.a("filter", b);
   private final List<atf> c;

   public aos(List<atf> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
