import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eia implements eib {
   public static final Codec<eia> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eia::new)
   );
   private final Optional<ji> b;
   private final boolean c;

   private eia(Optional<ji> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eia a(ji $$0, boolean $$1) {
      return new eia(Optional.of($$0), $$1);
   }

   public static eia a() {
      return new eia(Optional.empty(), false);
   }

   public Optional<ji> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
