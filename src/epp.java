import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class epp extends epr {
   public static final MapCodec<epp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, epp::new));

   protected epp(Either<alz, esm> $$0, jq<esk> $$1, epu.a $$2, Optional<erw> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected esi a(drc $$0, eoc $$1, erw $$2, boolean $$3) {
      esi $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(ern.b);
      $$4.a(ern.d);
      return $$4;
   }

   @Override
   public ept<?> a() {
      return ept.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
