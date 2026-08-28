import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcy(dbr d, cov e) {
   public static final String a = "enabled_features";
   public static final Codec<dcy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbr.b.lenientOptionalFieldOf("DataPacks", dbr.a).forGetter(dcy::a), cox.e.lenientOptionalFieldOf("enabled_features", cox.g).forGetter(dcy::b)
            )
            .apply($$0, dcy::new)
   );
   public static final dcy c = new dcy(dbr.a, cox.g);

   public dcy a(cov $$0) {
      return new dcy(this.d, this.e.c($$0));
   }

   public dbr a() {
      return this.d;
   }

   public cov b() {
      return this.e;
   }
}
