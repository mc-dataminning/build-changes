import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bsn {
   public static final Codec<bsn> a = RecordCodecBuilder.create($$0 -> $$0.group(eds.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bsn::new));
   private final eds b;

   public bsn(eds $$0) {
      this.b = $$0;
   }

   public bsn(long $$0, akv $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bsn(long $$0, Optional<akv> $$1) {
      this(a($$0, $$1));
   }

   private static eds a(long $$0, Optional<akv> $$1) {
      edg.a $$2 = edg.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eds($$2.a());
   }

   public static edg.a a(akv $$0) {
      return edg.a($$0.toString());
   }

   public azh a() {
      return this.b;
   }
}
