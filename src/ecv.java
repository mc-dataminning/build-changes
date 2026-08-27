import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ecv implements ecb {
   public static final Codec<ecv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ebh.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               io.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ecv::new)
   );
   private final boolean b;
   private final List<ebh.a> c;
   @Nullable
   private final io d;

   public ecv(boolean $$0, List<ebh.a> $$1, @Nullable io $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ecv(boolean $$0, List<ebh.a> $$1, Optional<io> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ebh.a> b() {
      return this.c;
   }

   @Nullable
   public io c() {
      return this.d;
   }
}
