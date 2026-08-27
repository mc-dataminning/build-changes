import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzs extends dzu {
   public static final Codec<dzs> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dzs::new));

   protected dzs(Either<agt, eco> $$0, ie<ecm> $$1, dzx.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eck a(dcl $$0, dyg $$1, boolean $$2) {
      eck $$3 = super.a($$0, $$1, $$2);
      $$3.b(ebq.b);
      $$3.a(ebq.d);
      return $$3;
   }

   @Override
   public dzw<?> a() {
      return dzw.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
