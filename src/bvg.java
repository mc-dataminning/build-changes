import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bvg {
   public static final Codec<bvg> a = RecordCodecBuilder.create($$0 -> $$0.group(eiq.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bvg::new));
   private final eiq b;

   public bvg(eiq $$0) {
      this.b = $$0;
   }

   public bvg(long $$0, alr $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bvg(long $$0, Optional<alr> $$1) {
      this(a($$0, $$1));
   }

   private static eiq a(long $$0, Optional<alr> $$1) {
      eie.a $$2 = eie.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new eiq($$2.a());
   }

   public static eie.a a(alr $$0) {
      return eie.a($$0.toString());
   }

   public bai a() {
      return this.b;
   }
}
