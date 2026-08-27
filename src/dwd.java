import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwd extends dwf {
   public static final Codec<dwd> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwd::new));

   protected dwd(Either<aer, dys> $$0, he<dyq> $$1, dwi.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dyo a(cyy $$0, dur $$1, boolean $$2) {
      dyo $$3 = super.a($$0, $$1, $$2);
      $$3.b(dxu.b);
      $$3.a(dxu.d);
      return $$3;
   }

   @Override
   public dwh<?> a() {
      return dwh.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
