import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csy(crt d, cgi e) {
   public static final String a = "enabled_features";
   public static final Codec<csy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(crt.b.optionalFieldOf("DataPacks", crt.a).forGetter(csy::a), cgk.f.optionalFieldOf("enabled_features", cgk.h).forGetter(csy::b))
            .apply($$0, csy::new)
   );
   public static final csy c = new csy(crt.a, cgk.h);

   public csy a(cgi $$0) {
      return new csy(this.d, this.e.b($$0));
   }

   public crt a() {
      return this.d;
   }

   public cgi b() {
      return this.e;
   }
}
