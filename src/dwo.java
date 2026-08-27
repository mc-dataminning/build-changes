import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwo extends dwq {
   public static final Codec<dwo> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwo::new));

   protected dwo(Either<aey, dzd> $$0, hg<dzb> $$1, dwt.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dyz a(czj $$0, dvc $$1, boolean $$2) {
      dyz $$3 = super.a($$0, $$1, $$2);
      $$3.b(dyf.b);
      $$3.a(dyf.d);
      return $$3;
   }

   @Override
   public dws<?> a() {
      return dws.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
