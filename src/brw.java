import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class brw {
   public static final Codec<brw> a = RecordCodecBuilder.create($$0 -> $$0.group(ebp.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, brw::new));
   private final ebp b;

   public brw(ebp $$0) {
      this.b = $$0;
   }

   public brw(long $$0, ale $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public brw(long $$0, Optional<ale> $$1) {
      this(a($$0, $$1));
   }

   private static ebp a(long $$0, Optional<ale> $$1) {
      ebd.a $$2 = ebd.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new ebp($$2.a());
   }

   public static ebd.a a(ale $$0) {
      return ebd.a($$0.toString());
   }

   public azn a() {
      return this.b;
   }
}
