import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eip extends eir {
   public static final MapCodec<eip> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, eip::new));

   protected eip(Either<akn, ell> $$0, ix<elj> $$1, eiu.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected elh a(dkn $$0, ehd $$1, boolean $$2) {
      elh $$3 = super.a($$0, $$1, $$2);
      $$3.b(ekn.b);
      $$3.a(ekn.d);
      return $$3;
   }

   @Override
   public eit<?> a() {
      return eit.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
