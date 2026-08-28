import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfr(dei d, cra e) {
   public static final String a = "enabled_features";
   public static final Codec<dfr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dei.b.lenientOptionalFieldOf("DataPacks", dei.a).forGetter(dfr::a), crc.g.lenientOptionalFieldOf("enabled_features", crc.i).forGetter(dfr::b)
            )
            .apply($$0, dfr::new)
   );
   public static final dfr c = new dfr(dei.a, crc.i);

   public dfr a(cra $$0) {
      return new dfr(this.d, this.e.c($$0));
   }

   public dei a() {
      return this.d;
   }

   public cra b() {
      return this.e;
   }
}
