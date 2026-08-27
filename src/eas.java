import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eas extends eau {
   public static final Codec<eas> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eas::new));

   protected eas(Either<ahh, edo> $$0, ih<edm> $$1, eax.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected edk a(ddk $$0, dzg $$1, boolean $$2) {
      edk $$3 = super.a($$0, $$1, $$2);
      $$3.b(ecq.b);
      $$3.a(ecq.d);
      return $$3;
   }

   @Override
   public eaw<?> a() {
      return eaw.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
