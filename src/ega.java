import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ega implements efg {
   public static final Codec<ega> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               eem.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               je.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ega::new)
   );
   private final boolean b;
   private final List<eem.a> c;
   @Nullable
   private final je d;

   public ega(boolean $$0, List<eem.a> $$1, @Nullable je $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ega(boolean $$0, List<eem.a> $$1, Optional<je> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<eem.a> b() {
      return this.c;
   }

   @Nullable
   public je c() {
      return this.d;
   }
}
