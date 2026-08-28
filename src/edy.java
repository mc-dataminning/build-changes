import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class edy implements ede {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               eck.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               iz.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, edy::new)
   );
   private final boolean b;
   private final List<eck.a> c;
   @Nullable
   private final iz d;

   public edy(boolean $$0, List<eck.a> $$1, @Nullable iz $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private edy(boolean $$0, List<eck.a> $$1, Optional<iz> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<eck.a> b() {
      return this.c;
   }

   @Nullable
   public iz c() {
      return this.d;
   }
}
