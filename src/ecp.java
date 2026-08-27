import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecp extends ecr {
   public static final Codec<ecp> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, ecp::new));

   protected ecp(Either<aiy, efl> $$0, ij<efj> $$1, ecu.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected efh a(dfe $$0, ebd $$1, boolean $$2) {
      efh $$3 = super.a($$0, $$1, $$2);
      $$3.b(een.b);
      $$3.a(een.d);
      return $$3;
   }

   @Override
   public ect<?> a() {
      return ect.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
