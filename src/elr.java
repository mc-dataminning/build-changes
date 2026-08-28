import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class elr implements ekx {
   public static final Codec<elr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ekd.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               iu.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, elr::new)
   );
   private final boolean b;
   private final List<ekd.a> c;
   @Nullable
   private final iu d;

   public elr(boolean $$0, List<ekd.a> $$1, @Nullable iu $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private elr(boolean $$0, List<ekd.a> $$1, Optional<iu> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ekd.a> b() {
      return this.c;
   }

   @Nullable
   public iu c() {
      return this.d;
   }
}
