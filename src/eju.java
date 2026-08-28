import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eju extends ejw {
   public static final MapCodec<eju> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c(), b(), d()).apply($$0, eju::new));

   protected eju(Either<akk, emq> $$0, jj<emo> $$1, ejz.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected emm a(dls $$0, eii $$1, boolean $$2) {
      emm $$3 = super.a($$0, $$1, $$2);
      $$3.b(els.b);
      $$3.a(els.d);
      return $$3;
   }

   @Override
   public ejy<?> a() {
      return ejy.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
