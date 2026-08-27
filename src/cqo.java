import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqo(cpj d, cec e) {
   public static final String a = "enabled_features";
   public static final Codec<cqo> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpj.b.optionalFieldOf("DataPacks", cpj.a).forGetter(cqo::a), cee.e.optionalFieldOf("enabled_features", cee.g).forGetter(cqo::b))
            .apply($$0, cqo::new)
   );
   public static final cqo c = new cqo(cpj.a, cee.g);

   public cqo a(cec $$0) {
      return new cqo(this.d, this.e.b($$0));
   }

   public cpj a() {
      return this.d;
   }

   public cec b() {
      return this.e;
   }
}
