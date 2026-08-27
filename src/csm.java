import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class csm {
   public static final csm a = new csm(ImmutableList.of("vanilla"), ImmutableList.of());
   public static final Codec<csm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.STRING.listOf().fieldOf("Enabled").forGetter($$0x -> $$0x.c), Codec.STRING.listOf().fieldOf("Disabled").forGetter($$0x -> $$0x.d))
            .apply($$0, csm::new)
   );
   private final List<String> c;
   private final List<String> d;

   public csm(List<String> $$0, List<String> $$1) {
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
