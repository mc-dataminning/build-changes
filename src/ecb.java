import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ecb implements ebh {
   public static final Codec<ecb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ean.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               in.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, ecb::new)
   );
   private final boolean b;
   private final List<ean.a> c;
   @Nullable
   private final in d;

   public ecb(boolean $$0, List<ean.a> $$1, @Nullable in $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private ecb(boolean $$0, List<ean.a> $$1, Optional<in> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ean.a> b() {
      return this.c;
   }

   @Nullable
   public in c() {
      return this.d;
   }
}
