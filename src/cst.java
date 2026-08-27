import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cst(cro d, cgd e) {
   public static final String a = "enabled_features";
   public static final Codec<cst> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cro.b.optionalFieldOf("DataPacks", cro.a).forGetter(cst::a), cgf.f.optionalFieldOf("enabled_features", cgf.h).forGetter(cst::b))
            .apply($$0, cst::new)
   );
   public static final cst c = new cst(cro.a, cgf.h);

   public cst a(cgd $$0) {
      return new cst(this.d, this.e.b($$0));
   }

   public cro a() {
      return this.d;
   }

   public cgd b() {
      return this.e;
   }
}
