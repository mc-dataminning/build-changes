import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record crs(cqn d, cfg e) {
   public static final String a = "enabled_features";
   public static final Codec<crs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cqn.b.optionalFieldOf("DataPacks", cqn.a).forGetter(crs::a), cfi.e.optionalFieldOf("enabled_features", cfi.g).forGetter(crs::b))
            .apply($$0, crs::new)
   );
   public static final crs c = new crs(cqn.a, cfi.g);

   public crs a(cfg $$0) {
      return new crs(this.d, this.e.b($$0));
   }

   public cqn a() {
      return this.d;
   }

   public cfg b() {
      return this.e;
   }
}
