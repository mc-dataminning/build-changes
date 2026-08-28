import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyb(dbt b) implements eyd {
   public static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbt.b.fieldOf("amount").forGetter(eyb::c)).apply($$0, eyb::new));

   @Override
   public float b(etw $$0) {
      int $$1 = $$0.b(ews.k);
      return this.b.a($$1);
   }

   @Override
   public eyc b() {
      return eye.g;
   }

   public static eyb a(dbt $$0) {
      return new eyb($$0);
   }

   public dbt c() {
      return this.b;
   }
}
