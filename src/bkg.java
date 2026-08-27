import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bkg {
   public static final Codec<bkg> a = RecordCodecBuilder.create($$0 -> $$0.group(dpr.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bkg::new));
   private final dpr b;

   public bkg(dpr $$0) {
      this.b = $$0;
   }

   public bkg(long $$0, ahg $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bkg(long $$0, Optional<ahg> $$1) {
      this(a($$0, $$1));
   }

   private static dpr a(long $$0, Optional<ahg> $$1) {
      dpf.a $$2 = dpf.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dpr($$2.a());
   }

   public static dpf.a a(ahg $$0) {
      return dpf.a($$0.toString());
   }

   public auv a() {
      return this.b;
   }
}
