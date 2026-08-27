import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dua implements dtg {
   public static final Codec<dua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dsm.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               hv.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dua::new)
   );
   private final boolean b;
   private final List<dsm.a> c;
   @Nullable
   private final hv d;

   public dua(boolean $$0, List<dsm.a> $$1, @Nullable hv $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dua(boolean $$0, List<dsm.a> $$1, Optional<hv> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dsm.a> b() {
      return this.c;
   }

   @Nullable
   public hv c() {
      return this.d;
   }
}
