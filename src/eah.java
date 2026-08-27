import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eah implements eai {
   public static final Codec<eah> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(id.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eah::new)
   );
   private final Optional<id> b;
   private final boolean c;

   private eah(Optional<id> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eah a(id $$0, boolean $$1) {
      return new eah(Optional.of($$0), $$1);
   }

   public static eah a() {
      return new eah(Optional.empty(), false);
   }

   public Optional<id> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
