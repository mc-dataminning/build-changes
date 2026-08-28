import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class efc implements eei {
   public static final Codec<efc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               edo.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               jd.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, efc::new)
   );
   private final boolean b;
   private final List<edo.a> c;
   @Nullable
   private final jd d;

   public efc(boolean $$0, List<edo.a> $$1, @Nullable jd $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private efc(boolean $$0, List<edo.a> $$1, Optional<jd> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<edo.a> b() {
      return this.c;
   }

   @Nullable
   public jd c() {
      return this.d;
   }
}
