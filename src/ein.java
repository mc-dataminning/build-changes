import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ein extends eip {
   public static final MapCodec<ein> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ein::new));

   protected ein(Either<akm, elj> $$0, ix<elh> $$1, eis.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected elf a(dkl $$0, ehb $$1, boolean $$2) {
      elf $$3 = super.a($$0, $$1, $$2);
      $$3.b(ekl.b);
      $$3.a(ekl.d);
      return $$3;
   }

   @Override
   public eir<?> a() {
      return eir.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
