import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class egs implements efy {
   public static final Codec<egs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               efe.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               jf.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, egs::new)
   );
   private final boolean b;
   private final List<efe.a> c;
   @Nullable
   private final jf d;

   public egs(boolean $$0, List<efe.a> $$1, @Nullable jf $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private egs(boolean $$0, List<efe.a> $$1, Optional<jf> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<efe.a> b() {
      return this.c;
   }

   @Nullable
   public jf c() {
      return this.d;
   }
}
