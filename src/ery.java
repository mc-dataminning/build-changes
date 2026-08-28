import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ery extends esa {
   public static final MapCodec<ery> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, ery::new));

   protected ery(Either<alg, euv> $$0, je<eut> $$1, esd.a $$2, Optional<euf> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected eur a(dst $$0, eql $$1, euf $$2, boolean $$3) {
      eur $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(etw.b);
      $$4.a(etw.d);
      return $$4;
   }

   @Override
   public esc<?> a() {
      return esc.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
