import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgc(des d, crj e) {
   public static final String a = "enabled_features";
   public static final Codec<dgc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               des.b.lenientOptionalFieldOf("DataPacks", des.a).forGetter(dgc::a), crl.g.lenientOptionalFieldOf("enabled_features", crl.i).forGetter(dgc::b)
            )
            .apply($$0, dgc::new)
   );
   public static final dgc c = new dgc(des.a, crl.i);

   public dgc a(crj $$0) {
      return new dgc(this.d, this.e.c($$0));
   }

   public des a() {
      return this.d;
   }

   public crj b() {
      return this.e;
   }
}
