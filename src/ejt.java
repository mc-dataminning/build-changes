import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ejt implements eiz {
   public static final Codec<ejt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               eif.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               jh.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ejt::new)
   );
   private final boolean b;
   private final List<eif.a> c;
   @Nullable
   private final jh d;

   public ejt(boolean $$0, List<eif.a> $$1, @Nullable jh $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ejt(boolean $$0, List<eif.a> $$1, Optional<jh> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<eif.a> b() {
      return this.c;
   }

   @Nullable
   public jh c() {
      return this.d;
   }
}
