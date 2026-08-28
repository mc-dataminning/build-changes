import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eml extends emn {
   public static final MapCodec<eml> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(d(), b(), e(), c()).apply($$0, eml::new));

   protected eml(Either<ale, epi> $$0, jo<epg> $$1, emq.a $$2, Optional<eos> $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   protected epe a(doa $$0, eky $$1, eos $$2, boolean $$3) {
      epe $$4 = super.a($$0, $$1, $$2, $$3);
      $$4.b(eoj.b);
      $$4.a(eoj.d);
      return $$4;
   }

   @Override
   public emp<?> a() {
      return emp.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
