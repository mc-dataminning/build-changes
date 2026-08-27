import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxe extends dxg {
   public static final Codec<dxe> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dxe::new));

   protected dxe(Either<afw, dzt> $$0, ib<dzr> $$1, dxj.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dzp a(dal $$0, dvs $$1, boolean $$2) {
      dzp $$3 = super.a($$0, $$1, $$2);
      $$3.b(dyv.b);
      $$3.a(dyv.d);
      return $$3;
   }

   @Override
   public dxi<?> a() {
      return dxi.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
