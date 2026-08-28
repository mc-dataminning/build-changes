import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejp extends ejr {
   public static final MapCodec<ejp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, ejp::new));

   protected ejp(Either<alf, eml> $$0, ji<emj> $$1, eju.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emh a(dln $$0, eid $$1, boolean $$2) {
      emh $$3 = super.a($$0, $$1, $$2);
      $$3.b(eln.b);
      $$3.a(eln.d);
      return $$3;
   }

   @Override
   public ejt<?> a() {
      return ejt.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
