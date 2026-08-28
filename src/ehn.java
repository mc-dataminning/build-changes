import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ehn implements egt {
   public static final Codec<ehn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               efz.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               jh.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ehn::new)
   );
   private final boolean b;
   private final List<efz.a> c;
   @Nullable
   private final jh d;

   public ehn(boolean $$0, List<efz.a> $$1, @Nullable jh $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ehn(boolean $$0, List<efz.a> $$1, Optional<jh> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<efz.a> b() {
      return this.c;
   }

   @Nullable
   public jh c() {
      return this.d;
   }
}
