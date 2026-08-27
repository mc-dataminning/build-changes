import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dal {
   public static final dal a = new dal(ImmutableList.of("vanilla"), ImmutableList.of());
   public static final Codec<dal> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.listOf().fieldOf("Enabled").forGetter($$0x -> $$0x.c), Codec.STRING.listOf().fieldOf("Disabled").forGetter($$0x -> $$0x.d))
            .apply($$0, dal::new)
   );
   private final List<String> c;
   private final List<String> d;

   public dal(List<String> $$0, List<String> $$1) {
      this.c = ImmutableList.copyOf($$0);
      this.d = ImmutableList.copyOf($$1);
   }

   public List<String> a() {
      return this.c;
   }

   public List<String> b() {
      return this.d;
   }
}
