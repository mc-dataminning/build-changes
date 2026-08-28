import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcr(dbl d, cpk e) {
   public static final String a = "enabled_features";
   public static final Codec<dcr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbl.b.lenientOptionalFieldOf("DataPacks", dbl.a).forGetter(dcr::a), cpm.f.lenientOptionalFieldOf("enabled_features", cpm.h).forGetter(dcr::b)
            )
            .apply($$0, dcr::new)
   );
   public static final dcr c = new dcr(dbl.a, cpm.h);

   public dcr a(cpk $$0) {
      return new dcr(this.d, this.e.c($$0));
   }

   public dbl a() {
      return this.d;
   }

   public cpk b() {
      return this.e;
   }
}
