import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class enl implements emr {
   public static final Codec<enl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               elw.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               iw.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, enl::new)
   );
   private final boolean b;
   private final List<elw.a> c;
   @Nullable
   private final iw d;

   public enl(boolean $$0, List<elw.a> $$1, @Nullable iw $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private enl(boolean $$0, List<elw.a> $$1, Optional<iw> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<elw.a> b() {
      return this.c;
   }

   @Nullable
   public iw c() {
      return this.d;
   }
}
