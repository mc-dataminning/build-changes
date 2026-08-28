import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhf(dfv d, crt e) {
   public static final String a = "enabled_features";
   public static final Codec<dhf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfv.b.lenientOptionalFieldOf("DataPacks", dfv.a).forGetter(dhf::a), crv.f.lenientOptionalFieldOf("enabled_features", crv.h).forGetter(dhf::b)
            )
            .apply($$0, dhf::new)
   );
   public static final dhf c = new dhf(dfv.a, crv.h);

   public dhf a(crt $$0) {
      return new dhf(this.d, this.e.c($$0));
   }

   public dfv a() {
      return this.d;
   }

   public crt b() {
      return this.e;
   }
}
