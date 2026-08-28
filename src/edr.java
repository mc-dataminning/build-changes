import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class edr implements ecx {
   public static final Codec<edr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.BOOL.fieldOf("crystal_invulnerable").orElse(false).forGetter($$0x -> $$0x.b),
               ecd.a.a.listOf().fieldOf("spikes").forGetter($$0x -> $$0x.c),
               iz.a.optionalFieldOf("crystal_beam_target").forGetter($$0x -> Optional.ofNullable($$0x.d))
            )
            .apply($$0, edr::new)
   );
   private final boolean b;
   private final List<ecd.a> c;
   @Nullable
   private final iz d;

   public edr(boolean $$0, List<ecd.a> $$1, @Nullable iz $$2) {
      this($$0, $$1, Optional.ofNullable($$2));
   }

   private edr(boolean $$0, List<ecd.a> $$1, Optional<iz> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2.orElse(null);
   }

   public boolean a() {
      return this.b;
   }

   public List<ecd.a> b() {
      return this.c;
   }

   @Nullable
   public iz c() {
      return this.d;
   }
}
