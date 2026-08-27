import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ecc implements ecd {
   public static final Codec<ecc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(io.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, ecc::new)
   );
   private final Optional<io> b;
   private final boolean c;

   private ecc(Optional<io> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ecc a(io $$0, boolean $$1) {
      return new ecc(Optional.of($$0), $$1);
   }

   public static ecc a() {
      return new ecc(Optional.empty(), false);
   }

   public Optional<io> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
