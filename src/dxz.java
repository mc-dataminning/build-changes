import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxz extends dyb {
   public static final Codec<dxz> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dxz::new));

   protected dxz(Either<agg, eav> $$0, ib<eat> $$1, dye.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ear a(dbf $$0, dwn $$1, boolean $$2) {
      ear $$3 = super.a($$0, $$1, $$2);
      $$3.b(dzx.b);
      $$3.a(dzx.d);
      return $$3;
   }

   @Override
   public dyd<?> a() {
      return dyd.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
