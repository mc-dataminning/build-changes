import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class efe implements eek {
   public static final Codec<efe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               edp.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ir.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, efe::new)
   );
   private final boolean b;
   private final List<edp.a> c;
   @Nullable
   private final ir d;

   public efe(boolean $$0, List<edp.a> $$1, @Nullable ir $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private efe(boolean $$0, List<edp.a> $$1, Optional<ir> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<edp.a> b() {
      return this.c;
   }

   @Nullable
   public ir c() {
      return this.d;
   }
}
