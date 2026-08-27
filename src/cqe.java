import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cqe(coz d, cdu e) {
   public static final String a = "enabled_features";
   public static final Codec<cqe> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(coz.b.optionalFieldOf("DataPacks", coz.a).forGetter(cqe::a), cdw.e.optionalFieldOf("enabled_features", cdw.g).forGetter(cqe::b))
            .apply($$0, cqe::new)
   );
   public static final cqe c = new cqe(coz.a, cdw.g);

   public cqe a(cdu $$0) {
      return new cqe(this.d, this.e.b($$0));
   }

   public coz a() {
      return this.d;
   }

   public cdu b() {
      return this.e;
   }
}
