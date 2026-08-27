import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cuc(csw d, chl e) {
   public static final String a = "enabled_features";
   public static final Codec<cuc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(csw.b.optionalFieldOf("DataPacks", csw.a).forGetter(cuc::a), chn.f.optionalFieldOf("enabled_features", chn.h).forGetter(cuc::b))
            .apply($$0, cuc::new)
   );
   public static final cuc c = new cuc(csw.a, chn.h);

   public cuc a(chl $$0) {
      return new cuc(this.d, this.e.b($$0));
   }

   public csw a() {
      return this.d;
   }

   public chl b() {
      return this.e;
   }
}
