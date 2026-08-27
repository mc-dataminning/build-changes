import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record csl(crg d, cfv e) {
   public static final String a = "enabled_features";
   public static final Codec<csl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(crg.b.optionalFieldOf("DataPacks", crg.a).forGetter(csl::a), cfx.f.optionalFieldOf("enabled_features", cfx.h).forGetter(csl::b))
            .apply($$0, csl::new)
   );
   public static final csl c = new csl(crg.a, cfx.h);

   public csl a(cfv $$0) {
      return new csl(this.d, this.e.b($$0));
   }

   public crg a() {
      return this.d;
   }

   public cfv b() {
      return this.e;
   }
}
