import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edd implements ede {
   public static final Codec<edd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iz.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, edd::new)
   );
   private final Optional<iz> b;
   private final boolean c;

   private edd(Optional<iz> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static edd a(iz $$0, boolean $$1) {
      return new edd(Optional.of($$0), $$1);
   }

   public static edd a() {
      return new edd(Optional.empty(), false);
   }

   public Optional<iz> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
