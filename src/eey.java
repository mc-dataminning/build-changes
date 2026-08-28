import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eey implements eee {
   public static final Codec<eey> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               edk.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               jd.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, eey::new)
   );
   private final boolean b;
   private final List<edk.a> c;
   @Nullable
   private final jd d;

   public eey(boolean $$0, List<edk.a> $$1, @Nullable jd $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private eey(boolean $$0, List<edk.a> $$1, Optional<jd> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<edk.a> b() {
      return this.c;
   }

   @Nullable
   public jd c() {
      return this.d;
   }
}
