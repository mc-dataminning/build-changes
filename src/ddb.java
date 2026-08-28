import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddb(dbu d, coz e) {
   public static final String a = "enabled_features";
   public static final Codec<ddb> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbu.b.lenientOptionalFieldOf("DataPacks", dbu.a).forGetter(ddb::a), cpb.e.lenientOptionalFieldOf("enabled_features", cpb.g).forGetter(ddb::b)
            )
            .apply($$0, ddb::new)
   );
   public static final ddb c = new ddb(dbu.a, cpb.g);

   public ddb a(coz $$0) {
      return new ddb(this.d, this.e.c($$0));
   }

   public dbu a() {
      return this.d;
   }

   public coz b() {
      return this.e;
   }
}
