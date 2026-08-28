import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edc implements edd {
   public static final Codec<edc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iz.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, edc::new)
   );
   private final Optional<iz> b;
   private final boolean c;

   private edc(Optional<iz> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static edc a(iz $$0, boolean $$1) {
      return new edc(Optional.of($$0), $$1);
   }

   public static edc a() {
      return new edc(Optional.empty(), false);
   }

   public Optional<iz> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
