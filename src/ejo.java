import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejo extends ejq {
   public static final MapCodec<ejo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejo::new));

   protected ejo(Either<alf, emk> $$0, ji<emi> $$1, ejt.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emg a(dlm $$0, eic $$1, boolean $$2) {
      emg $$3 = super.a($$0, $$1, $$2);
      $$3.b(elm.b);
      $$3.a(elm.d);
      return $$3;
   }

   @Override
   public ejs<?> a() {
      return ejs.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
