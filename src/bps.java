import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bps {
   public static final Codec<bps> a = RecordCodecBuilder.create($$0 -> $$0.group(dxa.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bps::new));
   private final dxa b;

   public bps(dxa $$0) {
      this.b = $$0;
   }

   public bps(long $$0, akh $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bps(long $$0, Optional<akh> $$1) {
      this(a($$0, $$1));
   }

   private static dxa a(long $$0, Optional<akh> $$1) {
      dwo.a $$2 = dwo.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dxa($$2.a());
   }

   public static dwo.a a(akh $$0) {
      return dwo.a($$0.toString());
   }

   public ayg a() {
      return this.b;
   }
}
