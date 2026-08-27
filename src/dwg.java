import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwg extends dwi {
   public static final Codec<dwg> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwg::new));

   protected dwg(Either<aez, dyv> $$0, he<dyt> $$1, dwl.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dyr a(czn $$0, duu $$1, boolean $$2) {
      dyr $$3 = super.a($$0, $$1, $$2);
      $$3.b(dxx.b);
      $$3.a(dxx.d);
      return $$3;
   }

   @Override
   public dwk<?> a() {
      return dwk.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
