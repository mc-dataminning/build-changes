import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edb implements edc {
   public static final Codec<edb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iz.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, edb::new)
   );
   private final Optional<iz> b;
   private final boolean c;

   private edb(Optional<iz> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static edb a(iz $$0, boolean $$1) {
      return new edb(Optional.of($$0), $$1);
   }

   public static edb a() {
      return new edb(Optional.empty(), false);
   }

   public Optional<iz> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
