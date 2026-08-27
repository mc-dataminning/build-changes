import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eca implements ecb {
   public static final Codec<eca> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(io.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eca::new)
   );
   private final Optional<io> b;
   private final boolean c;

   private eca(Optional<io> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eca a(io $$0, boolean $$1) {
      return new eca(Optional.of($$0), $$1);
   }

   public static eca a() {
      return new eca(Optional.empty(), false);
   }

   public Optional<io> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
