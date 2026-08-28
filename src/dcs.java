import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcs(dbm d, cpl e) {
   public static final String a = "enabled_features";
   public static final Codec<dcs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbm.b.lenientOptionalFieldOf("DataPacks", dbm.a).forGetter(dcs::a), cpn.f.lenientOptionalFieldOf("enabled_features", cpn.h).forGetter(dcs::b)
            )
            .apply($$0, dcs::new)
   );
   public static final dcs c = new dcs(dbm.a, cpn.h);

   public dcs a(cpl $$0) {
      return new dcs(this.d, this.e.c($$0));
   }

   public dbm a() {
      return this.d;
   }

   public cpl b() {
      return this.e;
   }
}
