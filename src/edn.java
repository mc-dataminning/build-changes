import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class edn implements edo {
   public static final Codec<edn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ja.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, edn::new)
   );
   private final Optional<ja> b;
   private final boolean c;

   private edn(Optional<ja> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static edn a(ja $$0, boolean $$1) {
      return new edn(Optional.of($$0), $$1);
   }

   public static edn a() {
      return new edn(Optional.empty(), false);
   }

   public Optional<ja> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
