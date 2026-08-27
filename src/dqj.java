import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqj implements dpp {
   public static final Codec<dqj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               dov.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               gv.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, dqj::new)
   );
   private final boolean b;
   private final List<dov.a> c;
   @Nullable
   private final gv d;

   public dqj(boolean $$0, List<dov.a> $$1, @Nullable gv $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private dqj(boolean $$0, List<dov.a> $$1, Optional<gv> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<dov.a> b() {
      return this.c;
   }

   @Nullable
   public gv c() {
      return this.d;
   }
}
