import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dst implements drz {
   public static final Codec<dst> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               drf.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ht.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dst::new)
   );
   private final boolean b;
   private final List<drf.a> c;
   @Nullable
   private final ht d;

   public dst(boolean $$0, List<drf.a> $$1, @Nullable ht $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dst(boolean $$0, List<drf.a> $$1, Optional<ht> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<drf.a> b() {
      return this.c;
   }

   @Nullable
   public ht c() {
      return this.d;
   }
}
