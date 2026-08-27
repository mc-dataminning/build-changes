import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class biv {
   public static final Codec<biv> a = RecordCodecBuilder.create($$0 -> $$0.group(dng.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, biv::new));
   private final dng b;

   public biv(dng $$0) {
      this.b = $$0;
   }

   public biv(long $$0, agg $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public biv(long $$0, Optional<agg> $$1) {
      this(a($$0, $$1));
   }

   private static dng a(long $$0, Optional<agg> $$1) {
      dmu.a $$2 = dmu.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dng($$2.a());
   }

   public static dmu.a a(agg $$0) {
      return dmu.a($$0.toString());
   }

   public ato a() {
      return this.b;
   }
}
