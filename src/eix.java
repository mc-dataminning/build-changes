import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eix implements eid {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ehj.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ji.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, eix::new)
   );
   private final boolean b;
   private final List<ehj.a> c;
   @Nullable
   private final ji d;

   public eix(boolean $$0, List<ehj.a> $$1, @Nullable ji $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private eix(boolean $$0, List<ehj.a> $$1, Optional<ji> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ehj.a> b() {
      return this.c;
   }

   @Nullable
   public ji c() {
      return this.d;
   }
}
