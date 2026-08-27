import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwh(cvb d, cjs e) {
   public static final String a = "enabled_features";
   public static final Codec<cwh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvb.b.optionalFieldOf("DataPacks", cvb.a).forGetter(cwh::a), cju.f.optionalFieldOf("enabled_features", cju.h).forGetter(cwh::b))
            .apply($$0, cwh::new)
   );
   public static final cwh c = new cwh(cvb.a, cju.h);

   public cwh a(cjs $$0) {
      return new cwh(this.d, this.e.b($$0));
   }

   public cvb a() {
      return this.d;
   }

   public cjs b() {
      return this.e;
   }
}
