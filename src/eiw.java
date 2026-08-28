import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class eiw implements eic {
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ehi.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               ji.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, eiw::new)
   );
   private final boolean b;
   private final List<ehi.a> c;
   @Nullable
   private final ji d;

   public eiw(boolean $$0, List<ehi.a> $$1, @Nullable ji $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private eiw(boolean $$0, List<ehi.a> $$1, Optional<ji> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ehi.a> b() {
      return this.c;
   }

   @Nullable
   public ji c() {
      return this.d;
   }
}
