import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqq(cpl d, cee e) {
   public static final String a = "enabled_features";
   public static final Codec<cqq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cpl.b.optionalFieldOf("DataPacks", cpl.a).forGetter(cqq::a), ceg.e.optionalFieldOf("enabled_features", ceg.g).forGetter(cqq::b))
            .apply($$0, cqq::new)
   );
   public static final cqq c = new cqq(cpl.a, ceg.g);

   public cqq a(cee $$0) {
      return new cqq(this.d, this.e.b($$0));
   }

   public cpl a() {
      return this.d;
   }

   public cee b() {
      return this.e;
   }
}
