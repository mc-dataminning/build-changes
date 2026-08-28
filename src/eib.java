import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eib implements eic {
   public static final Codec<eib> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eib::new)
   );
   private final Optional<ji> b;
   private final boolean c;

   private eib(Optional<ji> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eib a(ji $$0, boolean $$1) {
      return new eib(Optional.of($$0), $$1);
   }

   public static eib a() {
      return new eib(Optional.empty(), false);
   }

   public Optional<ji> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
