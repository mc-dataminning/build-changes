import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class efx implements efy {
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jf.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, efx::new)
   );
   private final Optional<jf> b;
   private final boolean c;

   private efx(Optional<jf> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static efx a(jf $$0, boolean $$1) {
      return new efx(Optional.of($$0), $$1);
   }

   public static efx a() {
      return new efx(Optional.empty(), false);
   }

   public Optional<jf> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
