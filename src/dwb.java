import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwb extends dwd {
   public static final Codec<dwb> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwb::new));

   protected dwb(Either<aep, dyq> $$0, hf<dyo> $$1, dwg.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dym a(cyw $$0, dup $$1, boolean $$2) {
      dym $$3 = super.a($$0, $$1, $$2);
      $$3.b(dxs.b);
      $$3.a(dxs.d);
      return $$3;
   }

   @Override
   public dwf<?> a() {
      return dwf.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
