import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bmr {
   public static final Codec<bmr> a = RecordCodecBuilder.create($$0 -> $$0.group(dsr.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bmr::new));
   private final dsr b;

   public bmr(dsr $$0) {
      this.b = $$0;
   }

   public bmr(long $$0, ajc $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bmr(long $$0, Optional<ajc> $$1) {
      this(a($$0, $$1));
   }

   private static dsr a(long $$0, Optional<ajc> $$1) {
      dsf.a $$2 = dsf.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dsr($$2.a());
   }

   public static dsf.a a(ajc $$0) {
      return dsf.a($$0.toString());
   }

   public awt a() {
      return this.b;
   }
}
