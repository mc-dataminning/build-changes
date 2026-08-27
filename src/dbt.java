import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbt(dan d, col e) {
   public static final String a = "enabled_features";
   public static final Codec<dbt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dan.b.lenientOptionalFieldOf("DataPacks", dan.a).forGetter(dbt::a), coo.f.lenientOptionalFieldOf("enabled_features", coo.h).forGetter(dbt::b)
            )
            .apply($$0, dbt::new)
   );
   public static final dbt c = new dbt(dan.a, coo.h);

   public dbt a(col $$0) {
      return new dbt(this.d, this.e.b($$0));
   }

   public dan a() {
      return this.d;
   }

   public col b() {
      return this.e;
   }
}
