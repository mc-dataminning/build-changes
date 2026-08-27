import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehk extends ehm {
   public static final Codec<ehk> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, ehk::new));

   protected ehk(Either<akf, ekg> $$0, iv<eke> $$1, ehp.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ekc a(dji $$0, efy $$1, boolean $$2) {
      ekc $$3 = super.a($$0, $$1, $$2);
      $$3.b(eji.b);
      $$3.a(eji.d);
      return $$3;
   }

   @Override
   public eho<?> a() {
      return eho.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
