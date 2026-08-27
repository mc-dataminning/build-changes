import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwm extends dwo {
   public static final Codec<dwm> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, dwm::new));

   protected dwm(Either<aew, dzb> $$0, he<dyz> $$1, dwr.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected dyx a(czh $$0, dva $$1, boolean $$2) {
      dyx $$3 = super.a($$0, $$1, $$2);
      $$3.b(dyd.b);
      $$3.a(dyd.d);
      return $$3;
   }

   @Override
   public dwq<?> a() {
      return dwq.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
