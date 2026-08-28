import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eiu implements eia {
   public static final Codec<eiu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ehg.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ji.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, eiu::new)
   );
   private final boolean b;
   private final List<ehg.a> c;
   @Nullable
   private final ji d;

   public eiu(boolean $$0, List<ehg.a> $$1, @Nullable ji $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private eiu(boolean $$0, List<ehg.a> $$1, Optional<ji> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ehg.a> b() {
      return this.c;
   }

   @Nullable
   public ji c() {
      return this.d;
   }
}
