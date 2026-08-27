import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eaj extends eal {
   public static final Codec<eaj> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eaj::new));

   protected eaj(Either<ahg, edf> $$0, ih<edd> $$1, eao.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected edb a(ddb $$0, dyx $$1, boolean $$2) {
      edb $$3 = super.a($$0, $$1, $$2);
      $$3.b(ech.b);
      $$3.a(ech.d);
      return $$3;
   }

   @Override
   public ean<?> a() {
      return ean.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
