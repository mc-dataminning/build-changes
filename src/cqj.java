import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqj(cpe d, cdx e) {
   public static final String a = "enabled_features";
   public static final Codec<cqj> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpe.b.optionalFieldOf("DataPacks", cpe.a).forGetter(cqj::a), cdz.e.optionalFieldOf("enabled_features", cdz.g).forGetter(cqj::b))
            .apply($$0, cqj::new)
   );
   public static final cqj c = new cqj(cpe.a, cdz.g);

   public cqj a(cdx $$0) {
      return new cqj(this.d, this.e.b($$0));
   }

   public cpe a() {
      return this.d;
   }

   public cdx b() {
      return this.e;
   }
}
