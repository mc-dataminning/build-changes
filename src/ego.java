import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ego implements efu {
   public static final Codec<ego> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               efa.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               je.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ego::new)
   );
   private final boolean b;
   private final List<efa.a> c;
   @Nullable
   private final je d;

   public ego(boolean $$0, List<efa.a> $$1, @Nullable je $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ego(boolean $$0, List<efa.a> $$1, Optional<je> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<efa.a> b() {
      return this.c;
   }

   @Nullable
   public je c() {
      return this.d;
   }
}
