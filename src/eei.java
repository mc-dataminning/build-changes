import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eei extends eek {
   public static final Codec<eei> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eei::new));

   protected eei(Either<ajh, ehe> $$0, il<ehc> $$1, een.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eha a(dgo $$0, ecw $$1, boolean $$2) {
      eha $$3 = super.a($$0, $$1, $$2);
      $$3.b(egg.b);
      $$3.a(egg.d);
      return $$3;
   }

   @Override
   public eem<?> a() {
      return eem.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
