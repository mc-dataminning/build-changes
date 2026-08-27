import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eak extends eam {
   public static final Codec<eak> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eak::new));

   protected eak(Either<ahg, edg> $$0, ih<ede> $$1, eap.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected edc a(ddc $$0, dyy $$1, boolean $$2) {
      edc $$3 = super.a($$0, $$1, $$2);
      $$3.b(eci.b);
      $$3.a(eci.d);
      return $$3;
   }

   @Override
   public eao<?> a() {
      return eao.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
