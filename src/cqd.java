import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqd(coy d, cdt e) {
   public static final String a = "enabled_features";
   public static final Codec<cqd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(coy.b.optionalFieldOf("DataPacks", coy.a).forGetter(cqd::a), cdv.e.optionalFieldOf("enabled_features", cdv.g).forGetter(cqd::b))
            .apply($$0, cqd::new)
   );
   public static final cqd c = new cqd(coy.a, cdv.g);

   public cqd a(cdt $$0) {
      return new cqd(this.d, this.e.b($$0));
   }

   public coy a() {
      return this.d;
   }

   public cdt b() {
      return this.e;
   }
}
