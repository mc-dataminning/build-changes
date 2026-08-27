import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyq extends dys {
   public static final Codec<dyq> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dyq::new));

   protected dyq(Either<agm, ebm> $$0, ig<ebk> $$1, dyv.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebi a(dbr $$0, dxe $$1, boolean $$2) {
      ebi $$3 = super.a($$0, $$1, $$2);
      $$3.b(eao.b);
      $$3.a(eao.d);
      return $$3;
   }

   @Override
   public dyu<?> a() {
      return dyu.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
