import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eix implements eiy {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eix::new)
   );
   private final Optional<ji> b;
   private final boolean c;

   private eix(Optional<ji> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eix a(ji $$0, boolean $$1) {
      return new eix(Optional.of($$0), $$1);
   }

   public static eix a() {
      return new eix(Optional.empty(), false);
   }

   public Optional<ji> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
