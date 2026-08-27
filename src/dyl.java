import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyl extends dyn {
   public static final Codec<dyl> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dyl::new));

   protected dyl(Either<agi, ebh> $$0, ib<ebf> $$1, dyq.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ebd a(dbm $$0, dwz $$1, boolean $$2) {
      ebd $$3 = super.a($$0, $$1, $$2);
      $$3.b(eaj.b);
      $$3.a(eaj.d);
      return $$3;
   }

   @Override
   public dyp<?> a() {
      return dyp.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
