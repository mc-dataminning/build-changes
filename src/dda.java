import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dda(dbt d, coy e) {
   public static final String a = "enabled_features";
   public static final Codec<dda> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbt.b.lenientOptionalFieldOf("DataPacks", dbt.a).forGetter(dda::a), cpa.e.lenientOptionalFieldOf("enabled_features", cpa.g).forGetter(dda::b)
            )
            .apply($$0, dda::new)
   );
   public static final dda c = new dda(dbt.a, cpa.g);

   public dda a(coy $$0) {
      return new dda(this.d, this.e.c($$0));
   }

   public dbt a() {
      return this.d;
   }

   public coy b() {
      return this.e;
   }
}
