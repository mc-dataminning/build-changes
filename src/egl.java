import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egl extends egn {
   public static final Codec<egl> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, egl::new));

   protected egl(Either<ajt, ejh> $$0, il<ejf> $$1, egq.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ejd a(dik $$0, eez $$1, boolean $$2) {
      ejd $$3 = super.a($$0, $$1, $$2);
      $$3.b(eij.b);
      $$3.a(eij.d);
      return $$3;
   }

   @Override
   public egp<?> a() {
      return egp.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
