import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cwy(cvs d, ckl e) {
   public static final String a = "enabled_features";
   public static final Codec<cwy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvs.b.optionalFieldOf("DataPacks", cvs.a).forGetter(cwy::a), ckn.f.optionalFieldOf("enabled_features", ckn.h).forGetter(cwy::b))
            .apply($$0, cwy::new)
   );
   public static final cwy c = new cwy(cvs.a, ckn.h);

   public cwy a(ckl $$0) {
      return new cwy(this.d, this.e.b($$0));
   }

   public cvs a() {
      return this.d;
   }

   public ckl b() {
      return this.e;
   }
}
