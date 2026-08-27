import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwh extends dwj {
   public static final Codec<dwh> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwh::new));

   protected dwh(Either<aeu, dyw> $$0, hg<dyu> $$1, dwm.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dys a(czc $$0, duv $$1, boolean $$2) {
      dys $$3 = super.a($$0, $$1, $$2);
      $$3.b(dxy.b);
      $$3.a(dxy.d);
      return $$3;
   }

   @Override
   public dwl<?> a() {
      return dwl.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
