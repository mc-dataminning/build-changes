import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyh(dbz b) implements eyj {
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbz.b.fieldOf("amount").forGetter(eyh::c)).apply($$0, eyh::new));

   @Override
   public float b(euc $$0) {
      int $$1 = $$0.b(ewy.k);
      return this.b.a($$1);
   }

   @Override
   public eyi b() {
      return eyk.g;
   }

   public static eyh a(dbz $$0) {
      return new eyh($$0);
   }

   public dbz c() {
      return this.b;
   }
}
