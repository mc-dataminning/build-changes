import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eat implements dzz {
   public static final Codec<eat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dzf.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ib.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, eat::new)
   );
   private final boolean b;
   private final List<dzf.a> c;
   @Nullable
   private final ib d;

   public eat(boolean $$0, List<dzf.a> $$1, @Nullable ib $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private eat(boolean $$0, List<dzf.a> $$1, Optional<ib> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dzf.a> b() {
      return this.c;
   }

   @Nullable
   public ib c() {
      return this.d;
   }
}
