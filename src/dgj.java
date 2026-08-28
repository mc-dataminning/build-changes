import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgj(dez d, crq e) {
   public static final String a = "enabled_features";
   public static final Codec<dgj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dez.b.lenientOptionalFieldOf("DataPacks", dez.a).forGetter(dgj::a), crs.f.lenientOptionalFieldOf("enabled_features", crs.h).forGetter(dgj::b)
            )
            .apply($$0, dgj::new)
   );
   public static final dgj c = new dgj(dez.a, crs.h);

   public dgj a(crq $$0) {
      return new dgj(this.d, this.e.c($$0));
   }

   public dez a() {
      return this.d;
   }

   public crq b() {
      return this.e;
   }
}
