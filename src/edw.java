import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class edw implements edc {
   public static final Codec<edw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               eci.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               iz.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, edw::new)
   );
   private final boolean b;
   private final List<eci.a> c;
   @Nullable
   private final iz d;

   public edw(boolean $$0, List<eci.a> $$1, @Nullable iz $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private edw(boolean $$0, List<eci.a> $$1, Optional<iz> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<eci.a> b() {
      return this.c;
   }

   @Nullable
   public iz c() {
      return this.d;
   }
}
