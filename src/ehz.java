import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ehz implements eia {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, ehz::new)
   );
   private final Optional<ji> b;
   private final boolean c;

   private ehz(Optional<ji> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ehz a(ji $$0, boolean $$1) {
      return new ehz(Optional.of($$0), $$1);
   }

   public static ehz a() {
      return new ehz(Optional.empty(), false);
   }

   public Optional<ji> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
