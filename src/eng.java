import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eng extends eni {
   public static final MapCodec<eng> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eng::new));

   protected eng(Either<all, eqd> $$0, jq<eqb> $$1, enl.a $$2, Optional<epn> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected epz a(dow $$0, elt $$1, epn $$2, boolean $$3) {
      epz $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(epe.b);
      $$4.a(epe.d);
      return $$4;
   }

   @Override
   public enk<?> a() {
      return enk.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
