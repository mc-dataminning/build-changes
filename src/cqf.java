import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqf(cpa d, cdv e) {
   public static final String a = "enabled_features";
   public static final Codec<cqf> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpa.b.optionalFieldOf("DataPacks", cpa.a).forGetter(cqf::a), cdx.e.optionalFieldOf("enabled_features", cdx.g).forGetter(cqf::b))
            .apply($$0, cqf::new)
   );
   public static final cqf c = new cqf(cpa.a, cdx.g);

   public cqf a(cdv $$0) {
      return new cqf(this.d, this.e.b($$0));
   }

   public cpa a() {
      return this.d;
   }

   public cdv b() {
      return this.e;
   }
}
