import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ehd implements egj {
   public static final Codec<ehd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               efp.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               jg.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ehd::new)
   );
   private final boolean b;
   private final List<efp.a> c;
   @Nullable
   private final jg d;

   public ehd(boolean $$0, List<efp.a> $$1, @Nullable jg $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ehd(boolean $$0, List<efp.a> $$1, Optional<jg> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<efp.a> b() {
      return this.c;
   }

   @Nullable
   public jg c() {
      return this.d;
   }
}
