import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ave {
   private static final Codec<ave> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.list(azz.a).fieldOf("block").forGetter($$0x -> $$0x.c)).apply($$0, ave::new)
   );
   public static final aue<ave> a = new aue<>("filter", b);
   private final List<azz> c;

   public ave(List<azz> $$0) {
      this.c = List.copyOf($$0);
   }

   public boolean a(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.a().test($$0));
   }

   public boolean b(String $$0) {
      return this.c.stream().anyMatch($$1 -> $$1.b().test($$0));
   }
}
