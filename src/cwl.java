import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwl(cvf d, cjw e) {
   public static final String a = "enabled_features";
   public static final Codec<cwl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvf.b.optionalFieldOf("DataPacks", cvf.a).forGetter(cwl::a), cjy.f.optionalFieldOf("enabled_features", cjy.h).forGetter(cwl::b))
            .apply($$0, cwl::new)
   );
   public static final cwl c = new cwl(cvf.a, cjy.h);

   public cwl a(cjw $$0) {
      return new cwl(this.d, this.e.b($$0));
   }

   public cvf a() {
      return this.d;
   }

   public cjw b() {
      return this.e;
   }
}
