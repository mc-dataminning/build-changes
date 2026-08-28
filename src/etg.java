import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class etg extends eti {
   public static final MapCodec<etg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), f(), c()).apply($$0, etg::new));

   protected etg(Either<ali, ewd> $$0, jf<ewb> $$1, etl.a $$2, Optional<evn> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected evz a(dtw $$0, ert $$1, evn $$2, boolean $$3) {
      evz $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eve.b);
      $$4.a(eve.d);
      return $$4;
   }

   @Override
   public etk<?> a() {
      return etk.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
