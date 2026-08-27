import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bkf {
   public static final Codec<bkf> a = RecordCodecBuilder.create($$0 -> $$0.group(dpq.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bkf::new));
   private final dpq b;

   public bkf(dpq $$0) {
      this.b = $$0;
   }

   public bkf(long $$0, ahg $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bkf(long $$0, Optional<ahg> $$1) {
      this(a($$0, $$1));
   }

   private static dpq a(long $$0, Optional<ahg> $$1) {
      dpe.a $$2 = dpe.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dpq($$2.a());
   }

   public static dpe.a a(ahg $$0) {
      return dpe.a($$0.toString());
   }

   public auu a() {
      return this.b;
   }
}
