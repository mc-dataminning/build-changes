import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record din(dhd d, cte e) {
   public static final String a = "enabled_features";
   public static final Codec<din> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhd.b.lenientOptionalFieldOf("DataPacks", dhd.a).forGetter(din::a), ctg.f.lenientOptionalFieldOf("enabled_features", ctg.h).forGetter(din::b)
            )
            .apply($$0, din::new)
   );
   public static final din c = new din(dhd.a, ctg.h);

   public din a(cte $$0) {
      return new din(this.d, this.e.c($$0));
   }

   public dhd a() {
      return this.d;
   }

   public cte b() {
      return this.e;
   }
}
